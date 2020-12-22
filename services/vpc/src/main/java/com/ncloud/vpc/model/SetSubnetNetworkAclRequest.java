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
 * SetSubnetNetworkAclRequest
 */
public class SetSubnetNetworkAclRequest {
	private String regionCode = null;

	private String networkAclNo = null;

	private String subnetNo = null;

	private String responseFormatType = null;

	public SetSubnetNetworkAclRequest regionCode(String regionCode) {
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

	public SetSubnetNetworkAclRequest networkAclNo(String networkAclNo) {
		this.networkAclNo = networkAclNo;
		return this;
	}

	 /**
	 * 네트워크ACL번호
	 * @return networkAclNo
	**/
	public String getNetworkAclNo() {
		return networkAclNo;
	}

	public void setNetworkAclNo(String networkAclNo) {
		this.networkAclNo = networkAclNo;
	}

	public SetSubnetNetworkAclRequest subnetNo(String subnetNo) {
		this.subnetNo = subnetNo;
		return this;
	}

	 /**
	 * 서브넷번호
	 * @return subnetNo
	**/
	public String getSubnetNo() {
		return subnetNo;
	}

	public void setSubnetNo(String subnetNo) {
		this.subnetNo = subnetNo;
	}

	public SetSubnetNetworkAclRequest responseFormatType(String responseFormatType) {
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
		SetSubnetNetworkAclRequest setSubnetNetworkAclRequest = (SetSubnetNetworkAclRequest) o;
		return Objects.equals(this.regionCode, setSubnetNetworkAclRequest.regionCode) &&
				Objects.equals(this.networkAclNo, setSubnetNetworkAclRequest.networkAclNo) &&
				Objects.equals(this.subnetNo, setSubnetNetworkAclRequest.subnetNo) &&
				Objects.equals(this.responseFormatType, setSubnetNetworkAclRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, networkAclNo, subnetNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SetSubnetNetworkAclRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		networkAclNo: ").append(toIndentedString(networkAclNo)).append("\n");
		sb.append("		subnetNo: ").append(toIndentedString(subnetNo)).append("\n");
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

