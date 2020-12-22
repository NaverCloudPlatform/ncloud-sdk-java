/*
 * vnas
 * VPC NAS 관련 API<br/>https://ncloud.apigw.ntruss.com/vnas/v2
 *
 * OpenAPI spec version: 2020-10-22T12:05:06Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vnas.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * DeleteNasVolumeInstancesRequest
 */
public class DeleteNasVolumeInstancesRequest {
	private String regionCode = null;

	private List<String> nasVolumeInstanceNoList = new ArrayList<String>();

	private String responseFormatType = null;

	public DeleteNasVolumeInstancesRequest regionCode(String regionCode) {
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

	public DeleteNasVolumeInstancesRequest nasVolumeInstanceNoList(List<String> nasVolumeInstanceNoList) {
		this.nasVolumeInstanceNoList = nasVolumeInstanceNoList;
		return this;
	}

	public DeleteNasVolumeInstancesRequest addNasVolumeInstanceNoListItem(String nasVolumeInstanceNoListItem) {
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

	public DeleteNasVolumeInstancesRequest responseFormatType(String responseFormatType) {
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
		DeleteNasVolumeInstancesRequest deleteNasVolumeInstancesRequest = (DeleteNasVolumeInstancesRequest) o;
		return Objects.equals(this.regionCode, deleteNasVolumeInstancesRequest.regionCode) &&
				Objects.equals(this.nasVolumeInstanceNoList, deleteNasVolumeInstancesRequest.nasVolumeInstanceNoList) &&
				Objects.equals(this.responseFormatType, deleteNasVolumeInstancesRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, nasVolumeInstanceNoList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeleteNasVolumeInstancesRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		nasVolumeInstanceNoList: ").append(toIndentedString(nasVolumeInstanceNoList)).append("\n");
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

