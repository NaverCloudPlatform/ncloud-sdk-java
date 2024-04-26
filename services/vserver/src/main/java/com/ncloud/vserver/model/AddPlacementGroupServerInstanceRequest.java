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
 * AddPlacementGroupServerInstanceRequest
 */
public class AddPlacementGroupServerInstanceRequest {
	private String regionCode = null;

	private String placementGroupNo = null;

	private String serverInstanceNo = null;

	private String responseFormatType = null;

	public AddPlacementGroupServerInstanceRequest regionCode(String regionCode) {
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

	public AddPlacementGroupServerInstanceRequest placementGroupNo(String placementGroupNo) {
		this.placementGroupNo = placementGroupNo;
		return this;
	}

	 /**
	 * 물리배치그룹번호
	 * @return placementGroupNo
	**/
	public String getPlacementGroupNo() {
		return placementGroupNo;
	}

	public void setPlacementGroupNo(String placementGroupNo) {
		this.placementGroupNo = placementGroupNo;
	}

	public AddPlacementGroupServerInstanceRequest serverInstanceNo(String serverInstanceNo) {
		this.serverInstanceNo = serverInstanceNo;
		return this;
	}

	 /**
	 * 서버인스턴스번호
	 * @return serverInstanceNo
	**/
	public String getServerInstanceNo() {
		return serverInstanceNo;
	}

	public void setServerInstanceNo(String serverInstanceNo) {
		this.serverInstanceNo = serverInstanceNo;
	}

	public AddPlacementGroupServerInstanceRequest responseFormatType(String responseFormatType) {
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
		AddPlacementGroupServerInstanceRequest addPlacementGroupServerInstanceRequest = (AddPlacementGroupServerInstanceRequest) o;
		return Objects.equals(this.regionCode, addPlacementGroupServerInstanceRequest.regionCode) &&
				Objects.equals(this.placementGroupNo, addPlacementGroupServerInstanceRequest.placementGroupNo) &&
				Objects.equals(this.serverInstanceNo, addPlacementGroupServerInstanceRequest.serverInstanceNo) &&
				Objects.equals(this.responseFormatType, addPlacementGroupServerInstanceRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, placementGroupNo, serverInstanceNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AddPlacementGroupServerInstanceRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		placementGroupNo: ").append(toIndentedString(placementGroupNo)).append("\n");
		sb.append("		serverInstanceNo: ").append(toIndentedString(serverInstanceNo)).append("\n");
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

