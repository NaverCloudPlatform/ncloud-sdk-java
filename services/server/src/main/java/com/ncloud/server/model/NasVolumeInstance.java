/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * OpenAPI spec version: 2020-11-18T09:44:01Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.server.model;

import java.util.Objects;
import com.ncloud.server.model.CommonCode;
import com.ncloud.server.model.NasVolumeInstanceCustomIp;
import com.ncloud.server.model.Region;
import com.ncloud.server.model.ServerInstance;
import com.ncloud.server.model.Zone;
import java.util.ArrayList;
import java.util.List;

/**
 * NasVolumeInstance
 */
public class NasVolumeInstance {
	private String nasVolumeInstanceNo = null;

	private CommonCode nasVolumeInstanceStatus = null;

	private CommonCode nasVolumeInstanceOperation = null;

	private String nasVolumeInstanceStatusName = null;

	private String createDate = null;

	private String nasVolumeInstanceDescription = null;

	private String mountInformation = null;

	private CommonCode volumeAllotmentProtocolType = null;

	private String volumeName = null;

	private Long volumeTotalSize = null;

	private Long volumeSize = null;

	private Long volumeUseSize = null;

	private Float volumeUseRatio = null;

	private Float snapshotVolumeConfigurationRatio = null;

	private CommonCode snapshotVolumeConfigPeriodType = null;

	private Integer snapshotVolumeConfigTime = null;

	private Long snapshotVolumeSize = null;

	private Long snapshotVolumeUseSize = null;

	private Float snapshotVolumeUseRatio = null;

	private Boolean isSnapshotConfiguration = null;

	private Boolean isEventConfiguration = null;

	private Region region = null;

	private Zone zone = null;

	private List<NasVolumeInstanceCustomIp> nasVolumeInstanceCustomIpList = null;

	private List<ServerInstance> nasVolumeServerInstanceList = null;

	public NasVolumeInstance nasVolumeInstanceNo(String nasVolumeInstanceNo) {
		this.nasVolumeInstanceNo = nasVolumeInstanceNo;
		return this;
	}

	 /**
	 * NAS볼륨인스턴스번호
	 * @return nasVolumeInstanceNo
	**/
	public String getNasVolumeInstanceNo() {
		return nasVolumeInstanceNo;
	}

	public void setNasVolumeInstanceNo(String nasVolumeInstanceNo) {
		this.nasVolumeInstanceNo = nasVolumeInstanceNo;
	}

	public NasVolumeInstance nasVolumeInstanceStatus(CommonCode nasVolumeInstanceStatus) {
		this.nasVolumeInstanceStatus = nasVolumeInstanceStatus;
		return this;
	}

	 /**
	 * NAS볼륨인스턴스상태
	 * @return nasVolumeInstanceStatus
	**/
	public CommonCode getNasVolumeInstanceStatus() {
		return nasVolumeInstanceStatus;
	}

	public void setNasVolumeInstanceStatus(CommonCode nasVolumeInstanceStatus) {
		this.nasVolumeInstanceStatus = nasVolumeInstanceStatus;
	}

	public NasVolumeInstance nasVolumeInstanceOperation(CommonCode nasVolumeInstanceOperation) {
		this.nasVolumeInstanceOperation = nasVolumeInstanceOperation;
		return this;
	}

	 /**
	 * NAS볼륨인스턴스OP
	 * @return nasVolumeInstanceOperation
	**/
	public CommonCode getNasVolumeInstanceOperation() {
		return nasVolumeInstanceOperation;
	}

	public void setNasVolumeInstanceOperation(CommonCode nasVolumeInstanceOperation) {
		this.nasVolumeInstanceOperation = nasVolumeInstanceOperation;
	}

	public NasVolumeInstance nasVolumeInstanceStatusName(String nasVolumeInstanceStatusName) {
		this.nasVolumeInstanceStatusName = nasVolumeInstanceStatusName;
		return this;
	}

	 /**
	 * 볼륨인스턴스상태명
	 * @return nasVolumeInstanceStatusName
	**/
	public String getNasVolumeInstanceStatusName() {
		return nasVolumeInstanceStatusName;
	}

	public void setNasVolumeInstanceStatusName(String nasVolumeInstanceStatusName) {
		this.nasVolumeInstanceStatusName = nasVolumeInstanceStatusName;
	}

	public NasVolumeInstance createDate(String createDate) {
		this.createDate = createDate;
		return this;
	}

