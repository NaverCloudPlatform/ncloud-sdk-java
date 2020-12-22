/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.server.model;

import java.util.Objects;
import com.ncloud.server.model.AccessControlGroup;
import com.ncloud.server.model.CommonCode;
import com.ncloud.server.model.InstanceTag;
import com.ncloud.server.model.Region;
import com.ncloud.server.model.Zone;
import java.util.ArrayList;
import java.util.List;

/**
 * ServerInstance
 */
public class ServerInstance {
	private String serverInstanceNo = null;

	private String serverName = null;

	private String serverDescription = null;

	private Integer cpuCount = null;

	private Long memorySize = null;

	private Long baseBlockStorageSize = null;

	private CommonCode platformType = null;

	private String loginKeyName = null;

	private Boolean isFeeChargingMonitoring = null;

	private String publicIp = null;

	private String privateIp = null;

	private String serverImageName = null;

	private CommonCode serverInstanceStatus = null;

	private CommonCode serverInstanceOperation = null;

	private String serverInstanceStatusName = null;

	private String createDate = null;

	private String uptime = null;

	private String serverImageProductCode = null;

	private String serverProductCode = null;

	private Boolean isProtectServerTermination = null;

	private String portForwardingPublicIp = null;

	private Integer portForwardingExternalPort = null;

	private Integer portForwardingInternalPort = null;

	private Zone zone = null;

	private Region region = null;

	private CommonCode baseBlockStorageDiskType = null;

	private CommonCode baseBlockStorageDiskDetailType = null;

	private CommonCode internetLineType = null;

	private CommonCode serverInstanceType = null;

	private String userData = null;

	private List<AccessControlGroup> accessControlGroupList = null;

	private List<InstanceTag> instanceTagList = null;

	public ServerInstance serverInstanceNo(String serverInstanceNo) {
		this.serverInstanceNo = serverInstanceNo;
		return this;
	}

	 /**
	 * 서버인스턴스번호
	 * @return serverInstanceNo
	**/
	public String getServerInstanceNo() {
		return serverInstanceNo;
	}

	public void setServerInstanceNo(String serverInstanceNo) {
		this.serverInstanceNo = serverInstanceNo;
	}

	public ServerInstance serverName(String serverName) {
		this.serverName = serverName;
		return this;
	}

	 /**
	 * 서버명
	 * @return serverName
	**/
	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public ServerInstance serverDescription(String serverDescription) {
		this.serverDescription = serverDescription;
		return this;
	}

	 /**
	 * 서버설명
	 * @return serverDescription
	**/
	public String getServerDescription() {
		return serverDescription;
	}

	public void setServerDescription(String serverDescription) {
		this.serverDescription = serverDescription;
	}

	public ServerInstance cpuCount(Integer cpuCount) {
		this.cpuCount = cpuCount;
		return this;
	}

	 /**
	 * CPU수
	 * @return cpuCount
	**/
	public Integer getCpuCount() {
		return cpuCount;
	}

	public void setCpuCount(Integer cpuCount) {
		this.cpuCount = cpuCount;
	}

	public ServerInstance memorySize(Long memorySize) {
		this.memorySize = memorySize;
		return this;
	}

	 /**
	 * 메모리사이즈
	 * @return memorySize
	**/
	public Long getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(Long memorySize) {
		this.memorySize = memorySize;
	}

	public ServerInstance baseBlockStorageSize(Long baseBlockStorageSize) {
		this.baseBlockStorageSize = baseBlockStorageSize;
		return this;
	}

	 /**
	 * 기본블럭스토리지사이즈
	 * @return baseBlockStorageSize
	**/
	public Long getBaseBlockStorageSize() {
		return baseBlockStorageSize;
	}

	public void setBaseBlockStorageSize(Long baseBlockStorageSize) {
		this.baseBlockStorageSize = baseBlockStorageSize;
	}

	public ServerInstance platformType(CommonCode platformType) {
		this.platformType = platformType;
		return this;
	}

	 /**
	 * 플랫폼구분
	 * @return platformType
	**/
	public CommonCode getPlatformType() {
		return platformType;
	}

	public void setPlatformType(CommonCode platformType) {
		this.platformType = platformType;
	}

	public ServerInstance loginKeyName(String loginKeyName) {
		this.loginKeyName = loginKeyName;
		return this;
	}

