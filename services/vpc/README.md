# vpc

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
	<artifactId>vpc</artifactId>
	<version>1.1.0</version>
	<scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

	mvn package

Then manually install the following JARs:

* target/vpc-1.1.0.jar
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
import com.ncloud.vpc.model.*;

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
		AcceptOrRejectVpcPeeringRequest acceptOrRejectVpcPeeringRequest = new AcceptOrRejectVpcPeeringRequest(); // AcceptOrRejectVpcPeeringRequest | acceptOrRejectVpcPeeringRequest
		try {
			// Handler Successful response
			ApiResponse<AcceptOrRejectVpcPeeringResponse> result = apiInstance.acceptOrRejectVpcPeeringGet(acceptOrRejectVpcPeeringRequest);
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

All URIs are relative to *https://ncloud.apigw.ntruss.com/vpc/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*V2Api* | [**acceptOrRejectVpcPeeringGet**](docs/V2Api.md#acceptOrRejectVpcPeeringGet) | **GET** /acceptOrRejectVpcPeering | 
*V2Api* | [**acceptOrRejectVpcPeeringPost**](docs/V2Api.md#acceptOrRejectVpcPeeringPost) | **POST** /acceptOrRejectVpcPeering | 
*V2Api* | [**addNetworkAclInboundRuleGet**](docs/V2Api.md#addNetworkAclInboundRuleGet) | **GET** /addNetworkAclInboundRule | 
*V2Api* | [**addNetworkAclInboundRulePost**](docs/V2Api.md#addNetworkAclInboundRulePost) | **POST** /addNetworkAclInboundRule | 
*V2Api* | [**addNetworkAclOutboundRuleGet**](docs/V2Api.md#addNetworkAclOutboundRuleGet) | **GET** /addNetworkAclOutboundRule | 
*V2Api* | [**addNetworkAclOutboundRulePost**](docs/V2Api.md#addNetworkAclOutboundRulePost) | **POST** /addNetworkAclOutboundRule | 
*V2Api* | [**addRouteGet**](docs/V2Api.md#addRouteGet) | **GET** /addRoute | 
*V2Api* | [**addRoutePost**](docs/V2Api.md#addRoutePost) | **POST** /addRoute | 
*V2Api* | [**addRouteTableSubnetGet**](docs/V2Api.md#addRouteTableSubnetGet) | **GET** /addRouteTableSubnet | 
*V2Api* | [**addRouteTableSubnetPost**](docs/V2Api.md#addRouteTableSubnetPost) | **POST** /addRouteTableSubnet | 
*V2Api* | [**createNatGatewayInstanceGet**](docs/V2Api.md#createNatGatewayInstanceGet) | **GET** /createNatGatewayInstance | 
*V2Api* | [**createNatGatewayInstancePost**](docs/V2Api.md#createNatGatewayInstancePost) | **POST** /createNatGatewayInstance | 
*V2Api* | [**createNetworkAclGet**](docs/V2Api.md#createNetworkAclGet) | **GET** /createNetworkAcl | 
*V2Api* | [**createNetworkAclPost**](docs/V2Api.md#createNetworkAclPost) | **POST** /createNetworkAcl | 
*V2Api* | [**createRouteTableGet**](docs/V2Api.md#createRouteTableGet) | **GET** /createRouteTable | 
*V2Api* | [**createRouteTablePost**](docs/V2Api.md#createRouteTablePost) | **POST** /createRouteTable | 
*V2Api* | [**createSubnetGet**](docs/V2Api.md#createSubnetGet) | **GET** /createSubnet | 
*V2Api* | [**createSubnetPost**](docs/V2Api.md#createSubnetPost) | **POST** /createSubnet | 
*V2Api* | [**createVpcGet**](docs/V2Api.md#createVpcGet) | **GET** /createVpc | 
*V2Api* | [**createVpcPeeringInstanceGet**](docs/V2Api.md#createVpcPeeringInstanceGet) | **GET** /createVpcPeeringInstance | 
*V2Api* | [**createVpcPeeringInstancePost**](docs/V2Api.md#createVpcPeeringInstancePost) | **POST** /createVpcPeeringInstance | 
*V2Api* | [**createVpcPost**](docs/V2Api.md#createVpcPost) | **POST** /createVpc | 
*V2Api* | [**deleteNatGatewayInstanceGet**](docs/V2Api.md#deleteNatGatewayInstanceGet) | **GET** /deleteNatGatewayInstance | 
*V2Api* | [**deleteNatGatewayInstancePost**](docs/V2Api.md#deleteNatGatewayInstancePost) | **POST** /deleteNatGatewayInstance | 
*V2Api* | [**deleteNetworkAclGet**](docs/V2Api.md#deleteNetworkAclGet) | **GET** /deleteNetworkAcl | 
*V2Api* | [**deleteNetworkAclPost**](docs/V2Api.md#deleteNetworkAclPost) | **POST** /deleteNetworkAcl | 
*V2Api* | [**deleteRouteTableGet**](docs/V2Api.md#deleteRouteTableGet) | **GET** /deleteRouteTable | 
*V2Api* | [**deleteRouteTablePost**](docs/V2Api.md#deleteRouteTablePost) | **POST** /deleteRouteTable | 
*V2Api* | [**deleteSubnetGet**](docs/V2Api.md#deleteSubnetGet) | **GET** /deleteSubnet | 
*V2Api* | [**deleteSubnetPost**](docs/V2Api.md#deleteSubnetPost) | **POST** /deleteSubnet | 
*V2Api* | [**deleteVpcGet**](docs/V2Api.md#deleteVpcGet) | **GET** /deleteVpc | 
*V2Api* | [**deleteVpcPeeringInstanceGet**](docs/V2Api.md#deleteVpcPeeringInstanceGet) | **GET** /deleteVpcPeeringInstance | 
*V2Api* | [**deleteVpcPeeringInstancePost**](docs/V2Api.md#deleteVpcPeeringInstancePost) | **POST** /deleteVpcPeeringInstance | 
*V2Api* | [**deleteVpcPost**](docs/V2Api.md#deleteVpcPost) | **POST** /deleteVpc | 
*V2Api* | [**getNatGatewayInstanceDetailGet**](docs/V2Api.md#getNatGatewayInstanceDetailGet) | **GET** /getNatGatewayInstanceDetail | 
*V2Api* | [**getNatGatewayInstanceDetailPost**](docs/V2Api.md#getNatGatewayInstanceDetailPost) | **POST** /getNatGatewayInstanceDetail | 
*V2Api* | [**getNatGatewayInstanceListGet**](docs/V2Api.md#getNatGatewayInstanceListGet) | **GET** /getNatGatewayInstanceList | 
*V2Api* | [**getNatGatewayInstanceListPost**](docs/V2Api.md#getNatGatewayInstanceListPost) | **POST** /getNatGatewayInstanceList | 
*V2Api* | [**getNetworkAclDetailGet**](docs/V2Api.md#getNetworkAclDetailGet) | **GET** /getNetworkAclDetail | 
*V2Api* | [**getNetworkAclDetailPost**](docs/V2Api.md#getNetworkAclDetailPost) | **POST** /getNetworkAclDetail | 
*V2Api* | [**getNetworkAclListGet**](docs/V2Api.md#getNetworkAclListGet) | **GET** /getNetworkAclList | 
*V2Api* | [**getNetworkAclListPost**](docs/V2Api.md#getNetworkAclListPost) | **POST** /getNetworkAclList | 
*V2Api* | [**getNetworkAclRuleListGet**](docs/V2Api.md#getNetworkAclRuleListGet) | **GET** /getNetworkAclRuleList | 
*V2Api* | [**getNetworkAclRuleListPost**](docs/V2Api.md#getNetworkAclRuleListPost) | **POST** /getNetworkAclRuleList | 
*V2Api* | [**getRouteListGet**](docs/V2Api.md#getRouteListGet) | **GET** /getRouteList | 
*V2Api* | [**getRouteListPost**](docs/V2Api.md#getRouteListPost) | **POST** /getRouteList | 
*V2Api* | [**getRouteTableDetailGet**](docs/V2Api.md#getRouteTableDetailGet) | **GET** /getRouteTableDetail | 
*V2Api* | [**getRouteTableDetailPost**](docs/V2Api.md#getRouteTableDetailPost) | **POST** /getRouteTableDetail | 
*V2Api* | [**getRouteTableListGet**](docs/V2Api.md#getRouteTableListGet) | **GET** /getRouteTableList | 
*V2Api* | [**getRouteTableListPost**](docs/V2Api.md#getRouteTableListPost) | **POST** /getRouteTableList | 
*V2Api* | [**getRouteTableSubnetListGet**](docs/V2Api.md#getRouteTableSubnetListGet) | **GET** /getRouteTableSubnetList | 
*V2Api* | [**getRouteTableSubnetListPost**](docs/V2Api.md#getRouteTableSubnetListPost) | **POST** /getRouteTableSubnetList | 
*V2Api* | [**getSubnetDetailGet**](docs/V2Api.md#getSubnetDetailGet) | **GET** /getSubnetDetail | 
*V2Api* | [**getSubnetDetailPost**](docs/V2Api.md#getSubnetDetailPost) | **POST** /getSubnetDetail | 
*V2Api* | [**getSubnetListGet**](docs/V2Api.md#getSubnetListGet) | **GET** /getSubnetList | 
*V2Api* | [**getSubnetListPost**](docs/V2Api.md#getSubnetListPost) | **POST** /getSubnetList | 
*V2Api* | [**getVpcDetailGet**](docs/V2Api.md#getVpcDetailGet) | **GET** /getVpcDetail | 
*V2Api* | [**getVpcDetailPost**](docs/V2Api.md#getVpcDetailPost) | **POST** /getVpcDetail | 
*V2Api* | [**getVpcListGet**](docs/V2Api.md#getVpcListGet) | **GET** /getVpcList | 
*V2Api* | [**getVpcListPost**](docs/V2Api.md#getVpcListPost) | **POST** /getVpcList | 
*V2Api* | [**getVpcPeeringInstanceDetailGet**](docs/V2Api.md#getVpcPeeringInstanceDetailGet) | **GET** /getVpcPeeringInstanceDetail | 
*V2Api* | [**getVpcPeeringInstanceDetailPost**](docs/V2Api.md#getVpcPeeringInstanceDetailPost) | **POST** /getVpcPeeringInstanceDetail | 
*V2Api* | [**getVpcPeeringInstanceListGet**](docs/V2Api.md#getVpcPeeringInstanceListGet) | **GET** /getVpcPeeringInstanceList | 
*V2Api* | [**getVpcPeeringInstanceListPost**](docs/V2Api.md#getVpcPeeringInstanceListPost) | **POST** /getVpcPeeringInstanceList | 
*V2Api* | [**removeNetworkAclInboundRuleGet**](docs/V2Api.md#removeNetworkAclInboundRuleGet) | **GET** /removeNetworkAclInboundRule | 
*V2Api* | [**removeNetworkAclInboundRulePost**](docs/V2Api.md#removeNetworkAclInboundRulePost) | **POST** /removeNetworkAclInboundRule | 
*V2Api* | [**removeNetworkAclOutboundRuleGet**](docs/V2Api.md#removeNetworkAclOutboundRuleGet) | **GET** /removeNetworkAclOutboundRule | 
*V2Api* | [**removeNetworkAclOutboundRulePost**](docs/V2Api.md#removeNetworkAclOutboundRulePost) | **POST** /removeNetworkAclOutboundRule | 
*V2Api* | [**removeRouteGet**](docs/V2Api.md#removeRouteGet) | **GET** /removeRoute | 
*V2Api* | [**removeRoutePost**](docs/V2Api.md#removeRoutePost) | **POST** /removeRoute | 
*V2Api* | [**removeRouteTableSubnetGet**](docs/V2Api.md#removeRouteTableSubnetGet) | **GET** /removeRouteTableSubnet | 
*V2Api* | [**removeRouteTableSubnetPost**](docs/V2Api.md#removeRouteTableSubnetPost) | **POST** /removeRouteTableSubnet | 
*V2Api* | [**setNatGatewayDescriptionGet**](docs/V2Api.md#setNatGatewayDescriptionGet) | **GET** /setNatGatewayDescription | 
*V2Api* | [**setNatGatewayDescriptionPost**](docs/V2Api.md#setNatGatewayDescriptionPost) | **POST** /setNatGatewayDescription | 
*V2Api* | [**setNetworkAclDescriptionGet**](docs/V2Api.md#setNetworkAclDescriptionGet) | **GET** /setNetworkAclDescription | 
*V2Api* | [**setNetworkAclDescriptionPost**](docs/V2Api.md#setNetworkAclDescriptionPost) | **POST** /setNetworkAclDescription | 
*V2Api* | [**setRouteTableDescriptionGet**](docs/V2Api.md#setRouteTableDescriptionGet) | **GET** /setRouteTableDescription | 
*V2Api* | [**setRouteTableDescriptionPost**](docs/V2Api.md#setRouteTableDescriptionPost) | **POST** /setRouteTableDescription | 
*V2Api* | [**setSubnetNetworkAclGet**](docs/V2Api.md#setSubnetNetworkAclGet) | **GET** /setSubnetNetworkAcl | 
*V2Api* | [**setSubnetNetworkAclPost**](docs/V2Api.md#setSubnetNetworkAclPost) | **POST** /setSubnetNetworkAcl | 
*V2Api* | [**setVpcPeeringDescriptionGet**](docs/V2Api.md#setVpcPeeringDescriptionGet) | **GET** /setVpcPeeringDescription | 
*V2Api* | [**setVpcPeeringDescriptionPost**](docs/V2Api.md#setVpcPeeringDescriptionPost) | **POST** /setVpcPeeringDescription | 


## Documentation for Models

 - [AcceptOrRejectVpcPeeringRequest](docs/AcceptOrRejectVpcPeeringRequest.md)
 - [AcceptOrRejectVpcPeeringResponse](docs/AcceptOrRejectVpcPeeringResponse.md)
 - [AddNetworkAclInboundRuleRequest](docs/AddNetworkAclInboundRuleRequest.md)
 - [AddNetworkAclInboundRuleResponse](docs/AddNetworkAclInboundRuleResponse.md)
 - [AddNetworkAclOutboundRuleRequest](docs/AddNetworkAclOutboundRuleRequest.md)
 - [AddNetworkAclOutboundRuleResponse](docs/AddNetworkAclOutboundRuleResponse.md)
 - [AddNetworkAclRuleParameter](docs/AddNetworkAclRuleParameter.md)
 - [AddRouteRequest](docs/AddRouteRequest.md)
 - [AddRouteResponse](docs/AddRouteResponse.md)
 - [AddRouteTableSubnetRequest](docs/AddRouteTableSubnetRequest.md)
 - [AddRouteTableSubnetResponse](docs/AddRouteTableSubnetResponse.md)
 - [CommonCode](docs/CommonCode.md)
 - [CreateNatGatewayInstanceRequest](docs/CreateNatGatewayInstanceRequest.md)
 - [CreateNatGatewayInstanceResponse](docs/CreateNatGatewayInstanceResponse.md)
 - [CreateNetworkAclRequest](docs/CreateNetworkAclRequest.md)
 - [CreateNetworkAclResponse](docs/CreateNetworkAclResponse.md)
 - [CreateRouteTableRequest](docs/CreateRouteTableRequest.md)
 - [CreateRouteTableResponse](docs/CreateRouteTableResponse.md)
 - [CreateSubnetRequest](docs/CreateSubnetRequest.md)
 - [CreateSubnetResponse](docs/CreateSubnetResponse.md)
 - [CreateVpcPeeringInstanceRequest](docs/CreateVpcPeeringInstanceRequest.md)
 - [CreateVpcPeeringInstanceResponse](docs/CreateVpcPeeringInstanceResponse.md)
 - [CreateVpcRequest](docs/CreateVpcRequest.md)
 - [CreateVpcResponse](docs/CreateVpcResponse.md)
 - [DeleteNatGatewayInstanceRequest](docs/DeleteNatGatewayInstanceRequest.md)
 - [DeleteNatGatewayInstanceResponse](docs/DeleteNatGatewayInstanceResponse.md)
 - [DeleteNetworkAclRequest](docs/DeleteNetworkAclRequest.md)
 - [DeleteNetworkAclResponse](docs/DeleteNetworkAclResponse.md)
 - [DeleteRouteTableRequest](docs/DeleteRouteTableRequest.md)
 - [DeleteRouteTableResponse](docs/DeleteRouteTableResponse.md)
 - [DeleteSubnetRequest](docs/DeleteSubnetRequest.md)
 - [DeleteSubnetResponse](docs/DeleteSubnetResponse.md)
 - [DeleteVpcPeeringInstanceRequest](docs/DeleteVpcPeeringInstanceRequest.md)
 - [DeleteVpcPeeringInstanceResponse](docs/DeleteVpcPeeringInstanceResponse.md)
 - [DeleteVpcRequest](docs/DeleteVpcRequest.md)
 - [DeleteVpcResponse](docs/DeleteVpcResponse.md)
 - [GetNatGatewayInstanceDetailRequest](docs/GetNatGatewayInstanceDetailRequest.md)
 - [GetNatGatewayInstanceDetailResponse](docs/GetNatGatewayInstanceDetailResponse.md)
 - [GetNatGatewayInstanceListRequest](docs/GetNatGatewayInstanceListRequest.md)
 - [GetNatGatewayInstanceListResponse](docs/GetNatGatewayInstanceListResponse.md)
 - [GetNetworkAclDetailRequest](docs/GetNetworkAclDetailRequest.md)
 - [GetNetworkAclDetailResponse](docs/GetNetworkAclDetailResponse.md)
 - [GetNetworkAclListRequest](docs/GetNetworkAclListRequest.md)
 - [GetNetworkAclListResponse](docs/GetNetworkAclListResponse.md)
 - [GetNetworkAclRuleListRequest](docs/GetNetworkAclRuleListRequest.md)
 - [GetNetworkAclRuleListResponse](docs/GetNetworkAclRuleListResponse.md)
 - [GetRouteListRequest](docs/GetRouteListRequest.md)
 - [GetRouteListResponse](docs/GetRouteListResponse.md)
 - [GetRouteTableDetailRequest](docs/GetRouteTableDetailRequest.md)
 - [GetRouteTableDetailResponse](docs/GetRouteTableDetailResponse.md)
 - [GetRouteTableListRequest](docs/GetRouteTableListRequest.md)
 - [GetRouteTableListResponse](docs/GetRouteTableListResponse.md)
 - [GetRouteTableSubnetListRequest](docs/GetRouteTableSubnetListRequest.md)
 - [GetRouteTableSubnetListResponse](docs/GetRouteTableSubnetListResponse.md)
 - [GetSubnetDetailRequest](docs/GetSubnetDetailRequest.md)
 - [GetSubnetDetailResponse](docs/GetSubnetDetailResponse.md)
 - [GetSubnetListRequest](docs/GetSubnetListRequest.md)
 - [GetSubnetListResponse](docs/GetSubnetListResponse.md)
 - [GetVpcDetailRequest](docs/GetVpcDetailRequest.md)
 - [GetVpcDetailResponse](docs/GetVpcDetailResponse.md)
 - [GetVpcListRequest](docs/GetVpcListRequest.md)
 - [GetVpcListResponse](docs/GetVpcListResponse.md)
 - [GetVpcPeeringInstanceDetailRequest](docs/GetVpcPeeringInstanceDetailRequest.md)
 - [GetVpcPeeringInstanceDetailResponse](docs/GetVpcPeeringInstanceDetailResponse.md)
 - [GetVpcPeeringInstanceListRequest](docs/GetVpcPeeringInstanceListRequest.md)
 - [GetVpcPeeringInstanceListResponse](docs/GetVpcPeeringInstanceListResponse.md)
 - [NatGatewayInstance](docs/NatGatewayInstance.md)
 - [NetworkAcl](docs/NetworkAcl.md)
 - [NetworkAclRule](docs/NetworkAclRule.md)
 - [RemoveNetworkAclInboundRuleRequest](docs/RemoveNetworkAclInboundRuleRequest.md)
 - [RemoveNetworkAclInboundRuleResponse](docs/RemoveNetworkAclInboundRuleResponse.md)
 - [RemoveNetworkAclOutboundRuleRequest](docs/RemoveNetworkAclOutboundRuleRequest.md)
 - [RemoveNetworkAclOutboundRuleResponse](docs/RemoveNetworkAclOutboundRuleResponse.md)
 - [RemoveNetworkAclRuleParameter](docs/RemoveNetworkAclRuleParameter.md)
 - [RemoveRouteRequest](docs/RemoveRouteRequest.md)
 - [RemoveRouteResponse](docs/RemoveRouteResponse.md)
 - [RemoveRouteTableSubnetRequest](docs/RemoveRouteTableSubnetRequest.md)
 - [RemoveRouteTableSubnetResponse](docs/RemoveRouteTableSubnetResponse.md)
 - [Route](docs/Route.md)
 - [RouteParameter](docs/RouteParameter.md)
 - [RouteTable](docs/RouteTable.md)
 - [SetNatGatewayDescriptionRequest](docs/SetNatGatewayDescriptionRequest.md)
 - [SetNatGatewayDescriptionResponse](docs/SetNatGatewayDescriptionResponse.md)
 - [SetNetworkAclDescriptionRequest](docs/SetNetworkAclDescriptionRequest.md)
 - [SetNetworkAclDescriptionResponse](docs/SetNetworkAclDescriptionResponse.md)
 - [SetRouteTableDescriptionRequest](docs/SetRouteTableDescriptionRequest.md)
 - [SetRouteTableDescriptionResponse](docs/SetRouteTableDescriptionResponse.md)
 - [SetSubnetNetworkAclRequest](docs/SetSubnetNetworkAclRequest.md)
 - [SetSubnetNetworkAclResponse](docs/SetSubnetNetworkAclResponse.md)
 - [SetVpcPeeringDescriptionRequest](docs/SetVpcPeeringDescriptionRequest.md)
 - [SetVpcPeeringDescriptionResponse](docs/SetVpcPeeringDescriptionResponse.md)
 - [Subnet](docs/Subnet.md)
 - [Vpc](docs/Vpc.md)
 - [VpcPeeringInstance](docs/VpcPeeringInstance.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



