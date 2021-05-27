/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * OpenAPI spec version: 2021-03-04T10:39:42Z
 *
 * 
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
 * DeleteMemberServerImagesRequest
 */
public class DeleteMemberServerImagesRequest {
	private List<String> memberServerImageNoList = new ArrayList<String>();

	private String responseFormatType = null;

	public DeleteMemberServerImagesRequest memberServerImageNoList(List<String> memberServerImageNoList) {
		this.memberServerImageNoList = memberServerImageNoList;
		return this;
	}

	public DeleteMemberServerImagesRequest addMemberServerImageNoListItem(String memberServerImageNoListItem) {
		this.memberServerImageNoList.add(memberServerImageNoListItem);
		return this;
	}

	 /**
	 * 회원서버이미지번호리스트
	 * @return memberServerImageNoList
	**/
	public List<String> getMemberServerImageNoList() {
		return memberServerImageNoList;
	}

	public void setMemberServerImageNoList(List<String> memberServerImageNoList) {
		this.memberServerImageNoList = memberServerImageNoList;
	}

	public DeleteMemberServerImagesRequest responseFormatType(String responseFormatType) {
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
		DeleteMemberServerImagesRequest deleteMemberServerImagesRequest = (DeleteMemberServerImagesRequest) o;
		return Objects.equals(this.memberServerImageNoList, deleteMemberServerImagesRequest.memberServerImageNoList) &&
				Objects.equals(this.responseFormatType, deleteMemberServerImagesRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(memberServerImageNoList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeleteMemberServerImagesRequest {\n");
		
		sb.append("		memberServerImageNoList: ").append(toIndentedString(memberServerImageNoList)).append("\n");
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

