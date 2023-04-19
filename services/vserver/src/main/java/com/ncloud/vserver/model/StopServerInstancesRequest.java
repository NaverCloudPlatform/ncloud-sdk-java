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
 * StopServerInstancesRequest
 */
public class StopServerInstancesRequest {
	private String regionCode = null;

	private List<String> serverInstanceNoList = new ArrayList<String>();

	private String responseFormatType = null;

	public StopServerInstancesRequest regionCode(String regionCode) {
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

	public StopServerInstancesRequest serverInstanceNoList(List<String> serverInstanceNoList) {
		this.serverInstanceNoList = serverInstanceNoList;
		return this;
	}

	public StopServerInstancesRequest addServerInstanceNoListItem(String serverInstanceNoListItem) {
		this.serverInstanceNoList.add(serverInstanceNoListItem);
		return this;
	}

	 /**
	 * 서버인스턴스번호리스트
	 * @return serverInstanceNoList
	**/
	public List<String> getServerInstanceNoList() {
		return serverInstanceNoList;
	}

	public void setServerInstanceNoList(List<String> serverInstanceNoList) {
		this.serverInstanceNoList = serverInstanceNoList;
	}

	public StopServerInstancesRequest responseFormatType(String responseFormatType) {
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
		StopServerInstancesRequest stopServerInstancesRequest = (StopServerInstancesRequest) o;
		return Objects.equals(this.regionCode, stopServerInstancesRequest.regionCode) &&
				Objects.equals(this.serverInstanceNoList, stopServerInstancesRequest.serverInstanceNoList) &&
				Objects.equals(this.responseFormatType, stopServerInstancesRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, serverInstanceNoList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class StopServerInstancesRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		serverInstanceNoList: ").append(toIndentedString(serverInstanceNoList)).append("\n");
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

