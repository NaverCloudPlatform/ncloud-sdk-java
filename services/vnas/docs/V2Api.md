# V2Api

All URIs are relative to *https://ncloud.apigw.ntruss.com/vnas/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNasVolumeAccessControlGet**](V2Api.md#addNasVolumeAccessControlGet) | **GET** /addNasVolumeAccessControl | 
[**addNasVolumeAccessControlPost**](V2Api.md#addNasVolumeAccessControlPost) | **POST** /addNasVolumeAccessControl | 
[**changeNasVolumeSizeGet**](V2Api.md#changeNasVolumeSizeGet) | **GET** /changeNasVolumeSize | 
[**changeNasVolumeSizePost**](V2Api.md#changeNasVolumeSizePost) | **POST** /changeNasVolumeSize | 
[**createNasVolumeInstanceGet**](V2Api.md#createNasVolumeInstanceGet) | **GET** /createNasVolumeInstance | 
[**createNasVolumeInstancePost**](V2Api.md#createNasVolumeInstancePost) | **POST** /createNasVolumeInstance | 
[**deleteNasVolumeInstancesGet**](V2Api.md#deleteNasVolumeInstancesGet) | **GET** /deleteNasVolumeInstances | 
[**deleteNasVolumeInstancesPost**](V2Api.md#deleteNasVolumeInstancesPost) | **POST** /deleteNasVolumeInstances | 
[**getNasVolumeInstanceDetailGet**](V2Api.md#getNasVolumeInstanceDetailGet) | **GET** /getNasVolumeInstanceDetail | 
[**getNasVolumeInstanceDetailPost**](V2Api.md#getNasVolumeInstanceDetailPost) | **POST** /getNasVolumeInstanceDetail | 
[**getNasVolumeInstanceListGet**](V2Api.md#getNasVolumeInstanceListGet) | **GET** /getNasVolumeInstanceList | 
[**getNasVolumeInstanceListPost**](V2Api.md#getNasVolumeInstanceListPost) | **POST** /getNasVolumeInstanceList | 
[**removeNasVolumeAccessControlGet**](V2Api.md#removeNasVolumeAccessControlGet) | **GET** /removeNasVolumeAccessControl | 
[**removeNasVolumeAccessControlPost**](V2Api.md#removeNasVolumeAccessControlPost) | **POST** /removeNasVolumeAccessControl | 
[**setNasVolumeAccessControlGet**](V2Api.md#setNasVolumeAccessControlGet) | **GET** /setNasVolumeAccessControl | 
[**setNasVolumeAccessControlPost**](V2Api.md#setNasVolumeAccessControlPost) | **POST** /setNasVolumeAccessControl | 


<a name="addNasVolumeAccessControlGet"></a>
# **addNasVolumeAccessControlGet**
> AddNasVolumeAccessControlResponse addNasVolumeAccessControlGet(addNasVolumeAccessControlRequest)



NAS볼륨접근제어추가

### Example
```java
// Import classes:
// import com.ncloud.vnas.ApiClient;
// import com.ncloud.vnas.ApiResponse;
// import com.ncloud.vnas.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnas.marshaller.JsonMarshaller;
// import com.ncloud.vnas.marshaller.XmlMarshaller;
// import com.ncloud.vnas.marshaller.FormMarshaller;
// import com.ncloud.vnas.exception.ApiException;
// import com.ncloud.vnas.exception.SdkException;
// import com.ncloud.vnas.model.*;

// import com.ncloud.vnas.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addNasVolumeAccessControlRequest** | [**AddNasVolumeAccessControlRequest**](AddNasVolumeAccessControlRequest.md)| addNasVolumeAccessControlRequest |

### Return type

[**AddNasVolumeAccessControlResponse**](AddNasVolumeAccessControlResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="addNasVolumeAccessControlPost"></a>
# **addNasVolumeAccessControlPost**
> AddNasVolumeAccessControlResponse addNasVolumeAccessControlPost(addNasVolumeAccessControlRequest)



NAS볼륨접근제어추가

### Example
```java
// Import classes:
// import com.ncloud.vnas.ApiClient;
// import com.ncloud.vnas.ApiResponse;
// import com.ncloud.vnas.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnas.marshaller.JsonMarshaller;
// import com.ncloud.vnas.marshaller.XmlMarshaller;
// import com.ncloud.vnas.marshaller.FormMarshaller;
// import com.ncloud.vnas.exception.ApiException;
// import com.ncloud.vnas.exception.SdkException;
// import com.ncloud.vnas.model.*;

// import com.ncloud.vnas.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
AddNasVolumeAccessControlRequest addNasVolumeAccessControlRequest = new AddNasVolumeAccessControlRequest(); // AddNasVolumeAccessControlRequest | addNasVolumeAccessControlRequest
try {
	// Handler Successful response
	ApiResponse<AddNasVolumeAccessControlResponse> result = apiInstance.addNasVolumeAccessControlPost(addNasVolumeAccessControlRequest);
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
 **addNasVolumeAccessControlRequest** | [**AddNasVolumeAccessControlRequest**](AddNasVolumeAccessControlRequest.md)| addNasVolumeAccessControlRequest |

### Return type

[**AddNasVolumeAccessControlResponse**](AddNasVolumeAccessControlResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="changeNasVolumeSizeGet"></a>
# **changeNasVolumeSizeGet**
> ChangeNasVolumeSizeResponse changeNasVolumeSizeGet(changeNasVolumeSizeRequest)



NAS볼륨사이즈변경

### Example
```java
// Import classes:
// import com.ncloud.vnas.ApiClient;
// import com.ncloud.vnas.ApiResponse;
// import com.ncloud.vnas.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnas.marshaller.JsonMarshaller;
// import com.ncloud.vnas.marshaller.XmlMarshaller;
// import com.ncloud.vnas.marshaller.FormMarshaller;
// import com.ncloud.vnas.exception.ApiException;
// import com.ncloud.vnas.exception.SdkException;
// import com.ncloud.vnas.model.*;

// import com.ncloud.vnas.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
ChangeNasVolumeSizeRequest changeNasVolumeSizeRequest = new ChangeNasVolumeSizeRequest(); // ChangeNasVolumeSizeRequest | changeNasVolumeSizeRequest
try {
	// Handler Successful response
	ApiResponse<ChangeNasVolumeSizeResponse> result = apiInstance.changeNasVolumeSizeGet(changeNasVolumeSizeRequest);
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
 **changeNasVolumeSizeRequest** | [**ChangeNasVolumeSizeRequest**](ChangeNasVolumeSizeRequest.md)| changeNasVolumeSizeRequest |

### Return type

[**ChangeNasVolumeSizeResponse**](ChangeNasVolumeSizeResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="changeNasVolumeSizePost"></a>
# **changeNasVolumeSizePost**
> ChangeNasVolumeSizeResponse changeNasVolumeSizePost(changeNasVolumeSizeRequest)



NAS볼륨사이즈변경

### Example
```java
// Import classes:
// import com.ncloud.vnas.ApiClient;
// import com.ncloud.vnas.ApiResponse;
// import com.ncloud.vnas.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnas.marshaller.JsonMarshaller;
// import com.ncloud.vnas.marshaller.XmlMarshaller;
// import com.ncloud.vnas.marshaller.FormMarshaller;
// import com.ncloud.vnas.exception.ApiException;
// import com.ncloud.vnas.exception.SdkException;
// import com.ncloud.vnas.model.*;

// import com.ncloud.vnas.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
ChangeNasVolumeSizeRequest changeNasVolumeSizeRequest = new ChangeNasVolumeSizeRequest(); // ChangeNasVolumeSizeRequest | changeNasVolumeSizeRequest
try {
	// Handler Successful response
	ApiResponse<ChangeNasVolumeSizeResponse> result = apiInstance.changeNasVolumeSizePost(changeNasVolumeSizeRequest);
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
 **changeNasVolumeSizeRequest** | [**ChangeNasVolumeSizeRequest**](ChangeNasVolumeSizeRequest.md)| changeNasVolumeSizeRequest |

### Return type

[**ChangeNasVolumeSizeResponse**](ChangeNasVolumeSizeResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="createNasVolumeInstanceGet"></a>
# **createNasVolumeInstanceGet**
> CreateNasVolumeInstanceResponse createNasVolumeInstanceGet(createNasVolumeInstanceRequest)



NAS볼륨인스턴스생성

### Example
```java
// Import classes:
// import com.ncloud.vnas.ApiClient;
// import com.ncloud.vnas.ApiResponse;
// import com.ncloud.vnas.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnas.marshaller.JsonMarshaller;
// import com.ncloud.vnas.marshaller.XmlMarshaller;
// import com.ncloud.vnas.marshaller.FormMarshaller;
// import com.ncloud.vnas.exception.ApiException;
// import com.ncloud.vnas.exception.SdkException;
// import com.ncloud.vnas.model.*;

// import com.ncloud.vnas.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
CreateNasVolumeInstanceRequest createNasVolumeInstanceRequest = new CreateNasVolumeInstanceRequest(); // CreateNasVolumeInstanceRequest | createNasVolumeInstanceRequest
try {
	// Handler Successful response
	ApiResponse<CreateNasVolumeInstanceResponse> result = apiInstance.createNasVolumeInstanceGet(createNasVolumeInstanceRequest);
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
 **createNasVolumeInstanceRequest** | [**CreateNasVolumeInstanceRequest**](CreateNasVolumeInstanceRequest.md)| createNasVolumeInstanceRequest |

### Return type

[**CreateNasVolumeInstanceResponse**](CreateNasVolumeInstanceResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="createNasVolumeInstancePost"></a>
# **createNasVolumeInstancePost**
> CreateNasVolumeInstanceResponse createNasVolumeInstancePost(createNasVolumeInstanceRequest)



NAS볼륨인스턴스생성

### Example
```java
// Import classes:
// import com.ncloud.vnas.ApiClient;
// import com.ncloud.vnas.ApiResponse;
// import com.ncloud.vnas.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnas.marshaller.JsonMarshaller;
// import com.ncloud.vnas.marshaller.XmlMarshaller;
// import com.ncloud.vnas.marshaller.FormMarshaller;
// import com.ncloud.vnas.exception.ApiException;
// import com.ncloud.vnas.exception.SdkException;
// import com.ncloud.vnas.model.*;

// import com.ncloud.vnas.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
CreateNasVolumeInstanceRequest createNasVolumeInstanceRequest = new CreateNasVolumeInstanceRequest(); // CreateNasVolumeInstanceRequest | createNasVolumeInstanceRequest
try {
	// Handler Successful response
	ApiResponse<CreateNasVolumeInstanceResponse> result = apiInstance.createNasVolumeInstancePost(createNasVolumeInstanceRequest);
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
 **createNasVolumeInstanceRequest** | [**CreateNasVolumeInstanceRequest**](CreateNasVolumeInstanceRequest.md)| createNasVolumeInstanceRequest |

### Return type

[**CreateNasVolumeInstanceResponse**](CreateNasVolumeInstanceResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="deleteNasVolumeInstancesGet"></a>
# **deleteNasVolumeInstancesGet**
> DeleteNasVolumeInstancesResponse deleteNasVolumeInstancesGet(deleteNasVolumeInstancesRequest)



NAS볼륨인스턴스제거

### Example
```java
// Import classes:
// import com.ncloud.vnas.ApiClient;
// import com.ncloud.vnas.ApiResponse;
// import com.ncloud.vnas.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnas.marshaller.JsonMarshaller;
// import com.ncloud.vnas.marshaller.XmlMarshaller;
// import com.ncloud.vnas.marshaller.FormMarshaller;
// import com.ncloud.vnas.exception.ApiException;
// import com.ncloud.vnas.exception.SdkException;
// import com.ncloud.vnas.model.*;

// import com.ncloud.vnas.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
DeleteNasVolumeInstancesRequest deleteNasVolumeInstancesRequest = new DeleteNasVolumeInstancesRequest(); // DeleteNasVolumeInstancesRequest | deleteNasVolumeInstancesRequest
try {
	// Handler Successful response
	ApiResponse<DeleteNasVolumeInstancesResponse> result = apiInstance.deleteNasVolumeInstancesGet(deleteNasVolumeInstancesRequest);
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
 **deleteNasVolumeInstancesRequest** | [**DeleteNasVolumeInstancesRequest**](DeleteNasVolumeInstancesRequest.md)| deleteNasVolumeInstancesRequest |

### Return type

[**DeleteNasVolumeInstancesResponse**](DeleteNasVolumeInstancesResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="deleteNasVolumeInstancesPost"></a>
# **deleteNasVolumeInstancesPost**
> DeleteNasVolumeInstancesResponse deleteNasVolumeInstancesPost(deleteNasVolumeInstancesRequest)



NAS볼륨인스턴스제거

### Example
```java
// Import classes:
// import com.ncloud.vnas.ApiClient;
// import com.ncloud.vnas.ApiResponse;
// import com.ncloud.vnas.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnas.marshaller.JsonMarshaller;
// import com.ncloud.vnas.marshaller.XmlMarshaller;
// import com.ncloud.vnas.marshaller.FormMarshaller;
// import com.ncloud.vnas.exception.ApiException;
// import com.ncloud.vnas.exception.SdkException;
// import com.ncloud.vnas.model.*;

// import com.ncloud.vnas.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
DeleteNasVolumeInstancesRequest deleteNasVolumeInstancesRequest = new DeleteNasVolumeInstancesRequest(); // DeleteNasVolumeInstancesRequest | deleteNasVolumeInstancesRequest
try {
	// Handler Successful response
	ApiResponse<DeleteNasVolumeInstancesResponse> result = apiInstance.deleteNasVolumeInstancesPost(deleteNasVolumeInstancesRequest);
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
 **deleteNasVolumeInstancesRequest** | [**DeleteNasVolumeInstancesRequest**](DeleteNasVolumeInstancesRequest.md)| deleteNasVolumeInstancesRequest |

### Return type

[**DeleteNasVolumeInstancesResponse**](DeleteNasVolumeInstancesResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getNasVolumeInstanceDetailGet"></a>
# **getNasVolumeInstanceDetailGet**
> GetNasVolumeInstanceDetailResponse getNasVolumeInstanceDetailGet(getNasVolumeInstanceDetailRequest)



NAS볼륨인스턴스상세조회

### Example
```java
// Import classes:
// import com.ncloud.vnas.ApiClient;
// import com.ncloud.vnas.ApiResponse;
// import com.ncloud.vnas.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnas.marshaller.JsonMarshaller;
// import com.ncloud.vnas.marshaller.XmlMarshaller;
// import com.ncloud.vnas.marshaller.FormMarshaller;
// import com.ncloud.vnas.exception.ApiException;
// import com.ncloud.vnas.exception.SdkException;
// import com.ncloud.vnas.model.*;

// import com.ncloud.vnas.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetNasVolumeInstanceDetailRequest getNasVolumeInstanceDetailRequest = new GetNasVolumeInstanceDetailRequest(); // GetNasVolumeInstanceDetailRequest | getNasVolumeInstanceDetailRequest
try {
	// Handler Successful response
	ApiResponse<GetNasVolumeInstanceDetailResponse> result = apiInstance.getNasVolumeInstanceDetailGet(getNasVolumeInstanceDetailRequest);
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
 **getNasVolumeInstanceDetailRequest** | [**GetNasVolumeInstanceDetailRequest**](GetNasVolumeInstanceDetailRequest.md)| getNasVolumeInstanceDetailRequest |

### Return type

[**GetNasVolumeInstanceDetailResponse**](GetNasVolumeInstanceDetailResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getNasVolumeInstanceDetailPost"></a>
# **getNasVolumeInstanceDetailPost**
> GetNasVolumeInstanceDetailResponse getNasVolumeInstanceDetailPost(getNasVolumeInstanceDetailRequest)



NAS볼륨인스턴스상세조회

### Example
```java
// Import classes:
// import com.ncloud.vnas.ApiClient;
// import com.ncloud.vnas.ApiResponse;
// import com.ncloud.vnas.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnas.marshaller.JsonMarshaller;
// import com.ncloud.vnas.marshaller.XmlMarshaller;
// import com.ncloud.vnas.marshaller.FormMarshaller;
// import com.ncloud.vnas.exception.ApiException;
// import com.ncloud.vnas.exception.SdkException;
// import com.ncloud.vnas.model.*;

// import com.ncloud.vnas.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetNasVolumeInstanceDetailRequest getNasVolumeInstanceDetailRequest = new GetNasVolumeInstanceDetailRequest(); // GetNasVolumeInstanceDetailRequest | getNasVolumeInstanceDetailRequest
try {
	// Handler Successful response
	ApiResponse<GetNasVolumeInstanceDetailResponse> result = apiInstance.getNasVolumeInstanceDetailPost(getNasVolumeInstanceDetailRequest);
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
 **getNasVolumeInstanceDetailRequest** | [**GetNasVolumeInstanceDetailRequest**](GetNasVolumeInstanceDetailRequest.md)| getNasVolumeInstanceDetailRequest |

### Return type

[**GetNasVolumeInstanceDetailResponse**](GetNasVolumeInstanceDetailResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getNasVolumeInstanceListGet"></a>
# **getNasVolumeInstanceListGet**
> GetNasVolumeInstanceListResponse getNasVolumeInstanceListGet(getNasVolumeInstanceListRequest)



NAS볼륨인스턴스리스트조회

### Example
```java
// Import classes:
// import com.ncloud.vnas.ApiClient;
// import com.ncloud.vnas.ApiResponse;
// import com.ncloud.vnas.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnas.marshaller.JsonMarshaller;
// import com.ncloud.vnas.marshaller.XmlMarshaller;
// import com.ncloud.vnas.marshaller.FormMarshaller;
// import com.ncloud.vnas.exception.ApiException;
// import com.ncloud.vnas.exception.SdkException;
// import com.ncloud.vnas.model.*;

// import com.ncloud.vnas.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetNasVolumeInstanceListRequest getNasVolumeInstanceListRequest = new GetNasVolumeInstanceListRequest(); // GetNasVolumeInstanceListRequest | getNasVolumeInstanceListRequest
try {
	// Handler Successful response
	ApiResponse<GetNasVolumeInstanceListResponse> result = apiInstance.getNasVolumeInstanceListGet(getNasVolumeInstanceListRequest);
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
 **getNasVolumeInstanceListRequest** | [**GetNasVolumeInstanceListRequest**](GetNasVolumeInstanceListRequest.md)| getNasVolumeInstanceListRequest |

### Return type

[**GetNasVolumeInstanceListResponse**](GetNasVolumeInstanceListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getNasVolumeInstanceListPost"></a>
# **getNasVolumeInstanceListPost**
> GetNasVolumeInstanceListResponse getNasVolumeInstanceListPost(getNasVolumeInstanceListRequest)



NAS볼륨인스턴스리스트조회

### Example
```java
// Import classes:
// import com.ncloud.vnas.ApiClient;
// import com.ncloud.vnas.ApiResponse;
// import com.ncloud.vnas.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnas.marshaller.JsonMarshaller;
// import com.ncloud.vnas.marshaller.XmlMarshaller;
// import com.ncloud.vnas.marshaller.FormMarshaller;
// import com.ncloud.vnas.exception.ApiException;
// import com.ncloud.vnas.exception.SdkException;
// import com.ncloud.vnas.model.*;

// import com.ncloud.vnas.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetNasVolumeInstanceListRequest getNasVolumeInstanceListRequest = new GetNasVolumeInstanceListRequest(); // GetNasVolumeInstanceListRequest | getNasVolumeInstanceListRequest
try {
	// Handler Successful response
	ApiResponse<GetNasVolumeInstanceListResponse> result = apiInstance.getNasVolumeInstanceListPost(getNasVolumeInstanceListRequest);
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
 **getNasVolumeInstanceListRequest** | [**GetNasVolumeInstanceListRequest**](GetNasVolumeInstanceListRequest.md)| getNasVolumeInstanceListRequest |

### Return type

[**GetNasVolumeInstanceListResponse**](GetNasVolumeInstanceListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="removeNasVolumeAccessControlGet"></a>
# **removeNasVolumeAccessControlGet**
> RemoveNasVolumeAccessControlResponse removeNasVolumeAccessControlGet(removeNasVolumeAccessControlRequest)



NAS볼륨접근제어삭제

### Example
```java
// Import classes:
// import com.ncloud.vnas.ApiClient;
// import com.ncloud.vnas.ApiResponse;
// import com.ncloud.vnas.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnas.marshaller.JsonMarshaller;
// import com.ncloud.vnas.marshaller.XmlMarshaller;
// import com.ncloud.vnas.marshaller.FormMarshaller;
// import com.ncloud.vnas.exception.ApiException;
// import com.ncloud.vnas.exception.SdkException;
// import com.ncloud.vnas.model.*;

// import com.ncloud.vnas.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
RemoveNasVolumeAccessControlRequest removeNasVolumeAccessControlRequest = new RemoveNasVolumeAccessControlRequest(); // RemoveNasVolumeAccessControlRequest | removeNasVolumeAccessControlRequest
try {
	// Handler Successful response
	ApiResponse<RemoveNasVolumeAccessControlResponse> result = apiInstance.removeNasVolumeAccessControlGet(removeNasVolumeAccessControlRequest);
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
 **removeNasVolumeAccessControlRequest** | [**RemoveNasVolumeAccessControlRequest**](RemoveNasVolumeAccessControlRequest.md)| removeNasVolumeAccessControlRequest |

### Return type

[**RemoveNasVolumeAccessControlResponse**](RemoveNasVolumeAccessControlResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="removeNasVolumeAccessControlPost"></a>
# **removeNasVolumeAccessControlPost**
> RemoveNasVolumeAccessControlResponse removeNasVolumeAccessControlPost(removeNasVolumeAccessControlRequest)



NAS볼륨접근제어삭제

### Example
```java
// Import classes:
// import com.ncloud.vnas.ApiClient;
// import com.ncloud.vnas.ApiResponse;
// import com.ncloud.vnas.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnas.marshaller.JsonMarshaller;
// import com.ncloud.vnas.marshaller.XmlMarshaller;
// import com.ncloud.vnas.marshaller.FormMarshaller;
// import com.ncloud.vnas.exception.ApiException;
// import com.ncloud.vnas.exception.SdkException;
// import com.ncloud.vnas.model.*;

// import com.ncloud.vnas.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
RemoveNasVolumeAccessControlRequest removeNasVolumeAccessControlRequest = new RemoveNasVolumeAccessControlRequest(); // RemoveNasVolumeAccessControlRequest | removeNasVolumeAccessControlRequest
try {
	// Handler Successful response
	ApiResponse<RemoveNasVolumeAccessControlResponse> result = apiInstance.removeNasVolumeAccessControlPost(removeNasVolumeAccessControlRequest);
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
 **removeNasVolumeAccessControlRequest** | [**RemoveNasVolumeAccessControlRequest**](RemoveNasVolumeAccessControlRequest.md)| removeNasVolumeAccessControlRequest |

### Return type

[**RemoveNasVolumeAccessControlResponse**](RemoveNasVolumeAccessControlResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="setNasVolumeAccessControlGet"></a>
# **setNasVolumeAccessControlGet**
> SetNasVolumeAccessControlResponse setNasVolumeAccessControlGet(setNasVolumeAccessControlRequest)



NAS볼륨접근제어설정

### Example
```java
// Import classes:
// import com.ncloud.vnas.ApiClient;
// import com.ncloud.vnas.ApiResponse;
// import com.ncloud.vnas.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnas.marshaller.JsonMarshaller;
// import com.ncloud.vnas.marshaller.XmlMarshaller;
// import com.ncloud.vnas.marshaller.FormMarshaller;
// import com.ncloud.vnas.exception.ApiException;
// import com.ncloud.vnas.exception.SdkException;
// import com.ncloud.vnas.model.*;

// import com.ncloud.vnas.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
SetNasVolumeAccessControlRequest setNasVolumeAccessControlRequest = new SetNasVolumeAccessControlRequest(); // SetNasVolumeAccessControlRequest | setNasVolumeAccessControlRequest
try {
	// Handler Successful response
	ApiResponse<SetNasVolumeAccessControlResponse> result = apiInstance.setNasVolumeAccessControlGet(setNasVolumeAccessControlRequest);
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
 **setNasVolumeAccessControlRequest** | [**SetNasVolumeAccessControlRequest**](SetNasVolumeAccessControlRequest.md)| setNasVolumeAccessControlRequest |

### Return type

[**SetNasVolumeAccessControlResponse**](SetNasVolumeAccessControlResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="setNasVolumeAccessControlPost"></a>
# **setNasVolumeAccessControlPost**
> SetNasVolumeAccessControlResponse setNasVolumeAccessControlPost(setNasVolumeAccessControlRequest)



NAS볼륨접근제어설정

### Example
```java
// Import classes:
// import com.ncloud.vnas.ApiClient;
// import com.ncloud.vnas.ApiResponse;
// import com.ncloud.vnas.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnas.marshaller.JsonMarshaller;
// import com.ncloud.vnas.marshaller.XmlMarshaller;
// import com.ncloud.vnas.marshaller.FormMarshaller;
// import com.ncloud.vnas.exception.ApiException;
// import com.ncloud.vnas.exception.SdkException;
// import com.ncloud.vnas.model.*;

// import com.ncloud.vnas.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
SetNasVolumeAccessControlRequest setNasVolumeAccessControlRequest = new SetNasVolumeAccessControlRequest(); // SetNasVolumeAccessControlRequest | setNasVolumeAccessControlRequest
try {
	// Handler Successful response
	ApiResponse<SetNasVolumeAccessControlResponse> result = apiInstance.setNasVolumeAccessControlPost(setNasVolumeAccessControlRequest);
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
 **setNasVolumeAccessControlRequest** | [**SetNasVolumeAccessControlRequest**](SetNasVolumeAccessControlRequest.md)| setNasVolumeAccessControlRequest |

### Return type

[**SetNasVolumeAccessControlResponse**](SetNasVolumeAccessControlResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

