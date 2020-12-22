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

/**
 * LoadBalancerRuleParameter
 */
public class LoadBalancerRuleParameter {
	private String protocolTypeCode = null;

	private Integer loadBalancerPort = null;

	private Integer serverPort = null;

	private String l7HealthCheckPath = null;

	private String certificateName = null;

	private String proxyProtocolUseYn = null;

	public LoadBalancerRuleParameter protocolTypeCode(String protocolTypeCode) {
		this.protocolTypeCode = protocolTypeCode;
		return this;
	}

	 /**
	 * 프로토콜구분코드
	 * @return protocolTypeCode
	**/
	public String getProtocolTypeCode() {
		return protocolTypeCode;
	}

	public void setProtocolTypeCode(String protocolTypeCode) {
		this.protocolTypeCode = protocolTypeCode;
	}

	public LoadBalancerRuleParameter loadBalancerPort(Integer loadBalancerPort) {
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

	public LoadBalancerRuleParameter serverPort(Integer serverPort) {
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

	public LoadBalancerRuleParameter l7HealthCheckPath(String l7HealthCheckPath) {
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

	public LoadBalancerRuleParameter certificateName(String certificateName) {
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

	public LoadBalancerRuleParameter proxyProtocolUseYn(String proxyProtocolUseYn) {
		this.proxyProtocolUseYn = proxyProtocolUseYn;
		return this;
	}

	 /**
	 * ProxyProtocol사용여부
	 * @return proxyProtocolUseYn
	**/
	public String getProxyProtocolUseYn() {
		return proxyProtocolUseYn;
	}

	public void setProxyProtocolUseYn(String proxyProtocolUseYn) {
		this.proxyProtocolUseYn = proxyProtocolUseYn;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LoadBalancerRuleParameter loadBalancerRuleParameter = (LoadBalancerRuleParameter) o;
		return Objects.equals(this.protocolTypeCode, loadBalancerRuleParameter.protocolTypeCode) &&
				Objects.equals(this.loadBalancerPort, loadBalancerRuleParameter.loadBalancerPort) &&
				Objects.equals(this.serverPort, loadBalancerRuleParameter.serverPort) &&
				Objects.equals(this.l7HealthCheckPath, loadBalancerRuleParameter.l7HealthCheckPath) &&
				Objects.equals(this.certificateName, loadBalancerRuleParameter.certificateName) &&
				Objects.equals(this.proxyProtocolUseYn, loadBalancerRuleParameter.proxyProtocolUseYn);
	}

	@Override
	public int hashCode() {
		return Objects.hash(protocolTypeCode, loadBalancerPort, serverPort, l7HealthCheckPath, certificateName, proxyProtocolUseYn);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LoadBalancerRuleParameter {\n");
		
		sb.append("		protocolTypeCode: ").append(toIndentedString(protocolTypeCode)).append("\n");
		sb.append("		loadBalancerPort: ").append(toIndentedString(loadBalancerPort)).append("\n");
		sb.append("		serverPort: ").append(toIndentedString(serverPort)).append("\n");
		sb.append("		l7HealthCheckPath: ").append(toIndentedString(l7HealthCheckPath)).append("\n");
		sb.append("		certificateName: ").append(toIndentedString(certificateName)).append("\n");
		sb.append("		proxyProtocolUseYn: ").append(toIndentedString(proxyProtocolUseYn)).append("\n");
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

