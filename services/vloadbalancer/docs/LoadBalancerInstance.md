
# LoadBalancerInstance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**loadBalancerInstanceNo** | **String** | 로드밸런서인스턴스번호 |  [optional]
**loadBalancerInstanceStatus** | [**CommonCode**](CommonCode.md) | 로드밸런서인스턴스상태 |  [optional]
**loadBalancerInstanceOperation** | [**CommonCode**](CommonCode.md) | 로드밸런서인스턴스OP |  [optional]
**loadBalancerInstanceStatusName** | **String** | 로드밸런서인스턴스상태이름 |  [optional]
**loadBalancerDescription** | **String** | 로드밸런서설명 |  [optional]
**createDate** | **String** | 생성일시 |  [optional]
**loadBalancerName** | **String** | 로드밸런서이름 |  [optional]
**loadBalancerDomain** | **String** | 로드밸런서도메인 |  [optional]
**loadBalancerIpList** | **List&lt;String&gt;** | 로드밸런서IP리스트 |  [optional]
**loadBalancerType** | [**CommonCode**](CommonCode.md) | 로드밸런서유형 |  [optional]
**loadBalancerNetworkType** | [**CommonCode**](CommonCode.md) | 로드밸런서네트워크유형 |  [optional]
**throughputType** | [**CommonCode**](CommonCode.md) | 부하처리성능유형 |  [optional]
**idleTimeout** | **Integer** | 연결타임아웃 |  [optional]
**vpcNo** | **String** | VPC번호 |  [optional]
**regionCode** | **String** | REGION코드 |  [optional]
**subnetNoList** | **List&lt;String&gt;** | 서브넷번호리스트 |  [optional]
**loadBalancerSubnetList** | [**List&lt;LoadBalancerSubnet&gt;**](LoadBalancerSubnet.md) | 로드밸런서서브넷리스트 |  [optional]
**loadBalancerListenerNoList** | **List&lt;String&gt;** | 로드밸런서리스너번호리스트 |  [optional]



