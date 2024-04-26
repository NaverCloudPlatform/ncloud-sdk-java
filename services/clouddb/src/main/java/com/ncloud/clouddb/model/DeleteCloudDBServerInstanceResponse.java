/*
 * clouddb
 * Cloud DB<br/>https://ncloud.apigw.ntruss.com/clouddb/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.clouddb.model;

import java.util.Objects;
import com.ncloud.clouddb.model.CloudDBInstance;
import java.util.ArrayList;
import java.util.List;

/**
 * DeleteCloudDBServerInstanceResponse
 */
public class DeleteCloudDBServerInstanceResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<CloudDBInstance> cloudDBInstanceList = null;

	public DeleteCloudDBServerInstanceResponse requestId(String requestId) {
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

	public DeleteCloudDBServerInstanceResponse returnCode(String returnCode) {
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

	public DeleteCloudDBServerInstanceResponse returnMessage(String returnMessage) {
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

	public DeleteCloudDBServerInstanceResponse totalRows(Integer totalRows) {
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

	public DeleteCloudDBServerInstanceResponse cloudDBInstanceList(List<CloudDBInstance> cloudDBInstanceList) {
		this.cloudDBInstanceList = cloudDBInstanceList;
		return this;
	}

	public DeleteCloudDBServerInstanceResponse addCloudDBInstanceListItem(CloudDBInstance cloudDBInstanceListItem) {
		if (this.cloudDBInstanceList == null) {
			this.cloudDBInstanceList = new ArrayList<CloudDBInstance>();
		}
		this.cloudDBInstanceList.add(cloudDBInstanceListItem);
		return this;
	}

	 /**
	 * Get cloudDBInstanceList
	 * @return cloudDBInstanceList
	**/
	public List<CloudDBInstance> getCloudDBInstanceList() {
		return cloudDBInstanceList;
	}

	public void setCloudDBInstanceList(List<CloudDBInstance> cloudDBInstanceList) {
		this.cloudDBInstanceList = cloudDBInstanceList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeleteCloudDBServerInstanceResponse deleteCloudDBServerInstanceResponse = (DeleteCloudDBServerInstanceResponse) o;
		return Objects.equals(this.requestId, deleteCloudDBServerInstanceResponse.requestId) &&
				Objects.equals(this.returnCode, deleteCloudDBServerInstanceResponse.returnCode) &&
				Objects.equals(this.returnMessage, deleteCloudDBServerInstanceResponse.returnMessage) &&
				Objects.equals(this.totalRows, deleteCloudDBServerInstanceResponse.totalRows) &&
				Objects.equals(this.cloudDBInstanceList, deleteCloudDBServerInstanceResponse.cloudDBInstanceList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, cloudDBInstanceList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeleteCloudDBServerInstanceResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		cloudDBInstanceList: ").append(toIndentedString(cloudDBInstanceList)).append("\n");
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

