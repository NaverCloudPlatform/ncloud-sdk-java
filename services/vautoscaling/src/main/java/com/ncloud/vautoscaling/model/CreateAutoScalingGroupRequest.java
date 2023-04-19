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
import java.util.ArrayList;
import java.util.List;

/**
 * CreateAutoScalingGroupRequest
 */
public class CreateAutoScalingGroupRequest {
	private String regionCode = null;

	private String launchConfigurationNo = null;

	private String autoScalingGroupName = null;

	private String vpcNo = null;

	private String subnetNo = null;

	private List<String> accessControlGroupNoList = new ArrayList<String>();

	private String serverNamePrefix = null;

	private Integer minSize = null;

	private Integer maxSize = null;

	private Integer desiredCapacity = null;

	private Integer defaultCoolDown = null;

	private Integer healthCheckGracePeriod = null;

	private String healthCheckTypeCode = null;

	private List<String> targetGroupNoList = null;

	private String responseFormatType = null;

	public CreateAutoScalingGroupRequest regionCode(String regionCode) {
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

	public CreateAutoScalingGroupRequest launchConfigurationNo(String launchConfigurationNo) {
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

	public CreateAutoScalingGroupRequest autoScalingGroupName(String autoScalingGroupName) {
		this.autoScalingGroupName = autoScalingGroupName;
		return this;
	}

	 /**
	 * 오토스케일링그룹이름
	 * @return autoScalingGroupName
	**/
	public String getAutoScalingGroupName() {
		return autoScalingGroupName;
	}

	public void setAutoScalingGroupName(String autoScalingGroupName) {
		this.autoScalingGroupName = autoScalingGroupName;
	}

	public CreateAutoScalingGroupRequest vpcNo(String vpcNo) {
		this.vpcNo = vpcNo;
		return this;
	}

	 /**
	 * VPC번호
	 * @return vpcNo
	**/
	public String getVpcNo() {
		return vpcNo;
	}

	public void setVpcNo(String vpcNo) {
		this.vpcNo = vpcNo;
	}

	public CreateAutoScalingGroupRequest subnetNo(String subnetNo) {
		this.subnetNo = subnetNo;
		return this;
	}

	 /**
	 * 서브넷번호
	 * @return subnetNo
	**/
	public String getSubnetNo() {
		return subnetNo;
	}

	public void setSubnetNo(String subnetNo) {
		this.subnetNo = subnetNo;
	}

	public CreateAutoScalingGroupRequest accessControlGroupNoList(List<String> accessControlGroupNoList) {
		this.accessControlGroupNoList = accessControlGroupNoList;
		return this;
	}

	public CreateAutoScalingGroupRequest addAccessControlGroupNoListItem(String accessControlGroupNoListItem) {
		this.accessControlGroupNoList.add(accessControlGroupNoListItem);
		return this;
	}

	 /**
	 * ACG번호리스트
	 * @return accessControlGroupNoList
	**/
	public List<String> getAccessControlGroupNoList() {
		return accessControlGroupNoList;
	}

	public void setAccessControlGroupNoList(List<String> accessControlGroupNoList) {
		this.accessControlGroupNoList = accessControlGroupNoList;
	}

	public CreateAutoScalingGroupRequest serverNamePrefix(String serverNamePrefix) {
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

	public CreateAutoScalingGroupRequest minSize(Integer minSize) {
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

	public CreateAutoScalingGroupRequest maxSize(Integer maxSize) {
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

	public CreateAutoScalingGroupRequest desiredCapacity(Integer desiredCapacity) {
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

	public CreateAutoScalingGroupRequest defaultCoolDown(Integer defaultCoolDown) {
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

	public CreateAutoScalingGroupRequest targetGroupNoList(List<String> targetGroupNoList) {
		this.targetGroupNoList = targetGroupNoList;
		return this;
	}

	public CreateAutoScalingGroupRequest addTargetGroupNoListItem(String targetGroupNoListItem) {
		if (this.targetGroupNoList == null) {
			this.targetGroupNoList = new ArrayList<String>();
		}
		this.targetGroupNoList.add(targetGroupNoListItem);
		return this;
	}

	 /**
	 * 타겟그룹번호리스트
	 * @return targetGroupNoList
	**/
	public List<String> getTargetGroupNoList() {
		return targetGroupNoList;
	}

	public void setTargetGroupNoList(List<String> targetGroupNoList) {
		this.targetGroupNoList = targetGroupNoList;
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
		return Objects.equals(this.regionCode, createAutoScalingGroupRequest.regionCode) &&
				Objects.equals(this.launchConfigurationNo, createAutoScalingGroupRequest.launchConfigurationNo) &&
				Objects.equals(this.autoScalingGroupName, createAutoScalingGroupRequest.autoScalingGroupName) &&
				Objects.equals(this.vpcNo, createAutoScalingGroupRequest.vpcNo) &&
				Objects.equals(this.subnetNo, createAutoScalingGroupRequest.subnetNo) &&
				Objects.equals(this.accessControlGroupNoList, createAutoScalingGroupRequest.accessControlGroupNoList) &&
				Objects.equals(this.serverNamePrefix, createAutoScalingGroupRequest.serverNamePrefix) &&
				Objects.equals(this.minSize, createAutoScalingGroupRequest.minSize) &&
				Objects.equals(this.maxSize, createAutoScalingGroupRequest.maxSize) &&
				Objects.equals(this.desiredCapacity, createAutoScalingGroupRequest.desiredCapacity) &&
				Objects.equals(this.defaultCoolDown, createAutoScalingGroupRequest.defaultCoolDown) &&
				Objects.equals(this.healthCheckGracePeriod, createAutoScalingGroupRequest.healthCheckGracePeriod) &&
				Objects.equals(this.healthCheckTypeCode, createAutoScalingGroupRequest.healthCheckTypeCode) &&
				Objects.equals(this.targetGroupNoList, createAutoScalingGroupRequest.targetGroupNoList) &&
				Objects.equals(this.responseFormatType, createAutoScalingGroupRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, launchConfigurationNo, autoScalingGroupName, vpcNo, subnetNo, accessControlGroupNoList, serverNamePrefix, minSize, maxSize, desiredCapacity, defaultCoolDown, healthCheckGracePeriod, healthCheckTypeCode, targetGroupNoList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateAutoScalingGroupRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		launchConfigurationNo: ").append(toIndentedString(launchConfigurationNo)).append("\n");
		sb.append("		autoScalingGroupName: ").append(toIndentedString(autoScalingGroupName)).append("\n");
		sb.append("		vpcNo: ").append(toIndentedString(vpcNo)).append("\n");
		sb.append("		subnetNo: ").append(toIndentedString(subnetNo)).append("\n");
		sb.append("		accessControlGroupNoList: ").append(toIndentedString(accessControlGroupNoList)).append("\n");
		sb.append("		serverNamePrefix: ").append(toIndentedString(serverNamePrefix)).append("\n");
		sb.append("		minSize: ").append(toIndentedString(minSize)).append("\n");
		sb.append("		maxSize: ").append(toIndentedString(maxSize)).append("\n");
		sb.append("		desiredCapacity: ").append(toIndentedString(desiredCapacity)).append("\n");
		sb.append("		defaultCoolDown: ").append(toIndentedString(defaultCoolDown)).append("\n");
		sb.append("		healthCheckGracePeriod: ").append(toIndentedString(healthCheckGracePeriod)).append("\n");
		sb.append("		healthCheckTypeCode: ").append(toIndentedString(healthCheckTypeCode)).append("\n");
		sb.append("		targetGroupNoList: ").append(toIndentedString(targetGroupNoList)).append("\n");
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

