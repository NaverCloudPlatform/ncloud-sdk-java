package com.ncloud;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.ncloud.server.auth.Credentials;
import com.ncloud.server.auth.CredentialsProvider;
import com.ncloud.server.exception.SdkException;

public class NcloudCredentialsProvider implements CredentialsProvider {
	private final String path = System.getenv("HOME") + "/.ncloud/configure";

	public Credentials getCredentials() {
		Properties properties = new Properties();
		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream(this.path);
			properties.load(fileInputStream);
		} catch (IOException var11) {
			throw new SdkException("Failed to load credentials from the " + this.path + " file", var11);
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (IOException var10) {
			}
		}

		if (properties.containsKey("ncloud_access_key_id") && properties.containsKey("ncloud_access_key_id")) {
			return new NcloudCredentials(properties.getProperty("ncloud_access_key_id"), properties.getProperty("ncloud_secret_access_key"));
		} else {
			throw new SdkException("It doesn't contain the required properties 'ncloud_access_key_id' and 'ncloud_secret_access_key'.");
		}
	}

	public void refresh() {
	}
}
