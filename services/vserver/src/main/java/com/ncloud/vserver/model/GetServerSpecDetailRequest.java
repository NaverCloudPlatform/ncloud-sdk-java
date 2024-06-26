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

/**
 * GetServerSpecDetailRequest
 */
public class GetServerSpecDetailRequest {
	private String regionCode = null;

	private String serverSpecCode = null;

	public GetServerSpecDetailRequest regionCode(String regionCode) {
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

	public GetServerSpecDetailRequest serverSpecCode(String serverSpecCode) {
		this.serverSpecCode = serverSpecCode;
		return this;
	}

	 /**
	 * 서버스펙코드
	 * @return serverSpecCode
	**/
	public String getServerSpecCode() {
		return serverSpecCode;
	}

	public void setServerSpecCode(String serverSpecCode) {
		this.serverSpecCode = serverSpecCode;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GetServerSpecDetailRequest getServerSpecDetailRequest = (GetServerSpecDetailRequest) o;
		return Objects.equals(this.regionCode, getServerSpecDetailRequest.regionCode) &&
				Objects.equals(this.serverSpecCode, getServerSpecDetailRequest.serverSpecCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, serverSpecCode);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetServerSpecDetailRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		serverSpecCode: ").append(toIndentedString(serverSpecCode)).append("\n");
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

