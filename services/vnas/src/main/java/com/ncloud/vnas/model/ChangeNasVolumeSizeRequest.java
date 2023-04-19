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
 * ChangeNasVolumeSizeRequest
 */
public class ChangeNasVolumeSizeRequest {
	private String regionCode = null;

	private String nasVolumeInstanceNo = null;

	private Integer volumeSize = null;

	private Boolean isAsync = null;

	private String responseFormatType = null;

	public ChangeNasVolumeSizeRequest regionCode(String regionCode) {
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

	public ChangeNasVolumeSizeRequest nasVolumeInstanceNo(String nasVolumeInstanceNo) {
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

	public ChangeNasVolumeSizeRequest volumeSize(Integer volumeSize) {
		this.volumeSize = volumeSize;
		return this;
	}

	 /**
	 * 볼륨사이즈
	 * @return volumeSize
	**/
	public Integer getVolumeSize() {
		return volumeSize;
	}

	public void setVolumeSize(Integer volumeSize) {
		this.volumeSize = volumeSize;
	}

	public ChangeNasVolumeSizeRequest isAsync(Boolean isAsync) {
		this.isAsync = isAsync;
		return this;
	}

	 /**
	 * Async여부
	 * @return isAsync
	**/
	public Boolean isIsAsync() {
		return isAsync;
	}

	public void setIsAsync(Boolean isAsync) {
		this.isAsync = isAsync;
	}

	public ChangeNasVolumeSizeRequest responseFormatType(String responseFormatType) {
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
		ChangeNasVolumeSizeRequest changeNasVolumeSizeRequest = (ChangeNasVolumeSizeRequest) o;
		return Objects.equals(this.regionCode, changeNasVolumeSizeRequest.regionCode) &&
				Objects.equals(this.nasVolumeInstanceNo, changeNasVolumeSizeRequest.nasVolumeInstanceNo) &&
				Objects.equals(this.volumeSize, changeNasVolumeSizeRequest.volumeSize) &&
				Objects.equals(this.isAsync, changeNasVolumeSizeRequest.isAsync) &&
				Objects.equals(this.responseFormatType, changeNasVolumeSizeRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, nasVolumeInstanceNo, volumeSize, isAsync, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ChangeNasVolumeSizeRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		nasVolumeInstanceNo: ").append(toIndentedString(nasVolumeInstanceNo)).append("\n");
		sb.append("		volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
		sb.append("		isAsync: ").append(toIndentedString(isAsync)).append("\n");
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

