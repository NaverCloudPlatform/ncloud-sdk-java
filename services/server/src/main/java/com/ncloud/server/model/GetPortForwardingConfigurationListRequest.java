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
 * GetPortForwardingConfigurationListRequest
 */
public class GetPortForwardingConfigurationListRequest {
	private String regionNo = null;

	private List<String> serverInstanceNoList = null;

	private List<String> portForwardingPublicIpList = null;

	private String responseFormatType = null;

	public GetPortForwardingConfigurationListRequest regionNo(String regionNo) {
		this.regionNo = regionNo;
		return this;
	}

	 /**
	 * 리전번호
	 * @return regionNo
	**/
	public String getRegionNo() {
		return regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
	}

	public GetPortForwardingConfigurationListRequest serverInstanceNoList(List<String> serverInstanceNoList) {
		this.serverInstanceNoList = serverInstanceNoList;
		return this;
	}

	public GetPortForwardingConfigurationListRequest addServerInstanceNoListItem(String serverInstanceNoListItem) {
		if (this.serverInstanceNoList == null) {
			this.serverInstanceNoList = new ArrayList<String>();
		}
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

	public GetPortForwardingConfigurationListRequest portForwardingPublicIpList(List<String> portForwardingPublicIpList) {
		this.portForwardingPublicIpList = portForwardingPublicIpList;
		return this;
	}

	public GetPortForwardingConfigurationListRequest addPortForwardingPublicIpListItem(String portForwardingPublicIpListItem) {
		if (this.portForwardingPublicIpList == null) {
			this.portForwardingPublicIpList = new ArrayList<String>();
		}
		this.portForwardingPublicIpList.add(portForwardingPublicIpListItem);
		return this;
	}

	 /**
	 * 포트포워딩공인IP리스트
	 * @return portForwardingPublicIpList
	**/
	public List<String> getPortForwardingPublicIpList() {
		return portForwardingPublicIpList;
	}

	public void setPortForwardingPublicIpList(List<String> portForwardingPublicIpList) {
		this.portForwardingPublicIpList = portForwardingPublicIpList;
	}

	public GetPortForwardingConfigurationListRequest responseFormatType(String responseFormatType) {
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
		GetPortForwardingConfigurationListRequest getPortForwardingConfigurationListRequest = (GetPortForwardingConfigurationListRequest) o;
		return Objects.equals(this.regionNo, getPortForwardingConfigurationListRequest.regionNo) &&
				Objects.equals(this.serverInstanceNoList, getPortForwardingConfigurationListRequest.serverInstanceNoList) &&
				Objects.equals(this.portForwardingPublicIpList, getPortForwardingConfigurationListRequest.portForwardingPublicIpList) &&
				Objects.equals(this.responseFormatType, getPortForwardingConfigurationListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionNo, serverInstanceNoList, portForwardingPublicIpList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetPortForwardingConfigurationListRequest {\n");
		
		sb.append("		regionNo: ").append(toIndentedString(regionNo)).append("\n");
		sb.append("		serverInstanceNoList: ").append(toIndentedString(serverInstanceNoList)).append("\n");
		sb.append("		portForwardingPublicIpList: ").append(toIndentedString(portForwardingPublicIpList)).append("\n");
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

