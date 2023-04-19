/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.server.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * RebootServerInstancesRequest
 */
public class RebootServerInstancesRequest {
	private List<String> serverInstanceNoList = new ArrayList<String>();

	private String responseFormatType = null;

	public RebootServerInstancesRequest serverInstanceNoList(List<String> serverInstanceNoList) {
		this.serverInstanceNoList = serverInstanceNoList;
		return this;
	}

	public RebootServerInstancesRequest addServerInstanceNoListItem(String serverInstanceNoListItem) {
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

	public RebootServerInstancesRequest responseFormatType(String responseFormatType) {
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
		RebootServerInstancesRequest rebootServerInstancesRequest = (RebootServerInstancesRequest) o;
		return Objects.equals(this.serverInstanceNoList, rebootServerInstancesRequest.serverInstanceNoList) &&
				Objects.equals(this.responseFormatType, rebootServerInstancesRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(serverInstanceNoList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RebootServerInstancesRequest {\n");
		
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

