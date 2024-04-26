/*
 * vserver
 * VPC Compute 관련 API<br/>https://ncloud.apigw.ntruss.com/vserver/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vserver.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * AddNetworkInterfaceAccessControlGroupRequest
 */
public class AddNetworkInterfaceAccessControlGroupRequest {
	private String regionCode = null;

	private List<String> accessControlGroupNoList = new ArrayList<String>();

	private String networkInterfaceNo = null;

	private String responseFormatType = null;

	public AddNetworkInterfaceAccessControlGroupRequest regionCode(String regionCode) {
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

	public AddNetworkInterfaceAccessControlGroupRequest accessControlGroupNoList(List<String> accessControlGroupNoList) {
		this.accessControlGroupNoList = accessControlGroupNoList;
		return this;
	}

	public AddNetworkInterfaceAccessControlGroupRequest addAccessControlGroupNoListItem(String accessControlGroupNoListItem) {
		this.accessControlGroupNoList.add(accessControlGroupNoListItem);
		return this;
	}

	 /**
	 * ACG번호리스트
	 * @return accessControlGroupNoList
	**/
	public List<String> getAccessControlGroupNoList() {
		return accessControlGroupNoList;
	}

	public void setAccessControlGroupNoList(List<String> accessControlGroupNoList) {
		this.accessControlGroupNoList = accessControlGroupNoList;
	}

	public AddNetworkInterfaceAccessControlGroupRequest networkInterfaceNo(String networkInterfaceNo) {
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

	public AddNetworkInterfaceAccessControlGroupRequest responseFormatType(String responseFormatType) {
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
		AddNetworkInterfaceAccessControlGroupRequest addNetworkInterfaceAccessControlGroupRequest = (AddNetworkInterfaceAccessControlGroupRequest) o;
		return Objects.equals(this.regionCode, addNetworkInterfaceAccessControlGroupRequest.regionCode) &&
				Objects.equals(this.accessControlGroupNoList, addNetworkInterfaceAccessControlGroupRequest.accessControlGroupNoList) &&
				Objects.equals(this.networkInterfaceNo, addNetworkInterfaceAccessControlGroupRequest.networkInterfaceNo) &&
				Objects.equals(this.responseFormatType, addNetworkInterfaceAccessControlGroupRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, accessControlGroupNoList, networkInterfaceNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AddNetworkInterfaceAccessControlGroupRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		accessControlGroupNoList: ").append(toIndentedString(accessControlGroupNoList)).append("\n");
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

