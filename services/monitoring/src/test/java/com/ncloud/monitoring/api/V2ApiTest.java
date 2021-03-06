/*
 * monitoring
 * <br/>https://ncloud.apigw.ntruss.com/monitoring/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.monitoring.api;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.ncloud.ApiClient;
import com.ncloud.ApiResponse;
import com.ncloud.auth.PropertiesFileCredentialsProvider;
import com.ncloud.exception.ApiException;
import com.ncloud.exception.SdkException;
import com.ncloud.marshaller.FormMarshaller;
import com.ncloud.marshaller.JsonMarshaller;
import com.ncloud.marshaller.XmlMarshaller;
import com.ncloud.monitoring.model.GetListMetricsRequest;
import com.ncloud.monitoring.model.GetListMetricsResponse;
import com.ncloud.monitoring.model.GetMetricStatisticListRequest;
import com.ncloud.monitoring.model.GetMetricStatisticListResponse;

/**
 * API tests for V2Api
 */
@Ignore
public class V2ApiTest {
	private V2Api api;
	private ApiClient apiClient;

	@Before
	public void setUp() {
		apiClient = new ApiClient.ApiClientBuilder()
		.addMarshaller(JsonMarshaller.getInstance())
		.addMarshaller(XmlMarshaller.getInstance())
		.addMarshaller(FormMarshaller.getInstance())
		.setCredentials(new PropertiesFileCredentialsProvider("credentials.properties").getCredentials())
		.setLogging(true)
		.build();

		api = new V2Api(apiClient);
	}

	@After
	public void tearDown() {
	}

	
	/**
	 * 
	 * B.메트릭 리스트 조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getListMetricsGetTest() throws ApiException, SdkException {
		GetListMetricsRequest getListMetricsRequest = null;

		try {
			// Handler Successful response
			ApiResponse<GetListMetricsResponse> response = api.getListMetricsGet(getListMetricsRequest);
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

	/**
	 * 
	 * B.메트릭 리스트 조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getListMetricsGetGenericTest() throws ApiException, SdkException {
		// path

		// headers
		Map<String, Object> httpHeaders = new HashMap<String, Object>();

		// query params
		Map<String, Object> queryParams = new HashMap<String, Object>();

		// form params
		Map<String, Object> formParams = new HashMap<String, Object>();

		// body
		byte[] requestBody = null;

		try {
			// Handler Successful response
			ApiResponse<byte[]> response = api.getListMetricsGet(httpHeaders, queryParams, formParams, requestBody);
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
	
	/**
	 * 
	 * B.메트릭 리스트 조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getListMetricsPostTest() throws ApiException, SdkException {
		GetListMetricsRequest getListMetricsRequest = null;

		try {
			// Handler Successful response
			ApiResponse<GetListMetricsResponse> response = api.getListMetricsPost(getListMetricsRequest);
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

	/**
	 * 
	 * B.메트릭 리스트 조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getListMetricsPostGenericTest() throws ApiException, SdkException {
		// path

		// headers
		Map<String, Object> httpHeaders = new HashMap<String, Object>();

		// query params
		Map<String, Object> queryParams = new HashMap<String, Object>();

		// form params
		Map<String, Object> formParams = new HashMap<String, Object>();

		// body
		byte[] requestBody = null;

		try {
			// Handler Successful response
			ApiResponse<byte[]> response = api.getListMetricsPost(httpHeaders, queryParams, formParams, requestBody);
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
	
	/**
	 * 
	 * A.메트릭 통계 조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getMetricStatisticListGetTest() throws ApiException, SdkException {
		GetMetricStatisticListRequest getMetricStatisticListRequest = null;

		try {
			// Handler Successful response
			ApiResponse<GetMetricStatisticListResponse> response = api.getMetricStatisticListGet(getMetricStatisticListRequest);
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

	/**
	 * 
	 * A.메트릭 통계 조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getMetricStatisticListGetGenericTest() throws ApiException, SdkException {
		// path

		// headers
		Map<String, Object> httpHeaders = new HashMap<String, Object>();

		// query params
		Map<String, Object> queryParams = new HashMap<String, Object>();

		// form params
		Map<String, Object> formParams = new HashMap<String, Object>();

		// body
		byte[] requestBody = null;

		try {
			// Handler Successful response
			ApiResponse<byte[]> response = api.getMetricStatisticListGet(httpHeaders, queryParams, formParams, requestBody);
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
	
	/**
	 * 
	 * A.메트릭 통계 조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getMetricStatisticListPostTest() throws ApiException, SdkException {
		GetMetricStatisticListRequest getMetricStatisticListRequest = null;

		try {
			// Handler Successful response
			ApiResponse<GetMetricStatisticListResponse> response = api.getMetricStatisticListPost(getMetricStatisticListRequest);
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

	/**
	 * 
	 * A.메트릭 통계 조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getMetricStatisticListPostGenericTest() throws ApiException, SdkException {
		// path

		// headers
		Map<String, Object> httpHeaders = new HashMap<String, Object>();

		// query params
		Map<String, Object> queryParams = new HashMap<String, Object>();

		// form params
		Map<String, Object> formParams = new HashMap<String, Object>();

		// body
		byte[] requestBody = null;

		try {
			// Handler Successful response
			ApiResponse<byte[]> response = api.getMetricStatisticListPost(httpHeaders, queryParams, formParams, requestBody);
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
