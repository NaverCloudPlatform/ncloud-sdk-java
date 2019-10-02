package com.ncloud;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ncloud.server.*;
import com.ncloud.server.exception.*;
import com.ncloud.server.marshaller.*;
import com.ncloud.server.model.*;

public class SdkTest {
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		ApiClient apiClient = new ApiClient.ApiClientBuilder()
			.addMarshaller(JsonMarshaller.getInstance())
			.addMarshaller(XmlMarshaller.getInstance())
			.addMarshaller(FormMarshaller.getInstance())
			.setCredentials(new NcloudCredentialsProvider().getCredentials())
			.setLogging(true)
			.build();

		com.ncloud.server.api.V2Api apiInstance = new com.ncloud.server.api.V2Api(apiClient);
		AddNasVolumeAccessControlRequest addNasVolumeAccessControlRequest = new AddNasVolumeAccessControlRequest(); // AddNasVolumeAccessControlRequest | addNasVolumeAccessControlRequest
		try {
			// Handler Successful response
			ApiResponse<AddNasVolumeAccessControlResponse> result = apiInstance.addNasVolumeAccessControlGet(addNasVolumeAccessControlRequest);
		} catch (ApiException e) {
			// Handler Failed response
			int statusCode = e.getHttpStatusCode();
			Map<String, List<String>> responseHeaders = e.getHttpHeaders();
			InputStream byteStream = e.getByteStream();
			e.printStackTrace();
		} catch (SdkException e) {
			// Handle exceptions that occurred before communication with the server
			e.printStackTrace();
		}
	}
}