# cdn

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
	<artifactId>cdn</artifactId>
	<version>1.1.0</version>
	<scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

	mvn package

Then manually install the following JARs:

* target/cdn-1.1.0.jar
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
import com.ncloud.cdn.model.*;

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
		GetCdnPlusInstanceListRequest getCdnPlusInstanceListRequest = new GetCdnPlusInstanceListRequest(); // GetCdnPlusInstanceListRequest | getCdnPlusInstanceListRequest
		try {
			// Handler Successful response
			ApiResponse<GetCdnPlusInstanceListResponse> result = apiInstance.getCdnPlusInstanceListGet(getCdnPlusInstanceListRequest);
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

All URIs are relative to *https://ncloud.apigw.ntruss.com/cdn/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*V2Api* | [**getCdnPlusInstanceListGet**](docs/V2Api.md#getCdnPlusInstanceListGet) | **GET** /getCdnPlusInstanceList | 
*V2Api* | [**getCdnPlusInstanceListPost**](docs/V2Api.md#getCdnPlusInstanceListPost) | **POST** /getCdnPlusInstanceList | 
*V2Api* | [**getCdnPlusPurgeHistoryListGet**](docs/V2Api.md#getCdnPlusPurgeHistoryListGet) | **GET** /getCdnPlusPurgeHistoryList | 
*V2Api* | [**getCdnPlusPurgeHistoryListPost**](docs/V2Api.md#getCdnPlusPurgeHistoryListPost) | **POST** /getCdnPlusPurgeHistoryList | 
*V2Api* | [**getGlobalCdnInstanceListGet**](docs/V2Api.md#getGlobalCdnInstanceListGet) | **GET** /getGlobalCdnInstanceList | 
*V2Api* | [**getGlobalCdnInstanceListPost**](docs/V2Api.md#getGlobalCdnInstanceListPost) | **POST** /getGlobalCdnInstanceList | 
*V2Api* | [**getGlobalCdnPurgeHistoryListGet**](docs/V2Api.md#getGlobalCdnPurgeHistoryListGet) | **GET** /getGlobalCdnPurgeHistoryList | 
*V2Api* | [**getGlobalCdnPurgeHistoryListPost**](docs/V2Api.md#getGlobalCdnPurgeHistoryListPost) | **POST** /getGlobalCdnPurgeHistoryList | 
*V2Api* | [**requestCdnPlusPurgeGet**](docs/V2Api.md#requestCdnPlusPurgeGet) | **GET** /requestCdnPlusPurge | 
*V2Api* | [**requestCdnPlusPurgePost**](docs/V2Api.md#requestCdnPlusPurgePost) | **POST** /requestCdnPlusPurge | 
*V2Api* | [**requestGlobalCdnPurgeGet**](docs/V2Api.md#requestGlobalCdnPurgeGet) | **GET** /requestGlobalCdnPurge | 
*V2Api* | [**requestGlobalCdnPurgePost**](docs/V2Api.md#requestGlobalCdnPurgePost) | **POST** /requestGlobalCdnPurge | 


## Documentation for Models

 - [CdnPlusInstance](docs/CdnPlusInstance.md)
 - [CdnPlusPurgeHistory](docs/CdnPlusPurgeHistory.md)
 - [CdnPlusRule](docs/CdnPlusRule.md)
 - [CdnPlusServiceDomain](docs/CdnPlusServiceDomain.md)
 - [CommonCode](docs/CommonCode.md)
 - [GetCdnPlusInstanceListRequest](docs/GetCdnPlusInstanceListRequest.md)
 - [GetCdnPlusInstanceListResponse](docs/GetCdnPlusInstanceListResponse.md)
 - [GetCdnPlusPurgeHistoryListRequest](docs/GetCdnPlusPurgeHistoryListRequest.md)
 - [GetCdnPlusPurgeHistoryListResponse](docs/GetCdnPlusPurgeHistoryListResponse.md)
 - [GetGlobalCdnInstanceListRequest](docs/GetGlobalCdnInstanceListRequest.md)
 - [GetGlobalCdnInstanceListResponse](docs/GetGlobalCdnInstanceListResponse.md)
 - [GetGlobalCdnPurgeHistoryListRequest](docs/GetGlobalCdnPurgeHistoryListRequest.md)
 - [GetGlobalCdnPurgeHistoryListResponse](docs/GetGlobalCdnPurgeHistoryListResponse.md)
 - [GlobalCdnInstance](docs/GlobalCdnInstance.md)
 - [GlobalCdnPurgeHistory](docs/GlobalCdnPurgeHistory.md)
 - [GlobalCdnRule](docs/GlobalCdnRule.md)
 - [GlobalCdnServiceDomain](docs/GlobalCdnServiceDomain.md)
 - [RequestCdnPlusPurgeRequest](docs/RequestCdnPlusPurgeRequest.md)
 - [RequestCdnPlusPurgeResponse](docs/RequestCdnPlusPurgeResponse.md)
 - [RequestGlobalCdnPurgeRequest](docs/RequestGlobalCdnPurgeRequest.md)
 - [RequestGlobalCdnPurgeResponse](docs/RequestGlobalCdnPurgeResponse.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



