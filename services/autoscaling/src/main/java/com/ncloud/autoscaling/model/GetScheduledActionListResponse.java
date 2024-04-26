/*
 * autoscaling
 * <br/>https://ncloud.apigw.ntruss.com/autoscaling/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.autoscaling.model;

import java.util.Objects;
import com.ncloud.autoscaling.model.ScheduledUpdateGroupAction;
import java.util.ArrayList;
import java.util.List;

/**
 * GetScheduledActionListResponse
 */
public class GetScheduledActionListResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<ScheduledUpdateGroupAction> scheduledUpdateGroupActionList = null;

	public GetScheduledActionListResponse requestId(String requestId) {
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

	public GetScheduledActionListResponse returnCode(String returnCode) {
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

	public GetScheduledActionListResponse returnMessage(String returnMessage) {
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

	public GetScheduledActionListResponse totalRows(Integer totalRows) {
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

	public GetScheduledActionListResponse scheduledUpdateGroupActionList(List<ScheduledUpdateGroupAction> scheduledUpdateGroupActionList) {
		this.scheduledUpdateGroupActionList = scheduledUpdateGroupActionList;
		return this;
	}

	public GetScheduledActionListResponse addScheduledUpdateGroupActionListItem(ScheduledUpdateGroupAction scheduledUpdateGroupActionListItem) {
		if (this.scheduledUpdateGroupActionList == null) {
			this.scheduledUpdateGroupActionList = new ArrayList<ScheduledUpdateGroupAction>();
		}
		this.scheduledUpdateGroupActionList.add(scheduledUpdateGroupActionListItem);
		return this;
	}

	 /**
	 * Get scheduledUpdateGroupActionList
	 * @return scheduledUpdateGroupActionList
	**/
	public List<ScheduledUpdateGroupAction> getScheduledUpdateGroupActionList() {
		return scheduledUpdateGroupActionList;
	}

	public void setScheduledUpdateGroupActionList(List<ScheduledUpdateGroupAction> scheduledUpdateGroupActionList) {
		this.scheduledUpdateGroupActionList = scheduledUpdateGroupActionList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GetScheduledActionListResponse getScheduledActionListResponse = (GetScheduledActionListResponse) o;
		return Objects.equals(this.requestId, getScheduledActionListResponse.requestId) &&
				Objects.equals(this.returnCode, getScheduledActionListResponse.returnCode) &&
				Objects.equals(this.returnMessage, getScheduledActionListResponse.returnMessage) &&
				Objects.equals(this.totalRows, getScheduledActionListResponse.totalRows) &&
				Objects.equals(this.scheduledUpdateGroupActionList, getScheduledActionListResponse.scheduledUpdateGroupActionList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, scheduledUpdateGroupActionList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetScheduledActionListResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		scheduledUpdateGroupActionList: ").append(toIndentedString(scheduledUpdateGroupActionList)).append("\n");
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

