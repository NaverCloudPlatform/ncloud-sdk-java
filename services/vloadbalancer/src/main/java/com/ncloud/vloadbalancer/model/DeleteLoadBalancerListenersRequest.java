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
import java.util.ArrayList;
import java.util.List;

/**
 * DeleteLoadBalancerListenersRequest
 */
public class DeleteLoadBalancerListenersRequest {
	private String regionCode = null;

	private List<String> loadBalancerListenerNoList = new ArrayList<String>();

	private String responseFormatType = null;

	public DeleteLoadBalancerListenersRequest regionCode(String regionCode) {
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

	public DeleteLoadBalancerListenersRequest loadBalancerListenerNoList(List<String> loadBalancerListenerNoList) {
		this.loadBalancerListenerNoList = loadBalancerListenerNoList;
		return this;
	}

	public DeleteLoadBalancerListenersRequest addLoadBalancerListenerNoListItem(String loadBalancerListenerNoListItem) {
		this.loadBalancerListenerNoList.add(loadBalancerListenerNoListItem);
		return this;
	}

	 /**
	 * 로드밸런서리스너번호리스트
	 * @return loadBalancerListenerNoList
	**/
	public List<String> getLoadBalancerListenerNoList() {
		return loadBalancerListenerNoList;
	}

	public void setLoadBalancerListenerNoList(List<String> loadBalancerListenerNoList) {
		this.loadBalancerListenerNoList = loadBalancerListenerNoList;
	}

	public DeleteLoadBalancerListenersRequest responseFormatType(String responseFormatType) {
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
		DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest = (DeleteLoadBalancerListenersRequest) o;
		return Objects.equals(this.regionCode, deleteLoadBalancerListenersRequest.regionCode) &&
				Objects.equals(this.loadBalancerListenerNoList, deleteLoadBalancerListenersRequest.loadBalancerListenerNoList) &&
				Objects.equals(this.responseFormatType, deleteLoadBalancerListenersRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, loadBalancerListenerNoList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeleteLoadBalancerListenersRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		loadBalancerListenerNoList: ").append(toIndentedString(loadBalancerListenerNoList)).append("\n");
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

