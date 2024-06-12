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
import com.ncloud.vnks.model.DefaultNodePoolParam;
import com.ncloud.vnks.model.NodePool;
import java.util.ArrayList;
import java.util.List;

/**
 * ClusterInputBody
 */
public class ClusterInputBody {
	private String name = null;

	private String clusterType = "SVR.VNKS.STAND.C004.M016.NET.HDD.B050.G001";

	private String loginKeyName = null;

	private String k8sVersion = null;

	private String regionCode = null;

	private String zoneCode = null;

	private Integer zoneNo = null;

	private Boolean publicNetwork = false;

	private String kubeNetworkPlugin = "cilium";

	private Integer vpcNo = null;

	private List<Integer> subnetNoList = new ArrayList<Integer>();

	private Integer subnetLbNo = null;

	private Integer lbPublicSubnetNo = null;

	private ClusterLogInput log = null;

	private DefaultNodePoolParam defaultNodePool = null;

	private List<NodePool> nodePool = null;

	private Integer initScriptNo = null;

	private Boolean podSecurityPolicyEnabled = false;

	public ClusterInputBody name(String name) {
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

	public ClusterInputBody clusterType(String clusterType) {
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

	public ClusterInputBody loginKeyName(String loginKeyName) {
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

	public ClusterInputBody k8sVersion(String k8sVersion) {
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

	public ClusterInputBody regionCode(String regionCode) {
		this.regionCode = regionCode;
		return this;
	}

	 /**
	 * Region의 코드
	 * @return regionCode
	**/
	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public ClusterInputBody zoneCode(String zoneCode) {
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

	public ClusterInputBody zoneNo(Integer zoneNo) {
		this.zoneNo = zoneNo;
		return this;
	}

	 /**
	 * Zone 번호
	 * @return zoneNo
	**/
	public Integer getZoneNo() {
		return zoneNo;
	}

	public void setZoneNo(Integer zoneNo) {
		this.zoneNo = zoneNo;
	}

	public ClusterInputBody publicNetwork(Boolean publicNetwork) {
		this.publicNetwork = publicNetwork;
		return this;
	}

	 /**
	 * Public network
	 * @return publicNetwork
	**/
	public Boolean isPublicNetwork() {
		return publicNetwork;
	}

	public void setPublicNetwork(Boolean publicNetwork) {
		this.publicNetwork = publicNetwork;
	}

	public ClusterInputBody kubeNetworkPlugin(String kubeNetworkPlugin) {
		this.kubeNetworkPlugin = kubeNetworkPlugin;
		return this;
	}

	 /**
	 * CNI Plugin Code (ncloud-vpc-cni or cilium)
	 * @return kubeNetworkPlugin
	**/
	public String getKubeNetworkPlugin() {
		return kubeNetworkPlugin;
	}

	public void setKubeNetworkPlugin(String kubeNetworkPlugin) {
		this.kubeNetworkPlugin = kubeNetworkPlugin;
	}

	public ClusterInputBody vpcNo(Integer vpcNo) {
		this.vpcNo = vpcNo;
		return this;
	}

	 /**
	 * vpc의 No
	 * @return vpcNo
	**/
	public Integer getVpcNo() {
		return vpcNo;
	}

	public void setVpcNo(Integer vpcNo) {
		this.vpcNo = vpcNo;
	}

	public ClusterInputBody subnetNoList(List<Integer> subnetNoList) {
		this.subnetNoList = subnetNoList;
		return this;
	}

	public ClusterInputBody addSubnetNoListItem(Integer subnetNoListItem) {
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

	public ClusterInputBody subnetLbNo(Integer subnetLbNo) {
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

	public ClusterInputBody lbPublicSubnetNo(Integer lbPublicSubnetNo) {
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

	public ClusterInputBody log(ClusterLogInput log) {
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

	public ClusterInputBody defaultNodePool(DefaultNodePoolParam defaultNodePool) {
		this.defaultNodePool = defaultNodePool;
		return this;
	}

	 /**
	 * 기본 노드풀
	 * @return defaultNodePool
	**/
	public DefaultNodePoolParam getDefaultNodePool() {
		return defaultNodePool;
	}

	public void setDefaultNodePool(DefaultNodePoolParam defaultNodePool) {
		this.defaultNodePool = defaultNodePool;
	}

	public ClusterInputBody nodePool(List<NodePool> nodePool) {
		this.nodePool = nodePool;
		return this;
	}

	public ClusterInputBody addNodePoolItem(NodePool nodePoolItem) {
		if (this.nodePool == null) {
			this.nodePool = new ArrayList<NodePool>();
		}
		this.nodePool.add(nodePoolItem);
		return this;
	}

	 /**
	 * 추가 노드풀
	 * @return nodePool
	**/
	public List<NodePool> getNodePool() {
		return nodePool;
	}

	public void setNodePool(List<NodePool> nodePool) {
		this.nodePool = nodePool;
	}

	public ClusterInputBody initScriptNo(Integer initScriptNo) {
		this.initScriptNo = initScriptNo;
		return this;
	}

	 /**
	 * InitScript 번호
	 * @return initScriptNo
	**/
	public Integer getInitScriptNo() {
		return initScriptNo;
	}

	public void setInitScriptNo(Integer initScriptNo) {
		this.initScriptNo = initScriptNo;
	}

	public ClusterInputBody podSecurityPolicyEnabled(Boolean podSecurityPolicyEnabled) {
		this.podSecurityPolicyEnabled = podSecurityPolicyEnabled;
		return this;
	}

	 /**
	 * Pod Security Policy 설정 여부
	 * @return podSecurityPolicyEnabled
	**/
	public Boolean isPodSecurityPolicyEnabled() {
		return podSecurityPolicyEnabled;
	}

	public void setPodSecurityPolicyEnabled(Boolean podSecurityPolicyEnabled) {
		this.podSecurityPolicyEnabled = podSecurityPolicyEnabled;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ClusterInputBody clusterInputBody = (ClusterInputBody) o;
		return Objects.equals(this.name, clusterInputBody.name) &&
				Objects.equals(this.clusterType, clusterInputBody.clusterType) &&
				Objects.equals(this.loginKeyName, clusterInputBody.loginKeyName) &&
				Objects.equals(this.k8sVersion, clusterInputBody.k8sVersion) &&
				Objects.equals(this.regionCode, clusterInputBody.regionCode) &&
				Objects.equals(this.zoneCode, clusterInputBody.zoneCode) &&
				Objects.equals(this.zoneNo, clusterInputBody.zoneNo) &&
				Objects.equals(this.publicNetwork, clusterInputBody.publicNetwork) &&
				Objects.equals(this.kubeNetworkPlugin, clusterInputBody.kubeNetworkPlugin) &&
				Objects.equals(this.vpcNo, clusterInputBody.vpcNo) &&
				Objects.equals(this.subnetNoList, clusterInputBody.subnetNoList) &&
				Objects.equals(this.subnetLbNo, clusterInputBody.subnetLbNo) &&
				Objects.equals(this.lbPublicSubnetNo, clusterInputBody.lbPublicSubnetNo) &&
				Objects.equals(this.log, clusterInputBody.log) &&
				Objects.equals(this.defaultNodePool, clusterInputBody.defaultNodePool) &&
				Objects.equals(this.nodePool, clusterInputBody.nodePool) &&
				Objects.equals(this.initScriptNo, clusterInputBody.initScriptNo) &&
				Objects.equals(this.podSecurityPolicyEnabled, clusterInputBody.podSecurityPolicyEnabled);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, clusterType, loginKeyName, k8sVersion, regionCode, zoneCode, zoneNo, publicNetwork, kubeNetworkPlugin, vpcNo, subnetNoList, subnetLbNo, lbPublicSubnetNo, log, defaultNodePool, nodePool, initScriptNo, podSecurityPolicyEnabled);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ClusterInputBody {\n");
		
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		clusterType: ").append(toIndentedString(clusterType)).append("\n");
		sb.append("		loginKeyName: ").append(toIndentedString(loginKeyName)).append("\n");
		sb.append("		k8sVersion: ").append(toIndentedString(k8sVersion)).append("\n");
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		zoneCode: ").append(toIndentedString(zoneCode)).append("\n");
		sb.append("		zoneNo: ").append(toIndentedString(zoneNo)).append("\n");
		sb.append("		publicNetwork: ").append(toIndentedString(publicNetwork)).append("\n");
		sb.append("		kubeNetworkPlugin: ").append(toIndentedString(kubeNetworkPlugin)).append("\n");
		sb.append("		vpcNo: ").append(toIndentedString(vpcNo)).append("\n");
		sb.append("		subnetNoList: ").append(toIndentedString(subnetNoList)).append("\n");
		sb.append("		subnetLbNo: ").append(toIndentedString(subnetLbNo)).append("\n");
		sb.append("		lbPublicSubnetNo: ").append(toIndentedString(lbPublicSubnetNo)).append("\n");
		sb.append("		log: ").append(toIndentedString(log)).append("\n");
		sb.append("		defaultNodePool: ").append(toIndentedString(defaultNodePool)).append("\n");
		sb.append("		nodePool: ").append(toIndentedString(nodePool)).append("\n");
		sb.append("		initScriptNo: ").append(toIndentedString(initScriptNo)).append("\n");
		sb.append("		podSecurityPolicyEnabled: ").append(toIndentedString(podSecurityPolicyEnabled)).append("\n");
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
