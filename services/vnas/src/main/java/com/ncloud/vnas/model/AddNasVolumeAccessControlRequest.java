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
 * AddNasVolumeAccessControlRequest
 */
public class AddNasVolumeAccessControlRequest {
	private String regionCode = null;

	private String nasVolumeInstanceNo = null;

	private List<String> serverInstanceNoList = null;

	private List<AccessControlRuleParameter> accessControlRuleList = null;

	private String responseFormatType = null;

	public AddNasVolumeAccessControlRequest regionCode(String regionCode) {
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

	public AddNasVolumeAccessControlRequest nasVolumeInstanceNo(String nasVolumeInstanceNo) {
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

	public AddNasVolumeAccessControlRequest serverInstanceNoList(List<String> serverInstanceNoList) {
		this.serverInstanceNoList = serverInstanceNoList;
		return this;
	}

	public AddNasVolumeAccessControlRequest addServerInstanceNoListItem(String serverInstanceNoListItem) {
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

	public AddNasVolumeAccessControlRequest accessControlRuleList(List<AccessControlRuleParameter> accessControlRuleList) {
		this.accessControlRuleList = accessControlRuleList;
		return this;
	}

	public AddNasVolumeAccessControlRequest addAccessControlRuleListItem(AccessControlRuleParameter accessControlRuleListItem) {
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

	public AddNasVolumeAccessControlRequest responseFormatType(String responseFormatType) {
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
		AddNasVolumeAccessControlRequest addNasVolumeAccessControlRequest = (AddNasVolumeAccessControlRequest) o;
		return Objects.equals(this.regionCode, addNasVolumeAccessControlRequest.regionCode) &&
				Objects.equals(this.nasVolumeInstanceNo, addNasVolumeAccessControlRequest.nasVolumeInstanceNo) &&
				Objects.equals(this.serverInstanceNoList, addNasVolumeAccessControlRequest.serverInstanceNoList) &&
				Objects.equals(this.accessControlRuleList, addNasVolumeAccessControlRequest.accessControlRuleList) &&
				Objects.equals(this.responseFormatType, addNasVolumeAccessControlRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, nasVolumeInstanceNo, serverInstanceNoList, accessControlRuleList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AddNasVolumeAccessControlRequest {\n");
		
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

