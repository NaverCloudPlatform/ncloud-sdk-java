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

/**
 * DeleteNetworkInterfaceRequest
 */
public class DeleteNetworkInterfaceRequest {
	private String networkInterfaceNo = null;

	public DeleteNetworkInterfaceRequest networkInterfaceNo(String networkInterfaceNo) {
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


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeleteNetworkInterfaceRequest deleteNetworkInterfaceRequest = (DeleteNetworkInterfaceRequest) o;
		return Objects.equals(this.networkInterfaceNo, deleteNetworkInterfaceRequest.networkInterfaceNo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(networkInterfaceNo);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeleteNetworkInterfaceRequest {\n");
		
		sb.append("		networkInterfaceNo: ").append(toIndentedString(networkInterfaceNo)).append("\n");
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

