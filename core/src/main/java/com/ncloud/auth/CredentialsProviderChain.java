package com.ncloud.auth;

import java.util.LinkedList;
import java.util.List;

import com.ncloud.exception.SdkException;

public class CredentialsProviderChain {
	private boolean reuseLastProvider = true;
	private CredentialsProvider lastUsedProvider;
	private List<CredentialsProvider> credentialsProviders = new LinkedList<CredentialsProvider>();

	public CredentialsProviderChain(CredentialsProvider... credentialsProviders) {
		if (credentialsProviders == null || credentialsProviders.length == 0) {
			throw new IllegalArgumentException("No credential providers specified");
		}
		for (CredentialsProvider provider : credentialsProviders) {
			this.credentialsProviders.add(provider);
		}
	}

	public Credentials getCredentials() {
		if (reuseLastProvider && lastUsedProvider != null) {
			return lastUsedProvider.getCredentials();
		}
		for (CredentialsProvider provider : credentialsProviders) {
			try {
				Credentials credentials = provider.getCredentials();

				if (credentials != null) {
					// log.debug("Loading credentials from " + provider.toString());
					lastUsedProvider = provider;
					return credentials;
				}
			} catch (Exception e) {
				// Ignore any exceptions and move onto the next provider
				// log.debug("Unable to load credentials from " + provider.toString() + ": " + e.getMessage());
			}
		}
		throw new SdkException("Unable to load credentials from any provider in the chain");
	}

	public CredentialsProvider getLastUsedProvider() {
		return lastUsedProvider;
	}
}
