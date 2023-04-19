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
import java.util.ArrayList;
import java.util.List;

/**
 * DeleteLoadBalancerInstancesRequest
 */
public class DeleteLoadBalancerInstancesRequest {
	private String regionCode = null;

	private List<String> loadBalancerInstanceNoList = new ArrayList<String>();

	private Boolean returnPublicIpTogether = null;

	private String responseFormatType = null;

	public DeleteLoadBalancerInstancesRequest regionCode(String regionCode) {
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

	public DeleteLoadBalancerInstancesRequest loadBalancerInstanceNoList(List<String> loadBalancerInstanceNoList) {
		this.loadBalancerInstanceNoList = loadBalancerInstanceNoList;
		return this;
	}

	public DeleteLoadBalancerInstancesRequest addLoadBalancerInstanceNoListItem(String loadBalancerInstanceNoListItem) {
		this.loadBalancerInstanceNoList.add(loadBalancerInstanceNoListItem);
		return this;
	}

	 /**
	 * 로드밸런서인스턴스번호리스트
	 * @return loadBalancerInstanceNoList
	**/
	public List<String> getLoadBalancerInstanceNoList() {
		return loadBalancerInstanceNoList;
	}

	public void setLoadBalancerInstanceNoList(List<String> loadBalancerInstanceNoList) {
		this.loadBalancerInstanceNoList = loadBalancerInstanceNoList;
	}

	public DeleteLoadBalancerInstancesRequest returnPublicIpTogether(Boolean returnPublicIpTogether) {
		this.returnPublicIpTogether = returnPublicIpTogether;
		return this;
	}

	 /**
	 * 공인IP반납여부
	 * @return returnPublicIpTogether
	**/
	public Boolean isReturnPublicIpTogether() {
		return returnPublicIpTogether;
	}

	public void setReturnPublicIpTogether(Boolean returnPublicIpTogether) {
		this.returnPublicIpTogether = returnPublicIpTogether;
	}

	public DeleteLoadBalancerInstancesRequest responseFormatType(String responseFormatType) {
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
		DeleteLoadBalancerInstancesRequest deleteLoadBalancerInstancesRequest = (DeleteLoadBalancerInstancesRequest) o;
		return Objects.equals(this.regionCode, deleteLoadBalancerInstancesRequest.regionCode) &&
				Objects.equals(this.loadBalancerInstanceNoList, deleteLoadBalancerInstancesRequest.loadBalancerInstanceNoList) &&
				Objects.equals(this.returnPublicIpTogether, deleteLoadBalancerInstancesRequest.returnPublicIpTogether) &&
				Objects.equals(this.responseFormatType, deleteLoadBalancerInstancesRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, loadBalancerInstanceNoList, returnPublicIpTogether, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeleteLoadBalancerInstancesRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		loadBalancerInstanceNoList: ").append(toIndentedString(loadBalancerInstanceNoList)).append("\n");
		sb.append("		returnPublicIpTogether: ").append(toIndentedString(returnPublicIpTogether)).append("\n");
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
