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
import com.ncloud.vserver.model.PlacementGroup;
import java.util.ArrayList;
import java.util.List;

/**
 * CreatePlacementGroupResponse
 */
public class CreatePlacementGroupResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<PlacementGroup> placementGroupList = null;

	public CreatePlacementGroupResponse requestId(String requestId) {
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

	public CreatePlacementGroupResponse returnCode(String returnCode) {
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

	public CreatePlacementGroupResponse returnMessage(String returnMessage) {
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

	public CreatePlacementGroupResponse totalRows(Integer totalRows) {
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

	public CreatePlacementGroupResponse placementGroupList(List<PlacementGroup> placementGroupList) {
		this.placementGroupList = placementGroupList;
		return this;
	}

	public CreatePlacementGroupResponse addPlacementGroupListItem(PlacementGroup placementGroupListItem) {
		if (this.placementGroupList == null) {
			this.placementGroupList = new ArrayList<PlacementGroup>();
		}
		this.placementGroupList.add(placementGroupListItem);
		return this;
	}

	 /**
	 * Get placementGroupList
	 * @return placementGroupList
	**/
	public List<PlacementGroup> getPlacementGroupList() {
		return placementGroupList;
	}

	public void setPlacementGroupList(List<PlacementGroup> placementGroupList) {
		this.placementGroupList = placementGroupList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CreatePlacementGroupResponse createPlacementGroupResponse = (CreatePlacementGroupResponse) o;
		return Objects.equals(this.requestId, createPlacementGroupResponse.requestId) &&
				Objects.equals(this.returnCode, createPlacementGroupResponse.returnCode) &&
				Objects.equals(this.returnMessage, createPlacementGroupResponse.returnMessage) &&
				Objects.equals(this.totalRows, createPlacementGroupResponse.totalRows) &&
				Objects.equals(this.placementGroupList, createPlacementGroupResponse.placementGroupList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, placementGroupList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreatePlacementGroupResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		placementGroupList: ").append(toIndentedString(placementGroupList)).append("\n");
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

