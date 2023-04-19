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

/**
 * WorkerNode
 */
public class WorkerNode {
	private String id = null;

	private String name = null;

	private String serverName = null;

	private String serverSpec = null;

	private String privateIp = null;

	private String publicIp = null;

	private String returnProtectionYn = null;

	private String status = null;

	private String statusCode = null;

	private String statusIcon = null;

	private String statusColor = null;

	private String statusName = null;

	private String serverImageName = null;

	private Integer cpuCount = null;

	private Integer memorySize = null;

	private String specCode = null;

	private String loginKeyName = null;

	private String k8sStatus = null;

	private String dockerVersion = null;

	private String kernelVersion = null;

	private String nodePoolName = null;

	public WorkerNode id(String id) {
		this.id = id;
		return this;
	}

	 /**
	 * 워커노드 id
	 * @return id
	**/
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public WorkerNode name(String name) {
		this.name = name;
		return this;
	}

	 /**
	 * 워커노드 이름
	 * @return name
	**/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerNode serverName(String serverName) {
		this.serverName = serverName;
		return this;
	}

	 /**
	 * 워커노드 서버이름
	 * @return serverName
	**/
	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public WorkerNode serverSpec(String serverSpec) {
		this.serverSpec = serverSpec;
		return this;
	}

	 /**
	 * 워커노드 서버 스펙
	 * @return serverSpec
	**/
	public String getServerSpec() {
		return serverSpec;
	}

	public void setServerSpec(String serverSpec) {
		this.serverSpec = serverSpec;
	}

	public WorkerNode privateIp(String privateIp) {
		this.privateIp = privateIp;
		return this;
	}

	 /**
	 * 비 공인 IP
	 * @return privateIp
	**/
	public String getPrivateIp() {
		return privateIp;
	}

	public void setPrivateIp(String privateIp) {
		this.privateIp = privateIp;
	}

	public WorkerNode publicIp(String publicIp) {
		this.publicIp = publicIp;
		return this;
	}

	 /**
	 * 공인 IP
	 * @return publicIp
	**/
	public String getPublicIp() {
		return publicIp;
	}

	public void setPublicIp(String publicIp) {
		this.publicIp = publicIp;
	}

	public WorkerNode returnProtectionYn(String returnProtectionYn) {
		this.returnProtectionYn = returnProtectionYn;
		return this;
	}

	 /**
	 * 반납 보호 설정
	 * @return returnProtectionYn
	**/
	public String getReturnProtectionYn() {
		return returnProtectionYn;
	}

	public void setReturnProtectionYn(String returnProtectionYn) {
		this.returnProtectionYn = returnProtectionYn;
	}

	public WorkerNode status(String status) {
		this.status = status;
		return this;
	}

	 /**
	 * 워커노드 현재 상태
	 * @return status
	**/
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public WorkerNode statusCode(String statusCode) {
		this.statusCode = statusCode;
		return this;
	}

	 /**
	 * 상태 코드
	 * @return statusCode
	**/
	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public WorkerNode statusIcon(String statusIcon) {
		this.statusIcon = statusIcon;
		return this;
	}

	 /**
	 * 상태 아이콘
	 * @return statusIcon
	**/
	public String getStatusIcon() {
		return statusIcon;
	}

	public void setStatusIcon(String statusIcon) {
		this.statusIcon = statusIcon;
	}

	public WorkerNode statusColor(String statusColor) {
		this.statusColor = statusColor;
		return this;
	}

	 /**
	 * 상태 색깔
	 * @return statusColor
	**/
	public String getStatusColor() {
		return statusColor;
	}

	public void setStatusColor(String statusColor) {
		this.statusColor = statusColor;
	}

	public WorkerNode statusName(String statusName) {
		this.statusName = statusName;
		return this;
	}

	 /**
	 * 상태 이름
	 * @return statusName
	**/
	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public WorkerNode serverImageName(String serverImageName) {
		this.serverImageName = serverImageName;
		return this;
	}

	 /**
	 * 서버 이미지 이름
	 * @return serverImageName
	**/
	public String getServerImageName() {
		return serverImageName;
	}

	public void setServerImageName(String serverImageName) {
		this.serverImageName = serverImageName;
	}

	public WorkerNode cpuCount(Integer cpuCount) {
		this.cpuCount = cpuCount;
		return this;
	}

	 /**
	 * cpu 수
	 * @return cpuCount
	**/
	public Integer getCpuCount() {
		return cpuCount;
	}

	public void setCpuCount(Integer cpuCount) {
		this.cpuCount = cpuCount;
	}

	public WorkerNode memorySize(Integer memorySize) {
		this.memorySize = memorySize;
		return this;
	}

	 /**
	 * 총 메모리 용량
	 * @return memorySize
	**/
	public Integer getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(Integer memorySize) {
		this.memorySize = memorySize;
	}

	public WorkerNode specCode(String specCode) {
		this.specCode = specCode;
		return this;
	}

	 /**
	 * 스펙 코드
	 * @return specCode
	**/
	public String getSpecCode() {
		return specCode;
	}

	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