	 /**
	 * 생성일시
	 * @return createDate
	**/
	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public NasVolumeInstance nasVolumeInstanceDescription(String nasVolumeInstanceDescription) {
		this.nasVolumeInstanceDescription = nasVolumeInstanceDescription;
		return this;
	}

	 /**
	 * NAS볼륨인스턴스설명
	 * @return nasVolumeInstanceDescription
	**/
	public String getNasVolumeInstanceDescription() {
		return nasVolumeInstanceDescription;
	}

	public void setNasVolumeInstanceDescription(String nasVolumeInstanceDescription) {
		this.nasVolumeInstanceDescription = nasVolumeInstanceDescription;
	}

	public NasVolumeInstance mountInformation(String mountInformation) {
		this.mountInformation = mountInformation;
		return this;
	}

	 /**
	 * 마운트정보
	 * @return mountInformation
	**/
	public String getMountInformation() {
		return mountInformation;
	}

	public void setMountInformation(String mountInformation) {
		this.mountInformation = mountInformation;
	}

	public NasVolumeInstance volumeAllotmentProtocolType(CommonCode volumeAllotmentProtocolType) {
		this.volumeAllotmentProtocolType = volumeAllotmentProtocolType;
		return this;
	}

	 /**
	 * 볼륨할당프로토콜구분
	 * @return volumeAllotmentProtocolType
	**/
	public CommonCode getVolumeAllotmentProtocolType() {
		return volumeAllotmentProtocolType;
	}

	public void setVolumeAllotmentProtocolType(CommonCode volumeAllotmentProtocolType) {
		this.volumeAllotmentProtocolType = volumeAllotmentProtocolType;
	}

	public NasVolumeInstance volumeName(String volumeName) {
		this.volumeName = volumeName;
		return this;
	}

	 /**
	 * 볼륨명
	 * @return volumeName
	**/
	public String getVolumeName() {
		return volumeName;
	}

	public void setVolumeName(String volumeName) {
		this.volumeName = volumeName;
	}

	public NasVolumeInstance volumeTotalSize(Long volumeTotalSize) {
		this.volumeTotalSize = volumeTotalSize;
		return this;
	}

	 /**
	 * 볼륨총사이즈
	 * @return volumeTotalSize
	**/
	public Long getVolumeTotalSize() {
		return volumeTotalSize;
	}

	public void setVolumeTotalSize(Long volumeTotalSize) {
		this.volumeTotalSize = volumeTotalSize;
	}

	public NasVolumeInstance volumeSize(Long volumeSize) {
		this.volumeSize = volumeSize;
		return this;
	}

	 /**
	 * 볼륨사이즈
	 * @return volumeSize
	**/
	public Long getVolumeSize() {
		return volumeSize;
	}

	public void setVolumeSize(Long volumeSize) {
		this.volumeSize = volumeSize;
	}

	public NasVolumeInstance volumeUseSize(Long volumeUseSize) {
		this.volumeUseSize = volumeUseSize;
		return this;
	}

	 /**
	 * 볼륨사용사이즈
	 * @return volumeUseSize
	**/
	public Long getVolumeUseSize() {
		return volumeUseSize;
	}

	public void setVolumeUseSize(Long volumeUseSize) {
		this.volumeUseSize = volumeUseSize;
	}

	public NasVolumeInstance volumeUseRatio(Float volumeUseRatio) {
		this.volumeUseRatio = volumeUseRatio;
		return this;
	}

	 /**
	 * 볼륨사용비율
	 * @return volumeUseRatio
	**/
	public Float getVolumeUseRatio() {
		return volumeUseRatio;
	}

	public void setVolumeUseRatio(Float volumeUseRatio) {
		this.volumeUseRatio = volumeUseRatio;
	}

	public NasVolumeInstance snapshotVolumeConfigurationRatio(Float snapshotVolumeConfigurationRatio) {
		this.snapshotVolumeConfigurationRatio = snapshotVolumeConfigurationRatio;
		return this;
	}

	 /**
	 * 스냅샷볼륨설정비율
	 * @return snapshotVolumeConfigurationRatio
	**/
	public Float getSnapshotVolumeConfigurationRatio() {
		return snapshotVolumeConfigurationRatio;
	}

	public void setSnapshotVolumeConfigurationRatio(Float snapshotVolumeConfigurationRatio) {
		this.snapshotVolumeConfigurationRatio = snapshotVolumeConfigurationRatio;
	}

