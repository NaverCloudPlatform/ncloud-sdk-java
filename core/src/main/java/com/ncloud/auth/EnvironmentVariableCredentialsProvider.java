package com.ncloud.auth;

import org.apache.commons.lang3.StringUtils;

import com.ncloud.exception.SdkException;

public class EnvironmentVariableCredentialsProvider implements CredentialsProvider {

	public static final String ACCESS_KEY_ENV_VAR = "NCLOUD_ACCESS_KEY_ID";
	public static final String ALTERNATE_ACCESS_KEY_ENV_VAR = "NCLOUD_ACCESS_KEY";
	public static final String SECRET_KEY_ENV_VAR = "NCLOUD_SECRET_KEY";
	public static final String ALTERNATE_SECRET_KEY_ENV_VAR = "NCLOUD_SECRET_ACCESS_KEY";

	public Credentials getCredentials() {
		String accessKey = System.getenv(ACCESS_KEY_ENV_VAR);
		if (accessKey == null) {
			accessKey = System.getenv(ALTERNATE_ACCESS_KEY_ENV_VAR);
		}

		String secretKey = System.getenv(SECRET_KEY_ENV_VAR);
		if (secretKey == null) {
			secretKey = System.getenv(ALTERNATE_SECRET_KEY_ENV_VAR);
		}

		accessKey = StringUtils.trim(accessKey);
		secretKey = StringUtils.trim(secretKey);

		if (StringUtils.isEmpty(accessKey)
			|| StringUtils.isEmpty(secretKey)) {

			throw new SdkException(
				"Unable to load ncloud credentials from environment variables " +
					"(" + ACCESS_KEY_ENV_VAR + " (or " + ALTERNATE_ACCESS_KEY_ENV_VAR + ") and " +
					SECRET_KEY_ENV_VAR + " (or " + ALTERNATE_SECRET_KEY_ENV_VAR + "))");
		}

		return new NcloudCredentials(accessKey, secretKey);
	}

	public void refresh() {
	}
}
