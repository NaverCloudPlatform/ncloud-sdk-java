/*
 * vloadbalancer
 * VPC Load Balancer 관련 API<br/>https://ncloud.apigw.ntruss.com/vloadbalancer/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vloadbalancer.model;

import java.util.Objects;

/**
 * TargetGroupWeight
 */
public class TargetGroupWeight {
	private String targetGroupNo = null;

	private Integer weight = null;

	public TargetGroupWeight targetGroupNo(String targetGroupNo) {
		this.targetGroupNo = targetGroupNo;
		return this;
	}

	 /**
	 * 타겟그룹번호
	 * @return targetGroupNo
	**/
	public String getTargetGroupNo() {
		return targetGroupNo;
	}

	public void setTargetGroupNo(String targetGroupNo) {
		this.targetGroupNo = targetGroupNo;
	}

	public TargetGroupWeight weight(Integer weight) {
		this.weight = weight;
		return this;
	}

	 /**
	 * 가중치
	 * @return weight
	**/
	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TargetGroupWeight targetGroupWeight = (TargetGroupWeight) o;
		return Objects.equals(this.targetGroupNo, targetGroupWeight.targetGroupNo) &&
				Objects.equals(this.weight, targetGroupWeight.weight);
	}

	@Override
	public int hashCode() {
		return Objects.hash(targetGroupNo, weight);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TargetGroupWeight {\n");
		
		sb.append("		targetGroupNo: ").append(toIndentedString(targetGroupNo)).append("\n");
		sb.append("		weight: ").append(toIndentedString(weight)).append("\n");
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

