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
 * CreateNetworkAclDenyAllowGroupRequest
 */
public class CreateNetworkAclDenyAllowGroupRequest {
	private String regionCode = null;

	private String vpcNo = null;

	private String networkAclDenyAllowGroupName = null;

	private String networkAclDenyAllowGroupDescription = null;

	private String responseFormatType = null;

	public CreateNetworkAclDenyAllowGroupRequest regionCode(String regionCode) {
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

	public CreateNetworkAclDenyAllowGroupRequest vpcNo(String vpcNo) {
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

	public CreateNetworkAclDenyAllowGroupRequest networkAclDenyAllowGroupName(String networkAclDenyAllowGroupName) {
		this.networkAclDenyAllowGroupName = networkAclDenyAllowGroupName;
		return this;
	}

	 /**
	 * 네트워크ACL허용차단그룹이름
	 * @return networkAclDenyAllowGroupName
	**/
	public String getNetworkAclDenyAllowGroupName() {
		return networkAclDenyAllowGroupName;
	}

	public void setNetworkAclDenyAllowGroupName(String networkAclDenyAllowGroupName) {
		this.networkAclDenyAllowGroupName = networkAclDenyAllowGroupName;
	}

	public CreateNetworkAclDenyAllowGroupRequest networkAclDenyAllowGroupDescription(String networkAclDenyAllowGroupDescription) {
		this.networkAclDenyAllowGroupDescription = networkAclDenyAllowGroupDescription;
		return this;
	}

	 /**
	 * 네트워크ACL허용차단그룹설명
	 * @return networkAclDenyAllowGroupDescription
	**/
	public String getNetworkAclDenyAllowGroupDescription() {
		return networkAclDenyAllowGroupDescription;
	}

	public void setNetworkAclDenyAllowGroupDescription(String networkAclDenyAllowGroupDescription) {
		this.networkAclDenyAllowGroupDescription = networkAclDenyAllowGroupDescription;
	}

	public CreateNetworkAclDenyAllowGroupRequest responseFormatType(String responseFormatType) {
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
		CreateNetworkAclDenyAllowGroupRequest createNetworkAclDenyAllowGroupRequest = (CreateNetworkAclDenyAllowGroupRequest) o;
		return Objects.equals(this.regionCode, createNetworkAclDenyAllowGroupRequest.regionCode) &&
				Objects.equals(this.vpcNo, createNetworkAclDenyAllowGroupRequest.vpcNo) &&
				Objects.equals(this.networkAclDenyAllowGroupName, createNetworkAclDenyAllowGroupRequest.networkAclDenyAllowGroupName) &&
				Objects.equals(this.networkAclDenyAllowGroupDescription, createNetworkAclDenyAllowGroupRequest.networkAclDenyAllowGroupDescription) &&
				Objects.equals(this.responseFormatType, createNetworkAclDenyAllowGroupRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, vpcNo, networkAclDenyAllowGroupName, networkAclDenyAllowGroupDescription, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateNetworkAclDenyAllowGroupRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		vpcNo: ").append(toIndentedString(vpcNo)).append("\n");
		sb.append("		networkAclDenyAllowGroupName: ").append(toIndentedString(networkAclDenyAllowGroupName)).append("\n");
		sb.append("		networkAclDenyAllowGroupDescription: ").append(toIndentedString(networkAclDenyAllowGroupDescription)).append("\n");
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

