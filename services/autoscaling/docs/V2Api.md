# V2Api

All URIs are relative to *https://ncloud.apigw.ntruss.com/autoscaling/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAutoScalingGroupGet**](V2Api.md#createAutoScalingGroupGet) | **GET** /createAutoScalingGroup | 
[**createAutoScalingGroupPost**](V2Api.md#createAutoScalingGroupPost) | **POST** /createAutoScalingGroup | 
[**createLaunchConfigurationGet**](V2Api.md#createLaunchConfigurationGet) | **GET** /createLaunchConfiguration | 
[**createLaunchConfigurationPost**](V2Api.md#createLaunchConfigurationPost) | **POST** /createLaunchConfiguration | 
[**deleteAutoScalingGroupGet**](V2Api.md#deleteAutoScalingGroupGet) | **GET** /deleteAutoScalingGroup | 
[**deleteAutoScalingGroupPost**](V2Api.md#deleteAutoScalingGroupPost) | **POST** /deleteAutoScalingGroup | 
[**deleteAutoScalingLaunchConfigurationGet**](V2Api.md#deleteAutoScalingLaunchConfigurationGet) | **GET** /deleteAutoScalingLaunchConfiguration | 
[**deleteAutoScalingLaunchConfigurationPost**](V2Api.md#deleteAutoScalingLaunchConfigurationPost) | **POST** /deleteAutoScalingLaunchConfiguration | 
[**deletePolicyGet**](V2Api.md#deletePolicyGet) | **GET** /deletePolicy | 
[**deletePolicyPost**](V2Api.md#deletePolicyPost) | **POST** /deletePolicy | 
[**deleteScheduledActionGet**](V2Api.md#deleteScheduledActionGet) | **GET** /deleteScheduledAction | 
[**deleteScheduledActionPost**](V2Api.md#deleteScheduledActionPost) | **POST** /deleteScheduledAction | 
[**executePolicyGet**](V2Api.md#executePolicyGet) | **GET** /executePolicy | 
[**executePolicyPost**](V2Api.md#executePolicyPost) | **POST** /executePolicy | 
[**getAdjustmentTypeListGet**](V2Api.md#getAdjustmentTypeListGet) | **GET** /getAdjustmentTypeList | 
[**getAdjustmentTypeListPost**](V2Api.md#getAdjustmentTypeListPost) | **POST** /getAdjustmentTypeList | 
[**getAutoScalingActivityLogListGet**](V2Api.md#getAutoScalingActivityLogListGet) | **GET** /getAutoScalingActivityLogList | 
[**getAutoScalingActivityLogListPost**](V2Api.md#getAutoScalingActivityLogListPost) | **POST** /getAutoScalingActivityLogList | 
[**getAutoScalingConfigurationLogListGet**](V2Api.md#getAutoScalingConfigurationLogListGet) | **GET** /getAutoScalingConfigurationLogList | 
[**getAutoScalingConfigurationLogListPost**](V2Api.md#getAutoScalingConfigurationLogListPost) | **POST** /getAutoScalingConfigurationLogList | 
[**getAutoScalingGroupListGet**](V2Api.md#getAutoScalingGroupListGet) | **GET** /getAutoScalingGroupList | 
[**getAutoScalingGroupListPost**](V2Api.md#getAutoScalingGroupListPost) | **POST** /getAutoScalingGroupList | 
[**getAutoScalingPolicyListGet**](V2Api.md#getAutoScalingPolicyListGet) | **GET** /getAutoScalingPolicyList | 
[**getAutoScalingPolicyListPost**](V2Api.md#getAutoScalingPolicyListPost) | **POST** /getAutoScalingPolicyList | 
[**getLaunchConfigurationListGet**](V2Api.md#getLaunchConfigurationListGet) | **GET** /getLaunchConfigurationList | 
[**getLaunchConfigurationListPost**](V2Api.md#getLaunchConfigurationListPost) | **POST** /getLaunchConfigurationList | 
[**getScalingProcessTypeListGet**](V2Api.md#getScalingProcessTypeListGet) | **GET** /getScalingProcessTypeList | 
[**getScalingProcessTypeListPost**](V2Api.md#getScalingProcessTypeListPost) | **POST** /getScalingProcessTypeList | 
[**getScheduledActionListGet**](V2Api.md#getScheduledActionListGet) | **GET** /getScheduledActionList | 
[**getScheduledActionListPost**](V2Api.md#getScheduledActionListPost) | **POST** /getScheduledActionList | 
[**putScalingPolicyGet**](V2Api.md#putScalingPolicyGet) | **GET** /putScalingPolicy | 
[**putScalingPolicyPost**](V2Api.md#putScalingPolicyPost) | **POST** /putScalingPolicy | 
[**putScheduledUpdateGroupActionGet**](V2Api.md#putScheduledUpdateGroupActionGet) | **GET** /putScheduledUpdateGroupAction | 
[**putScheduledUpdateGroupActionPost**](V2Api.md#putScheduledUpdateGroupActionPost) | **POST** /putScheduledUpdateGroupAction | 
[**resumeProcessesGet**](V2Api.md#resumeProcessesGet) | **GET** /resumeProcesses | 
[**resumeProcessesPost**](V2Api.md#resumeProcessesPost) | **POST** /resumeProcesses | 
[**setDesiredCapacityGet**](V2Api.md#setDesiredCapacityGet) | **GET** /setDesiredCapacity | 
[**setDesiredCapacityPost**](V2Api.md#setDesiredCapacityPost) | **POST** /setDesiredCapacity | 
[**setServerInstanceHealthGet**](V2Api.md#setServerInstanceHealthGet) | **GET** /setServerInstanceHealth | 
[**setServerInstanceHealthPost**](V2Api.md#setServerInstanceHealthPost) | **POST** /setServerInstanceHealth | 
[**suspendProcessesGet**](V2Api.md#suspendProcessesGet) | **GET** /suspendProcesses | 
[**suspendProcessesPost**](V2Api.md#suspendProcessesPost) | **POST** /suspendProcesses | 
[**terminateServerInstanceInAutoScalingGroupGet**](V2Api.md#terminateServerInstanceInAutoScalingGroupGet) | **GET** /terminateServerInstanceInAutoScalingGroup | 
[**terminateServerInstanceInAutoScalingGroupPost**](V2Api.md#terminateServerInstanceInAutoScalingGroupPost) | **POST** /terminateServerInstanceInAutoScalingGroup | 
[**updateAutoScalingGroupGet**](V2Api.md#updateAutoScalingGroupGet) | **GET** /updateAutoScalingGroup | 
[**updateAutoScalingGroupPost**](V2Api.md#updateAutoScalingGroupPost) | **POST** /updateAutoScalingGroup | 


<a name="createAutoScalingGroupGet"></a>
# **createAutoScalingGroupGet**
> CreateAutoScalingGroupResponse createAutoScalingGroupGet(createAutoScalingGroupRequest)



B.오토스케일링그룹생성

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
CreateAutoScalingGroupRequest createAutoScalingGroupRequest = new CreateAutoScalingGroupRequest(); // CreateAutoScalingGroupRequest | createAutoScalingGroupRequest
try {
	// Handler Successful response
	ApiResponse<CreateAutoScalingGroupResponse> result = apiInstance.createAutoScalingGroupGet(createAutoScalingGroupRequest);
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
 **createAutoScalingGroupRequest** | [**CreateAutoScalingGroupRequest**](CreateAutoScalingGroupRequest.md)| createAutoScalingGroupRequest |

### Return type

[**CreateAutoScalingGroupResponse**](CreateAutoScalingGroupResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="createAutoScalingGroupPost"></a>
# **createAutoScalingGroupPost**
> CreateAutoScalingGroupResponse createAutoScalingGroupPost(createAutoScalingGroupRequest)



B.오토스케일링그룹생성

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
CreateAutoScalingGroupRequest createAutoScalingGroupRequest = new CreateAutoScalingGroupRequest(); // CreateAutoScalingGroupRequest | createAutoScalingGroupRequest
try {
	// Handler Successful response
	ApiResponse<CreateAutoScalingGroupResponse> result = apiInstance.createAutoScalingGroupPost(createAutoScalingGroupRequest);
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
 **createAutoScalingGroupRequest** | [**CreateAutoScalingGroupRequest**](CreateAutoScalingGroupRequest.md)| createAutoScalingGroupRequest |

### Return type

[**CreateAutoScalingGroupResponse**](CreateAutoScalingGroupResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="createLaunchConfigurationGet"></a>
# **createLaunchConfigurationGet**
> CreateLaunchConfigurationResponse createLaunchConfigurationGet(createLaunchConfigurationRequest)



A.론치설정생성

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
CreateLaunchConfigurationRequest createLaunchConfigurationRequest = new CreateLaunchConfigurationRequest(); // CreateLaunchConfigurationRequest | createLaunchConfigurationRequest
try {
	// Handler Successful response
	ApiResponse<CreateLaunchConfigurationResponse> result = apiInstance.createLaunchConfigurationGet(createLaunchConfigurationRequest);
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
 **createLaunchConfigurationRequest** | [**CreateLaunchConfigurationRequest**](CreateLaunchConfigurationRequest.md)| createLaunchConfigurationRequest |

### Return type

[**CreateLaunchConfigurationResponse**](CreateLaunchConfigurationResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="createLaunchConfigurationPost"></a>
# **createLaunchConfigurationPost**
> CreateLaunchConfigurationResponse createLaunchConfigurationPost(createLaunchConfigurationRequest)



A.론치설정생성

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
CreateLaunchConfigurationRequest createLaunchConfigurationRequest = new CreateLaunchConfigurationRequest(); // CreateLaunchConfigurationRequest | createLaunchConfigurationRequest
try {
	// Handler Successful response
	ApiResponse<CreateLaunchConfigurationResponse> result = apiInstance.createLaunchConfigurationPost(createLaunchConfigurationRequest);
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
 **createLaunchConfigurationRequest** | [**CreateLaunchConfigurationRequest**](CreateLaunchConfigurationRequest.md)| createLaunchConfigurationRequest |

### Return type

[**CreateLaunchConfigurationResponse**](CreateLaunchConfigurationResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="deleteAutoScalingGroupGet"></a>
# **deleteAutoScalingGroupGet**
> DeleteAutoScalingGroupResponse deleteAutoScalingGroupGet(deleteAutoScalingGroupRequest)



B.오토스케일링그룹삭제

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest = new DeleteAutoScalingGroupRequest(); // DeleteAutoScalingGroupRequest | deleteAutoScalingGroupRequest
try {
	// Handler Successful response
	ApiResponse<DeleteAutoScalingGroupResponse> result = apiInstance.deleteAutoScalingGroupGet(deleteAutoScalingGroupRequest);
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
 **deleteAutoScalingGroupRequest** | [**DeleteAutoScalingGroupRequest**](DeleteAutoScalingGroupRequest.md)| deleteAutoScalingGroupRequest |

### Return type

[**DeleteAutoScalingGroupResponse**](DeleteAutoScalingGroupResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="deleteAutoScalingGroupPost"></a>
# **deleteAutoScalingGroupPost**
> DeleteAutoScalingGroupResponse deleteAutoScalingGroupPost(deleteAutoScalingGroupRequest)



B.오토스케일링그룹삭제

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest = new DeleteAutoScalingGroupRequest(); // DeleteAutoScalingGroupRequest | deleteAutoScalingGroupRequest
try {
	// Handler Successful response
	ApiResponse<DeleteAutoScalingGroupResponse> result = apiInstance.deleteAutoScalingGroupPost(deleteAutoScalingGroupRequest);
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
 **deleteAutoScalingGroupRequest** | [**DeleteAutoScalingGroupRequest**](DeleteAutoScalingGroupRequest.md)| deleteAutoScalingGroupRequest |

### Return type

[**DeleteAutoScalingGroupResponse**](DeleteAutoScalingGroupResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="deleteAutoScalingLaunchConfigurationGet"></a>
# **deleteAutoScalingLaunchConfigurationGet**
> DeleteAutoScalingLaunchConfigurationResponse deleteAutoScalingLaunchConfigurationGet(deleteAutoScalingLaunchConfigurationRequest)



A.오토스케일링론치설정삭제

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
DeleteAutoScalingLaunchConfigurationRequest deleteAutoScalingLaunchConfigurationRequest = new DeleteAutoScalingLaunchConfigurationRequest(); // DeleteAutoScalingLaunchConfigurationRequest | deleteAutoScalingLaunchConfigurationRequest
try {
	// Handler Successful response
	ApiResponse<DeleteAutoScalingLaunchConfigurationResponse> result = apiInstance.deleteAutoScalingLaunchConfigurationGet(deleteAutoScalingLaunchConfigurationRequest);
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
 **deleteAutoScalingLaunchConfigurationRequest** | [**DeleteAutoScalingLaunchConfigurationRequest**](DeleteAutoScalingLaunchConfigurationRequest.md)| deleteAutoScalingLaunchConfigurationRequest |

### Return type

[**DeleteAutoScalingLaunchConfigurationResponse**](DeleteAutoScalingLaunchConfigurationResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="deleteAutoScalingLaunchConfigurationPost"></a>
# **deleteAutoScalingLaunchConfigurationPost**
> DeleteAutoScalingLaunchConfigurationRequest deleteAutoScalingLaunchConfigurationPost(deleteAutoScalingLaunchConfigurationRequest)



A.오토스케일링론치설정삭제

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
DeleteAutoScalingLaunchConfigurationRequest deleteAutoScalingLaunchConfigurationRequest = new DeleteAutoScalingLaunchConfigurationRequest(); // DeleteAutoScalingLaunchConfigurationRequest | deleteAutoScalingLaunchConfigurationRequest
try {
	// Handler Successful response
	ApiResponse<DeleteAutoScalingLaunchConfigurationRequest> result = apiInstance.deleteAutoScalingLaunchConfigurationPost(deleteAutoScalingLaunchConfigurationRequest);
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
 **deleteAutoScalingLaunchConfigurationRequest** | [**DeleteAutoScalingLaunchConfigurationRequest**](DeleteAutoScalingLaunchConfigurationRequest.md)| deleteAutoScalingLaunchConfigurationRequest |

### Return type

[**DeleteAutoScalingLaunchConfigurationRequest**](DeleteAutoScalingLaunchConfigurationRequest.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="deletePolicyGet"></a>
# **deletePolicyGet**
> DeletePolicyResponse deletePolicyGet(deletePolicyRequest)



F.스케일링정책삭제

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
DeletePolicyRequest deletePolicyRequest = new DeletePolicyRequest(); // DeletePolicyRequest | deletePolicyRequest
try {
	// Handler Successful response
	ApiResponse<DeletePolicyResponse> result = apiInstance.deletePolicyGet(deletePolicyRequest);
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
 **deletePolicyRequest** | [**DeletePolicyRequest**](DeletePolicyRequest.md)| deletePolicyRequest |

### Return type

[**DeletePolicyResponse**](DeletePolicyResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="deletePolicyPost"></a>
# **deletePolicyPost**
> DeletePolicyResponse deletePolicyPost(deletePolicyRequest)



F.스케일링정책삭제

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
DeletePolicyRequest deletePolicyRequest = new DeletePolicyRequest(); // DeletePolicyRequest | deletePolicyRequest
try {
	// Handler Successful response
	ApiResponse<DeletePolicyResponse> result = apiInstance.deletePolicyPost(deletePolicyRequest);
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
 **deletePolicyRequest** | [**DeletePolicyRequest**](DeletePolicyRequest.md)| deletePolicyRequest |

### Return type

[**DeletePolicyResponse**](DeletePolicyResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="deleteScheduledActionGet"></a>
# **deleteScheduledActionGet**
> DeleteScheduledActionResponse deleteScheduledActionGet(deleteScheduledActionRequest)



C.스케쥴액션삭제

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
DeleteScheduledActionRequest deleteScheduledActionRequest = new DeleteScheduledActionRequest(); // DeleteScheduledActionRequest | deleteScheduledActionRequest
try {
	// Handler Successful response
	ApiResponse<DeleteScheduledActionResponse> result = apiInstance.deleteScheduledActionGet(deleteScheduledActionRequest);
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
 **deleteScheduledActionRequest** | [**DeleteScheduledActionRequest**](DeleteScheduledActionRequest.md)| deleteScheduledActionRequest |

### Return type

[**DeleteScheduledActionResponse**](DeleteScheduledActionResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="deleteScheduledActionPost"></a>
# **deleteScheduledActionPost**
> DeleteScheduledActionResponse deleteScheduledActionPost(deleteScheduledActionRequest)



C.스케쥴액션삭제

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
DeleteScheduledActionRequest deleteScheduledActionRequest = new DeleteScheduledActionRequest(); // DeleteScheduledActionRequest | deleteScheduledActionRequest
try {
	// Handler Successful response
	ApiResponse<DeleteScheduledActionResponse> result = apiInstance.deleteScheduledActionPost(deleteScheduledActionRequest);
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
 **deleteScheduledActionRequest** | [**DeleteScheduledActionRequest**](DeleteScheduledActionRequest.md)| deleteScheduledActionRequest |

### Return type

[**DeleteScheduledActionResponse**](DeleteScheduledActionResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="executePolicyGet"></a>
# **executePolicyGet**
> ExecutePolicyResponse executePolicyGet(executePolicyRequest)



F.스케일링정책수행

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
ExecutePolicyRequest executePolicyRequest = new ExecutePolicyRequest(); // ExecutePolicyRequest | executePolicyRequest
try {
	// Handler Successful response
	ApiResponse<ExecutePolicyResponse> result = apiInstance.executePolicyGet(executePolicyRequest);
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
 **executePolicyRequest** | [**ExecutePolicyRequest**](ExecutePolicyRequest.md)| executePolicyRequest |

### Return type

[**ExecutePolicyResponse**](ExecutePolicyResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="executePolicyPost"></a>
# **executePolicyPost**
> ExecutePolicyResponse executePolicyPost(executePolicyRequest)



F.스케일링정책수행

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
ExecutePolicyRequest executePolicyRequest = new ExecutePolicyRequest(); // ExecutePolicyRequest | executePolicyRequest
try {
	// Handler Successful response
	ApiResponse<ExecutePolicyResponse> result = apiInstance.executePolicyPost(executePolicyRequest);
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
 **executePolicyRequest** | [**ExecutePolicyRequest**](ExecutePolicyRequest.md)| executePolicyRequest |

### Return type

[**ExecutePolicyResponse**](ExecutePolicyResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getAdjustmentTypeListGet"></a>
# **getAdjustmentTypeListGet**
> GetAdjustmentTypeListResponse getAdjustmentTypeListGet(getAdjustmentTypeListRequest)



F.조정유형리스트조회

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetAdjustmentTypeListRequest getAdjustmentTypeListRequest = new GetAdjustmentTypeListRequest(); // GetAdjustmentTypeListRequest | getAdjustmentTypeListRequest
try {
	// Handler Successful response
	ApiResponse<GetAdjustmentTypeListResponse> result = apiInstance.getAdjustmentTypeListGet(getAdjustmentTypeListRequest);
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
 **getAdjustmentTypeListRequest** | [**GetAdjustmentTypeListRequest**](GetAdjustmentTypeListRequest.md)| getAdjustmentTypeListRequest |

### Return type

[**GetAdjustmentTypeListResponse**](GetAdjustmentTypeListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getAdjustmentTypeListPost"></a>
# **getAdjustmentTypeListPost**
> GetAdjustmentTypeListResponse getAdjustmentTypeListPost(getAdjustmentTypeListRequest)



F.조정유형리스트조회

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetAdjustmentTypeListRequest getAdjustmentTypeListRequest = new GetAdjustmentTypeListRequest(); // GetAdjustmentTypeListRequest | getAdjustmentTypeListRequest
try {
	// Handler Successful response
	ApiResponse<GetAdjustmentTypeListResponse> result = apiInstance.getAdjustmentTypeListPost(getAdjustmentTypeListRequest);
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
 **getAdjustmentTypeListRequest** | [**GetAdjustmentTypeListRequest**](GetAdjustmentTypeListRequest.md)| getAdjustmentTypeListRequest |

### Return type

[**GetAdjustmentTypeListResponse**](GetAdjustmentTypeListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getAutoScalingActivityLogListGet"></a>
# **getAutoScalingActivityLogListGet**
> GetAutoScalingActivityLogListResponse getAutoScalingActivityLogListGet(getAutoScalingActivityLogListRequest)



E.액티비티로그리스트조회

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetAutoScalingActivityLogListRequest getAutoScalingActivityLogListRequest = new GetAutoScalingActivityLogListRequest(); // GetAutoScalingActivityLogListRequest | getAutoScalingActivityLogListRequest
try {
	// Handler Successful response
	ApiResponse<GetAutoScalingActivityLogListResponse> result = apiInstance.getAutoScalingActivityLogListGet(getAutoScalingActivityLogListRequest);
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
 **getAutoScalingActivityLogListRequest** | [**GetAutoScalingActivityLogListRequest**](GetAutoScalingActivityLogListRequest.md)| getAutoScalingActivityLogListRequest |

### Return type

[**GetAutoScalingActivityLogListResponse**](GetAutoScalingActivityLogListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getAutoScalingActivityLogListPost"></a>
# **getAutoScalingActivityLogListPost**
> GetAutoScalingActivityLogListResponse getAutoScalingActivityLogListPost(getAutoScalingActivityLogListRequest)



E.액티비티로그리스트조회

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetAutoScalingActivityLogListRequest getAutoScalingActivityLogListRequest = new GetAutoScalingActivityLogListRequest(); // GetAutoScalingActivityLogListRequest | getAutoScalingActivityLogListRequest
try {
	// Handler Successful response
	ApiResponse<GetAutoScalingActivityLogListResponse> result = apiInstance.getAutoScalingActivityLogListPost(getAutoScalingActivityLogListRequest);
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
 **getAutoScalingActivityLogListRequest** | [**GetAutoScalingActivityLogListRequest**](GetAutoScalingActivityLogListRequest.md)| getAutoScalingActivityLogListRequest |

### Return type

[**GetAutoScalingActivityLogListResponse**](GetAutoScalingActivityLogListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getAutoScalingConfigurationLogListGet"></a>
# **getAutoScalingConfigurationLogListGet**
> GetAutoScalingConfigurationLogListResponse getAutoScalingConfigurationLogListGet(getAutoScalingConfigurationLogListRequest)



E.오토스케일링설정로그리스트조회

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetAutoScalingConfigurationLogListRequest getAutoScalingConfigurationLogListRequest = new GetAutoScalingConfigurationLogListRequest(); // GetAutoScalingConfigurationLogListRequest | getAutoScalingConfigurationLogListRequest 
try {
	// Handler Successful response
	ApiResponse<GetAutoScalingConfigurationLogListResponse> result = apiInstance.getAutoScalingConfigurationLogListGet(getAutoScalingConfigurationLogListRequest);
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
 **getAutoScalingConfigurationLogListRequest** | [**GetAutoScalingConfigurationLogListRequest**](GetAutoScalingConfigurationLogListRequest.md)| getAutoScalingConfigurationLogListRequest  |

### Return type

[**GetAutoScalingConfigurationLogListResponse**](GetAutoScalingConfigurationLogListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getAutoScalingConfigurationLogListPost"></a>
# **getAutoScalingConfigurationLogListPost**
> GetAutoScalingConfigurationLogListResponse getAutoScalingConfigurationLogListPost(getAutoScalingConfigurationLogListRequest)



E.오토스케일링설정로그리스트조회

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetAutoScalingConfigurationLogListRequest getAutoScalingConfigurationLogListRequest = new GetAutoScalingConfigurationLogListRequest(); // GetAutoScalingConfigurationLogListRequest | getAutoScalingConfigurationLogListRequest
try {
	// Handler Successful response
	ApiResponse<GetAutoScalingConfigurationLogListResponse> result = apiInstance.getAutoScalingConfigurationLogListPost(getAutoScalingConfigurationLogListRequest);
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
 **getAutoScalingConfigurationLogListRequest** | [**GetAutoScalingConfigurationLogListRequest**](GetAutoScalingConfigurationLogListRequest.md)| getAutoScalingConfigurationLogListRequest |

### Return type

[**GetAutoScalingConfigurationLogListResponse**](GetAutoScalingConfigurationLogListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getAutoScalingGroupListGet"></a>
# **getAutoScalingGroupListGet**
> GetAutoScalingGroupListResponse getAutoScalingGroupListGet(getAutoScalingGroupListRequest)



B.오토스케일링그룹리스트조회

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetAutoScalingGroupListRequest getAutoScalingGroupListRequest = new GetAutoScalingGroupListRequest(); // GetAutoScalingGroupListRequest | getAutoScalingGroupListRequest
try {
	// Handler Successful response
	ApiResponse<GetAutoScalingGroupListResponse> result = apiInstance.getAutoScalingGroupListGet(getAutoScalingGroupListRequest);
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
 **getAutoScalingGroupListRequest** | [**GetAutoScalingGroupListRequest**](GetAutoScalingGroupListRequest.md)| getAutoScalingGroupListRequest |

### Return type

[**GetAutoScalingGroupListResponse**](GetAutoScalingGroupListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getAutoScalingGroupListPost"></a>
# **getAutoScalingGroupListPost**
> GetAutoScalingGroupListResponse getAutoScalingGroupListPost(getAutoScalingGroupListRequest)



B.오토스케일링그룹리스트조회

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetAutoScalingGroupListRequest getAutoScalingGroupListRequest = new GetAutoScalingGroupListRequest(); // GetAutoScalingGroupListRequest | getAutoScalingGroupListRequest
try {
	// Handler Successful response
	ApiResponse<GetAutoScalingGroupListResponse> result = apiInstance.getAutoScalingGroupListPost(getAutoScalingGroupListRequest);
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
 **getAutoScalingGroupListRequest** | [**GetAutoScalingGroupListRequest**](GetAutoScalingGroupListRequest.md)| getAutoScalingGroupListRequest |

### Return type

[**GetAutoScalingGroupListResponse**](GetAutoScalingGroupListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getAutoScalingPolicyListGet"></a>
# **getAutoScalingPolicyListGet**
> GetAutoScalingPolicyListResponse getAutoScalingPolicyListGet(getAutoScalingPolicyListRequest)



F.오토스케일링정책리스트조회

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetAutoScalingPolicyListRequest getAutoScalingPolicyListRequest = new GetAutoScalingPolicyListRequest(); // GetAutoScalingPolicyListRequest | getAutoScalingPolicyListRequest
try {
	// Handler Successful response
	ApiResponse<GetAutoScalingPolicyListResponse> result = apiInstance.getAutoScalingPolicyListGet(getAutoScalingPolicyListRequest);
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
 **getAutoScalingPolicyListRequest** | [**GetAutoScalingPolicyListRequest**](GetAutoScalingPolicyListRequest.md)| getAutoScalingPolicyListRequest |

### Return type

[**GetAutoScalingPolicyListResponse**](GetAutoScalingPolicyListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getAutoScalingPolicyListPost"></a>
# **getAutoScalingPolicyListPost**
> GetAutoScalingPolicyListResponse getAutoScalingPolicyListPost(getAutoScalingPolicyListRequest)



F.오토스케일링정책리스트조회

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetAutoScalingPolicyListRequest getAutoScalingPolicyListRequest = new GetAutoScalingPolicyListRequest(); // GetAutoScalingPolicyListRequest | getAutoScalingPolicyListRequest
try {
	// Handler Successful response
	ApiResponse<GetAutoScalingPolicyListResponse> result = apiInstance.getAutoScalingPolicyListPost(getAutoScalingPolicyListRequest);
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
 **getAutoScalingPolicyListRequest** | [**GetAutoScalingPolicyListRequest**](GetAutoScalingPolicyListRequest.md)| getAutoScalingPolicyListRequest |

### Return type

[**GetAutoScalingPolicyListResponse**](GetAutoScalingPolicyListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getLaunchConfigurationListGet"></a>
# **getLaunchConfigurationListGet**
> GetLaunchConfigurationListResponse getLaunchConfigurationListGet(getLaunchConfigurationListRequest)



A.론치설정리스트조회

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetLaunchConfigurationListRequest getLaunchConfigurationListRequest = new GetLaunchConfigurationListRequest(); // GetLaunchConfigurationListRequest | getLaunchConfigurationListRequest
try {
	// Handler Successful response
	ApiResponse<GetLaunchConfigurationListResponse> result = apiInstance.getLaunchConfigurationListGet(getLaunchConfigurationListRequest);
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
 **getLaunchConfigurationListRequest** | [**GetLaunchConfigurationListRequest**](GetLaunchConfigurationListRequest.md)| getLaunchConfigurationListRequest |

### Return type

[**GetLaunchConfigurationListResponse**](GetLaunchConfigurationListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getLaunchConfigurationListPost"></a>
# **getLaunchConfigurationListPost**
> GetLaunchConfigurationListResponse getLaunchConfigurationListPost(getLaunchConfigurationListRequest)



A.론치설정리스트조회

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetLaunchConfigurationListRequest getLaunchConfigurationListRequest = new GetLaunchConfigurationListRequest(); // GetLaunchConfigurationListRequest | getLaunchConfigurationListRequest
try {
	// Handler Successful response
	ApiResponse<GetLaunchConfigurationListResponse> result = apiInstance.getLaunchConfigurationListPost(getLaunchConfigurationListRequest);
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
 **getLaunchConfigurationListRequest** | [**GetLaunchConfigurationListRequest**](GetLaunchConfigurationListRequest.md)| getLaunchConfigurationListRequest |

### Return type

[**GetLaunchConfigurationListResponse**](GetLaunchConfigurationListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getScalingProcessTypeListGet"></a>
# **getScalingProcessTypeListGet**
> GetScalingProcessTypeListResponse getScalingProcessTypeListGet(getScalingProcessTypeListRequest)



D.프로세스구분리스트조회

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetScalingProcessTypeListRequest getScalingProcessTypeListRequest = new GetScalingProcessTypeListRequest(); // GetScalingProcessTypeListRequest | getScalingProcessTypeListRequest
try {
	// Handler Successful response
	ApiResponse<GetScalingProcessTypeListResponse> result = apiInstance.getScalingProcessTypeListGet(getScalingProcessTypeListRequest);
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
 **getScalingProcessTypeListRequest** | [**GetScalingProcessTypeListRequest**](GetScalingProcessTypeListRequest.md)| getScalingProcessTypeListRequest |

### Return type

[**GetScalingProcessTypeListResponse**](GetScalingProcessTypeListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getScalingProcessTypeListPost"></a>
# **getScalingProcessTypeListPost**
> GetScalingProcessTypeListResponse getScalingProcessTypeListPost(getScalingProcessTypeListRequest)



D.프로세스구분리스트조회

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetScalingProcessTypeListRequest getScalingProcessTypeListRequest = new GetScalingProcessTypeListRequest(); // GetScalingProcessTypeListRequest | getScalingProcessTypeListRequest
try {
	// Handler Successful response
	ApiResponse<GetScalingProcessTypeListResponse> result = apiInstance.getScalingProcessTypeListPost(getScalingProcessTypeListRequest);
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
 **getScalingProcessTypeListRequest** | [**GetScalingProcessTypeListRequest**](GetScalingProcessTypeListRequest.md)| getScalingProcessTypeListRequest |

### Return type

[**GetScalingProcessTypeListResponse**](GetScalingProcessTypeListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getScheduledActionListGet"></a>
# **getScheduledActionListGet**
> GetScheduledActionListResponse getScheduledActionListGet(getScheduledActionListRequest)



C.스케쥴액션리스트조회

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetScheduledActionListRequest getScheduledActionListRequest = new GetScheduledActionListRequest(); // GetScheduledActionListRequest | getScheduledActionListRequest
try {
	// Handler Successful response
	ApiResponse<GetScheduledActionListResponse> result = apiInstance.getScheduledActionListGet(getScheduledActionListRequest);
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
 **getScheduledActionListRequest** | [**GetScheduledActionListRequest**](GetScheduledActionListRequest.md)| getScheduledActionListRequest |

### Return type

[**GetScheduledActionListResponse**](GetScheduledActionListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="getScheduledActionListPost"></a>
# **getScheduledActionListPost**
> GetScheduledActionListResponse getScheduledActionListPost(getScheduledActionListRequest)



C.스케쥴액션리스트조회

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
GetScheduledActionListRequest getScheduledActionListRequest = new GetScheduledActionListRequest(); // GetScheduledActionListRequest | getScheduledActionListRequest
try {
	// Handler Successful response
	ApiResponse<GetScheduledActionListResponse> result = apiInstance.getScheduledActionListPost(getScheduledActionListRequest);
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
 **getScheduledActionListRequest** | [**GetScheduledActionListRequest**](GetScheduledActionListRequest.md)| getScheduledActionListRequest |

### Return type

[**GetScheduledActionListResponse**](GetScheduledActionListResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="putScalingPolicyGet"></a>
# **putScalingPolicyGet**
> PutScalingPolicyResponse putScalingPolicyGet(putScalingPolicyRequest)



F.스케일링정책생성/변경

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
PutScalingPolicyRequest putScalingPolicyRequest = new PutScalingPolicyRequest(); // PutScalingPolicyRequest | putScalingPolicyRequest
try {
	// Handler Successful response
	ApiResponse<PutScalingPolicyResponse> result = apiInstance.putScalingPolicyGet(putScalingPolicyRequest);
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
 **putScalingPolicyRequest** | [**PutScalingPolicyRequest**](PutScalingPolicyRequest.md)| putScalingPolicyRequest |

### Return type

[**PutScalingPolicyResponse**](PutScalingPolicyResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="putScalingPolicyPost"></a>
# **putScalingPolicyPost**
> PutScalingPolicyResponse putScalingPolicyPost(putScalingPolicyRequest)



F.스케일링정책생성/변경

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
PutScalingPolicyRequest putScalingPolicyRequest = new PutScalingPolicyRequest(); // PutScalingPolicyRequest | putScalingPolicyRequest
try {
	// Handler Successful response
	ApiResponse<PutScalingPolicyResponse> result = apiInstance.putScalingPolicyPost(putScalingPolicyRequest);
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
 **putScalingPolicyRequest** | [**PutScalingPolicyRequest**](PutScalingPolicyRequest.md)| putScalingPolicyRequest |

### Return type

[**PutScalingPolicyResponse**](PutScalingPolicyResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="putScheduledUpdateGroupActionGet"></a>
# **putScheduledUpdateGroupActionGet**
> PutScheduledUpdateGroupActionResponse putScheduledUpdateGroupActionGet(putScheduledUpdateGroupActionRequest)



C.스케쥴액션생성|수정

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest = new PutScheduledUpdateGroupActionRequest(); // PutScheduledUpdateGroupActionRequest | putScheduledUpdateGroupActionRequest
try {
	// Handler Successful response
	ApiResponse<PutScheduledUpdateGroupActionResponse> result = apiInstance.putScheduledUpdateGroupActionGet(putScheduledUpdateGroupActionRequest);
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
 **putScheduledUpdateGroupActionRequest** | [**PutScheduledUpdateGroupActionRequest**](PutScheduledUpdateGroupActionRequest.md)| putScheduledUpdateGroupActionRequest |

### Return type

[**PutScheduledUpdateGroupActionResponse**](PutScheduledUpdateGroupActionResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="putScheduledUpdateGroupActionPost"></a>
# **putScheduledUpdateGroupActionPost**
> PutScheduledUpdateGroupActionResponse putScheduledUpdateGroupActionPost(putScheduledUpdateGroupActionRequest)



C.스케쥴액션생성|수정

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest = new PutScheduledUpdateGroupActionRequest(); // PutScheduledUpdateGroupActionRequest | putScheduledUpdateGroupActionRequest
try {
	// Handler Successful response
	ApiResponse<PutScheduledUpdateGroupActionResponse> result = apiInstance.putScheduledUpdateGroupActionPost(putScheduledUpdateGroupActionRequest);
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
 **putScheduledUpdateGroupActionRequest** | [**PutScheduledUpdateGroupActionRequest**](PutScheduledUpdateGroupActionRequest.md)| putScheduledUpdateGroupActionRequest |

### Return type

[**PutScheduledUpdateGroupActionResponse**](PutScheduledUpdateGroupActionResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="resumeProcessesGet"></a>
# **resumeProcessesGet**
> ResumeProcessesResponse resumeProcessesGet(resumeProcessesRequest)



D.프로세스재개

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
ResumeProcessesRequest resumeProcessesRequest = new ResumeProcessesRequest(); // ResumeProcessesRequest | resumeProcessesRequest
try {
	// Handler Successful response
	ApiResponse<ResumeProcessesResponse> result = apiInstance.resumeProcessesGet(resumeProcessesRequest);
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
 **resumeProcessesRequest** | [**ResumeProcessesRequest**](ResumeProcessesRequest.md)| resumeProcessesRequest |

### Return type

[**ResumeProcessesResponse**](ResumeProcessesResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="resumeProcessesPost"></a>
# **resumeProcessesPost**
> ResumeProcessesResponse resumeProcessesPost(resumeProcessesRequest)



D.프로세스재개

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
ResumeProcessesRequest resumeProcessesRequest = new ResumeProcessesRequest(); // ResumeProcessesRequest | resumeProcessesRequest
try {
	// Handler Successful response
	ApiResponse<ResumeProcessesResponse> result = apiInstance.resumeProcessesPost(resumeProcessesRequest);
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
 **resumeProcessesRequest** | [**ResumeProcessesRequest**](ResumeProcessesRequest.md)| resumeProcessesRequest |

### Return type

[**ResumeProcessesResponse**](ResumeProcessesResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="setDesiredCapacityGet"></a>
# **setDesiredCapacityGet**
> SetDesiredCapacityResponse setDesiredCapacityGet(setDesiredCapacityRequest)



B.기대용량치갱신

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
SetDesiredCapacityRequest setDesiredCapacityRequest = new SetDesiredCapacityRequest(); // SetDesiredCapacityRequest | setDesiredCapacityRequest
try {
	// Handler Successful response
	ApiResponse<SetDesiredCapacityResponse> result = apiInstance.setDesiredCapacityGet(setDesiredCapacityRequest);
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
 **setDesiredCapacityRequest** | [**SetDesiredCapacityRequest**](SetDesiredCapacityRequest.md)| setDesiredCapacityRequest |

### Return type

[**SetDesiredCapacityResponse**](SetDesiredCapacityResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="setDesiredCapacityPost"></a>
# **setDesiredCapacityPost**
> SetDesiredCapacityResponse setDesiredCapacityPost(setDesiredCapacityRequest)



B.기대용량치갱신

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
SetDesiredCapacityRequest setDesiredCapacityRequest = new SetDesiredCapacityRequest(); // SetDesiredCapacityRequest | setDesiredCapacityRequest
try {
	// Handler Successful response
	ApiResponse<SetDesiredCapacityResponse> result = apiInstance.setDesiredCapacityPost(setDesiredCapacityRequest);
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
 **setDesiredCapacityRequest** | [**SetDesiredCapacityRequest**](SetDesiredCapacityRequest.md)| setDesiredCapacityRequest |

### Return type

[**SetDesiredCapacityResponse**](SetDesiredCapacityResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="setServerInstanceHealthGet"></a>
# **setServerInstanceHealthGet**
> SetServerInstanceHealthResponse setServerInstanceHealthGet(setServerInstanceHealthRequest)



B.서버인스턴스헬스상태갱신

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
SetServerInstanceHealthRequest setServerInstanceHealthRequest = new SetServerInstanceHealthRequest(); // SetServerInstanceHealthRequest | setServerInstanceHealthRequest
try {
	// Handler Successful response
	ApiResponse<SetServerInstanceHealthResponse> result = apiInstance.setServerInstanceHealthGet(setServerInstanceHealthRequest);
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
 **setServerInstanceHealthRequest** | [**SetServerInstanceHealthRequest**](SetServerInstanceHealthRequest.md)| setServerInstanceHealthRequest |

### Return type

[**SetServerInstanceHealthResponse**](SetServerInstanceHealthResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="setServerInstanceHealthPost"></a>
# **setServerInstanceHealthPost**
> SetServerInstanceHealthResponse setServerInstanceHealthPost(setServerInstanceHealthRequest)



B.서버인스턴스헬스상태갱신

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
SetServerInstanceHealthRequest setServerInstanceHealthRequest = new SetServerInstanceHealthRequest(); // SetServerInstanceHealthRequest | setServerInstanceHealthRequest
try {
	// Handler Successful response
	ApiResponse<SetServerInstanceHealthResponse> result = apiInstance.setServerInstanceHealthPost(setServerInstanceHealthRequest);
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
 **setServerInstanceHealthRequest** | [**SetServerInstanceHealthRequest**](SetServerInstanceHealthRequest.md)| setServerInstanceHealthRequest |

### Return type

[**SetServerInstanceHealthResponse**](SetServerInstanceHealthResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="suspendProcessesGet"></a>
# **suspendProcessesGet**
> SuspendProcessesResponse suspendProcessesGet(suspendProcessesRequest)



D.프로세스보류

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
SuspendProcessesRequest suspendProcessesRequest = new SuspendProcessesRequest(); // SuspendProcessesRequest | suspendProcessesRequest
try {
	// Handler Successful response
	ApiResponse<SuspendProcessesResponse> result = apiInstance.suspendProcessesGet(suspendProcessesRequest);
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
 **suspendProcessesRequest** | [**SuspendProcessesRequest**](SuspendProcessesRequest.md)| suspendProcessesRequest |

### Return type

[**SuspendProcessesResponse**](SuspendProcessesResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="suspendProcessesPost"></a>
# **suspendProcessesPost**
> SuspendProcessesResponse suspendProcessesPost(suspendProcessesRequest)



D.프로세스보류

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
SuspendProcessesRequest suspendProcessesRequest = new SuspendProcessesRequest(); // SuspendProcessesRequest | suspendProcessesRequest
try {
	// Handler Successful response
	ApiResponse<SuspendProcessesResponse> result = apiInstance.suspendProcessesPost(suspendProcessesRequest);
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
 **suspendProcessesRequest** | [**SuspendProcessesRequest**](SuspendProcessesRequest.md)| suspendProcessesRequest |

### Return type

[**SuspendProcessesResponse**](SuspendProcessesResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="terminateServerInstanceInAutoScalingGroupGet"></a>
# **terminateServerInstanceInAutoScalingGroupGet**
> TerminateServerInstanceInAutoScalingGroupResponse terminateServerInstanceInAutoScalingGroupGet(terminateServerInstanceInAutoScalingGroupRequest)



B.오토스케일링그룹에속한서버인스턴스삭제

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
TerminateServerInstanceInAutoScalingGroupRequest terminateServerInstanceInAutoScalingGroupRequest = new TerminateServerInstanceInAutoScalingGroupRequest(); // TerminateServerInstanceInAutoScalingGroupRequest | terminateServerInstanceInAutoScalingGroupRequest
try {
	// Handler Successful response
	ApiResponse<TerminateServerInstanceInAutoScalingGroupResponse> result = apiInstance.terminateServerInstanceInAutoScalingGroupGet(terminateServerInstanceInAutoScalingGroupRequest);
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
 **terminateServerInstanceInAutoScalingGroupRequest** | [**TerminateServerInstanceInAutoScalingGroupRequest**](TerminateServerInstanceInAutoScalingGroupRequest.md)| terminateServerInstanceInAutoScalingGroupRequest |

### Return type

[**TerminateServerInstanceInAutoScalingGroupResponse**](TerminateServerInstanceInAutoScalingGroupResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="terminateServerInstanceInAutoScalingGroupPost"></a>
# **terminateServerInstanceInAutoScalingGroupPost**
> TerminateServerInstanceInAutoScalingGroupResponse terminateServerInstanceInAutoScalingGroupPost(terminateServerInstanceInAutoScalingGroupRequest)



B.오토스케일링그룹에속한서버인스턴스삭제

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
TerminateServerInstanceInAutoScalingGroupRequest terminateServerInstanceInAutoScalingGroupRequest = new TerminateServerInstanceInAutoScalingGroupRequest(); // TerminateServerInstanceInAutoScalingGroupRequest | terminateServerInstanceInAutoScalingGroupRequest
try {
	// Handler Successful response
	ApiResponse<TerminateServerInstanceInAutoScalingGroupResponse> result = apiInstance.terminateServerInstanceInAutoScalingGroupPost(terminateServerInstanceInAutoScalingGroupRequest);
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
 **terminateServerInstanceInAutoScalingGroupRequest** | [**TerminateServerInstanceInAutoScalingGroupRequest**](TerminateServerInstanceInAutoScalingGroupRequest.md)| terminateServerInstanceInAutoScalingGroupRequest |

### Return type

[**TerminateServerInstanceInAutoScalingGroupResponse**](TerminateServerInstanceInAutoScalingGroupResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="updateAutoScalingGroupGet"></a>
# **updateAutoScalingGroupGet**
> UpdateAutoScalingGroupResponse updateAutoScalingGroupGet(updateAutoScalingGroupRequest)



B.오토스케일링그룹수정

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest = new UpdateAutoScalingGroupRequest(); // UpdateAutoScalingGroupRequest | updateAutoScalingGroupRequest
try {
	// Handler Successful response
	ApiResponse<UpdateAutoScalingGroupResponse> result = apiInstance.updateAutoScalingGroupGet(updateAutoScalingGroupRequest);
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
 **updateAutoScalingGroupRequest** | [**UpdateAutoScalingGroupRequest**](UpdateAutoScalingGroupRequest.md)| updateAutoScalingGroupRequest |

### Return type

[**UpdateAutoScalingGroupResponse**](UpdateAutoScalingGroupResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="updateAutoScalingGroupPost"></a>
# **updateAutoScalingGroupPost**
> UpdateAutoScalingGroupResponse updateAutoScalingGroupPost(updateAutoScalingGroupRequest)



B.오토스케일링그룹수정

### Example
```java
// Import classes:
// import com.ncloud.autoscaling.ApiClient;
// import com.ncloud.autoscaling.ApiResponse;
// import com.ncloud.autoscaling.auth.PropertiesFileCredentialsProvider;
// import com.ncloud.autoscaling.marshaller.JsonMarshaller;
// import com.ncloud.autoscaling.marshaller.XmlMarshaller;
// import com.ncloud.autoscaling.marshaller.FormMarshaller;
// import com.ncloud.autoscaling.exception.ApiException;
// import com.ncloud.autoscaling.exception.SdkException;
// import com.ncloud.autoscaling.model.*;

// import com.ncloud.autoscaling.api.V2Api;

ApiClient apiClient = new ApiClient.ApiClientBuilder()
	.addMarshaller(JsonMarshaller.getInstance())
	.addMarshaller(XmlMarshaller.getInstance())
	.addMarshaller(FormMarshaller.getInstance())
	.setCredentials(new PropertiesFileCredentialsProvider("your-credentials-properties-file").getCredentials())
	.setLogging(true)
	.build();

V2Api apiInstance = new V2Api(apiClient);
UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest = new UpdateAutoScalingGroupRequest(); // UpdateAutoScalingGroupRequest | updateAutoScalingGroupRequest
try {
	// Handler Successful response
	ApiResponse<UpdateAutoScalingGroupResponse> result = apiInstance.updateAutoScalingGroupPost(updateAutoScalingGroupRequest);
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
 **updateAutoScalingGroupRequest** | [**UpdateAutoScalingGroupRequest**](UpdateAutoScalingGroupRequest.md)| updateAutoScalingGroupRequest |

### Return type

[**UpdateAutoScalingGroupResponse**](UpdateAutoScalingGroupResponse.md)

### Authorization

[x-ncp-iam](../README.md#x-ncp-iam)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

