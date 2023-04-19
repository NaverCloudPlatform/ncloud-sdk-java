/*
 * vpc
 * VPC Network 관련 API<br/>https://ncloud.apigw.ntruss.com/vpc/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vpc.model;

import java.util.Objects;

/**
 * SetNatGatewayDescriptionRequest
 */
public class SetNatGatewayDescriptionRequest {
	private String regionCode = null;

	private String natGatewayInstanceNo = null;

	private String natGatewayDescription = null;

	private String responseFormatType = null;

	public SetNatGatewayDescriptionRequest regionCode(String regionCode) {
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

	public SetNatGatewayDescriptionRequest natGatewayInstanceNo(String natGatewayInstanceNo) {
		this.natGatewayInstanceNo = natGatewayInstanceNo;
		return this;
	}

	 /**
	 * NATGateway인스턴스번호
	 * @return natGatewayInstanceNo
	**/
	public String getNatGatewayInstanceNo() {
		return natGatewayInstanceNo;
	}

	public void setNatGatewayInstanceNo(String natGatewayInstanceNo) {
		this.natGatewayInstanceNo = natGatewayInstanceNo;
	}

	public SetNatGatewayDescriptionRequest natGatewayDescription(String natGatewayDescription) {
		this.natGatewayDescription = natGatewayDescription;
		return this;
	}

	 /**
	 * NATGateway설명
	 * @return natGatewayDescription
	**/
	public String getNatGatewayDescription() {
		return natGatewayDescription;
	}

	public void setNatGatewayDescription(String natGatewayDescription) {
		this.natGatewayDescription = natGatewayDescription;
	}

	public SetNatGatewayDescriptionRequest responseFormatType(String responseFormatType) {
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
		SetNatGatewayDescriptionRequest setNatGatewayDescriptionRequest = (SetNatGatewayDescriptionRequest) o;
		return Objects.equals(this.regionCode, setNatGatewayDescriptionRequest.regionCode) &&
				Objects.equals(this.natGatewayInstanceNo, setNatGatewayDescriptionRequest.natGatewayInstanceNo) &&
				Objects.equals(this.natGatewayDescription, setNatGatewayDescriptionRequest.natGatewayDescription) &&
				Objects.equals(this.responseFormatType, setNatGatewayDescriptionRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, natGatewayInstanceNo, natGatewayDescription, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SetNatGatewayDescriptionRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		natGatewayInstanceNo: ").append(toIndentedString(natGatewayInstanceNo)).append("\n");
		sb.append("		natGatewayDescription: ").append(toIndentedString(natGatewayDescription)).append("\n");
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