	public WorkerNode loginKeyName(String loginKeyName) {
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

	public WorkerNode k8sStatus(String k8sStatus) {
		this.k8sStatus = k8sStatus;
		return this;
	}

	 /**
	 * 쿠버네티스 상태
	 * @return k8sStatus
	**/
	public String getK8sStatus() {
		return k8sStatus;
	}

	public void setK8sStatus(String k8sStatus) {
		this.k8sStatus = k8sStatus;
	}

	public WorkerNode dockerVersion(String dockerVersion) {
		this.dockerVersion = dockerVersion;
		return this;
	}

	 /**
	 * 도커 버전
	 * @return dockerVersion
	**/
	public String getDockerVersion() {
		return dockerVersion;
	}

	public void setDockerVersion(String dockerVersion) {
		this.dockerVersion = dockerVersion;
	}

	public WorkerNode kernelVersion(String kernelVersion) {
		this.kernelVersion = kernelVersion;
		return this;
	}

	 /**
	 * 커널 버전
	 * @return kernelVersion
	**/
	public String getKernelVersion() {
		return kernelVersion;
	}

	public void setKernelVersion(String kernelVersion) {
		this.kernelVersion = kernelVersion;
	}

	public WorkerNode nodePoolName(String nodePoolName) {
		this.nodePoolName = nodePoolName;
		return this;
	}

	 /**
	 * 노드풀 이름
	 * @return nodePoolName
	**/
	public String getNodePoolName() {
		return nodePoolName;
	}

	public void setNodePoolName(String nodePoolName) {
		this.nodePoolName = nodePoolName;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WorkerNode workerNode = (WorkerNode) o;
		return Objects.equals(this.id, workerNode.id) &&
				Objects.equals(this.name, workerNode.name) &&
				Objects.equals(this.serverName, workerNode.serverName) &&
				Objects.equals(this.serverSpec, workerNode.serverSpec) &&
				Objects.equals(this.privateIp, workerNode.privateIp) &&
				Objects.equals(this.publicIp, workerNode.publicIp) &&
				Objects.equals(this.returnProtectionYn, workerNode.returnProtectionYn) &&
				Objects.equals(this.status, workerNode.status) &&
				Objects.equals(this.statusCode, workerNode.statusCode) &&
				Objects.equals(this.statusIcon, workerNode.statusIcon) &&
				Objects.equals(this.statusColor, workerNode.statusColor) &&
				Objects.equals(this.statusName, workerNode.statusName) &&
				Objects.equals(this.serverImageName, workerNode.serverImageName) &&
				Objects.equals(this.cpuCount, workerNode.cpuCount) &&
				Objects.equals(this.memorySize, workerNode.memorySize) &&
				Objects.equals(this.specCode, workerNode.specCode) &&
				Objects.equals(this.loginKeyName, workerNode.loginKeyName) &&
				Objects.equals(this.k8sStatus, workerNode.k8sStatus) &&
				Objects.equals(this.dockerVersion, workerNode.dockerVersion) &&
				Objects.equals(this.kernelVersion, workerNode.kernelVersion) &&
				Objects.equals(this.nodePoolName, workerNode.nodePoolName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, serverName, serverSpec, privateIp, publicIp, returnProtectionYn, status, statusCode, statusIcon, statusColor, statusName, serverImageName, cpuCount, memorySize, specCode, loginKeyName, k8sStatus, dockerVersion, kernelVersion, nodePoolName);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WorkerNode {\n");
		
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		serverName: ").append(toIndentedString(serverName)).append("\n");
		sb.append("		serverSpec: ").append(toIndentedString(serverSpec)).append("\n");
		sb.append("		privateIp: ").append(toIndentedString(privateIp)).append("\n");
		sb.append("		publicIp: ").append(toIndentedString(publicIp)).append("\n");
		sb.append("		returnProtectionYn: ").append(toIndentedString(returnProtectionYn)).append("\n");
		sb.append("		status: ").append(toIndentedString(status)).append("\n");
		sb.append("		statusCode: ").append(toIndentedString(statusCode)).append("\n");
		sb.append("		statusIcon: ").append(toIndentedString(statusIcon)).append("\n");
		sb.append("		statusColor: ").append(toIndentedString(statusColor)).append("\n");
		sb.append("		statusName: ").append(toIndentedString(statusName)).append("\n");
		sb.append("		serverImageName: ").append(toIndentedString(serverImageName)).append("\n");
		sb.append("		cpuCount: ").append(toIndentedString(cpuCount)).append("\n");
		sb.append("		memorySize: ").append(toIndentedString(memorySize)).append("\n");
		sb.append("		specCode: ").append(toIndentedString(specCode)).append("\n");
		sb.append("		loginKeyName: ").append(toIndentedString(loginKeyName)).append("\n");
		sb.append("		k8sStatus: ").append(toIndentedString(k8sStatus)).append("\n");
		sb.append("		dockerVersion: ").append(toIndentedString(dockerVersion)).append("\n");
		sb.append("		kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
		sb.append("		nodePoolName: ").append(toIndentedString(nodePoolName)).append("\n");
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
