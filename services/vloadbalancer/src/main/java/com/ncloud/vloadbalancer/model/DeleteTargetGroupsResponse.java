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
import com.ncloud.vloadbalancer.model.TargetGroup;
import java.util.ArrayList;
import java.util.List;

/**
 * DeleteTargetGroupsResponse
 */
public class DeleteTargetGroupsResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<TargetGroup> targetGroupList = null;

	public DeleteTargetGroupsResponse requestId(String requestId) {
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

	public DeleteTargetGroupsResponse returnCode(String returnCode) {
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

	public DeleteTargetGroupsResponse returnMessage(String returnMessage) {
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

	public DeleteTargetGroupsResponse totalRows(Integer totalRows) {
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

	public DeleteTargetGroupsResponse targetGroupList(List<TargetGroup> targetGroupList) {
		this.targetGroupList = targetGroupList;
		return this;
	}

	public DeleteTargetGroupsResponse addTargetGroupListItem(TargetGroup targetGroupListItem) {
		if (this.targetGroupList == null) {
			this.targetGroupList = new ArrayList<TargetGroup>();
		}
		this.targetGroupList.add(targetGroupListItem);
		return this;
	}

	 /**
	 * Get targetGroupList
	 * @return targetGroupList
	**/
	public List<TargetGroup> getTargetGroupList() {
		return targetGroupList;
	}

	public void setTargetGroupList(List<TargetGroup> targetGroupList) {
		this.targetGroupList = targetGroupList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeleteTargetGroupsResponse deleteTargetGroupsResponse = (DeleteTargetGroupsResponse) o;
		return Objects.equals(this.requestId, deleteTargetGroupsResponse.requestId) &&
				Objects.equals(this.returnCode, deleteTargetGroupsResponse.returnCode) &&
				Objects.equals(this.returnMessage, deleteTargetGroupsResponse.returnMessage) &&
				Objects.equals(this.totalRows, deleteTargetGroupsResponse.totalRows) &&
				Objects.equals(this.targetGroupList, deleteTargetGroupsResponse.targetGroupList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, targetGroupList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeleteTargetGroupsResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		targetGroupList: ").append(toIndentedString(targetGroupList)).append("\n");
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

