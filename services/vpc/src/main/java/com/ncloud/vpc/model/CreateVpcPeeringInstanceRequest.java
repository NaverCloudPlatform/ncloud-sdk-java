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
 * CreateVpcPeeringInstanceRequest
 */
public class CreateVpcPeeringInstanceRequest {
	private String regionCode = null;

	private String vpcPeeringDescription = null;

	private String sourceVpcNo = null;

	private String targetVpcLoginId = null;

	private String targetVpcName = null;

	private String targetVpcNo = null;

	private String vpcPeeringName = null;

	private String responseFormatType = null;

	public CreateVpcPeeringInstanceRequest regionCode(String regionCode) {
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

	public CreateVpcPeeringInstanceRequest vpcPeeringDescription(String vpcPeeringDescription) {
		this.vpcPeeringDescription = vpcPeeringDescription;
		return this;
	}

	 /**
	 * VPCPeering설명
	 * @return vpcPeeringDescription
	**/
	public String getVpcPeeringDescription() {
		return vpcPeeringDescription;
	}

	public void setVpcPeeringDescription(String vpcPeeringDescription) {
		this.vpcPeeringDescription = vpcPeeringDescription;
	}

	public CreateVpcPeeringInstanceRequest sourceVpcNo(String sourceVpcNo) {
		this.sourceVpcNo = sourceVpcNo;
		return this;
	}

	 /**
	 * 요청VPC번호
	 * @return sourceVpcNo
	**/
	public String getSourceVpcNo() {
		return sourceVpcNo;
	}

	public void setSourceVpcNo(String sourceVpcNo) {
		this.sourceVpcNo = sourceVpcNo;
	}

	public CreateVpcPeeringInstanceRequest targetVpcLoginId(String targetVpcLoginId) {
		this.targetVpcLoginId = targetVpcLoginId;
		return this;
	}

	 /**
	 * 수락VPC소유자ID
	 * @return targetVpcLoginId
	**/
	public String getTargetVpcLoginId() {
		return targetVpcLoginId;
	}

	public void setTargetVpcLoginId(String targetVpcLoginId) {
		this.targetVpcLoginId = targetVpcLoginId;
	}

	public CreateVpcPeeringInstanceRequest targetVpcName(String targetVpcName) {
		this.targetVpcName = targetVpcName;
		return this;
	}

	 /**
	 * 수락VPC이름
	 * @return targetVpcName
	**/
	public String getTargetVpcName() {
		return targetVpcName;
	}

	public void setTargetVpcName(String targetVpcName) {
		this.targetVpcName = targetVpcName;
	}

	public CreateVpcPeeringInstanceRequest targetVpcNo(String targetVpcNo) {
		this.targetVpcNo = targetVpcNo;
		return this;
	}

	 /**
	 * 수락VPC번호
	 * @return targetVpcNo
	**/
	public String getTargetVpcNo() {
		return targetVpcNo;
	}

	public void setTargetVpcNo(String targetVpcNo) {
		this.targetVpcNo = targetVpcNo;
	}

	public CreateVpcPeeringInstanceRequest vpcPeeringName(String vpcPeeringName) {
		this.vpcPeeringName = vpcPeeringName;
		return this;
	}

	 /**
	 * VPCPeering이름
	 * @return vpcPeeringName
	**/
	public String getVpcPeeringName() {
		return vpcPeeringName;
	}

	public void setVpcPeeringName(String vpcPeeringName) {
		this.vpcPeeringName = vpcPeeringName;
	}

	public CreateVpcPeeringInstanceRequest responseFormatType(String responseFormatType) {
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
		CreateVpcPeeringInstanceRequest createVpcPeeringInstanceRequest = (CreateVpcPeeringInstanceRequest) o;
		return Objects.equals(this.regionCode, createVpcPeeringInstanceRequest.regionCode) &&
				Objects.equals(this.vpcPeeringDescription, createVpcPeeringInstanceRequest.vpcPeeringDescription) &&
				Objects.equals(this.sourceVpcNo, createVpcPeeringInstanceRequest.sourceVpcNo) &&
				Objects.equals(this.targetVpcLoginId, createVpcPeeringInstanceRequest.targetVpcLoginId) &&
				Objects.equals(this.targetVpcName, createVpcPeeringInstanceRequest.targetVpcName) &&
				Objects.equals(this.targetVpcNo, createVpcPeeringInstanceRequest.targetVpcNo) &&
				Objects.equals(this.vpcPeeringName, createVpcPeeringInstanceRequest.vpcPeeringName) &&
				Objects.equals(this.responseFormatType, createVpcPeeringInstanceRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, vpcPeeringDescription, sourceVpcNo, targetVpcLoginId, targetVpcName, targetVpcNo, vpcPeeringName, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateVpcPeeringInstanceRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		vpcPeeringDescription: ").append(toIndentedString(vpcPeeringDescription)).append("\n");
		sb.append("		sourceVpcNo: ").append(toIndentedString(sourceVpcNo)).append("\n");
		sb.append("		targetVpcLoginId: ").append(toIndentedString(targetVpcLoginId)).append("\n");
		sb.append("		targetVpcName: ").append(toIndentedString(targetVpcName)).append("\n");
		sb.append("		targetVpcNo: ").append(toIndentedString(targetVpcNo)).append("\n");
		sb.append("		vpcPeeringName: ").append(toIndentedString(vpcPeeringName)).append("\n");
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

