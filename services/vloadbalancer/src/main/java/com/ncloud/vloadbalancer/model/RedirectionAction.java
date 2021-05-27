/*
 * vloadbalancer
 * VPC Load Balancer 관련 API<br/>https://ncloud.apigw.ntruss.com/vloadbalancer/v2
 *
 * OpenAPI spec version: 2020-12-22T09:19:59Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vloadbalancer.model;

import java.util.Objects;

/**
 * RedirectionAction
 */
public class RedirectionAction {
	private String protocol = null;

	private String port = null;

	private String host = null;

	private String path = null;

	private String query = null;

	private String statusCode = null;

	public RedirectionAction protocol(String protocol) {
		this.protocol = protocol;
		return this;
	}

	 /**
	 * 프로토콜
	 * @return protocol
	**/
	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public RedirectionAction port(String port) {
		this.port = port;
		return this;
	}

	 /**
	 * 포트
	 * @return port
	**/
	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public RedirectionAction host(String host) {
		this.host = host;
		return this;
	}

	 /**
	 * 호스트
	 * @return host
	**/
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public RedirectionAction path(String path) {
		this.path = path;
		return this;
	}

	 /**
	 * 경로
	 * @return path
	**/
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public RedirectionAction query(String query) {
		this.query = query;
		return this;
	}

	 /**
	 * 쿼리
	 * @return query
	**/
	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public RedirectionAction statusCode(String statusCode) {
		this.statusCode = statusCode;
		return this;
	}

	 /**
	 * 상태코드
	 * @return statusCode
	**/
	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RedirectionAction redirectionAction = (RedirectionAction) o;
		return Objects.equals(this.protocol, redirectionAction.protocol) &&
				Objects.equals(this.port, redirectionAction.port) &&
				Objects.equals(this.host, redirectionAction.host) &&
				Objects.equals(this.path, redirectionAction.path) &&
				Objects.equals(this.query, redirectionAction.query) &&
				Objects.equals(this.statusCode, redirectionAction.statusCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(protocol, port, host, path, query, statusCode);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RedirectionAction {\n");
		
		sb.append("		protocol: ").append(toIndentedString(protocol)).append("\n");
		sb.append("		port: ").append(toIndentedString(port)).append("\n");
		sb.append("		host: ").append(toIndentedString(host)).append("\n");
		sb.append("		path: ").append(toIndentedString(path)).append("\n");
		sb.append("		query: ").append(toIndentedString(query)).append("\n");
		sb.append("		statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

