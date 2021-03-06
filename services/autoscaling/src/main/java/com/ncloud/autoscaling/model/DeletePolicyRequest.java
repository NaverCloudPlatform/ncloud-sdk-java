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
 * DeletePolicyRequest
 */
public class DeletePolicyRequest {
	private String autoScalingGroupName = null;

	private String policyName = null;

	private String responseFormatType = null;

	public DeletePolicyRequest autoScalingGroupName(String autoScalingGroupName) {
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

	public DeletePolicyRequest policyName(String policyName) {
		this.policyName = policyName;
		return this;
	}

	 /**
	 * 정책명
	 * @return policyName
	**/
	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public DeletePolicyRequest responseFormatType(String responseFormatType) {
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
		DeletePolicyRequest deletePolicyRequest = (DeletePolicyRequest) o;
		return Objects.equals(this.autoScalingGroupName, deletePolicyRequest.autoScalingGroupName) &&
				Objects.equals(this.policyName, deletePolicyRequest.policyName) &&
				Objects.equals(this.responseFormatType, deletePolicyRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(autoScalingGroupName, policyName, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeletePolicyRequest {\n");
		
		sb.append("		autoScalingGroupName: ").append(toIndentedString(autoScalingGroupName)).append("\n");
		sb.append("		policyName: ").append(toIndentedString(policyName)).append("\n");
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

