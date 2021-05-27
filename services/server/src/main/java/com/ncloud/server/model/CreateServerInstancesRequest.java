/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * OpenAPI spec version: 2021-03-04T10:39:42Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.server.model;

import java.util.Objects;
import com.ncloud.server.model.BlockDevicePartition;
import com.ncloud.server.model.InstanceTagParameter;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateServerInstancesRequest
 */
public class CreateServerInstancesRequest {
	private String serverImageProductCode = null;

	private String serverProductCode = null;

	private String memberServerImageNo = null;

	private String serverName = null;

	private String serverDescription = null;

	private String loginKeyName = null;

	private Boolean isProtectServerTermination = null;

	private Integer serverCreateCount = null;

	private Integer serverCreateStartNo = null;

	private String internetLineTypeCode = null;

	private String feeSystemTypeCode = null;

	private String userData = null;

	private String initScriptNo = null;

	private String zoneNo = null;

	private List<String> accessControlGroupConfigurationNoList = null;

	private String raidTypeName = null;

	private List<InstanceTagParameter> instanceTagList = null;

	private Boolean isVaccineInstall = null;

	private List<BlockDevicePartition> blockDevicePartitionList = null;

	private String responseFormatType = null;

	public CreateServerInstancesRequest serverImageProductCode(String serverImageProductCode) {
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

	public CreateServerInstancesRequest serverProductCode(String serverProductCode) {
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

	public CreateServerInstancesRequest memberServerImageNo(String memberServerImageNo) {
		this.memberServerImageNo = memberServerImageNo;
		return this;
	}

	 /**
	 * 회원서버이미지번호
	 * @return memberServerImageNo
	**/
	public String getMemberServerImageNo() {
		return memberServerImageNo;
	}

	public void setMemberServerImageNo(String memberServerImageNo) {
		this.memberServerImageNo = memberServerImageNo;
	}

	public CreateServerInstancesRequest serverName(String serverName) {
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

	public CreateServerInstancesRequest serverDescription(String serverDescription) {
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

	public CreateServerInstancesRequest loginKeyName(String loginKeyName) {
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

	public CreateServerInstancesRequest isProtectServerTermination(Boolean isProtectServerTermination) {
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

	public CreateServerInstancesRequest serverCreateCount(Integer serverCreateCount) {
		this.serverCreateCount = serverCreateCount;
		return this;
	}

	 /**
	 * 서버생성갯수
	 * @return serverCreateCount
	**/
	public Integer getServerCreateCount() {
		return serverCreateCount;
	}

	public void setServerCreateCount(Integer serverCreateCount) {
		this.serverCreateCount = serverCreateCount;
	}

	public CreateServerInstancesRequest serverCreateStartNo(Integer serverCreateStartNo) {
		this.serverCreateStartNo = serverCreateStartNo;
		return this;
	}

	 /**
	 * 서버생성시작번호
	 * @return serverCreateStartNo
	**/
	public Integer getServerCreateStartNo() {
		return serverCreateStartNo;
	}

	public void setServerCreateStartNo(Integer serverCreateStartNo) {
		this.serverCreateStartNo = serverCreateStartNo;
	}

	public CreateServerInstancesRequest internetLineTypeCode(String internetLineTypeCode) {
		this.internetLineTypeCode = internetLineTypeCode;
		return this;
	}

	 /**
	 * 인터넷라인구분코드
	 * @return internetLineTypeCode
	**/
	public String getInternetLineTypeCode() {
		return internetLineTypeCode;
	}

	public void setInternetLineTypeCode(String internetLineTypeCode) {
		this.internetLineTypeCode = internetLineTypeCode;
	}

	public CreateServerInstancesRequest feeSystemTypeCode(String feeSystemTypeCode) {
		this.feeSystemTypeCode = feeSystemTypeCode;
		return this;
	}

	 /**
	 * 요금제구분코드
	 * @return feeSystemTypeCode
	**/
	public String getFeeSystemTypeCode() {
		return feeSystemTypeCode;
	}

	public void setFeeSystemTypeCode(String feeSystemTypeCode) {
		this.feeSystemTypeCode = feeSystemTypeCode;
	}

	public CreateServerInstancesRequest userData(String userData) {
		this.userData = userData;
		return this;
	}

	 /**
	 * 사용자데이터
	 * @return userData
	**/
	public String getUserData() {
		return userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
	}

	public CreateServerInstancesRequest initScriptNo(String initScriptNo) {
		this.initScriptNo = initScriptNo;
		return this;
	}

	 /**
	 * 초기화스크립트번호
	 * @return initScriptNo
	**/
	public String getInitScriptNo() {
		return initScriptNo;
	}

	public void setInitScriptNo(String initScriptNo) {
		this.initScriptNo = initScriptNo;
	}

	public CreateServerInstancesRequest zoneNo(String zoneNo) {
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

	public CreateServerInstancesRequest accessControlGroupConfigurationNoList(List<String> accessControlGroupConfigurationNoList) {
		this.accessControlGroupConfigurationNoList = accessControlGroupConfigurationNoList;
		return this;
	}

	public CreateServerInstancesRequest addAccessControlGroupConfigurationNoListItem(String accessControlGroupConfigurationNoListItem) {
		if (this.accessControlGroupConfigurationNoList == null) {
			this.accessControlGroupConfigurationNoList = new ArrayList<String>();
		}
		this.accessControlGroupConfigurationNoList.add(accessControlGroupConfigurationNoListItem);
		return this;
	}

	 /**
	 * ACG설정번호리스트
	 * @return accessControlGroupConfigurationNoList
	**/
	public List<String> getAccessControlGroupConfigurationNoList() {
		return accessControlGroupConfigurationNoList;
	}

	public void setAccessControlGroupConfigurationNoList(List<String> accessControlGroupConfigurationNoList) {
		this.accessControlGroupConfigurationNoList = accessControlGroupConfigurationNoList;
	}

	public CreateServerInstancesRequest raidTypeName(String raidTypeName) {
		this.raidTypeName = raidTypeName;
		return this;
	}

	 /**
	 * RAID구분이름
	 * @return raidTypeName
	**/
	public String getRaidTypeName() {
		return raidTypeName;
	}

	public void setRaidTypeName(String raidTypeName) {
		this.raidTypeName = raidTypeName;
	}

	public CreateServerInstancesRequest instanceTagList(List<InstanceTagParameter> instanceTagList) {
		this.instanceTagList = instanceTagList;
		return this;
	}

	public CreateServerInstancesRequest addInstanceTagListItem(InstanceTagParameter instanceTagListItem) {
		if (this.instanceTagList == null) {
			this.instanceTagList = new ArrayList<InstanceTagParameter>();
		}
		this.instanceTagList.add(instanceTagListItem);
		return this;
	}

	 /**
	 * 인스턴스태그리스트
	 * @return instanceTagList
	**/
	public List<InstanceTagParameter> getInstanceTagList() {
		return instanceTagList;
	}

	public void setInstanceTagList(List<InstanceTagParameter> instanceTagList) {
		this.instanceTagList = instanceTagList;
	}

	public CreateServerInstancesRequest isVaccineInstall(Boolean isVaccineInstall) {
		this.isVaccineInstall = isVaccineInstall;
		return this;
	}

	 /**
	 * 백신설치여부
	 * @return isVaccineInstall
	**/
	public Boolean isIsVaccineInstall() {
		return isVaccineInstall;
	}

	public void setIsVaccineInstall(Boolean isVaccineInstall) {
		this.isVaccineInstall = isVaccineInstall;
	}

	public CreateServerInstancesRequest blockDevicePartitionList(List<BlockDevicePartition> blockDevicePartitionList) {
		this.blockDevicePartitionList = blockDevicePartitionList;
		return this;
	}

	public CreateServerInstancesRequest addBlockDevicePartitionListItem(BlockDevicePartition blockDevicePartitionListItem) {
		if (this.blockDevicePartitionList == null) {
			this.blockDevicePartitionList = new ArrayList<BlockDevicePartition>();
		}
		this.blockDevicePartitionList.add(blockDevicePartitionListItem);
		return this;
	}

	 /**
	 * 블록디바이스파티션리스트
	 * @return blockDevicePartitionList
	**/
	public List<BlockDevicePartition> getBlockDevicePartitionList() {
		return blockDevicePartitionList;
	}

	public void setBlockDevicePartitionList(List<BlockDevicePartition> blockDevicePartitionList) {
		this.blockDevicePartitionList = blockDevicePartitionList;
	}

	public CreateServerInstancesRequest responseFormatType(String responseFormatType) {
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
		CreateServerInstancesRequest createServerInstancesRequest = (CreateServerInstancesRequest) o;
		return Objects.equals(this.serverImageProductCode, createServerInstancesRequest.serverImageProductCode) &&
				Objects.equals(this.serverProductCode, createServerInstancesRequest.serverProductCode) &&
				Objects.equals(this.memberServerImageNo, createServerInstancesRequest.memberServerImageNo) &&
				Objects.equals(this.serverName, createServerInstancesRequest.serverName) &&
				Objects.equals(this.serverDescription, createServerInstancesRequest.serverDescription) &&
				Objects.equals(this.loginKeyName, createServerInstancesRequest.loginKeyName) &&
				Objects.equals(this.isProtectServerTermination, createServerInstancesRequest.isProtectServerTermination) &&
				Objects.equals(this.serverCreateCount, createServerInstancesRequest.serverCreateCount) &&
				Objects.equals(this.serverCreateStartNo, createServerInstancesRequest.serverCreateStartNo) &&
				Objects.equals(this.internetLineTypeCode, createServerInstancesRequest.internetLineTypeCode) &&
				Objects.equals(this.feeSystemTypeCode, createServerInstancesRequest.feeSystemTypeCode) &&
				Objects.equals(this.userData, createServerInstancesRequest.userData) &&
				Objects.equals(this.initScriptNo, createServerInstancesRequest.initScriptNo) &&
				Objects.equals(this.zoneNo, createServerInstancesRequest.zoneNo) &&
				Objects.equals(this.accessControlGroupConfigurationNoList, createServerInstancesRequest.accessControlGroupConfigurationNoList) &&
				Objects.equals(this.raidTypeName, createServerInstancesRequest.raidTypeName) &&
				Objects.equals(this.instanceTagList, createServerInstancesRequest.instanceTagList) &&
				Objects.equals(this.isVaccineInstall, createServerInstancesRequest.isVaccineInstall) &&
				Objects.equals(this.blockDevicePartitionList, createServerInstancesRequest.blockDevicePartitionList) &&
				Objects.equals(this.responseFormatType, createServerInstancesRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(serverImageProductCode, serverProductCode, memberServerImageNo, serverName, serverDescription, loginKeyName, isProtectServerTermination, serverCreateCount, serverCreateStartNo, internetLineTypeCode, feeSystemTypeCode, userData, initScriptNo, zoneNo, accessControlGroupConfigurationNoList, raidTypeName, instanceTagList, isVaccineInstall, blockDevicePartitionList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateServerInstancesRequest {\n");
		
		sb.append("		serverImageProductCode: ").append(toIndentedString(serverImageProductCode)).append("\n");
		sb.append("		serverProductCode: ").append(toIndentedString(serverProductCode)).append("\n");
		sb.append("		memberServerImageNo: ").append(toIndentedString(memberServerImageNo)).append("\n");
		sb.append("		serverName: ").append(toIndentedString(serverName)).append("\n");
		sb.append("		serverDescription: ").append(toIndentedString(serverDescription)).append("\n");
		sb.append("		loginKeyName: ").append(toIndentedString(loginKeyName)).append("\n");
		sb.append("		isProtectServerTermination: ").append(toIndentedString(isProtectServerTermination)).append("\n");
		sb.append("		serverCreateCount: ").append(toIndentedString(serverCreateCount)).append("\n");
		sb.append("		serverCreateStartNo: ").append(toIndentedString(serverCreateStartNo)).append("\n");
		sb.append("		internetLineTypeCode: ").append(toIndentedString(internetLineTypeCode)).append("\n");
		sb.append("		feeSystemTypeCode: ").append(toIndentedString(feeSystemTypeCode)).append("\n");
		sb.append("		userData: ").append(toIndentedString(userData)).append("\n");
		sb.append("		initScriptNo: ").append(toIndentedString(initScriptNo)).append("\n");
		sb.append("		zoneNo: ").append(toIndentedString(zoneNo)).append("\n");
		sb.append("		accessControlGroupConfigurationNoList: ").append(toIndentedString(accessControlGroupConfigurationNoList)).append("\n");
		sb.append("		raidTypeName: ").append(toIndentedString(raidTypeName)).append("\n");
		sb.append("		instanceTagList: ").append(toIndentedString(instanceTagList)).append("\n");
		sb.append("		isVaccineInstall: ").append(toIndentedString(isVaccineInstall)).append("\n");
		sb.append("		blockDevicePartitionList: ").append(toIndentedString(blockDevicePartitionList)).append("\n");
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

