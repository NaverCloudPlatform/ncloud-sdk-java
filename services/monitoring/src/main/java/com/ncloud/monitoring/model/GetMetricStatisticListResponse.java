/*
 * monitoring
 * <br/>https://ncloud.apigw.ntruss.com/monitoring/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.monitoring.model;

import java.util.Objects;
import com.ncloud.monitoring.model.MetricStatistic;
import java.util.ArrayList;
import java.util.List;

/**
 * GetMetricStatisticListResponse
 */
public class GetMetricStatisticListResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private List<MetricStatistic> metricStatisticList = null;

	public GetMetricStatisticListResponse requestId(String requestId) {
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

	public GetMetricStatisticListResponse returnCode(String returnCode) {
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

	public GetMetricStatisticListResponse returnMessage(String returnMessage) {
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

	public GetMetricStatisticListResponse metricStatisticList(List<MetricStatistic> metricStatisticList) {
		this.metricStatisticList = metricStatisticList;
		return this;
	}

	public GetMetricStatisticListResponse addMetricStatisticListItem(MetricStatistic metricStatisticListItem) {
		if (this.metricStatisticList == null) {
			this.metricStatisticList = new ArrayList<MetricStatistic>();
		}
		this.metricStatisticList.add(metricStatisticListItem);
		return this;
	}

	 /**
	 * Get metricStatisticList
	 * @return metricStatisticList
	**/
	public List<MetricStatistic> getMetricStatisticList() {
		return metricStatisticList;
	}

	public void setMetricStatisticList(List<MetricStatistic> metricStatisticList) {
		this.metricStatisticList = metricStatisticList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GetMetricStatisticListResponse getMetricStatisticListResponse = (GetMetricStatisticListResponse) o;
		return Objects.equals(this.requestId, getMetricStatisticListResponse.requestId) &&
				Objects.equals(this.returnCode, getMetricStatisticListResponse.returnCode) &&
				Objects.equals(this.returnMessage, getMetricStatisticListResponse.returnMessage) &&
				Objects.equals(this.metricStatisticList, getMetricStatisticListResponse.metricStatisticList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, metricStatisticList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetMetricStatisticListResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		metricStatisticList: ").append(toIndentedString(metricStatisticList)).append("\n");
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

