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
import com.ncloud.server.model.AccessControlRuleParameter;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateNasVolumeInstanceRequest
 */
public class CreateNasVolumeInstanceRequest {
	private String volumeName = null;

	private Integer volumeSize = null;

	private String volumeAllotmentProtocolTypeCode = null;

	private List<AccessControlRuleParameter> accessControlRuleList = null;

	private String cifsUserName = null;

	private String cifsUserPassword = null;

	private String nasVolumeDescription = null;

	private String regionNo = null;

	private String zoneNo = null;

	private Boolean isReturnProtection = null;

	private Boolean isAsync = null;

	private String responseFormatType = null;

	public CreateNasVolumeInstanceRequest volumeName(String volumeName) {
		this.volumeName = volumeName;
		return this;
	}

	 /**
	 * 볼륨이름
	 * @return volumeName
	**/
	public String getVolumeName() {
		return volumeName;
	}

	public void setVolumeName(String volumeName) {
		this.volumeName = volumeName;
	}

	public CreateNasVolumeInstanceRequest volumeSize(Integer volumeSize) {
		this.volumeSize = volumeSize;
		return this;
	}

	 /**
	 * NAS볼륨사이즈
	 * @return volumeSize
	**/
	public Integer getVolumeSize() {
		return volumeSize;
	}

	public void setVolumeSize(Integer volumeSize) {
		this.volumeSize = volumeSize;
	}

	public CreateNasVolumeInstanceRequest volumeAllotmentProtocolTypeCode(String volumeAllotmentProtocolTypeCode) {
		this.volumeAllotmentProtocolTypeCode = volumeAllotmentProtocolTypeCode;
		return this;
	}

	 /**
	 * 볼륨할당프로토콜유형코드
	 * @return volumeAllotmentProtocolTypeCode
	**/
	public String getVolumeAllotmentProtocolTypeCode() {
		return volumeAllotmentProtocolTypeCode;
	}

	public void setVolumeAllotmentProtocolTypeCode(String volumeAllotmentProtocolTypeCode) {
		this.volumeAllotmentProtocolTypeCode = volumeAllotmentProtocolTypeCode;
	}

	public CreateNasVolumeInstanceRequest accessControlRuleList(List<AccessControlRuleParameter> accessControlRuleList) {
		this.accessControlRuleList = accessControlRuleList;
		return this;
	}

	public CreateNasVolumeInstanceRequest addAccessControlRuleListItem(AccessControlRuleParameter accessControlRuleListItem) {
		if (this.accessControlRuleList == null) {
			this.accessControlRuleList = new ArrayList<AccessControlRuleParameter>();
		}
		this.accessControlRuleList.add(accessControlRuleListItem);
		return this;
	}

	 /**
	 * 접근제어Rule리스트
	 * @return accessControlRuleList
	**/
	public List<AccessControlRuleParameter> getAccessControlRuleList() {
		return accessControlRuleList;
	}

	public void setAccessControlRuleList(List<AccessControlRuleParameter> accessControlRuleList) {
		this.accessControlRuleList = accessControlRuleList;
	}

	public CreateNasVolumeInstanceRequest cifsUserName(String cifsUserName) {
		this.cifsUserName = cifsUserName;
		return this;
	}

	 /**
	 * CIFS유저이름
	 * @return cifsUserName
	**/
	public String getCifsUserName() {
		return cifsUserName;
	}

	public void setCifsUserName(String cifsUserName) {
		this.cifsUserName = cifsUserName;
	}

	public CreateNasVolumeInstanceRequest cifsUserPassword(String cifsUserPassword) {
		this.cifsUserPassword = cifsUserPassword;
		return this;
	}

	 /**
	 * CIFS유저비밀번호
	 * @return cifsUserPassword
	**/
	public String getCifsUserPassword() {
		return cifsUserPassword;
	}

	public void setCifsUserPassword(String cifsUserPassword) {
		this.cifsUserPassword = cifsUserPassword;
	}

	public CreateNasVolumeInstanceRequest nasVolumeDescription(String nasVolumeDescription) {
		this.nasVolumeDescription = nasVolumeDescription;
		return this;
	}

	 /**
	 * NAS볼륨설명
	 * @return nasVolumeDescription
	**/
	public String getNasVolumeDescription() {
		return nasVolumeDescription;
	}

	public void setNasVolumeDescription(String nasVolumeDescription) {
		this.nasVolumeDescription = nasVolumeDescription;
	}

	public CreateNasVolumeInstanceRequest regionNo(String regionNo) {
		this.regionNo = regionNo;
		return this;
	}

