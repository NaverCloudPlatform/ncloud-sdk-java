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
import com.ncloud.vserver.model.LoginKey;
import java.util.ArrayList;
import java.util.List;

/**
 * GetLoginKeyListResponse
 */
public class GetLoginKeyListResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<LoginKey> loginKeyList = null;

	public GetLoginKeyListResponse requestId(String requestId) {
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

	public GetLoginKeyListResponse returnCode(String returnCode) {
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

	public GetLoginKeyListResponse returnMessage(String returnMessage) {
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

	public GetLoginKeyListResponse totalRows(Integer totalRows) {
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

	public GetLoginKeyListResponse loginKeyList(List<LoginKey> loginKeyList) {
		this.loginKeyList = loginKeyList;
		return this;
	}

	public GetLoginKeyListResponse addLoginKeyListItem(LoginKey loginKeyListItem) {
		if (this.loginKeyList == null) {
			this.loginKeyList = new ArrayList<LoginKey>();
		}
		this.loginKeyList.add(loginKeyListItem);
		return this;
	}

	 /**
	 * Get loginKeyList
	 * @return loginKeyList
	**/
	public List<LoginKey> getLoginKeyList() {
		return loginKeyList;
	}

	public void setLoginKeyList(List<LoginKey> loginKeyList) {
		this.loginKeyList = loginKeyList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GetLoginKeyListResponse getLoginKeyListResponse = (GetLoginKeyListResponse) o;
		return Objects.equals(this.requestId, getLoginKeyListResponse.requestId) &&
				Objects.equals(this.returnCode, getLoginKeyListResponse.returnCode) &&
				Objects.equals(this.returnMessage, getLoginKeyListResponse.returnMessage) &&
				Objects.equals(this.totalRows, getLoginKeyListResponse.totalRows) &&
				Objects.equals(this.loginKeyList, getLoginKeyListResponse.loginKeyList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, loginKeyList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetLoginKeyListResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		loginKeyList: ").append(toIndentedString(loginKeyList)).append("\n");
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

