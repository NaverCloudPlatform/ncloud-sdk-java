
# CreateLoadBalancerInstanceRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**regionCode** | **String** | REGION코드 |  [optional]
**idleTimeout** | **Integer** | 연결타임아웃 |  [optional]
**loadBalancerDescription** | **String** | 로드밸런서설명 |  [optional]
**loadBalancerNetworkTypeCode** | **String** | 로드밸런서네트워크유형코드 |  [optional]
**loadBalancerTypeCode** | **String** | 로드밸런서유형코드 | 
**loadBalancerListenerList** | [**List&lt;LoadBalancerListenerParameter&gt;**](LoadBalancerListenerParameter.md) | 로드밸런서리스너리스트 |  [optional]
**loadBalancerName** | **String** | 로드밸런서이름 |  [optional]
**throughputTypeCode** | **String** | 부하처리성능유형코드 |  [optional]
**vpcNo** | **String** | VPC번호 | 
**subnetNoList** | **List&lt;String&gt;** | 서브넷번호리스트 | 
**loadBalancerSubnetList** | [**List&lt;LoadBalancerSubnetParameter&gt;**](LoadBalancerSubnetParameter.md) | 로드밸런서서브넷리스트 |  [optional]
**responseFormatType** | **String** | responseFormatType {json, xml} |  [optional]



