package com.ncloud;

import java.net.URI;
import java.util.Date;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

import com.ncloud.server.auth.Credentials;
import com.ncloud.server.exception.SdkException;
import okhttp3.Request;

public class NcloudCredentials implements Credentials {
	private final String accessKey;
	private final String secretKey;

	protected NcloudCredentials(String accessKey, String secretKey) {
		if (accessKey == null) {
			throw new SdkException("Aeccess Key cannot be null.");
		} else if (secretKey == null) {
			throw new SdkException("Secret Key cannot be null.");
		} else {
			this.accessKey = accessKey;
			this.secretKey = secretKey;
		}
	}

	public void applyCredentials(Request.Builder requestBuilder, boolean isRequiredApiKey) {
		long timestamp = (new Date()).getTime();
		requestBuilder.addHeader("x-ncp-apigw-timestamp", String.valueOf(timestamp));
		requestBuilder.addHeader("x-ncp-iam-access-key", this.accessKey);
		requestBuilder.addHeader("x-ncp-apigw-signature-v2", this.makeSignature(timestamp, requestBuilder.build()));
	}

	private String makeSignature(long timestamp, Request request) {
		URI uri = request.url().uri();
		String pathWithQuery = uri.getRawPath();
		if (uri.getRawQuery() != null) {
			pathWithQuery = pathWithQuery + "?" + uri.getRawQuery();
		}

		StringBuilder message = (new StringBuilder()).append(request.method()).append(" ").append(pathWithQuery).append("\n").append(timestamp).append("\n").append(this.accessKey);

		try {
			SecretKeySpec signingKey = new SecretKeySpec(this.secretKey.getBytes("UTF-8"), "HmacSHA256");
			Mac mac = Mac.getInstance("HmacSHA256");
			mac.init(signingKey);
			byte[] rawHmac = mac.doFinal(message.toString().getBytes("UTF-8"));
			String signature = Base64.encodeBase64String(rawHmac);
			return signature;
		} catch (Exception var11) {
			throw new SdkException("Failed to make signature for IAM credentials: " + var11.getMessage(), var11);
		}
	}
}
