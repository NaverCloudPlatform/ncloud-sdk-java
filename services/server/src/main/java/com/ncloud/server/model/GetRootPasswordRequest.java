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
 * GetRootPasswordRequest
 */
public class GetRootPasswordRequest {
	private String privateKey = null;

	private String serverInstanceNo = null;

	private String responseFormatType = null;

	public GetRootPasswordRequest privateKey(String privateKey) {
		this.privateKey = privateKey;
		return this;
	}

	 /**
	 * 개인키
	 * @return privateKey
	**/
	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

	public GetRootPasswordRequest serverInstanceNo(String serverInstanceNo) {
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

	public GetRootPasswordRequest responseFormatType(String responseFormatType) {
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
		GetRootPasswordRequest getRootPasswordRequest = (GetRootPasswordRequest) o;
		return Objects.equals(this.privateKey, getRootPasswordRequest.privateKey) &&
				Objects.equals(this.serverInstanceNo, getRootPasswordRequest.serverInstanceNo) &&
				Objects.equals(this.responseFormatType, getRootPasswordRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(privateKey, serverInstanceNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetRootPasswordRequest {\n");
		
		sb.append("		privateKey: ").append(toIndentedString(privateKey)).append("\n");
		sb.append("		serverInstanceNo: ").append(toIndentedString(serverInstanceNo)).append("\n");
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

