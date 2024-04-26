# V2Api

All URIs are relative to *https://ncloud.apigw.ntruss.com/cdn/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCdnPlusInstanceListGet**](V2Api.md#getCdnPlusInstanceListGet) | **GET** /getCdnPlusInstanceList | 
[**getCdnPlusInstanceListPost**](V2Api.md#getCdnPlusInstanceListPost) | **POST** /getCdnPlusInstanceList | 
[**getCdnPlusMonitoringDataGet**](V2Api.md#getCdnPlusMonitoringDataGet) | **GET** /getCdnPlusMonitoringData | 
[**getCdnPlusMonitoringDataPost**](V2Api.md#getCdnPlusMonitoringDataPost) | **POST** /getCdnPlusMonitoringData | 
[**getCdnPlusPurgeHistoryListGet**](V2Api.md#getCdnPlusPurgeHistoryListGet) | **GET** /getCdnPlusPurgeHistoryList | 
[**getCdnPlusPurgeHistoryListPost**](V2Api.md#getCdnPlusPurgeHistoryListPost) | **POST** /getCdnPlusPurgeHistoryList | 
[**getCdnPlusUsageDataGet**](V2Api.md#getCdnPlusUsageDataGet) | **GET** /getCdnPlusUsageData | 
[**getCdnPlusUsageDataPost**](V2Api.md#getCdnPlusUsageDataPost) | **POST** /getCdnPlusUsageData | 
[**getGlobalCdnInstanceListGet**](V2Api.md#getGlobalCdnInstanceListGet) | **GET** /getGlobalCdnInstanceList | 
[**getGlobalCdnInstanceListPost**](V2Api.md#getGlobalCdnInstanceListPost) | **POST** /getGlobalCdnInstanceList | 
[**getGlobalCdnMonitoringDataGet**](V2Api.md#getGlobalCdnMonitoringDataGet) | **GET** /getGlobalCdnMonitoringData | 
[**getGlobalCdnMonitoringDataPost**](V2Api.md#getGlobalCdnMonitoringDataPost) | **POST** /getGlobalCdnMonitoringData | 
[**getGlobalCdnPurgeHistoryListGet**](V2Api.md#getGlobalCdnPurgeHistoryListGet) | **GET** /getGlobalCdnPurgeHistoryList | 
[**getGlobalCdnPurgeHistoryListPost**](V2Api.md#getGlobalCdnPurgeHistoryListPost) | **POST** /getGlobalCdnPurgeHistoryList | 
[**getGlobalCdnUsageDataGet**](V2Api.md#getGlobalCdnUsageDataGet) | **GET** /getGlobalCdnUsageData | 
[**getGlobalCdnUsageDataPost**](V2Api.md#getGlobalCdnUsageDataPost) | **POST** /getGlobalCdnUsageData | 
[**requestCdnPlusPurgeGet**](V2Api.md#requestCdnPlusPurgeGet) | **GET** /requestCdnPlusPurge | 
[**requestCdnPlusPurgePost**](V2Api.md#requestCdnPlusPurgePost) | **POST** /requestCdnPlusPurge | 
[**requestGlobalCdnPurgeGet**](V2Api.md#requestGlobalCdnPurgeGet) | **GET** /requestGlobalCdnPurge | 
[**requestGlobalCdnPurgePost**](V2Api.md#requestGlobalCdnPurgePost) | **POST** /requestGlobalCdnPurge | 


<a name="getCdnPlusInstanceListGet"></a>
# **getCdnPlusInstanceListGet**
> GetCdnPlusInstanceListResponse getCdnPlusInstanceListGet(getCdnPlusInstanceListRequest)



CDN+인스턴스리스트조회

### Example
```java
// Import classes:
// import com.ncloud.cdn.ApiClient;
// import com.ncloud.cdn.ApiResponse;
// import com.ncloud.cdn.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.cdn.marshaller.JsonMarshaller;
// import com.ncloud.cdn.marshaller.XmlMarshaller;
// import com.ncloud.cdn.marshaller.FormMarshaller;
// import com.ncloud.cdn.exception.ApiException;
// import com.ncloud.cdn.exception.SdkException;
// import com.ncloud.cdn.model.*;

// import com.ncloud.cdn.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetCdnPlusInstanceListRequest getCdnPlusInstanceListRequest = new GetCdnPlusInstanceListRequest(); // GetCdnPlusInstanceListRequest | getCdnPlusInstanceListRequest
try {
	// Handler Successful response
	ApiResponse<GetCdnPlusInstanceListResponse> result = apiInstance.getCdnPlusInstanceListGet(getCdnPlusInstanceListRequest);
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
 **getCdnPlusInstanceListRequest** | [**GetCdnPlusInstanceListRequest**](GetCdnPlusInstanceListRequest.md)| getCdnPlusInstanceListRequest |

### Return type

[**GetCdnPlusInstanceListResponse**](GetCdnPlusInstanceListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getCdnPlusInstanceListPost"></a>
# **getCdnPlusInstanceListPost**
> GetCdnPlusInstanceListResponse getCdnPlusInstanceListPost(getCdnPlusInstanceListRequest)



CDN+인스턴스리스트조회

### Example
```java
// Import classes:
// import com.ncloud.cdn.ApiClient;
// import com.ncloud.cdn.ApiResponse;
// import com.ncloud.cdn.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.cdn.marshaller.JsonMarshaller;
// import com.ncloud.cdn.marshaller.XmlMarshaller;
// import com.ncloud.cdn.marshaller.FormMarshaller;
// import com.ncloud.cdn.exception.ApiException;
// import com.ncloud.cdn.exception.SdkException;
// import com.ncloud.cdn.model.*;

// import com.ncloud.cdn.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetCdnPlusInstanceListRequest getCdnPlusInstanceListRequest = new GetCdnPlusInstanceListRequest(); // GetCdnPlusInstanceListRequest | getCdnPlusInstanceListRequest
try {
	// Handler Successful response
	ApiResponse<GetCdnPlusInstanceListResponse> result = apiInstance.getCdnPlusInstanceListPost(getCdnPlusInstanceListRequest);
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
 **getCdnPlusInstanceListRequest** | [**GetCdnPlusInstanceListRequest**](GetCdnPlusInstanceListRequest.md)| getCdnPlusInstanceListRequest |

### Return type

[**GetCdnPlusInstanceListResponse**](GetCdnPlusInstanceListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getCdnPlusMonitoringDataGet"></a>
# **getCdnPlusMonitoringDataGet**
> getCdnPlusMonitoringDataGet()





### Example
```java
// Import classes:
// import com.ncloud.cdn.ApiClient;
// import com.ncloud.cdn.ApiResponse;
// import com.ncloud.cdn.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.cdn.marshaller.JsonMarshaller;
// import com.ncloud.cdn.marshaller.XmlMarshaller;
// import com.ncloud.cdn.marshaller.FormMarshaller;
// import com.ncloud.cdn.exception.ApiException;
// import com.ncloud.cdn.exception.SdkException;
// import com.ncloud.cdn.model.*;

// import com.ncloud.cdn.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
try {
	// Handler Successful response
	apiInstance.getCdnPlusMonitoringDataGet();
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
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCdnPlusMonitoringDataPost"></a>
# **getCdnPlusMonitoringDataPost**
> getCdnPlusMonitoringDataPost()





### Example
```java
// Import classes:
// import com.ncloud.cdn.ApiClient;
// import com.ncloud.cdn.ApiResponse;
// import com.ncloud.cdn.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.cdn.marshaller.JsonMarshaller;
// import com.ncloud.cdn.marshaller.XmlMarshaller;
// import com.ncloud.cdn.marshaller.FormMarshaller;
// import com.ncloud.cdn.exception.ApiException;
// import com.ncloud.cdn.exception.SdkException;
// import com.ncloud.cdn.model.*;

// import com.ncloud.cdn.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
try {
	// Handler Successful response
	apiInstance.getCdnPlusMonitoringDataPost();
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
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCdnPlusPurgeHistoryListGet"></a>
# **getCdnPlusPurgeHistoryListGet**
> GetCdnPlusPurgeHistoryListResponse getCdnPlusPurgeHistoryListGet(getCdnPlusPurgeHistoryListRequest)



CDN+퍼지기록조회

### Example
```java
// Import classes:
// import com.ncloud.cdn.ApiClient;
// import com.ncloud.cdn.ApiResponse;
// import com.ncloud.cdn.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.cdn.marshaller.JsonMarshaller;
// import com.ncloud.cdn.marshaller.XmlMarshaller;
// import com.ncloud.cdn.marshaller.FormMarshaller;
// import com.ncloud.cdn.exception.ApiException;
// import com.ncloud.cdn.exception.SdkException;
// import com.ncloud.cdn.model.*;

// import com.ncloud.cdn.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetCdnPlusPurgeHistoryListRequest getCdnPlusPurgeHistoryListRequest = new GetCdnPlusPurgeHistoryListRequest(); // GetCdnPlusPurgeHistoryListRequest | getCdnPlusPurgeHistoryListRequest
try {
	// Handler Successful response
	ApiResponse<GetCdnPlusPurgeHistoryListResponse> result = apiInstance.getCdnPlusPurgeHistoryListGet(getCdnPlusPurgeHistoryListRequest);
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
 **getCdnPlusPurgeHistoryListRequest** | [**GetCdnPlusPurgeHistoryListRequest**](GetCdnPlusPurgeHistoryListRequest.md)| getCdnPlusPurgeHistoryListRequest |

### Return type

[**GetCdnPlusPurgeHistoryListResponse**](GetCdnPlusPurgeHistoryListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getCdnPlusPurgeHistoryListPost"></a>
# **getCdnPlusPurgeHistoryListPost**
> GetCdnPlusPurgeHistoryListResponse getCdnPlusPurgeHistoryListPost(getCdnPlusPurgeHistoryListRequest)



CDN+퍼지기록조회

### Example
```java
// Import classes:
// import com.ncloud.cdn.ApiClient;
// import com.ncloud.cdn.ApiResponse;
// import com.ncloud.cdn.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.cdn.marshaller.JsonMarshaller;
// import com.ncloud.cdn.marshaller.XmlMarshaller;
// import com.ncloud.cdn.marshaller.FormMarshaller;
// import com.ncloud.cdn.exception.ApiException;
// import com.ncloud.cdn.exception.SdkException;
// import com.ncloud.cdn.model.*;

// import com.ncloud.cdn.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetCdnPlusPurgeHistoryListRequest getCdnPlusPurgeHistoryListRequest = new GetCdnPlusPurgeHistoryListRequest(); // GetCdnPlusPurgeHistoryListRequest | getCdnPlusPurgeHistoryListRequest
try {
	// Handler Successful response
	ApiResponse<GetCdnPlusPurgeHistoryListResponse> result = apiInstance.getCdnPlusPurgeHistoryListPost(getCdnPlusPurgeHistoryListRequest);
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
 **getCdnPlusPurgeHistoryListRequest** | [**GetCdnPlusPurgeHistoryListRequest**](GetCdnPlusPurgeHistoryListRequest.md)| getCdnPlusPurgeHistoryListRequest |

### Return type

[**GetCdnPlusPurgeHistoryListResponse**](GetCdnPlusPurgeHistoryListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getCdnPlusUsageDataGet"></a>
# **getCdnPlusUsageDataGet**
> getCdnPlusUsageDataGet()





### Example
```java
// Import classes:
// import com.ncloud.cdn.ApiClient;
// import com.ncloud.cdn.ApiResponse;
// import com.ncloud.cdn.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.cdn.marshaller.JsonMarshaller;
// import com.ncloud.cdn.marshaller.XmlMarshaller;
// import com.ncloud.cdn.marshaller.FormMarshaller;
// import com.ncloud.cdn.exception.ApiException;
// import com.ncloud.cdn.exception.SdkException;
// import com.ncloud.cdn.model.*;

// import com.ncloud.cdn.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
try {
	// Handler Successful response
	apiInstance.getCdnPlusUsageDataGet();
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
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCdnPlusUsageDataPost"></a>
# **getCdnPlusUsageDataPost**
> getCdnPlusUsageDataPost()





### Example
```java
// Import classes:
// import com.ncloud.cdn.ApiClient;
// import com.ncloud.cdn.ApiResponse;
// import com.ncloud.cdn.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.cdn.marshaller.JsonMarshaller;
// import com.ncloud.cdn.marshaller.XmlMarshaller;
// import com.ncloud.cdn.marshaller.FormMarshaller;
// import com.ncloud.cdn.exception.ApiException;
// import com.ncloud.cdn.exception.SdkException;
// import com.ncloud.cdn.model.*;

// import com.ncloud.cdn.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
try {
	// Handler Successful response
	apiInstance.getCdnPlusUsageDataPost();
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
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getGlobalCdnInstanceListGet"></a>
# **getGlobalCdnInstanceListGet**
> GetGlobalCdnInstanceListResponse getGlobalCdnInstanceListGet(getGlobalCdnInstanceListRequest)



Global CDN인스턴스리스트조회

### Example
```java
// Import classes:
// import com.ncloud.cdn.ApiClient;
// import com.ncloud.cdn.ApiResponse;
// import com.ncloud.cdn.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.cdn.marshaller.JsonMarshaller;
// import com.ncloud.cdn.marshaller.XmlMarshaller;
// import com.ncloud.cdn.marshaller.FormMarshaller;
// import com.ncloud.cdn.exception.ApiException;
// import com.ncloud.cdn.exception.SdkException;
// import com.ncloud.cdn.model.*;

// import com.ncloud.cdn.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetGlobalCdnInstanceListRequest getGlobalCdnInstanceListRequest = new GetGlobalCdnInstanceListRequest(); // GetGlobalCdnInstanceListRequest | getGlobalCdnInstanceListRequest
try {
	// Handler Successful response
	ApiResponse<GetGlobalCdnInstanceListResponse> result = apiInstance.getGlobalCdnInstanceListGet(getGlobalCdnInstanceListRequest);
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
 **getGlobalCdnInstanceListRequest** | [**GetGlobalCdnInstanceListRequest**](GetGlobalCdnInstanceListRequest.md)| getGlobalCdnInstanceListRequest |

### Return type

[**GetGlobalCdnInstanceListResponse**](GetGlobalCdnInstanceListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getGlobalCdnInstanceListPost"></a>
# **getGlobalCdnInstanceListPost**
> GetGlobalCdnInstanceListResponse getGlobalCdnInstanceListPost(getGlobalCdnInstanceListRequest)



Global CDN 인스턴스리스트조회

### Example
```java
// Import classes:
// import com.ncloud.cdn.ApiClient;
// import com.ncloud.cdn.ApiResponse;
// import com.ncloud.cdn.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.cdn.marshaller.JsonMarshaller;
// import com.ncloud.cdn.marshaller.XmlMarshaller;
// import com.ncloud.cdn.marshaller.FormMarshaller;
// import com.ncloud.cdn.exception.ApiException;
// import com.ncloud.cdn.exception.SdkException;
// import com.ncloud.cdn.model.*;

// import com.ncloud.cdn.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetGlobalCdnInstanceListRequest getGlobalCdnInstanceListRequest = new GetGlobalCdnInstanceListRequest(); // GetGlobalCdnInstanceListRequest | getGlobalCdnInstanceListRequest
try {
	// Handler Successful response
	ApiResponse<GetGlobalCdnInstanceListResponse> result = apiInstance.getGlobalCdnInstanceListPost(getGlobalCdnInstanceListRequest);
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
 **getGlobalCdnInstanceListRequest** | [**GetGlobalCdnInstanceListRequest**](GetGlobalCdnInstanceListRequest.md)| getGlobalCdnInstanceListRequest |

### Return type

[**GetGlobalCdnInstanceListResponse**](GetGlobalCdnInstanceListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getGlobalCdnMonitoringDataGet"></a>
# **getGlobalCdnMonitoringDataGet**
> getGlobalCdnMonitoringDataGet()





### Example
```java
// Import classes:
// import com.ncloud.cdn.ApiClient;
// import com.ncloud.cdn.ApiResponse;
// import com.ncloud.cdn.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.cdn.marshaller.JsonMarshaller;
// import com.ncloud.cdn.marshaller.XmlMarshaller;
// import com.ncloud.cdn.marshaller.FormMarshaller;
// import com.ncloud.cdn.exception.ApiException;
// import com.ncloud.cdn.exception.SdkException;
// import com.ncloud.cdn.model.*;

// import com.ncloud.cdn.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
try {
	// Handler Successful response
	apiInstance.getGlobalCdnMonitoringDataGet();
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
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getGlobalCdnMonitoringDataPost"></a>
# **getGlobalCdnMonitoringDataPost**
> getGlobalCdnMonitoringDataPost()





### Example
```java
// Import classes:
// import com.ncloud.cdn.ApiClient;
// import com.ncloud.cdn.ApiResponse;
// import com.ncloud.cdn.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.cdn.marshaller.JsonMarshaller;
// import com.ncloud.cdn.marshaller.XmlMarshaller;
// import com.ncloud.cdn.marshaller.FormMarshaller;
// import com.ncloud.cdn.exception.ApiException;
// import com.ncloud.cdn.exception.SdkException;
// import com.ncloud.cdn.model.*;

// import com.ncloud.cdn.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
try {
	// Handler Successful response
	apiInstance.getGlobalCdnMonitoringDataPost();
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
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getGlobalCdnPurgeHistoryListGet"></a>
# **getGlobalCdnPurgeHistoryListGet**
> GetGlobalCdnPurgeHistoryListResponse getGlobalCdnPurgeHistoryListGet(getGlobalCdnPurgeHistoryListRequest)



Global CDN퍼지기록조회

### Example
```java
// Import classes:
// import com.ncloud.cdn.ApiClient;
// import com.ncloud.cdn.ApiResponse;
// import com.ncloud.cdn.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.cdn.marshaller.JsonMarshaller;
// import com.ncloud.cdn.marshaller.XmlMarshaller;
// import com.ncloud.cdn.marshaller.FormMarshaller;
// import com.ncloud.cdn.exception.ApiException;
// import com.ncloud.cdn.exception.SdkException;
// import com.ncloud.cdn.model.*;

// import com.ncloud.cdn.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetGlobalCdnPurgeHistoryListRequest getGlobalCdnPurgeHistoryListRequest = new GetGlobalCdnPurgeHistoryListRequest(); // GetGlobalCdnPurgeHistoryListRequest | getGlobalCdnPurgeHistoryListRequest
try {
	// Handler Successful response
	ApiResponse<GetGlobalCdnPurgeHistoryListResponse> result = apiInstance.getGlobalCdnPurgeHistoryListGet(getGlobalCdnPurgeHistoryListRequest);
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
 **getGlobalCdnPurgeHistoryListRequest** | [**GetGlobalCdnPurgeHistoryListRequest**](GetGlobalCdnPurgeHistoryListRequest.md)| getGlobalCdnPurgeHistoryListRequest |

### Return type

[**GetGlobalCdnPurgeHistoryListResponse**](GetGlobalCdnPurgeHistoryListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getGlobalCdnPurgeHistoryListPost"></a>
# **getGlobalCdnPurgeHistoryListPost**
> GetGlobalCdnPurgeHistoryListResponse getGlobalCdnPurgeHistoryListPost(getGlobalCdnPurgeHistoryListRequest)



Global CDN퍼지기록조회

### Example
```java
// Import classes:
// import com.ncloud.cdn.ApiClient;
// import com.ncloud.cdn.ApiResponse;
// import com.ncloud.cdn.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.cdn.marshaller.JsonMarshaller;
// import com.ncloud.cdn.marshaller.XmlMarshaller;
// import com.ncloud.cdn.marshaller.FormMarshaller;
// import com.ncloud.cdn.exception.ApiException;
// import com.ncloud.cdn.exception.SdkException;
// import com.ncloud.cdn.model.*;

// import com.ncloud.cdn.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetGlobalCdnPurgeHistoryListRequest getGlobalCdnPurgeHistoryListRequest = new GetGlobalCdnPurgeHistoryListRequest(); // GetGlobalCdnPurgeHistoryListRequest | getGlobalCdnPurgeHistoryListRequest
try {
	// Handler Successful response
	ApiResponse<GetGlobalCdnPurgeHistoryListResponse> result = apiInstance.getGlobalCdnPurgeHistoryListPost(getGlobalCdnPurgeHistoryListRequest);
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
 **getGlobalCdnPurgeHistoryListRequest** | [**GetGlobalCdnPurgeHistoryListRequest**](GetGlobalCdnPurgeHistoryListRequest.md)| getGlobalCdnPurgeHistoryListRequest |

### Return type

[**GetGlobalCdnPurgeHistoryListResponse**](GetGlobalCdnPurgeHistoryListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getGlobalCdnUsageDataGet"></a>
# **getGlobalCdnUsageDataGet**
> getGlobalCdnUsageDataGet()





### Example
```java
// Import classes:
// import com.ncloud.cdn.ApiClient;
// import com.ncloud.cdn.ApiResponse;
// import com.ncloud.cdn.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.cdn.marshaller.JsonMarshaller;
// import com.ncloud.cdn.marshaller.XmlMarshaller;
// import com.ncloud.cdn.marshaller.FormMarshaller;
// import com.ncloud.cdn.exception.ApiException;
// import com.ncloud.cdn.exception.SdkException;
// import com.ncloud.cdn.model.*;

// import com.ncloud.cdn.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
try {
	// Handler Successful response
	apiInstance.getGlobalCdnUsageDataGet();
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
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getGlobalCdnUsageDataPost"></a>
# **getGlobalCdnUsageDataPost**
> getGlobalCdnUsageDataPost()





### Example
```java
// Import classes:
// import com.ncloud.cdn.ApiClient;
// import com.ncloud.cdn.ApiResponse;
// import com.ncloud.cdn.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.cdn.marshaller.JsonMarshaller;
// import com.ncloud.cdn.marshaller.XmlMarshaller;
// import com.ncloud.cdn.marshaller.FormMarshaller;
// import com.ncloud.cdn.exception.ApiException;
// import com.ncloud.cdn.exception.SdkException;
// import com.ncloud.cdn.model.*;

// import com.ncloud.cdn.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
try {
	// Handler Successful response
	apiInstance.getGlobalCdnUsageDataPost();
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
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="requestCdnPlusPurgeGet"></a>
# **requestCdnPlusPurgeGet**
> RequestCdnPlusPurgeResponse requestCdnPlusPurgeGet(requestCdnPlusPurgeRequest)



CDN+퍼지요청

### Example
```java
// Import classes:
// import com.ncloud.cdn.ApiClient;
// import com.ncloud.cdn.ApiResponse;
// import com.ncloud.cdn.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.cdn.marshaller.JsonMarshaller;
// import com.ncloud.cdn.marshaller.XmlMarshaller;
// import com.ncloud.cdn.marshaller.FormMarshaller;
// import com.ncloud.cdn.exception.ApiException;
// import com.ncloud.cdn.exception.SdkException;
// import com.ncloud.cdn.model.*;

// import com.ncloud.cdn.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
RequestCdnPlusPurgeRequest requestCdnPlusPurgeRequest = new RequestCdnPlusPurgeRequest(); // RequestCdnPlusPurgeRequest | requestCdnPlusPurgeRequest
try {
	// Handler Successful response
	ApiResponse<RequestCdnPlusPurgeResponse> result = apiInstance.requestCdnPlusPurgeGet(requestCdnPlusPurgeRequest);
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
 **requestCdnPlusPurgeRequest** | [**RequestCdnPlusPurgeRequest**](RequestCdnPlusPurgeRequest.md)| requestCdnPlusPurgeRequest |

### Return type

[**RequestCdnPlusPurgeResponse**](RequestCdnPlusPurgeResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="requestCdnPlusPurgePost"></a>
# **requestCdnPlusPurgePost**
> RequestCdnPlusPurgeResponse requestCdnPlusPurgePost(requestCdnPlusPurgeRequest)



CDN+퍼지요청

### Example
```java
// Import classes:
// import com.ncloud.cdn.ApiClient;
// import com.ncloud.cdn.ApiResponse;
// import com.ncloud.cdn.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.cdn.marshaller.JsonMarshaller;
// import com.ncloud.cdn.marshaller.XmlMarshaller;
// import com.ncloud.cdn.marshaller.FormMarshaller;
// import com.ncloud.cdn.exception.ApiException;
// import com.ncloud.cdn.exception.SdkException;
// import com.ncloud.cdn.model.*;

// import com.ncloud.cdn.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
RequestCdnPlusPurgeRequest requestCdnPlusPurgeRequest = new RequestCdnPlusPurgeRequest(); // RequestCdnPlusPurgeRequest | requestCdnPlusPurgeRequest
try {
	// Handler Successful response
	ApiResponse<RequestCdnPlusPurgeResponse> result = apiInstance.requestCdnPlusPurgePost(requestCdnPlusPurgeRequest);
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
 **requestCdnPlusPurgeRequest** | [**RequestCdnPlusPurgeRequest**](RequestCdnPlusPurgeRequest.md)| requestCdnPlusPurgeRequest |

### Return type

[**RequestCdnPlusPurgeResponse**](RequestCdnPlusPurgeResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="requestGlobalCdnPurgeGet"></a>
# **requestGlobalCdnPurgeGet**
> RequestGlobalCdnPurgeResponse requestGlobalCdnPurgeGet(requestGlobalCdnPurgeRequest)



Global CDN퍼지요청

### Example
```java
// Import classes:
// import com.ncloud.cdn.ApiClient;
// import com.ncloud.cdn.ApiResponse;
// import com.ncloud.cdn.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.cdn.marshaller.JsonMarshaller;
// import com.ncloud.cdn.marshaller.XmlMarshaller;
// import com.ncloud.cdn.marshaller.FormMarshaller;
// import com.ncloud.cdn.exception.ApiException;
// import com.ncloud.cdn.exception.SdkException;
// import com.ncloud.cdn.model.*;

// import com.ncloud.cdn.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
RequestGlobalCdnPurgeRequest requestGlobalCdnPurgeRequest = new RequestGlobalCdnPurgeRequest(); // RequestGlobalCdnPurgeRequest | requestGlobalCdnPurgeRequest
try {
	// Handler Successful response
	ApiResponse<RequestGlobalCdnPurgeResponse> result = apiInstance.requestGlobalCdnPurgeGet(requestGlobalCdnPurgeRequest);
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
 **requestGlobalCdnPurgeRequest** | [**RequestGlobalCdnPurgeRequest**](RequestGlobalCdnPurgeRequest.md)| requestGlobalCdnPurgeRequest |

### Return type

[**RequestGlobalCdnPurgeResponse**](RequestGlobalCdnPurgeResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="requestGlobalCdnPurgePost"></a>
# **requestGlobalCdnPurgePost**
> RequestGlobalCdnPurgeResponse requestGlobalCdnPurgePost(requestGlobalCdnPurgeRequest)



Global CDN퍼지요청

### Example
```java
// Import classes:
// import com.ncloud.cdn.ApiClient;
// import com.ncloud.cdn.ApiResponse;
// import com.ncloud.cdn.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.cdn.marshaller.JsonMarshaller;
// import com.ncloud.cdn.marshaller.XmlMarshaller;
// import com.ncloud.cdn.marshaller.FormMarshaller;
// import com.ncloud.cdn.exception.ApiException;
// import com.ncloud.cdn.exception.SdkException;
// import com.ncloud.cdn.model.*;

// import com.ncloud.cdn.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
RequestGlobalCdnPurgeRequest requestGlobalCdnPurgeRequest = new RequestGlobalCdnPurgeRequest(); // RequestGlobalCdnPurgeRequest | requestGlobalCdnPurgeRequest
try {
	// Handler Successful response
	ApiResponse<RequestGlobalCdnPurgeResponse> result = apiInstance.requestGlobalCdnPurgePost(requestGlobalCdnPurgeRequest);
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
 **requestGlobalCdnPurgeRequest** | [**RequestGlobalCdnPurgeRequest**](RequestGlobalCdnPurgeRequest.md)| requestGlobalCdnPurgeRequest |

### Return type

[**RequestGlobalCdnPurgeResponse**](RequestGlobalCdnPurgeResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

