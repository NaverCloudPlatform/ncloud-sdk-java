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
import com.ncloud.vserver.model.FlowLogConfiguration;
import java.util.ArrayList;
import java.util.List;

/**
 * FlowLogConfigurationList
 */
public class FlowLogConfigurationList {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<FlowLogConfiguration> flowLogConfigurationList = null;

	public FlowLogConfigurationList requestId(String requestId) {
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

	public FlowLogConfigurationList returnCode(String returnCode) {
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

	public FlowLogConfigurationList returnMessage(String returnMessage) {
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

	public FlowLogConfigurationList totalRows(Integer totalRows) {
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

	public FlowLogConfigurationList flowLogConfigurationList(List<FlowLogConfiguration> flowLogConfigurationList) {
		this.flowLogConfigurationList = flowLogConfigurationList;
		return this;
	}

	public FlowLogConfigurationList addFlowLogConfigurationListItem(FlowLogConfiguration flowLogConfigurationListItem) {
		if (this.flowLogConfigurationList == null) {
			this.flowLogConfigurationList = new ArrayList<FlowLogConfiguration>();
		}
		this.flowLogConfigurationList.add(flowLogConfigurationListItem);
		return this;
	}

	 /**
	 * Get flowLogConfigurationList
	 * @return flowLogConfigurationList
	**/
	public List<FlowLogConfiguration> getFlowLogConfigurationList() {
		return flowLogConfigurationList;
	}

	public void setFlowLogConfigurationList(List<FlowLogConfiguration> flowLogConfigurationList) {
		this.flowLogConfigurationList = flowLogConfigurationList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FlowLogConfigurationList flowLogConfigurationList = (FlowLogConfigurationList) o;
		return Objects.equals(this.requestId, flowLogConfigurationList.requestId) &&
				Objects.equals(this.returnCode, flowLogConfigurationList.returnCode) &&
				Objects.equals(this.returnMessage, flowLogConfigurationList.returnMessage) &&
				Objects.equals(this.totalRows, flowLogConfigurationList.totalRows) &&
				Objects.equals(this.flowLogConfigurationList, flowLogConfigurationList.flowLogConfigurationList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, flowLogConfigurationList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FlowLogConfigurationList {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		flowLogConfigurationList: ").append(toIndentedString(flowLogConfigurationList)).append("\n");
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

