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
import com.ncloud.autoscaling.model.CommonCode;
import com.ncloud.autoscaling.model.InAutoScalingGroupServerInstance;
import com.ncloud.autoscaling.model.LoadBalancerInstanceSummary;
import com.ncloud.autoscaling.model.SuspendedProcess;
import com.ncloud.autoscaling.model.Zone;
import java.util.ArrayList;
import java.util.List;

/**
 * AutoScalingGroup
 */
public class AutoScalingGroup {
	private String autoScalingGroupName = null;

	private String autoScalingGroupNo = null;

	private String launchConfigurationName = null;

	private String launchConfigurationNo = null;

	private Integer desiredCapacity = null;

	private Integer minSize = null;

	private Integer maxSize = null;

	private Integer defaultCooldown = null;

	private List<LoadBalancerInstanceSummary> loadBalancerInstanceSummaryList = null;

	private Integer healthCheckGracePeriod = null;

	private CommonCode healthCheckType = null;

	private String createDate = null;

	private List<InAutoScalingGroupServerInstance> inAutoScalingGroupServerInstanceList = null;

	private List<SuspendedProcess> suspendedProcessList = null;

	private List<Zone> zoneList = null;

	public AutoScalingGroup autoScalingGroupName(String autoScalingGroupName) {
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

	public AutoScalingGroup launchConfigurationName(String launchConfigurationName) {
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

	public AutoScalingGroup desiredCapacity(Integer desiredCapacity) {
		this.desiredCapacity = desiredCapacity;
		return this;
	}

	 /**
	 * 기대능력치
	 * @return desiredCapacity
	**/
	public Integer getDesiredCapacity() {
		return desiredCapacity;
	}

	public void setDesiredCapacity(Integer desiredCapacity) {
		this.desiredCapacity = desiredCapacity;
	}

	public AutoScalingGroup minSize(Integer minSize) {
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

	public AutoScalingGroup maxSize(Integer maxSize) {
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

	public AutoScalingGroup defaultCooldown(Integer defaultCooldown) {
		this.defaultCooldown = defaultCooldown;
		return this;
	}

	 /**
	 * Get defaultCooldown
	 * @return defaultCooldown
	**/
	public Integer getDefaultCooldown() {
		return defaultCooldown;
	}

	public void setDefaultCooldown(Integer defaultCooldown) {
		this.defaultCooldown = defaultCooldown;
	}

	public AutoScalingGroup loadBalancerInstanceSummaryList(List<LoadBalancerInstanceSummary> loadBalancerInstanceSummaryList) {
		this.loadBalancerInstanceSummaryList = loadBalancerInstanceSummaryList;
		return this;
	}

	public AutoScalingGroup addLoadBalancerInstanceSummaryListItem(LoadBalancerInstanceSummary loadBalancerInstanceSummaryListItem) {
		if (this.loadBalancerInstanceSummaryList == null) {
			this.loadBalancerInstanceSummaryList = new ArrayList<LoadBalancerInstanceSummary>();
		}
		this.loadBalancerInstanceSummaryList.add(loadBalancerInstanceSummaryListItem);
		return this;
	}

	 /**
	 * 로드밸런서인스턴스Summary리스트
	 * @return loadBalancerInstanceSummaryList
	**/
	public List<LoadBalancerInstanceSummary> getLoadBalancerInstanceSummaryList() {
		return loadBalancerInstanceSummaryList;
	}

	public void setLoadBalancerInstanceSummaryList(List<LoadBalancerInstanceSummary> loadBalancerInstanceSummaryList) {
		this.loadBalancerInstanceSummaryList = loadBalancerInstanceSummaryList;
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
	 * 보류된프로세스리스트
	 * @return suspendedProcessList
	**/
	public List<SuspendedProcess> getSuspendedProcessList() {
		return suspendedProcessList;
	}

	public void setSuspendedProcessList(List<SuspendedProcess> suspendedProcessList) {
		this.suspendedProcessList = suspendedProcessList;
	}

	public AutoScalingGroup zoneList(List<Zone> zoneList) {
		this.zoneList = zoneList;
		return this;
	}

	public AutoScalingGroup addZoneListItem(Zone zoneListItem) {
		if (this.zoneList == null) {
			this.zoneList = new ArrayList<Zone>();
		}
		this.zoneList.add(zoneListItem);
		return this;
	}

	 /**
	 * ZONE리스트
	 * @return zoneList
	**/
	public List<Zone> getZoneList() {
		return zoneList;
	}

	public void setZoneList(List<Zone> zoneList) {
		this.zoneList = zoneList;
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
		return Objects.equals(this.autoScalingGroupName, autoScalingGroup.autoScalingGroupName) &&
				Objects.equals(this.autoScalingGroupNo, autoScalingGroup.autoScalingGroupNo) &&
				Objects.equals(this.launchConfigurationName, autoScalingGroup.launchConfigurationName) &&
				Objects.equals(this.launchConfigurationNo, autoScalingGroup.launchConfigurationNo) &&
				Objects.equals(this.desiredCapacity, autoScalingGroup.desiredCapacity) &&
				Objects.equals(this.minSize, autoScalingGroup.minSize) &&
				Objects.equals(this.maxSize, autoScalingGroup.maxSize) &&
				Objects.equals(this.defaultCooldown, autoScalingGroup.defaultCooldown) &&
				Objects.equals(this.loadBalancerInstanceSummaryList, autoScalingGroup.loadBalancerInstanceSummaryList) &&
				Objects.equals(this.healthCheckGracePeriod, autoScalingGroup.healthCheckGracePeriod) &&
				Objects.equals(this.healthCheckType, autoScalingGroup.healthCheckType) &&
				Objects.equals(this.createDate, autoScalingGroup.createDate) &&
				Objects.equals(this.inAutoScalingGroupServerInstanceList, autoScalingGroup.inAutoScalingGroupServerInstanceList) &&
				Objects.equals(this.suspendedProcessList, autoScalingGroup.suspendedProcessList) &&
				Objects.equals(this.zoneList, autoScalingGroup.zoneList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(autoScalingGroupName, autoScalingGroupNo, launchConfigurationName, launchConfigurationNo, desiredCapacity, minSize, maxSize, defaultCooldown, loadBalancerInstanceSummaryList, healthCheckGracePeriod, healthCheckType, createDate, inAutoScalingGroupServerInstanceList, suspendedProcessList, zoneList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AutoScalingGroup {\n");
		
		sb.append("		autoScalingGroupName: ").append(toIndentedString(autoScalingGroupName)).append("\n");
		sb.append("		autoScalingGroupNo: ").append(toIndentedString(autoScalingGroupNo)).append("\n");
		sb.append("		launchConfigurationName: ").append(toIndentedString(launchConfigurationName)).append("\n");
		sb.append("		launchConfigurationNo: ").append(toIndentedString(launchConfigurationNo)).append("\n");
		sb.append("		desiredCapacity: ").append(toIndentedString(desiredCapacity)).append("\n");
		sb.append("		minSize: ").append(toIndentedString(minSize)).append("\n");
		sb.append("		maxSize: ").append(toIndentedString(maxSize)).append("\n");
		sb.append("		defaultCooldown: ").append(toIndentedString(defaultCooldown)).append("\n");
		sb.append("		loadBalancerInstanceSummaryList: ").append(toIndentedString(loadBalancerInstanceSummaryList)).append("\n");
		sb.append("		healthCheckGracePeriod: ").append(toIndentedString(healthCheckGracePeriod)).append("\n");
		sb.append("		healthCheckType: ").append(toIndentedString(healthCheckType)).append("\n");
		sb.append("		createDate: ").append(toIndentedString(createDate)).append("\n");
		sb.append("		inAutoScalingGroupServerInstanceList: ").append(toIndentedString(inAutoScalingGroupServerInstanceList)).append("\n");
		sb.append("		suspendedProcessList: ").append(toIndentedString(suspendedProcessList)).append("\n");
		sb.append("		zoneList: ").append(toIndentedString(zoneList)).append("\n");
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

