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
import com.ncloud.vpc.model.NetworkAcl;
import java.util.ArrayList;
import java.util.List;

/**
 * SetNetworkAclDescriptionResponse
 */
public class SetNetworkAclDescriptionResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<NetworkAcl> networkAclList = null;

	public SetNetworkAclDescriptionResponse requestId(String requestId) {
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

	public SetNetworkAclDescriptionResponse returnCode(String returnCode) {
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

	public SetNetworkAclDescriptionResponse returnMessage(String returnMessage) {
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

	public SetNetworkAclDescriptionResponse totalRows(Integer totalRows) {
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

	public SetNetworkAclDescriptionResponse networkAclList(List<NetworkAcl> networkAclList) {
		this.networkAclList = networkAclList;
		return this;
	}

	public SetNetworkAclDescriptionResponse addNetworkAclListItem(NetworkAcl networkAclListItem) {
		if (this.networkAclList == null) {
			this.networkAclList = new ArrayList<NetworkAcl>();
		}
		this.networkAclList.add(networkAclListItem);
		return this;
	}

	 /**
	 * Get networkAclList
	 * @return networkAclList
	**/
	public List<NetworkAcl> getNetworkAclList() {
		return networkAclList;
	}

	public void setNetworkAclList(List<NetworkAcl> networkAclList) {
		this.networkAclList = networkAclList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SetNetworkAclDescriptionResponse setNetworkAclDescriptionResponse = (SetNetworkAclDescriptionResponse) o;
		return Objects.equals(this.requestId, setNetworkAclDescriptionResponse.requestId) &&
				Objects.equals(this.returnCode, setNetworkAclDescriptionResponse.returnCode) &&
				Objects.equals(this.returnMessage, setNetworkAclDescriptionResponse.returnMessage) &&
				Objects.equals(this.totalRows, setNetworkAclDescriptionResponse.totalRows) &&
				Objects.equals(this.networkAclList, setNetworkAclDescriptionResponse.networkAclList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, networkAclList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SetNetworkAclDescriptionResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		networkAclList: ").append(toIndentedString(networkAclList)).append("\n");
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