	 /**
	 * 로그인키명
	 * @return loginKeyName
	**/
	public String getLoginKeyName() {
		return loginKeyName;
	}

	public void setLoginKeyName(String loginKeyName) {
		this.loginKeyName = loginKeyName;
	}

	public ServerInstance isFeeChargingMonitoring(Boolean isFeeChargingMonitoring) {
		this.isFeeChargingMonitoring = isFeeChargingMonitoring;
		return this;
	}

	 /**
	 * 유료모니터링여부
	 * @return isFeeChargingMonitoring
	**/
	public Boolean isIsFeeChargingMonitoring() {
		return isFeeChargingMonitoring;
	}

	public void setIsFeeChargingMonitoring(Boolean isFeeChargingMonitoring) {
		this.isFeeChargingMonitoring = isFeeChargingMonitoring;
	}

	public ServerInstance publicIp(String publicIp) {
		this.publicIp = publicIp;
		return this;
	}

	 /**
	 * 공인IP
	 * @return publicIp
	**/
	public String getPublicIp() {
		return publicIp;
	}

	public void setPublicIp(String publicIp) {
		this.publicIp = publicIp;
	}

	public ServerInstance privateIp(String privateIp) {
		this.privateIp = privateIp;
		return this;
	}

	 /**
	 * 사설IP
	 * @return privateIp
	**/
	public String getPrivateIp() {
		return privateIp;
	}

	public void setPrivateIp(String privateIp) {
		this.privateIp = privateIp;
	}

	public ServerInstance serverImageName(String serverImageName) {
		this.serverImageName = serverImageName;
		return this;
	}

	 /**
	 * 서버이미지명
	 * @return serverImageName
	**/
	public String getServerImageName() {
		return serverImageName;
	}

	public void setServerImageName(String serverImageName) {
		this.serverImageName = serverImageName;
	}

	public ServerInstance serverInstanceStatus(CommonCode serverInstanceStatus) {
		this.serverInstanceStatus = serverInstanceStatus;
		return this;
	}

	 /**
	 * 서버인스턴스상태
	 * @return serverInstanceStatus
	**/
	public CommonCode getServerInstanceStatus() {
		return serverInstanceStatus;
	}

	public void setServerInstanceStatus(CommonCode serverInstanceStatus) {
		this.serverInstanceStatus = serverInstanceStatus;
	}

	public ServerInstance serverInstanceOperation(CommonCode serverInstanceOperation) {
		this.serverInstanceOperation = serverInstanceOperation;
		return this;
	}

	 /**
	 * 서버인스턴스OP
	 * @return serverInstanceOperation
	**/
	public CommonCode getServerInstanceOperation() {
		return serverInstanceOperation;
	}

	public void setServerInstanceOperation(CommonCode serverInstanceOperation) {
		this.serverInstanceOperation = serverInstanceOperation;
	}

	public ServerInstance serverInstanceStatusName(String serverInstanceStatusName) {
		this.serverInstanceStatusName = serverInstanceStatusName;
		return this;
	}

	 /**
	 * 서버인스턴스상태명
	 * @return serverInstanceStatusName
	**/
	public String getServerInstanceStatusName() {
		return serverInstanceStatusName;
	}

	public void setServerInstanceStatusName(String serverInstanceStatusName) {
		this.serverInstanceStatusName = serverInstanceStatusName;
	}

	public ServerInstance createDate(String createDate) {
		this.createDate = createDate;
		return this;
	}

	 /**
	 * 생성일자
	 * @return createDate
	**/
	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public ServerInstance uptime(String uptime) {
		this.uptime = uptime;
		return this;
	}

	 /**
	 * UPTIME
	 * @return uptime
	**/
	public String getUptime() {
		return uptime;
	}

	public void setUptime(String uptime) {
		this.uptime = uptime;
	}

	public ServerInstance serverImageProductCode(String serverImageProductCode) {
		this.serverImageProductCode = serverImageProductCode;
		return this;
	}

	 /**
	 * 서버이미지상품코드
	 * @return serverImageProductCode
	**/
	public String getServerImageProductCode() {
		return serverImageProductCode;
	}

	public void setServerImageProductCode(String serverImageProductCode) {
		this.serverImageProductCode = serverImageProductCode;
	}

	public ServerInstance serverProductCode(String serverProductCode) {
		this.serverProductCode = serverProductCode;
		return this;
	}

