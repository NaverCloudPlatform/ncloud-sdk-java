/*
 * monitoring
 * <br/>https://ncloud.apigw.ntruss.com/monitoring/v2
 *
 * OpenAPI spec version: 2020-05-22T05:53:06Z
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.monitoring.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * GetMetricStatisticListRequest
 */
public class GetMetricStatisticListRequest {
	private List<String> instanceNoList = new ArrayList<String>();

	private String metricName = null;

	private String startTime = null;

	private String endTime = null;

	private Integer period = null;

	private String responseFormatType = null;

	public GetMetricStatisticListRequest instanceNoList(List<String> instanceNoList) {
		this.instanceNoList = instanceNoList;
		return this;
	}

	public GetMetricStatisticListRequest addInstanceNoListItem(String instanceNoListItem) {
		this.instanceNoList.add(instanceNoListItem);
		return this;
	}

	 /**
	 * (서버)인스턴스번호리스트
	 * @return instanceNoList
	**/
	public List<String> getInstanceNoList() {
		return instanceNoList;
	}

	public void setInstanceNoList(List<String> instanceNoList) {
		this.instanceNoList = instanceNoList;
	}

	public GetMetricStatisticListRequest metricName(String metricName) {
		this.metricName = metricName;
		return this;
	}

	 /**
	 * 메트릭이름리스트
	 * @return metricName
	**/
	public String getMetricName() {
		return metricName;
	}

	public void setMetricName(String metricName) {
		this.metricName = metricName;
	}

	public GetMetricStatisticListRequest startTime(String startTime) {
		this.startTime = startTime;
		return this;
	}

	 /**
	 * 조회시작일시
	 * @return startTime
	**/
	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public GetMetricStatisticListRequest endTime(String endTime) {
		this.endTime = endTime;
		return this;
	}

	 /**
	 * 조회종료일시
	 * @return endTime
	**/
	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public GetMetricStatisticListRequest period(Integer period) {
		this.period = period;
		return this;
	}

	 /**
	 * 조회주기(초)
	 * @return period
	**/
	public Integer getPeriod() {
		return period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public GetMetricStatisticListRequest responseFormatType(String responseFormatType) {
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
		GetMetricStatisticListRequest getMetricStatisticListRequest = (GetMetricStatisticListRequest) o;
		return Objects.equals(this.instanceNoList, getMetricStatisticListRequest.instanceNoList) &&
				Objects.equals(this.metricName, getMetricStatisticListRequest.metricName) &&
				Objects.equals(this.startTime, getMetricStatisticListRequest.startTime) &&
				Objects.equals(this.endTime, getMetricStatisticListRequest.endTime) &&
				Objects.equals(this.period, getMetricStatisticListRequest.period) &&
				Objects.equals(this.responseFormatType, getMetricStatisticListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(instanceNoList, metricName, startTime, endTime, period, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetMetricStatisticListRequest {\n");
		
		sb.append("		instanceNoList: ").append(toIndentedString(instanceNoList)).append("\n");
		sb.append("		metricName: ").append(toIndentedString(metricName)).append("\n");
		sb.append("		startTime: ").append(toIndentedString(startTime)).append("\n");
		sb.append("		endTime: ").append(toIndentedString(endTime)).append("\n");
		sb.append("		period: ").append(toIndentedString(period)).append("\n");
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
