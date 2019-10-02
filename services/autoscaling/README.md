# autoscaling

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
	<groupId>com.ncloud</groupId>
	<artifactId>autoscaling</artifactId>
	<version>1.0.0</version>
	<scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

	mvn package

Then manually install the following JARs:

* target/autoscaling-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and create a credentials properties file.

```
type=iam
apiKey=your-api-key
accessKey=your-access-key
secretKey=your-secret-key
```

And execute the following Java code:

```java

import com.ncloud.autoscaling.*;
import com.ncloud.autoscaling.auth.*;
import com.ncloud.autoscaling.marshaller.*;
import com.ncloud.autoscaling.exception.*;
import com.ncloud.autoscaling.model.*;
import com.ncloud.autoscaling.api.V2Api;

public class V2ApiExample {

	public static void main(String[] args) {
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
	}
}

```

## Documentation for API Endpoints

All URIs are relative to *https://ncloud.apigw.ntruss.com/autoscaling/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*V2Api* | [**createAutoScalingGroupGet**](docs/V2Api.md#createAutoScalingGroupGet) | **GET** /createAutoScalingGroup | 
*V2Api* | [**createAutoScalingGroupPost**](docs/V2Api.md#createAutoScalingGroupPost) | **POST** /createAutoScalingGroup | 
*V2Api* | [**createLaunchConfigurationGet**](docs/V2Api.md#createLaunchConfigurationGet) | **GET** /createLaunchConfiguration | 
*V2Api* | [**createLaunchConfigurationPost**](docs/V2Api.md#createLaunchConfigurationPost) | **POST** /createLaunchConfiguration | 
*V2Api* | [**deleteAutoScalingGroupGet**](docs/V2Api.md#deleteAutoScalingGroupGet) | **GET** /deleteAutoScalingGroup | 
*V2Api* | [**deleteAutoScalingGroupPost**](docs/V2Api.md#deleteAutoScalingGroupPost) | **POST** /deleteAutoScalingGroup | 
*V2Api* | [**deleteAutoScalingLaunchConfigurationGet**](docs/V2Api.md#deleteAutoScalingLaunchConfigurationGet) | **GET** /deleteAutoScalingLaunchConfiguration | 
*V2Api* | [**deleteAutoScalingLaunchConfigurationPost**](docs/V2Api.md#deleteAutoScalingLaunchConfigurationPost) | **POST** /deleteAutoScalingLaunchConfiguration | 
*V2Api* | [**deletePolicyGet**](docs/V2Api.md#deletePolicyGet) | **GET** /deletePolicy | 
*V2Api* | [**deletePolicyPost**](docs/V2Api.md#deletePolicyPost) | **POST** /deletePolicy | 
*V2Api* | [**deleteScheduledActionGet**](docs/V2Api.md#deleteScheduledActionGet) | **GET** /deleteScheduledAction | 
*V2Api* | [**deleteScheduledActionPost**](docs/V2Api.md#deleteScheduledActionPost) | **POST** /deleteScheduledAction | 
*V2Api* | [**executePolicyGet**](docs/V2Api.md#executePolicyGet) | **GET** /executePolicy | 
*V2Api* | [**executePolicyPost**](docs/V2Api.md#executePolicyPost) | **POST** /executePolicy | 
*V2Api* | [**getAdjustmentTypeListGet**](docs/V2Api.md#getAdjustmentTypeListGet) | **GET** /getAdjustmentTypeList | 
*V2Api* | [**getAdjustmentTypeListPost**](docs/V2Api.md#getAdjustmentTypeListPost) | **POST** /getAdjustmentTypeList | 
*V2Api* | [**getAutoScalingActivityLogListGet**](docs/V2Api.md#getAutoScalingActivityLogListGet) | **GET** /getAutoScalingActivityLogList | 
*V2Api* | [**getAutoScalingActivityLogListPost**](docs/V2Api.md#getAutoScalingActivityLogListPost) | **POST** /getAutoScalingActivityLogList | 
*V2Api* | [**getAutoScalingConfigurationLogListGet**](docs/V2Api.md#getAutoScalingConfigurationLogListGet) | **GET** /getAutoScalingConfigurationLogList | 
*V2Api* | [**getAutoScalingConfigurationLogListPost**](docs/V2Api.md#getAutoScalingConfigurationLogListPost) | **POST** /getAutoScalingConfigurationLogList | 
*V2Api* | [**getAutoScalingGroupListGet**](docs/V2Api.md#getAutoScalingGroupListGet) | **GET** /getAutoScalingGroupList | 
*V2Api* | [**getAutoScalingGroupListPost**](docs/V2Api.md#getAutoScalingGroupListPost) | **POST** /getAutoScalingGroupList | 
*V2Api* | [**getAutoScalingPolicyListGet**](docs/V2Api.md#getAutoScalingPolicyListGet) | **GET** /getAutoScalingPolicyList | 
*V2Api* | [**getAutoScalingPolicyListPost**](docs/V2Api.md#getAutoScalingPolicyListPost) | **POST** /getAutoScalingPolicyList | 
*V2Api* | [**getLaunchConfigurationListGet**](docs/V2Api.md#getLaunchConfigurationListGet) | **GET** /getLaunchConfigurationList | 
*V2Api* | [**getLaunchConfigurationListPost**](docs/V2Api.md#getLaunchConfigurationListPost) | **POST** /getLaunchConfigurationList | 
*V2Api* | [**getScalingProcessTypeListGet**](docs/V2Api.md#getScalingProcessTypeListGet) | **GET** /getScalingProcessTypeList | 
*V2Api* | [**getScalingProcessTypeListPost**](docs/V2Api.md#getScalingProcessTypeListPost) | **POST** /getScalingProcessTypeList | 
*V2Api* | [**getScheduledActionListGet**](docs/V2Api.md#getScheduledActionListGet) | **GET** /getScheduledActionList | 
*V2Api* | [**getScheduledActionListPost**](docs/V2Api.md#getScheduledActionListPost) | **POST** /getScheduledActionList | 
*V2Api* | [**putScalingPolicyGet**](docs/V2Api.md#putScalingPolicyGet) | **GET** /putScalingPolicy | 
*V2Api* | [**putScalingPolicyPost**](docs/V2Api.md#putScalingPolicyPost) | **POST** /putScalingPolicy | 
*V2Api* | [**putScheduledUpdateGroupActionGet**](docs/V2Api.md#putScheduledUpdateGroupActionGet) | **GET** /putScheduledUpdateGroupAction | 
*V2Api* | [**putScheduledUpdateGroupActionPost**](docs/V2Api.md#putScheduledUpdateGroupActionPost) | **POST** /putScheduledUpdateGroupAction | 
*V2Api* | [**resumeProcessesGet**](docs/V2Api.md#resumeProcessesGet) | **GET** /resumeProcesses | 
*V2Api* | [**resumeProcessesPost**](docs/V2Api.md#resumeProcessesPost) | **POST** /resumeProcesses | 
*V2Api* | [**setDesiredCapacityGet**](docs/V2Api.md#setDesiredCapacityGet) | **GET** /setDesiredCapacity | 
*V2Api* | [**setDesiredCapacityPost**](docs/V2Api.md#setDesiredCapacityPost) | **POST** /setDesiredCapacity | 
*V2Api* | [**setServerInstanceHealthGet**](docs/V2Api.md#setServerInstanceHealthGet) | **GET** /setServerInstanceHealth | 
*V2Api* | [**setServerInstanceHealthPost**](docs/V2Api.md#setServerInstanceHealthPost) | **POST** /setServerInstanceHealth | 
*V2Api* | [**suspendProcessesGet**](docs/V2Api.md#suspendProcessesGet) | **GET** /suspendProcesses | 
*V2Api* | [**suspendProcessesPost**](docs/V2Api.md#suspendProcessesPost) | **POST** /suspendProcesses | 
*V2Api* | [**terminateServerInstanceInAutoScalingGroupGet**](docs/V2Api.md#terminateServerInstanceInAutoScalingGroupGet) | **GET** /terminateServerInstanceInAutoScalingGroup | 
*V2Api* | [**terminateServerInstanceInAutoScalingGroupPost**](docs/V2Api.md#terminateServerInstanceInAutoScalingGroupPost) | **POST** /terminateServerInstanceInAutoScalingGroup | 
*V2Api* | [**updateAutoScalingGroupGet**](docs/V2Api.md#updateAutoScalingGroupGet) | **GET** /updateAutoScalingGroup | 
*V2Api* | [**updateAutoScalingGroupPost**](docs/V2Api.md#updateAutoScalingGroupPost) | **POST** /updateAutoScalingGroup | 


## Documentation for Models

 - [AccessControlGroup](docs/AccessControlGroup.md)
 - [ActivityLog](docs/ActivityLog.md)
 - [AdjustmentType](docs/AdjustmentType.md)
 - [AutoScalingGroup](docs/AutoScalingGroup.md)
 - [CommonCode](docs/CommonCode.md)
 - [ConfigurationLog](docs/ConfigurationLog.md)
 - [CreateAutoScalingGroupRequest](docs/CreateAutoScalingGroupRequest.md)
 - [CreateAutoScalingGroupResponse](docs/CreateAutoScalingGroupResponse.md)
 - [CreateLaunchConfigurationRequest](docs/CreateLaunchConfigurationRequest.md)
 - [CreateLaunchConfigurationResponse](docs/CreateLaunchConfigurationResponse.md)
 - [DeleteAutoScalingGroupRequest](docs/DeleteAutoScalingGroupRequest.md)
 - [DeleteAutoScalingGroupResponse](docs/DeleteAutoScalingGroupResponse.md)
 - [DeleteAutoScalingLaunchConfigurationRequest](docs/DeleteAutoScalingLaunchConfigurationRequest.md)
 - [DeleteAutoScalingLaunchConfigurationResponse](docs/DeleteAutoScalingLaunchConfigurationResponse.md)
 - [DeletePolicyRequest](docs/DeletePolicyRequest.md)
 - [DeletePolicyResponse](docs/DeletePolicyResponse.md)
 - [DeleteScheduledActionRequest](docs/DeleteScheduledActionRequest.md)
 - [DeleteScheduledActionResponse](docs/DeleteScheduledActionResponse.md)
 - [ExecutePolicyRequest](docs/ExecutePolicyRequest.md)
 - [ExecutePolicyResponse](docs/ExecutePolicyResponse.md)
 - [GetAdjustmentTypeListRequest](docs/GetAdjustmentTypeListRequest.md)
 - [GetAdjustmentTypeListResponse](docs/GetAdjustmentTypeListResponse.md)
 - [GetAutoScalingActivityLogListRequest](docs/GetAutoScalingActivityLogListRequest.md)
 - [GetAutoScalingActivityLogListResponse](docs/GetAutoScalingActivityLogListResponse.md)
 - [GetAutoScalingConfigurationLogListRequest](docs/GetAutoScalingConfigurationLogListRequest.md)
 - [GetAutoScalingConfigurationLogListResponse](docs/GetAutoScalingConfigurationLogListResponse.md)
 - [GetAutoScalingGroupListRequest](docs/GetAutoScalingGroupListRequest.md)
 - [GetAutoScalingGroupListResponse](docs/GetAutoScalingGroupListResponse.md)
 - [GetAutoScalingPolicyListRequest](docs/GetAutoScalingPolicyListRequest.md)
 - [GetAutoScalingPolicyListResponse](docs/GetAutoScalingPolicyListResponse.md)
 - [GetLaunchConfigurationListRequest](docs/GetLaunchConfigurationListRequest.md)
 - [GetLaunchConfigurationListResponse](docs/GetLaunchConfigurationListResponse.md)
 - [GetScalingProcessTypeListRequest](docs/GetScalingProcessTypeListRequest.md)
 - [GetScalingProcessTypeListResponse](docs/GetScalingProcessTypeListResponse.md)
 - [GetScheduledActionListRequest](docs/GetScheduledActionListRequest.md)
 - [GetScheduledActionListResponse](docs/GetScheduledActionListResponse.md)
 - [InAutoScalingGroupServerInstance](docs/InAutoScalingGroupServerInstance.md)
 - [LaunchConfiguration](docs/LaunchConfiguration.md)
 - [LoadBalancerInstanceSummary](docs/LoadBalancerInstanceSummary.md)
 - [Process](docs/Process.md)
 - [PutScalingPolicyRequest](docs/PutScalingPolicyRequest.md)
 - [PutScalingPolicyResponse](docs/PutScalingPolicyResponse.md)
 - [PutScheduledUpdateGroupActionRequest](docs/PutScheduledUpdateGroupActionRequest.md)
 - [PutScheduledUpdateGroupActionResponse](docs/PutScheduledUpdateGroupActionResponse.md)
 - [ResumeProcessesRequest](docs/ResumeProcessesRequest.md)
 - [ResumeProcessesResponse](docs/ResumeProcessesResponse.md)
 - [ScalingPolicy](docs/ScalingPolicy.md)
 - [ScheduledUpdateGroupAction](docs/ScheduledUpdateGroupAction.md)
 - [SetDesiredCapacityRequest](docs/SetDesiredCapacityRequest.md)
 - [SetDesiredCapacityResponse](docs/SetDesiredCapacityResponse.md)
 - [SetServerInstanceHealthRequest](docs/SetServerInstanceHealthRequest.md)
 - [SetServerInstanceHealthResponse](docs/SetServerInstanceHealthResponse.md)
 - [SuspendProcessesRequest](docs/SuspendProcessesRequest.md)
 - [SuspendProcessesResponse](docs/SuspendProcessesResponse.md)
 - [SuspendedProcess](docs/SuspendedProcess.md)
 - [TerminateServerInstanceInAutoScalingGroupRequest](docs/TerminateServerInstanceInAutoScalingGroupRequest.md)
 - [TerminateServerInstanceInAutoScalingGroupResponse](docs/TerminateServerInstanceInAutoScalingGroupResponse.md)
 - [UpdateAutoScalingGroupRequest](docs/UpdateAutoScalingGroupRequest.md)
 - [UpdateAutoScalingGroupResponse](docs/UpdateAutoScalingGroupResponse.md)
 - [Zone](docs/Zone.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



