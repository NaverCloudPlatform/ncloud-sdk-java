# vserver

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
	<artifactId>vserver</artifactId>
	<version>1.1.2</version>
	<scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

	mvn package

Then manually install the following JARs:

* target/vserver-1.1.2.jar
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
import com.ncloud.vserver.model.*;

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
		AddAccessControlGroupInboundRuleRequest addAccessControlGroupInboundRuleRequest = new AddAccessControlGroupInboundRuleRequest(); // AddAccessControlGroupInboundRuleRequest | addAccessControlGroupInboundRuleRequest
		try {
			// Handler Successful response
			ApiResponse<AddAccessControlGroupInboundRuleResponse> result = apiInstance.addAccessControlGroupInboundRuleGet(addAccessControlGroupInboundRuleRequest);
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

All URIs are relative to *https://ncloud.apigw.ntruss.com/vserver/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*V2Api* | [**addAccessControlGroupInboundRuleGet**](docs/V2Api.md#addAccessControlGroupInboundRuleGet) | **GET** /addAccessControlGroupInboundRule | 
*V2Api* | [**addAccessControlGroupInboundRulePost**](docs/V2Api.md#addAccessControlGroupInboundRulePost) | **POST** /addAccessControlGroupInboundRule | 
*V2Api* | [**addAccessControlGroupOutboundRuleGet**](docs/V2Api.md#addAccessControlGroupOutboundRuleGet) | **GET** /addAccessControlGroupOutboundRule | 
*V2Api* | [**addAccessControlGroupOutboundRulePost**](docs/V2Api.md#addAccessControlGroupOutboundRulePost) | **POST** /addAccessControlGroupOutboundRule | 
*V2Api* | [**addMemberServerImageSharingPermissionGet**](docs/V2Api.md#addMemberServerImageSharingPermissionGet) | **GET** /addMemberServerImageSharingPermission | 
*V2Api* | [**addMemberServerImageSharingPermissionPost**](docs/V2Api.md#addMemberServerImageSharingPermissionPost) | **POST** /addMemberServerImageSharingPermission | 
*V2Api* | [**addNetworkInterfaceAccessControlGroupGet**](docs/V2Api.md#addNetworkInterfaceAccessControlGroupGet) | **GET** /addNetworkInterfaceAccessControlGroup | 
*V2Api* | [**addNetworkInterfaceAccessControlGroupPost**](docs/V2Api.md#addNetworkInterfaceAccessControlGroupPost) | **POST** /addNetworkInterfaceAccessControlGroup | 
*V2Api* | [**addPlacementGroupServerInstanceGet**](docs/V2Api.md#addPlacementGroupServerInstanceGet) | **GET** /addPlacementGroupServerInstance | 
*V2Api* | [**addPlacementGroupServerInstancePost**](docs/V2Api.md#addPlacementGroupServerInstancePost) | **POST** /addPlacementGroupServerInstance | 
*V2Api* | [**addServerImageSharingPermissionGet**](docs/V2Api.md#addServerImageSharingPermissionGet) | **GET** /addServerImageSharingPermission | 
*V2Api* | [**addServerImageSharingPermissionPost**](docs/V2Api.md#addServerImageSharingPermissionPost) | **POST** /addServerImageSharingPermission | 
*V2Api* | [**assignSecondaryIpsGet**](docs/V2Api.md#assignSecondaryIpsGet) | **GET** /assignSecondaryIps | 
*V2Api* | [**assignSecondaryIpsPost**](docs/V2Api.md#assignSecondaryIpsPost) | **POST** /assignSecondaryIps | 
*V2Api* | [**associatePublicIpWithServerInstanceGet**](docs/V2Api.md#associatePublicIpWithServerInstanceGet) | **GET** /associatePublicIpWithServerInstance | 
*V2Api* | [**associatePublicIpWithServerInstancePost**](docs/V2Api.md#associatePublicIpWithServerInstancePost) | **POST** /associatePublicIpWithServerInstance | 
*V2Api* | [**attachBlockStorageInstanceGet**](docs/V2Api.md#attachBlockStorageInstanceGet) | **GET** /attachBlockStorageInstance | 
*V2Api* | [**attachBlockStorageInstancePost**](docs/V2Api.md#attachBlockStorageInstancePost) | **POST** /attachBlockStorageInstance | 
*V2Api* | [**attachNetworkInterfaceGet**](docs/V2Api.md#attachNetworkInterfaceGet) | **GET** /attachNetworkInterface | 
*V2Api* | [**attachNetworkInterfacePost**](docs/V2Api.md#attachNetworkInterfacePost) | **POST** /attachNetworkInterface | 
*V2Api* | [**changeBlockStorageInstanceGet**](docs/V2Api.md#changeBlockStorageInstanceGet) | **GET** /changeBlockStorageInstance | 
*V2Api* | [**changeBlockStorageInstancePost**](docs/V2Api.md#changeBlockStorageInstancePost) | **POST** /changeBlockStorageInstance | 
*V2Api* | [**changeBlockStorageVolumeSizeGet**](docs/V2Api.md#changeBlockStorageVolumeSizeGet) | **GET** /changeBlockStorageVolumeSize | 
*V2Api* | [**changeBlockStorageVolumeSizePost**](docs/V2Api.md#changeBlockStorageVolumeSizePost) | **POST** /changeBlockStorageVolumeSize | 
*V2Api* | [**changeServerInstanceSpecGet**](docs/V2Api.md#changeServerInstanceSpecGet) | **GET** /changeServerInstanceSpec | 
*V2Api* | [**changeServerInstanceSpecPost**](docs/V2Api.md#changeServerInstanceSpecPost) | **POST** /changeServerInstanceSpec | 
*V2Api* | [**createAccessControlGroupGet**](docs/V2Api.md#createAccessControlGroupGet) | **GET** /createAccessControlGroup | 
*V2Api* | [**createAccessControlGroupPost**](docs/V2Api.md#createAccessControlGroupPost) | **POST** /createAccessControlGroup | 
*V2Api* | [**createBlockStorageInstanceGet**](docs/V2Api.md#createBlockStorageInstanceGet) | **GET** /createBlockStorageInstance | 
*V2Api* | [**createBlockStorageInstancePost**](docs/V2Api.md#createBlockStorageInstancePost) | **POST** /createBlockStorageInstance | 
*V2Api* | [**createBlockStorageSnapshotInstanceGet**](docs/V2Api.md#createBlockStorageSnapshotInstanceGet) | **GET** /createBlockStorageSnapshotInstance | 
*V2Api* | [**createBlockStorageSnapshotInstancePost**](docs/V2Api.md#createBlockStorageSnapshotInstancePost) | **POST** /createBlockStorageSnapshotInstance | 
*V2Api* | [**createInitScriptGet**](docs/V2Api.md#createInitScriptGet) | **GET** /createInitScript | 
*V2Api* | [**createInitScriptPost**](docs/V2Api.md#createInitScriptPost) | **POST** /createInitScript | 
*V2Api* | [**createLoginKeyGet**](docs/V2Api.md#createLoginKeyGet) | **GET** /createLoginKey | 
*V2Api* | [**createLoginKeyPost**](docs/V2Api.md#createLoginKeyPost) | **POST** /createLoginKey | 
*V2Api* | [**createMemberServerImageInstanceGet**](docs/V2Api.md#createMemberServerImageInstanceGet) | **GET** /createMemberServerImageInstance | 
*V2Api* | [**createMemberServerImageInstancePost**](docs/V2Api.md#createMemberServerImageInstancePost) | **POST** /createMemberServerImageInstance | 
*V2Api* | [**createNetworkInterfaceGet**](docs/V2Api.md#createNetworkInterfaceGet) | **GET** /createNetworkInterface | 
*V2Api* | [**createNetworkInterfacePost**](docs/V2Api.md#createNetworkInterfacePost) | **POST** /createNetworkInterface | 
*V2Api* | [**createPlacementGroupGet**](docs/V2Api.md#createPlacementGroupGet) | **GET** /createPlacementGroup | 
*V2Api* | [**createPlacementGroupPost**](docs/V2Api.md#createPlacementGroupPost) | **POST** /createPlacementGroup | 
*V2Api* | [**createPublicIpInstanceGet**](docs/V2Api.md#createPublicIpInstanceGet) | **GET** /createPublicIpInstance | 
*V2Api* | [**createPublicIpInstancePost**](docs/V2Api.md#createPublicIpInstancePost) | **POST** /createPublicIpInstance | 
*V2Api* | [**createServerImageFromSnapshotGet**](docs/V2Api.md#createServerImageFromSnapshotGet) | **GET** /createServerImageFromSnapshot | 
*V2Api* | [**createServerImageFromSnapshotPost**](docs/V2Api.md#createServerImageFromSnapshotPost) | **POST** /createServerImageFromSnapshot | 
*V2Api* | [**createServerImageGet**](docs/V2Api.md#createServerImageGet) | **GET** /createServerImage | 
*V2Api* | [**createServerImagePost**](docs/V2Api.md#createServerImagePost) | **POST** /createServerImage | 
*V2Api* | [**createServerInstancesGet**](docs/V2Api.md#createServerInstancesGet) | **GET** /createServerInstances | 
*V2Api* | [**createServerInstancesPost**](docs/V2Api.md#createServerInstancesPost) | **POST** /createServerInstances | 
*V2Api* | [**deleteAccessControlGroupGet**](docs/V2Api.md#deleteAccessControlGroupGet) | **GET** /deleteAccessControlGroup | 
*V2Api* | [**deleteAccessControlGroupPost**](docs/V2Api.md#deleteAccessControlGroupPost) | **POST** /deleteAccessControlGroup | 
*V2Api* | [**deleteBlockStorageInstancesGet**](docs/V2Api.md#deleteBlockStorageInstancesGet) | **GET** /deleteBlockStorageInstances | 
*V2Api* | [**deleteBlockStorageInstancesPost**](docs/V2Api.md#deleteBlockStorageInstancesPost) | **POST** /deleteBlockStorageInstances | 
*V2Api* | [**deleteBlockStorageSnapshotInstancesGet**](docs/V2Api.md#deleteBlockStorageSnapshotInstancesGet) | **GET** /deleteBlockStorageSnapshotInstances | 
*V2Api* | [**deleteBlockStorageSnapshotInstancesPost**](docs/V2Api.md#deleteBlockStorageSnapshotInstancesPost) | **POST** /deleteBlockStorageSnapshotInstances | 
*V2Api* | [**deleteInitScriptsGet**](docs/V2Api.md#deleteInitScriptsGet) | **GET** /deleteInitScripts | 
*V2Api* | [**deleteInitScriptsPost**](docs/V2Api.md#deleteInitScriptsPost) | **POST** /deleteInitScripts | 
*V2Api* | [**deleteLoginKeysGet**](docs/V2Api.md#deleteLoginKeysGet) | **GET** /deleteLoginKeys | 
*V2Api* | [**deleteLoginKeysPost**](docs/V2Api.md#deleteLoginKeysPost) | **POST** /deleteLoginKeys | 
*V2Api* | [**deleteMemberServerImageInstancesGet**](docs/V2Api.md#deleteMemberServerImageInstancesGet) | **GET** /deleteMemberServerImageInstances | 
*V2Api* | [**deleteMemberServerImageInstancesPost**](docs/V2Api.md#deleteMemberServerImageInstancesPost) | **POST** /deleteMemberServerImageInstances | 
*V2Api* | [**deleteNetworkInterfaceGet**](docs/V2Api.md#deleteNetworkInterfaceGet) | **GET** /deleteNetworkInterface | 
*V2Api* | [**deleteNetworkInterfacePost**](docs/V2Api.md#deleteNetworkInterfacePost) | **POST** /deleteNetworkInterface | 
*V2Api* | [**deletePlacementGroupGet**](docs/V2Api.md#deletePlacementGroupGet) | **GET** /deletePlacementGroup | 
*V2Api* | [**deletePlacementGroupPost**](docs/V2Api.md#deletePlacementGroupPost) | **POST** /deletePlacementGroup | 
*V2Api* | [**deletePublicIpInstanceGet**](docs/V2Api.md#deletePublicIpInstanceGet) | **GET** /deletePublicIpInstance | 
*V2Api* | [**deletePublicIpInstancePost**](docs/V2Api.md#deletePublicIpInstancePost) | **POST** /deletePublicIpInstance | 
*V2Api* | [**deleteServerImageGet**](docs/V2Api.md#deleteServerImageGet) | **GET** /deleteServerImage | 
*V2Api* | [**deleteServerImagePost**](docs/V2Api.md#deleteServerImagePost) | **POST** /deleteServerImage | 
*V2Api* | [**detachBlockStorageInstancesGet**](docs/V2Api.md#detachBlockStorageInstancesGet) | **GET** /detachBlockStorageInstances | 
*V2Api* | [**detachBlockStorageInstancesPost**](docs/V2Api.md#detachBlockStorageInstancesPost) | **POST** /detachBlockStorageInstances | 
*V2Api* | [**detachNetworkInterfaceGet**](docs/V2Api.md#detachNetworkInterfaceGet) | **GET** /detachNetworkInterface | 
*V2Api* | [**detachNetworkInterfacePost**](docs/V2Api.md#detachNetworkInterfacePost) | **POST** /detachNetworkInterface | 
*V2Api* | [**disableFlowLogGet**](docs/V2Api.md#disableFlowLogGet) | **GET** /disableFlowLog | 
*V2Api* | [**disableFlowLogPost**](docs/V2Api.md#disableFlowLogPost) | **POST** /disableFlowLog | 
*V2Api* | [**disassociatePublicIpFromServerInstanceGet**](docs/V2Api.md#disassociatePublicIpFromServerInstanceGet) | **GET** /disassociatePublicIpFromServerInstance | 
*V2Api* | [**disassociatePublicIpFromServerInstancePost**](docs/V2Api.md#disassociatePublicIpFromServerInstancePost) | **POST** /disassociatePublicIpFromServerInstance | 
*V2Api* | [**enableFlowLogGet**](docs/V2Api.md#enableFlowLogGet) | **GET** /enableFlowLog | 
*V2Api* | [**enableFlowLogPost**](docs/V2Api.md#enableFlowLogPost) | **POST** /enableFlowLog | 
*V2Api* | [**getAccessControlGroupDetailGet**](docs/V2Api.md#getAccessControlGroupDetailGet) | **GET** /getAccessControlGroupDetail | 
*V2Api* | [**getAccessControlGroupDetailPost**](docs/V2Api.md#getAccessControlGroupDetailPost) | **POST** /getAccessControlGroupDetail | 
*V2Api* | [**getAccessControlGroupListGet**](docs/V2Api.md#getAccessControlGroupListGet) | **GET** /getAccessControlGroupList | 
*V2Api* | [**getAccessControlGroupListPost**](docs/V2Api.md#getAccessControlGroupListPost) | **POST** /getAccessControlGroupList | 
*V2Api* | [**getAccessControlGroupRuleListGet**](docs/V2Api.md#getAccessControlGroupRuleListGet) | **GET** /getAccessControlGroupRuleList | 
*V2Api* | [**getAccessControlGroupRuleListPost**](docs/V2Api.md#getAccessControlGroupRuleListPost) | **POST** /getAccessControlGroupRuleList | 
*V2Api* | [**getBlockStorageInstanceDetailGet**](docs/V2Api.md#getBlockStorageInstanceDetailGet) | **GET** /getBlockStorageInstanceDetail | 
*V2Api* | [**getBlockStorageInstanceDetailPost**](docs/V2Api.md#getBlockStorageInstanceDetailPost) | **POST** /getBlockStorageInstanceDetail | 
*V2Api* | [**getBlockStorageInstanceListGet**](docs/V2Api.md#getBlockStorageInstanceListGet) | **GET** /getBlockStorageInstanceList | 
*V2Api* | [**getBlockStorageInstanceListPost**](docs/V2Api.md#getBlockStorageInstanceListPost) | **POST** /getBlockStorageInstanceList | 
*V2Api* | [**getBlockStorageSnapshotInstanceDetailGet**](docs/V2Api.md#getBlockStorageSnapshotInstanceDetailGet) | **GET** /getBlockStorageSnapshotInstanceDetail | 
*V2Api* | [**getBlockStorageSnapshotInstanceDetailPost**](docs/V2Api.md#getBlockStorageSnapshotInstanceDetailPost) | **POST** /getBlockStorageSnapshotInstanceDetail | 
*V2Api* | [**getBlockStorageSnapshotInstanceListGet**](docs/V2Api.md#getBlockStorageSnapshotInstanceListGet) | **GET** /getBlockStorageSnapshotInstanceList | 
*V2Api* | [**getBlockStorageSnapshotInstanceListPost**](docs/V2Api.md#getBlockStorageSnapshotInstanceListPost) | **POST** /getBlockStorageSnapshotInstanceList | 
*V2Api* | [**getBlockStorageVolumeTypeListGet**](docs/V2Api.md#getBlockStorageVolumeTypeListGet) | **GET** /getBlockStorageVolumeTypeList | 
*V2Api* | [**getBlockStorageVolumeTypeListPost**](docs/V2Api.md#getBlockStorageVolumeTypeListPost) | **POST** /getBlockStorageVolumeTypeList | 
*V2Api* | [**getFlowLogConfigurationListGet**](docs/V2Api.md#getFlowLogConfigurationListGet) | **GET** /getFlowLogConfigurationList | 
*V2Api* | [**getFlowLogConfigurationListPost**](docs/V2Api.md#getFlowLogConfigurationListPost) | **POST** /getFlowLogConfigurationList | 
*V2Api* | [**getHypervisorTypeListGet**](docs/V2Api.md#getHypervisorTypeListGet) | **GET** /getHypervisorTypeList | 
*V2Api* | [**getHypervisorTypeListPost**](docs/V2Api.md#getHypervisorTypeListPost) | **POST** /getHypervisorTypeList | 
*V2Api* | [**getInitScriptDetailGet**](docs/V2Api.md#getInitScriptDetailGet) | **GET** /getInitScriptDetail | 
*V2Api* | [**getInitScriptDetailPost**](docs/V2Api.md#getInitScriptDetailPost) | **POST** /getInitScriptDetail | 
*V2Api* | [**getInitScriptListGet**](docs/V2Api.md#getInitScriptListGet) | **GET** /getInitScriptList | 
*V2Api* | [**getInitScriptListPost**](docs/V2Api.md#getInitScriptListPost) | **POST** /getInitScriptList | 
*V2Api* | [**getLoginKeyListGet**](docs/V2Api.md#getLoginKeyListGet) | **GET** /getLoginKeyList | 
*V2Api* | [**getLoginKeyListPost**](docs/V2Api.md#getLoginKeyListPost) | **POST** /getLoginKeyList | 
*V2Api* | [**getMemberServerImageInstanceDetailGet**](docs/V2Api.md#getMemberServerImageInstanceDetailGet) | **GET** /getMemberServerImageInstanceDetail | 
*V2Api* | [**getMemberServerImageInstanceDetailPost**](docs/V2Api.md#getMemberServerImageInstanceDetailPost) | **POST** /getMemberServerImageInstanceDetail | 
*V2Api* | [**getMemberServerImageInstanceListGet**](docs/V2Api.md#getMemberServerImageInstanceListGet) | **GET** /getMemberServerImageInstanceList | 
*V2Api* | [**getMemberServerImageInstanceListPost**](docs/V2Api.md#getMemberServerImageInstanceListPost) | **POST** /getMemberServerImageInstanceList | 
*V2Api* | [**getNetworkInterfaceDetailGet**](docs/V2Api.md#getNetworkInterfaceDetailGet) | **GET** /getNetworkInterfaceDetail | 
*V2Api* | [**getNetworkInterfaceDetailPost**](docs/V2Api.md#getNetworkInterfaceDetailPost) | **POST** /getNetworkInterfaceDetail | 
*V2Api* | [**getNetworkInterfaceListGet**](docs/V2Api.md#getNetworkInterfaceListGet) | **GET** /getNetworkInterfaceList | 
*V2Api* | [**getNetworkInterfaceListPost**](docs/V2Api.md#getNetworkInterfaceListPost) | **POST** /getNetworkInterfaceList | 
*V2Api* | [**getPlacementGroupDetailGet**](docs/V2Api.md#getPlacementGroupDetailGet) | **GET** /getPlacementGroupDetail | 
*V2Api* | [**getPlacementGroupDetailPost**](docs/V2Api.md#getPlacementGroupDetailPost) | **POST** /getPlacementGroupDetail | 
*V2Api* | [**getPlacementGroupListGet**](docs/V2Api.md#getPlacementGroupListGet) | **GET** /getPlacementGroupList | 
*V2Api* | [**getPlacementGroupListPost**](docs/V2Api.md#getPlacementGroupListPost) | **POST** /getPlacementGroupList | 
*V2Api* | [**getPublicIpInstanceDetailGet**](docs/V2Api.md#getPublicIpInstanceDetailGet) | **GET** /getPublicIpInstanceDetail | 
*V2Api* | [**getPublicIpInstanceDetailPost**](docs/V2Api.md#getPublicIpInstanceDetailPost) | **POST** /getPublicIpInstanceDetail | 
*V2Api* | [**getPublicIpInstanceListGet**](docs/V2Api.md#getPublicIpInstanceListGet) | **GET** /getPublicIpInstanceList | 
*V2Api* | [**getPublicIpInstanceListPost**](docs/V2Api.md#getPublicIpInstanceListPost) | **POST** /getPublicIpInstanceList | 
*V2Api* | [**getPublicIpTargetServerInstanceListGet**](docs/V2Api.md#getPublicIpTargetServerInstanceListGet) | **GET** /getPublicIpTargetServerInstanceList | 
*V2Api* | [**getPublicIpTargetServerInstanceListPost**](docs/V2Api.md#getPublicIpTargetServerInstanceListPost) | **POST** /getPublicIpTargetServerInstanceList | 
*V2Api* | [**getRaidListGet**](docs/V2Api.md#getRaidListGet) | **GET** /getRaidList | 
*V2Api* | [**getRaidListPost**](docs/V2Api.md#getRaidListPost) | **POST** /getRaidList | 
*V2Api* | [**getRegionListGet**](docs/V2Api.md#getRegionListGet) | **GET** /getRegionList | 
*V2Api* | [**getRegionListPost**](docs/V2Api.md#getRegionListPost) | **POST** /getRegionList | 
*V2Api* | [**getRootPasswordGet**](docs/V2Api.md#getRootPasswordGet) | **GET** /getRootPassword | 
*V2Api* | [**getRootPasswordPost**](docs/V2Api.md#getRootPasswordPost) | **POST** /getRootPassword | 
*V2Api* | [**getRootPasswordServerInstanceListGet**](docs/V2Api.md#getRootPasswordServerInstanceListGet) | **GET** /getRootPasswordServerInstanceList | 
*V2Api* | [**getRootPasswordServerInstanceListPost**](docs/V2Api.md#getRootPasswordServerInstanceListPost) | **POST** /getRootPasswordServerInstanceList | 
*V2Api* | [**getServerImageDetailGet**](docs/V2Api.md#getServerImageDetailGet) | **GET** /getServerImageDetail | 
*V2Api* | [**getServerImageDetailPost**](docs/V2Api.md#getServerImageDetailPost) | **POST** /getServerImageDetail | 
*V2Api* | [**getServerImageListGet**](docs/V2Api.md#getServerImageListGet) | **GET** /getServerImageList | 
*V2Api* | [**getServerImageListPost**](docs/V2Api.md#getServerImageListPost) | **POST** /getServerImageList | 
*V2Api* | [**getServerImageProductListGet**](docs/V2Api.md#getServerImageProductListGet) | **GET** /getServerImageProductList | 
*V2Api* | [**getServerImageProductListPost**](docs/V2Api.md#getServerImageProductListPost) | **POST** /getServerImageProductList | 
*V2Api* | [**getServerInstanceDetailGet**](docs/V2Api.md#getServerInstanceDetailGet) | **GET** /getServerInstanceDetail | 
*V2Api* | [**getServerInstanceDetailPost**](docs/V2Api.md#getServerInstanceDetailPost) | **POST** /getServerInstanceDetail | 
*V2Api* | [**getServerInstanceListGet**](docs/V2Api.md#getServerInstanceListGet) | **GET** /getServerInstanceList | 
*V2Api* | [**getServerInstanceListPost**](docs/V2Api.md#getServerInstanceListPost) | **POST** /getServerInstanceList | 
*V2Api* | [**getServerProductListGet**](docs/V2Api.md#getServerProductListGet) | **GET** /getServerProductList | 
*V2Api* | [**getServerProductListPost**](docs/V2Api.md#getServerProductListPost) | **POST** /getServerProductList | 
*V2Api* | [**getServerSpecDetailGet**](docs/V2Api.md#getServerSpecDetailGet) | **GET** /getServerSpecDetail | 
*V2Api* | [**getServerSpecDetailPost**](docs/V2Api.md#getServerSpecDetailPost) | **POST** /getServerSpecDetail | 
*V2Api* | [**getServerSpecListGet**](docs/V2Api.md#getServerSpecListGet) | **GET** /getServerSpecList | 
*V2Api* | [**getServerSpecListPost**](docs/V2Api.md#getServerSpecListPost) | **POST** /getServerSpecList | 
*V2Api* | [**getZoneListGet**](docs/V2Api.md#getZoneListGet) | **GET** /getZoneList | 
*V2Api* | [**getZoneListPost**](docs/V2Api.md#getZoneListPost) | **POST** /getZoneList | 
*V2Api* | [**importLoginKeyGet**](docs/V2Api.md#importLoginKeyGet) | **GET** /importLoginKey | 
*V2Api* | [**importLoginKeyPost**](docs/V2Api.md#importLoginKeyPost) | **POST** /importLoginKey | 
*V2Api* | [**interruptServerInstanceGet**](docs/V2Api.md#interruptServerInstanceGet) | **GET** /interruptServerInstance | 
*V2Api* | [**interruptServerInstancePost**](docs/V2Api.md#interruptServerInstancePost) | **POST** /interruptServerInstance | 
*V2Api* | [**rebootServerInstancesGet**](docs/V2Api.md#rebootServerInstancesGet) | **GET** /rebootServerInstances | 
*V2Api* | [**rebootServerInstancesPost**](docs/V2Api.md#rebootServerInstancesPost) | **POST** /rebootServerInstances | 
*V2Api* | [**removeAccessControlGroupInboundRuleGet**](docs/V2Api.md#removeAccessControlGroupInboundRuleGet) | **GET** /removeAccessControlGroupInboundRule | 
*V2Api* | [**removeAccessControlGroupInboundRulePost**](docs/V2Api.md#removeAccessControlGroupInboundRulePost) | **POST** /removeAccessControlGroupInboundRule | 
*V2Api* | [**removeAccessControlGroupOutboundRuleGet**](docs/V2Api.md#removeAccessControlGroupOutboundRuleGet) | **GET** /removeAccessControlGroupOutboundRule | 
*V2Api* | [**removeAccessControlGroupOutboundRulePost**](docs/V2Api.md#removeAccessControlGroupOutboundRulePost) | **POST** /removeAccessControlGroupOutboundRule | 
*V2Api* | [**removeMemberServerImageSharingPermissionGet**](docs/V2Api.md#removeMemberServerImageSharingPermissionGet) | **GET** /removeMemberServerImageSharingPermission | 
*V2Api* | [**removeMemberServerImageSharingPermissionPost**](docs/V2Api.md#removeMemberServerImageSharingPermissionPost) | **POST** /removeMemberServerImageSharingPermission | 
*V2Api* | [**removeNetworkInterfaceAccessControlGroupGet**](docs/V2Api.md#removeNetworkInterfaceAccessControlGroupGet) | **GET** /removeNetworkInterfaceAccessControlGroup | 
*V2Api* | [**removeNetworkInterfaceAccessControlGroupPost**](docs/V2Api.md#removeNetworkInterfaceAccessControlGroupPost) | **POST** /removeNetworkInterfaceAccessControlGroup | 
*V2Api* | [**removePlacementGroupServerInstanceGet**](docs/V2Api.md#removePlacementGroupServerInstanceGet) | **GET** /removePlacementGroupServerInstance | 
*V2Api* | [**removePlacementGroupServerInstancePost**](docs/V2Api.md#removePlacementGroupServerInstancePost) | **POST** /removePlacementGroupServerInstance | 
*V2Api* | [**removeServerImageSharingPermissionGet**](docs/V2Api.md#removeServerImageSharingPermissionGet) | **GET** /removeServerImageSharingPermission | 
*V2Api* | [**removeServerImageSharingPermissionPost**](docs/V2Api.md#removeServerImageSharingPermissionPost) | **POST** /removeServerImageSharingPermission | 
*V2Api* | [**setBlockStorageReturnProtectionGet**](docs/V2Api.md#setBlockStorageReturnProtectionGet) | **GET** /setBlockStorageReturnProtection | 
*V2Api* | [**setBlockStorageReturnProtectionPost**](docs/V2Api.md#setBlockStorageReturnProtectionPost) | **POST** /setBlockStorageReturnProtection | 
*V2Api* | [**setMemberServerImageSharingPermissionGet**](docs/V2Api.md#setMemberServerImageSharingPermissionGet) | **GET** /setMemberServerImageSharingPermission | 
*V2Api* | [**setMemberServerImageSharingPermissionPost**](docs/V2Api.md#setMemberServerImageSharingPermissionPost) | **POST** /setMemberServerImageSharingPermission | 
*V2Api* | [**setProtectServerTerminationGet**](docs/V2Api.md#setProtectServerTerminationGet) | **GET** /setProtectServerTermination | 
*V2Api* | [**setProtectServerTerminationPost**](docs/V2Api.md#setProtectServerTerminationPost) | **POST** /setProtectServerTermination | 
*V2Api* | [**startServerInstancesGet**](docs/V2Api.md#startServerInstancesGet) | **GET** /startServerInstances | 
*V2Api* | [**startServerInstancesPost**](docs/V2Api.md#startServerInstancesPost) | **POST** /startServerInstances | 
*V2Api* | [**stopServerInstancesGet**](docs/V2Api.md#stopServerInstancesGet) | **GET** /stopServerInstances | 
*V2Api* | [**stopServerInstancesPost**](docs/V2Api.md#stopServerInstancesPost) | **POST** /stopServerInstances | 
*V2Api* | [**terminateServerInstancesGet**](docs/V2Api.md#terminateServerInstancesGet) | **GET** /terminateServerInstances | 
*V2Api* | [**terminateServerInstancesPost**](docs/V2Api.md#terminateServerInstancesPost) | **POST** /terminateServerInstances | 
*V2Api* | [**unassignSecondaryIpsGet**](docs/V2Api.md#unassignSecondaryIpsGet) | **GET** /unassignSecondaryIps | 
*V2Api* | [**unassignSecondaryIpsPost**](docs/V2Api.md#unassignSecondaryIpsPost) | **POST** /unassignSecondaryIps | 


## Documentation for Models

 - [AccessControlGroup](docs/AccessControlGroup.md)
 - [AccessControlGroupRule](docs/AccessControlGroupRule.md)
 - [AddAccessControlGroupInboundRuleRequest](docs/AddAccessControlGroupInboundRuleRequest.md)
 - [AddAccessControlGroupInboundRuleResponse](docs/AddAccessControlGroupInboundRuleResponse.md)
 - [AddAccessControlGroupOutboundRuleRequest](docs/AddAccessControlGroupOutboundRuleRequest.md)
 - [AddAccessControlGroupOutboundRuleResponse](docs/AddAccessControlGroupOutboundRuleResponse.md)
 - [AddAccessControlGroupRuleParameter](docs/AddAccessControlGroupRuleParameter.md)
 - [AddMemberServerImageSharingPermissionRequest](docs/AddMemberServerImageSharingPermissionRequest.md)
 - [AddMemberServerImageSharingPermissionResponse](docs/AddMemberServerImageSharingPermissionResponse.md)
 - [AddNetworkInterfaceAccessControlGroupRequest](docs/AddNetworkInterfaceAccessControlGroupRequest.md)
 - [AddNetworkInterfaceAccessControlGroupResponse](docs/AddNetworkInterfaceAccessControlGroupResponse.md)
 - [AddPlacementGroupServerInstanceRequest](docs/AddPlacementGroupServerInstanceRequest.md)
 - [AddPlacementGroupServerInstanceResponse](docs/AddPlacementGroupServerInstanceResponse.md)
 - [AddServerImageSharingPermissionReqeuset](docs/AddServerImageSharingPermissionReqeuset.md)
 - [AssignSecondaryIpsRequest](docs/AssignSecondaryIpsRequest.md)
 - [AssignSecondaryIpsResponse](docs/AssignSecondaryIpsResponse.md)
 - [AssociatePublicIpWithServerInstanceRequest](docs/AssociatePublicIpWithServerInstanceRequest.md)
 - [AssociatePublicIpWithServerInstanceResponse](docs/AssociatePublicIpWithServerInstanceResponse.md)
 - [AttachBlockStorageInstanceRequest](docs/AttachBlockStorageInstanceRequest.md)
 - [AttachBlockStorageInstanceResponse](docs/AttachBlockStorageInstanceResponse.md)
 - [AttachNetworkInterfaceRequest](docs/AttachNetworkInterfaceRequest.md)
 - [AttachNetworkInterfaceResponse](docs/AttachNetworkInterfaceResponse.md)
 - [BlockDevicePartition](docs/BlockDevicePartition.md)
 - [BlockStorage](docs/BlockStorage.md)
 - [BlockStorageInstance](docs/BlockStorageInstance.md)
 - [BlockStorageSnapshotInstance](docs/BlockStorageSnapshotInstance.md)
 - [BlockStorageVolumeType](docs/BlockStorageVolumeType.md)
 - [ChangeBlockStorageInstanceRequest](docs/ChangeBlockStorageInstanceRequest.md)
 - [ChangeBlockStorageInstanceResponse](docs/ChangeBlockStorageInstanceResponse.md)
 - [ChangeBlockStorageVolumeSizeRequest](docs/ChangeBlockStorageVolumeSizeRequest.md)
 - [ChangeBlockStorageVolumeSizeResponse](docs/ChangeBlockStorageVolumeSizeResponse.md)
 - [ChangeServerInstanceSpecRequest](docs/ChangeServerInstanceSpecRequest.md)
 - [ChangeServerInstanceSpecResponse](docs/ChangeServerInstanceSpecResponse.md)
 - [CommonCode](docs/CommonCode.md)
 - [CreateAccessControlGroupRequest](docs/CreateAccessControlGroupRequest.md)
 - [CreateAccessControlGroupResponse](docs/CreateAccessControlGroupResponse.md)
 - [CreateBlockStorageInstanceRequest](docs/CreateBlockStorageInstanceRequest.md)
 - [CreateBlockStorageInstanceResponse](docs/CreateBlockStorageInstanceResponse.md)
 - [CreateBlockStorageSnapshotInstanceRequest](docs/CreateBlockStorageSnapshotInstanceRequest.md)
 - [CreateBlockStorageSnapshotInstanceResponse](docs/CreateBlockStorageSnapshotInstanceResponse.md)
 - [CreateInitScriptRequest](docs/CreateInitScriptRequest.md)
 - [CreateInitScriptResponse](docs/CreateInitScriptResponse.md)
 - [CreateLoginKeyRequest](docs/CreateLoginKeyRequest.md)
 - [CreateLoginKeyResponse](docs/CreateLoginKeyResponse.md)
 - [CreateMemberServerImageInstanceRequest](docs/CreateMemberServerImageInstanceRequest.md)
 - [CreateMemberServerImageInstanceResponse](docs/CreateMemberServerImageInstanceResponse.md)
 - [CreateNetworkInterfaceRequest](docs/CreateNetworkInterfaceRequest.md)
 - [CreateNetworkInterfaceResponse](docs/CreateNetworkInterfaceResponse.md)
 - [CreatePlacementGroupRequest](docs/CreatePlacementGroupRequest.md)
 - [CreatePlacementGroupResponse](docs/CreatePlacementGroupResponse.md)
 - [CreatePublicIpInstanceRequest](docs/CreatePublicIpInstanceRequest.md)
 - [CreatePublicIpInstanceResponse](docs/CreatePublicIpInstanceResponse.md)
 - [CreateServerImageFromSnapshotRequest](docs/CreateServerImageFromSnapshotRequest.md)
 - [CreateServerImageRequest](docs/CreateServerImageRequest.md)
 - [CreateServerInstancesRequest](docs/CreateServerInstancesRequest.md)
 - [CreateServerInstancesResponse](docs/CreateServerInstancesResponse.md)
 - [DeleteAccessControlGroupRequest](docs/DeleteAccessControlGroupRequest.md)
 - [DeleteAccessControlGroupResponse](docs/DeleteAccessControlGroupResponse.md)
 - [DeleteBlockStorageInstancesRequest](docs/DeleteBlockStorageInstancesRequest.md)
 - [DeleteBlockStorageInstancesResponse](docs/DeleteBlockStorageInstancesResponse.md)
 - [DeleteBlockStorageSnapshotInstancesRequest](docs/DeleteBlockStorageSnapshotInstancesRequest.md)
 - [DeleteBlockStorageSnapshotInstancesResponse](docs/DeleteBlockStorageSnapshotInstancesResponse.md)
 - [DeleteInitScriptsRequest](docs/DeleteInitScriptsRequest.md)
 - [DeleteInitScriptsResponse](docs/DeleteInitScriptsResponse.md)
 - [DeleteLoginKeysRequest](docs/DeleteLoginKeysRequest.md)
 - [DeleteLoginKeysResponse](docs/DeleteLoginKeysResponse.md)
 - [DeleteMemberServerImageInstancesRequest](docs/DeleteMemberServerImageInstancesRequest.md)
 - [DeleteMemberServerImageInstancesResponse](docs/DeleteMemberServerImageInstancesResponse.md)
 - [DeleteNetworkInterfaceRequest](docs/DeleteNetworkInterfaceRequest.md)
 - [DeleteNetworkInterfaceResponse](docs/DeleteNetworkInterfaceResponse.md)
 - [DeletePlacementGroupRequest](docs/DeletePlacementGroupRequest.md)
 - [DeletePlacementGroupResponse](docs/DeletePlacementGroupResponse.md)
 - [DeletePublicIpInstanceRequest](docs/DeletePublicIpInstanceRequest.md)
 - [DeletePublicIpInstanceResponse](docs/DeletePublicIpInstanceResponse.md)
 - [DeleteServerImageRequest](docs/DeleteServerImageRequest.md)
 - [DetachBlockStorageInstancesRequest](docs/DetachBlockStorageInstancesRequest.md)
 - [DetachBlockStorageInstancesResponse](docs/DetachBlockStorageInstancesResponse.md)
 - [DetachNetworkInterfaceRequest](docs/DetachNetworkInterfaceRequest.md)
 - [DetachNetworkInterfaceResponse](docs/DetachNetworkInterfaceResponse.md)
 - [DisableFlowLogRequest](docs/DisableFlowLogRequest.md)
 - [DisassociatePublicIpFromServerInstanceRequest](docs/DisassociatePublicIpFromServerInstanceRequest.md)
 - [DisassociatePublicIpFromServerInstanceResponse](docs/DisassociatePublicIpFromServerInstanceResponse.md)
 - [EnableFlowLogRequest](docs/EnableFlowLogRequest.md)
 - [FlowLogConfiguration](docs/FlowLogConfiguration.md)
 - [FlowLogConfigurationList](docs/FlowLogConfigurationList.md)
 - [GetAccessControlGroupDetailRequest](docs/GetAccessControlGroupDetailRequest.md)
 - [GetAccessControlGroupDetailResponse](docs/GetAccessControlGroupDetailResponse.md)
 - [GetAccessControlGroupListRequest](docs/GetAccessControlGroupListRequest.md)
 - [GetAccessControlGroupListResponse](docs/GetAccessControlGroupListResponse.md)
 - [GetAccessControlGroupRuleListRequest](docs/GetAccessControlGroupRuleListRequest.md)
 - [GetAccessControlGroupRuleListResponse](docs/GetAccessControlGroupRuleListResponse.md)
 - [GetBlockStorageInstanceDetailRequest](docs/GetBlockStorageInstanceDetailRequest.md)
 - [GetBlockStorageInstanceDetailResponse](docs/GetBlockStorageInstanceDetailResponse.md)
 - [GetBlockStorageInstanceListRequest](docs/GetBlockStorageInstanceListRequest.md)
 - [GetBlockStorageInstanceListResponse](docs/GetBlockStorageInstanceListResponse.md)
 - [GetBlockStorageSnapshotInstanceDetailRequest](docs/GetBlockStorageSnapshotInstanceDetailRequest.md)
 - [GetBlockStorageSnapshotInstanceDetailResponse](docs/GetBlockStorageSnapshotInstanceDetailResponse.md)
 - [GetBlockStorageSnapshotInstanceListRequest](docs/GetBlockStorageSnapshotInstanceListRequest.md)
 - [GetBlockStorageSnapshotInstanceListResponse](docs/GetBlockStorageSnapshotInstanceListResponse.md)
 - [GetBlockStorageVolumeTypeListRequest](docs/GetBlockStorageVolumeTypeListRequest.md)
 - [GetBlockStorageVolumeTypeListResponse](docs/GetBlockStorageVolumeTypeListResponse.md)
 - [GetFlowLogConfigurationListRequest](docs/GetFlowLogConfigurationListRequest.md)
 - [GetHypervisorTypeListRequest](docs/GetHypervisorTypeListRequest.md)
 - [GetHypervisorTypeListResponse](docs/GetHypervisorTypeListResponse.md)
 - [GetInitScriptDetailRequest](docs/GetInitScriptDetailRequest.md)
 - [GetInitScriptDetailResponse](docs/GetInitScriptDetailResponse.md)
 - [GetInitScriptListRequest](docs/GetInitScriptListRequest.md)
 - [GetInitScriptListResponse](docs/GetInitScriptListResponse.md)
 - [GetLoginKeyListRequest](docs/GetLoginKeyListRequest.md)
 - [GetLoginKeyListResponse](docs/GetLoginKeyListResponse.md)
 - [GetMemberServerImageInstanceDetailRequest](docs/GetMemberServerImageInstanceDetailRequest.md)
 - [GetMemberServerImageInstanceDetailResponse](docs/GetMemberServerImageInstanceDetailResponse.md)
 - [GetMemberServerImageInstanceListRequest](docs/GetMemberServerImageInstanceListRequest.md)
 - [GetMemberServerImageInstanceListResponse](docs/GetMemberServerImageInstanceListResponse.md)
 - [GetNetworkInterfaceDetailRequest](docs/GetNetworkInterfaceDetailRequest.md)
 - [GetNetworkInterfaceDetailResponse](docs/GetNetworkInterfaceDetailResponse.md)
 - [GetNetworkInterfaceListRequest](docs/GetNetworkInterfaceListRequest.md)
 - [GetNetworkInterfaceListResponse](docs/GetNetworkInterfaceListResponse.md)
 - [GetPlacementGroupDetailRequest](docs/GetPlacementGroupDetailRequest.md)
 - [GetPlacementGroupDetailResponse](docs/GetPlacementGroupDetailResponse.md)
 - [GetPlacementGroupListRequest](docs/GetPlacementGroupListRequest.md)
 - [GetPlacementGroupListResponse](docs/GetPlacementGroupListResponse.md)
 - [GetPublicIpInstanceDetailRequest](docs/GetPublicIpInstanceDetailRequest.md)
 - [GetPublicIpInstanceDetailResponse](docs/GetPublicIpInstanceDetailResponse.md)
 - [GetPublicIpInstanceListRequest](docs/GetPublicIpInstanceListRequest.md)
 - [GetPublicIpInstanceListResponse](docs/GetPublicIpInstanceListResponse.md)
 - [GetPublicIpTargetServerInstanceListRequest](docs/GetPublicIpTargetServerInstanceListRequest.md)
 - [GetPublicIpTargetServerInstanceListResponse](docs/GetPublicIpTargetServerInstanceListResponse.md)
 - [GetRaidListRequest](docs/GetRaidListRequest.md)
 - [GetRaidListResponse](docs/GetRaidListResponse.md)
 - [GetRegionListRequest](docs/GetRegionListRequest.md)
 - [GetRegionListResponse](docs/GetRegionListResponse.md)
 - [GetRootPasswordRequest](docs/GetRootPasswordRequest.md)
 - [GetRootPasswordResponse](docs/GetRootPasswordResponse.md)
 - [GetRootPasswordServerInstanceListRequest](docs/GetRootPasswordServerInstanceListRequest.md)
 - [GetRootPasswordServerInstanceListResponse](docs/GetRootPasswordServerInstanceListResponse.md)
 - [GetServerImageDetailRequest](docs/GetServerImageDetailRequest.md)
 - [GetServerImageListRequest](docs/GetServerImageListRequest.md)
 - [GetServerImageProductListRequest](docs/GetServerImageProductListRequest.md)
 - [GetServerImageProductListResponse](docs/GetServerImageProductListResponse.md)
 - [GetServerInstanceDetailRequest](docs/GetServerInstanceDetailRequest.md)
 - [GetServerInstanceDetailResponse](docs/GetServerInstanceDetailResponse.md)
 - [GetServerInstanceListRequest](docs/GetServerInstanceListRequest.md)
 - [GetServerInstanceListResponse](docs/GetServerInstanceListResponse.md)
 - [GetServerProductListRequest](docs/GetServerProductListRequest.md)
 - [GetServerProductListResponse](docs/GetServerProductListResponse.md)
 - [GetServerSpecDetailRequest](docs/GetServerSpecDetailRequest.md)
 - [GetServerSpecListRequest](docs/GetServerSpecListRequest.md)
 - [GetZoneListRequest](docs/GetZoneListRequest.md)
 - [GetZoneListResponse](docs/GetZoneListResponse.md)
 - [ImportLoginKeyRequest](docs/ImportLoginKeyRequest.md)
 - [ImportLoginKeyResponse](docs/ImportLoginKeyResponse.md)
 - [InitScript](docs/InitScript.md)
 - [InterruptServerInstanceRequest](docs/InterruptServerInstanceRequest.md)
 - [InterruptServerInstanceResponse](docs/InterruptServerInstanceResponse.md)
 - [LoginKey](docs/LoginKey.md)
 - [MemberServerImageInstance](docs/MemberServerImageInstance.md)
 - [NetworkInterface](docs/NetworkInterface.md)
 - [NetworkInterfaceParameter](docs/NetworkInterfaceParameter.md)
 - [PlacementGroup](docs/PlacementGroup.md)
 - [Product](docs/Product.md)
 - [PublicIpInstance](docs/PublicIpInstance.md)
 - [Raid](docs/Raid.md)
 - [RebootServerInstancesRequest](docs/RebootServerInstancesRequest.md)
 - [RebootServerInstancesResponse](docs/RebootServerInstancesResponse.md)
 - [Region](docs/Region.md)
 - [RemoveAccessControlGroupInboundRuleRequest](docs/RemoveAccessControlGroupInboundRuleRequest.md)
 - [RemoveAccessControlGroupInboundRuleResponse](docs/RemoveAccessControlGroupInboundRuleResponse.md)
 - [RemoveAccessControlGroupOutboundRuleRequest](docs/RemoveAccessControlGroupOutboundRuleRequest.md)
 - [RemoveAccessControlGroupOutboundRuleResponse](docs/RemoveAccessControlGroupOutboundRuleResponse.md)
 - [RemoveAccessControlGroupRuleParameter](docs/RemoveAccessControlGroupRuleParameter.md)
 - [RemoveMemberServerImageSharingPermissionRequest](docs/RemoveMemberServerImageSharingPermissionRequest.md)
 - [RemoveMemberServerImageSharingPermissionResponse](docs/RemoveMemberServerImageSharingPermissionResponse.md)
 - [RemoveNetworkInterfaceAccessControlGroupRequest](docs/RemoveNetworkInterfaceAccessControlGroupRequest.md)
 - [RemoveNetworkInterfaceAccessControlGroupResponse](docs/RemoveNetworkInterfaceAccessControlGroupResponse.md)
 - [RemovePlacementGroupServerInstanceRequest](docs/RemovePlacementGroupServerInstanceRequest.md)
 - [RemovePlacementGroupServerInstanceResponse](docs/RemovePlacementGroupServerInstanceResponse.md)
 - [RemoveServerImageSharingPermissionRequest](docs/RemoveServerImageSharingPermissionRequest.md)
 - [RootPasswordServerInstance](docs/RootPasswordServerInstance.md)
 - [RootPasswordServerInstanceParameter](docs/RootPasswordServerInstanceParameter.md)
 - [ServerInstance](docs/ServerInstance.md)
 - [SetBlockStorageReturnProtectionRequest](docs/SetBlockStorageReturnProtectionRequest.md)
 - [SetBlockStorageReturnProtectionResponse](docs/SetBlockStorageReturnProtectionResponse.md)
 - [SetMemberServerImageSharingPermissionRequest](docs/SetMemberServerImageSharingPermissionRequest.md)
 - [SetMemberServerImageSharingPermissionResponse](docs/SetMemberServerImageSharingPermissionResponse.md)
 - [SetProtectServerTerminationRequest](docs/SetProtectServerTerminationRequest.md)
 - [SetProtectServerTerminationResponse](docs/SetProtectServerTerminationResponse.md)
 - [StartServerInstancesRequest](docs/StartServerInstancesRequest.md)
 - [StartServerInstancesResponse](docs/StartServerInstancesResponse.md)
 - [StopServerInstancesRequest](docs/StopServerInstancesRequest.md)
 - [StopServerInstancesResponse](docs/StopServerInstancesResponse.md)
 - [TerminateServerInstancesRequest](docs/TerminateServerInstancesRequest.md)
 - [TerminateServerInstancesResponse](docs/TerminateServerInstancesResponse.md)
 - [UnassignSecondaryIpsRequest](docs/UnassignSecondaryIpsRequest.md)
 - [UnassignSecondaryIpsResponse](docs/UnassignSecondaryIpsResponse.md)
 - [Zone](docs/Zone.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



