
# AutoScalingGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoScalingGroupName** | **String** | 오토스케일링그룹명 |  [optional]
**autoScalingGroupNo** | **String** | 오토스케일링그룹번호 |  [optional]
**launchConfigurationName** | **String** | 론치설정명 |  [optional]
**launchConfigurationNo** | **String** | 론치설정번호 |  [optional]
**desiredCapacity** | **Integer** | 기대능력치 |  [optional]
**minSize** | **Integer** | 최소사이즈 |  [optional]
**maxSize** | **Integer** | 최대사이즈 |  [optional]
**defaultCooldown** | **Integer** |  |  [optional]
**loadBalancerInstanceSummaryList** | [**List&lt;LoadBalancerInstanceSummary&gt;**](LoadBalancerInstanceSummary.md) | 로드밸런서인스턴스Summary리스트 |  [optional]
**healthCheckGracePeriod** | **Integer** | 헬스체크보류기간 |  [optional]
**healthCheckType** | [**CommonCode**](CommonCode.md) | 헬스체크유형 |  [optional]
**createDate** | **String** | 생성일시 |  [optional]
**inAutoScalingGroupServerInstanceList** | [**List&lt;InAutoScalingGroupServerInstance&gt;**](InAutoScalingGroupServerInstance.md) | 오토스케일링그룹에속한서버인스턴스리스트 |  [optional]
**suspendedProcessList** | [**List&lt;SuspendedProcess&gt;**](SuspendedProcess.md) | 보류된프로세스리스트 |  [optional]
**zoneList** | [**List&lt;Zone&gt;**](Zone.md) | ZONE리스트 |  [optional]