	 /**
	 * 서버상품코드
	 * @return serverProductCode
	**/
	public String getServerProductCode() {
		return serverProductCode;
	}

	public void setServerProductCode(String serverProductCode) {
		this.serverProductCode = serverProductCode;
	}

	public ServerInstance isProtectServerTermination(Boolean isProtectServerTermination) {
		this.isProtectServerTermination = isProtectServerTermination;
		return this;
	}

	 /**
	 * 반납보호여부
	 * @return isProtectServerTermination
	**/
	public Boolean isIsProtectServerTermination() {
		return isProtectServerTermination;
	}

	public void setIsProtectServerTermination(Boolean isProtectServerTermination) {
		this.isProtectServerTermination = isProtectServerTermination;
	}

	public ServerInstance portForwardingPublicIp(String portForwardingPublicIp) {
		this.portForwardingPublicIp = portForwardingPublicIp;
		return this;
	}

	 /**
	 * portForwarding 공인 Ip
	 * @return portForwardingPublicIp
	**/
	public String getPortForwardingPublicIp() {
		return portForwardingPublicIp;
	}

	public void setPortForwardingPublicIp(String portForwardingPublicIp) {
		this.portForwardingPublicIp = portForwardingPublicIp;
	}

	public ServerInstance portForwardingExternalPort(Integer portForwardingExternalPort) {
		this.portForwardingExternalPort = portForwardingExternalPort;
		return this;
	}

	 /**
	 * portForwarding 외부 포트
	 * @return portForwardingExternalPort
	**/
	public Integer getPortForwardingExternalPort() {
		return portForwardingExternalPort;
	}

	public void setPortForwardingExternalPort(Integer portForwardingExternalPort) {
		this.portForwardingExternalPort = portForwardingExternalPort;
	}

	public ServerInstance portForwardingInternalPort(Integer portForwardingInternalPort) {
		this.portForwardingInternalPort = portForwardingInternalPort;
		return this;
	}

	 /**
	 * portForwarding 내부 포트
	 * @return portForwardingInternalPort
	**/
	public Integer getPortForwardingInternalPort() {
		return portForwardingInternalPort;
	}

	public void setPortForwardingInternalPort(Integer portForwardingInternalPort) {
		this.portForwardingInternalPort = portForwardingInternalPort;
	}

	public ServerInstance zone(Zone zone) {
		this.zone = zone;
		return this;
	}

	 /**
	 * Zone
	 * @return zone
	**/
	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public ServerInstance region(Region region) {
		this.region = region;
		return this;
	}

	 /**
	 * 리전
	 * @return region
	**/
	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public ServerInstance baseBlockStorageDiskType(CommonCode baseBlockStorageDiskType) {
		this.baseBlockStorageDiskType = baseBlockStorageDiskType;
		return this;
	}

	 /**
	 * 기본블록스토리지디스크유형
	 * @return baseBlockStorageDiskType
	**/
	public CommonCode getBaseBlockStorageDiskType() {
		return baseBlockStorageDiskType;
	}

	public void setBaseBlockStorageDiskType(CommonCode baseBlockStorageDiskType) {
		this.baseBlockStorageDiskType = baseBlockStorageDiskType;
	}

	public ServerInstance baseBlockStorageDiskDetailType(CommonCode baseBlockStorageDiskDetailType) {
		this.baseBlockStorageDiskDetailType = baseBlockStorageDiskDetailType;
		return this;
	}

	 /**
	 * 기본블록스토리지디스크상세유형
	 * @return baseBlockStorageDiskDetailType
	**/
	public CommonCode getBaseBlockStorageDiskDetailType() {
		return baseBlockStorageDiskDetailType;
	}

	public void setBaseBlockStorageDiskDetailType(CommonCode baseBlockStorageDiskDetailType) {
		this.baseBlockStorageDiskDetailType = baseBlockStorageDiskDetailType;
	}

	public ServerInstance internetLineType(CommonCode internetLineType) {
		this.internetLineType = internetLineType;
		return this;
	}

	 /**
	 * 인터넷라인구분
	 * @return internetLineType
	**/
	public CommonCode getInternetLineType() {
		return internetLineType;
	}

	public void setInternetLineType(CommonCode internetLineType) {
		this.internetLineType = internetLineType;
	}

	public ServerInstance serverInstanceType(CommonCode serverInstanceType) {
		this.serverInstanceType = serverInstanceType;
		return this;
	}

