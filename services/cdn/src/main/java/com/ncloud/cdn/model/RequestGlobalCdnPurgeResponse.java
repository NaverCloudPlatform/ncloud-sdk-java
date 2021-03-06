/*
 * cdn
 * <br/>https://ncloud.apigw.ntruss.com/cdn/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.cdn.model;

import java.util.Objects;
import com.ncloud.cdn.model.GlobalCdnPurgeHistory;
import java.util.ArrayList;
import java.util.List;

/**
 * RequestGlobalCdnPurgeResponse
 */
public class RequestGlobalCdnPurgeResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<GlobalCdnPurgeHistory> globalCdnPurgeHistoryList = null;

	public RequestGlobalCdnPurgeResponse requestId(String requestId) {
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

	public RequestGlobalCdnPurgeResponse returnCode(String returnCode) {
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

	public RequestGlobalCdnPurgeResponse returnMessage(String returnMessage) {
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

	public RequestGlobalCdnPurgeResponse totalRows(Integer totalRows) {
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

	public RequestGlobalCdnPurgeResponse globalCdnPurgeHistoryList(List<GlobalCdnPurgeHistory> globalCdnPurgeHistoryList) {
		this.globalCdnPurgeHistoryList = globalCdnPurgeHistoryList;
		return this;
	}

	public RequestGlobalCdnPurgeResponse addGlobalCdnPurgeHistoryListItem(GlobalCdnPurgeHistory globalCdnPurgeHistoryListItem) {
		if (this.globalCdnPurgeHistoryList == null) {
			this.globalCdnPurgeHistoryList = new ArrayList<GlobalCdnPurgeHistory>();
		}
		this.globalCdnPurgeHistoryList.add(globalCdnPurgeHistoryListItem);
		return this;
	}

	 /**
	 * Get globalCdnPurgeHistoryList
	 * @return globalCdnPurgeHistoryList
	**/
	public List<GlobalCdnPurgeHistory> getGlobalCdnPurgeHistoryList() {
		return globalCdnPurgeHistoryList;
	}

	public void setGlobalCdnPurgeHistoryList(List<GlobalCdnPurgeHistory> globalCdnPurgeHistoryList) {
		this.globalCdnPurgeHistoryList = globalCdnPurgeHistoryList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RequestGlobalCdnPurgeResponse requestGlobalCdnPurgeResponse = (RequestGlobalCdnPurgeResponse) o;
		return Objects.equals(this.requestId, requestGlobalCdnPurgeResponse.requestId) &&
				Objects.equals(this.returnCode, requestGlobalCdnPurgeResponse.returnCode) &&
				Objects.equals(this.returnMessage, requestGlobalCdnPurgeResponse.returnMessage) &&
				Objects.equals(this.totalRows, requestGlobalCdnPurgeResponse.totalRows) &&
				Objects.equals(this.globalCdnPurgeHistoryList, requestGlobalCdnPurgeResponse.globalCdnPurgeHistoryList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, globalCdnPurgeHistoryList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RequestGlobalCdnPurgeResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		globalCdnPurgeHistoryList: ").append(toIndentedString(globalCdnPurgeHistoryList)).append("\n");
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

