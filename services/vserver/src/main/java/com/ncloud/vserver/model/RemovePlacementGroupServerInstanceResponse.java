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
import com.ncloud.vserver.model.ServerInstance;
import java.util.ArrayList;
import java.util.List;

/**
 * RemovePlacementGroupServerInstanceResponse
 */
public class RemovePlacementGroupServerInstanceResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<ServerInstance> serverInstanceList = null;

	public RemovePlacementGroupServerInstanceResponse requestId(String requestId) {
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

	public RemovePlacementGroupServerInstanceResponse returnCode(String returnCode) {
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

	public RemovePlacementGroupServerInstanceResponse returnMessage(String returnMessage) {
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

	public RemovePlacementGroupServerInstanceResponse totalRows(Integer totalRows) {
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

	public RemovePlacementGroupServerInstanceResponse serverInstanceList(List<ServerInstance> serverInstanceList) {
		this.serverInstanceList = serverInstanceList;
		return this;
	}

	public RemovePlacementGroupServerInstanceResponse addServerInstanceListItem(ServerInstance serverInstanceListItem) {
		if (this.serverInstanceList == null) {
			this.serverInstanceList = new ArrayList<ServerInstance>();
		}
		this.serverInstanceList.add(serverInstanceListItem);
		return this;
	}

	 /**
	 * Get serverInstanceList
	 * @return serverInstanceList
	**/
	public List<ServerInstance> getServerInstanceList() {
		return serverInstanceList;
	}

	public void setServerInstanceList(List<ServerInstance> serverInstanceList) {
		this.serverInstanceList = serverInstanceList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RemovePlacementGroupServerInstanceResponse removePlacementGroupServerInstanceResponse = (RemovePlacementGroupServerInstanceResponse) o;
		return Objects.equals(this.requestId, removePlacementGroupServerInstanceResponse.requestId) &&
				Objects.equals(this.returnCode, removePlacementGroupServerInstanceResponse.returnCode) &&
				Objects.equals(this.returnMessage, removePlacementGroupServerInstanceResponse.returnMessage) &&
				Objects.equals(this.totalRows, removePlacementGroupServerInstanceResponse.totalRows) &&
				Objects.equals(this.serverInstanceList, removePlacementGroupServerInstanceResponse.serverInstanceList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, serverInstanceList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RemovePlacementGroupServerInstanceResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		serverInstanceList: ").append(toIndentedString(serverInstanceList)).append("\n");
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

