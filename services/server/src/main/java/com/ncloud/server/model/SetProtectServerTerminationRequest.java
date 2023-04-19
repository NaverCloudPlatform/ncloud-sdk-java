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
 * SetProtectServerTerminationRequest
 */
public class SetProtectServerTerminationRequest {
	private String serverInstanceNo = null;

	private Boolean isProtectServerTermination = null;

	private String responseFormatType = null;

	public SetProtectServerTerminationRequest serverInstanceNo(String serverInstanceNo) {
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

	public SetProtectServerTerminationRequest isProtectServerTermination(Boolean isProtectServerTermination) {
		this.isProtectServerTermination = isProtectServerTermination;
		return this;
	}

	 /**
	 * 반납보호여부
	 * @return isProtectServerTermination
	**/
	public Boolean isIsProtectServerTermination() {
		return isProtectServerTermination;
	}

	public void setIsProtectServerTermination(Boolean isProtectServerTermination) {
		this.isProtectServerTermination = isProtectServerTermination;
	}

	public SetProtectServerTerminationRequest responseFormatType(String responseFormatType) {
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
		SetProtectServerTerminationRequest setProtectServerTerminationRequest = (SetProtectServerTerminationRequest) o;
		return Objects.equals(this.serverInstanceNo, setProtectServerTerminationRequest.serverInstanceNo) &&
				Objects.equals(this.isProtectServerTermination, setProtectServerTerminationRequest.isProtectServerTermination) &&
				Objects.equals(this.responseFormatType, setProtectServerTerminationRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(serverInstanceNo, isProtectServerTermination, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SetProtectServerTerminationRequest {\n");
		
		sb.append("		serverInstanceNo: ").append(toIndentedString(serverInstanceNo)).append("\n");
		sb.append("		isProtectServerTermination: ").append(toIndentedString(isProtectServerTermination)).append("\n");
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
