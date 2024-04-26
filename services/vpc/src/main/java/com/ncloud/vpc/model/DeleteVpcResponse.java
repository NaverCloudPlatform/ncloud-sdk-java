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
import com.ncloud.vpc.model.Vpc;
import java.util.ArrayList;
import java.util.List;

/**
 * DeleteVpcResponse
 */
public class DeleteVpcResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<Vpc> vpcList = null;

	public DeleteVpcResponse requestId(String requestId) {
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

	public DeleteVpcResponse returnCode(String returnCode) {
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

	public DeleteVpcResponse returnMessage(String returnMessage) {
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

	public DeleteVpcResponse totalRows(Integer totalRows) {
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

	public DeleteVpcResponse vpcList(List<Vpc> vpcList) {
		this.vpcList = vpcList;
		return this;
	}

	public DeleteVpcResponse addVpcListItem(Vpc vpcListItem) {
		if (this.vpcList == null) {
			this.vpcList = new ArrayList<Vpc>();
		}
		this.vpcList.add(vpcListItem);
		return this;
	}

	 /**
	 * Get vpcList
	 * @return vpcList
	**/
	public List<Vpc> getVpcList() {
		return vpcList;
	}

	public void setVpcList(List<Vpc> vpcList) {
		this.vpcList = vpcList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeleteVpcResponse deleteVpcResponse = (DeleteVpcResponse) o;
		return Objects.equals(this.requestId, deleteVpcResponse.requestId) &&
				Objects.equals(this.returnCode, deleteVpcResponse.returnCode) &&
				Objects.equals(this.returnMessage, deleteVpcResponse.returnMessage) &&
				Objects.equals(this.totalRows, deleteVpcResponse.totalRows) &&
				Objects.equals(this.vpcList, deleteVpcResponse.vpcList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, vpcList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeleteVpcResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		vpcList: ").append(toIndentedString(vpcList)).append("\n");
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

