/*
 * vnks
 * <br/>https://nks.apigw.ntruss.com/vnks/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vnks.model;

import java.util.Objects;

/**
 * AutoscalerUpdate
 */
public class AutoscalerUpdate {
	private Boolean enabled = null;

	private Integer max = null;

	private Integer min = null;

	public AutoscalerUpdate enabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	 /**
	 * 오토스케일 가능여부
	 * @return enabled
	**/
	public Boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public AutoscalerUpdate max(Integer max) {
		this.max = max;
		return this;
	}

	 /**
	 * 오토스케일 가능 최대 노드 수
	 * @return max
	**/
	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	public AutoscalerUpdate min(Integer min) {
		this.min = min;
		return this;
	}

	 /**
	 * 오토스케일 가능 최소 노드 수
	 * @return min
	**/
	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AutoscalerUpdate autoscalerUpdate = (AutoscalerUpdate) o;
		return Objects.equals(this.enabled, autoscalerUpdate.enabled) &&
				Objects.equals(this.max, autoscalerUpdate.max) &&
				Objects.equals(this.min, autoscalerUpdate.min);
	}

	@Override
	public int hashCode() {
		return Objects.hash(enabled, max, min);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AutoscalerUpdate {\n");
		
		sb.append("		enabled: ").append(toIndentedString(enabled)).append("\n");
		sb.append("		max: ").append(toIndentedString(max)).append("\n");
		sb.append("		min: ").append(toIndentedString(min)).append("\n");
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
