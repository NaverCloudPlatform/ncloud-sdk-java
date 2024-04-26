/*
 * autoscaling
 * <br/>https://ncloud.apigw.ntruss.com/autoscaling/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.autoscaling.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * SuspendProcessesRequest
 */
public class SuspendProcessesRequest {
	private String autoScalingGroupName = null;

	private List<String> scalingProcessCodeList = null;

	private String responseFormatType = null;

	public SuspendProcessesRequest autoScalingGroupName(String autoScalingGroupName) {
		this.autoScalingGroupName = autoScalingGroupName;
		return this;
	}

	 /**
	 * 오토스케일링그룹명
	 * @return autoScalingGroupName
	**/
	public String getAutoScalingGroupName() {
		return autoScalingGroupName;
	}

	public void setAutoScalingGroupName(String autoScalingGroupName) {
		this.autoScalingGroupName = autoScalingGroupName;
	}

	public SuspendProcessesRequest scalingProcessCodeList(List<String> scalingProcessCodeList) {
		this.scalingProcessCodeList = scalingProcessCodeList;
		return this;
	}

	public SuspendProcessesRequest addScalingProcessCodeListItem(String scalingProcessCodeListItem) {
		if (this.scalingProcessCodeList == null) {
			this.scalingProcessCodeList = new ArrayList<String>();
		}
		this.scalingProcessCodeList.add(scalingProcessCodeListItem);
		return this;
	}

	 /**
	 * 분류프로세스코드리스트
	 * @return scalingProcessCodeList
	**/
	public List<String> getScalingProcessCodeList() {
		return scalingProcessCodeList;
	}

	public void setScalingProcessCodeList(List<String> scalingProcessCodeList) {
		this.scalingProcessCodeList = scalingProcessCodeList;
	}

	public SuspendProcessesRequest responseFormatType(String responseFormatType) {
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
		SuspendProcessesRequest suspendProcessesRequest = (SuspendProcessesRequest) o;
		return Objects.equals(this.autoScalingGroupName, suspendProcessesRequest.autoScalingGroupName) &&
				Objects.equals(this.scalingProcessCodeList, suspendProcessesRequest.scalingProcessCodeList) &&
				Objects.equals(this.responseFormatType, suspendProcessesRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(autoScalingGroupName, scalingProcessCodeList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SuspendProcessesRequest {\n");
		
		sb.append("		autoScalingGroupName: ").append(toIndentedString(autoScalingGroupName)).append("\n");
		sb.append("		scalingProcessCodeList: ").append(toIndentedString(scalingProcessCodeList)).append("\n");
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

