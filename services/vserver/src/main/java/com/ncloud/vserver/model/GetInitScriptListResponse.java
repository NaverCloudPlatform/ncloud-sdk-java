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
import com.ncloud.vserver.model.InitScript;
import java.util.ArrayList;
import java.util.List;

/**
 * GetInitScriptListResponse
 */
public class GetInitScriptListResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<InitScript> initScriptList = null;

	public GetInitScriptListResponse requestId(String requestId) {
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

	public GetInitScriptListResponse returnCode(String returnCode) {
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

	public GetInitScriptListResponse returnMessage(String returnMessage) {
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

	public GetInitScriptListResponse totalRows(Integer totalRows) {
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

	public GetInitScriptListResponse initScriptList(List<InitScript> initScriptList) {
		this.initScriptList = initScriptList;
		return this;
	}

	public GetInitScriptListResponse addInitScriptListItem(InitScript initScriptListItem) {
		if (this.initScriptList == null) {
			this.initScriptList = new ArrayList<InitScript>();
		}
		this.initScriptList.add(initScriptListItem);
		return this;
	}

	 /**
	 * Get initScriptList
	 * @return initScriptList
	**/
	public List<InitScript> getInitScriptList() {
		return initScriptList;
	}

	public void setInitScriptList(List<InitScript> initScriptList) {
		this.initScriptList = initScriptList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GetInitScriptListResponse getInitScriptListResponse = (GetInitScriptListResponse) o;
		return Objects.equals(this.requestId, getInitScriptListResponse.requestId) &&
				Objects.equals(this.returnCode, getInitScriptListResponse.returnCode) &&
				Objects.equals(this.returnMessage, getInitScriptListResponse.returnMessage) &&
				Objects.equals(this.totalRows, getInitScriptListResponse.totalRows) &&
				Objects.equals(this.initScriptList, getInitScriptListResponse.initScriptList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, initScriptList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetInitScriptListResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		initScriptList: ").append(toIndentedString(initScriptList)).append("\n");
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

