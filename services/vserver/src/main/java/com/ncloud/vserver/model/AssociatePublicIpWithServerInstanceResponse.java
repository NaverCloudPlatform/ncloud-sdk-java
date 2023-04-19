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
import com.ncloud.vserver.model.PublicIpInstance;
import java.util.ArrayList;
import java.util.List;

/**
 * AssociatePublicIpWithServerInstanceResponse
 */
public class AssociatePublicIpWithServerInstanceResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<PublicIpInstance> publicIpInstanceList = null;

	public AssociatePublicIpWithServerInstanceResponse requestId(String requestId) {
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

	public AssociatePublicIpWithServerInstanceResponse returnCode(String returnCode) {
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

	public AssociatePublicIpWithServerInstanceResponse returnMessage(String returnMessage) {
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

	public AssociatePublicIpWithServerInstanceResponse totalRows(Integer totalRows) {
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

	public AssociatePublicIpWithServerInstanceResponse publicIpInstanceList(List<PublicIpInstance> publicIpInstanceList) {
		this.publicIpInstanceList = publicIpInstanceList;
		return this;
	}

	public AssociatePublicIpWithServerInstanceResponse addPublicIpInstanceListItem(PublicIpInstance publicIpInstanceListItem) {
		if (this.publicIpInstanceList == null) {
			this.publicIpInstanceList = new ArrayList<PublicIpInstance>();
		}
		this.publicIpInstanceList.add(publicIpInstanceListItem);
		return this;
	}

	 /**
	 * Get publicIpInstanceList
	 * @return publicIpInstanceList
	**/
	public List<PublicIpInstance> getPublicIpInstanceList() {
		return publicIpInstanceList;
	}

	public void setPublicIpInstanceList(List<PublicIpInstance> publicIpInstanceList) {
		this.publicIpInstanceList = publicIpInstanceList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AssociatePublicIpWithServerInstanceResponse associatePublicIpWithServerInstanceResponse = (AssociatePublicIpWithServerInstanceResponse) o;
		return Objects.equals(this.requestId, associatePublicIpWithServerInstanceResponse.requestId) &&
				Objects.equals(this.returnCode, associatePublicIpWithServerInstanceResponse.returnCode) &&
				Objects.equals(this.returnMessage, associatePublicIpWithServerInstanceResponse.returnMessage) &&
				Objects.equals(this.totalRows, associatePublicIpWithServerInstanceResponse.totalRows) &&
				Objects.equals(this.publicIpInstanceList, associatePublicIpWithServerInstanceResponse.publicIpInstanceList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, publicIpInstanceList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AssociatePublicIpWithServerInstanceResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		publicIpInstanceList: ").append(toIndentedString(publicIpInstanceList)).append("\n");
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

