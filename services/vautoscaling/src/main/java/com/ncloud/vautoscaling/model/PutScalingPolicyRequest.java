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

/**
 * PutScalingPolicyRequest
 */
public class PutScalingPolicyRequest {
	private String regionCode = null;

	private String autoScalingGroupNo = null;

	private String policyNo = null;

	private String policyName = null;

	private String adjustmentTypeCode = null;

	private Integer scalingAdjustment = null;

	private Integer minAdjustmentStep = null;

	private Integer coolDown = null;

	private String responseFormatType = null;

	public PutScalingPolicyRequest regionCode(String regionCode) {
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

	public PutScalingPolicyRequest autoScalingGroupNo(String autoScalingGroupNo) {
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

	public PutScalingPolicyRequest policyNo(String policyNo) {
		this.policyNo = policyNo;
		return this;
	}

	 /**
	 * 정책번호
	 * @return policyNo
	**/
	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public PutScalingPolicyRequest policyName(String policyName) {
		this.policyName = policyName;
		return this;
	}

	 /**
	 * 정책이름
	 * @return policyName
	**/
	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public PutScalingPolicyRequest adjustmentTypeCode(String adjustmentTypeCode) {
		this.adjustmentTypeCode = adjustmentTypeCode;
		return this;
	}

	 /**
	 * 조정유형코드
	 * @return adjustmentTypeCode
	**/
	public String getAdjustmentTypeCode() {
		return adjustmentTypeCode;
	}

	public void setAdjustmentTypeCode(String adjustmentTypeCode) {
		this.adjustmentTypeCode = adjustmentTypeCode;
	}

	public PutScalingPolicyRequest scalingAdjustment(Integer scalingAdjustment) {
		this.scalingAdjustment = scalingAdjustment;
		return this;
	}

	 /**
	 * 조정값
	 * @return scalingAdjustment
	**/
	public Integer getScalingAdjustment() {
		return scalingAdjustment;
	}

	public void setScalingAdjustment(Integer scalingAdjustment) {
		this.scalingAdjustment = scalingAdjustment;
	}

	public PutScalingPolicyRequest minAdjustmentStep(Integer minAdjustmentStep) {
		this.minAdjustmentStep = minAdjustmentStep;
		return this;
	}

	 /**
	 * 최소조정폭
	 * @return minAdjustmentStep
	**/
	public Integer getMinAdjustmentStep() {
		return minAdjustmentStep;
	}

	public void setMinAdjustmentStep(Integer minAdjustmentStep) {
		this.minAdjustmentStep = minAdjustmentStep;
	}

	public PutScalingPolicyRequest coolDown(Integer coolDown) {
		this.coolDown = coolDown;
		return this;
	}

	 /**
	 * 쿨다운
	 * @return coolDown
	**/
	public Integer getCoolDown() {
		return coolDown;
	}

	public void setCoolDown(Integer coolDown) {
		this.coolDown = coolDown;
	}

	public PutScalingPolicyRequest responseFormatType(String responseFormatType) {
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
		PutScalingPolicyRequest putScalingPolicyRequest = (PutScalingPolicyRequest) o;
		return Objects.equals(this.regionCode, putScalingPolicyRequest.regionCode) &&
				Objects.equals(this.autoScalingGroupNo, putScalingPolicyRequest.autoScalingGroupNo) &&
				Objects.equals(this.policyNo, putScalingPolicyRequest.policyNo) &&
				Objects.equals(this.policyName, putScalingPolicyRequest.policyName) &&
				Objects.equals(this.adjustmentTypeCode, putScalingPolicyRequest.adjustmentTypeCode) &&
				Objects.equals(this.scalingAdjustment, putScalingPolicyRequest.scalingAdjustment) &&
				Objects.equals(this.minAdjustmentStep, putScalingPolicyRequest.minAdjustmentStep) &&
				Objects.equals(this.coolDown, putScalingPolicyRequest.coolDown) &&
				Objects.equals(this.responseFormatType, putScalingPolicyRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, autoScalingGroupNo, policyNo, policyName, adjustmentTypeCode, scalingAdjustment, minAdjustmentStep, coolDown, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PutScalingPolicyRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		autoScalingGroupNo: ").append(toIndentedString(autoScalingGroupNo)).append("\n");
		sb.append("		policyNo: ").append(toIndentedString(policyNo)).append("\n");
		sb.append("		policyName: ").append(toIndentedString(policyName)).append("\n");
		sb.append("		adjustmentTypeCode: ").append(toIndentedString(adjustmentTypeCode)).append("\n");
		sb.append("		scalingAdjustment: ").append(toIndentedString(scalingAdjustment)).append("\n");
		sb.append("		minAdjustmentStep: ").append(toIndentedString(minAdjustmentStep)).append("\n");
		sb.append("		coolDown: ").append(toIndentedString(coolDown)).append("\n");
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

