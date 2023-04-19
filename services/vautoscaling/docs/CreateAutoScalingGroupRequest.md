
# CreateAutoScalingGroupRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**regionCode** | **String** | REGION코드 |  [optional]
**launchConfigurationNo** | **String** | 론치설정번호 | 
**autoScalingGroupName** | **String** | 오토스케일링그룹이름 |  [optional]
**vpcNo** | **String** | VPC번호 | 
**subnetNo** | **String** | 서브넷번호 | 
**accessControlGroupNoList** | **List&lt;String&gt;** | ACG번호리스트 | 
**serverNamePrefix** | **String** | 서버이름Prefix |  [optional]
**minSize** | **Integer** | 최소용량 | 
**maxSize** | **Integer** | 최대용량 | 
**desiredCapacity** | **Integer** | 기대용량 |  [optional]
**defaultCoolDown** | **Integer** | 쿨다운기본값 |  [optional]
**healthCheckGracePeriod** | **Integer** | 헬스체크보류기간 |  [optional]
**healthCheckTypeCode** | **String** | 헬스체크유형코드 |  [optional]
**targetGroupNoList** | **List&lt;String&gt;** | 타겟그룹번호리스트 |  [optional]
**responseFormatType** | **String** | responseFormatType {json, xml} |  [optional]



