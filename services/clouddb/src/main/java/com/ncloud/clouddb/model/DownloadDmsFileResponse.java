/*
 * clouddb
 * Cloud DB<br/>https://ncloud.apigw.ntruss.com/clouddb/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.clouddb.model;

import java.util.Objects;

/**
 * DownloadDmsFileResponse
 */
public class DownloadDmsFileResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private String requestNo = null;

	public DownloadDmsFileResponse requestId(String requestId) {
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

	public DownloadDmsFileResponse returnCode(String returnCode) {
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

	public DownloadDmsFileResponse returnMessage(String returnMessage) {
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

	public DownloadDmsFileResponse requestNo(String requestNo) {
		this.requestNo = requestNo;
		return this;
	}

	 /**
	 * Get requestNo
	 * @return requestNo
	**/
	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DownloadDmsFileResponse downloadDmsFileResponse = (DownloadDmsFileResponse) o;
		return Objects.equals(this.requestId, downloadDmsFileResponse.requestId) &&
				Objects.equals(this.returnCode, downloadDmsFileResponse.returnCode) &&
				Objects.equals(this.returnMessage, downloadDmsFileResponse.returnMessage) &&
				Objects.equals(this.requestNo, downloadDmsFileResponse.requestNo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, requestNo);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DownloadDmsFileResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		requestNo: ").append(toIndentedString(requestNo)).append("\n");
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

