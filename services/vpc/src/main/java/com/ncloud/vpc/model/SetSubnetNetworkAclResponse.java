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
 * SetSubnetNetworkAclResponse
 */
public class SetSubnetNetworkAclResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<NetworkAcl> networkAclList = null;

	public SetSubnetNetworkAclResponse requestId(String requestId) {
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

	public SetSubnetNetworkAclResponse returnCode(String returnCode) {
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

	public SetSubnetNetworkAclResponse returnMessage(String returnMessage) {
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

	public SetSubnetNetworkAclResponse totalRows(Integer totalRows) {
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

	public SetSubnetNetworkAclResponse networkAclList(List<NetworkAcl> networkAclList) {
		this.networkAclList = networkAclList;
		return this;
	}

	public SetSubnetNetworkAclResponse addNetworkAclListItem(NetworkAcl networkAclListItem) {
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
		SetSubnetNetworkAclResponse setSubnetNetworkAclResponse = (SetSubnetNetworkAclResponse) o;
		return Objects.equals(this.requestId, setSubnetNetworkAclResponse.requestId) &&
				Objects.equals(this.returnCode, setSubnetNetworkAclResponse.returnCode) &&
				Objects.equals(this.returnMessage, setSubnetNetworkAclResponse.returnMessage) &&
				Objects.equals(this.totalRows, setSubnetNetworkAclResponse.totalRows) &&
				Objects.equals(this.networkAclList, setSubnetNetworkAclResponse.networkAclList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, networkAclList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SetSubnetNetworkAclResponse {\n");
		
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

