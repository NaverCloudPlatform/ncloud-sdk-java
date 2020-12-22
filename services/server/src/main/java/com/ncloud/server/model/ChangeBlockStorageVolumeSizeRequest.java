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

/**
 * ChangeBlockStorageVolumeSizeRequest
 */
public class ChangeBlockStorageVolumeSizeRequest {
	private String blockStorageInstanceNo = null;

	private Long blockStorageSize = null;

	private String responseFormatType = null;

	public ChangeBlockStorageVolumeSizeRequest blockStorageInstanceNo(String blockStorageInstanceNo) {
		this.blockStorageInstanceNo = blockStorageInstanceNo;
		return this;
	}

	 /**
	 * 블록스토리지인스턴스번호
	 * @return blockStorageInstanceNo
	**/
	public String getBlockStorageInstanceNo() {
		return blockStorageInstanceNo;
	}

	public void setBlockStorageInstanceNo(String blockStorageInstanceNo) {
		this.blockStorageInstanceNo = blockStorageInstanceNo;
	}

	public ChangeBlockStorageVolumeSizeRequest blockStorageSize(Long blockStorageSize) {
		this.blockStorageSize = blockStorageSize;
		return this;
	}

	 /**
	 * 블록스토리지사이즈
	 * @return blockStorageSize
	**/
	public Long getBlockStorageSize() {
		return blockStorageSize;
	}

	public void setBlockStorageSize(Long blockStorageSize) {
		this.blockStorageSize = blockStorageSize;
	}

	public ChangeBlockStorageVolumeSizeRequest responseFormatType(String responseFormatType) {
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
		ChangeBlockStorageVolumeSizeRequest changeBlockStorageVolumeSizeRequest = (ChangeBlockStorageVolumeSizeRequest) o;
		return Objects.equals(this.blockStorageInstanceNo, changeBlockStorageVolumeSizeRequest.blockStorageInstanceNo) &&
				Objects.equals(this.blockStorageSize, changeBlockStorageVolumeSizeRequest.blockStorageSize) &&
				Objects.equals(this.responseFormatType, changeBlockStorageVolumeSizeRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(blockStorageInstanceNo, blockStorageSize, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ChangeBlockStorageVolumeSizeRequest {\n");
		
		sb.append("		blockStorageInstanceNo: ").append(toIndentedString(blockStorageInstanceNo)).append("\n");
		sb.append("		blockStorageSize: ").append(toIndentedString(blockStorageSize)).append("\n");
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
