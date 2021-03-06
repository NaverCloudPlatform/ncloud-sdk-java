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
import com.ncloud.cdn.model.CdnPlusPurgeHistory;
import java.util.ArrayList;
import java.util.List;

/**
 * GetCdnPlusPurgeHistoryListResponse
 */
public class GetCdnPlusPurgeHistoryListResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<CdnPlusPurgeHistory> cdnPlusPurgeHistoryList = null;

	public GetCdnPlusPurgeHistoryListResponse requestId(String requestId) {
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

	public GetCdnPlusPurgeHistoryListResponse returnCode(String returnCode) {
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

	public GetCdnPlusPurgeHistoryListResponse returnMessage(String returnMessage) {
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

	public GetCdnPlusPurgeHistoryListResponse totalRows(Integer totalRows) {
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

	public GetCdnPlusPurgeHistoryListResponse cdnPlusPurgeHistoryList(List<CdnPlusPurgeHistory> cdnPlusPurgeHistoryList) {
		this.cdnPlusPurgeHistoryList = cdnPlusPurgeHistoryList;
		return this;
	}

	public GetCdnPlusPurgeHistoryListResponse addCdnPlusPurgeHistoryListItem(CdnPlusPurgeHistory cdnPlusPurgeHistoryListItem) {
		if (this.cdnPlusPurgeHistoryList == null) {
			this.cdnPlusPurgeHistoryList = new ArrayList<CdnPlusPurgeHistory>();
		}
		this.cdnPlusPurgeHistoryList.add(cdnPlusPurgeHistoryListItem);
		return this;
	}

	 /**
	 * Get cdnPlusPurgeHistoryList
	 * @return cdnPlusPurgeHistoryList
	**/
	public List<CdnPlusPurgeHistory> getCdnPlusPurgeHistoryList() {
		return cdnPlusPurgeHistoryList;
	}

	public void setCdnPlusPurgeHistoryList(List<CdnPlusPurgeHistory> cdnPlusPurgeHistoryList) {
		this.cdnPlusPurgeHistoryList = cdnPlusPurgeHistoryList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GetCdnPlusPurgeHistoryListResponse getCdnPlusPurgeHistoryListResponse = (GetCdnPlusPurgeHistoryListResponse) o;
		return Objects.equals(this.requestId, getCdnPlusPurgeHistoryListResponse.requestId) &&
				Objects.equals(this.returnCode, getCdnPlusPurgeHistoryListResponse.returnCode) &&
				Objects.equals(this.returnMessage, getCdnPlusPurgeHistoryListResponse.returnMessage) &&
				Objects.equals(this.totalRows, getCdnPlusPurgeHistoryListResponse.totalRows) &&
				Objects.equals(this.cdnPlusPurgeHistoryList, getCdnPlusPurgeHistoryListResponse.cdnPlusPurgeHistoryList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, cdnPlusPurgeHistoryList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetCdnPlusPurgeHistoryListResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		cdnPlusPurgeHistoryList: ").append(toIndentedString(cdnPlusPurgeHistoryList)).append("\n");
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

