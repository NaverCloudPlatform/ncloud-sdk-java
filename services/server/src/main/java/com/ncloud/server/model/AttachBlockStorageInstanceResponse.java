/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * OpenAPI spec version: 2021-03-04T10:39:42Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.server.model;

import java.util.Objects;
import com.ncloud.server.model.BlockStorageInstance;
import java.util.ArrayList;
import java.util.List;

/**
 * AttachBlockStorageInstanceResponse
 */
public class AttachBlockStorageInstanceResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<BlockStorageInstance> blockStorageInstanceList = null;

	public AttachBlockStorageInstanceResponse requestId(String requestId) {
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

	public AttachBlockStorageInstanceResponse returnCode(String returnCode) {
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

	public AttachBlockStorageInstanceResponse returnMessage(String returnMessage) {
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

	public AttachBlockStorageInstanceResponse totalRows(Integer totalRows) {
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

	public AttachBlockStorageInstanceResponse blockStorageInstanceList(List<BlockStorageInstance> blockStorageInstanceList) {
		this.blockStorageInstanceList = blockStorageInstanceList;
		return this;
	}

	public AttachBlockStorageInstanceResponse addBlockStorageInstanceListItem(BlockStorageInstance blockStorageInstanceListItem) {
		if (this.blockStorageInstanceList == null) {
			this.blockStorageInstanceList = new ArrayList<BlockStorageInstance>();
		}
		this.blockStorageInstanceList.add(blockStorageInstanceListItem);
		return this;
	}

	 /**
	 * Get blockStorageInstanceList
	 * @return blockStorageInstanceList
	**/
	public List<BlockStorageInstance> getBlockStorageInstanceList() {
		return blockStorageInstanceList;
	}

	public void setBlockStorageInstanceList(List<BlockStorageInstance> blockStorageInstanceList) {
		this.blockStorageInstanceList = blockStorageInstanceList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AttachBlockStorageInstanceResponse attachBlockStorageInstanceResponse = (AttachBlockStorageInstanceResponse) o;
		return Objects.equals(this.requestId, attachBlockStorageInstanceResponse.requestId) &&
				Objects.equals(this.returnCode, attachBlockStorageInstanceResponse.returnCode) &&
				Objects.equals(this.returnMessage, attachBlockStorageInstanceResponse.returnMessage) &&
				Objects.equals(this.totalRows, attachBlockStorageInstanceResponse.totalRows) &&
				Objects.equals(this.blockStorageInstanceList, attachBlockStorageInstanceResponse.blockStorageInstanceList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, blockStorageInstanceList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AttachBlockStorageInstanceResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		blockStorageInstanceList: ").append(toIndentedString(blockStorageInstanceList)).append("\n");
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

