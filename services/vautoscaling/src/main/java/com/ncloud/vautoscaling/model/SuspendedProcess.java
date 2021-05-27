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
import com.ncloud.vautoscaling.model.CommonCode;

/**
 * SuspendedProcess
 */
public class SuspendedProcess {
	private CommonCode process = null;

	private String suspensionReason = null;

	public SuspendedProcess process(CommonCode process) {
		this.process = process;
		return this;
	}

	 /**
	 * 프로세스
	 * @return process
	**/
	public CommonCode getProcess() {
		return process;
	}

	public void setProcess(CommonCode process) {
		this.process = process;
	}

	public SuspendedProcess suspensionReason(String suspensionReason) {
		this.suspensionReason = suspensionReason;
		return this;
	}

	 /**
	 * 프로세스일시정지원인
	 * @return suspensionReason
	**/
	public String getSuspensionReason() {
		return suspensionReason;
	}

	public void setSuspensionReason(String suspensionReason) {
		this.suspensionReason = suspensionReason;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SuspendedProcess suspendedProcess = (SuspendedProcess) o;
		return Objects.equals(this.process, suspendedProcess.process) &&
				Objects.equals(this.suspensionReason, suspendedProcess.suspensionReason);
	}

	@Override
	public int hashCode() {
		return Objects.hash(process, suspensionReason);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SuspendedProcess {\n");
		
		sb.append("		process: ").append(toIndentedString(process)).append("\n");
		sb.append("		suspensionReason: ").append(toIndentedString(suspensionReason)).append("\n");
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

