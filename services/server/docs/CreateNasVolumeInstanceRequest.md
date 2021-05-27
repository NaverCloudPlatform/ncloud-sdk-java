
# CreateNasVolumeInstanceRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**volumeName** | **String** | 볼륨이름 | 
**volumeSize** | **Integer** | NAS볼륨사이즈 | 
**volumeAllotmentProtocolTypeCode** | **String** | 볼륨할당프로토콜유형코드 | 
**serverInstanceNoList** | **List&lt;String&gt;** | 서버인스턴스번호리스트 |  [optional]
**customIpList** | **List&lt;String&gt;** | 커스텀IP리스트 |  [optional]
**cifsUserName** | **String** | CIFS유저이름 |  [optional]
**cifsUserPassword** | **String** | CIFS유저비밀번호 |  [optional]
**nasVolumeDescription** | **String** | NAS볼륨설명 |  [optional]
**regionNo** | **String** | 리전번호 |  [optional]
**zoneNo** | **String** | ZONE번호 |  [optional]
**isReturnProtection** | **Boolean** | 반납보호여부 |  [optional]
**responseFormatType** | **String** | responseFormatType {json, xml} |  [optional]



