
# AutoScalingGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vpcNo** | **String** | VPC번호 |  [optional]
**subnetNo** | **String** | 서브넷번호 |  [optional]
**serverNamePrefix** | **String** | 서버이름Prefix |  [optional]
**autoScalingGroupNo** | **String** | 오토스케일링그룹번호 |  [optional]
**autoScalingGroupName** | **String** | 오토스케일링그룹이름 |  [optional]
**launchConfigurationNo** | **String** | 론치설정번호 |  [optional]
**minSize** | **Integer** | 최소용량 |  [optional]
**maxSize** | **Integer** | 최대용량 |  [optional]
**desiredCapacity** | **Integer** | 기대용량 |  [optional]
**defaultCoolDown** | **Integer** | 쿨다운기본값 |  [optional]
**healthCheckGracePeriod** | **Integer** | 헬스체크보류기간 |  [optional]
**healthCheckType** | [**CommonCode**](CommonCode.md) | 헬스체크유형 |  [optional]
**createDate** | **String** | 생성일시 |  [optional]
**autoScalingGroupStatus** | [**CommonCode**](CommonCode.md) | 오토스케일링그룹상태 |  [optional]
**targetGroupNoList** | **List&lt;String&gt;** | 타겟그룹번호리스트 |  [optional]
**inAutoScalingGroupServerInstanceList** | [**List&lt;InAutoScalingGroupServerInstance&gt;**](InAutoScalingGroupServerInstance.md) | 오토스케일링그룹에속한서버인스턴스리스트 |  [optional]
**accessControlGroupNoList** | **List&lt;String&gt;** | ACG번호리스트 |  [optional]
**suspendedProcessList** | [**List&lt;SuspendedProcess&gt;**](SuspendedProcess.md) | 일시정지된프로세스리스트 |  [optional]



