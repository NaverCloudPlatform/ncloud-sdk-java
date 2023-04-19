/*
 * vnas
 * VPC NAS 관련 API<br/>https://ncloud.apigw.ntruss.com/vnas/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vnas.model;

import java.util.Objects;
import com.ncloud.vnas.model.NasVolumeInstanceRating;
import java.util.ArrayList;
import java.util.List;

/**
 * GetNasVolumeInstanceRatingListResponse
 */
public class GetNasVolumeInstanceRatingListResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<NasVolumeInstanceRating> nasVolumeInstanceRatingList = null;

	public GetNasVolumeInstanceRatingListResponse requestId(String requestId) {
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

	public GetNasVolumeInstanceRatingListResponse returnCode(String returnCode) {
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

	public GetNasVolumeInstanceRatingListResponse returnMessage(String returnMessage) {
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

	public GetNasVolumeInstanceRatingListResponse totalRows(Integer totalRows) {
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

	public GetNasVolumeInstanceRatingListResponse nasVolumeInstanceRatingList(List<NasVolumeInstanceRating> nasVolumeInstanceRatingList) {
		this.nasVolumeInstanceRatingList = nasVolumeInstanceRatingList;
		return this;
	}

	public GetNasVolumeInstanceRatingListResponse addNasVolumeInstanceRatingListItem(NasVolumeInstanceRating nasVolumeInstanceRatingListItem) {
		if (this.nasVolumeInstanceRatingList == null) {
			this.nasVolumeInstanceRatingList = new ArrayList<NasVolumeInstanceRating>();
		}
		this.nasVolumeInstanceRatingList.add(nasVolumeInstanceRatingListItem);
		return this;
	}

	 /**
	 * Get nasVolumeInstanceRatingList
	 * @return nasVolumeInstanceRatingList
	**/
	public List<NasVolumeInstanceRating> getNasVolumeInstanceRatingList() {
		return nasVolumeInstanceRatingList;
	}

	public void setNasVolumeInstanceRatingList(List<NasVolumeInstanceRating> nasVolumeInstanceRatingList) {
		this.nasVolumeInstanceRatingList = nasVolumeInstanceRatingList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GetNasVolumeInstanceRatingListResponse getNasVolumeInstanceRatingListResponse = (GetNasVolumeInstanceRatingListResponse) o;
		return Objects.equals(this.requestId, getNasVolumeInstanceRatingListResponse.requestId) &&
				Objects.equals(this.returnCode, getNasVolumeInstanceRatingListResponse.returnCode) &&
				Objects.equals(this.returnMessage, getNasVolumeInstanceRatingListResponse.returnMessage) &&
				Objects.equals(this.totalRows, getNasVolumeInstanceRatingListResponse.totalRows) &&
				Objects.equals(this.nasVolumeInstanceRatingList, getNasVolumeInstanceRatingListResponse.nasVolumeInstanceRatingList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, nasVolumeInstanceRatingList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetNasVolumeInstanceRatingListResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		nasVolumeInstanceRatingList: ").append(toIndentedString(nasVolumeInstanceRatingList)).append("\n");
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

