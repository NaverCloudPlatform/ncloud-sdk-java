# V2Api

All URIs are relative to *https://ncloud.apigw.ntruss.com/loadbalancer/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLoadBalancerSslCertificatePost**](V2Api.md#addLoadBalancerSslCertificatePost) | **POST** /addLoadBalancerSslCertificate | 
[**addServerInstancesToLoadBalancerGet**](V2Api.md#addServerInstancesToLoadBalancerGet) | **GET** /addServerInstancesToLoadBalancer | 
[**addServerInstancesToLoadBalancerPost**](V2Api.md#addServerInstancesToLoadBalancerPost) | **POST** /addServerInstancesToLoadBalancer | 
[**changeLoadBalancedServerInstancesGet**](V2Api.md#changeLoadBalancedServerInstancesGet) | **GET** /changeLoadBalancedServerInstances | 
[**changeLoadBalancedServerInstancesPost**](V2Api.md#changeLoadBalancedServerInstancesPost) | **POST** /changeLoadBalancedServerInstances | 
[**changeLoadBalancerInstanceConfigurationGet**](V2Api.md#changeLoadBalancerInstanceConfigurationGet) | **GET** /changeLoadBalancerInstanceConfiguration | 
[**changeLoadBalancerInstanceConfigurationPost**](V2Api.md#changeLoadBalancerInstanceConfigurationPost) | **POST** /changeLoadBalancerInstanceConfiguration | 
[**createLoadBalancerInstanceGet**](V2Api.md#createLoadBalancerInstanceGet) | **GET** /createLoadBalancerInstance | 
[**createLoadBalancerInstancePost**](V2Api.md#createLoadBalancerInstancePost) | **POST** /createLoadBalancerInstance | 
[**deleteLoadBalancerInstancesGet**](V2Api.md#deleteLoadBalancerInstancesGet) | **GET** /deleteLoadBalancerInstances | 
[**deleteLoadBalancerInstancesPost**](V2Api.md#deleteLoadBalancerInstancesPost) | **POST** /deleteLoadBalancerInstances | 
[**deleteLoadBalancerSslCertificateGet**](V2Api.md#deleteLoadBalancerSslCertificateGet) | **GET** /deleteLoadBalancerSslCertificate | 
[**deleteLoadBalancerSslCertificatePost**](V2Api.md#deleteLoadBalancerSslCertificatePost) | **POST** /deleteLoadBalancerSslCertificate | 
[**deleteServerInstancesFromLoadBalancerGet**](V2Api.md#deleteServerInstancesFromLoadBalancerGet) | **GET** /deleteServerInstancesFromLoadBalancer | 
[**deleteServerInstancesFromLoadBalancerPost**](V2Api.md#deleteServerInstancesFromLoadBalancerPost) | **POST** /deleteServerInstancesFromLoadBalancer | 
[**getLoadBalancedServerInstanceListGet**](V2Api.md#getLoadBalancedServerInstanceListGet) | **GET** /getLoadBalancedServerInstanceList | 
[**getLoadBalancedServerInstanceListPost**](V2Api.md#getLoadBalancedServerInstanceListPost) | **POST** /getLoadBalancedServerInstanceList | 
[**getLoadBalancerInstanceListGet**](V2Api.md#getLoadBalancerInstanceListGet) | **GET** /getLoadBalancerInstanceList | 
[**getLoadBalancerInstanceListPost**](V2Api.md#getLoadBalancerInstanceListPost) | **POST** /getLoadBalancerInstanceList | 
[**getLoadBalancerSslCertificateListGet**](V2Api.md#getLoadBalancerSslCertificateListGet) | **GET** /getLoadBalancerSslCertificateList | 
[**getLoadBalancerSslCertificateListPost**](V2Api.md#getLoadBalancerSslCertificateListPost) | **POST** /getLoadBalancerSslCertificateList | 
[**getLoadBalancerTargetServerInstanceListGet**](V2Api.md#getLoadBalancerTargetServerInstanceListGet) | **GET** /getLoadBalancerTargetServerInstanceList | 
[**getLoadBalancerTargetServerInstanceListPost**](V2Api.md#getLoadBalancerTargetServerInstanceListPost) | **POST** /getLoadBalancerTargetServerInstanceList | 


<a name="addLoadBalancerSslCertificatePost"></a>
# **addLoadBalancerSslCertificatePost**
> AddLoadBalancerSslCertificateResponse addLoadBalancerSslCertificatePost(addLoadBalancerSslCertificateRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
AddLoadBalancerSslCertificateRequest addLoadBalancerSslCertificateRequest = new AddLoadBalancerSslCertificateRequest(); // AddLoadBalancerSslCertificateRequest | addLoadBalancerSslCertificateRequest
try {
	// Handler Successful response
	ApiResponse<AddLoadBalancerSslCertificateResponse> result = apiInstance.addLoadBalancerSslCertificatePost(addLoadBalancerSslCertificateRequest);
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
 **addLoadBalancerSslCertificateRequest** | [**AddLoadBalancerSslCertificateRequest**](AddLoadBalancerSslCertificateRequest.md)| addLoadBalancerSslCertificateRequest |

### Return type

[**AddLoadBalancerSslCertificateResponse**](AddLoadBalancerSslCertificateResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="addServerInstancesToLoadBalancerGet"></a>
# **addServerInstancesToLoadBalancerGet**
> AddServerInstancesToLoadBalancerResponse addServerInstancesToLoadBalancerGet(addServerInstancesToLoadBalancerRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
AddServerInstancesToLoadBalancerRequest addServerInstancesToLoadBalancerRequest = new AddServerInstancesToLoadBalancerRequest(); // AddServerInstancesToLoadBalancerRequest | addServerInstancesToLoadBalancerRequest
try {
	// Handler Successful response
	ApiResponse<AddServerInstancesToLoadBalancerResponse> result = apiInstance.addServerInstancesToLoadBalancerGet(addServerInstancesToLoadBalancerRequest);
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
 **addServerInstancesToLoadBalancerRequest** | [**AddServerInstancesToLoadBalancerRequest**](AddServerInstancesToLoadBalancerRequest.md)| addServerInstancesToLoadBalancerRequest |

### Return type

[**AddServerInstancesToLoadBalancerResponse**](AddServerInstancesToLoadBalancerResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="addServerInstancesToLoadBalancerPost"></a>
# **addServerInstancesToLoadBalancerPost**
> AddServerInstancesToLoadBalancerResponse addServerInstancesToLoadBalancerPost(addServerInstancesToLoadBalancerRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
AddServerInstancesToLoadBalancerRequest addServerInstancesToLoadBalancerRequest = new AddServerInstancesToLoadBalancerRequest(); // AddServerInstancesToLoadBalancerRequest | addServerInstancesToLoadBalancerRequest
try {
	// Handler Successful response
	ApiResponse<AddServerInstancesToLoadBalancerResponse> result = apiInstance.addServerInstancesToLoadBalancerPost(addServerInstancesToLoadBalancerRequest);
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
 **addServerInstancesToLoadBalancerRequest** | [**AddServerInstancesToLoadBalancerRequest**](AddServerInstancesToLoadBalancerRequest.md)| addServerInstancesToLoadBalancerRequest |

### Return type

[**AddServerInstancesToLoadBalancerResponse**](AddServerInstancesToLoadBalancerResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="changeLoadBalancedServerInstancesGet"></a>
# **changeLoadBalancedServerInstancesGet**
> ChangeLoadBalancedServerInstancesResponse changeLoadBalancedServerInstancesGet(changeLoadBalancedServerInstancesRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
ChangeLoadBalancedServerInstancesRequest changeLoadBalancedServerInstancesRequest = new ChangeLoadBalancedServerInstancesRequest(); // ChangeLoadBalancedServerInstancesRequest | changeLoadBalancedServerInstancesRequest
try {
	// Handler Successful response
	ApiResponse<ChangeLoadBalancedServerInstancesResponse> result = apiInstance.changeLoadBalancedServerInstancesGet(changeLoadBalancedServerInstancesRequest);
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
 **changeLoadBalancedServerInstancesRequest** | [**ChangeLoadBalancedServerInstancesRequest**](ChangeLoadBalancedServerInstancesRequest.md)| changeLoadBalancedServerInstancesRequest |

### Return type

[**ChangeLoadBalancedServerInstancesResponse**](ChangeLoadBalancedServerInstancesResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="changeLoadBalancedServerInstancesPost"></a>
# **changeLoadBalancedServerInstancesPost**
> ChangeLoadBalancedServerInstancesResponse changeLoadBalancedServerInstancesPost(changeLoadBalancedServerInstancesRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
ChangeLoadBalancedServerInstancesRequest changeLoadBalancedServerInstancesRequest = new ChangeLoadBalancedServerInstancesRequest(); // ChangeLoadBalancedServerInstancesRequest | changeLoadBalancedServerInstancesRequest
try {
	// Handler Successful response
	ApiResponse<ChangeLoadBalancedServerInstancesResponse> result = apiInstance.changeLoadBalancedServerInstancesPost(changeLoadBalancedServerInstancesRequest);
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
 **changeLoadBalancedServerInstancesRequest** | [**ChangeLoadBalancedServerInstancesRequest**](ChangeLoadBalancedServerInstancesRequest.md)| changeLoadBalancedServerInstancesRequest |

### Return type

[**ChangeLoadBalancedServerInstancesResponse**](ChangeLoadBalancedServerInstancesResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="changeLoadBalancerInstanceConfigurationGet"></a>
# **changeLoadBalancerInstanceConfigurationGet**
> ChangeLoadBalancerInstanceConfigurationResponse changeLoadBalancerInstanceConfigurationGet(changeLoadBalancerInstanceConfigurationRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
ChangeLoadBalancerInstanceConfigurationRequest changeLoadBalancerInstanceConfigurationRequest = new ChangeLoadBalancerInstanceConfigurationRequest(); // ChangeLoadBalancerInstanceConfigurationRequest | changeLoadBalancerInstanceConfigurationRequest
try {
	// Handler Successful response
	ApiResponse<ChangeLoadBalancerInstanceConfigurationResponse> result = apiInstance.changeLoadBalancerInstanceConfigurationGet(changeLoadBalancerInstanceConfigurationRequest);
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
 **changeLoadBalancerInstanceConfigurationRequest** | [**ChangeLoadBalancerInstanceConfigurationRequest**](ChangeLoadBalancerInstanceConfigurationRequest.md)| changeLoadBalancerInstanceConfigurationRequest |

### Return type

[**ChangeLoadBalancerInstanceConfigurationResponse**](ChangeLoadBalancerInstanceConfigurationResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="changeLoadBalancerInstanceConfigurationPost"></a>
# **changeLoadBalancerInstanceConfigurationPost**
> ChangeLoadBalancerInstanceConfigurationResponse changeLoadBalancerInstanceConfigurationPost(changeLoadBalancerInstanceConfigurationRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
ChangeLoadBalancerInstanceConfigurationRequest changeLoadBalancerInstanceConfigurationRequest = new ChangeLoadBalancerInstanceConfigurationRequest(); // ChangeLoadBalancerInstanceConfigurationRequest | changeLoadBalancerInstanceConfigurationRequest
try {
	// Handler Successful response
	ApiResponse<ChangeLoadBalancerInstanceConfigurationResponse> result = apiInstance.changeLoadBalancerInstanceConfigurationPost(changeLoadBalancerInstanceConfigurationRequest);
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
 **changeLoadBalancerInstanceConfigurationRequest** | [**ChangeLoadBalancerInstanceConfigurationRequest**](ChangeLoadBalancerInstanceConfigurationRequest.md)| changeLoadBalancerInstanceConfigurationRequest |

### Return type

[**ChangeLoadBalancerInstanceConfigurationResponse**](ChangeLoadBalancerInstanceConfigurationResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="createLoadBalancerInstanceGet"></a>
# **createLoadBalancerInstanceGet**
> CreateLoadBalancerInstanceResponse createLoadBalancerInstanceGet(createLoadBalancerInstanceRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
CreateLoadBalancerInstanceRequest createLoadBalancerInstanceRequest = new CreateLoadBalancerInstanceRequest(); // CreateLoadBalancerInstanceRequest | createLoadBalancerInstanceRequest
try {
	// Handler Successful response
	ApiResponse<CreateLoadBalancerInstanceResponse> result = apiInstance.createLoadBalancerInstanceGet(createLoadBalancerInstanceRequest);
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
 **createLoadBalancerInstanceRequest** | [**CreateLoadBalancerInstanceRequest**](CreateLoadBalancerInstanceRequest.md)| createLoadBalancerInstanceRequest |

### Return type

[**CreateLoadBalancerInstanceResponse**](CreateLoadBalancerInstanceResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="createLoadBalancerInstancePost"></a>
# **createLoadBalancerInstancePost**
> CreateLoadBalancerInstanceResponse createLoadBalancerInstancePost(createLoadBalancerInstanceRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
CreateLoadBalancerInstanceRequest createLoadBalancerInstanceRequest = new CreateLoadBalancerInstanceRequest(); // CreateLoadBalancerInstanceRequest | createLoadBalancerInstanceRequest
try {
	// Handler Successful response
	ApiResponse<CreateLoadBalancerInstanceResponse> result = apiInstance.createLoadBalancerInstancePost(createLoadBalancerInstanceRequest);
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
 **createLoadBalancerInstanceRequest** | [**CreateLoadBalancerInstanceRequest**](CreateLoadBalancerInstanceRequest.md)| createLoadBalancerInstanceRequest |

### Return type

[**CreateLoadBalancerInstanceResponse**](CreateLoadBalancerInstanceResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="deleteLoadBalancerInstancesGet"></a>
# **deleteLoadBalancerInstancesGet**
> DeleteLoadBalancerInstancesResponse deleteLoadBalancerInstancesGet(deleteLoadBalancerInstancesRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
DeleteLoadBalancerInstancesRequest deleteLoadBalancerInstancesRequest = new DeleteLoadBalancerInstancesRequest(); // DeleteLoadBalancerInstancesRequest | deleteLoadBalancerInstancesRequest
try {
	// Handler Successful response
	ApiResponse<DeleteLoadBalancerInstancesResponse> result = apiInstance.deleteLoadBalancerInstancesGet(deleteLoadBalancerInstancesRequest);
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
 **deleteLoadBalancerInstancesRequest** | [**DeleteLoadBalancerInstancesRequest**](DeleteLoadBalancerInstancesRequest.md)| deleteLoadBalancerInstancesRequest |

### Return type

[**DeleteLoadBalancerInstancesResponse**](DeleteLoadBalancerInstancesResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="deleteLoadBalancerInstancesPost"></a>
# **deleteLoadBalancerInstancesPost**
> DeleteLoadBalancerInstancesResponse deleteLoadBalancerInstancesPost(deleteLoadBalancerInstancesRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
DeleteLoadBalancerInstancesRequest deleteLoadBalancerInstancesRequest = new DeleteLoadBalancerInstancesRequest(); // DeleteLoadBalancerInstancesRequest | deleteLoadBalancerInstancesRequest
try {
	// Handler Successful response
	ApiResponse<DeleteLoadBalancerInstancesResponse> result = apiInstance.deleteLoadBalancerInstancesPost(deleteLoadBalancerInstancesRequest);
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
 **deleteLoadBalancerInstancesRequest** | [**DeleteLoadBalancerInstancesRequest**](DeleteLoadBalancerInstancesRequest.md)| deleteLoadBalancerInstancesRequest |

### Return type

[**DeleteLoadBalancerInstancesResponse**](DeleteLoadBalancerInstancesResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="deleteLoadBalancerSslCertificateGet"></a>
# **deleteLoadBalancerSslCertificateGet**
> DeleteLoadBalancerSslCertificateResponse deleteLoadBalancerSslCertificateGet(deleteLoadBalancerSslCertificateRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
DeleteLoadBalancerSslCertificateRequest deleteLoadBalancerSslCertificateRequest = new DeleteLoadBalancerSslCertificateRequest(); // DeleteLoadBalancerSslCertificateRequest | deleteLoadBalancerSslCertificateRequest
try {
	// Handler Successful response
	ApiResponse<DeleteLoadBalancerSslCertificateResponse> result = apiInstance.deleteLoadBalancerSslCertificateGet(deleteLoadBalancerSslCertificateRequest);
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
 **deleteLoadBalancerSslCertificateRequest** | [**DeleteLoadBalancerSslCertificateRequest**](DeleteLoadBalancerSslCertificateRequest.md)| deleteLoadBalancerSslCertificateRequest |

### Return type

[**DeleteLoadBalancerSslCertificateResponse**](DeleteLoadBalancerSslCertificateResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="deleteLoadBalancerSslCertificatePost"></a>
# **deleteLoadBalancerSslCertificatePost**
> DeleteLoadBalancerSslCertificateResponse deleteLoadBalancerSslCertificatePost(deleteLoadBalancerSslCertificateRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
DeleteLoadBalancerSslCertificateRequest deleteLoadBalancerSslCertificateRequest = new DeleteLoadBalancerSslCertificateRequest(); // DeleteLoadBalancerSslCertificateRequest | deleteLoadBalancerSslCertificateRequest
try {
	// Handler Successful response
	ApiResponse<DeleteLoadBalancerSslCertificateResponse> result = apiInstance.deleteLoadBalancerSslCertificatePost(deleteLoadBalancerSslCertificateRequest);
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
 **deleteLoadBalancerSslCertificateRequest** | [**DeleteLoadBalancerSslCertificateRequest**](DeleteLoadBalancerSslCertificateRequest.md)| deleteLoadBalancerSslCertificateRequest |

### Return type

[**DeleteLoadBalancerSslCertificateResponse**](DeleteLoadBalancerSslCertificateResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="deleteServerInstancesFromLoadBalancerGet"></a>
# **deleteServerInstancesFromLoadBalancerGet**
> DeleteServerInstancesFromLoadBalancerResponse deleteServerInstancesFromLoadBalancerGet(deleteServerInstancesFromLoadBalancerRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
DeleteServerInstancesFromLoadBalancerRequest deleteServerInstancesFromLoadBalancerRequest = new DeleteServerInstancesFromLoadBalancerRequest(); // DeleteServerInstancesFromLoadBalancerRequest | deleteServerInstancesFromLoadBalancerRequest
try {
	// Handler Successful response
	ApiResponse<DeleteServerInstancesFromLoadBalancerResponse> result = apiInstance.deleteServerInstancesFromLoadBalancerGet(deleteServerInstancesFromLoadBalancerRequest);
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
 **deleteServerInstancesFromLoadBalancerRequest** | [**DeleteServerInstancesFromLoadBalancerRequest**](DeleteServerInstancesFromLoadBalancerRequest.md)| deleteServerInstancesFromLoadBalancerRequest |

### Return type

[**DeleteServerInstancesFromLoadBalancerResponse**](DeleteServerInstancesFromLoadBalancerResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="deleteServerInstancesFromLoadBalancerPost"></a>
# **deleteServerInstancesFromLoadBalancerPost**
> DeleteServerInstancesFromLoadBalancerResponse deleteServerInstancesFromLoadBalancerPost(deleteServerInstancesFromLoadBalancerRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
DeleteServerInstancesFromLoadBalancerRequest deleteServerInstancesFromLoadBalancerRequest = new DeleteServerInstancesFromLoadBalancerRequest(); // DeleteServerInstancesFromLoadBalancerRequest | deleteServerInstancesFromLoadBalancerRequest
try {
	// Handler Successful response
	ApiResponse<DeleteServerInstancesFromLoadBalancerResponse> result = apiInstance.deleteServerInstancesFromLoadBalancerPost(deleteServerInstancesFromLoadBalancerRequest);
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
 **deleteServerInstancesFromLoadBalancerRequest** | [**DeleteServerInstancesFromLoadBalancerRequest**](DeleteServerInstancesFromLoadBalancerRequest.md)| deleteServerInstancesFromLoadBalancerRequest |

### Return type

[**DeleteServerInstancesFromLoadBalancerResponse**](DeleteServerInstancesFromLoadBalancerResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getLoadBalancedServerInstanceListGet"></a>
# **getLoadBalancedServerInstanceListGet**
> GetLoadBalancedServerInstanceListResponse getLoadBalancedServerInstanceListGet(getLoadBalancedServerInstanceListRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetLoadBalancedServerInstanceListRequest getLoadBalancedServerInstanceListRequest = new GetLoadBalancedServerInstanceListRequest(); // GetLoadBalancedServerInstanceListRequest | getLoadBalancedServerInstanceListRequest
try {
	// Handler Successful response
	ApiResponse<GetLoadBalancedServerInstanceListResponse> result = apiInstance.getLoadBalancedServerInstanceListGet(getLoadBalancedServerInstanceListRequest);
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
 **getLoadBalancedServerInstanceListRequest** | [**GetLoadBalancedServerInstanceListRequest**](GetLoadBalancedServerInstanceListRequest.md)| getLoadBalancedServerInstanceListRequest |

### Return type

[**GetLoadBalancedServerInstanceListResponse**](GetLoadBalancedServerInstanceListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getLoadBalancedServerInstanceListPost"></a>
# **getLoadBalancedServerInstanceListPost**
> GetLoadBalancedServerInstanceListResponse getLoadBalancedServerInstanceListPost(getLoadBalancedServerInstanceListRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetLoadBalancedServerInstanceListRequest getLoadBalancedServerInstanceListRequest = new GetLoadBalancedServerInstanceListRequest(); // GetLoadBalancedServerInstanceListRequest | getLoadBalancedServerInstanceListRequest
try {
	// Handler Successful response
	ApiResponse<GetLoadBalancedServerInstanceListResponse> result = apiInstance.getLoadBalancedServerInstanceListPost(getLoadBalancedServerInstanceListRequest);
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
 **getLoadBalancedServerInstanceListRequest** | [**GetLoadBalancedServerInstanceListRequest**](GetLoadBalancedServerInstanceListRequest.md)| getLoadBalancedServerInstanceListRequest |

### Return type

[**GetLoadBalancedServerInstanceListResponse**](GetLoadBalancedServerInstanceListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getLoadBalancerInstanceListGet"></a>
# **getLoadBalancerInstanceListGet**
> GetLoadBalancerInstanceListResponse getLoadBalancerInstanceListGet(getLoadBalancerInstanceListRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetLoadBalancerInstanceListRequest getLoadBalancerInstanceListRequest = new GetLoadBalancerInstanceListRequest(); // GetLoadBalancerInstanceListRequest | getLoadBalancerInstanceListRequest
try {
	// Handler Successful response
	ApiResponse<GetLoadBalancerInstanceListResponse> result = apiInstance.getLoadBalancerInstanceListGet(getLoadBalancerInstanceListRequest);
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
 **getLoadBalancerInstanceListRequest** | [**GetLoadBalancerInstanceListRequest**](GetLoadBalancerInstanceListRequest.md)| getLoadBalancerInstanceListRequest |

### Return type

[**GetLoadBalancerInstanceListResponse**](GetLoadBalancerInstanceListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getLoadBalancerInstanceListPost"></a>
# **getLoadBalancerInstanceListPost**
> GetLoadBalancerInstanceListResponse getLoadBalancerInstanceListPost(getLoadBalancerInstanceListRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetLoadBalancerInstanceListRequest getLoadBalancerInstanceListRequest = new GetLoadBalancerInstanceListRequest(); // GetLoadBalancerInstanceListRequest | getLoadBalancerInstanceListRequest
try {
	// Handler Successful response
	ApiResponse<GetLoadBalancerInstanceListResponse> result = apiInstance.getLoadBalancerInstanceListPost(getLoadBalancerInstanceListRequest);
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
 **getLoadBalancerInstanceListRequest** | [**GetLoadBalancerInstanceListRequest**](GetLoadBalancerInstanceListRequest.md)| getLoadBalancerInstanceListRequest |

### Return type

[**GetLoadBalancerInstanceListResponse**](GetLoadBalancerInstanceListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getLoadBalancerSslCertificateListGet"></a>
# **getLoadBalancerSslCertificateListGet**
> GetLoadBalancerSslCertificateListResponse getLoadBalancerSslCertificateListGet(getLoadBalancerSslCertificateListRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetLoadBalancerSslCertificateListRequest getLoadBalancerSslCertificateListRequest = new GetLoadBalancerSslCertificateListRequest(); // GetLoadBalancerSslCertificateListRequest | getLoadBalancerSslCertificateListRequest
try {
	// Handler Successful response
	ApiResponse<GetLoadBalancerSslCertificateListResponse> result = apiInstance.getLoadBalancerSslCertificateListGet(getLoadBalancerSslCertificateListRequest);
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
 **getLoadBalancerSslCertificateListRequest** | [**GetLoadBalancerSslCertificateListRequest**](GetLoadBalancerSslCertificateListRequest.md)| getLoadBalancerSslCertificateListRequest |

### Return type

[**GetLoadBalancerSslCertificateListResponse**](GetLoadBalancerSslCertificateListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getLoadBalancerSslCertificateListPost"></a>
# **getLoadBalancerSslCertificateListPost**
> GetLoadBalancerSslCertificateListResponse getLoadBalancerSslCertificateListPost(getLoadBalancerSslCertificateListRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetLoadBalancerSslCertificateListRequest getLoadBalancerSslCertificateListRequest = new GetLoadBalancerSslCertificateListRequest(); // GetLoadBalancerSslCertificateListRequest | getLoadBalancerSslCertificateListRequest
try {
	// Handler Successful response
	ApiResponse<GetLoadBalancerSslCertificateListResponse> result = apiInstance.getLoadBalancerSslCertificateListPost(getLoadBalancerSslCertificateListRequest);
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
 **getLoadBalancerSslCertificateListRequest** | [**GetLoadBalancerSslCertificateListRequest**](GetLoadBalancerSslCertificateListRequest.md)| getLoadBalancerSslCertificateListRequest |

### Return type

[**GetLoadBalancerSslCertificateListResponse**](GetLoadBalancerSslCertificateListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getLoadBalancerTargetServerInstanceListGet"></a>
# **getLoadBalancerTargetServerInstanceListGet**
> GetLoadBalancerTargetServerInstanceListResponse getLoadBalancerTargetServerInstanceListGet(getLoadBalancerTargetServerInstanceListRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetLoadBalancerTargetServerInstanceListRequest getLoadBalancerTargetServerInstanceListRequest = new GetLoadBalancerTargetServerInstanceListRequest(); // GetLoadBalancerTargetServerInstanceListRequest | getLoadBalancerTargetServerInstanceListRequest
try {
	// Handler Successful response
	ApiResponse<GetLoadBalancerTargetServerInstanceListResponse> result = apiInstance.getLoadBalancerTargetServerInstanceListGet(getLoadBalancerTargetServerInstanceListRequest);
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
 **getLoadBalancerTargetServerInstanceListRequest** | [**GetLoadBalancerTargetServerInstanceListRequest**](GetLoadBalancerTargetServerInstanceListRequest.md)| getLoadBalancerTargetServerInstanceListRequest |

### Return type

[**GetLoadBalancerTargetServerInstanceListResponse**](GetLoadBalancerTargetServerInstanceListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getLoadBalancerTargetServerInstanceListPost"></a>
# **getLoadBalancerTargetServerInstanceListPost**
> GetLoadBalancerTargetServerInstanceListResponse getLoadBalancerTargetServerInstanceListPost(getLoadBalancerTargetServerInstanceListRequest)



### Example
```java
// Import classes:
// import com.ncloud.loadbalancer.ApiClient;
// import com.ncloud.loadbalancer.ApiResponse;
// import com.ncloud.loadbalancer.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.loadbalancer.marshaller.JsonMarshaller;
// import com.ncloud.loadbalancer.marshaller.XmlMarshaller;
// import com.ncloud.loadbalancer.marshaller.FormMarshaller;
// import com.ncloud.loadbalancer.exception.ApiException;
// import com.ncloud.loadbalancer.exception.SdkException;
// import com.ncloud.loadbalancer.model.*;

// import com.ncloud.loadbalancer.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetLoadBalancerTargetServerInstanceListRequest getLoadBalancerTargetServerInstanceListRequest = new GetLoadBalancerTargetServerInstanceListRequest(); // GetLoadBalancerTargetServerInstanceListRequest | getLoadBalancerTargetServerInstanceListRequest
try {
	// Handler Successful response
	ApiResponse<GetLoadBalancerTargetServerInstanceListResponse> result = apiInstance.getLoadBalancerTargetServerInstanceListPost(getLoadBalancerTargetServerInstanceListRequest);
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
 **getLoadBalancerTargetServerInstanceListRequest** | [**GetLoadBalancerTargetServerInstanceListRequest**](GetLoadBalancerTargetServerInstanceListRequest.md)| getLoadBalancerTargetServerInstanceListRequest |

### Return type

[**GetLoadBalancerTargetServerInstanceListResponse**](GetLoadBalancerTargetServerInstanceListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

