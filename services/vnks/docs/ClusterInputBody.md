
# ClusterInputBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | 클러스터 이름 | 
**clusterType** | **String** | 클러스터 타입 | 
**loginKeyName** | **String** | 로그인 키 이름 | 
**k8sVersion** | **String** | 쿠버네티스 버전 |  [optional]
**regionCode** | **String** | Region의 코드 | 
**zoneCode** | **String** | zone 코드 |  [optional]
**zoneNo** | **Integer** | Zone 번호 |  [optional]
**publicNetwork** | **Boolean** | Public network |  [optional]
**kubeNetworkPlugin** | **String** | CNI Plugin Code (ncloud-vpc-cni or cilium) |  [optional]
**vpcNo** | **Integer** | vpc의 No | 
**subnetNoList** | **List&lt;Integer&gt;** | 서브넷 No 목록 | 
**subnetLbNo** | **Integer** | 로드밸런서 전용 서브넷 No | 
**lbPublicSubnetNo** | **Integer** | 로드밸런서 전용 Public Subnet No |  [optional]
**log** | [**ClusterLogInput**](ClusterLogInput.md) | log |  [optional]
**defaultNodePool** | [**DefaultNodePoolParam**](DefaultNodePoolParam.md) | 기본 노드풀 |  [optional]
**nodePool** | [**List&lt;NodePool&gt;**](NodePool.md) | 추가 노드풀 |  [optional]
**initScriptNo** | **Integer** | InitScript 번호 |  [optional]
**podSecurityPolicyEnabled** | **Boolean** | Pod Security Policy 설정 여부 |  [optional]



