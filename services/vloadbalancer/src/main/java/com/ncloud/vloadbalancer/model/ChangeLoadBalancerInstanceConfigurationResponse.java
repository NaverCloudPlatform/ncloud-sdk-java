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
import com.ncloud.vloadbalancer.model.LoadBalancerInstance;
import java.util.ArrayList;
import java.util.List;

/**
 * ChangeLoadBalancerInstanceConfigurationResponse
 */
public class ChangeLoadBalancerInstanceConfigurationResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<LoadBalancerInstance> loadBalancerInstanceList = null;

	public ChangeLoadBalancerInstanceConfigurationResponse requestId(String requestId) {
		this.requestId = requestId;
		return this;
	}

	 /**
	 * Get requestId
	 * @return requestId
	**/
	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ChangeLoadBalancerInstanceConfigurationResponse returnCode(String returnCode) {
		this.returnCode = returnCode;
		return this;
	}

	 /**
	 * Get returnCode
	 * @return returnCode
	**/
	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public ChangeLoadBalancerInstanceConfigurationResponse returnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
		return this;
	}

	 /**
	 * Get returnMessage
	 * @return returnMessage
	**/
	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

	public ChangeLoadBalancerInstanceConfigurationResponse totalRows(Integer totalRows) {
		this.totalRows = totalRows;
		return this;
	}

	 /**
	 * Get totalRows
	 * @return totalRows
	**/
	public Integer getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(Integer totalRows) {
		this.totalRows = totalRows;
	}

	public ChangeLoadBalancerInstanceConfigurationResponse loadBalancerInstanceList(List<LoadBalancerInstance> loadBalancerInstanceList) {
		this.loadBalancerInstanceList = loadBalancerInstanceList;
		return this;
	}

	public ChangeLoadBalancerInstanceConfigurationResponse addLoadBalancerInstanceListItem(LoadBalancerInstance loadBalancerInstanceListItem) {
		if (this.loadBalancerInstanceList == null) {
			this.loadBalancerInstanceList = new ArrayList<LoadBalancerInstance>();
		}
		this.loadBalancerInstanceList.add(loadBalancerInstanceListItem);
		return this;
	}

	 /**
	 * Get loadBalancerInstanceList
	 * @return loadBalancerInstanceList
	**/
	public List<LoadBalancerInstance> getLoadBalancerInstanceList() {
		return loadBalancerInstanceList;
	}

	public void setLoadBalancerInstanceList(List<LoadBalancerInstance> loadBalancerInstanceList) {
		this.loadBalancerInstanceList = loadBalancerInstanceList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ChangeLoadBalancerInstanceConfigurationResponse changeLoadBalancerInstanceConfigurationResponse = (ChangeLoadBalancerInstanceConfigurationResponse) o;
		return Objects.equals(this.requestId, changeLoadBalancerInstanceConfigurationResponse.requestId) &&
				Objects.equals(this.returnCode, changeLoadBalancerInstanceConfigurationResponse.returnCode) &&
				Objects.equals(this.returnMessage, changeLoadBalancerInstanceConfigurationResponse.returnMessage) &&
				Objects.equals(this.totalRows, changeLoadBalancerInstanceConfigurationResponse.totalRows) &&
				Objects.equals(this.loadBalancerInstanceList, changeLoadBalancerInstanceConfigurationResponse.loadBalancerInstanceList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, loadBalancerInstanceList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ChangeLoadBalancerInstanceConfigurationResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		loadBalancerInstanceList: ").append(toIndentedString(loadBalancerInstanceList)).append("\n");
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

