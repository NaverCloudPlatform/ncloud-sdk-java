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
import com.ncloud.vautoscaling.model.CommonCode;
import com.ncloud.vautoscaling.model.InAutoScalingGroupServerInstance;
import com.ncloud.vautoscaling.model.SuspendedProcess;
import java.util.ArrayList;
import java.util.List;

/**
 * AutoScalingGroup
 */
public class AutoScalingGroup {
	private String vpcNo = null;

	private String subnetNo = null;

	private String serverNamePrefix = null;

	private String autoScalingGroupNo = null;

	private String autoScalingGroupName = null;

	private String launchConfigurationNo = null;

	private Integer minSize = null;

	private Integer maxSize = null;

	private Integer desiredCapacity = null;

	private Integer defaultCoolDown = null;

	private Integer healthCheckGracePeriod = null;

	private CommonCode healthCheckType = null;

	private String createDate = null;

	private CommonCode autoScalingGroupStatus = null;

	private List<String> targetGroupNoList = null;

	private List<InAutoScalingGroupServerInstance> inAutoScalingGroupServerInstanceList = null;

	private List<String> accessControlGroupNoList = null;

	private List<SuspendedProcess> suspendedProcessList = null;

	public AutoScalingGroup vpcNo(String vpcNo) {
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

	public AutoScalingGroup subnetNo(String subnetNo) {
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

	public AutoScalingGroup serverNamePrefix(String serverNamePrefix) {
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

	public AutoScalingGroup autoScalingGroupNo(String autoScalingGroupNo) {
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

	public AutoScalingGroup autoScalingGroupName(String autoScalingGroupName) {
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

	public AutoScalingGroup launchConfigurationNo(String launchConfigurationNo) {
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

	public AutoScalingGroup minSize(Integer minSize) {
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

	public AutoScalingGroup maxSize(Integer maxSize) {
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

	public AutoScalingGroup desiredCapacity(Integer desiredCapacity) {
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

	public AutoScalingGroup defaultCoolDown(Integer defaultCoolDown) {
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

	public AutoScalingGroup healthCheckGracePeriod(Integer healthCheckGracePeriod) {
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

	public AutoScalingGroup healthCheckType(CommonCode healthCheckType) {
		this.healthCheckType = healthCheckType;
		return this;
	}

	 /**
	 * 헬스체크유형
	 * @return healthCheckType
	**/
	public CommonCode getHealthCheckType() {
		return healthCheckType;
	}

	public void setHealthCheckType(CommonCode healthCheckType) {
		this.healthCheckType = healthCheckType;
	}

	public AutoScalingGroup createDate(String createDate) {
		this.createDate = createDate;
		return this;
	}

	 /**
	 * 생성일시
	 * @return createDate
	**/
	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public AutoScalingGroup autoScalingGroupStatus(CommonCode autoScalingGroupStatus) {
		this.autoScalingGroupStatus = autoScalingGroupStatus;
		return this;
	}

	 /**
	 * 오토스케일링그룹상태
	 * @return autoScalingGroupStatus
	**/
	public CommonCode getAutoScalingGroupStatus() {
		return autoScalingGroupStatus;
	}

	public void setAutoScalingGroupStatus(CommonCode autoScalingGroupStatus) {
		this.autoScalingGroupStatus = autoScalingGroupStatus;
	}

	public AutoScalingGroup targetGroupNoList(List<String> targetGroupNoList) {
		this.targetGroupNoList = targetGroupNoList;
		return this;
	}

	public AutoScalingGroup addTargetGroupNoListItem(String targetGroupNoListItem) {
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

	public AutoScalingGroup inAutoScalingGroupServerInstanceList(List<InAutoScalingGroupServerInstance> inAutoScalingGroupServerInstanceList) {
		this.inAutoScalingGroupServerInstanceList = inAutoScalingGroupServerInstanceList;
		return this;
	}

	public AutoScalingGroup addInAutoScalingGroupServerInstanceListItem(InAutoScalingGroupServerInstance inAutoScalingGroupServerInstanceListItem) {
		if (this.inAutoScalingGroupServerInstanceList == null) {
			this.inAutoScalingGroupServerInstanceList = new ArrayList<InAutoScalingGroupServerInstance>();
		}
		this.inAutoScalingGroupServerInstanceList.add(inAutoScalingGroupServerInstanceListItem);
		return this;
	}

	 /**
	 * 오토스케일링그룹에속한서버인스턴스리스트
	 * @return inAutoScalingGroupServerInstanceList
	**/
	public List<InAutoScalingGroupServerInstance> getInAutoScalingGroupServerInstanceList() {
		return inAutoScalingGroupServerInstanceList;
	}

	public void setInAutoScalingGroupServerInstanceList(List<InAutoScalingGroupServerInstance> inAutoScalingGroupServerInstanceList) {
		this.inAutoScalingGroupServerInstanceList = inAutoScalingGroupServerInstanceList;
	}

	public AutoScalingGroup accessControlGroupNoList(List<String> accessControlGroupNoList) {
		this.accessControlGroupNoList = accessControlGroupNoList;
		return this;
	}

	public AutoScalingGroup addAccessControlGroupNoListItem(String accessControlGroupNoListItem) {
		if (this.accessControlGroupNoList == null) {
			this.accessControlGroupNoList = new ArrayList<String>();
		}
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

	public AutoScalingGroup suspendedProcessList(List<SuspendedProcess> suspendedProcessList) {
		this.suspendedProcessList = suspendedProcessList;
		return this;
	}

	public AutoScalingGroup addSuspendedProcessListItem(SuspendedProcess suspendedProcessListItem) {
		if (this.suspendedProcessList == null) {
			this.suspendedProcessList = new ArrayList<SuspendedProcess>();
		}
		this.suspendedProcessList.add(suspendedProcessListItem);
		return this;
	}

	 /**
	 * 일시정지된프로세스리스트
	 * @return suspendedProcessList
	**/
	public List<SuspendedProcess> getSuspendedProcessList() {
		return suspendedProcessList;
	}

	public void setSuspendedProcessList(List<SuspendedProcess> suspendedProcessList) {
		this.suspendedProcessList = suspendedProcessList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AutoScalingGroup autoScalingGroup = (AutoScalingGroup) o;
		return Objects.equals(this.vpcNo, autoScalingGroup.vpcNo) &&
				Objects.equals(this.subnetNo, autoScalingGroup.subnetNo) &&
				Objects.equals(this.serverNamePrefix, autoScalingGroup.serverNamePrefix) &&
				Objects.equals(this.autoScalingGroupNo, autoScalingGroup.autoScalingGroupNo) &&
				Objects.equals(this.autoScalingGroupName, autoScalingGroup.autoScalingGroupName) &&
				Objects.equals(this.launchConfigurationNo, autoScalingGroup.launchConfigurationNo) &&
				Objects.equals(this.minSize, autoScalingGroup.minSize) &&
				Objects.equals(this.maxSize, autoScalingGroup.maxSize) &&
				Objects.equals(this.desiredCapacity, autoScalingGroup.desiredCapacity) &&
				Objects.equals(this.defaultCoolDown, autoScalingGroup.defaultCoolDown) &&
				Objects.equals(this.healthCheckGracePeriod, autoScalingGroup.healthCheckGracePeriod) &&
				Objects.equals(this.healthCheckType, autoScalingGroup.healthCheckType) &&
				Objects.equals(this.createDate, autoScalingGroup.createDate) &&
				Objects.equals(this.autoScalingGroupStatus, autoScalingGroup.autoScalingGroupStatus) &&
				Objects.equals(this.targetGroupNoList, autoScalingGroup.targetGroupNoList) &&
				Objects.equals(this.inAutoScalingGroupServerInstanceList, autoScalingGroup.inAutoScalingGroupServerInstanceList) &&
				Objects.equals(this.accessControlGroupNoList, autoScalingGroup.accessControlGroupNoList) &&
				Objects.equals(this.suspendedProcessList, autoScalingGroup.suspendedProcessList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(vpcNo, subnetNo, serverNamePrefix, autoScalingGroupNo, autoScalingGroupName, launchConfigurationNo, minSize, maxSize, desiredCapacity, defaultCoolDown, healthCheckGracePeriod, healthCheckType, createDate, autoScalingGroupStatus, targetGroupNoList, inAutoScalingGroupServerInstanceList, accessControlGroupNoList, suspendedProcessList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AutoScalingGroup {\n");
		
		sb.append("		vpcNo: ").append(toIndentedString(vpcNo)).append("\n");
		sb.append("		subnetNo: ").append(toIndentedString(subnetNo)).append("\n");
		sb.append("		serverNamePrefix: ").append(toIndentedString(serverNamePrefix)).append("\n");
		sb.append("		autoScalingGroupNo: ").append(toIndentedString(autoScalingGroupNo)).append("\n");
		sb.append("		autoScalingGroupName: ").append(toIndentedString(autoScalingGroupName)).append("\n");
		sb.append("		launchConfigurationNo: ").append(toIndentedString(launchConfigurationNo)).append("\n");
		sb.append("		minSize: ").append(toIndentedString(minSize)).append("\n");
		sb.append("		maxSize: ").append(toIndentedString(maxSize)).append("\n");
		sb.append("		desiredCapacity: ").append(toIndentedString(desiredCapacity)).append("\n");
		sb.append("		defaultCoolDown: ").append(toIndentedString(defaultCoolDown)).append("\n");
		sb.append("		healthCheckGracePeriod: ").append(toIndentedString(healthCheckGracePeriod)).append("\n");
		sb.append("		healthCheckType: ").append(toIndentedString(healthCheckType)).append("\n");
		sb.append("		createDate: ").append(toIndentedString(createDate)).append("\n");
		sb.append("		autoScalingGroupStatus: ").append(toIndentedString(autoScalingGroupStatus)).append("\n");
		sb.append("		targetGroupNoList: ").append(toIndentedString(targetGroupNoList)).append("\n");
		sb.append("		inAutoScalingGroupServerInstanceList: ").append(toIndentedString(inAutoScalingGroupServerInstanceList)).append("\n");
		sb.append("		accessControlGroupNoList: ").append(toIndentedString(accessControlGroupNoList)).append("\n");
		sb.append("		suspendedProcessList: ").append(toIndentedString(suspendedProcessList)).append("\n");
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

