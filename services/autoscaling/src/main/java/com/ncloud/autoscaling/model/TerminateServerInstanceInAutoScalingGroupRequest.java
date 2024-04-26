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

/**
 * TerminateServerInstanceInAutoScalingGroupRequest
 */
public class TerminateServerInstanceInAutoScalingGroupRequest {
	private String serverInstanceNo = null;

	private Boolean shouldDecrementDesiredCapacity = null;

	private String responseFormatType = null;

	public TerminateServerInstanceInAutoScalingGroupRequest serverInstanceNo(String serverInstanceNo) {
		this.serverInstanceNo = serverInstanceNo;
		return this;
	}

	 /**
	 * 서버인스턴스번호
	 * @return serverInstanceNo
	**/
	public String getServerInstanceNo() {
		return serverInstanceNo;
	}

	public void setServerInstanceNo(String serverInstanceNo) {
		this.serverInstanceNo = serverInstanceNo;
	}

	public TerminateServerInstanceInAutoScalingGroupRequest shouldDecrementDesiredCapacity(Boolean shouldDecrementDesiredCapacity) {
		this.shouldDecrementDesiredCapacity = shouldDecrementDesiredCapacity;
		return this;
	}

	 /**
	 * 기대용량치감소여부
	 * @return shouldDecrementDesiredCapacity
	**/
	public Boolean isShouldDecrementDesiredCapacity() {
		return shouldDecrementDesiredCapacity;
	}

	public void setShouldDecrementDesiredCapacity(Boolean shouldDecrementDesiredCapacity) {
		this.shouldDecrementDesiredCapacity = shouldDecrementDesiredCapacity;
	}

	public TerminateServerInstanceInAutoScalingGroupRequest responseFormatType(String responseFormatType) {
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
		TerminateServerInstanceInAutoScalingGroupRequest terminateServerInstanceInAutoScalingGroupRequest = (TerminateServerInstanceInAutoScalingGroupRequest) o;
		return Objects.equals(this.serverInstanceNo, terminateServerInstanceInAutoScalingGroupRequest.serverInstanceNo) &&
				Objects.equals(this.shouldDecrementDesiredCapacity, terminateServerInstanceInAutoScalingGroupRequest.shouldDecrementDesiredCapacity) &&
				Objects.equals(this.responseFormatType, terminateServerInstanceInAutoScalingGroupRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(serverInstanceNo, shouldDecrementDesiredCapacity, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TerminateServerInstanceInAutoScalingGroupRequest {\n");
		
		sb.append("		serverInstanceNo: ").append(toIndentedString(serverInstanceNo)).append("\n");
		sb.append("		shouldDecrementDesiredCapacity: ").append(toIndentedString(shouldDecrementDesiredCapacity)).append("\n");
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

