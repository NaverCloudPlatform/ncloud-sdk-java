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
import java.util.ArrayList;
import java.util.List;

/**
 * AddTargetRequest
 */
public class AddTargetRequest {
	private String regionCode = null;

	private String targetGroupNo = null;

	private List<String> targetNoList = new ArrayList<String>();

	private String responseFormatType = null;

	public AddTargetRequest regionCode(String regionCode) {
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

	public AddTargetRequest targetGroupNo(String targetGroupNo) {
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

	public AddTargetRequest targetNoList(List<String> targetNoList) {
		this.targetNoList = targetNoList;
		return this;
	}

	public AddTargetRequest addTargetNoListItem(String targetNoListItem) {
		this.targetNoList.add(targetNoListItem);
		return this;
	}

	 /**
	 * 타겟번호리스트
	 * @return targetNoList
	**/
	public List<String> getTargetNoList() {
		return targetNoList;
	}

	public void setTargetNoList(List<String> targetNoList) {
		this.targetNoList = targetNoList;
	}

	public AddTargetRequest responseFormatType(String responseFormatType) {
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
		AddTargetRequest addTargetRequest = (AddTargetRequest) o;
		return Objects.equals(this.regionCode, addTargetRequest.regionCode) &&
				Objects.equals(this.targetGroupNo, addTargetRequest.targetGroupNo) &&
				Objects.equals(this.targetNoList, addTargetRequest.targetNoList) &&
				Objects.equals(this.responseFormatType, addTargetRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, targetGroupNo, targetNoList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AddTargetRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		targetGroupNo: ").append(toIndentedString(targetGroupNo)).append("\n");
		sb.append("		targetNoList: ").append(toIndentedString(targetNoList)).append("\n");
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

