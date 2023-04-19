# server

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
	<artifactId>server</artifactId>
	<version>1.1.2</version>
	<scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

	mvn package

Then manually install the following JARs:

* target/server-1.1.2.jar
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
import com.ncloud.server.model.*;

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
		AddMemberServerImageSharingPermissionRequest addMemberServerImageSharingPermissionRequest = new AddMemberServerImageSharingPermissionRequest(); // AddMemberServerImageSharingPermissionRequest | addMemberServerImageSharingPermissionRequest
		try {
			// Handler Successful response
			ApiResponse<AddMemberServerImageSharingPermissionResponse> result = apiInstance.addMemberServerImageSharingPermissionGet(addMemberServerImageSharingPermissionRequest);
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

All URIs are relative to *https://ncloud.apigw.ntruss.com/server/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*V2Api* | [**addMemberServerImageSharingPermissionGet**](docs/V2Api.md#addMemberServerImageSharingPermissionGet) | **GET** /addMemberServerImageSharingPermission | 
*V2Api* | [**addMemberServerImageSharingPermissionPost**](docs/V2Api.md#addMemberServerImageSharingPermissionPost) | **POST** /addMemberServerImageSharingPermission | 
*V2Api* | [**addNasVolumeAccessControlGet**](docs/V2Api.md#addNasVolumeAccessControlGet) | **GET** /addNasVolumeAccessControl | 
*V2Api* | [**addNasVolumeAccessControlPost**](docs/V2Api.md#addNasVolumeAccessControlPost) | **POST** /addNasVolumeAccessControl | 
*V2Api* | [**addPortForwardingRulesGet**](docs/V2Api.md#addPortForwardingRulesGet) | **GET** /addPortForwardingRules | 
*V2Api* | [**addPortForwardingRulesPost**](docs/V2Api.md#addPortForwardingRulesPost) | **POST** /addPortForwardingRules | 
*V2Api* | [**associatePublicIpWithServerInstanceGet**](docs/V2Api.md#associatePublicIpWithServerInstanceGet) | **GET** /associatePublicIpWithServerInstance | 
*V2Api* | [**associatePublicIpWithServerInstancePost**](docs/V2Api.md#associatePublicIpWithServerInstancePost) | **POST** /associatePublicIpWithServerInstance | 
*V2Api* | [**attachBlockStorageInstanceGet**](docs/V2Api.md#attachBlockStorageInstanceGet) | **GET** /attachBlockStorageInstance | 
*V2Api* | [**attachBlockStorageInstancePost**](docs/V2Api.md#attachBlockStorageInstancePost) | **POST** /attachBlockStorageInstance | 
*V2Api* | [**attachNetworkInterfaceGet**](docs/V2Api.md#attachNetworkInterfaceGet) | **GET** /attachNetworkInterface | 
*V2Api* | [**attachNetworkInterfacePost**](docs/V2Api.md#attachNetworkInterfacePost) | **POST** /attachNetworkInterface | 
*V2Api* | [**changeBlockStorageVolumeSizeGet**](docs/V2Api.md#changeBlockStorageVolumeSizeGet) | **GET** /changeBlockStorageVolumeSize | 
*V2Api* | [**changeBlockStorageVolumeSizePost**](docs/V2Api.md#changeBlockStorageVolumeSizePost) | **POST** /changeBlockStorageVolumeSize | 
*V2Api* | [**changeNasVolumeSizeGet**](docs/V2Api.md#changeNasVolumeSizeGet) | **GET** /changeNasVolumeSize | 
*V2Api* | [**changeNasVolumeSizePost**](docs/V2Api.md#changeNasVolumeSizePost) | **POST** /changeNasVolumeSize | 
*V2Api* | [**changeNasVolumeSnapshotConfigurationGet**](docs/V2Api.md#changeNasVolumeSnapshotConfigurationGet) | **GET** /changeNasVolumeSnapshotConfiguration | 
*V2Api* | [**changeNasVolumeSnapshotConfigurationPost**](docs/V2Api.md#changeNasVolumeSnapshotConfigurationPost) | **POST** /changeNasVolumeSnapshotConfiguration | 
*V2Api* | [**changeServerInstanceSpecGet**](docs/V2Api.md#changeServerInstanceSpecGet) | **GET** /changeServerInstanceSpec | 
*V2Api* | [**changeServerInstanceSpecPost**](docs/V2Api.md#changeServerInstanceSpecPost) | **POST** /changeServerInstanceSpec | 
*V2Api* | [**createBlockStorageInstanceGet**](docs/V2Api.md#createBlockStorageInstanceGet) | **GET** /createBlockStorageInstance | 
*V2Api* | [**createBlockStorageInstancePost**](docs/V2Api.md#createBlockStorageInstancePost) | **POST** /createBlockStorageInstance | 
*V2Api* | [**createBlockStorageSnapshotInstanceGet**](docs/V2Api.md#createBlockStorageSnapshotInstanceGet) | **GET** /createBlockStorageSnapshotInstance | 
*V2Api* | [**createBlockStorageSnapshotInstancePost**](docs/V2Api.md#createBlockStorageSnapshotInstancePost) | **POST** /createBlockStorageSnapshotInstance | 
*V2Api* | [**createInstanceTagsGet**](docs/V2Api.md#createInstanceTagsGet) | **GET** /createInstanceTags | 
*V2Api* | [**createInstanceTagsPost**](docs/V2Api.md#createInstanceTagsPost) | **POST** /createInstanceTags | 
*V2Api* | [**createLoginKeyGet**](docs/V2Api.md#createLoginKeyGet) | **GET** /createLoginKey | 
*V2Api* | [**createLoginKeyPost**](docs/V2Api.md#createLoginKeyPost) | **POST** /createLoginKey | 
*V2Api* | [**createMemberServerImageGet**](docs/V2Api.md#createMemberServerImageGet) | **GET** /createMemberServerImage | 
*V2Api* | [**createMemberServerImagePost**](docs/V2Api.md#createMemberServerImagePost) | **POST** /createMemberServerImage | 
*V2Api* | [**createNasVolumeInstanceGet**](docs/V2Api.md#createNasVolumeInstanceGet) | **GET** /createNasVolumeInstance | 
*V2Api* | [**createNasVolumeInstancePost**](docs/V2Api.md#createNasVolumeInstancePost) | **POST** /createNasVolumeInstance | 
*V2Api* | [**createNasVolumeSnapshotGet**](docs/V2Api.md#createNasVolumeSnapshotGet) | **GET** /createNasVolumeSnapshot | 
*V2Api* | [**createNasVolumeSnapshotPost**](docs/V2Api.md#createNasVolumeSnapshotPost) | **POST** /createNasVolumeSnapshot | 
*V2Api* | [**createNetworkInterfaceGet**](docs/V2Api.md#createNetworkInterfaceGet) | **GET** /createNetworkInterface | 
*V2Api* | [**createNetworkInterfacePost**](docs/V2Api.md#createNetworkInterfacePost) | **POST** /createNetworkInterface | 
*V2Api* | [**createPublicIpInstanceGet**](docs/V2Api.md#createPublicIpInstanceGet) | **GET** /createPublicIpInstance | 
*V2Api* | [**createPublicIpInstancePost**](docs/V2Api.md#createPublicIpInstancePost) | **POST** /createPublicIpInstance | 
*V2Api* | [**createServerInstancesGet**](docs/V2Api.md#createServerInstancesGet) | **GET** /createServerInstances | 
*V2Api* | [**createServerInstancesPost**](docs/V2Api.md#createServerInstancesPost) | **POST** /createServerInstances | 
*V2Api* | [**deleteBlockStorageInstancesGet**](docs/V2Api.md#deleteBlockStorageInstancesGet) | **GET** /deleteBlockStorageInstances | 
*V2Api* | [**deleteBlockStorageInstancesPost**](docs/V2Api.md#deleteBlockStorageInstancesPost) | **POST** /deleteBlockStorageInstances | 
*V2Api* | [**deleteBlockStorageSnapshotInstancesGet**](docs/V2Api.md#deleteBlockStorageSnapshotInstancesGet) | **GET** /deleteBlockStorageSnapshotInstances | 
*V2Api* | [**deleteBlockStorageSnapshotInstancesPost**](docs/V2Api.md#deleteBlockStorageSnapshotInstancesPost) | **POST** /deleteBlockStorageSnapshotInstances | 
*V2Api* | [**deleteInstanceTagsGet**](docs/V2Api.md#deleteInstanceTagsGet) | **GET** /deleteInstanceTags | 
*V2Api* | [**deleteInstanceTagsPost**](docs/V2Api.md#deleteInstanceTagsPost) | **POST** /deleteInstanceTags | 
*V2Api* | [**deleteLoginKeyGet**](docs/V2Api.md#deleteLoginKeyGet) | **GET** /deleteLoginKey | 
*V2Api* | [**deleteLoginKeyPost**](docs/V2Api.md#deleteLoginKeyPost) | **POST** /deleteLoginKey | 
*V2Api* | [**deleteMemberServerImagesGet**](docs/V2Api.md#deleteMemberServerImagesGet) | **GET** /deleteMemberServerImages | 
*V2Api* | [**deleteMemberServerImagesPost**](docs/V2Api.md#deleteMemberServerImagesPost) | **POST** /deleteMemberServerImages | 
*V2Api* | [**deleteNasVolumeInstanceGet**](docs/V2Api.md#deleteNasVolumeInstanceGet) | **GET** /deleteNasVolumeInstance | 
*V2Api* | [**deleteNasVolumeInstancePost**](docs/V2Api.md#deleteNasVolumeInstancePost) | **POST** /deleteNasVolumeInstance | 
*V2Api* | [**deleteNasVolumeSnapshotGet**](docs/V2Api.md#deleteNasVolumeSnapshotGet) | **GET** /deleteNasVolumeSnapshot | 
*V2Api* | [**deleteNasVolumeSnapshotPost**](docs/V2Api.md#deleteNasVolumeSnapshotPost) | **POST** /deleteNasVolumeSnapshot | 
*V2Api* | [**deleteNetworkInterfaceGet**](docs/V2Api.md#deleteNetworkInterfaceGet) | **GET** /deleteNetworkInterface | 
*V2Api* | [**deleteNetworkInterfacePost**](docs/V2Api.md#deleteNetworkInterfacePost) | **POST** /deleteNetworkInterface | 
*V2Api* | [**deletePortForwardingRulesGet**](docs/V2Api.md#deletePortForwardingRulesGet) | **GET** /deletePortForwardingRules | 
*V2Api* | [**deletePortForwardingRulesPost**](docs/V2Api.md#deletePortForwardingRulesPost) | **POST** /deletePortForwardingRules | 
*V2Api* | [**deletePublicIpInstancesGet**](docs/V2Api.md#deletePublicIpInstancesGet) | **GET** /deletePublicIpInstances | 
*V2Api* | [**deletePublicIpInstancesPost**](docs/V2Api.md#deletePublicIpInstancesPost) | **POST** /deletePublicIpInstances | 
*V2Api* | [**detachBlockStorageInstancesGet**](docs/V2Api.md#detachBlockStorageInstancesGet) | **GET** /detachBlockStorageInstances | 
*V2Api* | [**detachBlockStorageInstancesPost**](docs/V2Api.md#detachBlockStorageInstancesPost) | **POST** /detachBlockStorageInstances | 
*V2Api* | [**detachNetworkInterfaceGet**](docs/V2Api.md#detachNetworkInterfaceGet) | **GET** /detachNetworkInterface | 
*V2Api* | [**detachNetworkInterfacePost**](docs/V2Api.md#detachNetworkInterfacePost) | **POST** /detachNetworkInterface | 
*V2Api* | [**disassociatePublicIpFromServerInstanceGet**](docs/V2Api.md#disassociatePublicIpFromServerInstanceGet) | **GET** /disassociatePublicIpFromServerInstance | 
*V2Api* | [**disassociatePublicIpFromServerInstancePost**](docs/V2Api.md#disassociatePublicIpFromServerInstancePost) | **POST** /disassociatePublicIpFromServerInstance | 
*V2Api* | [**getAccessControlGroupListGet**](docs/V2Api.md#getAccessControlGroupListGet) | **GET** /getAccessControlGroupList | 
*V2Api* | [**getAccessControlGroupListPost**](docs/V2Api.md#getAccessControlGroupListPost) | **POST** /getAccessControlGroupList | 
*V2Api* | [**getAccessControlGroupServerInstanceListGet**](docs/V2Api.md#getAccessControlGroupServerInstanceListGet) | **GET** /getAccessControlGroupServerInstanceList | 
*V2Api* | [**getAccessControlGroupServerInstanceListPost**](docs/V2Api.md#getAccessControlGroupServerInstanceListPost) | **POST** /getAccessControlGroupServerInstanceList | 
*V2Api* | [**getAccessControlRuleListGet**](docs/V2Api.md#getAccessControlRuleListGet) | **GET** /getAccessControlRuleList | 
*V2Api* | [**getAccessControlRuleListPost**](docs/V2Api.md#getAccessControlRuleListPost) | **POST** /getAccessControlRuleList | 
*V2Api* | [**getBlockStorageInstanceListGet**](docs/V2Api.md#getBlockStorageInstanceListGet) | **GET** /getBlockStorageInstanceList | 
*V2Api* | [**getBlockStorageInstanceListPost**](docs/V2Api.md#getBlockStorageInstanceListPost) | **POST** /getBlockStorageInstanceList | 
*V2Api* | [**getBlockStorageSnapshotInstanceListGet**](docs/V2Api.md#getBlockStorageSnapshotInstanceListGet) | **GET** /getBlockStorageSnapshotInstanceList | 
*V2Api* | [**getBlockStorageSnapshotInstanceListPost**](docs/V2Api.md#getBlockStorageSnapshotInstanceListPost) | **POST** /getBlockStorageSnapshotInstanceList | 
*V2Api* | [**getInitScriptListGet**](docs/V2Api.md#getInitScriptListGet) | **GET** /getInitScriptList | 
*V2Api* | [**getInitScriptListPost**](docs/V2Api.md#getInitScriptListPost) | **POST** /getInitScriptList | 
*V2Api* | [**getInstanceTagListGet**](docs/V2Api.md#getInstanceTagListGet) | **GET** /getInstanceTagList | 
*V2Api* | [**getInstanceTagListPost**](docs/V2Api.md#getInstanceTagListPost) | **POST** /getInstanceTagList | 
*V2Api* | [**getLoginKeyListGet**](docs/V2Api.md#getLoginKeyListGet) | **GET** /getLoginKeyList | 
*V2Api* | [**getLoginKeyListPost**](docs/V2Api.md#getLoginKeyListPost) | **POST** /getLoginKeyList | 
*V2Api* | [**getMemberServerImageListGet**](docs/V2Api.md#getMemberServerImageListGet) | **GET** /getMemberServerImageList | 
*V2Api* | [**getMemberServerImageListPost**](docs/V2Api.md#getMemberServerImageListPost) | **POST** /getMemberServerImageList | 
*V2Api* | [**getNasVolumeAccessControlRuleListGet**](docs/V2Api.md#getNasVolumeAccessControlRuleListGet) | **GET** /getNasVolumeAccessControlRuleList | 
*V2Api* | [**getNasVolumeAccessControlRuleListPost**](docs/V2Api.md#getNasVolumeAccessControlRuleListPost) | **POST** /getNasVolumeAccessControlRuleList | 
*V2Api* | [**getNasVolumeInstanceListGet**](docs/V2Api.md#getNasVolumeInstanceListGet) | **GET** /getNasVolumeInstanceList | 
*V2Api* | [**getNasVolumeInstanceListPost**](docs/V2Api.md#getNasVolumeInstanceListPost) | **POST** /getNasVolumeInstanceList | 
*V2Api* | [**getNasVolumeInstanceRatingListGet**](docs/V2Api.md#getNasVolumeInstanceRatingListGet) | **GET** /getNasVolumeInstanceRatingList | 
*V2Api* | [**getNasVolumeInstanceRatingListPost**](docs/V2Api.md#getNasVolumeInstanceRatingListPost) | **POST** /getNasVolumeInstanceRatingList | 
*V2Api* | [**getNasVolumeSnapshotConfigurationHistoryListGet**](docs/V2Api.md#getNasVolumeSnapshotConfigurationHistoryListGet) | **GET** /getNasVolumeSnapshotConfigurationHistoryList | 
*V2Api* | [**getNasVolumeSnapshotConfigurationHistoryListPost**](docs/V2Api.md#getNasVolumeSnapshotConfigurationHistoryListPost) | **POST** /getNasVolumeSnapshotConfigurationHistoryList | 
*V2Api* | [**getNasVolumeSnapshotListGet**](docs/V2Api.md#getNasVolumeSnapshotListGet) | **GET** /getNasVolumeSnapshotList | 
*V2Api* | [**getNasVolumeSnapshotListPost**](docs/V2Api.md#getNasVolumeSnapshotListPost) | **POST** /getNasVolumeSnapshotList | 
*V2Api* | [**getNetworkInterfaceListGet**](docs/V2Api.md#getNetworkInterfaceListGet) | **GET** /getNetworkInterfaceList | 
*V2Api* | [**getNetworkInterfaceListPost**](docs/V2Api.md#getNetworkInterfaceListPost) | **POST** /getNetworkInterfaceList | 
*V2Api* | [**getPortForwardingConfigurationListGet**](docs/V2Api.md#getPortForwardingConfigurationListGet) | **GET** /getPortForwardingConfigurationList | 
*V2Api* | [**getPortForwardingConfigurationListPost**](docs/V2Api.md#getPortForwardingConfigurationListPost) | **POST** /getPortForwardingConfigurationList | 
*V2Api* | [**getPortForwardingRuleListGet**](docs/V2Api.md#getPortForwardingRuleListGet) | **GET** /getPortForwardingRuleList | 
*V2Api* | [**getPortForwardingRuleListPost**](docs/V2Api.md#getPortForwardingRuleListPost) | **POST** /getPortForwardingRuleList | 
*V2Api* | [**getPrivateSubnetInstanceListGet**](docs/V2Api.md#getPrivateSubnetInstanceListGet) | **GET** /getPrivateSubnetInstanceList | 
*V2Api* | [**getPrivateSubnetInstanceListPost**](docs/V2Api.md#getPrivateSubnetInstanceListPost) | **POST** /getPrivateSubnetInstanceList | 
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
*V2Api* | [**getServerImageProductListGet**](docs/V2Api.md#getServerImageProductListGet) | **GET** /getServerImageProductList | 
*V2Api* | [**getServerImageProductListPost**](docs/V2Api.md#getServerImageProductListPost) | **POST** /getServerImageProductList | 
*V2Api* | [**getServerInstanceListGet**](docs/V2Api.md#getServerInstanceListGet) | **GET** /getServerInstanceList | 
*V2Api* | [**getServerInstanceListPost**](docs/V2Api.md#getServerInstanceListPost) | **POST** /getServerInstanceList | 
*V2Api* | [**getServerProductListGet**](docs/V2Api.md#getServerProductListGet) | **GET** /getServerProductList | 
*V2Api* | [**getServerProductListPost**](docs/V2Api.md#getServerProductListPost) | **POST** /getServerProductList | 
*V2Api* | [**getZoneListGet**](docs/V2Api.md#getZoneListGet) | **GET** /getZoneList | 
*V2Api* | [**getZoneListPost**](docs/V2Api.md#getZoneListPost) | **POST** /getZoneList | 
*V2Api* | [**importLoginKeyGet**](docs/V2Api.md#importLoginKeyGet) | **GET** /importLoginKey | 
*V2Api* | [**importLoginKeyPost**](docs/V2Api.md#importLoginKeyPost) | **POST** /importLoginKey | 
*V2Api* | [**interruptServerInstanceGet**](docs/V2Api.md#interruptServerInstanceGet) | **GET** /interruptServerInstance | 
*V2Api* | [**interruptServerInstancePost**](docs/V2Api.md#interruptServerInstancePost) | **POST** /interruptServerInstance | 
*V2Api* | [**rebootServerInstancesGet**](docs/V2Api.md#rebootServerInstancesGet) | **GET** /rebootServerInstances | 
*V2Api* | [**rebootServerInstancesPost**](docs/V2Api.md#rebootServerInstancesPost) | **POST** /rebootServerInstances | 
*V2Api* | [**recreateServerInstanceGet**](docs/V2Api.md#recreateServerInstanceGet) | **GET** /recreateServerInstance | 
*V2Api* | [**recreateServerInstancePost**](docs/V2Api.md#recreateServerInstancePost) | **POST** /recreateServerInstance | 
*V2Api* | [**removeMemberServerImageSharingPermissionGet**](docs/V2Api.md#removeMemberServerImageSharingPermissionGet) | **GET** /removeMemberServerImageSharingPermission | 
*V2Api* | [**removeMemberServerImageSharingPermissionPost**](docs/V2Api.md#removeMemberServerImageSharingPermissionPost) | **POST** /removeMemberServerImageSharingPermission | 
*V2Api* | [**removeNasVolumeAccessControlGet**](docs/V2Api.md#removeNasVolumeAccessControlGet) | **GET** /removeNasVolumeAccessControl | 
*V2Api* | [**removeNasVolumeAccessControlPost**](docs/V2Api.md#removeNasVolumeAccessControlPost) | **POST** /removeNasVolumeAccessControl | 
*V2Api* | [**replaceServerInstanceAssociatedWithPublicIpGet**](docs/V2Api.md#replaceServerInstanceAssociatedWithPublicIpGet) | **GET** /replaceServerInstanceAssociatedWithPublicIp | 
*V2Api* | [**replaceServerInstanceAssociatedWithPublicIpPost**](docs/V2Api.md#replaceServerInstanceAssociatedWithPublicIpPost) | **POST** /replaceServerInstanceAssociatedWithPublicIp | 
*V2Api* | [**restoreNasVolumeWithSnapshotGet**](docs/V2Api.md#restoreNasVolumeWithSnapshotGet) | **GET** /restoreNasVolumeWithSnapshot | 
*V2Api* | [**restoreNasVolumeWithSnapshotPost**](docs/V2Api.md#restoreNasVolumeWithSnapshotPost) | **POST** /restoreNasVolumeWithSnapshot | 
*V2Api* | [**setMemberServerImageSharingPermissionGet**](docs/V2Api.md#setMemberServerImageSharingPermissionGet) | **GET** /setMemberServerImageSharingPermission | 
*V2Api* | [**setMemberServerImageSharingPermissionPost**](docs/V2Api.md#setMemberServerImageSharingPermissionPost) | **POST** /setMemberServerImageSharingPermission | 
*V2Api* | [**setNasVolumeAccessControlGet**](docs/V2Api.md#setNasVolumeAccessControlGet) | **GET** /setNasVolumeAccessControl | 
*V2Api* | [**setNasVolumeAccessControlPost**](docs/V2Api.md#setNasVolumeAccessControlPost) | **POST** /setNasVolumeAccessControl | 
*V2Api* | [**setNasVolumeReturnProtectionGet**](docs/V2Api.md#setNasVolumeReturnProtectionGet) | **GET** /setNasVolumeReturnProtection | 
*V2Api* | [**setNasVolumeReturnProtectionPost**](docs/V2Api.md#setNasVolumeReturnProtectionPost) | **POST** /setNasVolumeReturnProtection | 
*V2Api* | [**setProtectServerTerminationGet**](docs/V2Api.md#setProtectServerTerminationGet) | **GET** /setProtectServerTermination | 
*V2Api* | [**setProtectServerTerminationPost**](docs/V2Api.md#setProtectServerTerminationPost) | **POST** /setProtectServerTermination | 
*V2Api* | [**startServerInstancesGet**](docs/V2Api.md#startServerInstancesGet) | **GET** /startServerInstances | 
*V2Api* | [**startServerInstancesPost**](docs/V2Api.md#startServerInstancesPost) | **POST** /startServerInstances | 
*V2Api* | [**stopServerInstancesGet**](docs/V2Api.md#stopServerInstancesGet) | **GET** /stopServerInstances | 
*V2Api* | [**stopServerInstancesPost**](docs/V2Api.md#stopServerInstancesPost) | **POST** /stopServerInstances | 
*V2Api* | [**terminateServerInstancesGet**](docs/V2Api.md#terminateServerInstancesGet) | **GET** /terminateServerInstances | 
*V2Api* | [**terminateServerInstancesPost**](docs/V2Api.md#terminateServerInstancesPost) | **POST** /terminateServerInstances | 


## Documentation for Models

 - [AccessControlGroup](docs/AccessControlGroup.md)
 - [AccessControlRule](docs/AccessControlRule.md)
 - [AccessControlRuleParameter](docs/AccessControlRuleParameter.md)
 - [AddMemberServerImageSharingPermissionRequest](docs/AddMemberServerImageSharingPermissionRequest.md)
 - [AddMemberServerImageSharingPermissionResponse](docs/AddMemberServerImageSharingPermissionResponse.md)
 - [AddNasVolumeAccessControlRequest](docs/AddNasVolumeAccessControlRequest.md)
 - [AddNasVolumeAccessControlResponse](docs/AddNasVolumeAccessControlResponse.md)
 - [AddPortForwardingRulesRequest](docs/AddPortForwardingRulesRequest.md)
 - [AddPortForwardingRulesResponse](docs/AddPortForwardingRulesResponse.md)
 - [AssociatePublicIpWithServerInstanceRequest](docs/AssociatePublicIpWithServerInstanceRequest.md)
 - [AssociatePublicIpWithServerInstanceResponse](docs/AssociatePublicIpWithServerInstanceResponse.md)
 - [AttachBlockStorageInstanceRequest](docs/AttachBlockStorageInstanceRequest.md)
 - [AttachBlockStorageInstanceResponse](docs/AttachBlockStorageInstanceResponse.md)
 - [AttachNetworkInterfaceRequest](docs/AttachNetworkInterfaceRequest.md)
 - [AttachNetworkInterfaceResponse](docs/AttachNetworkInterfaceResponse.md)
 - [BlockDevicePartition](docs/BlockDevicePartition.md)
 - [BlockStorageInstance](docs/BlockStorageInstance.md)
 - [BlockStorageSnapshotInstance](docs/BlockStorageSnapshotInstance.md)
 - [ChangeBlockStorageVolumeSizeRequest](docs/ChangeBlockStorageVolumeSizeRequest.md)
 - [ChangeBlockStorageVolumeSizeResponse](docs/ChangeBlockStorageVolumeSizeResponse.md)
 - [ChangeNasVolumeSizeRequest](docs/ChangeNasVolumeSizeRequest.md)
 - [ChangeNasVolumeSizeResponse](docs/ChangeNasVolumeSizeResponse.md)
 - [ChangeNasVolumeSnapshotConfigurationRequest](docs/ChangeNasVolumeSnapshotConfigurationRequest.md)
 - [ChangeNasVolumeSnapshotConfigurationResponse](docs/ChangeNasVolumeSnapshotConfigurationResponse.md)
 - [ChangeServerInstanceSpecRequest](docs/ChangeServerInstanceSpecRequest.md)
 - [ChangeServerInstanceSpecResponse](docs/ChangeServerInstanceSpecResponse.md)
 - [CommonCode](docs/CommonCode.md)
 - [CreateBlockStorageInstanceRequest](docs/CreateBlockStorageInstanceRequest.md)
 - [CreateBlockStorageInstanceResponse](docs/CreateBlockStorageInstanceResponse.md)
 - [CreateBlockStorageSnapshotInstanceRequest](docs/CreateBlockStorageSnapshotInstanceRequest.md)
 - [CreateBlockStorageSnapshotInstanceResponse](docs/CreateBlockStorageSnapshotInstanceResponse.md)
 - [CreateInstanceTagsRequest](docs/CreateInstanceTagsRequest.md)
 - [CreateInstanceTagsResponse](docs/CreateInstanceTagsResponse.md)
 - [CreateLoginKeyRequest](docs/CreateLoginKeyRequest.md)
 - [CreateLoginKeyResponse](docs/CreateLoginKeyResponse.md)
 - [CreateMemberServerImageRequest](docs/CreateMemberServerImageRequest.md)
 - [CreateMemberServerImageResponse](docs/CreateMemberServerImageResponse.md)
 - [CreateNasVolumeInstanceRequest](docs/CreateNasVolumeInstanceRequest.md)
 - [CreateNasVolumeInstanceResponse](docs/CreateNasVolumeInstanceResponse.md)
 - [CreateNasVolumeSnapshotRequest](docs/CreateNasVolumeSnapshotRequest.md)
 - [CreateNasVolumeSnapshotResponse](docs/CreateNasVolumeSnapshotResponse.md)
 - [CreateNetworkInterfaceRequest](docs/CreateNetworkInterfaceRequest.md)
 - [CreateNetworkInterfaceResponse](docs/CreateNetworkInterfaceResponse.md)
 - [CreatePublicIpInstanceRequest](docs/CreatePublicIpInstanceRequest.md)
 - [CreatePublicIpInstanceResponse](docs/CreatePublicIpInstanceResponse.md)
 - [CreateServerInstancesRequest](docs/CreateServerInstancesRequest.md)
 - [CreateServerInstancesResponse](docs/CreateServerInstancesResponse.md)
 - [DeleteBlockStorageInstancesRequest](docs/DeleteBlockStorageInstancesRequest.md)
 - [DeleteBlockStorageInstancesResponse](docs/DeleteBlockStorageInstancesResponse.md)
 - [DeleteBlockStorageSnapshotInstancesRequest](docs/DeleteBlockStorageSnapshotInstancesRequest.md)
 - [DeleteBlockStorageSnapshotInstancesResponse](docs/DeleteBlockStorageSnapshotInstancesResponse.md)
 - [DeleteInstanceTagsRequest](docs/DeleteInstanceTagsRequest.md)
 - [DeleteInstanceTagsResponse](docs/DeleteInstanceTagsResponse.md)
 - [DeleteLoginKeyRequest](docs/DeleteLoginKeyRequest.md)
 - [DeleteLoginKeyResponse](docs/DeleteLoginKeyResponse.md)
 - [DeleteMemberServerImagesRequest](docs/DeleteMemberServerImagesRequest.md)
 - [DeleteMemberServerImagesResponse](docs/DeleteMemberServerImagesResponse.md)
 - [DeleteNasVolumeInstanceRequest](docs/DeleteNasVolumeInstanceRequest.md)
 - [DeleteNasVolumeInstanceResponse](docs/DeleteNasVolumeInstanceResponse.md)
 - [DeleteNasVolumeSnapshotRequest](docs/DeleteNasVolumeSnapshotRequest.md)
 - [DeleteNasVolumeSnapshotResponse](docs/DeleteNasVolumeSnapshotResponse.md)
 - [DeleteNetworkInterfaceRequest](docs/DeleteNetworkInterfaceRequest.md)
 - [DeleteNetworkInterfaceResponse](docs/DeleteNetworkInterfaceResponse.md)
 - [DeletePortForwardingRulesRequest](docs/DeletePortForwardingRulesRequest.md)
 - [DeletePortForwardingRulesResponse](docs/DeletePortForwardingRulesResponse.md)
 - [DeletePublicIpInstancesRequest](docs/DeletePublicIpInstancesRequest.md)
 - [DeletePublicIpInstancesResponse](docs/DeletePublicIpInstancesResponse.md)
 - [DetachBlockStorageInstancesRequest](docs/DetachBlockStorageInstancesRequest.md)
 - [DetachBlockStorageInstancesResponse](docs/DetachBlockStorageInstancesResponse.md)
 - [DetachNetworkInterfaceRequest](docs/DetachNetworkInterfaceRequest.md)
 - [DetachNetworkInterfaceResponse](docs/DetachNetworkInterfaceResponse.md)
 - [DisassociatePublicIpFromServerInstanceRequest](docs/DisassociatePublicIpFromServerInstanceRequest.md)
 - [DisassociatePublicIpFromServerInstanceResponse](docs/DisassociatePublicIpFromServerInstanceResponse.md)
 - [GetAccessControlGroupListRequest](docs/GetAccessControlGroupListRequest.md)
 - [GetAccessControlGroupListResponse](docs/GetAccessControlGroupListResponse.md)
 - [GetAccessControlGroupServerInstanceListRequest](docs/GetAccessControlGroupServerInstanceListRequest.md)
 - [GetAccessControlGroupServerInstanceListResponse](docs/GetAccessControlGroupServerInstanceListResponse.md)
 - [GetAccessControlRuleListRequest](docs/GetAccessControlRuleListRequest.md)
 - [GetAccessControlRuleListResponse](docs/GetAccessControlRuleListResponse.md)
 - [GetBlockStorageInstanceListRequest](docs/GetBlockStorageInstanceListRequest.md)
 - [GetBlockStorageInstanceListResponse](docs/GetBlockStorageInstanceListResponse.md)
 - [GetBlockStorageSnapshotInstanceListRequest](docs/GetBlockStorageSnapshotInstanceListRequest.md)
 - [GetBlockStorageSnapshotInstanceListResponse](docs/GetBlockStorageSnapshotInstanceListResponse.md)
 - [GetInitScriptListRequest](docs/GetInitScriptListRequest.md)
 - [GetInitScriptListResponse](docs/GetInitScriptListResponse.md)
 - [GetInstanceTagListRequest](docs/GetInstanceTagListRequest.md)
 - [GetInstanceTagListResponse](docs/GetInstanceTagListResponse.md)
 - [GetLoginKeyListRequest](docs/GetLoginKeyListRequest.md)
 - [GetLoginKeyListResponse](docs/GetLoginKeyListResponse.md)
 - [GetMemberServerImageListRequest](docs/GetMemberServerImageListRequest.md)
 - [GetMemberServerImageListResponse](docs/GetMemberServerImageListResponse.md)
 - [GetNasVolumeAccessControlRuleListRequest](docs/GetNasVolumeAccessControlRuleListRequest.md)
 - [GetNasVolumeAccessControlRuleListResponse](docs/GetNasVolumeAccessControlRuleListResponse.md)
 - [GetNasVolumeInstanceListRequest](docs/GetNasVolumeInstanceListRequest.md)
 - [GetNasVolumeInstanceListResponse](docs/GetNasVolumeInstanceListResponse.md)
 - [GetNasVolumeInstanceRatingListRequest](docs/GetNasVolumeInstanceRatingListRequest.md)
 - [GetNasVolumeInstanceRatingListResponse](docs/GetNasVolumeInstanceRatingListResponse.md)
 - [GetNasVolumeSnapshotConfigurationHistoryListRequest](docs/GetNasVolumeSnapshotConfigurationHistoryListRequest.md)
 - [GetNasVolumeSnapshotConfigurationHistoryListResponse](docs/GetNasVolumeSnapshotConfigurationHistoryListResponse.md)
 - [GetNasVolumeSnapshotListRequest](docs/GetNasVolumeSnapshotListRequest.md)
 - [GetNasVolumeSnapshotListResponse](docs/GetNasVolumeSnapshotListResponse.md)
 - [GetNetworkInterfaceListRequest](docs/GetNetworkInterfaceListRequest.md)
 - [GetNetworkInterfaceListResponse](docs/GetNetworkInterfaceListResponse.md)
 - [GetPortForwardingConfigurationListRequest](docs/GetPortForwardingConfigurationListRequest.md)
 - [GetPortForwardingConfigurationListResponse](docs/GetPortForwardingConfigurationListResponse.md)
 - [GetPortForwardingRuleListRequest](docs/GetPortForwardingRuleListRequest.md)
 - [GetPortForwardingRuleListResponse](docs/GetPortForwardingRuleListResponse.md)
 - [GetPrivateSubnetInstanceListRequest](docs/GetPrivateSubnetInstanceListRequest.md)
 - [GetPrivateSubnetInstanceListResponse](docs/GetPrivateSubnetInstanceListResponse.md)
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
 - [GetServerImageProductListRequest](docs/GetServerImageProductListRequest.md)
 - [GetServerImageProductListResponse](docs/GetServerImageProductListResponse.md)
 - [GetServerInstanceListRequest](docs/GetServerInstanceListRequest.md)
 - [GetServerInstanceListResponse](docs/GetServerInstanceListResponse.md)
 - [GetServerProductListRequest](docs/GetServerProductListRequest.md)
 - [GetServerProductListResponse](docs/GetServerProductListResponse.md)
 - [GetZoneListRequest](docs/GetZoneListRequest.md)
 - [GetZoneListResponse](docs/GetZoneListResponse.md)
 - [ImportLoginKeyRequest](docs/ImportLoginKeyRequest.md)
 - [ImportLoginKeyResponse](docs/ImportLoginKeyResponse.md)
 - [InitScript](docs/InitScript.md)
 - [InstanceTag](docs/InstanceTag.md)
 - [InstanceTagParameter](docs/InstanceTagParameter.md)
 - [InterruptServerInstanceRequest](docs/InterruptServerInstanceRequest.md)
 - [InterruptServerInstanceResponse](docs/InterruptServerInstanceResponse.md)
 - [LoginKey](docs/LoginKey.md)
 - [MemberServerImage](docs/MemberServerImage.md)
 - [NasVolumeAccessControlRule](docs/NasVolumeAccessControlRule.md)
 - [NasVolumeInstance](docs/NasVolumeInstance.md)
 - [NasVolumeInstanceCustomIp](docs/NasVolumeInstanceCustomIp.md)
 - [NasVolumeInstanceRating](docs/NasVolumeInstanceRating.md)
 - [NasVolumeSnapshot](docs/NasVolumeSnapshot.md)
 - [NasVolumeSnapshotConfigurationHistory](docs/NasVolumeSnapshotConfigurationHistory.md)
 - [NetworkInterface](docs/NetworkInterface.md)
 - [PortForwardingConfiguration](docs/PortForwardingConfiguration.md)
 - [PortForwardingRule](docs/PortForwardingRule.md)
 - [PortForwardingRuleParameter](docs/PortForwardingRuleParameter.md)
 - [PrivateSubnetInstance](docs/PrivateSubnetInstance.md)
 - [Product](docs/Product.md)
 - [PublicIpInstance](docs/PublicIpInstance.md)
 - [Raid](docs/Raid.md)
 - [RebootServerInstancesRequest](docs/RebootServerInstancesRequest.md)
 - [RebootServerInstancesResponse](docs/RebootServerInstancesResponse.md)
 - [RecreateServerInstanceRequest](docs/RecreateServerInstanceRequest.md)
 - [RecreateServerInstanceResponse](docs/RecreateServerInstanceResponse.md)
 - [Region](docs/Region.md)
 - [RemoveMemberServerImageSharingPermissionRequest](docs/RemoveMemberServerImageSharingPermissionRequest.md)
 - [RemoveMemberServerImageSharingPermissionResponse](docs/RemoveMemberServerImageSharingPermissionResponse.md)
 - [RemoveNasVolumeAccessControlRequest](docs/RemoveNasVolumeAccessControlRequest.md)
 - [RemoveNasVolumeAccessControlResponse](docs/RemoveNasVolumeAccessControlResponse.md)
 - [ReplaceServerInstanceAssociatedWithPublicIpRequest](docs/ReplaceServerInstanceAssociatedWithPublicIpRequest.md)
 - [ReplaceServerInstanceAssociatedWithPublicIpResponse](docs/ReplaceServerInstanceAssociatedWithPublicIpResponse.md)
 - [RestoreNasVolumeWithSnapshotRequest](docs/RestoreNasVolumeWithSnapshotRequest.md)
 - [RestoreNasVolumeWithSnapshotResponse](docs/RestoreNasVolumeWithSnapshotResponse.md)
 - [RootPasswordServerInstance](docs/RootPasswordServerInstance.md)
 - [RootPasswordServerInstanceParameter](docs/RootPasswordServerInstanceParameter.md)
 - [ServerInstance](docs/ServerInstance.md)
 - [SetMemberServerImageSharingPermissionRequest](docs/SetMemberServerImageSharingPermissionRequest.md)
 - [SetMemberServerImageSharingPermissionResponse](docs/SetMemberServerImageSharingPermissionResponse.md)
 - [SetNasVolumeAccessControlRequest](docs/SetNasVolumeAccessControlRequest.md)
 - [SetNasVolumeAccessControlResponse](docs/SetNasVolumeAccessControlResponse.md)
 - [SetNasVolumeReturnProtectionRequest](docs/SetNasVolumeReturnProtectionRequest.md)
 - [SetNasVolumeReturnProtectionResponse](docs/SetNasVolumeReturnProtectionResponse.md)
 - [SetProtectServerTerminationRequest](docs/SetProtectServerTerminationRequest.md)
 - [SetProtectServerTerminationResponse](docs/SetProtectServerTerminationResponse.md)
 - [StartServerInstancesRequest](docs/StartServerInstancesRequest.md)
 - [StartServerInstancesResponse](docs/StartServerInstancesResponse.md)
 - [StopServerInstancesRequest](docs/StopServerInstancesRequest.md)
 - [StopServerInstancesResponse](docs/StopServerInstancesResponse.md)
 - [TerminateServerInstancesRequest](docs/TerminateServerInstancesRequest.md)
 - [TerminateServerInstancesResponse](docs/TerminateServerInstancesResponse.md)
 - [Zone](docs/Zone.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



