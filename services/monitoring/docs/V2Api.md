# V2Api

All URIs are relative to *https://ncloud.apigw.ntruss.com/monitoring/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getListMetricsGet**](V2Api.md#getListMetricsGet) | **GET** /getListMetrics | 
[**getListMetricsPost**](V2Api.md#getListMetricsPost) | **POST** /getListMetrics | 
[**getMetricStatisticListGet**](V2Api.md#getMetricStatisticListGet) | **GET** /getMetricStatisticList | 
[**getMetricStatisticListPost**](V2Api.md#getMetricStatisticListPost) | **POST** /getMetricStatisticList | 


<a name="getListMetricsGet"></a>
# **getListMetricsGet**
> GetListMetricsResponse getListMetricsGet(getListMetricsRequest)



B.메트릭 리스트 조회

### Example
```java
// Import classes:
// import com.ncloud.monitoring.ApiClient;
// import com.ncloud.monitoring.ApiResponse;
// import com.ncloud.monitoring.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.monitoring.marshaller.JsonMarshaller;
// import com.ncloud.monitoring.marshaller.XmlMarshaller;
// import com.ncloud.monitoring.marshaller.FormMarshaller;
// import com.ncloud.monitoring.exception.ApiException;
// import com.ncloud.monitoring.exception.SdkException;
// import com.ncloud.monitoring.model.*;

// import com.ncloud.monitoring.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetListMetricsRequest getListMetricsRequest = new GetListMetricsRequest(); // GetListMetricsRequest | getListMetricsRequest
try {
	// Handler Successful response
	ApiResponse<GetListMetricsResponse> result = apiInstance.getListMetricsGet(getListMetricsRequest);
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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getListMetricsRequest** | [**GetListMetricsRequest**](GetListMetricsRequest.md)| getListMetricsRequest |

### Return type

[**GetListMetricsResponse**](GetListMetricsResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getListMetricsPost"></a>
# **getListMetricsPost**
> GetListMetricsResponse getListMetricsPost(getListMetricsRequest)



B.메트릭 리스트 조회

### Example
```java
// Import classes:
// import com.ncloud.monitoring.ApiClient;
// import com.ncloud.monitoring.ApiResponse;
// import com.ncloud.monitoring.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.monitoring.marshaller.JsonMarshaller;
// import com.ncloud.monitoring.marshaller.XmlMarshaller;
// import com.ncloud.monitoring.marshaller.FormMarshaller;
// import com.ncloud.monitoring.exception.ApiException;
// import com.ncloud.monitoring.exception.SdkException;
// import com.ncloud.monitoring.model.*;

// import com.ncloud.monitoring.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetListMetricsRequest getListMetricsRequest = new GetListMetricsRequest(); // GetListMetricsRequest | getListMetricsRequest
try {
	// Handler Successful response
	ApiResponse<GetListMetricsResponse> result = apiInstance.getListMetricsPost(getListMetricsRequest);
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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getListMetricsRequest** | [**GetListMetricsRequest**](GetListMetricsRequest.md)| getListMetricsRequest |

### Return type

[**GetListMetricsResponse**](GetListMetricsResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getMetricStatisticListGet"></a>
# **getMetricStatisticListGet**
> GetMetricStatisticListResponse getMetricStatisticListGet(getMetricStatisticListRequest)



A.메트릭 통계 조회

### Example
```java
// Import classes:
// import com.ncloud.monitoring.ApiClient;
// import com.ncloud.monitoring.ApiResponse;
// import com.ncloud.monitoring.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.monitoring.marshaller.JsonMarshaller;
// import com.ncloud.monitoring.marshaller.XmlMarshaller;
// import com.ncloud.monitoring.marshaller.FormMarshaller;
// import com.ncloud.monitoring.exception.ApiException;
// import com.ncloud.monitoring.exception.SdkException;
// import com.ncloud.monitoring.model.*;

// import com.ncloud.monitoring.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetMetricStatisticListRequest getMetricStatisticListRequest = new GetMetricStatisticListRequest(); // GetMetricStatisticListRequest | getMetricStatisticListRequest
try {
	// Handler Successful response
	ApiResponse<GetMetricStatisticListResponse> result = apiInstance.getMetricStatisticListGet(getMetricStatisticListRequest);
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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getMetricStatisticListRequest** | [**GetMetricStatisticListRequest**](GetMetricStatisticListRequest.md)| getMetricStatisticListRequest |

### Return type

[**GetMetricStatisticListResponse**](GetMetricStatisticListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getMetricStatisticListPost"></a>
# **getMetricStatisticListPost**
> GetMetricStatisticListResponse getMetricStatisticListPost(getMetricStatisticListRequest)



A.메트릭 통계 조회

### Example
```java
// Import classes:
// import com.ncloud.monitoring.ApiClient;
// import com.ncloud.monitoring.ApiResponse;
// import com.ncloud.monitoring.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.monitoring.marshaller.JsonMarshaller;
// import com.ncloud.monitoring.marshaller.XmlMarshaller;
// import com.ncloud.monitoring.marshaller.FormMarshaller;
// import com.ncloud.monitoring.exception.ApiException;
// import com.ncloud.monitoring.exception.SdkException;
// import com.ncloud.monitoring.model.*;

// import com.ncloud.monitoring.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetMetricStatisticListRequest getMetricStatisticListRequest = new GetMetricStatisticListRequest(); // GetMetricStatisticListRequest | getMetricStatisticListRequest
try {
	// Handler Successful response
	ApiResponse<GetMetricStatisticListResponse> result = apiInstance.getMetricStatisticListPost(getMetricStatisticListRequest);
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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getMetricStatisticListRequest** | [**GetMetricStatisticListRequest**](GetMetricStatisticListRequest.md)| getMetricStatisticListRequest |

### Return type

[**GetMetricStatisticListResponse**](GetMetricStatisticListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

