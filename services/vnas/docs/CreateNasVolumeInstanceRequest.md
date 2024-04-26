
# CreateNasVolumeInstanceRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**regionCode** | **String** | REGION코드 |  [optional]
**zoneCode** | **String** | ZONE코드 |  [optional]
**volumeName** | **String** | 볼륨이름 |  [optional]
**volumeSize** | **Integer** | 볼륨사이즈 | 
**volumeAllotmentProtocolTypeCode** | **String** | 볼륨할당프로토콜유형코드 | 
**serverInstanceNoList** | **List&lt;String&gt;** | 서버인스턴스번호리스트 |  [optional]
**cifsUserName** | **String** | CIFS유저이름 |  [optional]
**cifsUserPassword** | **String** | CIFS유저비밀번호 |  [optional]
**isEncryptedVolume** | **Boolean** | 볼륨암호화여부 |  [optional]
**isReturnProtection** | **Boolean** | 반납보호여부 |  [optional]
**nasVolumeDescription** | **String** | NAS볼륨설명 |  [optional]
**accessControlRuleList** | [**List&lt;AccessControlRuleParameter&gt;**](AccessControlRuleParameter.md) | 접근제어Rule리스트 |  [optional]
**isAsync** | **Boolean** | Async여부 |  [optional]
**responseFormatType** | **String** | responseFormatType {json, xml} |  [optional]



