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
 * GetNetworkAclDenyAllowGroupDetailRequest
 */
public class GetNetworkAclDenyAllowGroupDetailRequest {
	private String regionCode = null;

	private String networkAclDenyAllowGroupNo = null;

	private String responseFormatType = null;

	public GetNetworkAclDenyAllowGroupDetailRequest regionCode(String regionCode) {
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

	public GetNetworkAclDenyAllowGroupDetailRequest networkAclDenyAllowGroupNo(String networkAclDenyAllowGroupNo) {
		this.networkAclDenyAllowGroupNo = networkAclDenyAllowGroupNo;
		return this;
	}

	 /**
	 * 네트워크ACL허용차단그룹번호
	 * @return networkAclDenyAllowGroupNo
	**/
	public String getNetworkAclDenyAllowGroupNo() {
		return networkAclDenyAllowGroupNo;
	}

	public void setNetworkAclDenyAllowGroupNo(String networkAclDenyAllowGroupNo) {
		this.networkAclDenyAllowGroupNo = networkAclDenyAllowGroupNo;
	}

	public GetNetworkAclDenyAllowGroupDetailRequest responseFormatType(String responseFormatType) {
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
		GetNetworkAclDenyAllowGroupDetailRequest getNetworkAclDenyAllowGroupDetailRequest = (GetNetworkAclDenyAllowGroupDetailRequest) o;
		return Objects.equals(this.regionCode, getNetworkAclDenyAllowGroupDetailRequest.regionCode) &&
				Objects.equals(this.networkAclDenyAllowGroupNo, getNetworkAclDenyAllowGroupDetailRequest.networkAclDenyAllowGroupNo) &&
				Objects.equals(this.responseFormatType, getNetworkAclDenyAllowGroupDetailRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, networkAclDenyAllowGroupNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetNetworkAclDenyAllowGroupDetailRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		networkAclDenyAllowGroupNo: ").append(toIndentedString(networkAclDenyAllowGroupNo)).append("\n");
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
