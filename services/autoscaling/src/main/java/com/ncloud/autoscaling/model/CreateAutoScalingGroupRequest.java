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
 * CreateAutoScalingGroupRequest
 */
public class CreateAutoScalingGroupRequest {
	private String autoScalingGroupName = null;

	private String launchConfigurationName = null;

	private Integer desiredCapacity = null;

	private Integer minSize = null;

	private Integer maxSize = null;

	private Integer defaultCooldown = null;

	private List<String> loadBalancerNameList = null;

	private Integer healthCheckGracePeriod = null;

	private String healthCheckTypeCode = null;

	private List<String> zoneNoList = new ArrayList<String>();

	private String responseFormatType = null;

	public CreateAutoScalingGroupRequest autoScalingGroupName(String autoScalingGroupName) {
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

	public CreateAutoScalingGroupRequest launchConfigurationName(String launchConfigurationName) {
		this.launchConfigurationName = launchConfigurationName;
		return this;
	}

	 /**
	 * 론치설정명
	 * @return launchConfigurationName
	**/
	public String getLaunchConfigurationName() {
		return launchConfigurationName;
	}

	public void setLaunchConfigurationName(String launchConfigurationName) {
		this.launchConfigurationName = launchConfigurationName;
	}

	public CreateAutoScalingGroupRequest desiredCapacity(Integer desiredCapacity) {
		this.desiredCapacity = desiredCapacity;
		return this;
	}

	 /**
	 * 기대용량치
	 * @return desiredCapacity
	**/
	public Integer getDesiredCapacity() {
		return desiredCapacity;
	}

	public void setDesiredCapacity(Integer desiredCapacity) {
		this.desiredCapacity = desiredCapacity;
	}

	public CreateAutoScalingGroupRequest minSize(Integer minSize) {
		this.minSize = minSize;
		return this;
	}

	 /**
	 * 최소사이즈
	 * @return minSize
	**/
	public Integer getMinSize() {
		return minSize;
	}

	public void setMinSize(Integer minSize) {
		this.minSize = minSize;
	}

	public CreateAutoScalingGroupRequest maxSize(Integer maxSize) {
		this.maxSize = maxSize;
		return this;
	}

	 /**
	 * 최대사이즈
	 * @return maxSize
	**/
	public Integer getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(Integer maxSize) {
		this.maxSize = maxSize;
	}

	public CreateAutoScalingGroupRequest defaultCooldown(Integer defaultCooldown) {
		this.defaultCooldown = defaultCooldown;
		return this;
	}

	 /**
	 * 디폴트쿨다운타임
	 * @return defaultCooldown
	**/
	public Integer getDefaultCooldown() {
		return defaultCooldown;
	}

	public void setDefaultCooldown(Integer defaultCooldown) {
		this.defaultCooldown = defaultCooldown;
	}

	public CreateAutoScalingGroupRequest loadBalancerNameList(List<String> loadBalancerNameList) {
		this.loadBalancerNameList = loadBalancerNameList;
		return this;
	}

	public CreateAutoScalingGroupRequest addLoadBalancerNameListItem(String loadBalancerNameListItem) {
		if (this.loadBalancerNameList == null) {
			this.loadBalancerNameList = new ArrayList<String>();
		}
		this.loadBalancerNameList.add(loadBalancerNameListItem);
		return this;
	}

	 /**
	 * 로드밸런서명리스트
	 * @return loadBalancerNameList
	**/
	public List<String> getLoadBalancerNameList() {
		return loadBalancerNameList;
	}

	public void setLoadBalancerNameList(List<String> loadBalancerNameList) {
		this.loadBalancerNameList = loadBalancerNameList;
	}

	public CreateAutoScalingGroupRequest healthCheckGracePeriod(Integer healthCheckGracePeriod) {
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

	public CreateAutoScalingGroupRequest healthCheckTypeCode(String healthCheckTypeCode) {
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

	public CreateAutoScalingGroupRequest zoneNoList(List<String> zoneNoList) {
		this.zoneNoList = zoneNoList;
		return this;
	}

	public CreateAutoScalingGroupRequest addZoneNoListItem(String zoneNoListItem) {
		this.zoneNoList.add(zoneNoListItem);
		return this;
	}

	 /**
	 * ZONE번호리스트
	 * @return zoneNoList
	**/
	public List<String> getZoneNoList() {
		return zoneNoList;
	}

	public void setZoneNoList(List<String> zoneNoList) {
		this.zoneNoList = zoneNoList;
	}

	public CreateAutoScalingGroupRequest responseFormatType(String responseFormatType) {
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
		CreateAutoScalingGroupRequest createAutoScalingGroupRequest = (CreateAutoScalingGroupRequest) o;
		return Objects.equals(this.autoScalingGroupName, createAutoScalingGroupRequest.autoScalingGroupName) &&
				Objects.equals(this.launchConfigurationName, createAutoScalingGroupRequest.launchConfigurationName) &&
				Objects.equals(this.desiredCapacity, createAutoScalingGroupRequest.desiredCapacity) &&
				Objects.equals(this.minSize, createAutoScalingGroupRequest.minSize) &&
				Objects.equals(this.maxSize, createAutoScalingGroupRequest.maxSize) &&
				Objects.equals(this.defaultCooldown, createAutoScalingGroupRequest.defaultCooldown) &&
				Objects.equals(this.loadBalancerNameList, createAutoScalingGroupRequest.loadBalancerNameList) &&
				Objects.equals(this.healthCheckGracePeriod, createAutoScalingGroupRequest.healthCheckGracePeriod) &&
				Objects.equals(this.healthCheckTypeCode, createAutoScalingGroupRequest.healthCheckTypeCode) &&
				Objects.equals(this.zoneNoList, createAutoScalingGroupRequest.zoneNoList) &&
				Objects.equals(this.responseFormatType, createAutoScalingGroupRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(autoScalingGroupName, launchConfigurationName, desiredCapacity, minSize, maxSize, defaultCooldown, loadBalancerNameList, healthCheckGracePeriod, healthCheckTypeCode, zoneNoList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateAutoScalingGroupRequest {\n");
		
		sb.append("		autoScalingGroupName: ").append(toIndentedString(autoScalingGroupName)).append("\n");
		sb.append("		launchConfigurationName: ").append(toIndentedString(launchConfigurationName)).append("\n");
		sb.append("		desiredCapacity: ").append(toIndentedString(desiredCapacity)).append("\n");
		sb.append("		minSize: ").append(toIndentedString(minSize)).append("\n");
		sb.append("		maxSize: ").append(toIndentedString(maxSize)).append("\n");
		sb.append("		defaultCooldown: ").append(toIndentedString(defaultCooldown)).append("\n");
		sb.append("		loadBalancerNameList: ").append(toIndentedString(loadBalancerNameList)).append("\n");
		sb.append("		healthCheckGracePeriod: ").append(toIndentedString(healthCheckGracePeriod)).append("\n");
		sb.append("		healthCheckTypeCode: ").append(toIndentedString(healthCheckTypeCode)).append("\n");
		sb.append("		zoneNoList: ").append(toIndentedString(zoneNoList)).append("\n");
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

