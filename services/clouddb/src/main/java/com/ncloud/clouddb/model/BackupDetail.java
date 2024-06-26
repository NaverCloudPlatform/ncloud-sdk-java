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
 * BackupDetail
 */
public class BackupDetail {
	private String fileName = null;

	private String startTime = null;

	private String endTime = null;

	private Long backupSize = null;

	public BackupDetail fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	 /**
	 * 백업파일이름
	 * @return fileName
	**/
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public BackupDetail startTime(String startTime) {
		this.startTime = startTime;
		return this;
	}

	 /**
	 * 백업시작시간
	 * @return startTime
	**/
	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public BackupDetail endTime(String endTime) {
		this.endTime = endTime;
		return this;
	}

	 /**
	 * 백업종료시간
	 * @return endTime
	**/
	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public BackupDetail backupSize(Long backupSize) {
		this.backupSize = backupSize;
		return this;
	}

	 /**
	 * 백업사이즈
	 * @return backupSize
	**/
	public Long getBackupSize() {
		return backupSize;
	}

	public void setBackupSize(Long backupSize) {
		this.backupSize = backupSize;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BackupDetail backupDetail = (BackupDetail) o;
		return Objects.equals(this.fileName, backupDetail.fileName) &&
				Objects.equals(this.startTime, backupDetail.startTime) &&
				Objects.equals(this.endTime, backupDetail.endTime) &&
				Objects.equals(this.backupSize, backupDetail.backupSize);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fileName, startTime, endTime, backupSize);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BackupDetail {\n");
		
		sb.append("		fileName: ").append(toIndentedString(fileName)).append("\n");
		sb.append("		startTime: ").append(toIndentedString(startTime)).append("\n");
		sb.append("		endTime: ").append(toIndentedString(endTime)).append("\n");
		sb.append("		backupSize: ").append(toIndentedString(backupSize)).append("\n");
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

