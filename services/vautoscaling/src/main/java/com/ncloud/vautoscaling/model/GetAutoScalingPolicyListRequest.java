/*
 * vautoscaling
 * VPC Auto Scaling 관련 API<br/>https://ncloud.apigw.ntruss.com/vautoscaling/v2
 *
 * OpenAPI spec version: 2021-01-21T11:15:08Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vautoscaling.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * GetAutoScalingPolicyListRequest
 */
public class GetAutoScalingPolicyListRequest {
	private String regionCode = null;

	private String autoScalingGroupNo = null;

	private List<String> policyNoList = null;

	private String responseFormatType = null;

	public GetAutoScalingPolicyListRequest regionCode(String regionCode) {
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

	public GetAutoScalingPolicyListRequest autoScalingGroupNo(String autoScalingGroupNo) {
		this.autoScalingGroupNo = autoScalingGroupNo;
		return this;
	}

	 /**
	 * 오토스케일링그룹번호
	 * @return autoScalingGroupNo
	**/
	public String getAutoScalingGroupNo() {
		return autoScalingGroupNo;
	}

	public void setAutoScalingGroupNo(String autoScalingGroupNo) {
		this.autoScalingGroupNo = autoScalingGroupNo;
	}

	public GetAutoScalingPolicyListRequest policyNoList(List<String> policyNoList) {
		this.policyNoList = policyNoList;
		return this;
	}

	public GetAutoScalingPolicyListRequest addPolicyNoListItem(String policyNoListItem) {
		if (this.policyNoList == null) {
			this.policyNoList = new ArrayList<String>();
		}
		this.policyNoList.add(policyNoListItem);
		return this;
	}

	 /**
	 * 정책번호리스트
	 * @return policyNoList
	**/
	public List<String> getPolicyNoList() {
		return policyNoList;
	}

	public void setPolicyNoList(List<String> policyNoList) {
		this.policyNoList = policyNoList;
	}

	public GetAutoScalingPolicyListRequest responseFormatType(String responseFormatType) {
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
		GetAutoScalingPolicyListRequest getAutoScalingPolicyListRequest = (GetAutoScalingPolicyListRequest) o;
		return Objects.equals(this.regionCode, getAutoScalingPolicyListRequest.regionCode) &&
				Objects.equals(this.autoScalingGroupNo, getAutoScalingPolicyListRequest.autoScalingGroupNo) &&
				Objects.equals(this.policyNoList, getAutoScalingPolicyListRequest.policyNoList) &&
				Objects.equals(this.responseFormatType, getAutoScalingPolicyListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, autoScalingGroupNo, policyNoList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetAutoScalingPolicyListRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		autoScalingGroupNo: ").append(toIndentedString(autoScalingGroupNo)).append("\n");
		sb.append("		policyNoList: ").append(toIndentedString(policyNoList)).append("\n");
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

