# loadbalancer

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
	<artifactId>loadbalancer</artifactId>
	<version>1.0.0</version>
	<scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

	mvn package

Then manually install the following JARs:

* target/loadbalancer-1.0.0.jar
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

import com.ncloud.loadbalancer.*;
import com.ncloud.loadbalancer.auth.*;
import com.ncloud.loadbalancer.marshaller.*;
import com.ncloud.loadbalancer.exception.*;
import com.ncloud.loadbalancer.model.*;
import com.ncloud.loadbalancer.api.V2Api;

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
		AddLoadBalancerSslCertificateRequest addLoadBalancerSslCertificateRequest = new AddLoadBalancerSslCertificateRequest(); // AddLoadBalancerSslCertificateRequest | addLoadBalancerSslCertificateRequest
		try {
			// Handler Successful response
			ApiResponse<AddLoadBalancerSslCertificateResponse> result = apiInstance.addLoadBalancerSslCertificateGet(addLoadBalancerSslCertificateRequest);
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

All URIs are relative to *https://ncloud.apigw.ntruss.com/loadbalancer/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*V2Api* | [**addLoadBalancerSslCertificateGet**](docs/V2Api.md#addLoadBalancerSslCertificateGet) | **GET** /addLoadBalancerSslCertificate | 
*V2Api* | [**addLoadBalancerSslCertificatePost**](docs/V2Api.md#addLoadBalancerSslCertificatePost) | **POST** /addLoadBalancerSslCertificate | 
*V2Api* | [**changeLoadBalancedServerInstancesGet**](docs/V2Api.md#changeLoadBalancedServerInstancesGet) | **GET** /changeLoadBalancedServerInstances | 
*V2Api* | [**changeLoadBalancedServerInstancesPost**](docs/V2Api.md#changeLoadBalancedServerInstancesPost) | **POST** /changeLoadBalancedServerInstances | 
*V2Api* | [**changeLoadBalancerInstanceConfigurationGet**](docs/V2Api.md#changeLoadBalancerInstanceConfigurationGet) | **GET** /changeLoadBalancerInstanceConfiguration | 
*V2Api* | [**changeLoadBalancerInstanceConfigurationPost**](docs/V2Api.md#changeLoadBalancerInstanceConfigurationPost) | **POST** /changeLoadBalancerInstanceConfiguration | 
*V2Api* | [**createLoadBalancerInstanceGet**](docs/V2Api.md#createLoadBalancerInstanceGet) | **GET** /createLoadBalancerInstance | 
*V2Api* | [**createLoadBalancerInstancePost**](docs/V2Api.md#createLoadBalancerInstancePost) | **POST** /createLoadBalancerInstance | 
*V2Api* | [**deleteLoadBalancerInstancesGet**](docs/V2Api.md#deleteLoadBalancerInstancesGet) | **GET** /deleteLoadBalancerInstances | 
*V2Api* | [**deleteLoadBalancerInstancesPost**](docs/V2Api.md#deleteLoadBalancerInstancesPost) | **POST** /deleteLoadBalancerInstances | 
*V2Api* | [**deleteLoadBalancerSslCertificateGet**](docs/V2Api.md#deleteLoadBalancerSslCertificateGet) | **GET** /deleteLoadBalancerSslCertificate | 
*V2Api* | [**deleteLoadBalancerSslCertificatePost**](docs/V2Api.md#deleteLoadBalancerSslCertificatePost) | **POST** /deleteLoadBalancerSslCertificate | 
*V2Api* | [**getLoadBalancedServerInstanceListGet**](docs/V2Api.md#getLoadBalancedServerInstanceListGet) | **GET** /getLoadBalancedServerInstanceList | 
*V2Api* | [**getLoadBalancedServerInstanceListPost**](docs/V2Api.md#getLoadBalancedServerInstanceListPost) | **POST** /getLoadBalancedServerInstanceList | 
*V2Api* | [**getLoadBalancerInstanceListGet**](docs/V2Api.md#getLoadBalancerInstanceListGet) | **GET** /getLoadBalancerInstanceList | 
*V2Api* | [**getLoadBalancerInstanceListPost**](docs/V2Api.md#getLoadBalancerInstanceListPost) | **POST** /getLoadBalancerInstanceList | 
*V2Api* | [**getLoadBalancerSslCertificateListGet**](docs/V2Api.md#getLoadBalancerSslCertificateListGet) | **GET** /getLoadBalancerSslCertificateList | 
*V2Api* | [**getLoadBalancerSslCertificateListPost**](docs/V2Api.md#getLoadBalancerSslCertificateListPost) | **POST** /getLoadBalancerSslCertificateList | 
*V2Api* | [**getLoadBalancerTargetServerInstanceListGet**](docs/V2Api.md#getLoadBalancerTargetServerInstanceListGet) | **GET** /getLoadBalancerTargetServerInstanceList | 
*V2Api* | [**getLoadBalancerTargetServerInstanceListPost**](docs/V2Api.md#getLoadBalancerTargetServerInstanceListPost) | **POST** /getLoadBalancerTargetServerInstanceList | 


## Documentation for Models

 - [AccessControlGroup](docs/AccessControlGroup.md)
 - [AddLoadBalancerSslCertificateRequest](docs/AddLoadBalancerSslCertificateRequest.md)
 - [AddLoadBalancerSslCertificateResponse](docs/AddLoadBalancerSslCertificateResponse.md)
 - [ChangeLoadBalancedServerInstancesRequest](docs/ChangeLoadBalancedServerInstancesRequest.md)
 - [ChangeLoadBalancedServerInstancesResponse](docs/ChangeLoadBalancedServerInstancesResponse.md)
 - [ChangeLoadBalancerInstanceConfigurationRequest](docs/ChangeLoadBalancerInstanceConfigurationRequest.md)
 - [ChangeLoadBalancerInstanceConfigurationResponse](docs/ChangeLoadBalancerInstanceConfigurationResponse.md)
 - [CommonCode](docs/CommonCode.md)
 - [CreateLoadBalancerInstanceRequest](docs/CreateLoadBalancerInstanceRequest.md)
 - [CreateLoadBalancerInstanceResponse](docs/CreateLoadBalancerInstanceResponse.md)
 - [DeleteLoadBalancerInstancesRequest](docs/DeleteLoadBalancerInstancesRequest.md)
 - [DeleteLoadBalancerInstancesResponse](docs/DeleteLoadBalancerInstancesResponse.md)
 - [DeleteLoadBalancerSslCertificateRequest](docs/DeleteLoadBalancerSslCertificateRequest.md)
 - [DeleteLoadBalancerSslCertificateResponse](docs/DeleteLoadBalancerSslCertificateResponse.md)
 - [GetLoadBalancedServerInstanceListRequest](docs/GetLoadBalancedServerInstanceListRequest.md)
 - [GetLoadBalancedServerInstanceListResponse](docs/GetLoadBalancedServerInstanceListResponse.md)
 - [GetLoadBalancerInstanceListRequest](docs/GetLoadBalancerInstanceListRequest.md)
 - [GetLoadBalancerInstanceListResponse](docs/GetLoadBalancerInstanceListResponse.md)
 - [GetLoadBalancerSslCertificateListRequest](docs/GetLoadBalancerSslCertificateListRequest.md)
 - [GetLoadBalancerSslCertificateListResponse](docs/GetLoadBalancerSslCertificateListResponse.md)
 - [GetLoadBalancerTargetServerInstanceListRequest](docs/GetLoadBalancerTargetServerInstanceListRequest.md)
 - [GetLoadBalancerTargetServerInstanceListResponse](docs/GetLoadBalancerTargetServerInstanceListResponse.md)
 - [LoadBalancedServerInstance](docs/LoadBalancedServerInstance.md)
 - [LoadBalancerInstance](docs/LoadBalancerInstance.md)
 - [LoadBalancerRule](docs/LoadBalancerRule.md)
 - [LoadBalancerRuleParameter](docs/LoadBalancerRuleParameter.md)
 - [Region](docs/Region.md)
 - [ServerHealthCheckStatus](docs/ServerHealthCheckStatus.md)
 - [ServerInstance](docs/ServerInstance.md)
 - [SslCertificate](docs/SslCertificate.md)
 - [Zone](docs/Zone.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



