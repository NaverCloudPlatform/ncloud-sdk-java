/*
 * vserver
 * VPC Compute 관련 API<br/>https://ncloud.apigw.ntruss.com/vserver/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vserver.model;

import java.util.Objects;

/**
 * CreatePlacementGroupRequest
 */
public class CreatePlacementGroupRequest {
	private String regionCode = null;

	private String placementGroupName = null;

	private String placementGroupTypeCode = null;

	private String responseFormatType = null;

	public CreatePlacementGroupRequest regionCode(String regionCode) {
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

	public CreatePlacementGroupRequest placementGroupName(String placementGroupName) {
		this.placementGroupName = placementGroupName;
		return this;
	}

	 /**
	 * 물리배치그룹이름
	 * @return placementGroupName
	**/
	public String getPlacementGroupName() {
		return placementGroupName;
	}

	public void setPlacementGroupName(String placementGroupName) {
		this.placementGroupName = placementGroupName;
	}

	public CreatePlacementGroupRequest placementGroupTypeCode(String placementGroupTypeCode) {
		this.placementGroupTypeCode = placementGroupTypeCode;
		return this;
	}

	 /**
	 * 물리배치그룹유형코드
	 * @return placementGroupTypeCode
	**/
	public String getPlacementGroupTypeCode() {
		return placementGroupTypeCode;
	}

	public void setPlacementGroupTypeCode(String placementGroupTypeCode) {
		this.placementGroupTypeCode = placementGroupTypeCode;
	}

	public CreatePlacementGroupRequest responseFormatType(String responseFormatType) {
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
		CreatePlacementGroupRequest createPlacementGroupRequest = (CreatePlacementGroupRequest) o;
		return Objects.equals(this.regionCode, createPlacementGroupRequest.regionCode) &&
				Objects.equals(this.placementGroupName, createPlacementGroupRequest.placementGroupName) &&
				Objects.equals(this.placementGroupTypeCode, createPlacementGroupRequest.placementGroupTypeCode) &&
				Objects.equals(this.responseFormatType, createPlacementGroupRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, placementGroupName, placementGroupTypeCode, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreatePlacementGroupRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		placementGroupName: ").append(toIndentedString(placementGroupName)).append("\n");
		sb.append("		placementGroupTypeCode: ").append(toIndentedString(placementGroupTypeCode)).append("\n");
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

