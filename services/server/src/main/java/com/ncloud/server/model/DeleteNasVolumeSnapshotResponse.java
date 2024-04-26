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
import com.ncloud.server.model.NasVolumeSnapshot;
import java.util.ArrayList;
import java.util.List;

/**
 * DeleteNasVolumeSnapshotResponse
 */
public class DeleteNasVolumeSnapshotResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<NasVolumeSnapshot> nasVolumeSnapshotList = null;

	public DeleteNasVolumeSnapshotResponse requestId(String requestId) {
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

	public DeleteNasVolumeSnapshotResponse returnCode(String returnCode) {
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

	public DeleteNasVolumeSnapshotResponse returnMessage(String returnMessage) {
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

	public DeleteNasVolumeSnapshotResponse totalRows(Integer totalRows) {
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

	public DeleteNasVolumeSnapshotResponse nasVolumeSnapshotList(List<NasVolumeSnapshot> nasVolumeSnapshotList) {
		this.nasVolumeSnapshotList = nasVolumeSnapshotList;
		return this;
	}

	public DeleteNasVolumeSnapshotResponse addNasVolumeSnapshotListItem(NasVolumeSnapshot nasVolumeSnapshotListItem) {
		if (this.nasVolumeSnapshotList == null) {
			this.nasVolumeSnapshotList = new ArrayList<NasVolumeSnapshot>();
		}
		this.nasVolumeSnapshotList.add(nasVolumeSnapshotListItem);
		return this;
	}

	 /**
	 * Get nasVolumeSnapshotList
	 * @return nasVolumeSnapshotList
	**/
	public List<NasVolumeSnapshot> getNasVolumeSnapshotList() {
		return nasVolumeSnapshotList;
	}

	public void setNasVolumeSnapshotList(List<NasVolumeSnapshot> nasVolumeSnapshotList) {
		this.nasVolumeSnapshotList = nasVolumeSnapshotList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeleteNasVolumeSnapshotResponse deleteNasVolumeSnapshotResponse = (DeleteNasVolumeSnapshotResponse) o;
		return Objects.equals(this.requestId, deleteNasVolumeSnapshotResponse.requestId) &&
				Objects.equals(this.returnCode, deleteNasVolumeSnapshotResponse.returnCode) &&
				Objects.equals(this.returnMessage, deleteNasVolumeSnapshotResponse.returnMessage) &&
				Objects.equals(this.totalRows, deleteNasVolumeSnapshotResponse.totalRows) &&
				Objects.equals(this.nasVolumeSnapshotList, deleteNasVolumeSnapshotResponse.nasVolumeSnapshotList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, nasVolumeSnapshotList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeleteNasVolumeSnapshotResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		nasVolumeSnapshotList: ").append(toIndentedString(nasVolumeSnapshotList)).append("\n");
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

