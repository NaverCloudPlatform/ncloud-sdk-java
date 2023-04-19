
# PutScheduledUpdateGroupActionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**regionCode** | **String** | REGION코드 |  [optional]
**autoScalingGroupNo** | **String** | 오토스케일링그룹번호 | 
**scheduledActionNo** | **String** | 스케쥴액션번호 |  [optional]
**scheduledActionName** | **String** | 스케쥴액션이름 |  [optional]
**minSize** | **Integer** | 최소용량 | 
**maxSize** | **Integer** | 최대용량 | 
**desiredCapacity** | **Integer** | 기대용량 |  [optional]
**startTime** | **String** | 스케쥴시작일시 |  [optional]
**endTime** | **String** | 스케쥴종료일시 |  [optional]
**recurrence** | **String** | 반복설정 |  [optional]
**timeZone** | **String** | 타임존 |  [optional]
**responseFormatType** | **String** | responseFormatType {json, xml} |  [optional]



