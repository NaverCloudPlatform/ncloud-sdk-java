/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
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
 * SetMemberServerImageSharingPermissionRequest
 */
public class SetMemberServerImageSharingPermissionRequest {
	private String memberServerImageNo = null;

	private List<String> targetLoginIdList = null;

	private String responseFormatType = null;

	public SetMemberServerImageSharingPermissionRequest memberServerImageNo(String memberServerImageNo) {
		this.memberServerImageNo = memberServerImageNo;
		return this;
	}

	 /**
	 * 회원서버이미지번호
	 * @return memberServerImageNo
	**/
	public String getMemberServerImageNo() {
		return memberServerImageNo;
	}

	public void setMemberServerImageNo(String memberServerImageNo) {
		this.memberServerImageNo = memberServerImageNo;
	}

	public SetMemberServerImageSharingPermissionRequest targetLoginIdList(List<String> targetLoginIdList) {
		this.targetLoginIdList = targetLoginIdList;
		return this;
	}

	public SetMemberServerImageSharingPermissionRequest addTargetLoginIdListItem(String targetLoginIdListItem) {
		if (this.targetLoginIdList == null) {
			this.targetLoginIdList = new ArrayList<String>();
		}
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

	public SetMemberServerImageSharingPermissionRequest responseFormatType(String responseFormatType) {
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
		SetMemberServerImageSharingPermissionRequest setMemberServerImageSharingPermissionRequest = (SetMemberServerImageSharingPermissionRequest) o;
		return Objects.equals(this.memberServerImageNo, setMemberServerImageSharingPermissionRequest.memberServerImageNo) &&
				Objects.equals(this.targetLoginIdList, setMemberServerImageSharingPermissionRequest.targetLoginIdList) &&
				Objects.equals(this.responseFormatType, setMemberServerImageSharingPermissionRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(memberServerImageNo, targetLoginIdList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SetMemberServerImageSharingPermissionRequest {\n");
		
		sb.append("		memberServerImageNo: ").append(toIndentedString(memberServerImageNo)).append("\n");
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

