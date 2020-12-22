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
 * GetNetworkInterfaceDetailRequest
 */
public class GetNetworkInterfaceDetailRequest {
	private String regionCode = null;

	private String networkInterfaceNo = null;

	private String responseFormatType = null;

	public GetNetworkInterfaceDetailRequest regionCode(String regionCode) {
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

	public GetNetworkInterfaceDetailRequest networkInterfaceNo(String networkInterfaceNo) {
		this.networkInterfaceNo = networkInterfaceNo;
		return this;
	}

	 /**
	 * 네트워크인터페이스번호
	 * @return networkInterfaceNo
	**/
	public String getNetworkInterfaceNo() {
		return networkInterfaceNo;
	}

	public void setNetworkInterfaceNo(String networkInterfaceNo) {
		this.networkInterfaceNo = networkInterfaceNo;
	}

	public GetNetworkInterfaceDetailRequest responseFormatType(String responseFormatType) {
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
		GetNetworkInterfaceDetailRequest getNetworkInterfaceDetailRequest = (GetNetworkInterfaceDetailRequest) o;
		return Objects.equals(this.regionCode, getNetworkInterfaceDetailRequest.regionCode) &&
				Objects.equals(this.networkInterfaceNo, getNetworkInterfaceDetailRequest.networkInterfaceNo) &&
				Objects.equals(this.responseFormatType, getNetworkInterfaceDetailRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, networkInterfaceNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetNetworkInterfaceDetailRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		networkInterfaceNo: ").append(toIndentedString(networkInterfaceNo)).append("\n");
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

