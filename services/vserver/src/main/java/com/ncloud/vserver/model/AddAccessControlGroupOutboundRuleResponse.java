/*
 * vserver
 * VPC Compute 관련 API<br/>https://ncloud.apigw.ntruss.com/vserver/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vserver.model;

import java.util.Objects;
import com.ncloud.vserver.model.AccessControlGroupRule;
import java.util.ArrayList;
import java.util.List;

/**
 * AddAccessControlGroupOutboundRuleResponse
 */
public class AddAccessControlGroupOutboundRuleResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<AccessControlGroupRule> accessControlGroupRuleList = null;

	public AddAccessControlGroupOutboundRuleResponse requestId(String requestId) {
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

	public AddAccessControlGroupOutboundRuleResponse returnCode(String returnCode) {
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

	public AddAccessControlGroupOutboundRuleResponse returnMessage(String returnMessage) {
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

	public AddAccessControlGroupOutboundRuleResponse totalRows(Integer totalRows) {
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

	public AddAccessControlGroupOutboundRuleResponse accessControlGroupRuleList(List<AccessControlGroupRule> accessControlGroupRuleList) {
		this.accessControlGroupRuleList = accessControlGroupRuleList;
		return this;
	}

	public AddAccessControlGroupOutboundRuleResponse addAccessControlGroupRuleListItem(AccessControlGroupRule accessControlGroupRuleListItem) {
		if (this.accessControlGroupRuleList == null) {
			this.accessControlGroupRuleList = new ArrayList<AccessControlGroupRule>();
		}
		this.accessControlGroupRuleList.add(accessControlGroupRuleListItem);
		return this;
	}

	 /**
	 * Get accessControlGroupRuleList
	 * @return accessControlGroupRuleList
	**/
	public List<AccessControlGroupRule> getAccessControlGroupRuleList() {
		return accessControlGroupRuleList;
	}

	public void setAccessControlGroupRuleList(List<AccessControlGroupRule> accessControlGroupRuleList) {
		this.accessControlGroupRuleList = accessControlGroupRuleList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AddAccessControlGroupOutboundRuleResponse addAccessControlGroupOutboundRuleResponse = (AddAccessControlGroupOutboundRuleResponse) o;
		return Objects.equals(this.requestId, addAccessControlGroupOutboundRuleResponse.requestId) &&
				Objects.equals(this.returnCode, addAccessControlGroupOutboundRuleResponse.returnCode) &&
				Objects.equals(this.returnMessage, addAccessControlGroupOutboundRuleResponse.returnMessage) &&
				Objects.equals(this.totalRows, addAccessControlGroupOutboundRuleResponse.totalRows) &&
				Objects.equals(this.accessControlGroupRuleList, addAccessControlGroupOutboundRuleResponse.accessControlGroupRuleList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, accessControlGroupRuleList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AddAccessControlGroupOutboundRuleResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		accessControlGroupRuleList: ").append(toIndentedString(accessControlGroupRuleList)).append("\n");
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

