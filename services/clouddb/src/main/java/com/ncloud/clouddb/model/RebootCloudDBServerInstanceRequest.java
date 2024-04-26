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
 * RebootCloudDBServerInstanceRequest
 */
public class RebootCloudDBServerInstanceRequest {
	private String cloudDBServerInstanceNo = null;

	private Boolean isWithFailover = null;

	private Boolean isRebootNow = null;

	private String rebootTime = null;

	private String responseFormatType = null;

	public RebootCloudDBServerInstanceRequest cloudDBServerInstanceNo(String cloudDBServerInstanceNo) {
		this.cloudDBServerInstanceNo = cloudDBServerInstanceNo;
		return this;
	}

	 /**
	 * CloudDB서버인스턴스번호
	 * @return cloudDBServerInstanceNo
	**/
	public String getCloudDBServerInstanceNo() {
		return cloudDBServerInstanceNo;
	}

	public void setCloudDBServerInstanceNo(String cloudDBServerInstanceNo) {
		this.cloudDBServerInstanceNo = cloudDBServerInstanceNo;
	}

	public RebootCloudDBServerInstanceRequest isWithFailover(Boolean isWithFailover) {
		this.isWithFailover = isWithFailover;
		return this;
	}

	 /**
	 * Failover여부
	 * @return isWithFailover
	**/
	public Boolean isIsWithFailover() {
		return isWithFailover;
	}

	public void setIsWithFailover(Boolean isWithFailover) {
		this.isWithFailover = isWithFailover;
	}

	public RebootCloudDBServerInstanceRequest isRebootNow(Boolean isRebootNow) {
		this.isRebootNow = isRebootNow;
		return this;
	}

	 /**
	 * 지금재부팅여부
	 * @return isRebootNow
	**/
	public Boolean isIsRebootNow() {
		return isRebootNow;
	}

	public void setIsRebootNow(Boolean isRebootNow) {
		this.isRebootNow = isRebootNow;
	}

	public RebootCloudDBServerInstanceRequest rebootTime(String rebootTime) {
		this.rebootTime = rebootTime;
		return this;
	}

	 /**
	 * 예약재부팅시간
	 * @return rebootTime
	**/
	public String getRebootTime() {
		return rebootTime;
	}

	public void setRebootTime(String rebootTime) {
		this.rebootTime = rebootTime;
	}

	public RebootCloudDBServerInstanceRequest responseFormatType(String responseFormatType) {
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
		RebootCloudDBServerInstanceRequest rebootCloudDBServerInstanceRequest = (RebootCloudDBServerInstanceRequest) o;
		return Objects.equals(this.cloudDBServerInstanceNo, rebootCloudDBServerInstanceRequest.cloudDBServerInstanceNo) &&
				Objects.equals(this.isWithFailover, rebootCloudDBServerInstanceRequest.isWithFailover) &&
				Objects.equals(this.isRebootNow, rebootCloudDBServerInstanceRequest.isRebootNow) &&
				Objects.equals(this.rebootTime, rebootCloudDBServerInstanceRequest.rebootTime) &&
				Objects.equals(this.responseFormatType, rebootCloudDBServerInstanceRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cloudDBServerInstanceNo, isWithFailover, isRebootNow, rebootTime, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RebootCloudDBServerInstanceRequest {\n");
		
		sb.append("		cloudDBServerInstanceNo: ").append(toIndentedString(cloudDBServerInstanceNo)).append("\n");
		sb.append("		isWithFailover: ").append(toIndentedString(isWithFailover)).append("\n");
		sb.append("		isRebootNow: ").append(toIndentedString(isRebootNow)).append("\n");
		sb.append("		rebootTime: ").append(toIndentedString(rebootTime)).append("\n");
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

