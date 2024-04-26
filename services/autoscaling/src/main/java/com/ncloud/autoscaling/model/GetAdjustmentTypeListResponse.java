/*
 * autoscaling
 * <br/>https://ncloud.apigw.ntruss.com/autoscaling/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.autoscaling.model;

import java.util.Objects;
import com.ncloud.autoscaling.model.AdjustmentType;
import java.util.ArrayList;
import java.util.List;

/**
 * GetAdjustmentTypeListResponse
 */
public class GetAdjustmentTypeListResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<AdjustmentType> adjustmentTypeList = null;

	public GetAdjustmentTypeListResponse requestId(String requestId) {
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

	public GetAdjustmentTypeListResponse returnCode(String returnCode) {
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

	public GetAdjustmentTypeListResponse returnMessage(String returnMessage) {
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

	public GetAdjustmentTypeListResponse totalRows(Integer totalRows) {
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

	public GetAdjustmentTypeListResponse adjustmentTypeList(List<AdjustmentType> adjustmentTypeList) {
		this.adjustmentTypeList = adjustmentTypeList;
		return this;
	}

	public GetAdjustmentTypeListResponse addAdjustmentTypeListItem(AdjustmentType adjustmentTypeListItem) {
		if (this.adjustmentTypeList == null) {
			this.adjustmentTypeList = new ArrayList<AdjustmentType>();
		}
		this.adjustmentTypeList.add(adjustmentTypeListItem);
		return this;
	}

	 /**
	 * Get adjustmentTypeList
	 * @return adjustmentTypeList
	**/
	public List<AdjustmentType> getAdjustmentTypeList() {
		return adjustmentTypeList;
	}

	public void setAdjustmentTypeList(List<AdjustmentType> adjustmentTypeList) {
		this.adjustmentTypeList = adjustmentTypeList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GetAdjustmentTypeListResponse getAdjustmentTypeListResponse = (GetAdjustmentTypeListResponse) o;
		return Objects.equals(this.requestId, getAdjustmentTypeListResponse.requestId) &&
				Objects.equals(this.returnCode, getAdjustmentTypeListResponse.returnCode) &&
				Objects.equals(this.returnMessage, getAdjustmentTypeListResponse.returnMessage) &&
				Objects.equals(this.totalRows, getAdjustmentTypeListResponse.totalRows) &&
				Objects.equals(this.adjustmentTypeList, getAdjustmentTypeListResponse.adjustmentTypeList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, adjustmentTypeList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetAdjustmentTypeListResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		adjustmentTypeList: ").append(toIndentedString(adjustmentTypeList)).append("\n");
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

