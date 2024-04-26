
# TargetGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**targetGroupNo** | **String** | 타겟그룹번호 |  [optional]
**targetGroupName** | **String** | 타겟그룹이름 |  [optional]
**targetType** | [**CommonCode**](CommonCode.md) | 타겟유형 |  [optional]
**vpcNo** | **String** | VPC번호 |  [optional]
**targetGroupProtocolType** | [**CommonCode**](CommonCode.md) | 타겟그룹프로토콜유형 |  [optional]
**targetGroupPort** | **Integer** | 타겟그룹포트 |  [optional]
**targetGroupDescription** | **String** | 타겟그룹설명 |  [optional]
**useStickySession** | **Boolean** | 세션별접근사용여부 |  [optional]
**useProxyProtocol** | **Boolean** | 프록시프로토콜사용여부 |  [optional]
**algorithmType** | [**CommonCode**](CommonCode.md) | 알고리즘유형 |  [optional]
**createDate** | **String** | 생성일시 |  [optional]
**regionCode** | **String** | REGION코드 |  [optional]
**loadBalancerInstanceNo** | **String** | 로드밸런서인스턴스번호 |  [optional]
**healthCheckProtocolType** | [**CommonCode**](CommonCode.md) | 헬스체크프로토콜유형 |  [optional]
**healthCheckPort** | **Integer** | 타겟그룹포트 |  [optional]
**healthCheckUrlPath** | **String** | 헬스체크URL경로 |  [optional]
**healthCheckHttpMethodType** | [**CommonCode**](CommonCode.md) | 헬스체크HTTP메소드유형 |  [optional]
**healthCheckCycle** | **Integer** | 헬스체크주기 |  [optional]
**healthCheckUpThreshold** | **Integer** | 헬스체크정상임계값 |  [optional]
**healthCheckDownThreshold** | **Integer** | 헬스체크실패임계값 |  [optional]
**targetNoList** | **List&lt;String&gt;** | 타겟번호리스트 |  [optional]



