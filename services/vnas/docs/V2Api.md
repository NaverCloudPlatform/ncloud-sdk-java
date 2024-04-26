# V2Api

All URIs are relative to *https://ncloud.apigw.ntruss.com/vnas/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNasVolumeAccessControlGet**](V2Api.md#addNasVolumeAccessControlGet) | **GET** /addNasVolumeAccessControl | 
[**addNasVolumeAccessControlPost**](V2Api.md#addNasVolumeAccessControlPost) | **POST** /addNasVolumeAccessControl | 
[**changeNasVolumeSizeGet**](V2Api.md#changeNasVolumeSizeGet) | **GET** /changeNasVolumeSize | 
[**changeNasVolumeSizePost**](V2Api.md#changeNasVolumeSizePost) | **POST** /changeNasVolumeSize | 
[**changeNasVolumeSnapshotConfigurationGet**](V2Api.md#changeNasVolumeSnapshotConfigurationGet) | **GET** /changeNasVolumeSnapshotConfiguration | 
[**changeNasVolumeSnapshotConfigurationPost**](V2Api.md#changeNasVolumeSnapshotConfigurationPost) | **POST** /changeNasVolumeSnapshotConfiguration | 
[**createNasVolumeInstanceGet**](V2Api.md#createNasVolumeInstanceGet) | **GET** /createNasVolumeInstance | 
[**createNasVolumeInstancePost**](V2Api.md#createNasVolumeInstancePost) | **POST** /createNasVolumeInstance | 
[**createNasVolumeSnapshotGet**](V2Api.md#createNasVolumeSnapshotGet) | **GET** /createNasVolumeSnapshot | 
[**createNasVolumeSnapshotPost**](V2Api.md#createNasVolumeSnapshotPost) | **POST** /createNasVolumeSnapshot | 
[**deleteNasVolumeInstancesGet**](V2Api.md#deleteNasVolumeInstancesGet) | **GET** /deleteNasVolumeInstances | 
[**deleteNasVolumeInstancesPost**](V2Api.md#deleteNasVolumeInstancesPost) | **POST** /deleteNasVolumeInstances | 
[**deleteNasVolumeSnapshotGet**](V2Api.md#deleteNasVolumeSnapshotGet) | **GET** /deleteNasVolumeSnapshot | 
[**deleteNasVolumeSnapshotPost**](V2Api.md#deleteNasVolumeSnapshotPost) | **POST** /deleteNasVolumeSnapshot | 
[**getNasVolumeAccessControlRuleListGet**](V2Api.md#getNasVolumeAccessControlRuleListGet) | **GET** /getNasVolumeAccessControlRuleList | 
[**getNasVolumeAccessControlRuleListPost**](V2Api.md#getNasVolumeAccessControlRuleListPost) | **POST** /getNasVolumeAccessControlRuleList | 
[**getNasVolumeInstanceDetailGet**](V2Api.md#getNasVolumeInstanceDetailGet) | **GET** /getNasVolumeInstanceDetail | 
[**getNasVolumeInstanceDetailPost**](V2Api.md#getNasVolumeInstanceDetailPost) | **POST** /getNasVolumeInstanceDetail | 
[**getNasVolumeInstanceListGet**](V2Api.md#getNasVolumeInstanceListGet) | **GET** /getNasVolumeInstanceList | 
[**getNasVolumeInstanceListPost**](V2Api.md#getNasVolumeInstanceListPost) | **POST** /getNasVolumeInstanceList | 
[**getNasVolumeInstanceRatingListGet**](V2Api.md#getNasVolumeInstanceRatingListGet) | **GET** /getNasVolumeInstanceRatingList | 
[**getNasVolumeInstanceRatingListPost**](V2Api.md#getNasVolumeInstanceRatingListPost) | **POST** /getNasVolumeInstanceRatingList | 
[**getNasVolumeSnapshotConfigurationHistoryListGet**](V2Api.md#getNasVolumeSnapshotConfigurationHistoryListGet) | **GET** /getNasVolumeSnapshotConfigurationHistoryList | 
[**getNasVolumeSnapshotConfigurationHistoryListPost**](V2Api.md#getNasVolumeSnapshotConfigurationHistoryListPost) | **POST** /getNasVolumeSnapshotConfigurationHistoryList | 
[**getNasVolumeSnapshotListGet**](V2Api.md#getNasVolumeSnapshotListGet) | **GET** /getNasVolumeSnapshotList | 
[**getNasVolumeSnapshotListPost**](V2Api.md#getNasVolumeSnapshotListPost) | **POST** /getNasVolumeSnapshotList | 
[**removeNasVolumeAccessControlGet**](V2Api.md#removeNasVolumeAccessControlGet) | **GET** /removeNasVolumeAccessControl | 
[**removeNasVolumeAccessControlPost**](V2Api.md#removeNasVolumeAccessControlPost) | **POST** /removeNasVolumeAccessControl | 
[**restoreNasVolumeWithSnapshotGet**](V2Api.md#restoreNasVolumeWithSnapshotGet) | **GET** /restoreNasVolumeWithSnapshot | 
[**restoreNasVolumeWithSnapshotPost**](V2Api.md#restoreNasVolumeWithSnapshotPost) | **POST** /restoreNasVolumeWithSnapshot | 
[**setNasVolumeAccessControlGet**](V2Api.md#setNasVolumeAccessControlGet) | **GET** /setNasVolumeAccessControl | 
[**setNasVolumeAccessControlPost**](V2Api.md#setNasVolumeAccessControlPost) | **POST** /setNasVolumeAccessControl | 
[**setNasVolumeReturnProtectionGet**](V2Api.md#setNasVolumeReturnProtectionGet) | **GET** /setNasVolumeReturnProtection | 
[**setNasVolumeReturnProtectionPost**](V2Api.md#setNasVolumeReturnProtectionPost) | **POST** /setNasVolumeReturnProtection | 


<a name="addNasVolumeAccessControlGet"></a>
# **addNasVolumeAccessControlGet**
> AddNasVolumeAccessControlResponse addNasVolumeAccessControlGet(addNasVolumeAccessControlRequest)



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

<a name="changeNasVolumeSnapshotConfigurationGet"></a>
# **changeNasVolumeSnapshotConfigurationGet**
> ChangeNasVolumeSnapshotConfigurationResponse changeNasVolumeSnapshotConfigurationGet(changeNasVolumeSnapshotConfigurationRequest)



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
ChangeNasVolumeSnapshotConfigurationRequest changeNasVolumeSnapshotConfigurationRequest = new ChangeNasVolumeSnapshotConfigurationRequest(); // ChangeNasVolumeSnapshotConfigurationRequest | changeNasVolumeSnapshotConfigurationRequest
try {
	// Handler Successful response
	ApiResponse<ChangeNasVolumeSnapshotConfigurationResponse> result = apiInstance.changeNasVolumeSnapshotConfigurationGet(changeNasVolumeSnapshotConfigurationRequest);
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
 **changeNasVolumeSnapshotConfigurationRequest** | [**ChangeNasVolumeSnapshotConfigurationRequest**](ChangeNasVolumeSnapshotConfigurationRequest.md)| changeNasVolumeSnapshotConfigurationRequest |

### Return type

[**ChangeNasVolumeSnapshotConfigurationResponse**](ChangeNasVolumeSnapshotConfigurationResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="changeNasVolumeSnapshotConfigurationPost"></a>
# **changeNasVolumeSnapshotConfigurationPost**
> ChangeNasVolumeSnapshotConfigurationResponse changeNasVolumeSnapshotConfigurationPost(changeNasVolumeSnapshotConfigurationRequest)



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
ChangeNasVolumeSnapshotConfigurationRequest changeNasVolumeSnapshotConfigurationRequest = new ChangeNasVolumeSnapshotConfigurationRequest(); // ChangeNasVolumeSnapshotConfigurationRequest | changeNasVolumeSnapshotConfigurationRequest
try {
	// Handler Successful response
	ApiResponse<ChangeNasVolumeSnapshotConfigurationResponse> result = apiInstance.changeNasVolumeSnapshotConfigurationPost(changeNasVolumeSnapshotConfigurationRequest);
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
 **changeNasVolumeSnapshotConfigurationRequest** | [**ChangeNasVolumeSnapshotConfigurationRequest**](ChangeNasVolumeSnapshotConfigurationRequest.md)| changeNasVolumeSnapshotConfigurationRequest |

### Return type

[**ChangeNasVolumeSnapshotConfigurationResponse**](ChangeNasVolumeSnapshotConfigurationResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="createNasVolumeInstanceGet"></a>
# **createNasVolumeInstanceGet**
> CreateNasVolumeInstanceResponse createNasVolumeInstanceGet(createNasVolumeInstanceRequest)



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

<a name="createNasVolumeSnapshotGet"></a>
# **createNasVolumeSnapshotGet**
> CreateNasVolumeSnapshotResponse createNasVolumeSnapshotGet(createNasVolumeSnapshotRequest)



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
CreateNasVolumeSnapshotRequest createNasVolumeSnapshotRequest = new CreateNasVolumeSnapshotRequest(); // CreateNasVolumeSnapshotRequest | createNasVolumeSnapshotRequest
try {
	// Handler Successful response
	ApiResponse<CreateNasVolumeSnapshotResponse> result = apiInstance.createNasVolumeSnapshotGet(createNasVolumeSnapshotRequest);
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
 **createNasVolumeSnapshotRequest** | [**CreateNasVolumeSnapshotRequest**](CreateNasVolumeSnapshotRequest.md)| createNasVolumeSnapshotRequest |

### Return type

[**CreateNasVolumeSnapshotResponse**](CreateNasVolumeSnapshotResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="createNasVolumeSnapshotPost"></a>
# **createNasVolumeSnapshotPost**
> CreateNasVolumeSnapshotResponse createNasVolumeSnapshotPost(createNasVolumeSnapshotRequest)



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
CreateNasVolumeSnapshotRequest createNasVolumeSnapshotRequest = new CreateNasVolumeSnapshotRequest(); // CreateNasVolumeSnapshotRequest | createNasVolumeSnapshotRequest
try {
	// Handler Successful response
	ApiResponse<CreateNasVolumeSnapshotResponse> result = apiInstance.createNasVolumeSnapshotPost(createNasVolumeSnapshotRequest);
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
 **createNasVolumeSnapshotRequest** | [**CreateNasVolumeSnapshotRequest**](CreateNasVolumeSnapshotRequest.md)| createNasVolumeSnapshotRequest |

### Return type

[**CreateNasVolumeSnapshotResponse**](CreateNasVolumeSnapshotResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="deleteNasVolumeInstancesGet"></a>
# **deleteNasVolumeInstancesGet**
> DeleteNasVolumeInstancesResponse deleteNasVolumeInstancesGet(deleteNasVolumeInstancesRequest)



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

<a name="deleteNasVolumeSnapshotGet"></a>
# **deleteNasVolumeSnapshotGet**
> DeleteNasVolumeSnapshotResponse deleteNasVolumeSnapshotGet(deleteNasVolumeSnapshotRequest)



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
DeleteNasVolumeSnapshotRequest deleteNasVolumeSnapshotRequest = new DeleteNasVolumeSnapshotRequest(); // DeleteNasVolumeSnapshotRequest | deleteNasVolumeSnapshotRequest
try {
	// Handler Successful response
	ApiResponse<DeleteNasVolumeSnapshotResponse> result = apiInstance.deleteNasVolumeSnapshotGet(deleteNasVolumeSnapshotRequest);
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
 **deleteNasVolumeSnapshotRequest** | [**DeleteNasVolumeSnapshotRequest**](DeleteNasVolumeSnapshotRequest.md)| deleteNasVolumeSnapshotRequest |

### Return type

[**DeleteNasVolumeSnapshotResponse**](DeleteNasVolumeSnapshotResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="deleteNasVolumeSnapshotPost"></a>
# **deleteNasVolumeSnapshotPost**
> DeleteNasVolumeSnapshotResponse deleteNasVolumeSnapshotPost(deleteNasVolumeSnapshotRequest)



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
DeleteNasVolumeSnapshotRequest deleteNasVolumeSnapshotRequest = new DeleteNasVolumeSnapshotRequest(); // DeleteNasVolumeSnapshotRequest | deleteNasVolumeSnapshotRequest
try {
	// Handler Successful response
	ApiResponse<DeleteNasVolumeSnapshotResponse> result = apiInstance.deleteNasVolumeSnapshotPost(deleteNasVolumeSnapshotRequest);
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
 **deleteNasVolumeSnapshotRequest** | [**DeleteNasVolumeSnapshotRequest**](DeleteNasVolumeSnapshotRequest.md)| deleteNasVolumeSnapshotRequest |

### Return type

[**DeleteNasVolumeSnapshotResponse**](DeleteNasVolumeSnapshotResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getNasVolumeAccessControlRuleListGet"></a>
# **getNasVolumeAccessControlRuleListGet**
> GetNasVolumeAccessControlRuleListResponse getNasVolumeAccessControlRuleListGet(getNasVolumeAccessControlRuleListRequest)



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
GetNasVolumeAccessControlRuleListRequest getNasVolumeAccessControlRuleListRequest = new GetNasVolumeAccessControlRuleListRequest(); // GetNasVolumeAccessControlRuleListRequest | getNasVolumeAccessControlRuleListRequest
try {
	// Handler Successful response
	ApiResponse<GetNasVolumeAccessControlRuleListResponse> result = apiInstance.getNasVolumeAccessControlRuleListGet(getNasVolumeAccessControlRuleListRequest);
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
 **getNasVolumeAccessControlRuleListRequest** | [**GetNasVolumeAccessControlRuleListRequest**](GetNasVolumeAccessControlRuleListRequest.md)| getNasVolumeAccessControlRuleListRequest |

### Return type

[**GetNasVolumeAccessControlRuleListResponse**](GetNasVolumeAccessControlRuleListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getNasVolumeAccessControlRuleListPost"></a>
# **getNasVolumeAccessControlRuleListPost**
> GetNasVolumeAccessControlRuleListResponse getNasVolumeAccessControlRuleListPost(getNasVolumeAccessControlRuleListRequest)



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
GetNasVolumeAccessControlRuleListRequest getNasVolumeAccessControlRuleListRequest = new GetNasVolumeAccessControlRuleListRequest(); // GetNasVolumeAccessControlRuleListRequest | getNasVolumeAccessControlRuleListRequest
try {
	// Handler Successful response
	ApiResponse<GetNasVolumeAccessControlRuleListResponse> result = apiInstance.getNasVolumeAccessControlRuleListPost(getNasVolumeAccessControlRuleListRequest);
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
 **getNasVolumeAccessControlRuleListRequest** | [**GetNasVolumeAccessControlRuleListRequest**](GetNasVolumeAccessControlRuleListRequest.md)| getNasVolumeAccessControlRuleListRequest |

### Return type

[**GetNasVolumeAccessControlRuleListResponse**](GetNasVolumeAccessControlRuleListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getNasVolumeInstanceDetailGet"></a>
# **getNasVolumeInstanceDetailGet**
> GetNasVolumeInstanceDetailResponse getNasVolumeInstanceDetailGet(getNasVolumeInstanceDetailRequest)



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

<a name="getNasVolumeInstanceRatingListGet"></a>
# **getNasVolumeInstanceRatingListGet**
> GetNasVolumeInstanceRatingListResponse getNasVolumeInstanceRatingListGet(getNasVolumeInstanceRatingListRequest)



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
GetNasVolumeInstanceRatingListRequest getNasVolumeInstanceRatingListRequest = new GetNasVolumeInstanceRatingListRequest(); // GetNasVolumeInstanceRatingListRequest | getNasVolumeInstanceRatingListRequest
try {
	// Handler Successful response
	ApiResponse<GetNasVolumeInstanceRatingListResponse> result = apiInstance.getNasVolumeInstanceRatingListGet(getNasVolumeInstanceRatingListRequest);
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
 **getNasVolumeInstanceRatingListRequest** | [**GetNasVolumeInstanceRatingListRequest**](GetNasVolumeInstanceRatingListRequest.md)| getNasVolumeInstanceRatingListRequest |

### Return type

[**GetNasVolumeInstanceRatingListResponse**](GetNasVolumeInstanceRatingListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getNasVolumeInstanceRatingListPost"></a>
# **getNasVolumeInstanceRatingListPost**
> GetNasVolumeInstanceRatingListResponse getNasVolumeInstanceRatingListPost(getNasVolumeInstanceRatingListRequest)



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
GetNasVolumeInstanceRatingListRequest getNasVolumeInstanceRatingListRequest = new GetNasVolumeInstanceRatingListRequest(); // GetNasVolumeInstanceRatingListRequest | getNasVolumeInstanceRatingListRequest
try {
	// Handler Successful response
	ApiResponse<GetNasVolumeInstanceRatingListResponse> result = apiInstance.getNasVolumeInstanceRatingListPost(getNasVolumeInstanceRatingListRequest);
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
 **getNasVolumeInstanceRatingListRequest** | [**GetNasVolumeInstanceRatingListRequest**](GetNasVolumeInstanceRatingListRequest.md)| getNasVolumeInstanceRatingListRequest |

### Return type

[**GetNasVolumeInstanceRatingListResponse**](GetNasVolumeInstanceRatingListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getNasVolumeSnapshotConfigurationHistoryListGet"></a>
# **getNasVolumeSnapshotConfigurationHistoryListGet**
> GetNasVolumeSnapshotConfigurationHistoryListResponse getNasVolumeSnapshotConfigurationHistoryListGet(getNasVolumeSnapshotConfigurationHistoryListRequest)



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
GetNasVolumeSnapshotConfigurationHistoryListRequest getNasVolumeSnapshotConfigurationHistoryListRequest = new GetNasVolumeSnapshotConfigurationHistoryListRequest(); // GetNasVolumeSnapshotConfigurationHistoryListRequest | getNasVolumeSnapshotConfigurationHistoryListRequest
try {
	// Handler Successful response
	ApiResponse<GetNasVolumeSnapshotConfigurationHistoryListResponse> result = apiInstance.getNasVolumeSnapshotConfigurationHistoryListGet(getNasVolumeSnapshotConfigurationHistoryListRequest);
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
 **getNasVolumeSnapshotConfigurationHistoryListRequest** | [**GetNasVolumeSnapshotConfigurationHistoryListRequest**](GetNasVolumeSnapshotConfigurationHistoryListRequest.md)| getNasVolumeSnapshotConfigurationHistoryListRequest |

### Return type

[**GetNasVolumeSnapshotConfigurationHistoryListResponse**](GetNasVolumeSnapshotConfigurationHistoryListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getNasVolumeSnapshotConfigurationHistoryListPost"></a>
# **getNasVolumeSnapshotConfigurationHistoryListPost**
> GetNasVolumeSnapshotConfigurationHistoryListResponse getNasVolumeSnapshotConfigurationHistoryListPost(getNasVolumeSnapshotConfigurationHistoryListRequest)



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
GetNasVolumeSnapshotConfigurationHistoryListRequest getNasVolumeSnapshotConfigurationHistoryListRequest = new GetNasVolumeSnapshotConfigurationHistoryListRequest(); // GetNasVolumeSnapshotConfigurationHistoryListRequest | getNasVolumeSnapshotConfigurationHistoryListRequest
try {
	// Handler Successful response
	ApiResponse<GetNasVolumeSnapshotConfigurationHistoryListResponse> result = apiInstance.getNasVolumeSnapshotConfigurationHistoryListPost(getNasVolumeSnapshotConfigurationHistoryListRequest);
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
 **getNasVolumeSnapshotConfigurationHistoryListRequest** | [**GetNasVolumeSnapshotConfigurationHistoryListRequest**](GetNasVolumeSnapshotConfigurationHistoryListRequest.md)| getNasVolumeSnapshotConfigurationHistoryListRequest |

### Return type

[**GetNasVolumeSnapshotConfigurationHistoryListResponse**](GetNasVolumeSnapshotConfigurationHistoryListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getNasVolumeSnapshotListGet"></a>
# **getNasVolumeSnapshotListGet**
> GetNasVolumeSnapshotListResponse getNasVolumeSnapshotListGet(getNasVolumeSnapshotListRequest)



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
GetNasVolumeSnapshotListRequest getNasVolumeSnapshotListRequest = new GetNasVolumeSnapshotListRequest(); // GetNasVolumeSnapshotListRequest | getNasVolumeSnapshotListRequest
try {
	// Handler Successful response
	ApiResponse<GetNasVolumeSnapshotListResponse> result = apiInstance.getNasVolumeSnapshotListGet(getNasVolumeSnapshotListRequest);
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
 **getNasVolumeSnapshotListRequest** | [**GetNasVolumeSnapshotListRequest**](GetNasVolumeSnapshotListRequest.md)| getNasVolumeSnapshotListRequest |

### Return type

[**GetNasVolumeSnapshotListResponse**](GetNasVolumeSnapshotListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getNasVolumeSnapshotListPost"></a>
# **getNasVolumeSnapshotListPost**
> GetNasVolumeSnapshotListResponse getNasVolumeSnapshotListPost(getNasVolumeSnapshotListRequest)



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
GetNasVolumeSnapshotListRequest getNasVolumeSnapshotListRequest = new GetNasVolumeSnapshotListRequest(); // GetNasVolumeSnapshotListRequest | getNasVolumeSnapshotListRequest
try {
	// Handler Successful response
	ApiResponse<GetNasVolumeSnapshotListResponse> result = apiInstance.getNasVolumeSnapshotListPost(getNasVolumeSnapshotListRequest);
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
 **getNasVolumeSnapshotListRequest** | [**GetNasVolumeSnapshotListRequest**](GetNasVolumeSnapshotListRequest.md)| getNasVolumeSnapshotListRequest |

### Return type

[**GetNasVolumeSnapshotListResponse**](GetNasVolumeSnapshotListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="removeNasVolumeAccessControlGet"></a>
# **removeNasVolumeAccessControlGet**
> RemoveNasVolumeAccessControlResponse removeNasVolumeAccessControlGet(removeNasVolumeAccessControlRequest)



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

<a name="restoreNasVolumeWithSnapshotGet"></a>
# **restoreNasVolumeWithSnapshotGet**
> RestoreNasVolumeWithSnapshotResponse restoreNasVolumeWithSnapshotGet(restoreNasVolumeWithSnapshotRequest)



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
RestoreNasVolumeWithSnapshotRequest restoreNasVolumeWithSnapshotRequest = new RestoreNasVolumeWithSnapshotRequest(); // RestoreNasVolumeWithSnapshotRequest | restoreNasVolumeWithSnapshotRequest
try {
	// Handler Successful response
	ApiResponse<RestoreNasVolumeWithSnapshotResponse> result = apiInstance.restoreNasVolumeWithSnapshotGet(restoreNasVolumeWithSnapshotRequest);
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
 **restoreNasVolumeWithSnapshotRequest** | [**RestoreNasVolumeWithSnapshotRequest**](RestoreNasVolumeWithSnapshotRequest.md)| restoreNasVolumeWithSnapshotRequest |

### Return type

[**RestoreNasVolumeWithSnapshotResponse**](RestoreNasVolumeWithSnapshotResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="restoreNasVolumeWithSnapshotPost"></a>
# **restoreNasVolumeWithSnapshotPost**
> RestoreNasVolumeWithSnapshotResponse restoreNasVolumeWithSnapshotPost(restoreNasVolumeWithSnapshotRequest)



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
RestoreNasVolumeWithSnapshotRequest restoreNasVolumeWithSnapshotRequest = new RestoreNasVolumeWithSnapshotRequest(); // RestoreNasVolumeWithSnapshotRequest | restoreNasVolumeWithSnapshotRequest
try {
	// Handler Successful response
	ApiResponse<RestoreNasVolumeWithSnapshotResponse> result = apiInstance.restoreNasVolumeWithSnapshotPost(restoreNasVolumeWithSnapshotRequest);
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
 **restoreNasVolumeWithSnapshotRequest** | [**RestoreNasVolumeWithSnapshotRequest**](RestoreNasVolumeWithSnapshotRequest.md)| restoreNasVolumeWithSnapshotRequest |

### Return type

[**RestoreNasVolumeWithSnapshotResponse**](RestoreNasVolumeWithSnapshotResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="setNasVolumeAccessControlGet"></a>
# **setNasVolumeAccessControlGet**
> SetNasVolumeAccessControlResponse setNasVolumeAccessControlGet(setNasVolumeAccessControlRequest)



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

<a name="setNasVolumeReturnProtectionGet"></a>
# **setNasVolumeReturnProtectionGet**
> SetNasVolumeReturnProtectionResponse setNasVolumeReturnProtectionGet(setNasVolumeReturnProtectionRequest)



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
SetNasVolumeReturnProtectionRequest setNasVolumeReturnProtectionRequest = new SetNasVolumeReturnProtectionRequest(); // SetNasVolumeReturnProtectionRequest | setNasVolumeReturnProtectionRequest
try {
	// Handler Successful response
	ApiResponse<SetNasVolumeReturnProtectionResponse> result = apiInstance.setNasVolumeReturnProtectionGet(setNasVolumeReturnProtectionRequest);
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
 **setNasVolumeReturnProtectionRequest** | [**SetNasVolumeReturnProtectionRequest**](SetNasVolumeReturnProtectionRequest.md)| setNasVolumeReturnProtectionRequest |

### Return type

[**SetNasVolumeReturnProtectionResponse**](SetNasVolumeReturnProtectionResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="setNasVolumeReturnProtectionPost"></a>
# **setNasVolumeReturnProtectionPost**
> SetNasVolumeReturnProtectionResponse setNasVolumeReturnProtectionPost(setNasVolumeReturnProtectionRequest)



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
SetNasVolumeReturnProtectionRequest setNasVolumeReturnProtectionRequest = new SetNasVolumeReturnProtectionRequest(); // SetNasVolumeReturnProtectionRequest | setNasVolumeReturnProtectionRequest
try {
	// Handler Successful response
	ApiResponse<SetNasVolumeReturnProtectionResponse> result = apiInstance.setNasVolumeReturnProtectionPost(setNasVolumeReturnProtectionRequest);
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
 **setNasVolumeReturnProtectionRequest** | [**SetNasVolumeReturnProtectionRequest**](SetNasVolumeReturnProtectionRequest.md)| setNasVolumeReturnProtectionRequest |

### Return type

[**SetNasVolumeReturnProtectionResponse**](SetNasVolumeReturnProtectionResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

