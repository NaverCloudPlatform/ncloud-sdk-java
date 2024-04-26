/*
 * loadbalancer
 * <br/>https://ncloud.apigw.ntruss.com/loadbalancer/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.loadbalancer.model;

import java.util.Objects;
import com.ncloud.loadbalancer.model.CommonCode;

/**
 * LoadBalancerRule
 */
public class LoadBalancerRule {
	private CommonCode protocolType = null;

	private Integer loadBalancerPort = null;

	private Integer serverPort = null;

	private String l7HealthCheckPath = null;

	private String certificateName = null;

	private String proxyProtocolUseYn = null;

	private String stickySessionUseYn = null;

	private String http2UseYn = null;

	private CommonCode serverProtocolType = null;

	public LoadBalancerRule protocolType(CommonCode protocolType) {
		this.protocolType = protocolType;
		return this;
	}

	 /**
	 * 프로토콜
	 * @return protocolType
	**/
	public CommonCode getProtocolType() {
		return protocolType;
	}

	public void setProtocolType(CommonCode protocolType) {
		this.protocolType = protocolType;
	}

	public LoadBalancerRule loadBalancerPort(Integer loadBalancerPort) {
		this.loadBalancerPort = loadBalancerPort;
		return this;
	}

	 /**
	 * 로드밸런서포트
	 * @return loadBalancerPort
	**/
	public Integer getLoadBalancerPort() {
		return loadBalancerPort;
	}

	public void setLoadBalancerPort(Integer loadBalancerPort) {
		this.loadBalancerPort = loadBalancerPort;
	}

	public LoadBalancerRule serverPort(Integer serverPort) {
		this.serverPort = serverPort;
		return this;
	}

	 /**
	 * 서버포트
	 * @return serverPort
	**/
	public Integer getServerPort() {
		return serverPort;
	}

	public void setServerPort(Integer serverPort) {
		this.serverPort = serverPort;
	}

	public LoadBalancerRule l7HealthCheckPath(String l7HealthCheckPath) {
		this.l7HealthCheckPath = l7HealthCheckPath;
		return this;
	}

	 /**
	 * l7헬스체크경로
	 * @return l7HealthCheckPath
	**/
	public String getL7HealthCheckPath() {
		return l7HealthCheckPath;
	}

	public void setL7HealthCheckPath(String l7HealthCheckPath) {
		this.l7HealthCheckPath = l7HealthCheckPath;
	}

	public LoadBalancerRule certificateName(String certificateName) {
		this.certificateName = certificateName;
		return this;
	}

	 /**
	 * 인증서명
	 * @return certificateName
	**/
	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public LoadBalancerRule proxyProtocolUseYn(String proxyProtocolUseYn) {
		this.proxyProtocolUseYn = proxyProtocolUseYn;
		return this;
	}

	 /**
	 * 프록시프로토콜 사용여부
	 * @return proxyProtocolUseYn
	**/
	public String getProxyProtocolUseYn() {
		return proxyProtocolUseYn;
	}

	public void setProxyProtocolUseYn(String proxyProtocolUseYn) {
		this.proxyProtocolUseYn = proxyProtocolUseYn;
	}

	public LoadBalancerRule stickySessionUseYn(String stickySessionUseYn) {
		this.stickySessionUseYn = stickySessionUseYn;
		return this;
	}

	 /**
	 * 세션별접근사용여부
	 * @return stickySessionUseYn
	**/
	public String getStickySessionUseYn() {
		return stickySessionUseYn;
	}

	public void setStickySessionUseYn(String stickySessionUseYn) {
		this.stickySessionUseYn = stickySessionUseYn;
	}

	public LoadBalancerRule http2UseYn(String http2UseYn) {
		this.http2UseYn = http2UseYn;
		return this;
	}

	 /**
	 * HTTP/2프로토콜사용여부
	 * @return http2UseYn
	**/
	public String getHttp2UseYn() {
		return http2UseYn;
	}

	public void setHttp2UseYn(String http2UseYn) {
		this.http2UseYn = http2UseYn;
	}

	public LoadBalancerRule serverProtocolType(CommonCode serverProtocolType) {
		this.serverProtocolType = serverProtocolType;
		return this;
	}

	 /**
	 * 서버프로토콜
	 * @return serverProtocolType
	**/
	public CommonCode getServerProtocolType() {
		return serverProtocolType;
	}

	public void setServerProtocolType(CommonCode serverProtocolType) {
		this.serverProtocolType = serverProtocolType;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LoadBalancerRule loadBalancerRule = (LoadBalancerRule) o;
		return Objects.equals(this.protocolType, loadBalancerRule.protocolType) &&
				Objects.equals(this.loadBalancerPort, loadBalancerRule.loadBalancerPort) &&
				Objects.equals(this.serverPort, loadBalancerRule.serverPort) &&
				Objects.equals(this.l7HealthCheckPath, loadBalancerRule.l7HealthCheckPath) &&
				Objects.equals(this.certificateName, loadBalancerRule.certificateName) &&
				Objects.equals(this.proxyProtocolUseYn, loadBalancerRule.proxyProtocolUseYn) &&
				Objects.equals(this.stickySessionUseYn, loadBalancerRule.stickySessionUseYn) &&
				Objects.equals(this.http2UseYn, loadBalancerRule.http2UseYn) &&
				Objects.equals(this.serverProtocolType, loadBalancerRule.serverProtocolType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(protocolType, loadBalancerPort, serverPort, l7HealthCheckPath, certificateName, proxyProtocolUseYn, stickySessionUseYn, http2UseYn, serverProtocolType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LoadBalancerRule {\n");
		
		sb.append("		protocolType: ").append(toIndentedString(protocolType)).append("\n");
		sb.append("		loadBalancerPort: ").append(toIndentedString(loadBalancerPort)).append("\n");
		sb.append("		serverPort: ").append(toIndentedString(serverPort)).append("\n");
		sb.append("		l7HealthCheckPath: ").append(toIndentedString(l7HealthCheckPath)).append("\n");
		sb.append("		certificateName: ").append(toIndentedString(certificateName)).append("\n");
		sb.append("		proxyProtocolUseYn: ").append(toIndentedString(proxyProtocolUseYn)).append("\n");
		sb.append("		stickySessionUseYn: ").append(toIndentedString(stickySessionUseYn)).append("\n");
		sb.append("		http2UseYn: ").append(toIndentedString(http2UseYn)).append("\n");
		sb.append("		serverProtocolType: ").append(toIndentedString(serverProtocolType)).append("\n");
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

