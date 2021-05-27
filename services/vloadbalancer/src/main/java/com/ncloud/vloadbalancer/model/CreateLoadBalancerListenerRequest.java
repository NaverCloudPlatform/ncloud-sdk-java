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
 * CreateLoadBalancerListenerRequest
 */
public class CreateLoadBalancerListenerRequest {
	private String regionCode = null;

	private String sslCertificateNo = null;

	private Boolean useHttp2 = null;

	private String loadBalancerInstanceNo = null;

	private Integer port = null;

	private String protocolTypeCode = null;

	private String tlsMinVersionTypeCode = null;

	private String targetGroupNo = null;

	private String responseFormatType = null;

	public CreateLoadBalancerListenerRequest regionCode(String regionCode) {
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

	public CreateLoadBalancerListenerRequest sslCertificateNo(String sslCertificateNo) {
		this.sslCertificateNo = sslCertificateNo;
		return this;
	}

	 /**
	 * SSL인증서번호
	 * @return sslCertificateNo
	**/
	public String getSslCertificateNo() {
		return sslCertificateNo;
	}

	public void setSslCertificateNo(String sslCertificateNo) {
		this.sslCertificateNo = sslCertificateNo;
	}

	public CreateLoadBalancerListenerRequest useHttp2(Boolean useHttp2) {
		this.useHttp2 = useHttp2;
		return this;
	}

	 /**
	 * HTTP2사용여부
	 * @return useHttp2
	**/
	public Boolean isUseHttp2() {
		return useHttp2;
	}

	public void setUseHttp2(Boolean useHttp2) {
		this.useHttp2 = useHttp2;
	}

	public CreateLoadBalancerListenerRequest loadBalancerInstanceNo(String loadBalancerInstanceNo) {
		this.loadBalancerInstanceNo = loadBalancerInstanceNo;
		return this;
	}

	 /**
	 * 로드밸런서인스턴스번호
	 * @return loadBalancerInstanceNo
	**/
	public String getLoadBalancerInstanceNo() {
		return loadBalancerInstanceNo;
	}

	public void setLoadBalancerInstanceNo(String loadBalancerInstanceNo) {
		this.loadBalancerInstanceNo = loadBalancerInstanceNo;
	}

	public CreateLoadBalancerListenerRequest port(Integer port) {
		this.port = port;
		return this;
	}

	 /**
	 * 포트
	 * @return port
	**/
	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public CreateLoadBalancerListenerRequest protocolTypeCode(String protocolTypeCode) {
		this.protocolTypeCode = protocolTypeCode;
		return this;
	}

	 /**
	 * 프로토콜유형코드
	 * @return protocolTypeCode
	**/
	public String getProtocolTypeCode() {
		return protocolTypeCode;
	}

	public void setProtocolTypeCode(String protocolTypeCode) {
		this.protocolTypeCode = protocolTypeCode;
	}

	public CreateLoadBalancerListenerRequest tlsMinVersionTypeCode(String tlsMinVersionTypeCode) {
		this.tlsMinVersionTypeCode = tlsMinVersionTypeCode;
		return this;
	}

	 /**
	 * TLS최소지원버전유형코드
	 * @return tlsMinVersionTypeCode
	**/
	public String getTlsMinVersionTypeCode() {
		return tlsMinVersionTypeCode;
	}

	public void setTlsMinVersionTypeCode(String tlsMinVersionTypeCode) {
		this.tlsMinVersionTypeCode = tlsMinVersionTypeCode;
	}

	public CreateLoadBalancerListenerRequest targetGroupNo(String targetGroupNo) {
		this.targetGroupNo = targetGroupNo;
		return this;
	}

	 /**
	 * 타겟그룹번호
	 * @return targetGroupNo
	**/
	public String getTargetGroupNo() {
		return targetGroupNo;
	}

	public void setTargetGroupNo(String targetGroupNo) {
		this.targetGroupNo = targetGroupNo;
	}

	public CreateLoadBalancerListenerRequest responseFormatType(String responseFormatType) {
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
		CreateLoadBalancerListenerRequest createLoadBalancerListenerRequest = (CreateLoadBalancerListenerRequest) o;
		return Objects.equals(this.regionCode, createLoadBalancerListenerRequest.regionCode) &&
				Objects.equals(this.sslCertificateNo, createLoadBalancerListenerRequest.sslCertificateNo) &&
				Objects.equals(this.useHttp2, createLoadBalancerListenerRequest.useHttp2) &&
				Objects.equals(this.loadBalancerInstanceNo, createLoadBalancerListenerRequest.loadBalancerInstanceNo) &&
				Objects.equals(this.port, createLoadBalancerListenerRequest.port) &&
				Objects.equals(this.protocolTypeCode, createLoadBalancerListenerRequest.protocolTypeCode) &&
				Objects.equals(this.tlsMinVersionTypeCode, createLoadBalancerListenerRequest.tlsMinVersionTypeCode) &&
				Objects.equals(this.targetGroupNo, createLoadBalancerListenerRequest.targetGroupNo) &&
				Objects.equals(this.responseFormatType, createLoadBalancerListenerRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, sslCertificateNo, useHttp2, loadBalancerInstanceNo, port, protocolTypeCode, tlsMinVersionTypeCode, targetGroupNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateLoadBalancerListenerRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		sslCertificateNo: ").append(toIndentedString(sslCertificateNo)).append("\n");
		sb.append("		useHttp2: ").append(toIndentedString(useHttp2)).append("\n");
		sb.append("		loadBalancerInstanceNo: ").append(toIndentedString(loadBalancerInstanceNo)).append("\n");
		sb.append("		port: ").append(toIndentedString(port)).append("\n");
		sb.append("		protocolTypeCode: ").append(toIndentedString(protocolTypeCode)).append("\n");
		sb.append("		tlsMinVersionTypeCode: ").append(toIndentedString(tlsMinVersionTypeCode)).append("\n");
		sb.append("		targetGroupNo: ").append(toIndentedString(targetGroupNo)).append("\n");
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

