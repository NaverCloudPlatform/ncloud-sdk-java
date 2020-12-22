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
 * AcceptOrRejectVpcPeeringRequest
 */
public class AcceptOrRejectVpcPeeringRequest {
	private String regionCode = null;

	private String vpcPeeringInstanceNo = null;

	private Boolean isAccept = null;

	private String responseFormatType = null;

	public AcceptOrRejectVpcPeeringRequest regionCode(String regionCode) {
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

	public AcceptOrRejectVpcPeeringRequest vpcPeeringInstanceNo(String vpcPeeringInstanceNo) {
		this.vpcPeeringInstanceNo = vpcPeeringInstanceNo;
		return this;
	}

	 /**
	 * VPCPeering인스턴스번호
	 * @return vpcPeeringInstanceNo
	**/
	public String getVpcPeeringInstanceNo() {
		return vpcPeeringInstanceNo;
	}

	public void setVpcPeeringInstanceNo(String vpcPeeringInstanceNo) {
		this.vpcPeeringInstanceNo = vpcPeeringInstanceNo;
	}

	public AcceptOrRejectVpcPeeringRequest isAccept(Boolean isAccept) {
		this.isAccept = isAccept;
		return this;
	}

	 /**
	 * 수락여부
	 * @return isAccept
	**/
	public Boolean isIsAccept() {
		return isAccept;
	}

	public void setIsAccept(Boolean isAccept) {
		this.isAccept = isAccept;
	}

	public AcceptOrRejectVpcPeeringRequest responseFormatType(String responseFormatType) {
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
		AcceptOrRejectVpcPeeringRequest acceptOrRejectVpcPeeringRequest = (AcceptOrRejectVpcPeeringRequest) o;
		return Objects.equals(this.regionCode, acceptOrRejectVpcPeeringRequest.regionCode) &&
				Objects.equals(this.vpcPeeringInstanceNo, acceptOrRejectVpcPeeringRequest.vpcPeeringInstanceNo) &&
				Objects.equals(this.isAccept, acceptOrRejectVpcPeeringRequest.isAccept) &&
				Objects.equals(this.responseFormatType, acceptOrRejectVpcPeeringRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, vpcPeeringInstanceNo, isAccept, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AcceptOrRejectVpcPeeringRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		vpcPeeringInstanceNo: ").append(toIndentedString(vpcPeeringInstanceNo)).append("\n");
		sb.append("		isAccept: ").append(toIndentedString(isAccept)).append("\n");
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

