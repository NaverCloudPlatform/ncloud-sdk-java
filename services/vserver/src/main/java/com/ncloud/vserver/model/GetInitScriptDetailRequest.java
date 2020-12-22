/*
 * vserver
 * VPC Compute 관련 API<br/>https://ncloud.apigw.ntruss.com/vserver/v2
 *
 * OpenAPI spec version: 2020-11-18T09:44:20Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vserver.model;

import java.util.Objects;

/**
 * GetInitScriptDetailRequest
 */
public class GetInitScriptDetailRequest {
	private String regionCode = null;

	private String initScriptNo = null;

	private String responseFormatType = null;

	public GetInitScriptDetailRequest regionCode(String regionCode) {
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

	public GetInitScriptDetailRequest initScriptNo(String initScriptNo) {
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

	public GetInitScriptDetailRequest responseFormatType(String responseFormatType) {
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
		GetInitScriptDetailRequest getInitScriptDetailRequest = (GetInitScriptDetailRequest) o;
		return Objects.equals(this.regionCode, getInitScriptDetailRequest.regionCode) &&
				Objects.equals(this.initScriptNo, getInitScriptDetailRequest.initScriptNo) &&
				Objects.equals(this.responseFormatType, getInitScriptDetailRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, initScriptNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetInitScriptDetailRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		initScriptNo: ").append(toIndentedString(initScriptNo)).append("\n");
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

