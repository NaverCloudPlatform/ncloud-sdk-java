# vnas

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
	<artifactId>vnas</artifactId>
	<version>1.1.0</version>
	<scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

	mvn package

Then manually install the following JARs:

* target/vnas-1.1.0.jar
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
import com.ncloud.vnas.model.*;

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
	}
}

```

## Documentation for API Endpoints

All URIs are relative to *https://ncloud.apigw.ntruss.com/vnas/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*V2Api* | [**addNasVolumeAccessControlGet**](docs/V2Api.md#addNasVolumeAccessControlGet) | **GET** /addNasVolumeAccessControl | 
*V2Api* | [**addNasVolumeAccessControlPost**](docs/V2Api.md#addNasVolumeAccessControlPost) | **POST** /addNasVolumeAccessControl | 
*V2Api* | [**changeNasVolumeSizeGet**](docs/V2Api.md#changeNasVolumeSizeGet) | **GET** /changeNasVolumeSize | 
*V2Api* | [**changeNasVolumeSizePost**](docs/V2Api.md#changeNasVolumeSizePost) | **POST** /changeNasVolumeSize | 
*V2Api* | [**createNasVolumeInstanceGet**](docs/V2Api.md#createNasVolumeInstanceGet) | **GET** /createNasVolumeInstance | 
*V2Api* | [**createNasVolumeInstancePost**](docs/V2Api.md#createNasVolumeInstancePost) | **POST** /createNasVolumeInstance | 
*V2Api* | [**deleteNasVolumeInstancesGet**](docs/V2Api.md#deleteNasVolumeInstancesGet) | **GET** /deleteNasVolumeInstances | 
*V2Api* | [**deleteNasVolumeInstancesPost**](docs/V2Api.md#deleteNasVolumeInstancesPost) | **POST** /deleteNasVolumeInstances | 
*V2Api* | [**getNasVolumeInstanceDetailGet**](docs/V2Api.md#getNasVolumeInstanceDetailGet) | **GET** /getNasVolumeInstanceDetail | 
*V2Api* | [**getNasVolumeInstanceDetailPost**](docs/V2Api.md#getNasVolumeInstanceDetailPost) | **POST** /getNasVolumeInstanceDetail | 
*V2Api* | [**getNasVolumeInstanceListGet**](docs/V2Api.md#getNasVolumeInstanceListGet) | **GET** /getNasVolumeInstanceList | 
*V2Api* | [**getNasVolumeInstanceListPost**](docs/V2Api.md#getNasVolumeInstanceListPost) | **POST** /getNasVolumeInstanceList | 
*V2Api* | [**removeNasVolumeAccessControlGet**](docs/V2Api.md#removeNasVolumeAccessControlGet) | **GET** /removeNasVolumeAccessControl | 
*V2Api* | [**removeNasVolumeAccessControlPost**](docs/V2Api.md#removeNasVolumeAccessControlPost) | **POST** /removeNasVolumeAccessControl | 
*V2Api* | [**setNasVolumeAccessControlGet**](docs/V2Api.md#setNasVolumeAccessControlGet) | **GET** /setNasVolumeAccessControl | 
*V2Api* | [**setNasVolumeAccessControlPost**](docs/V2Api.md#setNasVolumeAccessControlPost) | **POST** /setNasVolumeAccessControl | 


## Documentation for Models

 - [AddNasVolumeAccessControlRequest](docs/AddNasVolumeAccessControlRequest.md)
 - [AddNasVolumeAccessControlResponse](docs/AddNasVolumeAccessControlResponse.md)
 - [ChangeNasVolumeSizeRequest](docs/ChangeNasVolumeSizeRequest.md)
 - [ChangeNasVolumeSizeResponse](docs/ChangeNasVolumeSizeResponse.md)
 - [CommonCode](docs/CommonCode.md)
 - [CreateNasVolumeInstanceRequest](docs/CreateNasVolumeInstanceRequest.md)
 - [CreateNasVolumeInstanceResponse](docs/CreateNasVolumeInstanceResponse.md)
 - [DeleteNasVolumeInstancesRequest](docs/DeleteNasVolumeInstancesRequest.md)
 - [DeleteNasVolumeInstancesResponse](docs/DeleteNasVolumeInstancesResponse.md)
 - [GetNasVolumeInstanceDetailRequest](docs/GetNasVolumeInstanceDetailRequest.md)
 - [GetNasVolumeInstanceDetailResponse](docs/GetNasVolumeInstanceDetailResponse.md)
 - [GetNasVolumeInstanceListRequest](docs/GetNasVolumeInstanceListRequest.md)
 - [GetNasVolumeInstanceListResponse](docs/GetNasVolumeInstanceListResponse.md)
 - [NasVolumeInstance](docs/NasVolumeInstance.md)
 - [RemoveNasVolumeAccessControlRequest](docs/RemoveNasVolumeAccessControlRequest.md)
 - [RemoveNasVolumeAccessControlResponse](docs/RemoveNasVolumeAccessControlResponse.md)
 - [SetNasVolumeAccessControlRequest](docs/SetNasVolumeAccessControlRequest.md)
 - [SetNasVolumeAccessControlResponse](docs/SetNasVolumeAccessControlResponse.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



