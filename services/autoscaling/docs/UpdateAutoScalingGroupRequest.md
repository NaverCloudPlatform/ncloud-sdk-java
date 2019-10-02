
# UpdateAutoScalingGroupRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoScalingGroupName** | **String** | 오토스케일링그룹명 |  [optional]
**launchConfigurationName** | **String** | 론치설정명 | 
**desiredCapacity** | **Integer** | 기대용량치 |  [optional]
**minSize** | **Integer** | 최소사이즈 |  [optional]
**maxSize** | **Integer** | 최대사이즈 |  [optional]
**defaultCooldown** | **Integer** | 디폴트쿨다운타임 |  [optional]
**healthCheckGracePeriod** | **Integer** | 헬스체크보류기간 |  [optional]
**healthCheckTypeCode** | **String** | 헬스체크유형코드 |  [optional]
**zoneNoList** | **List&lt;String&gt;** | ZONE번호리스트 |  [optional]
**responseFormatType** | **String** | responseFormatType {json, xml} |  [optional]