	public NasVolumeInstance snapshotVolumeConfigPeriodType(CommonCode snapshotVolumeConfigPeriodType) {
		this.snapshotVolumeConfigPeriodType = snapshotVolumeConfigPeriodType;
		return this;
	}

	 /**
	 * 스냅샷볼륨설정기간구분
	 * @return snapshotVolumeConfigPeriodType
	**/
	public CommonCode getSnapshotVolumeConfigPeriodType() {
		return snapshotVolumeConfigPeriodType;
	}

	public void setSnapshotVolumeConfigPeriodType(CommonCode snapshotVolumeConfigPeriodType) {
		this.snapshotVolumeConfigPeriodType = snapshotVolumeConfigPeriodType;
	}

	public NasVolumeInstance snapshotVolumeConfigTime(Integer snapshotVolumeConfigTime) {
		this.snapshotVolumeConfigTime = snapshotVolumeConfigTime;
		return this;
	}

	 /**
	 * 스냅샷볼륨설정시간
	 * @return snapshotVolumeConfigTime
	**/
	public Integer getSnapshotVolumeConfigTime() {
		return snapshotVolumeConfigTime;
	}

	public void setSnapshotVolumeConfigTime(Integer snapshotVolumeConfigTime) {
		this.snapshotVolumeConfigTime = snapshotVolumeConfigTime;
	}

	public NasVolumeInstance snapshotVolumeSize(Long snapshotVolumeSize) {
		this.snapshotVolumeSize = snapshotVolumeSize;
		return this;
	}

	 /**
	 * 스냅샷사이즈
	 * @return snapshotVolumeSize
	**/
	public Long getSnapshotVolumeSize() {
		return snapshotVolumeSize;
	}

	public void setSnapshotVolumeSize(Long snapshotVolumeSize) {
		this.snapshotVolumeSize = snapshotVolumeSize;
	}

	public NasVolumeInstance snapshotVolumeUseSize(Long snapshotVolumeUseSize) {
		this.snapshotVolumeUseSize = snapshotVolumeUseSize;
		return this;
	}

	 /**
	 * 스냅사용사이즈
	 * @return snapshotVolumeUseSize
	**/
	public Long getSnapshotVolumeUseSize() {
		return snapshotVolumeUseSize;
	}

	public void setSnapshotVolumeUseSize(Long snapshotVolumeUseSize) {
		this.snapshotVolumeUseSize = snapshotVolumeUseSize;
	}

	public NasVolumeInstance snapshotVolumeUseRatio(Float snapshotVolumeUseRatio) {
		this.snapshotVolumeUseRatio = snapshotVolumeUseRatio;
		return this;
	}

	 /**
	 * 스냅샷사용비율
	 * @return snapshotVolumeUseRatio
	**/
	public Float getSnapshotVolumeUseRatio() {
		return snapshotVolumeUseRatio;
	}

	public void setSnapshotVolumeUseRatio(Float snapshotVolumeUseRatio) {
		this.snapshotVolumeUseRatio = snapshotVolumeUseRatio;
	}

	public NasVolumeInstance isSnapshotConfiguration(Boolean isSnapshotConfiguration) {
		this.isSnapshotConfiguration = isSnapshotConfiguration;
		return this;
	}

	 /**
	 * 스냅샷설정여부
	 * @return isSnapshotConfiguration
	**/
	public Boolean isIsSnapshotConfiguration() {
		return isSnapshotConfiguration;
	}

	public void setIsSnapshotConfiguration(Boolean isSnapshotConfiguration) {
		this.isSnapshotConfiguration = isSnapshotConfiguration;
	}

	public NasVolumeInstance isEventConfiguration(Boolean isEventConfiguration) {
		this.isEventConfiguration = isEventConfiguration;
		return this;
	}

	 /**
	 * 이벤트설정여부
	 * @return isEventConfiguration
	**/
	public Boolean isIsEventConfiguration() {
		return isEventConfiguration;
	}

	public void setIsEventConfiguration(Boolean isEventConfiguration) {
		this.isEventConfiguration = isEventConfiguration;
	}

