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
 * GetLoadBalancerTargetServerInstanceListRequest
 */
public class GetLoadBalancerTargetServerInstanceListRequest {
	private String internetLineTypeCode = null;

	private String networkUsageTypeCode = null;

	private String regionNo = null;

	private String responseFormatType = null;

	public GetLoadBalancerTargetServerInstanceListRequest internetLineTypeCode(String internetLineTypeCode) {
		this.internetLineTypeCode = internetLineTypeCode;
		return this;
	}

	 /**
	 * 인터넷라인구분코드
	 * @return internetLineTypeCode
	**/
	public String getInternetLineTypeCode() {
		return internetLineTypeCode;
	}

	public void setInternetLineTypeCode(String internetLineTypeCode) {
		this.internetLineTypeCode = internetLineTypeCode;
	}

	public GetLoadBalancerTargetServerInstanceListRequest networkUsageTypeCode(String networkUsageTypeCode) {
		this.networkUsageTypeCode = networkUsageTypeCode;
		return this;
	}

	 /**
	 * 네트워크용도구분코드
	 * @return networkUsageTypeCode
	**/
	public String getNetworkUsageTypeCode() {
		return networkUsageTypeCode;
	}

	public void setNetworkUsageTypeCode(String networkUsageTypeCode) {
		this.networkUsageTypeCode = networkUsageTypeCode;
	}

	public GetLoadBalancerTargetServerInstanceListRequest regionNo(String regionNo) {
		this.regionNo = regionNo;
		return this;
	}

	 /**
	 * 리전번호
	 * @return regionNo
	**/
	public String getRegionNo() {
		return regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
	}

	public GetLoadBalancerTargetServerInstanceListRequest responseFormatType(String responseFormatType) {
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
		GetLoadBalancerTargetServerInstanceListRequest getLoadBalancerTargetServerInstanceListRequest = (GetLoadBalancerTargetServerInstanceListRequest) o;
		return Objects.equals(this.internetLineTypeCode, getLoadBalancerTargetServerInstanceListRequest.internetLineTypeCode) &&
				Objects.equals(this.networkUsageTypeCode, getLoadBalancerTargetServerInstanceListRequest.networkUsageTypeCode) &&
				Objects.equals(this.regionNo, getLoadBalancerTargetServerInstanceListRequest.regionNo) &&
				Objects.equals(this.responseFormatType, getLoadBalancerTargetServerInstanceListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(internetLineTypeCode, networkUsageTypeCode, regionNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetLoadBalancerTargetServerInstanceListRequest {\n");
		
		sb.append("		internetLineTypeCode: ").append(toIndentedString(internetLineTypeCode)).append("\n");
		sb.append("		networkUsageTypeCode: ").append(toIndentedString(networkUsageTypeCode)).append("\n");
		sb.append("		regionNo: ").append(toIndentedString(regionNo)).append("\n");
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

