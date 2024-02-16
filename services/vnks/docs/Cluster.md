
# Cluster

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **String** | 클러스터 uuid | 
**acgName** | **String** | 클러스터 acg 이름 | 
**name** | **String** | 클러스터 이름 | 
**capacity** | **String** | 클러스터 용량 | 
**clusterType** | **String** | 클러스터 타입 | 
**nodeCount** | **Integer** | 등록된 노드 총 개수 | 
**nodeMaxCount** | **Integer** | 사용할 수 있는 노드의 최대 개수 | 
**cpuCount** | **Integer** | cpu 개수 | 
**memorySize** | **Integer** | 메모리 용량 | 
**createdAt** | **String** | 생성 일자 | 
**endpoint** | **String** | Control Plane API 주소 | 
**k8sVersion** | **String** | 쿠버네티스 버전 | 
**regionCode** | **String** | region의 코드 | 
**status** | **String** | 클러스터의 상태 | 
**kubeNetworkPlugin** | **String** | CNI Plugin Code | 
**subnetLbName** | **String** | 로드밸런서 전용 서브넷 이름 | 
**subnetLbNo** | **Integer** | 로드밸런서 전용 서브넷 No | 
**lbPublicSubnetNo** | **Integer** | 로드밸런서 전용 Public Subnet No |  [optional]
**subnetName** | **String** | 서브넷 이름 | 
**subnetNoList** | **List&lt;Integer&gt;** | 서브넷 No 목록 | 
**updatedAt** | **String** | 최근 업데이트 일자 | 
**vpcName** | **String** | vpc 이름 | 
**vpcNo** | **Integer** | vpc 번호 | 
**zoneCode** | **String** | zone 코드 |  [optional]
**zoneNo** | **Integer** | zone 번호 |  [optional]
**loginKeyName** | **String** | 로그인 키 이름 | 
**log** | [**ClusterLogInput**](ClusterLogInput.md) | log | 
**publicNetwork** | **Boolean** | Public Network | 
**nodePool** | [**List&lt;NodePoolRes&gt;**](NodePoolRes.md) | 노드풀 | 



