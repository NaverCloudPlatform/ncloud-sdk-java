package com.ncloud.auth;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.ncloud.exception.SdkException;
import com.ncloud.metadata.MetadataApiClient;
import com.ncloud.metadata.SecurityCredentials;

public class ServerRoleCredentialsProvider implements CredentialsProvider {

	private static final int REFRESH_THRESHOLD = 1000 * 60 * 60;
	private static final int ASYNC_REFRESH_INTERVAL_TIME_MINUTES = 1;
	private static final int EXPIRATION_THRESHOLD = 1000 * 60 * 15;

	protected Date lastInstanceProfileCheck;
	protected Date credentialsExpiration;
	private Credentials credentials;

	// async refresh
	private ScheduledExecutorService executor;

	public ServerRoleCredentialsProvider() {
		this(false);
	}

	public ServerRoleCredentialsProvider(boolean refreshCredentialsAsync) {
		if (refreshCredentialsAsync) {
			executor = Executors.newScheduledThreadPool(1);
			executor.scheduleWithFixedDelay(new Runnable() {
				public void run() {
					try {
						getCredentials();
					} catch (SdkException e) {
						credentials = null;
					}
				}
			}, 0, ASYNC_REFRESH_INTERVAL_TIME_MINUTES, TimeUnit.MINUTES);
		}
	}

	public Credentials getCredentials() {
		if (needsToLoadCredentials()) {
			loadCredentials();
		}
		if (expired()) {
			throw new SdkException(
				"The credentials received from metadata api have expired");
		}
		return credentials;
	}

	private void loadCredentials() {
		if (!needsToLoadCredentials()) {
			return;
		}
		try {
			lastInstanceProfileCheck = new Date();
			SecurityCredentials securityCredentials = new MetadataApiClient()
				.getDefaultCredentials();

			if (null == securityCredentials) {
				throw new SdkException("Unable to load credentials.");
			}

			String expiration = securityCredentials.getExpiration();

			if (null != expiration && !"".equals(expiration)) {
				expiration = expiration.replaceAll("\\+0000$", "Z");
				try {
					credentialsExpiration = parseISO8601Date(expiration);
				} catch (Exception ex) {
					credentials = null;
					throw new SdkException("Unable to parse credentials expiration date from metadata api");
				}
			}
			credentials = new IamCredentials(null, securityCredentials.getAccessKey(),
				securityCredentials.getSecretKey(), this);
		} catch (IOException e) {
			credentials = null;
			throw new SdkException("Unable to load credentials from ncloud metadata api");
		}
	}

	public static Date parseISO8601Date(String dateString) throws ParseException {
		// "2020-12-31T08:53:47Z"
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
		return formatter.parse(dateString);
	}

	private boolean needsToLoadCredentials() {
		if (credentials == null) {
			return true;
		}
		if (credentialsExpiration != null) {
			if (isWithinExpirationThreshold())
				return true;
		}
		if (lastInstanceProfileCheck != null) {
			return isPastRefreshThreshold();
		}
		return false;
	}

	private boolean isWithinExpirationThreshold() {
		return (credentialsExpiration.getTime() - System.currentTimeMillis()) < EXPIRATION_THRESHOLD;
	}

	private boolean isPastRefreshThreshold() {
		return (System.currentTimeMillis() - lastInstanceProfileCheck.getTime()) > REFRESH_THRESHOLD;
	}

	private boolean expired() {
		if (credentialsExpiration != null) {
			return credentialsExpiration.getTime() < System.currentTimeMillis();
		}
		return false;
	}

	public void refresh() {

	}
}
