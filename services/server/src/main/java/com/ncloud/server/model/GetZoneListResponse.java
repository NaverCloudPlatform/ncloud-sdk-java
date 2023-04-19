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
import com.ncloud.server.model.Zone;
import java.util.ArrayList;
import java.util.List;

/**
 * GetZoneListResponse
 */
public class GetZoneListResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private List<Zone> zoneList = null;

	public GetZoneListResponse requestId(String requestId) {
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

	public GetZoneListResponse returnCode(String returnCode) {
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

	public GetZoneListResponse returnMessage(String returnMessage) {
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

	public GetZoneListResponse zoneList(List<Zone> zoneList) {
		this.zoneList = zoneList;
		return this;
	}

	public GetZoneListResponse addZoneListItem(Zone zoneListItem) {
		if (this.zoneList == null) {
			this.zoneList = new ArrayList<Zone>();
		}
		this.zoneList.add(zoneListItem);
		return this;
	}

	 /**
	 * Get zoneList
	 * @return zoneList
	**/
	public List<Zone> getZoneList() {
		return zoneList;
	}

	public void setZoneList(List<Zone> zoneList) {
		this.zoneList = zoneList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GetZoneListResponse getZoneListResponse = (GetZoneListResponse) o;
		return Objects.equals(this.requestId, getZoneListResponse.requestId) &&
				Objects.equals(this.returnCode, getZoneListResponse.returnCode) &&
				Objects.equals(this.returnMessage, getZoneListResponse.returnMessage) &&
				Objects.equals(this.zoneList, getZoneListResponse.zoneList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, zoneList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetZoneListResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		zoneList: ").append(toIndentedString(zoneList)).append("\n");
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

