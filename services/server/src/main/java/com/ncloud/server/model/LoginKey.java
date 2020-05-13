/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * OpenAPI spec version: 2019-10-17T10:28:43Z
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
 * LoginKey
 */
public class LoginKey {
	private String fingerprint = null;

	private String keyName = null;

	private String createDate = null;

	public LoginKey fingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
		return this;
	}

	 /**
	 * 핑거프린트
	 * @return fingerprint
	**/
	public String getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	public LoginKey keyName(String keyName) {
		this.keyName = keyName;
		return this;
	}

	 /**
	 * 키명
	 * @return keyName
	**/
	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public LoginKey createDate(String createDate) {
		this.createDate = createDate;
		return this;
	}

	 /**
	 * 생성일자
	 * @return createDate
	**/
	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LoginKey loginKey = (LoginKey) o;
		return Objects.equals(this.fingerprint, loginKey.fingerprint) &&
				Objects.equals(this.keyName, loginKey.keyName) &&
				Objects.equals(this.createDate, loginKey.createDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fingerprint, keyName, createDate);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LoginKey {\n");
		
		sb.append("		fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
		sb.append("		keyName: ").append(toIndentedString(keyName)).append("\n");
		sb.append("		createDate: ").append(toIndentedString(createDate)).append("\n");
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

