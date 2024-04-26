/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.server.model;

import java.util.Objects;
import com.ncloud.server.model.PortForwardingRule;
import java.util.ArrayList;
import java.util.List;

/**
 * AddPortForwardingRulesResponse
 */
public class AddPortForwardingRulesResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<PortForwardingRule> portForwardingRuleList = null;

	public AddPortForwardingRulesResponse requestId(String requestId) {
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

	public AddPortForwardingRulesResponse returnCode(String returnCode) {
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

	public AddPortForwardingRulesResponse returnMessage(String returnMessage) {
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

	public AddPortForwardingRulesResponse totalRows(Integer totalRows) {
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

	public AddPortForwardingRulesResponse portForwardingRuleList(List<PortForwardingRule> portForwardingRuleList) {
		this.portForwardingRuleList = portForwardingRuleList;
		return this;
	}

	public AddPortForwardingRulesResponse addPortForwardingRuleListItem(PortForwardingRule portForwardingRuleListItem) {
		if (this.portForwardingRuleList == null) {
			this.portForwardingRuleList = new ArrayList<PortForwardingRule>();
		}
		this.portForwardingRuleList.add(portForwardingRuleListItem);
		return this;
	}

	 /**
	 * Get portForwardingRuleList
	 * @return portForwardingRuleList
	**/
	public List<PortForwardingRule> getPortForwardingRuleList() {
		return portForwardingRuleList;
	}

	public void setPortForwardingRuleList(List<PortForwardingRule> portForwardingRuleList) {
		this.portForwardingRuleList = portForwardingRuleList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AddPortForwardingRulesResponse addPortForwardingRulesResponse = (AddPortForwardingRulesResponse) o;
		return Objects.equals(this.requestId, addPortForwardingRulesResponse.requestId) &&
				Objects.equals(this.returnCode, addPortForwardingRulesResponse.returnCode) &&
				Objects.equals(this.returnMessage, addPortForwardingRulesResponse.returnMessage) &&
				Objects.equals(this.totalRows, addPortForwardingRulesResponse.totalRows) &&
				Objects.equals(this.portForwardingRuleList, addPortForwardingRulesResponse.portForwardingRuleList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, portForwardingRuleList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AddPortForwardingRulesResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		portForwardingRuleList: ").append(toIndentedString(portForwardingRuleList)).append("\n");
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

