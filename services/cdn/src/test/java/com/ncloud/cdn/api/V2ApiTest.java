/*
 * cdn
 * <br/>https://ncloud.apigw.ntruss.com/cdn/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.cdn.api;

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
import com.ncloud.cdn.model.GetCdnPlusInstanceListRequest;
import com.ncloud.cdn.model.GetCdnPlusInstanceListResponse;
import com.ncloud.cdn.model.GetCdnPlusPurgeHistoryListRequest;
import com.ncloud.cdn.model.GetCdnPlusPurgeHistoryListResponse;
import com.ncloud.cdn.model.GetGlobalCdnInstanceListRequest;
import com.ncloud.cdn.model.GetGlobalCdnInstanceListResponse;
import com.ncloud.cdn.model.GetGlobalCdnPurgeHistoryListRequest;
import com.ncloud.cdn.model.GetGlobalCdnPurgeHistoryListResponse;
import com.ncloud.cdn.model.RequestCdnPlusPurgeRequest;
import com.ncloud.cdn.model.RequestCdnPlusPurgeResponse;
import com.ncloud.cdn.model.RequestGlobalCdnPurgeRequest;
import com.ncloud.cdn.model.RequestGlobalCdnPurgeResponse;

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
	 * CDN+인스턴스리스트조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getCdnPlusInstanceListGetTest() throws ApiException, SdkException {
		GetCdnPlusInstanceListRequest getCdnPlusInstanceListRequest = null;

		try {
			// Handler Successful response
			ApiResponse<GetCdnPlusInstanceListResponse> response = api.getCdnPlusInstanceListGet(getCdnPlusInstanceListRequest);
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
	 * CDN+인스턴스리스트조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getCdnPlusInstanceListGetGenericTest() throws ApiException, SdkException {
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
			ApiResponse<byte[]> response = api.getCdnPlusInstanceListGet(httpHeaders, queryParams, formParams, requestBody);
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
	 * CDN+인스턴스리스트조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getCdnPlusInstanceListPostTest() throws ApiException, SdkException {
		GetCdnPlusInstanceListRequest getCdnPlusInstanceListRequest = null;

		try {
			// Handler Successful response
			ApiResponse<GetCdnPlusInstanceListResponse> response = api.getCdnPlusInstanceListPost(getCdnPlusInstanceListRequest);
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
	 * CDN+인스턴스리스트조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getCdnPlusInstanceListPostGenericTest() throws ApiException, SdkException {
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
			ApiResponse<byte[]> response = api.getCdnPlusInstanceListPost(httpHeaders, queryParams, formParams, requestBody);
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
	 * CDN+퍼지기록조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getCdnPlusPurgeHistoryListGetTest() throws ApiException, SdkException {
		GetCdnPlusPurgeHistoryListRequest getCdnPlusPurgeHistoryListRequest = null;

		try {
			// Handler Successful response
			ApiResponse<GetCdnPlusPurgeHistoryListResponse> response = api.getCdnPlusPurgeHistoryListGet(getCdnPlusPurgeHistoryListRequest);
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
	 * CDN+퍼지기록조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getCdnPlusPurgeHistoryListGetGenericTest() throws ApiException, SdkException {
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
			ApiResponse<byte[]> response = api.getCdnPlusPurgeHistoryListGet(httpHeaders, queryParams, formParams, requestBody);
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
	 * CDN+퍼지기록조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getCdnPlusPurgeHistoryListPostTest() throws ApiException, SdkException {
		GetCdnPlusPurgeHistoryListRequest getCdnPlusPurgeHistoryListRequest = null;

		try {
			// Handler Successful response
			ApiResponse<GetCdnPlusPurgeHistoryListResponse> response = api.getCdnPlusPurgeHistoryListPost(getCdnPlusPurgeHistoryListRequest);
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
	 * CDN+퍼지기록조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getCdnPlusPurgeHistoryListPostGenericTest() throws ApiException, SdkException {
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
			ApiResponse<byte[]> response = api.getCdnPlusPurgeHistoryListPost(httpHeaders, queryParams, formParams, requestBody);
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
	 * Global CDN인스턴스리스트조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getGlobalCdnInstanceListGetTest() throws ApiException, SdkException {
		GetGlobalCdnInstanceListRequest getGlobalCdnInstanceListRequest = null;

		try {
			// Handler Successful response
			ApiResponse<GetGlobalCdnInstanceListResponse> response = api.getGlobalCdnInstanceListGet(getGlobalCdnInstanceListRequest);
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
	 * Global CDN인스턴스리스트조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getGlobalCdnInstanceListGetGenericTest() throws ApiException, SdkException {
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
			ApiResponse<byte[]> response = api.getGlobalCdnInstanceListGet(httpHeaders, queryParams, formParams, requestBody);
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
	 * Global CDN 인스턴스리스트조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getGlobalCdnInstanceListPostTest() throws ApiException, SdkException {
		GetGlobalCdnInstanceListRequest getGlobalCdnInstanceListRequest = null;

		try {
			// Handler Successful response
			ApiResponse<GetGlobalCdnInstanceListResponse> response = api.getGlobalCdnInstanceListPost(getGlobalCdnInstanceListRequest);
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
	 * Global CDN 인스턴스리스트조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getGlobalCdnInstanceListPostGenericTest() throws ApiException, SdkException {
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
			ApiResponse<byte[]> response = api.getGlobalCdnInstanceListPost(httpHeaders, queryParams, formParams, requestBody);
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
	 * Global CDN퍼지기록조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getGlobalCdnPurgeHistoryListGetTest() throws ApiException, SdkException {
		GetGlobalCdnPurgeHistoryListRequest getGlobalCdnPurgeHistoryListRequest = null;

		try {
			// Handler Successful response
			ApiResponse<GetGlobalCdnPurgeHistoryListResponse> response = api.getGlobalCdnPurgeHistoryListGet(getGlobalCdnPurgeHistoryListRequest);
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
	 * Global CDN퍼지기록조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getGlobalCdnPurgeHistoryListGetGenericTest() throws ApiException, SdkException {
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
			ApiResponse<byte[]> response = api.getGlobalCdnPurgeHistoryListGet(httpHeaders, queryParams, formParams, requestBody);
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
	 * Global CDN퍼지기록조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getGlobalCdnPurgeHistoryListPostTest() throws ApiException, SdkException {
		GetGlobalCdnPurgeHistoryListRequest getGlobalCdnPurgeHistoryListRequest = null;

		try {
			// Handler Successful response
			ApiResponse<GetGlobalCdnPurgeHistoryListResponse> response = api.getGlobalCdnPurgeHistoryListPost(getGlobalCdnPurgeHistoryListRequest);
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
	 * Global CDN퍼지기록조회
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void getGlobalCdnPurgeHistoryListPostGenericTest() throws ApiException, SdkException {
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
			ApiResponse<byte[]> response = api.getGlobalCdnPurgeHistoryListPost(httpHeaders, queryParams, formParams, requestBody);
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
	 * CDN+퍼지요청
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void requestCdnPlusPurgeGetTest() throws ApiException, SdkException {
		RequestCdnPlusPurgeRequest requestCdnPlusPurgeRequest = null;

		try {
			// Handler Successful response
			ApiResponse<RequestCdnPlusPurgeResponse> response = api.requestCdnPlusPurgeGet(requestCdnPlusPurgeRequest);
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
	 * CDN+퍼지요청
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void requestCdnPlusPurgeGetGenericTest() throws ApiException, SdkException {
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
			ApiResponse<byte[]> response = api.requestCdnPlusPurgeGet(httpHeaders, queryParams, formParams, requestBody);
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
	 * CDN+퍼지요청
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void requestCdnPlusPurgePostTest() throws ApiException, SdkException {
		RequestCdnPlusPurgeRequest requestCdnPlusPurgeRequest = null;

		try {
			// Handler Successful response
			ApiResponse<RequestCdnPlusPurgeResponse> response = api.requestCdnPlusPurgePost(requestCdnPlusPurgeRequest);
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
	 * CDN+퍼지요청
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void requestCdnPlusPurgePostGenericTest() throws ApiException, SdkException {
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
			ApiResponse<byte[]> response = api.requestCdnPlusPurgePost(httpHeaders, queryParams, formParams, requestBody);
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
	 * Global CDN퍼지요청
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void requestGlobalCdnPurgeGetTest() throws ApiException, SdkException {
		RequestGlobalCdnPurgeRequest requestGlobalCdnPurgeRequest = null;

		try {
			// Handler Successful response
			ApiResponse<RequestGlobalCdnPurgeResponse> response = api.requestGlobalCdnPurgeGet(requestGlobalCdnPurgeRequest);
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
	 * Global CDN퍼지요청
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void requestGlobalCdnPurgeGetGenericTest() throws ApiException, SdkException {
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
			ApiResponse<byte[]> response = api.requestGlobalCdnPurgeGet(httpHeaders, queryParams, formParams, requestBody);
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
	 * Global CDN퍼지요청
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void requestGlobalCdnPurgePostTest() throws ApiException, SdkException {
		RequestGlobalCdnPurgeRequest requestGlobalCdnPurgeRequest = null;

		try {
			// Handler Successful response
			ApiResponse<RequestGlobalCdnPurgeResponse> response = api.requestGlobalCdnPurgePost(requestGlobalCdnPurgeRequest);
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
	 * Global CDN퍼지요청
	 * @throws ApiException if response fails
	 * @throws SdkException if fails to make API call
	 */
	@Test
	public void requestGlobalCdnPurgePostGenericTest() throws ApiException, SdkException {
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
			ApiResponse<byte[]> response = api.requestGlobalCdnPurgePost(httpHeaders, queryParams, formParams, requestBody);
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
