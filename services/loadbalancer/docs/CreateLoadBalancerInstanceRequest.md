
# CreateLoadBalancerInstanceRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**loadBalancerName** | **String** | 로드밸런서명 |  [optional]
**loadBalancerAlgorithmTypeCode** | **String** | 로드밸런서알고리즘구분코드 |  [optional]
**loadBalancerDescription** | **String** | 로드밸런서설명 |  [optional]
**loadBalancerRuleList** | [**List&lt;LoadBalancerRuleParameter&gt;**](LoadBalancerRuleParameter.md) | 로드밸런서RULE리스트 | 
**serverInstanceNoList** | **List&lt;String&gt;** | 서버인스턴스번호리스트 |  [optional]
**networkUsageTypeCode** | **String** | 네트워크용도구분코드 |  [optional]
**regionNo** | **String** | 리전번호 |  [optional]
**zoneNoList** | **List&lt;String&gt;** | ZONE번호리스트 |  [optional]
**responseFormatType** | **String** | responseFormatType {json, xml} |  [optional]



