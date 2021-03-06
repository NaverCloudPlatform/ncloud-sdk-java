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
 * GetBackupListRequest
 */
public class GetBackupListRequest {
	private String cloudDBInstanceNo = null;

	private String databaseName = null;

	private String backupTypeCode = null;

	private String responseFormatType = null;

	public GetBackupListRequest cloudDBInstanceNo(String cloudDBInstanceNo) {
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

	public GetBackupListRequest databaseName(String databaseName) {
		this.databaseName = databaseName;
		return this;
	}

	 /**
	 * 데이터베이스이름
	 * @return databaseName
	**/
	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public GetBackupListRequest backupTypeCode(String backupTypeCode) {
		this.backupTypeCode = backupTypeCode;
		return this;
	}

	 /**
	 * 백업유형코드
	 * @return backupTypeCode
	**/
	public String getBackupTypeCode() {
		return backupTypeCode;
	}

	public void setBackupTypeCode(String backupTypeCode) {
		this.backupTypeCode = backupTypeCode;
	}

	public GetBackupListRequest responseFormatType(String responseFormatType) {
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
		GetBackupListRequest getBackupListRequest = (GetBackupListRequest) o;
		return Objects.equals(this.cloudDBInstanceNo, getBackupListRequest.cloudDBInstanceNo) &&
				Objects.equals(this.databaseName, getBackupListRequest.databaseName) &&
				Objects.equals(this.backupTypeCode, getBackupListRequest.backupTypeCode) &&
				Objects.equals(this.responseFormatType, getBackupListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cloudDBInstanceNo, databaseName, backupTypeCode, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetBackupListRequest {\n");
		
		sb.append("		cloudDBInstanceNo: ").append(toIndentedString(cloudDBInstanceNo)).append("\n");
		sb.append("		databaseName: ").append(toIndentedString(databaseName)).append("\n");
		sb.append("		backupTypeCode: ").append(toIndentedString(backupTypeCode)).append("\n");
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

