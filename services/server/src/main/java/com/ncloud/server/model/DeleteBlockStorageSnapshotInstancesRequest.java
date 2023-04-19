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
import java.util.ArrayList;
import java.util.List;

/**
 * DeleteBlockStorageSnapshotInstancesRequest
 */
public class DeleteBlockStorageSnapshotInstancesRequest {
	private List<String> blockStorageSnapshotInstanceNoList = new ArrayList<String>();

	private String responseFormatType = null;

	public DeleteBlockStorageSnapshotInstancesRequest blockStorageSnapshotInstanceNoList(List<String> blockStorageSnapshotInstanceNoList) {
		this.blockStorageSnapshotInstanceNoList = blockStorageSnapshotInstanceNoList;
		return this;
	}

	public DeleteBlockStorageSnapshotInstancesRequest addBlockStorageSnapshotInstanceNoListItem(String blockStorageSnapshotInstanceNoListItem) {
		this.blockStorageSnapshotInstanceNoList.add(blockStorageSnapshotInstanceNoListItem);
		return this;
	}

	 /**
	 * 블록스토리지스냅샷인스턴스번호리스트
	 * @return blockStorageSnapshotInstanceNoList
	**/
	public List<String> getBlockStorageSnapshotInstanceNoList() {
		return blockStorageSnapshotInstanceNoList;
	}

	public void setBlockStorageSnapshotInstanceNoList(List<String> blockStorageSnapshotInstanceNoList) {
		this.blockStorageSnapshotInstanceNoList = blockStorageSnapshotInstanceNoList;
	}

	public DeleteBlockStorageSnapshotInstancesRequest responseFormatType(String responseFormatType) {
		this.responseFormatType = responseFormatType;
		return this;
	}

	 /**
	 * responseFormatType {json, xml}
	 * @return responseFormatType
	**/
	public String getResponseFormatType() {
		return responseFormatType;
	}

	public void setResponseFormatType(String responseFormatType) {
		this.responseFormatType = responseFormatType;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeleteBlockStorageSnapshotInstancesRequest deleteBlockStorageSnapshotInstancesRequest = (DeleteBlockStorageSnapshotInstancesRequest) o;
		return Objects.equals(this.blockStorageSnapshotInstanceNoList, deleteBlockStorageSnapshotInstancesRequest.blockStorageSnapshotInstanceNoList) &&
				Objects.equals(this.responseFormatType, deleteBlockStorageSnapshotInstancesRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(blockStorageSnapshotInstanceNoList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeleteBlockStorageSnapshotInstancesRequest {\n");
		
		sb.append("		blockStorageSnapshotInstanceNoList: ").append(toIndentedString(blockStorageSnapshotInstanceNoList)).append("\n");
		sb.append("		responseFormatType: ").append(toIndentedString(responseFormatType)).append("\n");
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

