/*
 * vserver
 * VPC Compute 관련 API<br/>https://ncloud.apigw.ntruss.com/vserver/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vserver.model;

import java.util.Objects;

/**
 * GetAccessControlGroupRuleListRequest
 */
public class GetAccessControlGroupRuleListRequest {
	private String regionCode = null;

	private String accessControlGroupNo = null;

	private String accessControlGroupRuleTypeCode = null;

	private String responseFormatType = null;

	public GetAccessControlGroupRuleListRequest regionCode(String regionCode) {
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

	public GetAccessControlGroupRuleListRequest accessControlGroupNo(String accessControlGroupNo) {
		this.accessControlGroupNo = accessControlGroupNo;
		return this;
	}

	 /**
	 * ACG번호
	 * @return accessControlGroupNo
	**/
	public String getAccessControlGroupNo() {
		return accessControlGroupNo;
	}

	public void setAccessControlGroupNo(String accessControlGroupNo) {
		this.accessControlGroupNo = accessControlGroupNo;
	}

	public GetAccessControlGroupRuleListRequest accessControlGroupRuleTypeCode(String accessControlGroupRuleTypeCode) {
		this.accessControlGroupRuleTypeCode = accessControlGroupRuleTypeCode;
		return this;
	}

	 /**
	 * ACGRule유형코드
	 * @return accessControlGroupRuleTypeCode
	**/
	public String getAccessControlGroupRuleTypeCode() {
		return accessControlGroupRuleTypeCode;
	}

	public void setAccessControlGroupRuleTypeCode(String accessControlGroupRuleTypeCode) {
		this.accessControlGroupRuleTypeCode = accessControlGroupRuleTypeCode;
	}

	public GetAccessControlGroupRuleListRequest responseFormatType(String responseFormatType) {
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
		GetAccessControlGroupRuleListRequest getAccessControlGroupRuleListRequest = (GetAccessControlGroupRuleListRequest) o;
		return Objects.equals(this.regionCode, getAccessControlGroupRuleListRequest.regionCode) &&
				Objects.equals(this.accessControlGroupNo, getAccessControlGroupRuleListRequest.accessControlGroupNo) &&
				Objects.equals(this.accessControlGroupRuleTypeCode, getAccessControlGroupRuleListRequest.accessControlGroupRuleTypeCode) &&
				Objects.equals(this.responseFormatType, getAccessControlGroupRuleListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, accessControlGroupNo, accessControlGroupRuleTypeCode, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetAccessControlGroupRuleListRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		accessControlGroupNo: ").append(toIndentedString(accessControlGroupNo)).append("\n");
		sb.append("		accessControlGroupRuleTypeCode: ").append(toIndentedString(accessControlGroupRuleTypeCode)).append("\n");
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

