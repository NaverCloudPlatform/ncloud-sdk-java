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
 * DetachNetworkInterfaceRequest
 */
public class DetachNetworkInterfaceRequest {
	private String regionCode = null;

	private String serverInstanceNo = null;

	private String networkInterfaceNo = null;

	private String subnetNo = null;

	private String responseFormatType = null;

	public DetachNetworkInterfaceRequest regionCode(String regionCode) {
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

	public DetachNetworkInterfaceRequest serverInstanceNo(String serverInstanceNo) {
		this.serverInstanceNo = serverInstanceNo;
		return this;
	}

	 /**
	 * 서버인스턴스번호
	 * @return serverInstanceNo
	**/
	public String getServerInstanceNo() {
		return serverInstanceNo;
	}

	public void setServerInstanceNo(String serverInstanceNo) {
		this.serverInstanceNo = serverInstanceNo;
	}

	public DetachNetworkInterfaceRequest networkInterfaceNo(String networkInterfaceNo) {
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

	public DetachNetworkInterfaceRequest subnetNo(String subnetNo) {
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

	public DetachNetworkInterfaceRequest responseFormatType(String responseFormatType) {
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
		DetachNetworkInterfaceRequest detachNetworkInterfaceRequest = (DetachNetworkInterfaceRequest) o;
		return Objects.equals(this.regionCode, detachNetworkInterfaceRequest.regionCode) &&
				Objects.equals(this.serverInstanceNo, detachNetworkInterfaceRequest.serverInstanceNo) &&
				Objects.equals(this.networkInterfaceNo, detachNetworkInterfaceRequest.networkInterfaceNo) &&
				Objects.equals(this.subnetNo, detachNetworkInterfaceRequest.subnetNo) &&
				Objects.equals(this.responseFormatType, detachNetworkInterfaceRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, serverInstanceNo, networkInterfaceNo, subnetNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DetachNetworkInterfaceRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		serverInstanceNo: ").append(toIndentedString(serverInstanceNo)).append("\n");
		sb.append("		networkInterfaceNo: ").append(toIndentedString(networkInterfaceNo)).append("\n");
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

