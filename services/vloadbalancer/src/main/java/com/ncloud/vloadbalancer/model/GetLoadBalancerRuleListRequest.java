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

/**
 * GetLoadBalancerRuleListRequest
 */
public class GetLoadBalancerRuleListRequest {
	private String regionCode = null;

	private String loadBalancerListenerNo = null;

	private String responseFormatType = null;

	public GetLoadBalancerRuleListRequest regionCode(String regionCode) {
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

	public GetLoadBalancerRuleListRequest loadBalancerListenerNo(String loadBalancerListenerNo) {
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

	public GetLoadBalancerRuleListRequest responseFormatType(String responseFormatType) {
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
		GetLoadBalancerRuleListRequest getLoadBalancerRuleListRequest = (GetLoadBalancerRuleListRequest) o;
		return Objects.equals(this.regionCode, getLoadBalancerRuleListRequest.regionCode) &&
				Objects.equals(this.loadBalancerListenerNo, getLoadBalancerRuleListRequest.loadBalancerListenerNo) &&
				Objects.equals(this.responseFormatType, getLoadBalancerRuleListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, loadBalancerListenerNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetLoadBalancerRuleListRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		loadBalancerListenerNo: ").append(toIndentedString(loadBalancerListenerNo)).append("\n");
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

