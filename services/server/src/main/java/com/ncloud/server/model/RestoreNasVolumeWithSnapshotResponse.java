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
 * RestoreNasVolumeWithSnapshotResponse
 */
public class RestoreNasVolumeWithSnapshotResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<NasVolumeSnapshot> nasVolumeSnapshotList = null;

	public RestoreNasVolumeWithSnapshotResponse requestId(String requestId) {
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

	public RestoreNasVolumeWithSnapshotResponse returnCode(String returnCode) {
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

	public RestoreNasVolumeWithSnapshotResponse returnMessage(String returnMessage) {
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

	public RestoreNasVolumeWithSnapshotResponse totalRows(Integer totalRows) {
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

	public RestoreNasVolumeWithSnapshotResponse nasVolumeSnapshotList(List<NasVolumeSnapshot> nasVolumeSnapshotList) {
		this.nasVolumeSnapshotList = nasVolumeSnapshotList;
		return this;
	}

	public RestoreNasVolumeWithSnapshotResponse addNasVolumeSnapshotListItem(NasVolumeSnapshot nasVolumeSnapshotListItem) {
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
		RestoreNasVolumeWithSnapshotResponse restoreNasVolumeWithSnapshotResponse = (RestoreNasVolumeWithSnapshotResponse) o;
		return Objects.equals(this.requestId, restoreNasVolumeWithSnapshotResponse.requestId) &&
				Objects.equals(this.returnCode, restoreNasVolumeWithSnapshotResponse.returnCode) &&
				Objects.equals(this.returnMessage, restoreNasVolumeWithSnapshotResponse.returnMessage) &&
				Objects.equals(this.totalRows, restoreNasVolumeWithSnapshotResponse.totalRows) &&
				Objects.equals(this.nasVolumeSnapshotList, restoreNasVolumeWithSnapshotResponse.nasVolumeSnapshotList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, nasVolumeSnapshotList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RestoreNasVolumeWithSnapshotResponse {\n");
		
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

