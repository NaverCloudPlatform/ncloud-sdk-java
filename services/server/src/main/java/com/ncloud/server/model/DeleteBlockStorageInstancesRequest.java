/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * OpenAPI spec version: 2020-11-18T09:44:01Z
 *
 * 
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
 * DeleteBlockStorageInstancesRequest
 */
public class DeleteBlockStorageInstancesRequest {
	private List<String> blockStorageInstanceNoList = new ArrayList<String>();

	private String responseFormatType = null;

	public DeleteBlockStorageInstancesRequest blockStorageInstanceNoList(List<String> blockStorageInstanceNoList) {
		this.blockStorageInstanceNoList = blockStorageInstanceNoList;
		return this;
	}

	public DeleteBlockStorageInstancesRequest addBlockStorageInstanceNoListItem(String blockStorageInstanceNoListItem) {
		this.blockStorageInstanceNoList.add(blockStorageInstanceNoListItem);
		return this;
	}

	 /**
	 * 블록스토리지인스턴스번호리스트
	 * @return blockStorageInstanceNoList
	**/
	public List<String> getBlockStorageInstanceNoList() {
		return blockStorageInstanceNoList;
	}

	public void setBlockStorageInstanceNoList(List<String> blockStorageInstanceNoList) {
		this.blockStorageInstanceNoList = blockStorageInstanceNoList;
	}

	public DeleteBlockStorageInstancesRequest responseFormatType(String responseFormatType) {
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
		DeleteBlockStorageInstancesRequest deleteBlockStorageInstancesRequest = (DeleteBlockStorageInstancesRequest) o;
		return Objects.equals(this.blockStorageInstanceNoList, deleteBlockStorageInstancesRequest.blockStorageInstanceNoList) &&
				Objects.equals(this.responseFormatType, deleteBlockStorageInstancesRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(blockStorageInstanceNoList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeleteBlockStorageInstancesRequest {\n");
		
		sb.append("		blockStorageInstanceNoList: ").append(toIndentedString(blockStorageInstanceNoList)).append("\n");
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

