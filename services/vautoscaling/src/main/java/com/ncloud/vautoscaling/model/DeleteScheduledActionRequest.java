/*
 * vautoscaling
 * VPC Auto Scaling 관련 API<br/>https://ncloud.apigw.ntruss.com/vautoscaling/v2
 *
 * OpenAPI spec version: 2021-01-21T11:15:08Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vautoscaling.model;

import java.util.Objects;

/**
 * DeleteScheduledActionRequest
 */
public class DeleteScheduledActionRequest {
	private String regionCode = null;

	private String autoScalingGroupNo = null;

	private String scheduledActionNo = null;

	private String responseFormatType = null;

	public DeleteScheduledActionRequest regionCode(String regionCode) {
		this.regionCode = regionCode;
		return this;
	}

	 /**
	 * REGION코드
	 * @return regionCode
	**/
	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public DeleteScheduledActionRequest autoScalingGroupNo(String autoScalingGroupNo) {
		this.autoScalingGroupNo = autoScalingGroupNo;
		return this;
	}

	 /**
	 * 오토스케일링그룹번호
	 * @return autoScalingGroupNo
	**/
	public String getAutoScalingGroupNo() {
		return autoScalingGroupNo;
	}

	public void setAutoScalingGroupNo(String autoScalingGroupNo) {
		this.autoScalingGroupNo = autoScalingGroupNo;
	}

	public DeleteScheduledActionRequest scheduledActionNo(String scheduledActionNo) {
		this.scheduledActionNo = scheduledActionNo;
		return this;
	}

	 /**
	 * 스케쥴액션번호
	 * @return scheduledActionNo
	**/
	public String getScheduledActionNo() {
		return scheduledActionNo;
	}

	public void setScheduledActionNo(String scheduledActionNo) {
		this.scheduledActionNo = scheduledActionNo;
	}

	public DeleteScheduledActionRequest responseFormatType(String responseFormatType) {
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
		DeleteScheduledActionRequest deleteScheduledActionRequest = (DeleteScheduledActionRequest) o;
		return Objects.equals(this.regionCode, deleteScheduledActionRequest.regionCode) &&
				Objects.equals(this.autoScalingGroupNo, deleteScheduledActionRequest.autoScalingGroupNo) &&
				Objects.equals(this.scheduledActionNo, deleteScheduledActionRequest.scheduledActionNo) &&
				Objects.equals(this.responseFormatType, deleteScheduledActionRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, autoScalingGroupNo, scheduledActionNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeleteScheduledActionRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		autoScalingGroupNo: ").append(toIndentedString(autoScalingGroupNo)).append("\n");
		sb.append("		scheduledActionNo: ").append(toIndentedString(scheduledActionNo)).append("\n");
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

