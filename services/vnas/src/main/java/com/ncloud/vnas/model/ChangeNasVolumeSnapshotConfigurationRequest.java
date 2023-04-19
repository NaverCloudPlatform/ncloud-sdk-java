/*
 * vnas
 * VPC NAS 관련 API<br/>https://ncloud.apigw.ntruss.com/vnas/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vnas.model;

import java.util.Objects;

/**
 * ChangeNasVolumeSnapshotConfigurationRequest
 */
public class ChangeNasVolumeSnapshotConfigurationRequest {
	private String regionCode = null;

	private String nasVolumeInstanceNo = null;

	private Integer snapshotVolumeConfigurationRatio = null;

	private String snapshotVolumeConfigDayOfWeekTypeCode = null;

	private Integer snapshotVolumeConfigTime = null;

	private String responseFormatType = null;

	public ChangeNasVolumeSnapshotConfigurationRequest regionCode(String regionCode) {
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

	public ChangeNasVolumeSnapshotConfigurationRequest nasVolumeInstanceNo(String nasVolumeInstanceNo) {
		this.nasVolumeInstanceNo = nasVolumeInstanceNo;
		return this;
	}

	 /**
	 * NAS볼륨인스턴스번호
	 * @return nasVolumeInstanceNo
	**/
	public String getNasVolumeInstanceNo() {
		return nasVolumeInstanceNo;
	}

	public void setNasVolumeInstanceNo(String nasVolumeInstanceNo) {
		this.nasVolumeInstanceNo = nasVolumeInstanceNo;
	}

	public ChangeNasVolumeSnapshotConfigurationRequest snapshotVolumeConfigurationRatio(Integer snapshotVolumeConfigurationRatio) {
		this.snapshotVolumeConfigurationRatio = snapshotVolumeConfigurationRatio;
		return this;
	}

	 /**
	 * 스냅샷볼륨설정비율
	 * @return snapshotVolumeConfigurationRatio
	**/
	public Integer getSnapshotVolumeConfigurationRatio() {
		return snapshotVolumeConfigurationRatio;
	}

	public void setSnapshotVolumeConfigurationRatio(Integer snapshotVolumeConfigurationRatio) {
		this.snapshotVolumeConfigurationRatio = snapshotVolumeConfigurationRatio;
	}

	public ChangeNasVolumeSnapshotConfigurationRequest snapshotVolumeConfigDayOfWeekTypeCode(String snapshotVolumeConfigDayOfWeekTypeCode) {
		this.snapshotVolumeConfigDayOfWeekTypeCode = snapshotVolumeConfigDayOfWeekTypeCode;
		return this;
	}

	 /**
	 * 스냅샷자동생성주기요일
	 * @return snapshotVolumeConfigDayOfWeekTypeCode
	**/
	public String getSnapshotVolumeConfigDayOfWeekTypeCode() {
		return snapshotVolumeConfigDayOfWeekTypeCode;
	}

	public void setSnapshotVolumeConfigDayOfWeekTypeCode(String snapshotVolumeConfigDayOfWeekTypeCode) {
		this.snapshotVolumeConfigDayOfWeekTypeCode = snapshotVolumeConfigDayOfWeekTypeCode;
	}

	public ChangeNasVolumeSnapshotConfigurationRequest snapshotVolumeConfigTime(Integer snapshotVolumeConfigTime) {
		this.snapshotVolumeConfigTime = snapshotVolumeConfigTime;
		return this;
	}

	 /**
	 * 스냅샷자동생성주기시각
	 * @return snapshotVolumeConfigTime
	**/
	public Integer getSnapshotVolumeConfigTime() {
		return snapshotVolumeConfigTime;
	}

	public void setSnapshotVolumeConfigTime(Integer snapshotVolumeConfigTime) {
		this.snapshotVolumeConfigTime = snapshotVolumeConfigTime;
	}

	public ChangeNasVolumeSnapshotConfigurationRequest responseFormatType(String responseFormatType) {
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
		ChangeNasVolumeSnapshotConfigurationRequest changeNasVolumeSnapshotConfigurationRequest = (ChangeNasVolumeSnapshotConfigurationRequest) o;
		return Objects.equals(this.regionCode, changeNasVolumeSnapshotConfigurationRequest.regionCode) &&
				Objects.equals(this.nasVolumeInstanceNo, changeNasVolumeSnapshotConfigurationRequest.nasVolumeInstanceNo) &&
				Objects.equals(this.snapshotVolumeConfigurationRatio, changeNasVolumeSnapshotConfigurationRequest.snapshotVolumeConfigurationRatio) &&
				Objects.equals(this.snapshotVolumeConfigDayOfWeekTypeCode, changeNasVolumeSnapshotConfigurationRequest.snapshotVolumeConfigDayOfWeekTypeCode) &&
				Objects.equals(this.snapshotVolumeConfigTime, changeNasVolumeSnapshotConfigurationRequest.snapshotVolumeConfigTime) &&
				Objects.equals(this.responseFormatType, changeNasVolumeSnapshotConfigurationRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, nasVolumeInstanceNo, snapshotVolumeConfigurationRatio, snapshotVolumeConfigDayOfWeekTypeCode, snapshotVolumeConfigTime, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ChangeNasVolumeSnapshotConfigurationRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		nasVolumeInstanceNo: ").append(toIndentedString(nasVolumeInstanceNo)).append("\n");
		sb.append("		snapshotVolumeConfigurationRatio: ").append(toIndentedString(snapshotVolumeConfigurationRatio)).append("\n");
		sb.append("		snapshotVolumeConfigDayOfWeekTypeCode: ").append(toIndentedString(snapshotVolumeConfigDayOfWeekTypeCode)).append("\n");
		sb.append("		snapshotVolumeConfigTime: ").append(toIndentedString(snapshotVolumeConfigTime)).append("\n");
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

