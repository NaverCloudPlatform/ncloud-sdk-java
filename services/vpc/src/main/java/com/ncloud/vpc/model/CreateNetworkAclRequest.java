/*
 * vpc
 * VPC Network 관련 API<br/>https://ncloud.apigw.ntruss.com/vpc/v2
 *
 * OpenAPI spec version: 2020-09-17T02:27:03Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vpc.model;

import java.util.Objects;

/**
 * CreateNetworkAclRequest
 */
public class CreateNetworkAclRequest {
	private String regionCode = null;

	private String networkAclDescription = null;

	private String networkAclName = null;

	private String vpcNo = null;

	private String responseFormatType = null;

	public CreateNetworkAclRequest regionCode(String regionCode) {
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

	public CreateNetworkAclRequest networkAclDescription(String networkAclDescription) {
		this.networkAclDescription = networkAclDescription;
		return this;
	}

	 /**
	 * 네트워크ACL설명
	 * @return networkAclDescription
	**/
	public String getNetworkAclDescription() {
		return networkAclDescription;
	}

	public void setNetworkAclDescription(String networkAclDescription) {
		this.networkAclDescription = networkAclDescription;
	}

	public CreateNetworkAclRequest networkAclName(String networkAclName) {
		this.networkAclName = networkAclName;
		return this;
	}

	 /**
	 * 네트워크ACL이름
	 * @return networkAclName
	**/
	public String getNetworkAclName() {
		return networkAclName;
	}

	public void setNetworkAclName(String networkAclName) {
		this.networkAclName = networkAclName;
	}

	public CreateNetworkAclRequest vpcNo(String vpcNo) {
		this.vpcNo = vpcNo;
		return this;
	}

	 /**
	 * VPC번호
	 * @return vpcNo
	**/
	public String getVpcNo() {
		return vpcNo;
	}

	public void setVpcNo(String vpcNo) {
		this.vpcNo = vpcNo;
	}

	public CreateNetworkAclRequest responseFormatType(String responseFormatType) {
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
		CreateNetworkAclRequest createNetworkAclRequest = (CreateNetworkAclRequest) o;
		return Objects.equals(this.regionCode, createNetworkAclRequest.regionCode) &&
				Objects.equals(this.networkAclDescription, createNetworkAclRequest.networkAclDescription) &&
				Objects.equals(this.networkAclName, createNetworkAclRequest.networkAclName) &&
				Objects.equals(this.vpcNo, createNetworkAclRequest.vpcNo) &&
				Objects.equals(this.responseFormatType, createNetworkAclRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, networkAclDescription, networkAclName, vpcNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateNetworkAclRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		networkAclDescription: ").append(toIndentedString(networkAclDescription)).append("\n");
		sb.append("		networkAclName: ").append(toIndentedString(networkAclName)).append("\n");
		sb.append("		vpcNo: ").append(toIndentedString(vpcNo)).append("\n");
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
