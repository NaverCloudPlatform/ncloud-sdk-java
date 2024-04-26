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
import com.ncloud.autoscaling.model.AutoScalingGroup;
import java.util.ArrayList;
import java.util.List;

/**
 * GetAutoScalingGroupListResponse
 */
public class GetAutoScalingGroupListResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<AutoScalingGroup> autoScalingGroupList = null;

	public GetAutoScalingGroupListResponse requestId(String requestId) {
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

	public GetAutoScalingGroupListResponse returnCode(String returnCode) {
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

	public GetAutoScalingGroupListResponse returnMessage(String returnMessage) {
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

	public GetAutoScalingGroupListResponse totalRows(Integer totalRows) {
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

	public GetAutoScalingGroupListResponse autoScalingGroupList(List<AutoScalingGroup> autoScalingGroupList) {
		this.autoScalingGroupList = autoScalingGroupList;
		return this;
	}

	public GetAutoScalingGroupListResponse addAutoScalingGroupListItem(AutoScalingGroup autoScalingGroupListItem) {
		if (this.autoScalingGroupList == null) {
			this.autoScalingGroupList = new ArrayList<AutoScalingGroup>();
		}
		this.autoScalingGroupList.add(autoScalingGroupListItem);
		return this;
	}

	 /**
	 * Get autoScalingGroupList
	 * @return autoScalingGroupList
	**/
	public List<AutoScalingGroup> getAutoScalingGroupList() {
		return autoScalingGroupList;
	}

	public void setAutoScalingGroupList(List<AutoScalingGroup> autoScalingGroupList) {
		this.autoScalingGroupList = autoScalingGroupList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GetAutoScalingGroupListResponse getAutoScalingGroupListResponse = (GetAutoScalingGroupListResponse) o;
		return Objects.equals(this.requestId, getAutoScalingGroupListResponse.requestId) &&
				Objects.equals(this.returnCode, getAutoScalingGroupListResponse.returnCode) &&
				Objects.equals(this.returnMessage, getAutoScalingGroupListResponse.returnMessage) &&
				Objects.equals(this.totalRows, getAutoScalingGroupListResponse.totalRows) &&
				Objects.equals(this.autoScalingGroupList, getAutoScalingGroupListResponse.autoScalingGroupList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, autoScalingGroupList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetAutoScalingGroupListResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		autoScalingGroupList: ").append(toIndentedString(autoScalingGroupList)).append("\n");
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