	 /**
	 * 서버인스턴스구분
	 * @return serverInstanceType
	**/
	public CommonCode getServerInstanceType() {
		return serverInstanceType;
	}

	public void setServerInstanceType(CommonCode serverInstanceType) {
		this.serverInstanceType = serverInstanceType;
	}

	public ServerInstance userData(String userData) {
		this.userData = userData;
		return this;
	}

	 /**
	 * 사용자데이타
	 * @return userData
	**/
	public String getUserData() {
		return userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
	}

	public ServerInstance accessControlGroupList(List<AccessControlGroup> accessControlGroupList) {
		this.accessControlGroupList = accessControlGroupList;
		return this;
	}

	public ServerInstance addAccessControlGroupListItem(AccessControlGroup accessControlGroupListItem) {
		if (this.accessControlGroupList == null) {
			this.accessControlGroupList = new ArrayList<AccessControlGroup>();
		}
		this.accessControlGroupList.add(accessControlGroupListItem);
		return this;
	}

	 /**
	 * ACG리스트
	 * @return accessControlGroupList
	**/
	public List<AccessControlGroup> getAccessControlGroupList() {
		return accessControlGroupList;
	}

	public void setAccessControlGroupList(List<AccessControlGroup> accessControlGroupList) {
		this.accessControlGroupList = accessControlGroupList;
	}

	public ServerInstance instanceTagList(List<InstanceTag> instanceTagList) {
		this.instanceTagList = instanceTagList;
		return this;
	}

	public ServerInstance addInstanceTagListItem(InstanceTag instanceTagListItem) {
		if (this.instanceTagList == null) {
			this.instanceTagList = new ArrayList<InstanceTag>();
		}
		this.instanceTagList.add(instanceTagListItem);
		return this;
	}

	 /**
	 * 인스턴스태그리스트
	 * @return instanceTagList
	**/
	public List<InstanceTag> getInstanceTagList() {
		return instanceTagList;
	}

