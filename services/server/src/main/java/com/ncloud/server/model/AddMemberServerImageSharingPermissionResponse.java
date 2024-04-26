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
import com.ncloud.server.model.MemberServerImage;
import java.util.ArrayList;
import java.util.List;

/**
 * AddMemberServerImageSharingPermissionResponse
 */
public class AddMemberServerImageSharingPermissionResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<MemberServerImage> memberServerImageList = null;

	public AddMemberServerImageSharingPermissionResponse requestId(String requestId) {
		this.requestId = requestId;
		return this;
	}

	 /**
	 * Get requestId
	 * @return requestId
	**/
	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AddMemberServerImageSharingPermissionResponse returnCode(String returnCode) {
		this.returnCode = returnCode;
		return this;
	}

	 /**
	 * Get returnCode
	 * @return returnCode
	**/
	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public AddMemberServerImageSharingPermissionResponse returnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
		return this;
	}

	 /**
	 * Get returnMessage
	 * @return returnMessage
	**/
	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

	public AddMemberServerImageSharingPermissionResponse totalRows(Integer totalRows) {
		this.totalRows = totalRows;
		return this;
	}

	 /**
	 * Get totalRows
	 * @return totalRows
	**/
	public Integer getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(Integer totalRows) {
		this.totalRows = totalRows;
	}

	public AddMemberServerImageSharingPermissionResponse memberServerImageList(List<MemberServerImage> memberServerImageList) {
		this.memberServerImageList = memberServerImageList;
		return this;
	}

	public AddMemberServerImageSharingPermissionResponse addMemberServerImageListItem(MemberServerImage memberServerImageListItem) {
		if (this.memberServerImageList == null) {
			this.memberServerImageList = new ArrayList<MemberServerImage>();
		}
		this.memberServerImageList.add(memberServerImageListItem);
		return this;
	}

	 /**
	 * Get memberServerImageList
	 * @return memberServerImageList
	**/
	public List<MemberServerImage> getMemberServerImageList() {
		return memberServerImageList;
	}

	public void setMemberServerImageList(List<MemberServerImage> memberServerImageList) {
		this.memberServerImageList = memberServerImageList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AddMemberServerImageSharingPermissionResponse addMemberServerImageSharingPermissionResponse = (AddMemberServerImageSharingPermissionResponse) o;
		return Objects.equals(this.requestId, addMemberServerImageSharingPermissionResponse.requestId) &&
				Objects.equals(this.returnCode, addMemberServerImageSharingPermissionResponse.returnCode) &&
				Objects.equals(this.returnMessage, addMemberServerImageSharingPermissionResponse.returnMessage) &&
				Objects.equals(this.totalRows, addMemberServerImageSharingPermissionResponse.totalRows) &&
				Objects.equals(this.memberServerImageList, addMemberServerImageSharingPermissionResponse.memberServerImageList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, memberServerImageList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AddMemberServerImageSharingPermissionResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		memberServerImageList: ").append(toIndentedString(memberServerImageList)).append("\n");
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

