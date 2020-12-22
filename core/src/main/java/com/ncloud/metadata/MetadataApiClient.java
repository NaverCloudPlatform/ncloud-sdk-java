package com.ncloud.metadata;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ncloud.exception.SdkException;

public class MetadataApiClient {
	private static final String METADATA_API_URL = "http://169.254.169.254";
	public static final String CREDENTIALS_RESOURCE = "/latest/meta-data/iam/security-credentials/";
	public static final String METADATA_API_ENDPOINT_SYSTEM_PROPERTY =
		"com.ncloud.metadataApiEndpoint";

	private final ObjectMapper objectMapper;

	public MetadataApiClient() {
		objectMapper = new ObjectMapper();
	}

	public SecurityCredentials getDefaultCredentials() throws IOException {
		String credentialsList = readResponse(getResource(CREDENTIALS_RESOURCE));

		credentialsList = credentialsList.trim();
		String[] credentials = credentialsList.split("\n");
		if (credentials.length == 0) {
			return null;
		}

		String credentialsName = credentials[0];

		InputStream inputStream = getResource(CREDENTIALS_RESOURCE + credentialsName);
		SecurityCredentials iamCredentials = objectMapper.readValue(inputStream, SecurityCredentials.class);
		return iamCredentials;
	}

	public InputStream getResource(String resourcePath) throws IOException, SdkException {
		URL url = getServerMetadataApiUrlForResource(resourcePath);
		// log.debug("Connecting to server metadata service at URL: " + url.toString());
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setConnectTimeout(1000 * 2);
		connection.setRequestMethod("GET");
		connection.setDoOutput(true);
		connection.connect();

		return getResponseStream(connection);
	}

	private InputStream getResponseStream(HttpURLConnection connection) throws IOException {
		if (connection.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
			throw new SdkException("metadata is not found at " + connection.getURL());
		}
		return connection.getInputStream();
	}

	private String readResponse(InputStream inputStream) throws IOException {
		try {
			StringBuilder buffer = new StringBuilder();
			while (true) {
				int c = inputStream.read();
				if (c == -1)
					break;
				buffer.append((char)c);
			}

			return buffer.toString();
		} finally {
			inputStream.close();
		}
	}

	private URL getServerMetadataApiUrlForResource(String resourcePath) throws IOException {
		String endpoint = METADATA_API_URL;
		if (System.getProperty(METADATA_API_ENDPOINT_SYSTEM_PROPERTY) != null) {
			endpoint = System.getProperty(METADATA_API_ENDPOINT_SYSTEM_PROPERTY);
		}
		return new URL(endpoint + resourcePath);
	}

}
