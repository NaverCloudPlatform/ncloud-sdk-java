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
import java.util.ArrayList;
import java.util.List;

/**
 * AddMemberServerImageSharingPermissionRequest
 */
public class AddMemberServerImageSharingPermissionRequest {
	private String regionCode = null;

	private String memberServerImageInstanceNo = null;

	private List<String> targetLoginIdList = new ArrayList<String>();

	private String responseFormatType = null;

	public AddMemberServerImageSharingPermissionRequest regionCode(String regionCode) {
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

	public AddMemberServerImageSharingPermissionRequest memberServerImageInstanceNo(String memberServerImageInstanceNo) {
		this.memberServerImageInstanceNo = memberServerImageInstanceNo;
		return this;
	}

	 /**
	 * 회원서버이미지인스턴스번호
	 * @return memberServerImageInstanceNo
	**/
	public String getMemberServerImageInstanceNo() {
		return memberServerImageInstanceNo;
	}

	public void setMemberServerImageInstanceNo(String memberServerImageInstanceNo) {
		this.memberServerImageInstanceNo = memberServerImageInstanceNo;
	}

	public AddMemberServerImageSharingPermissionRequest targetLoginIdList(List<String> targetLoginIdList) {
		this.targetLoginIdList = targetLoginIdList;
		return this;
	}

	public AddMemberServerImageSharingPermissionRequest addTargetLoginIdListItem(String targetLoginIdListItem) {
		this.targetLoginIdList.add(targetLoginIdListItem);
		return this;
	}

	 /**
	 * 대상로그인ID리스트
	 * @return targetLoginIdList
	**/
	public List<String> getTargetLoginIdList() {
		return targetLoginIdList;
	}

	public void setTargetLoginIdList(List<String> targetLoginIdList) {
		this.targetLoginIdList = targetLoginIdList;
	}

	public AddMemberServerImageSharingPermissionRequest responseFormatType(String responseFormatType) {
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
		AddMemberServerImageSharingPermissionRequest addMemberServerImageSharingPermissionRequest = (AddMemberServerImageSharingPermissionRequest) o;
		return Objects.equals(this.regionCode, addMemberServerImageSharingPermissionRequest.regionCode) &&
				Objects.equals(this.memberServerImageInstanceNo, addMemberServerImageSharingPermissionRequest.memberServerImageInstanceNo) &&
				Objects.equals(this.targetLoginIdList, addMemberServerImageSharingPermissionRequest.targetLoginIdList) &&
				Objects.equals(this.responseFormatType, addMemberServerImageSharingPermissionRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, memberServerImageInstanceNo, targetLoginIdList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AddMemberServerImageSharingPermissionRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		memberServerImageInstanceNo: ").append(toIndentedString(memberServerImageInstanceNo)).append("\n");
		sb.append("		targetLoginIdList: ").append(toIndentedString(targetLoginIdList)).append("\n");
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

