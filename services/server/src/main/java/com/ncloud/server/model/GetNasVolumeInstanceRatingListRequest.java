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
 * GetNasVolumeInstanceRatingListRequest
 */
public class GetNasVolumeInstanceRatingListRequest {
	private String endTime = null;

	private String interval = null;

	private String nasVolumeInstanceNo = null;

	private String startTime = null;

	private String responseFormatType = null;

	public GetNasVolumeInstanceRatingListRequest endTime(String endTime) {
		this.endTime = endTime;
		return this;
	}

	 /**
	 * 측정종료시간
	 * @return endTime
	**/
	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public GetNasVolumeInstanceRatingListRequest interval(String interval) {
		this.interval = interval;
		return this;
	}

	 /**
	 * 측정간격
	 * @return interval
	**/
	public String getInterval() {
		return interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}

	public GetNasVolumeInstanceRatingListRequest nasVolumeInstanceNo(String nasVolumeInstanceNo) {
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

	public GetNasVolumeInstanceRatingListRequest startTime(String startTime) {
		this.startTime = startTime;
		return this;
	}

	 /**
	 * 측정시작시간
	 * @return startTime
	**/
	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public GetNasVolumeInstanceRatingListRequest responseFormatType(String responseFormatType) {
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
		GetNasVolumeInstanceRatingListRequest getNasVolumeInstanceRatingListRequest = (GetNasVolumeInstanceRatingListRequest) o;
		return Objects.equals(this.endTime, getNasVolumeInstanceRatingListRequest.endTime) &&
				Objects.equals(this.interval, getNasVolumeInstanceRatingListRequest.interval) &&
				Objects.equals(this.nasVolumeInstanceNo, getNasVolumeInstanceRatingListRequest.nasVolumeInstanceNo) &&
				Objects.equals(this.startTime, getNasVolumeInstanceRatingListRequest.startTime) &&
				Objects.equals(this.responseFormatType, getNasVolumeInstanceRatingListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(endTime, interval, nasVolumeInstanceNo, startTime, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetNasVolumeInstanceRatingListRequest {\n");
		
		sb.append("		endTime: ").append(toIndentedString(endTime)).append("\n");
		sb.append("		interval: ").append(toIndentedString(interval)).append("\n");
		sb.append("		nasVolumeInstanceNo: ").append(toIndentedString(nasVolumeInstanceNo)).append("\n");
		sb.append("		startTime: ").append(toIndentedString(startTime)).append("\n");
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

