/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * OpenAPI spec version: 2019-10-17T10:28:43Z
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.server.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * GetNasVolumeInstanceListRequest
 */
public class GetNasVolumeInstanceListRequest {
	private String volumeAllotmentProtocolTypeCode = null;

	private Boolean isEventConfiguration = null;

	private Boolean isSnapshotConfiguration = null;

	private List<String> nasVolumeInstanceNoList = null;

	private String regionNo = null;

	private String zoneNo = null;

	private String responseFormatType = null;

	public GetNasVolumeInstanceListRequest volumeAllotmentProtocolTypeCode(String volumeAllotmentProtocolTypeCode) {
		this.volumeAllotmentProtocolTypeCode = volumeAllotmentProtocolTypeCode;
		return this;
	}

	 /**
	 * 볼륨할당프로토콜유형코드
	 * @return volumeAllotmentProtocolTypeCode
	**/
	public String getVolumeAllotmentProtocolTypeCode() {
		return volumeAllotmentProtocolTypeCode;
	}

	public void setVolumeAllotmentProtocolTypeCode(String volumeAllotmentProtocolTypeCode) {
		this.volumeAllotmentProtocolTypeCode = volumeAllotmentProtocolTypeCode;
	}

	public GetNasVolumeInstanceListRequest isEventConfiguration(Boolean isEventConfiguration) {
		this.isEventConfiguration = isEventConfiguration;
		return this;
	}

	 /**
	 * 이벤트설정여부
	 * @return isEventConfiguration
	**/
	public Boolean isIsEventConfiguration() {
		return isEventConfiguration;
	}

	public void setIsEventConfiguration(Boolean isEventConfiguration) {
		this.isEventConfiguration = isEventConfiguration;
	}

	public GetNasVolumeInstanceListRequest isSnapshotConfiguration(Boolean isSnapshotConfiguration) {
		this.isSnapshotConfiguration = isSnapshotConfiguration;
		return this;
	}

	 /**
	 * 스냅샷볼륨설정여부
	 * @return isSnapshotConfiguration
	**/
	public Boolean isIsSnapshotConfiguration() {
		return isSnapshotConfiguration;
	}

	public void setIsSnapshotConfiguration(Boolean isSnapshotConfiguration) {
		this.isSnapshotConfiguration = isSnapshotConfiguration;
	}

	public GetNasVolumeInstanceListRequest nasVolumeInstanceNoList(List<String> nasVolumeInstanceNoList) {
		this.nasVolumeInstanceNoList = nasVolumeInstanceNoList;
		return this;
	}

	public GetNasVolumeInstanceListRequest addNasVolumeInstanceNoListItem(String nasVolumeInstanceNoListItem) {
		if (this.nasVolumeInstanceNoList == null) {
			this.nasVolumeInstanceNoList = new ArrayList<String>();
		}
		this.nasVolumeInstanceNoList.add(nasVolumeInstanceNoListItem);
		return this;
	}

	 /**
	 * NAS볼륨인스턴스번호리스트
	 * @return nasVolumeInstanceNoList
	**/
	public List<String> getNasVolumeInstanceNoList() {
		return nasVolumeInstanceNoList;
	}

	public void setNasVolumeInstanceNoList(List<String> nasVolumeInstanceNoList) {
		this.nasVolumeInstanceNoList = nasVolumeInstanceNoList;
	}

	public GetNasVolumeInstanceListRequest regionNo(String regionNo) {
		this.regionNo = regionNo;
		return this;
	}

	 /**
	 * 리전번호
	 * @return regionNo
	**/
	public String getRegionNo() {
		return regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
	}

	public GetNasVolumeInstanceListRequest zoneNo(String zoneNo) {
		this.zoneNo = zoneNo;
		return this;
	}

	 /**
	 * ZONE번호
	 * @return zoneNo
	**/
	public String getZoneNo() {
		return zoneNo;
	}

	public void setZoneNo(String zoneNo) {
		this.zoneNo = zoneNo;
	}

	public GetNasVolumeInstanceListRequest responseFormatType(String responseFormatType) {
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
		GetNasVolumeInstanceListRequest getNasVolumeInstanceListRequest = (GetNasVolumeInstanceListRequest) o;
		return Objects.equals(this.volumeAllotmentProtocolTypeCode, getNasVolumeInstanceListRequest.volumeAllotmentProtocolTypeCode) &&
				Objects.equals(this.isEventConfiguration, getNasVolumeInstanceListRequest.isEventConfiguration) &&
				Objects.equals(this.isSnapshotConfiguration, getNasVolumeInstanceListRequest.isSnapshotConfiguration) &&
				Objects.equals(this.nasVolumeInstanceNoList, getNasVolumeInstanceListRequest.nasVolumeInstanceNoList) &&
				Objects.equals(this.regionNo, getNasVolumeInstanceListRequest.regionNo) &&
				Objects.equals(this.zoneNo, getNasVolumeInstanceListRequest.zoneNo) &&
				Objects.equals(this.responseFormatType, getNasVolumeInstanceListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(volumeAllotmentProtocolTypeCode, isEventConfiguration, isSnapshotConfiguration, nasVolumeInstanceNoList, regionNo, zoneNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetNasVolumeInstanceListRequest {\n");
		
		sb.append("		volumeAllotmentProtocolTypeCode: ").append(toIndentedString(volumeAllotmentProtocolTypeCode)).append("\n");
		sb.append("		isEventConfiguration: ").append(toIndentedString(isEventConfiguration)).append("\n");
		sb.append("		isSnapshotConfiguration: ").append(toIndentedString(isSnapshotConfiguration)).append("\n");
		sb.append("		nasVolumeInstanceNoList: ").append(toIndentedString(nasVolumeInstanceNoList)).append("\n");
		sb.append("		regionNo: ").append(toIndentedString(regionNo)).append("\n");
		sb.append("		zoneNo: ").append(toIndentedString(zoneNo)).append("\n");
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

