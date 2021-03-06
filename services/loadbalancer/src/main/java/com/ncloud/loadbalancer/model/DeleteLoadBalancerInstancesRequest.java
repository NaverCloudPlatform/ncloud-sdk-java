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
import java.util.ArrayList;
import java.util.List;

/**
 * DeleteLoadBalancerInstancesRequest
 */
public class DeleteLoadBalancerInstancesRequest {
	private List<String> loadBalancerInstanceNoList = new ArrayList<String>();

	private String responseFormatType = null;

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

	public DeleteLoadBalancerInstancesRequest responseFormatType(String responseFormatType) {
		this.responseFormatType = responseFormatType;
		return this;
	}

	 /**
	 * responaddseFormatType {json, xml}
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
		return Objects.equals(this.loadBalancerInstanceNoList, deleteLoadBalancerInstancesRequest.loadBalancerInstanceNoList) &&
				Objects.equals(this.responseFormatType, deleteLoadBalancerInstancesRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(loadBalancerInstanceNoList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeleteLoadBalancerInstancesRequest {\n");
		
		sb.append("		loadBalancerInstanceNoList: ").append(toIndentedString(loadBalancerInstanceNoList)).append("\n");
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