	 /**
	 * 리전번호
	 * @return regionNo
	**/
	public String getRegionNo() {
		return regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
	}

	public CreateNasVolumeInstanceRequest zoneNo(String zoneNo) {
		this.zoneNo = zoneNo;
		return this;
	}

	 /**
	 * ZONE번호
	 * @return zoneNo
	**/
	public String getZoneNo() {
		return zoneNo;
	}

	public void setZoneNo(String zoneNo) {
		this.zoneNo = zoneNo;
	}

	public CreateNasVolumeInstanceRequest isReturnProtection(Boolean isReturnProtection) {
		this.isReturnProtection = isReturnProtection;
		return this;
	}

	 /**
	 * 반납보호여부
	 * @return isReturnProtection
	**/
	public Boolean isIsReturnProtection() {
		return isReturnProtection;
	}

	public void setIsReturnProtection(Boolean isReturnProtection) {
		this.isReturnProtection = isReturnProtection;
	}

	public CreateNasVolumeInstanceRequest isAsync(Boolean isAsync) {
		this.isAsync = isAsync;
		return this;
	}

	 /**
	 * Async여부
	 * @return isAsync
	**/
	public Boolean isIsAsync() {
		return isAsync;
	}

	public void setIsAsync(Boolean isAsync) {
		this.isAsync = isAsync;
	}

	public CreateNasVolumeInstanceRequest responseFormatType(String responseFormatType) {
		this.responseFormatType = responseFormatType;
		return this;
	}

	 /**
	 * responseFormatType {json, xml}
	 * @return responseFormatType
	**/
	public String getResponseFormatType() {
		return responseFormatType;
	}

	public void setResponseFormatType(String responseFormatType) {
		this.responseFormatType = responseFormatType;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CreateNasVolumeInstanceRequest createNasVolumeInstanceRequest = (CreateNasVolumeInstanceRequest) o;
		return Objects.equals(this.volumeName, createNasVolumeInstanceRequest.volumeName) &&
				Objects.equals(this.volumeSize, createNasVolumeInstanceRequest.volumeSize) &&
				Objects.equals(this.volumeAllotmentProtocolTypeCode, createNasVolumeInstanceRequest.volumeAllotmentProtocolTypeCode) &&
				Objects.equals(this.accessControlRuleList, createNasVolumeInstanceRequest.accessControlRuleList) &&
				Objects.equals(this.cifsUserName, createNasVolumeInstanceRequest.cifsUserName) &&
				Objects.equals(this.cifsUserPassword, createNasVolumeInstanceRequest.cifsUserPassword) &&
				Objects.equals(this.nasVolumeDescription, createNasVolumeInstanceRequest.nasVolumeDescription) &&
				Objects.equals(this.regionNo, createNasVolumeInstanceRequest.regionNo) &&
				Objects.equals(this.zoneNo, createNasVolumeInstanceRequest.zoneNo) &&
				Objects.equals(this.isReturnProtection, createNasVolumeInstanceRequest.isReturnProtection) &&
				Objects.equals(this.isAsync, createNasVolumeInstanceRequest.isAsync) &&
				Objects.equals(this.responseFormatType, createNasVolumeInstanceRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(volumeName, volumeSize, volumeAllotmentProtocolTypeCode, accessControlRuleList, cifsUserName, cifsUserPassword, nasVolumeDescription, regionNo, zoneNo, isReturnProtection, isAsync, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateNasVolumeInstanceRequest {\n");
		
		sb.append("		volumeName: ").append(toIndentedString(volumeName)).append("\n");
		sb.append("		volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
		sb.append("		volumeAllotmentProtocolTypeCode: ").append(toIndentedString(volumeAllotmentProtocolTypeCode)).append("\n");
		sb.append("		accessControlRuleList: ").append(toIndentedString(accessControlRuleList)).append("\n");
		sb.append("		cifsUserName: ").append(toIndentedString(cifsUserName)).append("\n");
		sb.append("		cifsUserPassword: ").append(toIndentedString(cifsUserPassword)).append("\n");
		sb.append("		nasVolumeDescription: ").append(toIndentedString(nasVolumeDescription)).append("\n");
		sb.append("		regionNo: ").append(toIndentedString(regionNo)).append("\n");
		sb.append("		zoneNo: ").append(toIndentedString(zoneNo)).append("\n");
		sb.append("		isReturnProtection: ").append(toIndentedString(isReturnProtection)).append("\n");
		sb.append("		isAsync: ").append(toIndentedString(isAsync)).append("\n");
		sb.append("		responseFormatType: ").append(toIndentedString(responseFormatType)).append("\n");
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

