/*
 * vnks
 * <br/>https://nks.apigw.ntruss.com/vnks/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vnks.model;

import java.util.Objects;
import com.ncloud.vnks.model.ClusterLogInput;
import com.ncloud.vnks.model.NodePoolRes;
import java.util.ArrayList;
import java.util.List;

/**
 * Cluster
 */
public class Cluster {
	private String uuid = null;

	private String acgName = null;

	private String name = null;

	private String capacity = null;

	private String clusterType = null;

	private Integer nodeCount = null;

	private Integer nodeMaxCount = null;

	private Integer cpuCount = null;

	private Integer memorySize = null;

	private String createdAt = null;

	private String endpoint = null;

	private String k8sVersion = null;

	private String regionCode = null;

	private String status = null;

	private String kubeNetworkPlugin = null;

	private String subnetLbName = null;

	private Integer subnetLbNo = null;

	private Integer lbPublicSubnetNo = null;

	private String subnetName = null;

	private List<Integer> subnetNoList = new ArrayList<Integer>();

	private String updatedAt = null;

	private String vpcName = null;

	private Integer vpcNo = null;

	private String zoneCode = null;

	private Integer zoneNo = null;

	private String loginKeyName = null;

	private ClusterLogInput log = null;

	private Boolean publicNetwork = false;

	private List<NodePoolRes> nodePool = new ArrayList<NodePoolRes>();

	public Cluster uuid(String uuid) {
		this.uuid = uuid;
		return this;
	}

	 /**
	 * 클러스터 uuid
	 * @return uuid
	**/
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Cluster acgName(String acgName) {
		this.acgName = acgName;
		return this;
	}

	 /**
	 * 클러스터 acg 이름
	 * @return acgName
	**/
	public String getAcgName() {
		return acgName;
	}

	public void setAcgName(String acgName) {
		this.acgName = acgName;
	}

	public Cluster name(String name) {
		this.name = name;
		return this;
	}

	 /**
	 * 클러스터 이름
	 * @return name
	**/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cluster capacity(String capacity) {
		this.capacity = capacity;
		return this;
	}

	 /**
	 * 클러스터 용량
	 * @return capacity
	**/
	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public Cluster clusterType(String clusterType) {
		this.clusterType = clusterType;
		return this;
	}

