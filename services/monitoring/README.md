# monitoring

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
	<artifactId>monitoring</artifactId>
	<version>1.0.1</version>
	<scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

	mvn package

Then manually install the following JARs:

* target/monitoring-1.0.1.jar
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

import com.ncloud.monitoring.*;
import com.ncloud.monitoring.auth.*;
import com.ncloud.monitoring.marshaller.*;
import com.ncloud.monitoring.exception.*;
import com.ncloud.monitoring.model.*;
import com.ncloud.monitoring.api.V2Api;

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
		GetListMetricsRequest getListMetricsRequest = new GetListMetricsRequest(); // GetListMetricsRequest | getListMetricsRequest
		try {
			// Handler Successful response
			ApiResponse<GetListMetricsResponse> result = apiInstance.getListMetricsGet(getListMetricsRequest);
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

All URIs are relative to *https://ncloud.apigw.ntruss.com/monitoring/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*V2Api* | [**getListMetricsGet**](docs/V2Api.md#getListMetricsGet) | **GET** /getListMetrics | 
*V2Api* | [**getListMetricsPost**](docs/V2Api.md#getListMetricsPost) | **POST** /getListMetrics | 
*V2Api* | [**getMetricStatisticsGet**](docs/V2Api.md#getMetricStatisticsGet) | **GET** /getMetricStatistics | 
*V2Api* | [**getMetricStatisticsPost**](docs/V2Api.md#getMetricStatisticsPost) | **POST** /getMetricStatistics | 


## Documentation for Models

 - [DataPoint](docs/DataPoint.md)
 - [DataPoints](docs/DataPoints.md)
 - [GetListMetricsRequest](docs/GetListMetricsRequest.md)
 - [GetListMetricsResponse](docs/GetListMetricsResponse.md)
 - [GetMetricStatisticsRequest](docs/GetMetricStatisticsRequest.md)
 - [GetMetricStatisticsResponse](docs/GetMetricStatisticsResponse.md)
 - [Metric](docs/Metric.md)
 - [Statistic](docs/Statistic.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



