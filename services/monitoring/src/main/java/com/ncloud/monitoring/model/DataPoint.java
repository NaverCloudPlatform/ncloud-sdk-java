/*
 * monitoring
 * <br/>https://ncloud.apigw.ntruss.com/monitoring/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.monitoring.model;

import java.util.Objects;

/**
 * DataPoint
 */
public class DataPoint {
	private String timestamp = null;

	private Double average = null;

	private String unit = null;

	public DataPoint timestamp(String timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	 /**
	 * Get timestamp
	 * @return timestamp
	**/
	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public DataPoint average(Double average) {
		this.average = average;
		return this;
	}

	 /**
	 * Get average
	 * @return average
	**/
	public Double getAverage() {
		return average;
	}

	public void setAverage(Double average) {
		this.average = average;
	}

	public DataPoint unit(String unit) {
		this.unit = unit;
		return this;
	}

	 /**
	 * Get unit
	 * @return unit
	**/
	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DataPoint dataPoint = (DataPoint) o;
		return Objects.equals(this.timestamp, dataPoint.timestamp) &&
				Objects.equals(this.average, dataPoint.average) &&
				Objects.equals(this.unit, dataPoint.unit);
	}

	@Override
	public int hashCode() {
		return Objects.hash(timestamp, average, unit);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DataPoint {\n");
		
		sb.append("		timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("		average: ").append(toIndentedString(average)).append("\n");
		sb.append("		unit: ").append(toIndentedString(unit)).append("\n");
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

