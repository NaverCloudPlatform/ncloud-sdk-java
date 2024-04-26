/*
 * vloadbalancer
 * VPC Load Balancer 관련 API<br/>https://ncloud.apigw.ntruss.com/vloadbalancer/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vloadbalancer.model;

import java.util.Objects;
import com.ncloud.vloadbalancer.model.CommonCode;
import java.util.ArrayList;
import java.util.List;

/**
 * LoadBalancerListener
 */
public class LoadBalancerListener {
	private String loadBalancerInstanceNo = null;

	private String loadBalancerListenerNo = null;

	private CommonCode protocolType = null;

	private Integer port = null;

	private Boolean useHttp2 = null;

	private String sslCertificateNo = null;

	private CommonCode tlsMinVersionType = null;

	private List<String> loadBalancerRuleNoList = null;

	private List<String> cipherSuiteList = null;

	public LoadBalancerListener loadBalancerInstanceNo(String loadBalancerInstanceNo) {
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

	public LoadBalancerListener loadBalancerListenerNo(String loadBalancerListenerNo) {
		this.loadBalancerListenerNo = loadBalancerListenerNo;
		return this;
	}

	 /**
	 * 로드밸런서리스너번호
	 * @return loadBalancerListenerNo
	**/
	public String getLoadBalancerListenerNo() {
		return loadBalancerListenerNo;
	}

	public void setLoadBalancerListenerNo(String loadBalancerListenerNo) {
		this.loadBalancerListenerNo = loadBalancerListenerNo;
	}

	public LoadBalancerListener protocolType(CommonCode protocolType) {
		this.protocolType = protocolType;
		return this;
	}

	 /**
	 * 프로토콜유형
	 * @return protocolType
	**/
	public CommonCode getProtocolType() {
		return protocolType;
	}

	public void setProtocolType(CommonCode protocolType) {
		this.protocolType = protocolType;
	}

	public LoadBalancerListener port(Integer port) {
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

	public LoadBalancerListener useHttp2(Boolean useHttp2) {
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

	public LoadBalancerListener sslCertificateNo(String sslCertificateNo) {
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

	public LoadBalancerListener tlsMinVersionType(CommonCode tlsMinVersionType) {
		this.tlsMinVersionType = tlsMinVersionType;
		return this;
	}

	 /**
	 * TLS최소지원버전유형
	 * @return tlsMinVersionType
	**/
	public CommonCode getTlsMinVersionType() {
		return tlsMinVersionType;
	}

	public void setTlsMinVersionType(CommonCode tlsMinVersionType) {
		this.tlsMinVersionType = tlsMinVersionType;
	}

	public LoadBalancerListener loadBalancerRuleNoList(List<String> loadBalancerRuleNoList) {
		this.loadBalancerRuleNoList = loadBalancerRuleNoList;
		return this;
	}

	public LoadBalancerListener addLoadBalancerRuleNoListItem(String loadBalancerRuleNoListItem) {
		if (this.loadBalancerRuleNoList == null) {
			this.loadBalancerRuleNoList = new ArrayList<String>();
		}
		this.loadBalancerRuleNoList.add(loadBalancerRuleNoListItem);
		return this;
	}

	 /**
	 * 로드밸런서룰번호리스트
	 * @return loadBalancerRuleNoList
	**/
	public List<String> getLoadBalancerRuleNoList() {
		return loadBalancerRuleNoList;
	}

	public void setLoadBalancerRuleNoList(List<String> loadBalancerRuleNoList) {
		this.loadBalancerRuleNoList = loadBalancerRuleNoList;
	}

	public LoadBalancerListener cipherSuiteList(List<String> cipherSuiteList) {
		this.cipherSuiteList = cipherSuiteList;
		return this;
	}

	public LoadBalancerListener addCipherSuiteListItem(String cipherSuiteListItem) {
		if (this.cipherSuiteList == null) {
			this.cipherSuiteList = new ArrayList<String>();
		}
		this.cipherSuiteList.add(cipherSuiteListItem);
		return this;
	}

	 /**
	 * 암호화스위트리스트
	 * @return cipherSuiteList
	**/
	public List<String> getCipherSuiteList() {
		return cipherSuiteList;
	}

	public void setCipherSuiteList(List<String> cipherSuiteList) {
		this.cipherSuiteList = cipherSuiteList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LoadBalancerListener loadBalancerListener = (LoadBalancerListener) o;
		return Objects.equals(this.loadBalancerInstanceNo, loadBalancerListener.loadBalancerInstanceNo) &&
				Objects.equals(this.loadBalancerListenerNo, loadBalancerListener.loadBalancerListenerNo) &&
				Objects.equals(this.protocolType, loadBalancerListener.protocolType) &&
				Objects.equals(this.port, loadBalancerListener.port) &&
				Objects.equals(this.useHttp2, loadBalancerListener.useHttp2) &&
				Objects.equals(this.sslCertificateNo, loadBalancerListener.sslCertificateNo) &&
				Objects.equals(this.tlsMinVersionType, loadBalancerListener.tlsMinVersionType) &&
				Objects.equals(this.loadBalancerRuleNoList, loadBalancerListener.loadBalancerRuleNoList) &&
				Objects.equals(this.cipherSuiteList, loadBalancerListener.cipherSuiteList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(loadBalancerInstanceNo, loadBalancerListenerNo, protocolType, port, useHttp2, sslCertificateNo, tlsMinVersionType, loadBalancerRuleNoList, cipherSuiteList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LoadBalancerListener {\n");
		
		sb.append("		loadBalancerInstanceNo: ").append(toIndentedString(loadBalancerInstanceNo)).append("\n");
		sb.append("		loadBalancerListenerNo: ").append(toIndentedString(loadBalancerListenerNo)).append("\n");
		sb.append("		protocolType: ").append(toIndentedString(protocolType)).append("\n");
		sb.append("		port: ").append(toIndentedString(port)).append("\n");
		sb.append("		useHttp2: ").append(toIndentedString(useHttp2)).append("\n");
		sb.append("		sslCertificateNo: ").append(toIndentedString(sslCertificateNo)).append("\n");
		sb.append("		tlsMinVersionType: ").append(toIndentedString(tlsMinVersionType)).append("\n");
		sb.append("		loadBalancerRuleNoList: ").append(toIndentedString(loadBalancerRuleNoList)).append("\n");
		sb.append("		cipherSuiteList: ").append(toIndentedString(cipherSuiteList)).append("\n");
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

