/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * OpenAPI spec version: 2020-11-18T09:44:01Z
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
 * CreateNetworkInterfaceResponse
 */
public class CreateNetworkInterfaceResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	public CreateNetworkInterfaceResponse requestId(String requestId) {
		this.requestId = requestId;
		return this;
	}

	 /**
	 * Get requestId
	 * @return requestId
	**/
	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public CreateNetworkInterfaceResponse returnCode(String returnCode) {
		this.returnCode = returnCode;
		return this;
	}

	 /**
	 * Get returnCode
	 * @return returnCode
	**/
	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public CreateNetworkInterfaceResponse returnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
		return this;
	}

	 /**
	 * Get returnMessage
	 * @return returnMessage
	**/
	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CreateNetworkInterfaceResponse createNetworkInterfaceResponse = (CreateNetworkInterfaceResponse) o;
		return Objects.equals(this.requestId, createNetworkInterfaceResponse.requestId) &&
				Objects.equals(this.returnCode, createNetworkInterfaceResponse.returnCode) &&
				Objects.equals(this.returnMessage, createNetworkInterfaceResponse.returnMessage);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateNetworkInterfaceResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
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

