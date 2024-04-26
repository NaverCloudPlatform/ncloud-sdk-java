
# NasVolumeInstance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nasVolumeInstanceNo** | **String** | NAS볼륨인스턴스번호 |  [optional]
**nasVolumeInstanceStatus** | [**CommonCode**](CommonCode.md) | NAS볼륨인스턴스상태 |  [optional]
**nasVolumeInstanceOperation** | [**CommonCode**](CommonCode.md) | 서버설명 |  [optional]
**nasVolumeInstanceStatusName** | **String** | NAS볼륨인스턴스상태이름 |  [optional]
**createDate** | **String** | 생성일시 |  [optional]
**nasVolumeDescription** | **String** | NAS볼륨설명 |  [optional]
**mountInformation** | **String** | 마운트정보 |  [optional]
**volumeAllotmentProtocolType** | [**CommonCode**](CommonCode.md) | 볼륨할당프로토콜유형 |  [optional]
**volumeName** | **String** | 볼륨이름 |  [optional]
**volumeTotalSize** | **Long** | 볼륨총사이즈 |  [optional]
**volumeSize** | **Long** | 볼륨사이즈 |  [optional]
**snapshotVolumeConfigurationRatio** | **Float** | 스냅샷볼륨설정비율 |  [optional]
**snapshotVolumeConfigPeriodType** | [**CommonCode**](CommonCode.md) | 스냅샷볼륨설정기간유형 |  [optional]
**snapshotVolumeConfigDayOfWeekType** | [**CommonCode**](CommonCode.md) | 스냅샷자동생성주기요일유형 |  [optional]
**snapshotVolumeConfigTime** | **Integer** | 스냅샷볼륨설정시간 |  [optional]
**snapshotVolumeSize** | **Long** | 스냅샷볼륨사이즈 |  [optional]
**isSnapshotConfiguration** | **Boolean** | 스냅샷설정여부 |  [optional]
**isEventConfiguration** | **Boolean** | 이벤트설정여부 |  [optional]
**regionCode** | **String** | REGION코드 |  [optional]
**zoneCode** | **String** | ZONE코드 |  [optional]
**initScriptNo** | **String** | 초기화스크립트번호 |  [optional]
**nasVolumeServerInstanceNoList** | **List&lt;String&gt;** | NAS볼륨서버인스턴스번호리스트 |  [optional]
**isEncryptedVolume** | **Boolean** | 볼륨암호화여부 |  [optional]
**nasVolumeInstanceCustomIpList** | [**List&lt;NasVolumeInstanceCustomIp&gt;**](NasVolumeInstanceCustomIp.md) |  |  [optional]
**isReturnProtection** | **Boolean** | 반납보호여부 |  [optional]



