# vloadbalancer

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
	<artifactId>vloadbalancer</artifactId>
	<version>1.0.1</version>
	<scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

	mvn package

Then manually install the following JARs:

* target/vloadbalancer-1.0.1.jar
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
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import com.ncloud.ApiClient;
import com.ncloud.ApiResponse;
import com.ncloud.auth.PropertiesFileCredentialsProvider;
import com.ncloud.exception.ApiException;
import com.ncloud.exception.SdkException;
import com.ncloud.marshaller.FormMarshaller;
import com.ncloud.marshaller.JsonMarshaller;
import com.ncloud.marshaller.XmlMarshaller;
import com.ncloud.vloadbalancer.model.*;

public class V2ApiExample {

	public static void main(String[] args) {
		ApiClient apiClient = new ApiClient.ApiClientBuilder()
			.addMarshaller(JsonMarshaller.getInstance())
			.addMarshaller(XmlMarshaller.getInstance())
			.addMarshaller(FormMarshaller.getInstance())
			.setCredentialsProvider(new PropertiesFileCredentialsProvider("your-credentials-properties-file"))
			.setLogging(true)
			.build();

		V2Api apiInstance = new V2Api(apiClient);
		AddLoadBalancerListenerCertificateRequest addLoadBalancerListenerCertificateRequest = new AddLoadBalancerListenerCertificateRequest(); // AddLoadBalancerListenerCertificateRequest | addLoadBalancerListenerCertificateRequest
		try {
			// Handler Successful response
			ApiResponse<AddLoadBalancerListenerCertificateResponse> result = apiInstance.addLoadBalancerListenerCertificateGet(addLoadBalancerListenerCertificateRequest);
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

All URIs are relative to *https://ncloud.apigw.ntruss.com/vloadbalancer/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*V2Api* | [**addLoadBalancerListenerCertificateGet**](docs/V2Api.md#addLoadBalancerListenerCertificateGet) | **GET** /addLoadBalancerListenerCertificate | 
*V2Api* | [**addLoadBalancerListenerCertificatePost**](docs/V2Api.md#addLoadBalancerListenerCertificatePost) | **POST** /addLoadBalancerListenerCertificate | 
*V2Api* | [**addTargetGet**](docs/V2Api.md#addTargetGet) | **GET** /addTarget | 
*V2Api* | [**addTargetPost**](docs/V2Api.md#addTargetPost) | **POST** /addTarget | 
*V2Api* | [**changeLoadBalancerInstanceConfigurationGet**](docs/V2Api.md#changeLoadBalancerInstanceConfigurationGet) | **GET** /changeLoadBalancerInstanceConfiguration | 
*V2Api* | [**changeLoadBalancerInstanceConfigurationPost**](docs/V2Api.md#changeLoadBalancerInstanceConfigurationPost) | **POST** /changeLoadBalancerInstanceConfiguration | 
*V2Api* | [**changeLoadBalancerListenerConfigurationGet**](docs/V2Api.md#changeLoadBalancerListenerConfigurationGet) | **GET** /changeLoadBalancerListenerConfiguration | 
*V2Api* | [**changeLoadBalancerListenerConfigurationPost**](docs/V2Api.md#changeLoadBalancerListenerConfigurationPost) | **POST** /changeLoadBalancerListenerConfiguration | 
*V2Api* | [**changeTargetGroupConfigurationGet**](docs/V2Api.md#changeTargetGroupConfigurationGet) | **GET** /changeTargetGroupConfiguration | 
*V2Api* | [**changeTargetGroupConfigurationPost**](docs/V2Api.md#changeTargetGroupConfigurationPost) | **POST** /changeTargetGroupConfiguration | 
*V2Api* | [**changeTargetGroupHealthCheckConfigurationGet**](docs/V2Api.md#changeTargetGroupHealthCheckConfigurationGet) | **GET** /changeTargetGroupHealthCheckConfiguration | 
*V2Api* | [**changeTargetGroupHealthCheckConfigurationPost**](docs/V2Api.md#changeTargetGroupHealthCheckConfigurationPost) | **POST** /changeTargetGroupHealthCheckConfiguration | 
*V2Api* | [**createLoadBalancerInstanceGet**](docs/V2Api.md#createLoadBalancerInstanceGet) | **GET** /createLoadBalancerInstance | 
*V2Api* | [**createLoadBalancerInstancePost**](docs/V2Api.md#createLoadBalancerInstancePost) | **POST** /createLoadBalancerInstance | 
*V2Api* | [**createLoadBalancerListenerGet**](docs/V2Api.md#createLoadBalancerListenerGet) | **GET** /createLoadBalancerListener | 
*V2Api* | [**createLoadBalancerListenerPost**](docs/V2Api.md#createLoadBalancerListenerPost) | **POST** /createLoadBalancerListener | 
*V2Api* | [**createTargetGroupGet**](docs/V2Api.md#createTargetGroupGet) | **GET** /createTargetGroup | 
*V2Api* | [**createTargetGroupPost**](docs/V2Api.md#createTargetGroupPost) | **POST** /createTargetGroup | 
*V2Api* | [**deleteLoadBalancerInstancesGet**](docs/V2Api.md#deleteLoadBalancerInstancesGet) | **GET** /deleteLoadBalancerInstances | 
*V2Api* | [**deleteLoadBalancerInstancesPost**](docs/V2Api.md#deleteLoadBalancerInstancesPost) | **POST** /deleteLoadBalancerInstances | 
*V2Api* | [**deleteLoadBalancerListenersGet**](docs/V2Api.md#deleteLoadBalancerListenersGet) | **GET** /deleteLoadBalancerListeners | 
*V2Api* | [**deleteLoadBalancerListenersPost**](docs/V2Api.md#deleteLoadBalancerListenersPost) | **POST** /deleteLoadBalancerListeners | 
*V2Api* | [**deleteTargetGroupsGet**](docs/V2Api.md#deleteTargetGroupsGet) | **GET** /deleteTargetGroups | 
*V2Api* | [**deleteTargetGroupsPost**](docs/V2Api.md#deleteTargetGroupsPost) | **POST** /deleteTargetGroups | 
*V2Api* | [**getLoadBalancerInstanceDetailGet**](docs/V2Api.md#getLoadBalancerInstanceDetailGet) | **GET** /getLoadBalancerInstanceDetail | 
*V2Api* | [**getLoadBalancerInstanceDetailPost**](docs/V2Api.md#getLoadBalancerInstanceDetailPost) | **POST** /getLoadBalancerInstanceDetail | 
*V2Api* | [**getLoadBalancerInstanceListGet**](docs/V2Api.md#getLoadBalancerInstanceListGet) | **GET** /getLoadBalancerInstanceList | 
*V2Api* | [**getLoadBalancerInstanceListPost**](docs/V2Api.md#getLoadBalancerInstanceListPost) | **POST** /getLoadBalancerInstanceList | 
*V2Api* | [**getLoadBalancerListenerCertificateListGet**](docs/V2Api.md#getLoadBalancerListenerCertificateListGet) | **GET** /getLoadBalancerListenerCertificateList | 
*V2Api* | [**getLoadBalancerListenerCertificateListPost**](docs/V2Api.md#getLoadBalancerListenerCertificateListPost) | **POST** /getLoadBalancerListenerCertificateList | 
*V2Api* | [**getLoadBalancerListenerListGet**](docs/V2Api.md#getLoadBalancerListenerListGet) | **GET** /getLoadBalancerListenerList | 
*V2Api* | [**getLoadBalancerListenerListPost**](docs/V2Api.md#getLoadBalancerListenerListPost) | **POST** /getLoadBalancerListenerList | 
*V2Api* | [**getLoadBalancerRuleListGet**](docs/V2Api.md#getLoadBalancerRuleListGet) | **GET** /getLoadBalancerRuleList | 
*V2Api* | [**getLoadBalancerRuleListPost**](docs/V2Api.md#getLoadBalancerRuleListPost) | **POST** /getLoadBalancerRuleList | 
*V2Api* | [**getTargetGroupDetailGet**](docs/V2Api.md#getTargetGroupDetailGet) | **GET** /getTargetGroupDetail | 
*V2Api* | [**getTargetGroupDetailPost**](docs/V2Api.md#getTargetGroupDetailPost) | **POST** /getTargetGroupDetail | 
*V2Api* | [**getTargetGroupListGet**](docs/V2Api.md#getTargetGroupListGet) | **GET** /getTargetGroupList | 
*V2Api* | [**getTargetGroupListPost**](docs/V2Api.md#getTargetGroupListPost) | **POST** /getTargetGroupList | 
*V2Api* | [**getTargetListGet**](docs/V2Api.md#getTargetListGet) | **GET** /getTargetList | 
*V2Api* | [**getTargetListPost**](docs/V2Api.md#getTargetListPost) | **POST** /getTargetList | 
*V2Api* | [**removeLoadBalancerListenerCertificateGet**](docs/V2Api.md#removeLoadBalancerListenerCertificateGet) | **GET** /removeLoadBalancerListenerCertificate | 
*V2Api* | [**removeLoadBalancerListenerCertificatePost**](docs/V2Api.md#removeLoadBalancerListenerCertificatePost) | **POST** /removeLoadBalancerListenerCertificate | 
*V2Api* | [**removeTargetGet**](docs/V2Api.md#removeTargetGet) | **GET** /removeTarget | 
*V2Api* | [**removeTargetPost**](docs/V2Api.md#removeTargetPost) | **POST** /removeTarget | 
*V2Api* | [**setLoadBalancerDescriptionGet**](docs/V2Api.md#setLoadBalancerDescriptionGet) | **GET** /setLoadBalancerDescription | 
*V2Api* | [**setLoadBalancerDescriptionPost**](docs/V2Api.md#setLoadBalancerDescriptionPost) | **POST** /setLoadBalancerDescription | 
*V2Api* | [**setLoadBalancerInstanceSubnetGet**](docs/V2Api.md#setLoadBalancerInstanceSubnetGet) | **GET** /setLoadBalancerInstanceSubnet | 
*V2Api* | [**setLoadBalancerInstanceSubnetPost**](docs/V2Api.md#setLoadBalancerInstanceSubnetPost) | **POST** /setLoadBalancerInstanceSubnet | 
*V2Api* | [**setTargetGet**](docs/V2Api.md#setTargetGet) | **GET** /setTarget | 
*V2Api* | [**setTargetGroupDescriptionGet**](docs/V2Api.md#setTargetGroupDescriptionGet) | **GET** /setTargetGroupDescription | 
*V2Api* | [**setTargetGroupDescriptionPost**](docs/V2Api.md#setTargetGroupDescriptionPost) | **POST** /setTargetGroupDescription | 
*V2Api* | [**setTargetPost**](docs/V2Api.md#setTargetPost) | **POST** /setTarget | 


## Documentation for Models

 - [AddLoadBalancerListenerCertificateRequest](docs/AddLoadBalancerListenerCertificateRequest.md)
 - [AddLoadBalancerListenerCertificateResponse](docs/AddLoadBalancerListenerCertificateResponse.md)
 - [AddTargetRequest](docs/AddTargetRequest.md)
 - [AddTargetResponse](docs/AddTargetResponse.md)
 - [ChangeLoadBalancerInstanceConfigurationRequest](docs/ChangeLoadBalancerInstanceConfigurationRequest.md)
 - [ChangeLoadBalancerInstanceConfigurationResponse](docs/ChangeLoadBalancerInstanceConfigurationResponse.md)
 - [ChangeLoadBalancerListenerConfigurationRequest](docs/ChangeLoadBalancerListenerConfigurationRequest.md)
 - [ChangeLoadBalancerListenerConfigurationResponse](docs/ChangeLoadBalancerListenerConfigurationResponse.md)
 - [ChangeTargetGroupConfigurationRequest](docs/ChangeTargetGroupConfigurationRequest.md)
 - [ChangeTargetGroupConfigurationResponse](docs/ChangeTargetGroupConfigurationResponse.md)
 - [ChangeTargetGroupHealthCheckConfigurationRequest](docs/ChangeTargetGroupHealthCheckConfigurationRequest.md)
 - [ChangeTargetGroupHealthCheckConfigurationResponse](docs/ChangeTargetGroupHealthCheckConfigurationResponse.md)
 - [CommonCode](docs/CommonCode.md)
 - [CreateLoadBalancerInstanceRequest](docs/CreateLoadBalancerInstanceRequest.md)
 - [CreateLoadBalancerInstanceResponse](docs/CreateLoadBalancerInstanceResponse.md)
 - [CreateLoadBalancerListenerRequest](docs/CreateLoadBalancerListenerRequest.md)
 - [CreateLoadBalancerListenerResponse](docs/CreateLoadBalancerListenerResponse.md)
 - [CreateTargetGroupRequest](docs/CreateTargetGroupRequest.md)
 - [CreateTargetGroupResponse](docs/CreateTargetGroupResponse.md)
 - [DeleteLoadBalancerInstancesRequest](docs/DeleteLoadBalancerInstancesRequest.md)
 - [DeleteLoadBalancerInstancesResponse](docs/DeleteLoadBalancerInstancesResponse.md)
 - [DeleteLoadBalancerListenersRequest](docs/DeleteLoadBalancerListenersRequest.md)
 - [DeleteLoadBalancerListenersResponse](docs/DeleteLoadBalancerListenersResponse.md)
 - [DeleteTargetGroupsRequest](docs/DeleteTargetGroupsRequest.md)
 - [DeleteTargetGroupsResponse](docs/DeleteTargetGroupsResponse.md)
 - [GetLoadBalancerInstanceDetailRequest](docs/GetLoadBalancerInstanceDetailRequest.md)
 - [GetLoadBalancerInstanceDetailResponse](docs/GetLoadBalancerInstanceDetailResponse.md)
 - [GetLoadBalancerInstanceListRequest](docs/GetLoadBalancerInstanceListRequest.md)
 - [GetLoadBalancerInstanceListResponse](docs/GetLoadBalancerInstanceListResponse.md)
 - [GetLoadBalancerListenerCertificateListRequest](docs/GetLoadBalancerListenerCertificateListRequest.md)
 - [GetLoadBalancerListenerCertificateListResponse](docs/GetLoadBalancerListenerCertificateListResponse.md)
 - [GetLoadBalancerListenerListRequest](docs/GetLoadBalancerListenerListRequest.md)
 - [GetLoadBalancerListenerListResponse](docs/GetLoadBalancerListenerListResponse.md)
 - [GetLoadBalancerRuleListRequest](docs/GetLoadBalancerRuleListRequest.md)
 - [GetLoadBalancerRuleListResponse](docs/GetLoadBalancerRuleListResponse.md)
 - [GetTargetGroupDetailRequest](docs/GetTargetGroupDetailRequest.md)
 - [GetTargetGroupDetailResponse](docs/GetTargetGroupDetailResponse.md)
 - [GetTargetGroupListRequest](docs/GetTargetGroupListRequest.md)
 - [GetTargetGroupListResponse](docs/GetTargetGroupListResponse.md)
 - [GetTargetListRequest](docs/GetTargetListRequest.md)
 - [GetTargetListResponse](docs/GetTargetListResponse.md)
 - [HostHeaderCondition](docs/HostHeaderCondition.md)
 - [LoadBalancerInstance](docs/LoadBalancerInstance.md)
 - [LoadBalancerListener](docs/LoadBalancerListener.md)
 - [LoadBalancerListenerCertificate](docs/LoadBalancerListenerCertificate.md)
 - [LoadBalancerListenerParameter](docs/LoadBalancerListenerParameter.md)
 - [LoadBalancerRule](docs/LoadBalancerRule.md)
 - [LoadBalancerRuleAction](docs/LoadBalancerRuleAction.md)
 - [LoadBalancerRuleCondition](docs/LoadBalancerRuleCondition.md)
 - [LoadBalancerSubnet](docs/LoadBalancerSubnet.md)
 - [LoadBalancerSubnetParameter](docs/LoadBalancerSubnetParameter.md)
 - [PathPatternCondition](docs/PathPatternCondition.md)
 - [RedirectionAction](docs/RedirectionAction.md)
 - [RemoveLoadBalancerListenerCertificateRequest](docs/RemoveLoadBalancerListenerCertificateRequest.md)
 - [RemoveLoadBalancerListenerCertificateResponse](docs/RemoveLoadBalancerListenerCertificateResponse.md)
 - [RemoveTargetRequest](docs/RemoveTargetRequest.md)
 - [RemoveTargetResponse](docs/RemoveTargetResponse.md)
 - [SetLoadBalancerDescriptionRequest](docs/SetLoadBalancerDescriptionRequest.md)
 - [SetLoadBalancerDescriptionResponse](docs/SetLoadBalancerDescriptionResponse.md)
 - [SetLoadBalancerInstanceSubnetRequest](docs/SetLoadBalancerInstanceSubnetRequest.md)
 - [SetLoadBalancerInstanceSubnetResponse](docs/SetLoadBalancerInstanceSubnetResponse.md)
 - [SetTargetGroupDescriptionRequest](docs/SetTargetGroupDescriptionRequest.md)
 - [SetTargetGroupDescriptionResponse](docs/SetTargetGroupDescriptionResponse.md)
 - [SetTargetRequest](docs/SetTargetRequest.md)
 - [SetTargetResponse](docs/SetTargetResponse.md)
 - [Target](docs/Target.md)
 - [TargetGroup](docs/TargetGroup.md)
 - [TargetGroupAction](docs/TargetGroupAction.md)
 - [TargetGroupWeight](docs/TargetGroupWeight.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



