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
 * AddNasVolumeAccessControlRequest
 */
public class AddNasVolumeAccessControlRequest {
	private String nasVolumeInstanceNo = null;

	private List<AccessControlRuleParameter> accessControlRuleList = null;

	private String responseFormatType = null;

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
		return Objects.equals(this.nasVolumeInstanceNo, addNasVolumeAccessControlRequest.nasVolumeInstanceNo) &&
				Objects.equals(this.accessControlRuleList, addNasVolumeAccessControlRequest.accessControlRuleList) &&
				Objects.equals(this.responseFormatType, addNasVolumeAccessControlRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nasVolumeInstanceNo, accessControlRuleList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AddNasVolumeAccessControlRequest {\n");
		
		sb.append("		nasVolumeInstanceNo: ").append(toIndentedString(nasVolumeInstanceNo)).append("\n");
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