	public NasVolumeInstance region(Region region) {
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

	public NasVolumeInstance zone(Zone zone) {
		this.zone = zone;
		return this;
	}

	 /**
	 * ZONE
	 * @return zone
	**/
	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public NasVolumeInstance nasVolumeInstanceCustomIpList(List<NasVolumeInstanceCustomIp> nasVolumeInstanceCustomIpList) {
		this.nasVolumeInstanceCustomIpList = nasVolumeInstanceCustomIpList;
		return this;
	}

	public NasVolumeInstance addNasVolumeInstanceCustomIpListItem(NasVolumeInstanceCustomIp nasVolumeInstanceCustomIpListItem) {
		if (this.nasVolumeInstanceCustomIpList == null) {
			this.nasVolumeInstanceCustomIpList = new ArrayList<NasVolumeInstanceCustomIp>();
		}
		this.nasVolumeInstanceCustomIpList.add(nasVolumeInstanceCustomIpListItem);
		return this;
	}

	 /**
	 * NAS볼륨커스텀IP리스트
	 * @return nasVolumeInstanceCustomIpList
	**/
	public List<NasVolumeInstanceCustomIp> getNasVolumeInstanceCustomIpList() {
		return nasVolumeInstanceCustomIpList;
	}

	public void setNasVolumeInstanceCustomIpList(List<NasVolumeInstanceCustomIp> nasVolumeInstanceCustomIpList) {
		this.nasVolumeInstanceCustomIpList = nasVolumeInstanceCustomIpList;
	}

	public NasVolumeInstance nasVolumeServerInstanceList(List<ServerInstance> nasVolumeServerInstanceList) {
		this.nasVolumeServerInstanceList = nasVolumeServerInstanceList;
		return this;
	}

	public NasVolumeInstance addNasVolumeServerInstanceListItem(ServerInstance nasVolumeServerInstanceListItem) {
		if (this.nasVolumeServerInstanceList == null) {
			this.nasVolumeServerInstanceList = new ArrayList<ServerInstance>();
		}
		this.nasVolumeServerInstanceList.add(nasVolumeServerInstanceListItem);
		return this;
	}

	 /**
	 * NAS볼륨서버인스턴스리스트
	 * @return nasVolumeServerInstanceList
	**/
	public List<ServerInstance> getNasVolumeServerInstanceList() {
		return nasVolumeServerInstanceList;
	}

	public void setNasVolumeServerInstanceList(List<ServerInstance> nasVolumeServerInstanceList) {
		this.nasVolumeServerInstanceList = nasVolumeServerInstanceList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		NasVolumeInstance nasVolumeInstance = (NasVolumeInstance) o;
		return Objects.equals(this.nasVolumeInstanceNo, nasVolumeInstance.nasVolumeInstanceNo) &&
				Objects.equals(this.nasVolumeInstanceStatus, nasVolumeInstance.nasVolumeInstanceStatus) &&
				Objects.equals(this.nasVolumeInstanceOperation, nasVolumeInstance.nasVolumeInstanceOperation) &&
				Objects.equals(this.nasVolumeInstanceStatusName, nasVolumeInstance.nasVolumeInstanceStatusName) &&
				Objects.equals(this.createDate, nasVolumeInstance.createDate) &&
				Objects.equals(this.nasVolumeInstanceDescription, nasVolumeInstance.nasVolumeInstanceDescription) &&
				Objects.equals(this.mountInformation, nasVolumeInstance.mountInformation) &&
				Objects.equals(this.volumeAllotmentProtocolType, nasVolumeInstance.volumeAllotmentProtocolType) &&
				Objects.equals(this.volumeName, nasVolumeInstance.volumeName) &&
				Objects.equals(this.volumeTotalSize, nasVolumeInstance.volumeTotalSize) &&
				Objects.equals(this.volumeSize, nasVolumeInstance.volumeSize) &&
				Objects.equals(this.volumeUseSize, nasVolumeInstance.volumeUseSize) &&
				Objects.equals(this.volumeUseRatio, nasVolumeInstance.volumeUseRatio) &&
				Objects.equals(this.snapshotVolumeConfigurationRatio, nasVolumeInstance.snapshotVolumeConfigurationRatio) &&
				Objects.equals(this.snapshotVolumeConfigPeriodType, nasVolumeInstance.snapshotVolumeConfigPeriodType) &&
				Objects.equals(this.snapshotVolumeConfigTime, nasVolumeInstance.snapshotVolumeConfigTime) &&
				Objects.equals(this.snapshotVolumeSize, nasVolumeInstance.snapshotVolumeSize) &&
				Objects.equals(this.snapshotVolumeUseSize, nasVolumeInstance.snapshotVolumeUseSize) &&
				Objects.equals(this.snapshotVolumeUseRatio, nasVolumeInstance.snapshotVolumeUseRatio) &&
				Objects.equals(this.isSnapshotConfiguration, nasVolumeInstance.isSnapshotConfiguration) &&
				Objects.equals(this.isEventConfiguration, nasVolumeInstance.isEventConfiguration) &&
				Objects.equals(this.region, nasVolumeInstance.region) &&
				Objects.equals(this.zone, nasVolumeInstance.zone) &&
				Objects.equals(this.nasVolumeInstanceCustomIpList, nasVolumeInstance.nasVolumeInstanceCustomIpList) &&
				Objects.equals(this.nasVolumeServerInstanceList, nasVolumeInstance.nasVolumeServerInstanceList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nasVolumeInstanceNo, nasVolumeInstanceStatus, nasVolumeInstanceOperation, nasVolumeInstanceStatusName, createDate, nasVolumeInstanceDescription, mountInformation, volumeAllotmentProtocolType, volumeName, volumeTotalSize, volumeSize, volumeUseSize, volumeUseRatio, snapshotVolumeConfigurationRatio, snapshotVolumeConfigPeriodType, snapshotVolumeConfigTime, snapshotVolumeSize, snapshotVolumeUseSize, snapshotVolumeUseRatio, isSnapshotConfiguration, isEventConfiguration, region, zone, nasVolumeInstanceCustomIpList, nasVolumeServerInstanceList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NasVolumeInstance {\n");
		
		sb.append("		nasVolumeInstanceNo: ").append(toIndentedString(nasVolumeInstanceNo)).append("\n");
		sb.append("		nasVolumeInstanceStatus: ").append(toIndentedString(nasVolumeInstanceStatus)).append("\n");
		sb.append("		nasVolumeInstanceOperation: ").append(toIndentedString(nasVolumeInstanceOperation)).append("\n");
		sb.append("		nasVolumeInstanceStatusName: ").append(toIndentedString(nasVolumeInstanceStatusName)).append("\n");
		sb.append("		createDate: ").append(toIndentedString(createDate)).append("\n");
		sb.append("		nasVolumeInstanceDescription: ").append(toIndentedString(nasVolumeInstanceDescription)).append("\n");
		sb.append("		mountInformation: ").append(toIndentedString(mountInformation)).append("\n");
		sb.append("		volumeAllotmentProtocolType: ").append(toIndentedString(volumeAllotmentProtocolType)).append("\n");
		sb.append("		volumeName: ").append(toIndentedString(volumeName)).append("\n");
		sb.append("		volumeTotalSize: ").append(toIndentedString(volumeTotalSize)).append("\n");
		sb.append("		volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
		sb.append("		volumeUseSize: ").append(toIndentedString(volumeUseSize)).append("\n");
		sb.append("		volumeUseRatio: ").append(toIndentedString(volumeUseRatio)).append("\n");
		sb.append("		snapshotVolumeConfigurationRatio: ").append(toIndentedString(snapshotVolumeConfigurationRatio)).append("\n");
		sb.append("		snapshotVolumeConfigPeriodType: ").append(toIndentedString(snapshotVolumeConfigPeriodType)).append("\n");
		sb.append("		snapshotVolumeConfigTime: ").append(toIndentedString(snapshotVolumeConfigTime)).append("\n");
		sb.append("		snapshotVolumeSize: ").append(toIndentedString(snapshotVolumeSize)).append("\n");
		sb.append("		snapshotVolumeUseSize: ").append(toIndentedString(snapshotVolumeUseSize)).append("\n");
		sb.append("		snapshotVolumeUseRatio: ").append(toIndentedString(snapshotVolumeUseRatio)).append("\n");
		sb.append("		isSnapshotConfiguration: ").append(toIndentedString(isSnapshotConfiguration)).append("\n");
		sb.append("		isEventConfiguration: ").append(toIndentedString(isEventConfiguration)).append("\n");
		sb.append("		region: ").append(toIndentedString(region)).append("\n");
		sb.append("		zone: ").append(toIndentedString(zone)).append("\n");
		sb.append("		nasVolumeInstanceCustomIpList: ").append(toIndentedString(nasVolumeInstanceCustomIpList)).append("\n");
		sb.append("		nasVolumeServerInstanceList: ").append(toIndentedString(nasVolumeServerInstanceList)).append("\n");
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

