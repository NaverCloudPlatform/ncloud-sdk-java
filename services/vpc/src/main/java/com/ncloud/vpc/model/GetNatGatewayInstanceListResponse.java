/*
 * vpc
 * VPC Network 관련 API<br/>https://ncloud.apigw.ntruss.com/vpc/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vpc.model;

import java.util.Objects;
import com.ncloud.vpc.model.NatGatewayInstance;
import java.util.ArrayList;
import java.util.List;

/**
 * GetNatGatewayInstanceListResponse
 */
public class GetNatGatewayInstanceListResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<NatGatewayInstance> natGatewayInstanceList = null;

	public GetNatGatewayInstanceListResponse requestId(String requestId) {
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

	public GetNatGatewayInstanceListResponse returnCode(String returnCode) {
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

	public GetNatGatewayInstanceListResponse returnMessage(String returnMessage) {
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

	public GetNatGatewayInstanceListResponse totalRows(Integer totalRows) {
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

	public GetNatGatewayInstanceListResponse natGatewayInstanceList(List<NatGatewayInstance> natGatewayInstanceList) {
		this.natGatewayInstanceList = natGatewayInstanceList;
		return this;
	}

	public GetNatGatewayInstanceListResponse addNatGatewayInstanceListItem(NatGatewayInstance natGatewayInstanceListItem) {
		if (this.natGatewayInstanceList == null) {
			this.natGatewayInstanceList = new ArrayList<NatGatewayInstance>();
		}
		this.natGatewayInstanceList.add(natGatewayInstanceListItem);
		return this;
	}

	 /**
	 * Get natGatewayInstanceList
	 * @return natGatewayInstanceList
	**/
	public List<NatGatewayInstance> getNatGatewayInstanceList() {
		return natGatewayInstanceList;
	}

	public void setNatGatewayInstanceList(List<NatGatewayInstance> natGatewayInstanceList) {
		this.natGatewayInstanceList = natGatewayInstanceList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GetNatGatewayInstanceListResponse getNatGatewayInstanceListResponse = (GetNatGatewayInstanceListResponse) o;
		return Objects.equals(this.requestId, getNatGatewayInstanceListResponse.requestId) &&
				Objects.equals(this.returnCode, getNatGatewayInstanceListResponse.returnCode) &&
				Objects.equals(this.returnMessage, getNatGatewayInstanceListResponse.returnMessage) &&
				Objects.equals(this.totalRows, getNatGatewayInstanceListResponse.totalRows) &&
				Objects.equals(this.natGatewayInstanceList, getNatGatewayInstanceListResponse.natGatewayInstanceList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, natGatewayInstanceList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetNatGatewayInstanceListResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		natGatewayInstanceList: ").append(toIndentedString(natGatewayInstanceList)).append("\n");
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