	public void setInstanceTagList(List<InstanceTag> instanceTagList) {
		this.instanceTagList = instanceTagList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ServerInstance serverInstance = (ServerInstance) o;
		return Objects.equals(this.serverInstanceNo, serverInstance.serverInstanceNo) &&
				Objects.equals(this.serverName, serverInstance.serverName) &&
				Objects.equals(this.serverDescription, serverInstance.serverDescription) &&
				Objects.equals(this.cpuCount, serverInstance.cpuCount) &&
				Objects.equals(this.memorySize, serverInstance.memorySize) &&
				Objects.equals(this.baseBlockStorageSize, serverInstance.baseBlockStorageSize) &&
				Objects.equals(this.platformType, serverInstance.platformType) &&
				Objects.equals(this.loginKeyName, serverInstance.loginKeyName) &&
				Objects.equals(this.isFeeChargingMonitoring, serverInstance.isFeeChargingMonitoring) &&
				Objects.equals(this.publicIp, serverInstance.publicIp) &&
				Objects.equals(this.privateIp, serverInstance.privateIp) &&
				Objects.equals(this.serverImageName, serverInstance.serverImageName) &&
				Objects.equals(this.serverInstanceStatus, serverInstance.serverInstanceStatus) &&
				Objects.equals(this.serverInstanceOperation, serverInstance.serverInstanceOperation) &&
				Objects.equals(this.serverInstanceStatusName, serverInstance.serverInstanceStatusName) &&
				Objects.equals(this.createDate, serverInstance.createDate) &&
				Objects.equals(this.uptime, serverInstance.uptime) &&
				Objects.equals(this.serverImageProductCode, serverInstance.serverImageProductCode) &&
				Objects.equals(this.serverProductCode, serverInstance.serverProductCode) &&
				Objects.equals(this.isProtectServerTermination, serverInstance.isProtectServerTermination) &&
				Objects.equals(this.portForwardingPublicIp, serverInstance.portForwardingPublicIp) &&
				Objects.equals(this.portForwardingExternalPort, serverInstance.portForwardingExternalPort) &&
				Objects.equals(this.portForwardingInternalPort, serverInstance.portForwardingInternalPort) &&
				Objects.equals(this.zone, serverInstance.zone) &&
				Objects.equals(this.region, serverInstance.region) &&
				Objects.equals(this.baseBlockStorageDiskType, serverInstance.baseBlockStorageDiskType) &&
				Objects.equals(this.baseBlockStorageDiskDetailType, serverInstance.baseBlockStorageDiskDetailType) &&
				Objects.equals(this.internetLineType, serverInstance.internetLineType) &&
				Objects.equals(this.serverInstanceType, serverInstance.serverInstanceType) &&
				Objects.equals(this.userData, serverInstance.userData) &&
				Objects.equals(this.accessControlGroupList, serverInstance.accessControlGroupList) &&
				Objects.equals(this.instanceTagList, serverInstance.instanceTagList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(serverInstanceNo, serverName, serverDescription, cpuCount, memorySize, baseBlockStorageSize, platformType, loginKeyName, isFeeChargingMonitoring, publicIp, privateIp, serverImageName, serverInstanceStatus, serverInstanceOperation, serverInstanceStatusName, createDate, uptime, serverImageProductCode, serverProductCode, isProtectServerTermination, portForwardingPublicIp, portForwardingExternalPort, portForwardingInternalPort, zone, region, baseBlockStorageDiskType, baseBlockStorageDiskDetailType, internetLineType, serverInstanceType, userData, accessControlGroupList, instanceTagList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ServerInstance {\n");
		
		sb.append("		serverInstanceNo: ").append(toIndentedString(serverInstanceNo)).append("\n");
		sb.append("		serverName: ").append(toIndentedString(serverName)).append("\n");
		sb.append("		serverDescription: ").append(toIndentedString(serverDescription)).append("\n");
		sb.append("		cpuCount: ").append(toIndentedString(cpuCount)).append("\n");
		sb.append("		memorySize: ").append(toIndentedString(memorySize)).append("\n");
		sb.append("		baseBlockStorageSize: ").append(toIndentedString(baseBlockStorageSize)).append("\n");
		sb.append("		platformType: ").append(toIndentedString(platformType)).append("\n");
		sb.append("		loginKeyName: ").append(toIndentedString(loginKeyName)).append("\n");
		sb.append("		isFeeChargingMonitoring: ").append(toIndentedString(isFeeChargingMonitoring)).append("\n");
		sb.append("		publicIp: ").append(toIndentedString(publicIp)).append("\n");
		sb.append("		privateIp: ").append(toIndentedString(privateIp)).append("\n");
		sb.append("		serverImageName: ").append(toIndentedString(serverImageName)).append("\n");
		sb.append("		serverInstanceStatus: ").append(toIndentedString(serverInstanceStatus)).append("\n");
		sb.append("		serverInstanceOperation: ").append(toIndentedString(serverInstanceOperation)).append("\n");
		sb.append("		serverInstanceStatusName: ").append(toIndentedString(serverInstanceStatusName)).append("\n");
		sb.append("		createDate: ").append(toIndentedString(createDate)).append("\n");
		sb.append("		uptime: ").append(toIndentedString(uptime)).append("\n");
		sb.append("		serverImageProductCode: ").append(toIndentedString(serverImageProductCode)).append("\n");
		sb.append("		serverProductCode: ").append(toIndentedString(serverProductCode)).append("\n");
		sb.append("		isProtectServerTermination: ").append(toIndentedString(isProtectServerTermination)).append("\n");
		sb.append("		portForwardingPublicIp: ").append(toIndentedString(portForwardingPublicIp)).append("\n");
		sb.append("		portForwardingExternalPort: ").append(toIndentedString(portForwardingExternalPort)).append("\n");
		sb.append("		portForwardingInternalPort: ").append(toIndentedString(portForwardingInternalPort)).append("\n");
		sb.append("		zone: ").append(toIndentedString(zone)).append("\n");
		sb.append("		region: ").append(toIndentedString(region)).append("\n");
		sb.append("		baseBlockStorageDiskType: ").append(toIndentedString(baseBlockStorageDiskType)).append("\n");
		sb.append("		baseBlockStorageDiskDetailType: ").append(toIndentedString(baseBlockStorageDiskDetailType)).append("\n");
		sb.append("		internetLineType: ").append(toIndentedString(internetLineType)).append("\n");
		sb.append("		serverInstanceType: ").append(toIndentedString(serverInstanceType)).append("\n");
		sb.append("		userData: ").append(toIndentedString(userData)).append("\n");
		sb.append("		accessControlGroupList: ").append(toIndentedString(accessControlGroupList)).append("\n");
		sb.append("		instanceTagList: ").append(toIndentedString(instanceTagList)).append("\n");
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

