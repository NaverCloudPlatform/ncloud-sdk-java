# vnks

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
	<artifactId>vnks</artifactId>
	<version>1.0.0</version>
	<scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

	mvn package

Then manually install the following JARs:

* target/vnks-1.0.0.jar
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
import com.ncloud.vnks.model.*;

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
	}
}

```

## Documentation for API Endpoints

All URIs are relative to *https://nks.apigw.ntruss.com/vnks/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*V2Api* | [**clustersGet**](docs/V2Api.md#clustersGet) | **GET** /clusters | 
*V2Api* | [**clustersPost**](docs/V2Api.md#clustersPost) | **POST** /clusters | 
*V2Api* | [**clustersUuidDelete**](docs/V2Api.md#clustersUuidDelete) | **DELETE** /clusters/{uuid} | 
*V2Api* | [**clustersUuidGet**](docs/V2Api.md#clustersUuidGet) | **GET** /clusters/{uuid} | 
*V2Api* | [**clustersUuidKubeconfigGet**](docs/V2Api.md#clustersUuidKubeconfigGet) | **GET** /clusters/{uuid}/kubeconfig | 
*V2Api* | [**clustersUuidKubeconfigResetPatch**](docs/V2Api.md#clustersUuidKubeconfigResetPatch) | **PATCH** /clusters/{uuid}/kubeconfig/reset | 
*V2Api* | [**clustersUuidNodePoolGet**](docs/V2Api.md#clustersUuidNodePoolGet) | **GET** /clusters/{uuid}/node-pool | 
*V2Api* | [**clustersUuidNodePoolInstanceNoDelete**](docs/V2Api.md#clustersUuidNodePoolInstanceNoDelete) | **DELETE** /clusters/{uuid}/node-pool/{instanceNo} | 
*V2Api* | [**clustersUuidNodePoolInstanceNoPatch**](docs/V2Api.md#clustersUuidNodePoolInstanceNoPatch) | **PATCH** /clusters/{uuid}/node-pool/{instanceNo} | 
*V2Api* | [**clustersUuidNodePoolPost**](docs/V2Api.md#clustersUuidNodePoolPost) | **POST** /clusters/{uuid}/node-pool | 
*V2Api* | [**clustersUuidNodesGet**](docs/V2Api.md#clustersUuidNodesGet) | **GET** /clusters/{uuid}/nodes | 
*V2Api* | [**clustersUuidNodesInstanceNoDelete**](docs/V2Api.md#clustersUuidNodesInstanceNoDelete) | **DELETE** /clusters/{uuid}/nodes/{instanceNo} | 
*V2Api* | [**optionVersionGet**](docs/V2Api.md#optionVersionGet) | **GET** /option/version | 
*V2Api* | [**rootGet**](docs/V2Api.md#rootGet) | **GET** / | 


## Documentation for Models

 - [AutoscaleOption](docs/AutoscaleOption.md)
 - [AutoscalerUpdate](docs/AutoscalerUpdate.md)
 - [Cluster](docs/Cluster.md)
 - [ClusterInputBody](docs/ClusterInputBody.md)
 - [ClusterLogInput](docs/ClusterLogInput.md)
 - [ClusterRes](docs/ClusterRes.md)
 - [ClustersRes](docs/ClustersRes.md)
 - [CreateClusterRes](docs/CreateClusterRes.md)
 - [DefaultNodePoolParam](docs/DefaultNodePoolParam.md)
 - [KubeconfigRes](docs/KubeconfigRes.md)
 - [NodePool](docs/NodePool.md)
 - [NodePoolCreationBody](docs/NodePoolCreationBody.md)
 - [NodePoolRes](docs/NodePoolRes.md)
 - [NodePoolUpdateBody](docs/NodePoolUpdateBody.md)
 - [NodePoolsRes](docs/NodePoolsRes.md)
 - [OptionRes](docs/OptionRes.md)
 - [OptionsRes](docs/OptionsRes.md)
 - [WorkerNode](docs/WorkerNode.md)
 - [WorkerNodeRes](docs/WorkerNodeRes.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



