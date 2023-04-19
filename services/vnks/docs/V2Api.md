# V2Api

All URIs are relative to *https://nks.apigw.ntruss.com/vnks/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clustersGet**](V2Api.md#clustersGet) | **GET** /clusters | 
[**clustersPost**](V2Api.md#clustersPost) | **POST** /clusters | 
[**clustersUuidDelete**](V2Api.md#clustersUuidDelete) | **DELETE** /clusters/{uuid} | 
[**clustersUuidGet**](V2Api.md#clustersUuidGet) | **GET** /clusters/{uuid} | 
[**clustersUuidKubeconfigGet**](V2Api.md#clustersUuidKubeconfigGet) | **GET** /clusters/{uuid}/kubeconfig | 
[**clustersUuidKubeconfigResetPatch**](V2Api.md#clustersUuidKubeconfigResetPatch) | **PATCH** /clusters/{uuid}/kubeconfig/reset | 
[**clustersUuidNodePoolGet**](V2Api.md#clustersUuidNodePoolGet) | **GET** /clusters/{uuid}/node-pool | 
[**clustersUuidNodePoolInstanceNoDelete**](V2Api.md#clustersUuidNodePoolInstanceNoDelete) | **DELETE** /clusters/{uuid}/node-pool/{instanceNo} | 
[**clustersUuidNodePoolInstanceNoPatch**](V2Api.md#clustersUuidNodePoolInstanceNoPatch) | **PATCH** /clusters/{uuid}/node-pool/{instanceNo} | 
[**clustersUuidNodePoolPost**](V2Api.md#clustersUuidNodePoolPost) | **POST** /clusters/{uuid}/node-pool | 
[**clustersUuidNodesGet**](V2Api.md#clustersUuidNodesGet) | **GET** /clusters/{uuid}/nodes | 
[**clustersUuidNodesInstanceNoDelete**](V2Api.md#clustersUuidNodesInstanceNoDelete) | **DELETE** /clusters/{uuid}/nodes/{instanceNo} | 
[**optionVersionGet**](V2Api.md#optionVersionGet) | **GET** /option/version | 
[**rootGet**](V2Api.md#rootGet) | **GET** / | 


<a name="clustersGet"></a>
# **clustersGet**
> ClustersRes clustersGet()



### Example
```java
// Import classes:
// import com.ncloud.vnks.ApiClient;
// import com.ncloud.vnks.ApiResponse;
// import com.ncloud.vnks.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnks.marshaller.JsonMarshaller;
// import com.ncloud.vnks.marshaller.XmlMarshaller;
// import com.ncloud.vnks.marshaller.FormMarshaller;
// import com.ncloud.vnks.exception.ApiException;
// import com.ncloud.vnks.exception.SdkException;
// import com.ncloud.vnks.model.*;

// import com.ncloud.vnks.api.V2Api;

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
	ApiResponse<ClustersRes> result = apiInstance.clustersGet();
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

[**ClustersRes**](ClustersRes.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clustersPost"></a>
# **clustersPost**
> CreateClusterRes clustersPost(clusterInputBody)



### Example
```java
// Import classes:
// import com.ncloud.vnks.ApiClient;
// import com.ncloud.vnks.ApiResponse;
// import com.ncloud.vnks.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnks.marshaller.JsonMarshaller;
// import com.ncloud.vnks.marshaller.XmlMarshaller;
// import com.ncloud.vnks.marshaller.FormMarshaller;
// import com.ncloud.vnks.exception.ApiException;
// import com.ncloud.vnks.exception.SdkException;
// import com.ncloud.vnks.model.*;

// import com.ncloud.vnks.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
ClusterInputBody clusterInputBody = new ClusterInputBody(); // ClusterInputBody | 
try {
	// Handler Successful response
	ApiResponse<CreateClusterRes> result = apiInstance.clustersPost(clusterInputBody);
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
 **clusterInputBody** | [**ClusterInputBody**](ClusterInputBody.md)|  |

### Return type

[**CreateClusterRes**](CreateClusterRes.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clustersUuidDelete"></a>
# **clustersUuidDelete**
> clustersUuidDelete(uuid)



### Example
```java
// Import classes:
// import com.ncloud.vnks.ApiClient;
// import com.ncloud.vnks.ApiResponse;
// import com.ncloud.vnks.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnks.marshaller.JsonMarshaller;
// import com.ncloud.vnks.marshaller.XmlMarshaller;
// import com.ncloud.vnks.marshaller.FormMarshaller;
// import com.ncloud.vnks.exception.ApiException;
// import com.ncloud.vnks.exception.SdkException;
// import com.ncloud.vnks.model.*;

// import com.ncloud.vnks.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
String uuid = "uuid_example"; // String | uuid
try {
	// Handler Successful response
	apiInstance.clustersUuidDelete(uuid);
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
 **uuid** | **String**| uuid |

### Return type

null (empty response body)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clustersUuidGet"></a>
# **clustersUuidGet**
> ClusterRes clustersUuidGet(uuid)



### Example
```java
// Import classes:
// import com.ncloud.vnks.ApiClient;
// import com.ncloud.vnks.ApiResponse;
// import com.ncloud.vnks.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnks.marshaller.JsonMarshaller;
// import com.ncloud.vnks.marshaller.XmlMarshaller;
// import com.ncloud.vnks.marshaller.FormMarshaller;
// import com.ncloud.vnks.exception.ApiException;
// import com.ncloud.vnks.exception.SdkException;
// import com.ncloud.vnks.model.*;

// import com.ncloud.vnks.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
String uuid = "uuid_example"; // String | uuid
try {
	// Handler Successful response
	ApiResponse<ClusterRes> result = apiInstance.clustersUuidGet(uuid);
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
 **uuid** | **String**| uuid |

### Return type

[**ClusterRes**](ClusterRes.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clustersUuidKubeconfigGet"></a>
# **clustersUuidKubeconfigGet**
> KubeconfigRes clustersUuidKubeconfigGet(uuid)



### Example
```java
// Import classes:
// import com.ncloud.vnks.ApiClient;
// import com.ncloud.vnks.ApiResponse;
// import com.ncloud.vnks.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnks.marshaller.JsonMarshaller;
// import com.ncloud.vnks.marshaller.XmlMarshaller;
// import com.ncloud.vnks.marshaller.FormMarshaller;
// import com.ncloud.vnks.exception.ApiException;
// import com.ncloud.vnks.exception.SdkException;
// import com.ncloud.vnks.model.*;

// import com.ncloud.vnks.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
String uuid = "uuid_example"; // String | uuid
try {
	// Handler Successful response
	ApiResponse<KubeconfigRes> result = apiInstance.clustersUuidKubeconfigGet(uuid);
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
 **uuid** | **String**| uuid |

### Return type

[**KubeconfigRes**](KubeconfigRes.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clustersUuidKubeconfigResetPatch"></a>
# **clustersUuidKubeconfigResetPatch**
> clustersUuidKubeconfigResetPatch(uuid)



### Example
```java
// Import classes:
// import com.ncloud.vnks.ApiClient;
// import com.ncloud.vnks.ApiResponse;
// import com.ncloud.vnks.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnks.marshaller.JsonMarshaller;
// import com.ncloud.vnks.marshaller.XmlMarshaller;
// import com.ncloud.vnks.marshaller.FormMarshaller;
// import com.ncloud.vnks.exception.ApiException;
// import com.ncloud.vnks.exception.SdkException;
// import com.ncloud.vnks.model.*;

// import com.ncloud.vnks.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
String uuid = "uuid_example"; // String | uuid
try {
	// Handler Successful response
	apiInstance.clustersUuidKubeconfigResetPatch(uuid);
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
 **uuid** | **String**| uuid |

### Return type

null (empty response body)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clustersUuidNodePoolGet"></a>
# **clustersUuidNodePoolGet**
> NodePoolsRes clustersUuidNodePoolGet(uuid)



### Example
```java
// Import classes:
// import com.ncloud.vnks.ApiClient;
// import com.ncloud.vnks.ApiResponse;
// import com.ncloud.vnks.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnks.marshaller.JsonMarshaller;
// import com.ncloud.vnks.marshaller.XmlMarshaller;
// import com.ncloud.vnks.marshaller.FormMarshaller;
// import com.ncloud.vnks.exception.ApiException;
// import com.ncloud.vnks.exception.SdkException;
// import com.ncloud.vnks.model.*;

// import com.ncloud.vnks.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
String uuid = "uuid_example"; // String | uuid
try {
	// Handler Successful response
	ApiResponse<NodePoolsRes> result = apiInstance.clustersUuidNodePoolGet(uuid);
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
 **uuid** | **String**| uuid |

### Return type

[**NodePoolsRes**](NodePoolsRes.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clustersUuidNodePoolInstanceNoDelete"></a>
# **clustersUuidNodePoolInstanceNoDelete**
> clustersUuidNodePoolInstanceNoDelete(uuid, instanceNo)



### Example
```java
// Import classes:
// import com.ncloud.vnks.ApiClient;
// import com.ncloud.vnks.ApiResponse;
// import com.ncloud.vnks.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnks.marshaller.JsonMarshaller;
// import com.ncloud.vnks.marshaller.XmlMarshaller;
// import com.ncloud.vnks.marshaller.FormMarshaller;
// import com.ncloud.vnks.exception.ApiException;
// import com.ncloud.vnks.exception.SdkException;
// import com.ncloud.vnks.model.*;

// import com.ncloud.vnks.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
String uuid = "uuid_example"; // String | uuid
String instanceNo = "instanceNo_example"; // String | instanceNo
try {
	// Handler Successful response
	apiInstance.clustersUuidNodePoolInstanceNoDelete(uuid, instanceNo);
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
 **uuid** | **String**| uuid |
 **instanceNo** | **String**| instanceNo |

### Return type

null (empty response body)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clustersUuidNodePoolInstanceNoPatch"></a>
# **clustersUuidNodePoolInstanceNoPatch**
> clustersUuidNodePoolInstanceNoPatch(nodePoolUpdateBody, uuid, instanceNo)



### Example
```java
// Import classes:
// import com.ncloud.vnks.ApiClient;
// import com.ncloud.vnks.ApiResponse;
// import com.ncloud.vnks.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnks.marshaller.JsonMarshaller;
// import com.ncloud.vnks.marshaller.XmlMarshaller;
// import com.ncloud.vnks.marshaller.FormMarshaller;
// import com.ncloud.vnks.exception.ApiException;
// import com.ncloud.vnks.exception.SdkException;
// import com.ncloud.vnks.model.*;

// import com.ncloud.vnks.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
NodePoolUpdateBody nodePoolUpdateBody = new NodePoolUpdateBody(); // NodePoolUpdateBody | 
String uuid = "uuid_example"; // String | uuid
String instanceNo = "instanceNo_example"; // String | instanceNo
try {
	// Handler Successful response
	apiInstance.clustersUuidNodePoolInstanceNoPatch(nodePoolUpdateBody, uuid, instanceNo);
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
 **nodePoolUpdateBody** | [**NodePoolUpdateBody**](NodePoolUpdateBody.md)|  |
 **uuid** | **String**| uuid |
 **instanceNo** | **String**| instanceNo |

### Return type

null (empty response body)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clustersUuidNodePoolPost"></a>
# **clustersUuidNodePoolPost**
> clustersUuidNodePoolPost(nodePoolCreationBody, uuid)



### Example
```java
// Import classes:
// import com.ncloud.vnks.ApiClient;
// import com.ncloud.vnks.ApiResponse;
// import com.ncloud.vnks.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnks.marshaller.JsonMarshaller;
// import com.ncloud.vnks.marshaller.XmlMarshaller;
// import com.ncloud.vnks.marshaller.FormMarshaller;
// import com.ncloud.vnks.exception.ApiException;
// import com.ncloud.vnks.exception.SdkException;
// import com.ncloud.vnks.model.*;

// import com.ncloud.vnks.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
NodePoolCreationBody nodePoolCreationBody = new NodePoolCreationBody(); // NodePoolCreationBody | 
String uuid = "uuid_example"; // String | uuid
try {
	// Handler Successful response
	apiInstance.clustersUuidNodePoolPost(nodePoolCreationBody, uuid);
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
 **nodePoolCreationBody** | [**NodePoolCreationBody**](NodePoolCreationBody.md)|  |
 **uuid** | **String**| uuid |

### Return type

null (empty response body)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clustersUuidNodesGet"></a>
# **clustersUuidNodesGet**
> WorkerNodeRes clustersUuidNodesGet(uuid)



### Example
```java
// Import classes:
// import com.ncloud.vnks.ApiClient;
// import com.ncloud.vnks.ApiResponse;
// import com.ncloud.vnks.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnks.marshaller.JsonMarshaller;
// import com.ncloud.vnks.marshaller.XmlMarshaller;
// import com.ncloud.vnks.marshaller.FormMarshaller;
// import com.ncloud.vnks.exception.ApiException;
// import com.ncloud.vnks.exception.SdkException;
// import com.ncloud.vnks.model.*;

// import com.ncloud.vnks.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
String uuid = "uuid_example"; // String | uuid
try {
	// Handler Successful response
	ApiResponse<WorkerNodeRes> result = apiInstance.clustersUuidNodesGet(uuid);
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
 **uuid** | **String**| uuid |

### Return type

[**WorkerNodeRes**](WorkerNodeRes.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clustersUuidNodesInstanceNoDelete"></a>
# **clustersUuidNodesInstanceNoDelete**
> clustersUuidNodesInstanceNoDelete(uuid, instanceNo, nodePoolId)



### Example
```java
// Import classes:
// import com.ncloud.vnks.ApiClient;
// import com.ncloud.vnks.ApiResponse;
// import com.ncloud.vnks.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnks.marshaller.JsonMarshaller;
// import com.ncloud.vnks.marshaller.XmlMarshaller;
// import com.ncloud.vnks.marshaller.FormMarshaller;
// import com.ncloud.vnks.exception.ApiException;
// import com.ncloud.vnks.exception.SdkException;
// import com.ncloud.vnks.model.*;

// import com.ncloud.vnks.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
String uuid = "uuid_example"; // String | uuid
String instanceNo = "instanceNo_example"; // String | instanceNo
String nodePoolId = "nodePoolId_example"; // String | nodePoolId
try {
	// Handler Successful response
	apiInstance.clustersUuidNodesInstanceNoDelete(uuid, instanceNo, nodePoolId);
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
 **uuid** | **String**| uuid |
 **instanceNo** | **String**| instanceNo |
 **nodePoolId** | **String**| nodePoolId |

### Return type

null (empty response body)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="optionVersionGet"></a>
# **optionVersionGet**
> OptionsRes optionVersionGet()



### Example
```java
// Import classes:
// import com.ncloud.vnks.ApiClient;
// import com.ncloud.vnks.ApiResponse;
// import com.ncloud.vnks.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnks.marshaller.JsonMarshaller;
// import com.ncloud.vnks.marshaller.XmlMarshaller;
// import com.ncloud.vnks.marshaller.FormMarshaller;
// import com.ncloud.vnks.exception.ApiException;
// import com.ncloud.vnks.exception.SdkException;
// import com.ncloud.vnks.model.*;

// import com.ncloud.vnks.api.V2Api;

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
	ApiResponse<OptionsRes> result = apiInstance.optionVersionGet();
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

[**OptionsRes**](OptionsRes.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rootGet"></a>
# **rootGet**
> rootGet()



### Example
```java
// Import classes:
// import com.ncloud.vnks.ApiClient;
// import com.ncloud.vnks.ApiResponse;
// import com.ncloud.vnks.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.vnks.marshaller.JsonMarshaller;
// import com.ncloud.vnks.marshaller.XmlMarshaller;
// import com.ncloud.vnks.marshaller.FormMarshaller;
// import com.ncloud.vnks.exception.ApiException;
// import com.ncloud.vnks.exception.SdkException;
// import com.ncloud.vnks.model.*;

// import com.ncloud.vnks.api.V2Api;

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
	apiInstance.rootGet();
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

 - **Content-Type**: application/json
 - **Accept**: application/json

