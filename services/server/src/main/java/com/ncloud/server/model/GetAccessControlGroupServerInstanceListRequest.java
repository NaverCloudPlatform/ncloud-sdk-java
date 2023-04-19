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

/**
 * GetAccessControlGroupServerInstanceListRequest
 */
public class GetAccessControlGroupServerInstanceListRequest {
	private String accessControlGroupConfigurationNo = null;

	private String responseFormatType = null;

	public GetAccessControlGroupServerInstanceListRequest accessControlGroupConfigurationNo(String accessControlGroupConfigurationNo) {
		this.accessControlGroupConfigurationNo = accessControlGroupConfigurationNo;
		return this;
	}

	 /**
	 * 접근제어그룹설정번호
	 * @return accessControlGroupConfigurationNo
	**/
	public String getAccessControlGroupConfigurationNo() {
		return accessControlGroupConfigurationNo;
	}

	public void setAccessControlGroupConfigurationNo(String accessControlGroupConfigurationNo) {
		this.accessControlGroupConfigurationNo = accessControlGroupConfigurationNo;
	}

	public GetAccessControlGroupServerInstanceListRequest responseFormatType(String responseFormatType) {
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
		GetAccessControlGroupServerInstanceListRequest getAccessControlGroupServerInstanceListRequest = (GetAccessControlGroupServerInstanceListRequest) o;
		return Objects.equals(this.accessControlGroupConfigurationNo, getAccessControlGroupServerInstanceListRequest.accessControlGroupConfigurationNo) &&
				Objects.equals(this.responseFormatType, getAccessControlGroupServerInstanceListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(accessControlGroupConfigurationNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetAccessControlGroupServerInstanceListRequest {\n");
		
		sb.append("		accessControlGroupConfigurationNo: ").append(toIndentedString(accessControlGroupConfigurationNo)).append("\n");
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

