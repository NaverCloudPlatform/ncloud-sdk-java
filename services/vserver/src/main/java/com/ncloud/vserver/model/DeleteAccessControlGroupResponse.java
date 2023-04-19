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
import com.ncloud.vserver.model.AccessControlGroup;
import java.util.ArrayList;
import java.util.List;

/**
 * DeleteAccessControlGroupResponse
 */
public class DeleteAccessControlGroupResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<AccessControlGroup> accessControlGroupList = null;

	public DeleteAccessControlGroupResponse requestId(String requestId) {
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

	public DeleteAccessControlGroupResponse returnCode(String returnCode) {
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

	public DeleteAccessControlGroupResponse returnMessage(String returnMessage) {
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

	public DeleteAccessControlGroupResponse totalRows(Integer totalRows) {
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

	public DeleteAccessControlGroupResponse accessControlGroupList(List<AccessControlGroup> accessControlGroupList) {
		this.accessControlGroupList = accessControlGroupList;
		return this;
	}

	public DeleteAccessControlGroupResponse addAccessControlGroupListItem(AccessControlGroup accessControlGroupListItem) {
		if (this.accessControlGroupList == null) {
			this.accessControlGroupList = new ArrayList<AccessControlGroup>();
		}
		this.accessControlGroupList.add(accessControlGroupListItem);
		return this;
	}

	 /**
	 * Get accessControlGroupList
	 * @return accessControlGroupList
	**/
	public List<AccessControlGroup> getAccessControlGroupList() {
		return accessControlGroupList;
	}

	public void setAccessControlGroupList(List<AccessControlGroup> accessControlGroupList) {
		this.accessControlGroupList = accessControlGroupList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeleteAccessControlGroupResponse deleteAccessControlGroupResponse = (DeleteAccessControlGroupResponse) o;
		return Objects.equals(this.requestId, deleteAccessControlGroupResponse.requestId) &&
				Objects.equals(this.returnCode, deleteAccessControlGroupResponse.returnCode) &&
				Objects.equals(this.returnMessage, deleteAccessControlGroupResponse.returnMessage) &&
				Objects.equals(this.totalRows, deleteAccessControlGroupResponse.totalRows) &&
				Objects.equals(this.accessControlGroupList, deleteAccessControlGroupResponse.accessControlGroupList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, accessControlGroupList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeleteAccessControlGroupResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		accessControlGroupList: ").append(toIndentedString(accessControlGroupList)).append("\n");
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