	 /**
	 * 클러스터 타입
	 * @return clusterType
	**/
	public String getClusterType() {
		return clusterType;
	}

	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
	}

	public Cluster nodeCount(Integer nodeCount) {
		this.nodeCount = nodeCount;
		return this;
	}

	 /**
	 * 등록된 노드 총 개수
	 * @return nodeCount
	**/
	public Integer getNodeCount() {
		return nodeCount;
	}

	public void setNodeCount(Integer nodeCount) {
		this.nodeCount = nodeCount;
	}

	public Cluster nodeMaxCount(Integer nodeMaxCount) {
		this.nodeMaxCount = nodeMaxCount;
		return this;
	}

	 /**
	 * 사용할 수 있는 노드의 최대 개수
	 * @return nodeMaxCount
	**/
	public Integer getNodeMaxCount() {
		return nodeMaxCount;
	}

	public void setNodeMaxCount(Integer nodeMaxCount) {
		this.nodeMaxCount = nodeMaxCount;
	}

	public Cluster cpuCount(Integer cpuCount) {
		this.cpuCount = cpuCount;
		return this;
	}

	 /**
	 * cpu 개수
	 * @return cpuCount
	**/
	public Integer getCpuCount() {
		return cpuCount;
	}

	public void setCpuCount(Integer cpuCount) {
		this.cpuCount = cpuCount;
	}

	public Cluster memorySize(Integer memorySize) {
		this.memorySize = memorySize;
		return this;
	}

	 /**
	 * 메모리 용량
	 * @return memorySize
	**/
	public Integer getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(Integer memorySize) {
		this.memorySize = memorySize;
	}

	public Cluster createdAt(String createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	 /**
	 * 생성 일자
	 * @return createdAt
	**/
	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public Cluster endpoint(String endpoint) {
		this.endpoint = endpoint;
		return this;
	}

	 /**
	 * Control Plane API 주소
	 * @return endpoint
	**/
	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public Cluster k8sVersion(String k8sVersion) {
		this.k8sVersion = k8sVersion;
		return this;
	}

	 /**
	 * 쿠버네티스 버전
	 * @return k8sVersion
	**/
	public String getK8sVersion() {
		return k8sVersion;
	}

	public void setK8sVersion(String k8sVersion) {
		this.k8sVersion = k8sVersion;
	}

	public Cluster regionCode(String regionCode) {
		this.regionCode = regionCode;
		return this;
	}

	 /**
	 * region의 코드
	 * @return regionCode
	**/
	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public Cluster status(String status) {
		this.status = status;
		return this;
	}

	 /**
	 * 클러스터의 상태
	 * @return status
	**/
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Cluster kubeNetworkPlugin(String kubeNetworkPlugin) {
		this.kubeNetworkPlugin = kubeNetworkPlugin;
		return this;
	}

	 /**
	 * CNI Plugin Code
	 * @return kubeNetworkPlugin
	**/
	public String getKubeNetworkPlugin() {
		return kubeNetworkPlugin;
	}

	public void setKubeNetworkPlugin(String kubeNetworkPlugin) {
		this.kubeNetworkPlugin = kubeNetworkPlugin;
	}

	public Cluster subnetLbName(String subnetLbName) {
		this.subnetLbName = subnetLbName;
		return this;
	}

	 /**
	 * 로드밸런서 전용 서브넷 이름
	 * @return subnetLbName
	**/
	public String getSubnetLbName() {
		return subnetLbName;
	}

	public void setSubnetLbName(String subnetLbName) {
		this.subnetLbName = subnetLbName;
	}

	public Cluster subnetLbNo(Integer subnetLbNo) {
		this.subnetLbNo = subnetLbNo;
		return this;
	}

	 /**
	 * 로드밸런서 전용 서브넷 No
	 * @return subnetLbNo
	**/
	public Integer getSubnetLbNo() {
		return subnetLbNo;
	}

	public void setSubnetLbNo(Integer subnetLbNo) {
		this.subnetLbNo = subnetLbNo;
	}

	public Cluster lbPublicSubnetNo(Integer lbPublicSubnetNo) {
		this.lbPublicSubnetNo = lbPublicSubnetNo;
		return this;
	}

	 /**
	 * 로드밸런서 전용 Public Subnet No
	 * @return lbPublicSubnetNo
	**/
	public Integer getLbPublicSubnetNo() {
		return lbPublicSubnetNo;
	}

	public void setLbPublicSubnetNo(Integer lbPublicSubnetNo) {
		this.lbPublicSubnetNo = lbPublicSubnetNo;
	}

	public Cluster subnetName(String subnetName) {
		this.subnetName = subnetName;
		return this;
	}

	 /**
	 * 서브넷 이름
	 * @return subnetName
	**/
	public String getSubnetName() {
		return subnetName;
	}

	public void setSubnetName(String subnetName) {
		this.subnetName = subnetName;
	}

	public Cluster subnetNoList(List<Integer> subnetNoList) {
		this.subnetNoList = subnetNoList;
		return this;
	}

	public Cluster addSubnetNoListItem(Integer subnetNoListItem) {
		this.subnetNoList.add(subnetNoListItem);
		return this;
	}

	 /**
	 * 서브넷 No 목록
	 * @return subnetNoList
	**/
	public List<Integer> getSubnetNoList() {
		return subnetNoList;
	}

	public void setSubnetNoList(List<Integer> subnetNoList) {
		this.subnetNoList = subnetNoList;
	}

	public Cluster updatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}

	 /**
	 * 최근 업데이트 일자
	 * @return updatedAt
	**/
	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Cluster vpcName(String vpcName) {
		this.vpcName = vpcName;
		return this;
	}

	 /**
	 * vpc 이름
	 * @return vpcName
	**/
	public String getVpcName() {
		return vpcName;
	}

	public void setVpcName(String vpcName) {
		this.vpcName = vpcName;
	}

	public Cluster vpcNo(Integer vpcNo) {
		this.vpcNo = vpcNo;
		return this;
	}

	 /**
	 * vpc 번호
	 * @return vpcNo
	**/
	public Integer getVpcNo() {
		return vpcNo;
	}

	public void setVpcNo(Integer vpcNo) {
		this.vpcNo = vpcNo;
	}

	public Cluster zoneCode(String zoneCode) {
		this.zoneCode = zoneCode;
		return this;
	}

	 /**
	 * zone 코드
	 * @return zoneCode
	**/
	public String getZoneCode() {
		return zoneCode;
	}

	public void setZoneCode(String zoneCode) {
		this.zoneCode = zoneCode;
	}

	public Cluster zoneNo(Integer zoneNo) {
		this.zoneNo = zoneNo;
		return this;
	}

	 /**
	 * zone 번호
	 * @return zoneNo
	**/
	public Integer getZoneNo() {
		return zoneNo;
	}

	public void setZoneNo(Integer zoneNo) {
		this.zoneNo = zoneNo;
	}

	public Cluster loginKeyName(String loginKeyName) {
		this.loginKeyName = loginKeyName;
		return this;
	}

	 /**
	 * 로그인 키 이름
	 * @return loginKeyName
	**/
	public String getLoginKeyName() {
		return loginKeyName;
	}

	public void setLoginKeyName(String loginKeyName) {
		this.loginKeyName = loginKeyName;
	}

	public Cluster log(ClusterLogInput log) {
		this.log = log;
		return this;
	}

	 /**
	 * log
	 * @return log
	**/
	public ClusterLogInput getLog() {
		return log;
	}

	public void setLog(ClusterLogInput log) {
		this.log = log;
	}

	public Cluster publicNetwork(Boolean publicNetwork) {
		this.publicNetwork = publicNetwork;
		return this;
	}

	 /**
	 * Public Network
	 * @return publicNetwork
	**/
	public Boolean isPublicNetwork() {
		return publicNetwork;
	}

	public void setPublicNetwork(Boolean publicNetwork) {
		this.publicNetwork = publicNetwork;
	}

	public Cluster nodePool(List<NodePoolRes> nodePool) {
		this.nodePool = nodePool;
		return this;
	}

	public Cluster addNodePoolItem(NodePoolRes nodePoolItem) {
		this.nodePool.add(nodePoolItem);
		return this;
	}

	 /**
	 * 노드풀
	 * @return nodePool
	**/
	public List<NodePoolRes> getNodePool() {
		return nodePool;
	}

	public void setNodePool(List<NodePoolRes> nodePool) {
		this.nodePool = nodePool;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Cluster cluster = (Cluster) o;
		return Objects.equals(this.uuid, cluster.uuid) &&
				Objects.equals(this.acgName, cluster.acgName) &&
				Objects.equals(this.name, cluster.name) &&
				Objects.equals(this.capacity, cluster.capacity) &&
				Objects.equals(this.clusterType, cluster.clusterType) &&
				Objects.equals(this.nodeCount, cluster.nodeCount) &&
				Objects.equals(this.nodeMaxCount, cluster.nodeMaxCount) &&
				Objects.equals(this.cpuCount, cluster.cpuCount) &&
				Objects.equals(this.memorySize, cluster.memorySize) &&
				Objects.equals(this.createdAt, cluster.createdAt) &&
				Objects.equals(this.endpoint, cluster.endpoint) &&
				Objects.equals(this.k8sVersion, cluster.k8sVersion) &&
				Objects.equals(this.regionCode, cluster.regionCode) &&
				Objects.equals(this.status, cluster.status) &&
				Objects.equals(this.kubeNetworkPlugin, cluster.kubeNetworkPlugin) &&
				Objects.equals(this.subnetLbName, cluster.subnetLbName) &&
				Objects.equals(this.subnetLbNo, cluster.subnetLbNo) &&
				Objects.equals(this.lbPublicSubnetNo, cluster.lbPublicSubnetNo) &&
				Objects.equals(this.subnetName, cluster.subnetName) &&
				Objects.equals(this.subnetNoList, cluster.subnetNoList) &&
				Objects.equals(this.updatedAt, cluster.updatedAt) &&
				Objects.equals(this.vpcName, cluster.vpcName) &&
				Objects.equals(this.vpcNo, cluster.vpcNo) &&
				Objects.equals(this.zoneCode, cluster.zoneCode) &&
				Objects.equals(this.zoneNo, cluster.zoneNo) &&
				Objects.equals(this.loginKeyName, cluster.loginKeyName) &&
				Objects.equals(this.log, cluster.log) &&
				Objects.equals(this.publicNetwork, cluster.publicNetwork) &&
				Objects.equals(this.nodePool, cluster.nodePool);
	}

	@Override
	public int hashCode() {
		return Objects.hash(uuid, acgName, name, capacity, clusterType, nodeCount, nodeMaxCount, cpuCount, memorySize, createdAt, endpoint, k8sVersion, regionCode, status, kubeNetworkPlugin, subnetLbName, subnetLbNo, lbPublicSubnetNo, subnetName, subnetNoList, updatedAt, vpcName, vpcNo, zoneCode, zoneNo, loginKeyName, log, publicNetwork, nodePool);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Cluster {\n");
		
		sb.append("		uuid: ").append(toIndentedString(uuid)).append("\n");
		sb.append("		acgName: ").append(toIndentedString(acgName)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		capacity: ").append(toIndentedString(capacity)).append("\n");
		sb.append("		clusterType: ").append(toIndentedString(clusterType)).append("\n");
		sb.append("		nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
		sb.append("		nodeMaxCount: ").append(toIndentedString(nodeMaxCount)).append("\n");
		sb.append("		cpuCount: ").append(toIndentedString(cpuCount)).append("\n");
		sb.append("		memorySize: ").append(toIndentedString(memorySize)).append("\n");
		sb.append("		createdAt: ").append(toIndentedString(createdAt)).append("\n");
		sb.append("		endpoint: ").append(toIndentedString(endpoint)).append("\n");
		sb.append("		k8sVersion: ").append(toIndentedString(k8sVersion)).append("\n");
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		status: ").append(toIndentedString(status)).append("\n");
		sb.append("		kubeNetworkPlugin: ").append(toIndentedString(kubeNetworkPlugin)).append("\n");
		sb.append("		subnetLbName: ").append(toIndentedString(subnetLbName)).append("\n");
		sb.append("		subnetLbNo: ").append(toIndentedString(subnetLbNo)).append("\n");
		sb.append("		lbPublicSubnetNo: ").append(toIndentedString(lbPublicSubnetNo)).append("\n");
		sb.append("		subnetName: ").append(toIndentedString(subnetName)).append("\n");
		sb.append("		subnetNoList: ").append(toIndentedString(subnetNoList)).append("\n");
		sb.append("		updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
		sb.append("		vpcName: ").append(toIndentedString(vpcName)).append("\n");
		sb.append("		vpcNo: ").append(toIndentedString(vpcNo)).append("\n");
		sb.append("		zoneCode: ").append(toIndentedString(zoneCode)).append("\n");
		sb.append("		zoneNo: ").append(toIndentedString(zoneNo)).append("\n");
		sb.append("		loginKeyName: ").append(toIndentedString(loginKeyName)).append("\n");
		sb.append("		log: ").append(toIndentedString(log)).append("\n");
		sb.append("		publicNetwork: ").append(toIndentedString(publicNetwork)).append("\n");
		sb.append("		nodePool: ").append(toIndentedString(nodePool)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n		");
	}

}
