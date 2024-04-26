/*
 * vpc
 * VPC Network 관련 API<br/>https://ncloud.apigw.ntruss.com/vpc/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vpc.model;

import java.util.Objects;
import com.ncloud.vpc.model.NetworkAclRule;
import java.util.ArrayList;
import java.util.List;

/**
 * AddNetworkAclOutboundRuleResponse
 */
public class AddNetworkAclOutboundRuleResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<NetworkAclRule> networkAclRuleList = null;

	public AddNetworkAclOutboundRuleResponse requestId(String requestId) {
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

	public AddNetworkAclOutboundRuleResponse returnCode(String returnCode) {
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

	public AddNetworkAclOutboundRuleResponse returnMessage(String returnMessage) {
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

	public AddNetworkAclOutboundRuleResponse totalRows(Integer totalRows) {
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

	public AddNetworkAclOutboundRuleResponse networkAclRuleList(List<NetworkAclRule> networkAclRuleList) {
		this.networkAclRuleList = networkAclRuleList;
		return this;
	}

	public AddNetworkAclOutboundRuleResponse addNetworkAclRuleListItem(NetworkAclRule networkAclRuleListItem) {
		if (this.networkAclRuleList == null) {
			this.networkAclRuleList = new ArrayList<NetworkAclRule>();
		}
		this.networkAclRuleList.add(networkAclRuleListItem);
		return this;
	}

	 /**
	 * Get networkAclRuleList
	 * @return networkAclRuleList
	**/
	public List<NetworkAclRule> getNetworkAclRuleList() {
		return networkAclRuleList;
	}

	public void setNetworkAclRuleList(List<NetworkAclRule> networkAclRuleList) {
		this.networkAclRuleList = networkAclRuleList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AddNetworkAclOutboundRuleResponse addNetworkAclOutboundRuleResponse = (AddNetworkAclOutboundRuleResponse) o;
		return Objects.equals(this.requestId, addNetworkAclOutboundRuleResponse.requestId) &&
				Objects.equals(this.returnCode, addNetworkAclOutboundRuleResponse.returnCode) &&
				Objects.equals(this.returnMessage, addNetworkAclOutboundRuleResponse.returnMessage) &&
				Objects.equals(this.totalRows, addNetworkAclOutboundRuleResponse.totalRows) &&
				Objects.equals(this.networkAclRuleList, addNetworkAclOutboundRuleResponse.networkAclRuleList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, networkAclRuleList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AddNetworkAclOutboundRuleResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		networkAclRuleList: ").append(toIndentedString(networkAclRuleList)).append("\n");
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

