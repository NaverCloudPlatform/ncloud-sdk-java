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
 * DownloadDmsFileRequest
 */
public class DownloadDmsFileRequest {
	private String cloudDBInstanceNo = null;

	private String fileName = null;

	private String responseFormatType = null;

	public DownloadDmsFileRequest cloudDBInstanceNo(String cloudDBInstanceNo) {
		this.cloudDBInstanceNo = cloudDBInstanceNo;
		return this;
	}

	 /**
	 * 클라우드DB인스턴스번호
	 * @return cloudDBInstanceNo
	**/
	public String getCloudDBInstanceNo() {
		return cloudDBInstanceNo;
	}

	public void setCloudDBInstanceNo(String cloudDBInstanceNo) {
		this.cloudDBInstanceNo = cloudDBInstanceNo;
	}

	public DownloadDmsFileRequest fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	 /**
	 * 파일이름
	 * @return fileName
	**/
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public DownloadDmsFileRequest responseFormatType(String responseFormatType) {
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
		DownloadDmsFileRequest downloadDmsFileRequest = (DownloadDmsFileRequest) o;
		return Objects.equals(this.cloudDBInstanceNo, downloadDmsFileRequest.cloudDBInstanceNo) &&
				Objects.equals(this.fileName, downloadDmsFileRequest.fileName) &&
				Objects.equals(this.responseFormatType, downloadDmsFileRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cloudDBInstanceNo, fileName, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DownloadDmsFileRequest {\n");
		
		sb.append("		cloudDBInstanceNo: ").append(toIndentedString(cloudDBInstanceNo)).append("\n");
		sb.append("		fileName: ").append(toIndentedString(fileName)).append("\n");
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

