
# UpdateAutoScalingGroupRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**regionCode** | **String** | REGION코드 |  [optional]
**autoScalingGroupNo** | **String** | 오토스케일링그룹번호 | 
**launchConfigurationNo** | **String** | 론치설정번호 |  [optional]
**serverNamePrefix** | **String** | 서버이름Prefix |  [optional]
**minSize** | **Integer** | 최소용량 |  [optional]
**maxSize** | **Integer** | 최대용량 |  [optional]
**desiredCapacity** | **Integer** | 기대용량 |  [optional]
**defaultCoolDown** | **Integer** | 쿨다운기본값 |  [optional]
**healthCheckGracePeriod** | **Integer** | 헬스체크보류기간 |  [optional]
**healthCheckTypeCode** | **String** | 헬스체크유형코드 |  [optional]
**responseFormatType** | **String** | responseFormatType {json, xml} |  [optional]



