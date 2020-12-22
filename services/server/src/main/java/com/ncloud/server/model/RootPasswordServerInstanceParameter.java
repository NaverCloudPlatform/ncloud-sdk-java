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
 * RootPasswordServerInstanceParameter
 */
public class RootPasswordServerInstanceParameter {
	private String serverInstanceNo = null;

	private String privateKey = null;

	public RootPasswordServerInstanceParameter serverInstanceNo(String serverInstanceNo) {
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

	public RootPasswordServerInstanceParameter privateKey(String privateKey) {
		this.privateKey = privateKey;
		return this;
	}

	 /**
	 * 사설키
	 * @return privateKey
	**/
	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RootPasswordServerInstanceParameter rootPasswordServerInstanceParameter = (RootPasswordServerInstanceParameter) o;
		return Objects.equals(this.serverInstanceNo, rootPasswordServerInstanceParameter.serverInstanceNo) &&
				Objects.equals(this.privateKey, rootPasswordServerInstanceParameter.privateKey);
	}

	@Override
	public int hashCode() {
		return Objects.hash(serverInstanceNo, privateKey);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RootPasswordServerInstanceParameter {\n");
		
		sb.append("		serverInstanceNo: ").append(toIndentedString(serverInstanceNo)).append("\n");
		sb.append("		privateKey: ").append(toIndentedString(privateKey)).append("\n");
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

