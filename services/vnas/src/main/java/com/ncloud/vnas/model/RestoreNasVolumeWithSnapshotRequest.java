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
 * RestoreNasVolumeWithSnapshotRequest
 */
public class RestoreNasVolumeWithSnapshotRequest {
	private String regionCode = null;

	private String nasVolumeInstanceNo = null;

	private String nasVolumeSnapshotName = null;

	private String responseFormatType = null;

	public RestoreNasVolumeWithSnapshotRequest regionCode(String regionCode) {
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

	public RestoreNasVolumeWithSnapshotRequest nasVolumeInstanceNo(String nasVolumeInstanceNo) {
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

	public RestoreNasVolumeWithSnapshotRequest nasVolumeSnapshotName(String nasVolumeSnapshotName) {
		this.nasVolumeSnapshotName = nasVolumeSnapshotName;
		return this;
	}

	 /**
	 * NAS볼륨스냅샷이름
	 * @return nasVolumeSnapshotName
	**/
	public String getNasVolumeSnapshotName() {
		return nasVolumeSnapshotName;
	}

	public void setNasVolumeSnapshotName(String nasVolumeSnapshotName) {
		this.nasVolumeSnapshotName = nasVolumeSnapshotName;
	}

	public RestoreNasVolumeWithSnapshotRequest responseFormatType(String responseFormatType) {
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
		RestoreNasVolumeWithSnapshotRequest restoreNasVolumeWithSnapshotRequest = (RestoreNasVolumeWithSnapshotRequest) o;
		return Objects.equals(this.regionCode, restoreNasVolumeWithSnapshotRequest.regionCode) &&
				Objects.equals(this.nasVolumeInstanceNo, restoreNasVolumeWithSnapshotRequest.nasVolumeInstanceNo) &&
				Objects.equals(this.nasVolumeSnapshotName, restoreNasVolumeWithSnapshotRequest.nasVolumeSnapshotName) &&
				Objects.equals(this.responseFormatType, restoreNasVolumeWithSnapshotRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, nasVolumeInstanceNo, nasVolumeSnapshotName, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RestoreNasVolumeWithSnapshotRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		nasVolumeInstanceNo: ").append(toIndentedString(nasVolumeInstanceNo)).append("\n");
		sb.append("		nasVolumeSnapshotName: ").append(toIndentedString(nasVolumeSnapshotName)).append("\n");
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

