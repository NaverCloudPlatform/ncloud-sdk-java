# clouddb

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
	<artifactId>clouddb</artifactId>
	<version>1.0.0</version>
	<scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

	mvn package

Then manually install the following JARs:

* target/clouddb-1.0.0.jar
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

import com.ncloud.clouddb.*;
import com.ncloud.clouddb.auth.*;
import com.ncloud.clouddb.marshaller.*;
import com.ncloud.clouddb.exception.*;
import com.ncloud.clouddb.model.*;
import com.ncloud.clouddb.api.V2Api;

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
		CreateCloudDBInstanceRequest createCloudDBInstanceRequest = new CreateCloudDBInstanceRequest(); // CreateCloudDBInstanceRequest | createCloudDBInstanceRequest
		try {
			// Handler Successful response
			ApiResponse<CreateCloudDBInstanceResponse> result = apiInstance.createCloudDBInstanceGet(createCloudDBInstanceRequest);
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

All URIs are relative to *https://ncloud.apigw.ntruss.com/clouddb/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*V2Api* | [**createCloudDBInstanceGet**](docs/V2Api.md#createCloudDBInstanceGet) | **GET** /createCloudDBInstance | 
*V2Api* | [**createCloudDBInstancePost**](docs/V2Api.md#createCloudDBInstancePost) | **POST** /createCloudDBInstance | 
*V2Api* | [**deleteCloudDBServerInstanceGet**](docs/V2Api.md#deleteCloudDBServerInstanceGet) | **GET** /deleteCloudDBServerInstance | 
*V2Api* | [**deleteCloudDBServerInstancePost**](docs/V2Api.md#deleteCloudDBServerInstancePost) | **POST** /deleteCloudDBServerInstance | 
*V2Api* | [**downloadDmsFileGet**](docs/V2Api.md#downloadDmsFileGet) | **GET** /downloadDmsFile | 
*V2Api* | [**downloadDmsFilePost**](docs/V2Api.md#downloadDmsFilePost) | **POST** /downloadDmsFile | 
*V2Api* | [**flushCloudDBInstanceGet**](docs/V2Api.md#flushCloudDBInstanceGet) | **GET** /flushCloudDBInstance | 
*V2Api* | [**flushCloudDBInstancePost**](docs/V2Api.md#flushCloudDBInstancePost) | **POST** /flushCloudDBInstance | 
*V2Api* | [**getBackupListGet**](docs/V2Api.md#getBackupListGet) | **GET** /getBackupList | 
*V2Api* | [**getBackupListPost**](docs/V2Api.md#getBackupListPost) | **POST** /getBackupList | 
*V2Api* | [**getCloudDBConfigGroupListGet**](docs/V2Api.md#getCloudDBConfigGroupListGet) | **GET** /getCloudDBConfigGroupList | 
*V2Api* | [**getCloudDBConfigGroupListPost**](docs/V2Api.md#getCloudDBConfigGroupListPost) | **POST** /getCloudDBConfigGroupList | 
*V2Api* | [**getCloudDBImageProductListGet**](docs/V2Api.md#getCloudDBImageProductListGet) | **GET** /getCloudDBImageProductList | 
*V2Api* | [**getCloudDBImageProductListPost**](docs/V2Api.md#getCloudDBImageProductListPost) | **POST** /getCloudDBImageProductList | 
*V2Api* | [**getCloudDBInstanceListGet**](docs/V2Api.md#getCloudDBInstanceListGet) | **GET** /getCloudDBInstanceList | 
*V2Api* | [**getCloudDBInstanceListPost**](docs/V2Api.md#getCloudDBInstanceListPost) | **POST** /getCloudDBInstanceList | 
*V2Api* | [**getCloudDBProductListGet**](docs/V2Api.md#getCloudDBProductListGet) | **GET** /getCloudDBProductList | 
*V2Api* | [**getCloudDBProductListPost**](docs/V2Api.md#getCloudDBProductListPost) | **POST** /getCloudDBProductList | 
*V2Api* | [**getDmsOperationGet**](docs/V2Api.md#getDmsOperationGet) | **GET** /getDmsOperation | 
*V2Api* | [**getDmsOperationPost**](docs/V2Api.md#getDmsOperationPost) | **POST** /getDmsOperation | 
*V2Api* | [**getObjectStorageBackupListGet**](docs/V2Api.md#getObjectStorageBackupListGet) | **GET** /getObjectStorageBackupList | 
*V2Api* | [**getObjectStorageBackupListPost**](docs/V2Api.md#getObjectStorageBackupListPost) | **POST** /getObjectStorageBackupList | 
*V2Api* | [**rebootCloudDBServerInstanceGet**](docs/V2Api.md#rebootCloudDBServerInstanceGet) | **GET** /rebootCloudDBServerInstance | 
*V2Api* | [**rebootCloudDBServerInstancePost**](docs/V2Api.md#rebootCloudDBServerInstancePost) | **POST** /rebootCloudDBServerInstance | 
*V2Api* | [**restoreDmsDatabaseGet**](docs/V2Api.md#restoreDmsDatabaseGet) | **GET** /restoreDmsDatabase | 
*V2Api* | [**restoreDmsDatabasePost**](docs/V2Api.md#restoreDmsDatabasePost) | **POST** /restoreDmsDatabase | 
*V2Api* | [**restoreDmsTransactionLogGet**](docs/V2Api.md#restoreDmsTransactionLogGet) | **GET** /restoreDmsTransactionLog | 
*V2Api* | [**restoreDmsTransactionLogPost**](docs/V2Api.md#restoreDmsTransactionLogPost) | **POST** /restoreDmsTransactionLog | 
*V2Api* | [**setObjectStorageInfoGet**](docs/V2Api.md#setObjectStorageInfoGet) | **GET** /setObjectStorageInfo | 
*V2Api* | [**setObjectStorageInfoPost**](docs/V2Api.md#setObjectStorageInfoPost) | **POST** /setObjectStorageInfo | 
*V2Api* | [**uploadDmsFileGet**](docs/V2Api.md#uploadDmsFileGet) | **GET** /uploadDmsFile | 
*V2Api* | [**uploadDmsFilePost**](docs/V2Api.md#uploadDmsFilePost) | **POST** /uploadDmsFile | 


## Documentation for Models

 - [AccessControlGroup](docs/AccessControlGroup.md)
 - [BackupFile](docs/BackupFile.md)
 - [CloudDBConfig](docs/CloudDBConfig.md)
 - [CloudDBConfigGroup](docs/CloudDBConfigGroup.md)
 - [CloudDBInstance](docs/CloudDBInstance.md)
 - [CloudDBServerInstance](docs/CloudDBServerInstance.md)
 - [CommonCode](docs/CommonCode.md)
 - [CreateCloudDBInstanceRequest](docs/CreateCloudDBInstanceRequest.md)
 - [CreateCloudDBInstanceResponse](docs/CreateCloudDBInstanceResponse.md)
 - [DeleteCloudDBServerInstanceRequest](docs/DeleteCloudDBServerInstanceRequest.md)
 - [DeleteCloudDBServerInstanceResponse](docs/DeleteCloudDBServerInstanceResponse.md)
 - [DmsFile](docs/DmsFile.md)
 - [DownloadDmsFileRequest](docs/DownloadDmsFileRequest.md)
 - [DownloadDmsFileResponse](docs/DownloadDmsFileResponse.md)
 - [FlushCloudDBInstanceRequest](docs/FlushCloudDBInstanceRequest.md)
 - [FlushCloudDBInstanceResponse](docs/FlushCloudDBInstanceResponse.md)
 - [GetBackupListRequest](docs/GetBackupListRequest.md)
 - [GetBackupListResponse](docs/GetBackupListResponse.md)
 - [GetCloudDBConfigGroupListRequest](docs/GetCloudDBConfigGroupListRequest.md)
 - [GetCloudDBConfigGroupListResponse](docs/GetCloudDBConfigGroupListResponse.md)
 - [GetCloudDBImageProductListRequest](docs/GetCloudDBImageProductListRequest.md)
 - [GetCloudDBImageProductListResponse](docs/GetCloudDBImageProductListResponse.md)
 - [GetCloudDBInstanceListRequest](docs/GetCloudDBInstanceListRequest.md)
 - [GetCloudDBInstanceListResponse](docs/GetCloudDBInstanceListResponse.md)
 - [GetCloudDBProductListRequest](docs/GetCloudDBProductListRequest.md)
 - [GetCloudDBProductListResponse](docs/GetCloudDBProductListResponse.md)
 - [GetDmsOperationRequest](docs/GetDmsOperationRequest.md)
 - [GetDmsOperationResponse](docs/GetDmsOperationResponse.md)
 - [GetObjectStorageBackupListRequest](docs/GetObjectStorageBackupListRequest.md)
 - [GetObjectStorageBackupListResponse](docs/GetObjectStorageBackupListResponse.md)
 - [Product](docs/Product.md)
 - [RebootCloudDBServerInstanceRequest](docs/RebootCloudDBServerInstanceRequest.md)
 - [RebootCloudDBServerInstanceResponse](docs/RebootCloudDBServerInstanceResponse.md)
 - [Region](docs/Region.md)
 - [RestoreDmsDatabaseRequest](docs/RestoreDmsDatabaseRequest.md)
 - [RestoreDmsDatabaseResponse](docs/RestoreDmsDatabaseResponse.md)
 - [RestoreDmsTransactionLogRequest](docs/RestoreDmsTransactionLogRequest.md)
 - [RestoreDmsTransactionLogResponse](docs/RestoreDmsTransactionLogResponse.md)
 - [SetObjectStorageInfoRequest](docs/SetObjectStorageInfoRequest.md)
 - [SetObjectStorageInfoResponse](docs/SetObjectStorageInfoResponse.md)
 - [UploadDmsFileRequest](docs/UploadDmsFileRequest.md)
 - [UploadDmsFileResponse](docs/UploadDmsFileResponse.md)
 - [Zone](docs/Zone.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



