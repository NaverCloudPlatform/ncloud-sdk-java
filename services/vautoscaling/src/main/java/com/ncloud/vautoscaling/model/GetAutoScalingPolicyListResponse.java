/*
 * vautoscaling
 * VPC Auto Scaling 관련 API<br/>https://ncloud.apigw.ntruss.com/vautoscaling/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vautoscaling.model;

import java.util.Objects;
import com.ncloud.vautoscaling.model.ScalingPolicy;
import java.util.ArrayList;
import java.util.List;

/**
 * GetAutoScalingPolicyListResponse
 */
public class GetAutoScalingPolicyListResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<ScalingPolicy> scalingPolicyList = null;

	public GetAutoScalingPolicyListResponse requestId(String requestId) {
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

	public GetAutoScalingPolicyListResponse returnCode(String returnCode) {
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

	public GetAutoScalingPolicyListResponse returnMessage(String returnMessage) {
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

	public GetAutoScalingPolicyListResponse totalRows(Integer totalRows) {
		this.totalRows = totalRows;
		return this;
	}

	 /**
	 * Get totalRows
	 * @return totalRows
	**/
	public Integer getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(Integer totalRows) {
		this.totalRows = totalRows;
	}

	public GetAutoScalingPolicyListResponse scalingPolicyList(List<ScalingPolicy> scalingPolicyList) {
		this.scalingPolicyList = scalingPolicyList;
		return this;
	}

	public GetAutoScalingPolicyListResponse addScalingPolicyListItem(ScalingPolicy scalingPolicyListItem) {
		if (this.scalingPolicyList == null) {
			this.scalingPolicyList = new ArrayList<ScalingPolicy>();
		}
		this.scalingPolicyList.add(scalingPolicyListItem);
		return this;
	}

	 /**
	 * Get scalingPolicyList
	 * @return scalingPolicyList
	**/
	public List<ScalingPolicy> getScalingPolicyList() {
		return scalingPolicyList;
	}

	public void setScalingPolicyList(List<ScalingPolicy> scalingPolicyList) {
		this.scalingPolicyList = scalingPolicyList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GetAutoScalingPolicyListResponse getAutoScalingPolicyListResponse = (GetAutoScalingPolicyListResponse) o;
		return Objects.equals(this.requestId, getAutoScalingPolicyListResponse.requestId) &&
				Objects.equals(this.returnCode, getAutoScalingPolicyListResponse.returnCode) &&
				Objects.equals(this.returnMessage, getAutoScalingPolicyListResponse.returnMessage) &&
				Objects.equals(this.totalRows, getAutoScalingPolicyListResponse.totalRows) &&
				Objects.equals(this.scalingPolicyList, getAutoScalingPolicyListResponse.scalingPolicyList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, scalingPolicyList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetAutoScalingPolicyListResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		scalingPolicyList: ").append(toIndentedString(scalingPolicyList)).append("\n");
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

