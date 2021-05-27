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
 * UpdateAutoScalingGroupRequest
 */
public class UpdateAutoScalingGroupRequest {
	private String regionCode = null;

	private String autoScalingGroupNo = null;

	private String launchConfigurationNo = null;

	private String serverNamePrefix = null;

	private Integer minSize = null;

	private Integer maxSize = null;

	private Integer desiredCapacity = null;

	private Integer defaultCoolDown = null;

	private Integer healthCheckGracePeriod = null;

	private String healthCheckTypeCode = null;

	private String responseFormatType = null;

	public UpdateAutoScalingGroupRequest regionCode(String regionCode) {
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

	public UpdateAutoScalingGroupRequest autoScalingGroupNo(String autoScalingGroupNo) {
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

	public UpdateAutoScalingGroupRequest launchConfigurationNo(String launchConfigurationNo) {
		this.launchConfigurationNo = launchConfigurationNo;
		return this;
	}

	 /**
	 * 론치설정번호
	 * @return launchConfigurationNo
	**/
	public String getLaunchConfigurationNo() {
		return launchConfigurationNo;
	}

	public void setLaunchConfigurationNo(String launchConfigurationNo) {
		this.launchConfigurationNo = launchConfigurationNo;
	}

	public UpdateAutoScalingGroupRequest serverNamePrefix(String serverNamePrefix) {
		this.serverNamePrefix = serverNamePrefix;
		return this;
	}

	 /**
	 * 서버이름Prefix
	 * @return serverNamePrefix
	**/
	public String getServerNamePrefix() {
		return serverNamePrefix;
	}

	public void setServerNamePrefix(String serverNamePrefix) {
		this.serverNamePrefix = serverNamePrefix;
	}

	public UpdateAutoScalingGroupRequest minSize(Integer minSize) {
		this.minSize = minSize;
		return this;
	}

	 /**
	 * 최소용량
	 * @return minSize
	**/
	public Integer getMinSize() {
		return minSize;
	}

	public void setMinSize(Integer minSize) {
		this.minSize = minSize;
	}

	public UpdateAutoScalingGroupRequest maxSize(Integer maxSize) {
		this.maxSize = maxSize;
		return this;
	}

	 /**
	 * 최대용량
	 * @return maxSize
	**/
	public Integer getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(Integer maxSize) {
		this.maxSize = maxSize;
	}

	public UpdateAutoScalingGroupRequest desiredCapacity(Integer desiredCapacity) {
		this.desiredCapacity = desiredCapacity;
		return this;
	}

	 /**
	 * 기대용량
	 * @return desiredCapacity
	**/
	public Integer getDesiredCapacity() {
		return desiredCapacity;
	}

	public void setDesiredCapacity(Integer desiredCapacity) {
		this.desiredCapacity = desiredCapacity;
	}

	public UpdateAutoScalingGroupRequest defaultCoolDown(Integer defaultCoolDown) {
		this.defaultCoolDown = defaultCoolDown;
		return this;
	}

	 /**
	 * 쿨다운기본값
	 * @return defaultCoolDown
	**/
	public Integer getDefaultCoolDown() {
		return defaultCoolDown;
	}

	public void setDefaultCoolDown(Integer defaultCoolDown) {
		this.defaultCoolDown = defaultCoolDown;
	}

	public UpdateAutoScalingGroupRequest healthCheckGracePeriod(Integer healthCheckGracePeriod) {
		this.healthCheckGracePeriod = healthCheckGracePeriod;
		return this;
	}

	 /**
	 * 헬스체크보류기간
	 * @return healthCheckGracePeriod
	**/
	public Integer getHealthCheckGracePeriod() {
		return healthCheckGracePeriod;
	}

	public void setHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
		this.healthCheckGracePeriod = healthCheckGracePeriod;
	}

	public UpdateAutoScalingGroupRequest healthCheckTypeCode(String healthCheckTypeCode) {
		this.healthCheckTypeCode = healthCheckTypeCode;
		return this;
	}

	 /**
	 * 헬스체크유형코드
	 * @return healthCheckTypeCode
	**/
	public String getHealthCheckTypeCode() {
		return healthCheckTypeCode;
	}

	public void setHealthCheckTypeCode(String healthCheckTypeCode) {
		this.healthCheckTypeCode = healthCheckTypeCode;
	}

	public UpdateAutoScalingGroupRequest responseFormatType(String responseFormatType) {
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
		UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest = (UpdateAutoScalingGroupRequest) o;
		return Objects.equals(this.regionCode, updateAutoScalingGroupRequest.regionCode) &&
				Objects.equals(this.autoScalingGroupNo, updateAutoScalingGroupRequest.autoScalingGroupNo) &&
				Objects.equals(this.launchConfigurationNo, updateAutoScalingGroupRequest.launchConfigurationNo) &&
				Objects.equals(this.serverNamePrefix, updateAutoScalingGroupRequest.serverNamePrefix) &&
				Objects.equals(this.minSize, updateAutoScalingGroupRequest.minSize) &&
				Objects.equals(this.maxSize, updateAutoScalingGroupRequest.maxSize) &&
				Objects.equals(this.desiredCapacity, updateAutoScalingGroupRequest.desiredCapacity) &&
				Objects.equals(this.defaultCoolDown, updateAutoScalingGroupRequest.defaultCoolDown) &&
				Objects.equals(this.healthCheckGracePeriod, updateAutoScalingGroupRequest.healthCheckGracePeriod) &&
				Objects.equals(this.healthCheckTypeCode, updateAutoScalingGroupRequest.healthCheckTypeCode) &&
				Objects.equals(this.responseFormatType, updateAutoScalingGroupRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, autoScalingGroupNo, launchConfigurationNo, serverNamePrefix, minSize, maxSize, desiredCapacity, defaultCoolDown, healthCheckGracePeriod, healthCheckTypeCode, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UpdateAutoScalingGroupRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		autoScalingGroupNo: ").append(toIndentedString(autoScalingGroupNo)).append("\n");
		sb.append("		launchConfigurationNo: ").append(toIndentedString(launchConfigurationNo)).append("\n");
		sb.append("		serverNamePrefix: ").append(toIndentedString(serverNamePrefix)).append("\n");
		sb.append("		minSize: ").append(toIndentedString(minSize)).append("\n");
		sb.append("		maxSize: ").append(toIndentedString(maxSize)).append("\n");
		sb.append("		desiredCapacity: ").append(toIndentedString(desiredCapacity)).append("\n");
		sb.append("		defaultCoolDown: ").append(toIndentedString(defaultCoolDown)).append("\n");
		sb.append("		healthCheckGracePeriod: ").append(toIndentedString(healthCheckGracePeriod)).append("\n");
		sb.append("		healthCheckTypeCode: ").append(toIndentedString(healthCheckTypeCode)).append("\n");
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

