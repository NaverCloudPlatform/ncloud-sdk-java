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
import com.ncloud.vserver.model.MemberServerImageInstance;
import java.util.ArrayList;
import java.util.List;

/**
 * GetMemberServerImageInstanceDetailResponse
 */
public class GetMemberServerImageInstanceDetailResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<MemberServerImageInstance> memberServerImageInstanceList = null;

	public GetMemberServerImageInstanceDetailResponse requestId(String requestId) {
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

	public GetMemberServerImageInstanceDetailResponse returnCode(String returnCode) {
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

	public GetMemberServerImageInstanceDetailResponse returnMessage(String returnMessage) {
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

	public GetMemberServerImageInstanceDetailResponse totalRows(Integer totalRows) {
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

	public GetMemberServerImageInstanceDetailResponse memberServerImageInstanceList(List<MemberServerImageInstance> memberServerImageInstanceList) {
		this.memberServerImageInstanceList = memberServerImageInstanceList;
		return this;
	}

	public GetMemberServerImageInstanceDetailResponse addMemberServerImageInstanceListItem(MemberServerImageInstance memberServerImageInstanceListItem) {
		if (this.memberServerImageInstanceList == null) {
			this.memberServerImageInstanceList = new ArrayList<MemberServerImageInstance>();
		}
		this.memberServerImageInstanceList.add(memberServerImageInstanceListItem);
		return this;
	}

	 /**
	 * Get memberServerImageInstanceList
	 * @return memberServerImageInstanceList
	**/
	public List<MemberServerImageInstance> getMemberServerImageInstanceList() {
		return memberServerImageInstanceList;
	}

	public void setMemberServerImageInstanceList(List<MemberServerImageInstance> memberServerImageInstanceList) {
		this.memberServerImageInstanceList = memberServerImageInstanceList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GetMemberServerImageInstanceDetailResponse getMemberServerImageInstanceDetailResponse = (GetMemberServerImageInstanceDetailResponse) o;
		return Objects.equals(this.requestId, getMemberServerImageInstanceDetailResponse.requestId) &&
				Objects.equals(this.returnCode, getMemberServerImageInstanceDetailResponse.returnCode) &&
				Objects.equals(this.returnMessage, getMemberServerImageInstanceDetailResponse.returnMessage) &&
				Objects.equals(this.totalRows, getMemberServerImageInstanceDetailResponse.totalRows) &&
				Objects.equals(this.memberServerImageInstanceList, getMemberServerImageInstanceDetailResponse.memberServerImageInstanceList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, memberServerImageInstanceList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetMemberServerImageInstanceDetailResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		memberServerImageInstanceList: ").append(toIndentedString(memberServerImageInstanceList)).append("\n");
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

