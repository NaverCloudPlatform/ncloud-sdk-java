# V2Api

All URIs are relative to *https://ncloud.apigw.ntruss.com/clouddb/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCloudDBInstanceGet**](V2Api.md#createCloudDBInstanceGet) | **GET** /createCloudDBInstance | 
[**createCloudDBInstancePost**](V2Api.md#createCloudDBInstancePost) | **POST** /createCloudDBInstance | 
[**deleteCloudDBServerInstanceGet**](V2Api.md#deleteCloudDBServerInstanceGet) | **GET** /deleteCloudDBServerInstance | 
[**deleteCloudDBServerInstancePost**](V2Api.md#deleteCloudDBServerInstancePost) | **POST** /deleteCloudDBServerInstance | 
[**downloadDmsFileGet**](V2Api.md#downloadDmsFileGet) | **GET** /downloadDmsFile | 
[**downloadDmsFilePost**](V2Api.md#downloadDmsFilePost) | **POST** /downloadDmsFile | 
[**flushCloudDBInstanceGet**](V2Api.md#flushCloudDBInstanceGet) | **GET** /flushCloudDBInstance | 
[**flushCloudDBInstancePost**](V2Api.md#flushCloudDBInstancePost) | **POST** /flushCloudDBInstance | 
[**getBackupListGet**](V2Api.md#getBackupListGet) | **GET** /getBackupList | 
[**getBackupListPost**](V2Api.md#getBackupListPost) | **POST** /getBackupList | 
[**getCloudDBConfigGroupListGet**](V2Api.md#getCloudDBConfigGroupListGet) | **GET** /getCloudDBConfigGroupList | 
[**getCloudDBConfigGroupListPost**](V2Api.md#getCloudDBConfigGroupListPost) | **POST** /getCloudDBConfigGroupList | 
[**getCloudDBImageProductListGet**](V2Api.md#getCloudDBImageProductListGet) | **GET** /getCloudDBImageProductList | 
[**getCloudDBImageProductListPost**](V2Api.md#getCloudDBImageProductListPost) | **POST** /getCloudDBImageProductList | 
[**getCloudDBInstanceListGet**](V2Api.md#getCloudDBInstanceListGet) | **GET** /getCloudDBInstanceList | 
[**getCloudDBInstanceListPost**](V2Api.md#getCloudDBInstanceListPost) | **POST** /getCloudDBInstanceList | 
[**getCloudDBProductListGet**](V2Api.md#getCloudDBProductListGet) | **GET** /getCloudDBProductList | 
[**getCloudDBProductListPost**](V2Api.md#getCloudDBProductListPost) | **POST** /getCloudDBProductList | 
[**getDmsOperationGet**](V2Api.md#getDmsOperationGet) | **GET** /getDmsOperation | 
[**getDmsOperationPost**](V2Api.md#getDmsOperationPost) | **POST** /getDmsOperation | 
[**getObjectStorageBackupListGet**](V2Api.md#getObjectStorageBackupListGet) | **GET** /getObjectStorageBackupList | 
[**getObjectStorageBackupListPost**](V2Api.md#getObjectStorageBackupListPost) | **POST** /getObjectStorageBackupList | 
[**rebootCloudDBServerInstanceGet**](V2Api.md#rebootCloudDBServerInstanceGet) | **GET** /rebootCloudDBServerInstance | 
[**rebootCloudDBServerInstancePost**](V2Api.md#rebootCloudDBServerInstancePost) | **POST** /rebootCloudDBServerInstance | 
[**restoreDmsDatabaseGet**](V2Api.md#restoreDmsDatabaseGet) | **GET** /restoreDmsDatabase | 
[**restoreDmsDatabasePost**](V2Api.md#restoreDmsDatabasePost) | **POST** /restoreDmsDatabase | 
[**restoreDmsTransactionLogGet**](V2Api.md#restoreDmsTransactionLogGet) | **GET** /restoreDmsTransactionLog | 
[**restoreDmsTransactionLogPost**](V2Api.md#restoreDmsTransactionLogPost) | **POST** /restoreDmsTransactionLog | 
[**setObjectStorageInfoGet**](V2Api.md#setObjectStorageInfoGet) | **GET** /setObjectStorageInfo | 
[**setObjectStorageInfoPost**](V2Api.md#setObjectStorageInfoPost) | **POST** /setObjectStorageInfo | 
[**uploadDmsFileGet**](V2Api.md#uploadDmsFileGet) | **GET** /uploadDmsFile | 
[**uploadDmsFilePost**](V2Api.md#uploadDmsFilePost) | **POST** /uploadDmsFile | 


<a name="createCloudDBInstanceGet"></a>
# **createCloudDBInstanceGet**
> CreateCloudDBInstanceResponse createCloudDBInstanceGet(createCloudDBInstanceRequest)



CloudDB인스턴스생성

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
CreateCloudDBInstanceRequest createCloudDBInstanceRequest = new CreateCloudDBInstanceRequest(); // CreateCloudDBInstanceRequest | createCloudDBInstanceRequest
try {
	// Handler Successful response
	ApiResponse<CreateCloudDBInstanceResponse> result = apiInstance.createCloudDBInstanceGet(createCloudDBInstanceRequest);
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
 **createCloudDBInstanceRequest** | [**CreateCloudDBInstanceRequest**](CreateCloudDBInstanceRequest.md)| createCloudDBInstanceRequest |

### Return type

[**CreateCloudDBInstanceResponse**](CreateCloudDBInstanceResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="createCloudDBInstancePost"></a>
# **createCloudDBInstancePost**
> CreateCloudDBInstanceResponse createCloudDBInstancePost(createCloudDBInstanceRequest)



CloudDB인스턴스생성

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
CreateCloudDBInstanceRequest createCloudDBInstanceRequest = new CreateCloudDBInstanceRequest(); // CreateCloudDBInstanceRequest | createCloudDBInstanceRequest
try {
	// Handler Successful response
	ApiResponse<CreateCloudDBInstanceResponse> result = apiInstance.createCloudDBInstancePost(createCloudDBInstanceRequest);
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
 **createCloudDBInstanceRequest** | [**CreateCloudDBInstanceRequest**](CreateCloudDBInstanceRequest.md)| createCloudDBInstanceRequest |

### Return type

[**CreateCloudDBInstanceResponse**](CreateCloudDBInstanceResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="deleteCloudDBServerInstanceGet"></a>
# **deleteCloudDBServerInstanceGet**
> DeleteCloudDBServerInstanceResponse deleteCloudDBServerInstanceGet(deleteCloudDBServerInstanceRequest)



CloudDB서버인스턴스삭제

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
DeleteCloudDBServerInstanceRequest deleteCloudDBServerInstanceRequest = new DeleteCloudDBServerInstanceRequest(); // DeleteCloudDBServerInstanceRequest | deleteCloudDBServerInstanceRequest
try {
	// Handler Successful response
	ApiResponse<DeleteCloudDBServerInstanceResponse> result = apiInstance.deleteCloudDBServerInstanceGet(deleteCloudDBServerInstanceRequest);
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
 **deleteCloudDBServerInstanceRequest** | [**DeleteCloudDBServerInstanceRequest**](DeleteCloudDBServerInstanceRequest.md)| deleteCloudDBServerInstanceRequest |

### Return type

[**DeleteCloudDBServerInstanceResponse**](DeleteCloudDBServerInstanceResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="deleteCloudDBServerInstancePost"></a>
# **deleteCloudDBServerInstancePost**
> DeleteCloudDBServerInstanceResponse deleteCloudDBServerInstancePost(deleteCloudDBServerInstanceRequest)



CloudDB서버인스턴스삭제

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
DeleteCloudDBServerInstanceRequest deleteCloudDBServerInstanceRequest = new DeleteCloudDBServerInstanceRequest(); // DeleteCloudDBServerInstanceRequest | deleteCloudDBServerInstanceRequest
try {
	// Handler Successful response
	ApiResponse<DeleteCloudDBServerInstanceResponse> result = apiInstance.deleteCloudDBServerInstancePost(deleteCloudDBServerInstanceRequest);
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
 **deleteCloudDBServerInstanceRequest** | [**DeleteCloudDBServerInstanceRequest**](DeleteCloudDBServerInstanceRequest.md)| deleteCloudDBServerInstanceRequest |

### Return type

[**DeleteCloudDBServerInstanceResponse**](DeleteCloudDBServerInstanceResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="downloadDmsFileGet"></a>
# **downloadDmsFileGet**
> DownloadDmsFileResponse downloadDmsFileGet(downloadDmsFileRequest)



DMS파일다운로드

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
DownloadDmsFileRequest downloadDmsFileRequest = new DownloadDmsFileRequest(); // DownloadDmsFileRequest | downloadDmsFileRequest
try {
	// Handler Successful response
	ApiResponse<DownloadDmsFileResponse> result = apiInstance.downloadDmsFileGet(downloadDmsFileRequest);
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
 **downloadDmsFileRequest** | [**DownloadDmsFileRequest**](DownloadDmsFileRequest.md)| downloadDmsFileRequest |

### Return type

[**DownloadDmsFileResponse**](DownloadDmsFileResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="downloadDmsFilePost"></a>
# **downloadDmsFilePost**
> DownloadDmsFileResponse downloadDmsFilePost(downloadDmsFileRequest)



DMS파일다운로드

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
DownloadDmsFileRequest downloadDmsFileRequest = new DownloadDmsFileRequest(); // DownloadDmsFileRequest | downloadDmsFileRequest
try {
	// Handler Successful response
	ApiResponse<DownloadDmsFileResponse> result = apiInstance.downloadDmsFilePost(downloadDmsFileRequest);
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
 **downloadDmsFileRequest** | [**DownloadDmsFileRequest**](DownloadDmsFileRequest.md)| downloadDmsFileRequest |

### Return type

[**DownloadDmsFileResponse**](DownloadDmsFileResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="flushCloudDBInstanceGet"></a>
# **flushCloudDBInstanceGet**
> FlushCloudDBInstanceResponse flushCloudDBInstanceGet(flushCloudDBInstanceRequest)



CloudDB Flush

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
FlushCloudDBInstanceRequest flushCloudDBInstanceRequest = new FlushCloudDBInstanceRequest(); // FlushCloudDBInstanceRequest | flushCloudDBInstanceRequest
try {
	// Handler Successful response
	ApiResponse<FlushCloudDBInstanceResponse> result = apiInstance.flushCloudDBInstanceGet(flushCloudDBInstanceRequest);
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
 **flushCloudDBInstanceRequest** | [**FlushCloudDBInstanceRequest**](FlushCloudDBInstanceRequest.md)| flushCloudDBInstanceRequest |

### Return type

[**FlushCloudDBInstanceResponse**](FlushCloudDBInstanceResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="flushCloudDBInstancePost"></a>
# **flushCloudDBInstancePost**
> FlushCloudDBInstanceResponse flushCloudDBInstancePost(flushCloudDBInstanceRequest)



CloudDB Flush

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
FlushCloudDBInstanceRequest flushCloudDBInstanceRequest = new FlushCloudDBInstanceRequest(); // FlushCloudDBInstanceRequest | flushCloudDBInstanceRequest
try {
	// Handler Successful response
	ApiResponse<FlushCloudDBInstanceResponse> result = apiInstance.flushCloudDBInstancePost(flushCloudDBInstanceRequest);
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
 **flushCloudDBInstanceRequest** | [**FlushCloudDBInstanceRequest**](FlushCloudDBInstanceRequest.md)| flushCloudDBInstanceRequest |

### Return type

[**FlushCloudDBInstanceResponse**](FlushCloudDBInstanceResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getBackupListGet"></a>
# **getBackupListGet**
> GetBackupListResponse getBackupListGet(getBackupListRequest)



백업리스트조회

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetBackupListRequest getBackupListRequest = new GetBackupListRequest(); // GetBackupListRequest | getBackupListRequest
try {
	// Handler Successful response
	ApiResponse<GetBackupListResponse> result = apiInstance.getBackupListGet(getBackupListRequest);
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
 **getBackupListRequest** | [**GetBackupListRequest**](GetBackupListRequest.md)| getBackupListRequest |

### Return type

[**GetBackupListResponse**](GetBackupListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getBackupListPost"></a>
# **getBackupListPost**
> GetBackupListResponse getBackupListPost(getBackupListRequest)



백업리스트조회

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetBackupListRequest getBackupListRequest = new GetBackupListRequest(); // GetBackupListRequest | getBackupListRequest
try {
	// Handler Successful response
	ApiResponse<GetBackupListResponse> result = apiInstance.getBackupListPost(getBackupListRequest);
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
 **getBackupListRequest** | [**GetBackupListRequest**](GetBackupListRequest.md)| getBackupListRequest |

### Return type

[**GetBackupListResponse**](GetBackupListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getCloudDBConfigGroupListGet"></a>
# **getCloudDBConfigGroupListGet**
> GetCloudDBConfigGroupListResponse getCloudDBConfigGroupListGet(getCloudDBConfigGroupListRequest)



CloudDB설정그룹리스트조회

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetCloudDBConfigGroupListRequest getCloudDBConfigGroupListRequest = new GetCloudDBConfigGroupListRequest(); // GetCloudDBConfigGroupListRequest | getCloudDBConfigGroupListRequest
try {
	// Handler Successful response
	ApiResponse<GetCloudDBConfigGroupListResponse> result = apiInstance.getCloudDBConfigGroupListGet(getCloudDBConfigGroupListRequest);
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
 **getCloudDBConfigGroupListRequest** | [**GetCloudDBConfigGroupListRequest**](GetCloudDBConfigGroupListRequest.md)| getCloudDBConfigGroupListRequest |

### Return type

[**GetCloudDBConfigGroupListResponse**](GetCloudDBConfigGroupListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getCloudDBConfigGroupListPost"></a>
# **getCloudDBConfigGroupListPost**
> GetCloudDBConfigGroupListResponse getCloudDBConfigGroupListPost(getCloudDBConfigGroupListRequest)



CloudDB설정그룹리스트조회

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetCloudDBConfigGroupListRequest getCloudDBConfigGroupListRequest = new GetCloudDBConfigGroupListRequest(); // GetCloudDBConfigGroupListRequest | getCloudDBConfigGroupListRequest
try {
	// Handler Successful response
	ApiResponse<GetCloudDBConfigGroupListResponse> result = apiInstance.getCloudDBConfigGroupListPost(getCloudDBConfigGroupListRequest);
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
 **getCloudDBConfigGroupListRequest** | [**GetCloudDBConfigGroupListRequest**](GetCloudDBConfigGroupListRequest.md)| getCloudDBConfigGroupListRequest |

### Return type

[**GetCloudDBConfigGroupListResponse**](GetCloudDBConfigGroupListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getCloudDBImageProductListGet"></a>
# **getCloudDBImageProductListGet**
> GetCloudDBImageProductListResponse getCloudDBImageProductListGet(getCloudDBImageProductListRequest)



CloudDB이미지상품리스트조회

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetCloudDBImageProductListRequest getCloudDBImageProductListRequest = new GetCloudDBImageProductListRequest(); // GetCloudDBImageProductListRequest | getCloudDBImageProductListRequest
try {
	// Handler Successful response
	ApiResponse<GetCloudDBImageProductListResponse> result = apiInstance.getCloudDBImageProductListGet(getCloudDBImageProductListRequest);
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
 **getCloudDBImageProductListRequest** | [**GetCloudDBImageProductListRequest**](GetCloudDBImageProductListRequest.md)| getCloudDBImageProductListRequest |

### Return type

[**GetCloudDBImageProductListResponse**](GetCloudDBImageProductListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getCloudDBImageProductListPost"></a>
# **getCloudDBImageProductListPost**
> GetCloudDBImageProductListResponse getCloudDBImageProductListPost(getCloudDBImageProductListRequest)



CloudDB이미지상품리스트

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetCloudDBImageProductListRequest getCloudDBImageProductListRequest = new GetCloudDBImageProductListRequest(); // GetCloudDBImageProductListRequest | getCloudDBImageProductListRequest
try {
	// Handler Successful response
	ApiResponse<GetCloudDBImageProductListResponse> result = apiInstance.getCloudDBImageProductListPost(getCloudDBImageProductListRequest);
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
 **getCloudDBImageProductListRequest** | [**GetCloudDBImageProductListRequest**](GetCloudDBImageProductListRequest.md)| getCloudDBImageProductListRequest |

### Return type

[**GetCloudDBImageProductListResponse**](GetCloudDBImageProductListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getCloudDBInstanceListGet"></a>
# **getCloudDBInstanceListGet**
> GetCloudDBInstanceListResponse getCloudDBInstanceListGet(getCloudDBInstanceListRequest)



CloudDB인스턴스리스트조회

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetCloudDBInstanceListRequest getCloudDBInstanceListRequest = new GetCloudDBInstanceListRequest(); // GetCloudDBInstanceListRequest | getCloudDBInstanceListRequest
try {
	// Handler Successful response
	ApiResponse<GetCloudDBInstanceListResponse> result = apiInstance.getCloudDBInstanceListGet(getCloudDBInstanceListRequest);
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
 **getCloudDBInstanceListRequest** | [**GetCloudDBInstanceListRequest**](GetCloudDBInstanceListRequest.md)| getCloudDBInstanceListRequest |

### Return type

[**GetCloudDBInstanceListResponse**](GetCloudDBInstanceListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getCloudDBInstanceListPost"></a>
# **getCloudDBInstanceListPost**
> GetCloudDBInstanceListResponse getCloudDBInstanceListPost(getCloudDBInstanceListRequest)



CloudDB인스턴스리스트조회

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetCloudDBInstanceListRequest getCloudDBInstanceListRequest = new GetCloudDBInstanceListRequest(); // GetCloudDBInstanceListRequest | getCloudDBInstanceListRequest
try {
	// Handler Successful response
	ApiResponse<GetCloudDBInstanceListResponse> result = apiInstance.getCloudDBInstanceListPost(getCloudDBInstanceListRequest);
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
 **getCloudDBInstanceListRequest** | [**GetCloudDBInstanceListRequest**](GetCloudDBInstanceListRequest.md)| getCloudDBInstanceListRequest |

### Return type

[**GetCloudDBInstanceListResponse**](GetCloudDBInstanceListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getCloudDBProductListGet"></a>
# **getCloudDBProductListGet**
> GetCloudDBProductListResponse getCloudDBProductListGet(getCloudDBProductListRequest)



CloudDB상품리스트조회

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetCloudDBProductListRequest getCloudDBProductListRequest = new GetCloudDBProductListRequest(); // GetCloudDBProductListRequest | getCloudDBProductListRequest
try {
	// Handler Successful response
	ApiResponse<GetCloudDBProductListResponse> result = apiInstance.getCloudDBProductListGet(getCloudDBProductListRequest);
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
 **getCloudDBProductListRequest** | [**GetCloudDBProductListRequest**](GetCloudDBProductListRequest.md)| getCloudDBProductListRequest |

### Return type

[**GetCloudDBProductListResponse**](GetCloudDBProductListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getCloudDBProductListPost"></a>
# **getCloudDBProductListPost**
> GetCloudDBProductListResponse getCloudDBProductListPost(getCloudDBProductListRequest)



CloudDB상품리스트조회

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetCloudDBProductListRequest getCloudDBProductListRequest = new GetCloudDBProductListRequest(); // GetCloudDBProductListRequest | getCloudDBProductListRequest
try {
	// Handler Successful response
	ApiResponse<GetCloudDBProductListResponse> result = apiInstance.getCloudDBProductListPost(getCloudDBProductListRequest);
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
 **getCloudDBProductListRequest** | [**GetCloudDBProductListRequest**](GetCloudDBProductListRequest.md)| getCloudDBProductListRequest |

### Return type

[**GetCloudDBProductListResponse**](GetCloudDBProductListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getDmsOperationGet"></a>
# **getDmsOperationGet**
> GetDmsOperationResponse getDmsOperationGet(getDmsOperationRequest)



DMS상태조회

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetDmsOperationRequest getDmsOperationRequest = new GetDmsOperationRequest(); // GetDmsOperationRequest | getDmsOperationRequest
try {
	// Handler Successful response
	ApiResponse<GetDmsOperationResponse> result = apiInstance.getDmsOperationGet(getDmsOperationRequest);
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
 **getDmsOperationRequest** | [**GetDmsOperationRequest**](GetDmsOperationRequest.md)| getDmsOperationRequest |

### Return type

[**GetDmsOperationResponse**](GetDmsOperationResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getDmsOperationPost"></a>
# **getDmsOperationPost**
> GetDmsOperationResponse getDmsOperationPost(getDmsOperationRequest)



DMS상태조회

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetDmsOperationRequest getDmsOperationRequest = new GetDmsOperationRequest(); // GetDmsOperationRequest | getDmsOperationRequest
try {
	// Handler Successful response
	ApiResponse<GetDmsOperationResponse> result = apiInstance.getDmsOperationPost(getDmsOperationRequest);
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
 **getDmsOperationRequest** | [**GetDmsOperationRequest**](GetDmsOperationRequest.md)| getDmsOperationRequest |

### Return type

[**GetDmsOperationResponse**](GetDmsOperationResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getObjectStorageBackupListGet"></a>
# **getObjectStorageBackupListGet**
> GetObjectStorageBackupListResponse getObjectStorageBackupListGet(getObjectStorageBackupListRequest)



오브젝트스토리지백업리스트조회

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetObjectStorageBackupListRequest getObjectStorageBackupListRequest = new GetObjectStorageBackupListRequest(); // GetObjectStorageBackupListRequest | getObjectStorageBackupListRequest
try {
	// Handler Successful response
	ApiResponse<GetObjectStorageBackupListResponse> result = apiInstance.getObjectStorageBackupListGet(getObjectStorageBackupListRequest);
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
 **getObjectStorageBackupListRequest** | [**GetObjectStorageBackupListRequest**](GetObjectStorageBackupListRequest.md)| getObjectStorageBackupListRequest |

### Return type

[**GetObjectStorageBackupListResponse**](GetObjectStorageBackupListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getObjectStorageBackupListPost"></a>
# **getObjectStorageBackupListPost**
> GetObjectStorageBackupListResponse getObjectStorageBackupListPost(getObjectStorageBackupListRequest)



오브젝트스토리지백업리스트조회

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetObjectStorageBackupListRequest getObjectStorageBackupListRequest = new GetObjectStorageBackupListRequest(); // GetObjectStorageBackupListRequest | getObjectStorageBackupListRequest
try {
	// Handler Successful response
	ApiResponse<GetObjectStorageBackupListResponse> result = apiInstance.getObjectStorageBackupListPost(getObjectStorageBackupListRequest);
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
 **getObjectStorageBackupListRequest** | [**GetObjectStorageBackupListRequest**](GetObjectStorageBackupListRequest.md)| getObjectStorageBackupListRequest |

### Return type

[**GetObjectStorageBackupListResponse**](GetObjectStorageBackupListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="rebootCloudDBServerInstanceGet"></a>
# **rebootCloudDBServerInstanceGet**
> RebootCloudDBServerInstanceResponse rebootCloudDBServerInstanceGet(rebootCloudDBServerInstanceRequest)



CloudDB서버인스턴스재부팅

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
RebootCloudDBServerInstanceRequest rebootCloudDBServerInstanceRequest = new RebootCloudDBServerInstanceRequest(); // RebootCloudDBServerInstanceRequest | rebootCloudDBServerInstanceRequest
try {
	// Handler Successful response
	ApiResponse<RebootCloudDBServerInstanceResponse> result = apiInstance.rebootCloudDBServerInstanceGet(rebootCloudDBServerInstanceRequest);
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
 **rebootCloudDBServerInstanceRequest** | [**RebootCloudDBServerInstanceRequest**](RebootCloudDBServerInstanceRequest.md)| rebootCloudDBServerInstanceRequest |

### Return type

[**RebootCloudDBServerInstanceResponse**](RebootCloudDBServerInstanceResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="rebootCloudDBServerInstancePost"></a>
# **rebootCloudDBServerInstancePost**
> RebootCloudDBServerInstanceResponse rebootCloudDBServerInstancePost(rebootCloudDBServerInstanceRequest)



CloudDB서버인스턴스재부팅

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
RebootCloudDBServerInstanceRequest rebootCloudDBServerInstanceRequest = new RebootCloudDBServerInstanceRequest(); // RebootCloudDBServerInstanceRequest | rebootCloudDBServerInstanceRequest
try {
	// Handler Successful response
	ApiResponse<RebootCloudDBServerInstanceResponse> result = apiInstance.rebootCloudDBServerInstancePost(rebootCloudDBServerInstanceRequest);
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
 **rebootCloudDBServerInstanceRequest** | [**RebootCloudDBServerInstanceRequest**](RebootCloudDBServerInstanceRequest.md)| rebootCloudDBServerInstanceRequest |

### Return type

[**RebootCloudDBServerInstanceResponse**](RebootCloudDBServerInstanceResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="restoreDmsDatabaseGet"></a>
# **restoreDmsDatabaseGet**
> RestoreDmsDatabaseResponse restoreDmsDatabaseGet(restoreDmsDatabaseRequest)



DMS데이터베이스복구

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
RestoreDmsDatabaseRequest restoreDmsDatabaseRequest = new RestoreDmsDatabaseRequest(); // RestoreDmsDatabaseRequest | restoreDmsDatabaseRequest
try {
	// Handler Successful response
	ApiResponse<RestoreDmsDatabaseResponse> result = apiInstance.restoreDmsDatabaseGet(restoreDmsDatabaseRequest);
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
 **restoreDmsDatabaseRequest** | [**RestoreDmsDatabaseRequest**](RestoreDmsDatabaseRequest.md)| restoreDmsDatabaseRequest |

### Return type

[**RestoreDmsDatabaseResponse**](RestoreDmsDatabaseResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="restoreDmsDatabasePost"></a>
# **restoreDmsDatabasePost**
> RestoreDmsDatabaseResponse restoreDmsDatabasePost(restoreDmsDatabaseRequest)



DMS데이터베이스복구

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
RestoreDmsDatabaseRequest restoreDmsDatabaseRequest = new RestoreDmsDatabaseRequest(); // RestoreDmsDatabaseRequest | restoreDmsDatabaseRequest
try {
	// Handler Successful response
	ApiResponse<RestoreDmsDatabaseResponse> result = apiInstance.restoreDmsDatabasePost(restoreDmsDatabaseRequest);
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
 **restoreDmsDatabaseRequest** | [**RestoreDmsDatabaseRequest**](RestoreDmsDatabaseRequest.md)| restoreDmsDatabaseRequest |

### Return type

[**RestoreDmsDatabaseResponse**](RestoreDmsDatabaseResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="restoreDmsTransactionLogGet"></a>
# **restoreDmsTransactionLogGet**
> RestoreDmsTransactionLogResponse restoreDmsTransactionLogGet(restoreDmsTransactionLogRequest)



DMS트랜잭션로그복구

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
RestoreDmsTransactionLogRequest restoreDmsTransactionLogRequest = new RestoreDmsTransactionLogRequest(); // RestoreDmsTransactionLogRequest | restoreDmsTransactionLogRequest
try {
	// Handler Successful response
	ApiResponse<RestoreDmsTransactionLogResponse> result = apiInstance.restoreDmsTransactionLogGet(restoreDmsTransactionLogRequest);
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
 **restoreDmsTransactionLogRequest** | [**RestoreDmsTransactionLogRequest**](RestoreDmsTransactionLogRequest.md)| restoreDmsTransactionLogRequest |

### Return type

[**RestoreDmsTransactionLogResponse**](RestoreDmsTransactionLogResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="restoreDmsTransactionLogPost"></a>
# **restoreDmsTransactionLogPost**
> RestoreDmsTransactionLogResponse restoreDmsTransactionLogPost(restoreDmsTransactionLogRequest)



DMS트랜잭션로그복구

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
RestoreDmsTransactionLogRequest restoreDmsTransactionLogRequest = new RestoreDmsTransactionLogRequest(); // RestoreDmsTransactionLogRequest | restoreDmsTransactionLogRequest
try {
	// Handler Successful response
	ApiResponse<RestoreDmsTransactionLogResponse> result = apiInstance.restoreDmsTransactionLogPost(restoreDmsTransactionLogRequest);
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
 **restoreDmsTransactionLogRequest** | [**RestoreDmsTransactionLogRequest**](RestoreDmsTransactionLogRequest.md)| restoreDmsTransactionLogRequest |

### Return type

[**RestoreDmsTransactionLogResponse**](RestoreDmsTransactionLogResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="setObjectStorageInfoGet"></a>
# **setObjectStorageInfoGet**
> SetObjectStorageInfoResponse setObjectStorageInfoGet(setObjectStorageInfoRequest)



오브젝트스토리지정보설정

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
SetObjectStorageInfoRequest setObjectStorageInfoRequest = new SetObjectStorageInfoRequest(); // SetObjectStorageInfoRequest | setObjectStorageInfoRequest
try {
	// Handler Successful response
	ApiResponse<SetObjectStorageInfoResponse> result = apiInstance.setObjectStorageInfoGet(setObjectStorageInfoRequest);
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
 **setObjectStorageInfoRequest** | [**SetObjectStorageInfoRequest**](SetObjectStorageInfoRequest.md)| setObjectStorageInfoRequest |

### Return type

[**SetObjectStorageInfoResponse**](SetObjectStorageInfoResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="setObjectStorageInfoPost"></a>
# **setObjectStorageInfoPost**
> SetObjectStorageInfoResponse setObjectStorageInfoPost(setObjectStorageInfoRequest)



오브젝트스토리지정보설정

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
SetObjectStorageInfoRequest setObjectStorageInfoRequest = new SetObjectStorageInfoRequest(); // SetObjectStorageInfoRequest | setObjectStorageInfoRequest
try {
	// Handler Successful response
	ApiResponse<SetObjectStorageInfoResponse> result = apiInstance.setObjectStorageInfoPost(setObjectStorageInfoRequest);
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
 **setObjectStorageInfoRequest** | [**SetObjectStorageInfoRequest**](SetObjectStorageInfoRequest.md)| setObjectStorageInfoRequest |

### Return type

[**SetObjectStorageInfoResponse**](SetObjectStorageInfoResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="uploadDmsFileGet"></a>
# **uploadDmsFileGet**
> UploadDmsFileResponse uploadDmsFileGet(uploadDmsFileRequest)



DMS파일업로드

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
UploadDmsFileRequest uploadDmsFileRequest = new UploadDmsFileRequest(); // UploadDmsFileRequest | uploadDmsFileRequest
try {
	// Handler Successful response
	ApiResponse<UploadDmsFileResponse> result = apiInstance.uploadDmsFileGet(uploadDmsFileRequest);
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
 **uploadDmsFileRequest** | [**UploadDmsFileRequest**](UploadDmsFileRequest.md)| uploadDmsFileRequest |

### Return type

[**UploadDmsFileResponse**](UploadDmsFileResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="uploadDmsFilePost"></a>
# **uploadDmsFilePost**
> UploadDmsFileResponse uploadDmsFilePost(uploadDmsFileRequest)



DMS파일업로드

### Example
```java
// Import classes:
// import com.ncloud.clouddb.ApiClient;
// import com.ncloud.clouddb.ApiResponse;
// import com.ncloud.clouddb.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.clouddb.marshaller.JsonMarshaller;
// import com.ncloud.clouddb.marshaller.XmlMarshaller;
// import com.ncloud.clouddb.marshaller.FormMarshaller;
// import com.ncloud.clouddb.exception.ApiException;
// import com.ncloud.clouddb.exception.SdkException;
// import com.ncloud.clouddb.model.*;

// import com.ncloud.clouddb.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
UploadDmsFileRequest uploadDmsFileRequest = new UploadDmsFileRequest(); // UploadDmsFileRequest | uploadDmsFileRequest
try {
	// Handler Successful response
	ApiResponse<UploadDmsFileResponse> result = apiInstance.uploadDmsFilePost(uploadDmsFileRequest);
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
 **uploadDmsFileRequest** | [**UploadDmsFileRequest**](UploadDmsFileRequest.md)| uploadDmsFileRequest |

### Return type

[**UploadDmsFileResponse**](UploadDmsFileResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

