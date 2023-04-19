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
 * UnassignSecondaryIpsRequest
 */
public class UnassignSecondaryIpsRequest {
	private String regionCode = null;

	private String networkInterfaceNo = null;

	private List<String> secondaryIpList = new ArrayList<String>();

	private String responseFormatType = null;

	public UnassignSecondaryIpsRequest regionCode(String regionCode) {
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

	public UnassignSecondaryIpsRequest networkInterfaceNo(String networkInterfaceNo) {
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

	public UnassignSecondaryIpsRequest secondaryIpList(List<String> secondaryIpList) {
		this.secondaryIpList = secondaryIpList;
		return this;
	}

	public UnassignSecondaryIpsRequest addSecondaryIpListItem(String secondaryIpListItem) {
		this.secondaryIpList.add(secondaryIpListItem);
		return this;
	}

	 /**
	 * 보조IP리스트
	 * @return secondaryIpList
	**/
	public List<String> getSecondaryIpList() {
		return secondaryIpList;
	}

	public void setSecondaryIpList(List<String> secondaryIpList) {
		this.secondaryIpList = secondaryIpList;
	}

	public UnassignSecondaryIpsRequest responseFormatType(String responseFormatType) {
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
		UnassignSecondaryIpsRequest unassignSecondaryIpsRequest = (UnassignSecondaryIpsRequest) o;
		return Objects.equals(this.regionCode, unassignSecondaryIpsRequest.regionCode) &&
				Objects.equals(this.networkInterfaceNo, unassignSecondaryIpsRequest.networkInterfaceNo) &&
				Objects.equals(this.secondaryIpList, unassignSecondaryIpsRequest.secondaryIpList) &&
				Objects.equals(this.responseFormatType, unassignSecondaryIpsRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, networkInterfaceNo, secondaryIpList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UnassignSecondaryIpsRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		networkInterfaceNo: ").append(toIndentedString(networkInterfaceNo)).append("\n");
		sb.append("		secondaryIpList: ").append(toIndentedString(secondaryIpList)).append("\n");
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

