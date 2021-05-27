/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * OpenAPI spec version: 2021-03-04T10:39:42Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.server.model;

import java.util.Objects;

/**
 * DetachNetworkInterfaceRequest
 */
public class DetachNetworkInterfaceRequest {
	private String networkInterfaceNo = null;

	private String serverInstanceNo = null;

	public DetachNetworkInterfaceRequest networkInterfaceNo(String networkInterfaceNo) {
		this.networkInterfaceNo = networkInterfaceNo;
		return this;
	}

	 /**
	 * Network Interface번호
	 * @return networkInterfaceNo
	**/
	public String getNetworkInterfaceNo() {
		return networkInterfaceNo;
	}

	public void setNetworkInterfaceNo(String networkInterfaceNo) {
		this.networkInterfaceNo = networkInterfaceNo;
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


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DetachNetworkInterfaceRequest detachNetworkInterfaceRequest = (DetachNetworkInterfaceRequest) o;
		return Objects.equals(this.networkInterfaceNo, detachNetworkInterfaceRequest.networkInterfaceNo) &&
				Objects.equals(this.serverInstanceNo, detachNetworkInterfaceRequest.serverInstanceNo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(networkInterfaceNo, serverInstanceNo);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DetachNetworkInterfaceRequest {\n");
		
		sb.append("		networkInterfaceNo: ").append(toIndentedString(networkInterfaceNo)).append("\n");
		sb.append("		serverInstanceNo: ").append(toIndentedString(serverInstanceNo)).append("\n");
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

