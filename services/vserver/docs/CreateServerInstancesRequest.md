
# CreateServerInstancesRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**regionCode** | **String** | REGION코드 |  [optional]
**serverProductCode** | **String** | 서버상품코드 |  [optional]
**serverImageProductCode** | **String** | 서버이미지상품코드 |  [optional]
**memberServerImageInstanceNo** | **String** | 회원서버이미지인스턴스번호 |  [optional]
**serverName** | **String** | 서버이름 |  [optional]
**serverDescription** | **String** | 서버설명 |  [optional]
**loginKeyName** | **String** | 로그인키이름 |  [optional]
**isProtectServerTermination** | **Boolean** | 반납보호여부 |  [optional]
**serverCreateCount** | **Integer** | 서버생성개수 |  [optional]
**serverCreateStartNo** | **Integer** | 서버생성시작번호 |  [optional]
**feeSystemTypeCode** | **String** | 요금제유형코드 |  [optional]
**initScriptNo** | **String** | 초기화스크립트번호 |  [optional]
**vpcNo** | **String** | VPC번호 | 
**subnetNo** | **String** | 서브넷번호 | 
**networkInterfaceList** | [**List&lt;NetworkInterfaceParameter&gt;**](NetworkInterfaceParameter.md) | 네트워크인터페이스리스트 | 
**placementGroupNo** | **String** | 물리배치그룹번호 |  [optional]
**isEncryptedBaseBlockStorageVolume** | **Boolean** | 기본블록스토리지볼륨암호화여부 |  [optional]
**associateWithPublicIp** | **Boolean** | 서버생성시공인IP할당여부 |  [optional]
**raidTypeName** | **String** | RAID유형이름 |  [optional]
**blockDevicePartitionList** | [**List&lt;BlockDevicePartition&gt;**](BlockDevicePartition.md) | 블록디바이스파티션리스트 |  [optional]
**responseFormatType** | **String** | responseFormatType {json, xml} |  [optional]



