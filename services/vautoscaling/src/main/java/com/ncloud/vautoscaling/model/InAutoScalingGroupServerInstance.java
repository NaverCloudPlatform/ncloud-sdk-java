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

/**
 * InAutoScalingGroupServerInstance
 */
public class InAutoScalingGroupServerInstance {
	private String serverInstanceNo = null;

	private CommonCode healthStatus = null;

	private CommonCode lifecycleState = null;

	public InAutoScalingGroupServerInstance serverInstanceNo(String serverInstanceNo) {
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

	public InAutoScalingGroupServerInstance healthStatus(CommonCode healthStatus) {
		this.healthStatus = healthStatus;
		return this;
	}

	 /**
	 * 헬스상태
	 * @return healthStatus
	**/
	public CommonCode getHealthStatus() {
		return healthStatus;
	}

	public void setHealthStatus(CommonCode healthStatus) {
		this.healthStatus = healthStatus;
	}

	public InAutoScalingGroupServerInstance lifecycleState(CommonCode lifecycleState) {
		this.lifecycleState = lifecycleState;
		return this;
	}

	 /**
	 * 라이프사이클상태
	 * @return lifecycleState
	**/
	public CommonCode getLifecycleState() {
		return lifecycleState;
	}

	public void setLifecycleState(CommonCode lifecycleState) {
		this.lifecycleState = lifecycleState;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InAutoScalingGroupServerInstance inAutoScalingGroupServerInstance = (InAutoScalingGroupServerInstance) o;
		return Objects.equals(this.serverInstanceNo, inAutoScalingGroupServerInstance.serverInstanceNo) &&
				Objects.equals(this.healthStatus, inAutoScalingGroupServerInstance.healthStatus) &&
				Objects.equals(this.lifecycleState, inAutoScalingGroupServerInstance.lifecycleState);
	}

	@Override
	public int hashCode() {
		return Objects.hash(serverInstanceNo, healthStatus, lifecycleState);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InAutoScalingGroupServerInstance {\n");
		
		sb.append("		serverInstanceNo: ").append(toIndentedString(serverInstanceNo)).append("\n");
		sb.append("		healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
		sb.append("		lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
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

