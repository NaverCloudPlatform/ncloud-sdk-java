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

/**
 * DeleteNasVolumeInstanceRequest
 */
public class DeleteNasVolumeInstanceRequest {
	private String nasVolumeInstanceNo = null;

	private Boolean isAsync = null;

	private String responseFormatType = null;

	public DeleteNasVolumeInstanceRequest nasVolumeInstanceNo(String nasVolumeInstanceNo) {
		this.nasVolumeInstanceNo = nasVolumeInstanceNo;
		return this;
	}

	 /**
	 * NAS볼륨인스턴스번호
	 * @return nasVolumeInstanceNo
	**/
	public String getNasVolumeInstanceNo() {
		return nasVolumeInstanceNo;
	}

	public void setNasVolumeInstanceNo(String nasVolumeInstanceNo) {
		this.nasVolumeInstanceNo = nasVolumeInstanceNo;
	}

	public DeleteNasVolumeInstanceRequest isAsync(Boolean isAsync) {
		this.isAsync = isAsync;
		return this;
	}

	 /**
	 * Async여부
	 * @return isAsync
	**/
	public Boolean isIsAsync() {
		return isAsync;
	}

	public void setIsAsync(Boolean isAsync) {
		this.isAsync = isAsync;
	}

	public DeleteNasVolumeInstanceRequest responseFormatType(String responseFormatType) {
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
		DeleteNasVolumeInstanceRequest deleteNasVolumeInstanceRequest = (DeleteNasVolumeInstanceRequest) o;
		return Objects.equals(this.nasVolumeInstanceNo, deleteNasVolumeInstanceRequest.nasVolumeInstanceNo) &&
				Objects.equals(this.isAsync, deleteNasVolumeInstanceRequest.isAsync) &&
				Objects.equals(this.responseFormatType, deleteNasVolumeInstanceRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nasVolumeInstanceNo, isAsync, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeleteNasVolumeInstanceRequest {\n");
		
		sb.append("		nasVolumeInstanceNo: ").append(toIndentedString(nasVolumeInstanceNo)).append("\n");
		sb.append("		isAsync: ").append(toIndentedString(isAsync)).append("\n");
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

