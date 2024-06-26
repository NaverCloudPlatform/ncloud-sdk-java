/*
 * vnas
 * VPC NAS 관련 API<br/>https://ncloud.apigw.ntruss.com/vnas/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vnas.model;

import java.util.Objects;
import com.ncloud.vnas.model.AccessControlRuleParameter;
import java.util.ArrayList;
import java.util.List;

/**
 * SetNasVolumeAccessControlRequest
 */
public class SetNasVolumeAccessControlRequest {
	private String regionCode = null;

	private String nasVolumeInstanceNo = null;

	private List<String> serverInstanceNoList = null;

	private List<AccessControlRuleParameter> accessControlRuleList = null;

	private String responseFormatType = null;

	public SetNasVolumeAccessControlRequest regionCode(String regionCode) {
		this.regionCode = regionCode;
		return this;
	}

	 /**
	 * REGION코드
	 * @return regionCode
	**/
	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public SetNasVolumeAccessControlRequest nasVolumeInstanceNo(String nasVolumeInstanceNo) {
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

	public SetNasVolumeAccessControlRequest serverInstanceNoList(List<String> serverInstanceNoList) {
		this.serverInstanceNoList = serverInstanceNoList;
		return this;
	}

	public SetNasVolumeAccessControlRequest addServerInstanceNoListItem(String serverInstanceNoListItem) {
		if (this.serverInstanceNoList == null) {
			this.serverInstanceNoList = new ArrayList<String>();
		}
		this.serverInstanceNoList.add(serverInstanceNoListItem);
		return this;
	}

	 /**
	 * 서버인스턴스번호리스트
	 * @return serverInstanceNoList
	**/
	public List<String> getServerInstanceNoList() {
		return serverInstanceNoList;
	}

	public void setServerInstanceNoList(List<String> serverInstanceNoList) {
		this.serverInstanceNoList = serverInstanceNoList;
	}

	public SetNasVolumeAccessControlRequest accessControlRuleList(List<AccessControlRuleParameter> accessControlRuleList) {
		this.accessControlRuleList = accessControlRuleList;
		return this;
	}

	public SetNasVolumeAccessControlRequest addAccessControlRuleListItem(AccessControlRuleParameter accessControlRuleListItem) {
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

	public SetNasVolumeAccessControlRequest responseFormatType(String responseFormatType) {
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
		SetNasVolumeAccessControlRequest setNasVolumeAccessControlRequest = (SetNasVolumeAccessControlRequest) o;
		return Objects.equals(this.regionCode, setNasVolumeAccessControlRequest.regionCode) &&
				Objects.equals(this.nasVolumeInstanceNo, setNasVolumeAccessControlRequest.nasVolumeInstanceNo) &&
				Objects.equals(this.serverInstanceNoList, setNasVolumeAccessControlRequest.serverInstanceNoList) &&
				Objects.equals(this.accessControlRuleList, setNasVolumeAccessControlRequest.accessControlRuleList) &&
				Objects.equals(this.responseFormatType, setNasVolumeAccessControlRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, nasVolumeInstanceNo, serverInstanceNoList, accessControlRuleList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SetNasVolumeAccessControlRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		nasVolumeInstanceNo: ").append(toIndentedString(nasVolumeInstanceNo)).append("\n");
		sb.append("		serverInstanceNoList: ").append(toIndentedString(serverInstanceNoList)).append("\n");
		sb.append("		accessControlRuleList: ").append(toIndentedString(accessControlRuleList)).append("\n");
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

