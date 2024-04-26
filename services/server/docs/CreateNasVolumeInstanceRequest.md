
# CreateNasVolumeInstanceRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**volumeName** | **String** | 볼륨이름 | 
**volumeSize** | **Integer** | NAS볼륨사이즈 | 
**volumeAllotmentProtocolTypeCode** | **String** | 볼륨할당프로토콜유형코드 | 
**accessControlRuleList** | [**List&lt;AccessControlRuleParameter&gt;**](AccessControlRuleParameter.md) | 접근제어Rule리스트 |  [optional]
**cifsUserName** | **String** | CIFS유저이름 |  [optional]
**cifsUserPassword** | **String** | CIFS유저비밀번호 |  [optional]
**nasVolumeDescription** | **String** | NAS볼륨설명 |  [optional]
**regionNo** | **String** | 리전번호 |  [optional]
**zoneNo** | **String** | ZONE번호 |  [optional]
**isReturnProtection** | **Boolean** | 반납보호여부 |  [optional]
**isAsync** | **Boolean** | Async여부 |  [optional]
**responseFormatType** | **String** | responseFormatType {json, xml} |  [optional]



