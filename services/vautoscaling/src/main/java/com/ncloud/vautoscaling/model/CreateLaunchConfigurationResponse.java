/*
 * vautoscaling
 * VPC Auto Scaling 관련 API<br/>https://ncloud.apigw.ntruss.com/vautoscaling/v2
 *
 * OpenAPI spec version: 2021-01-21T11:15:08Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vautoscaling.model;

import java.util.Objects;
import com.ncloud.vautoscaling.model.LaunchConfiguration;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateLaunchConfigurationResponse
 */
public class CreateLaunchConfigurationResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<LaunchConfiguration> launchConfigurationList = null;

	public CreateLaunchConfigurationResponse requestId(String requestId) {
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

	public CreateLaunchConfigurationResponse returnCode(String returnCode) {
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

	public CreateLaunchConfigurationResponse returnMessage(String returnMessage) {
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

	public CreateLaunchConfigurationResponse totalRows(Integer totalRows) {
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

	public CreateLaunchConfigurationResponse launchConfigurationList(List<LaunchConfiguration> launchConfigurationList) {
		this.launchConfigurationList = launchConfigurationList;
		return this;
	}

	public CreateLaunchConfigurationResponse addLaunchConfigurationListItem(LaunchConfiguration launchConfigurationListItem) {
		if (this.launchConfigurationList == null) {
			this.launchConfigurationList = new ArrayList<LaunchConfiguration>();
		}
		this.launchConfigurationList.add(launchConfigurationListItem);
		return this;
	}

	 /**
	 * Get launchConfigurationList
	 * @return launchConfigurationList
	**/
	public List<LaunchConfiguration> getLaunchConfigurationList() {
		return launchConfigurationList;
	}

	public void setLaunchConfigurationList(List<LaunchConfiguration> launchConfigurationList) {
		this.launchConfigurationList = launchConfigurationList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CreateLaunchConfigurationResponse createLaunchConfigurationResponse = (CreateLaunchConfigurationResponse) o;
		return Objects.equals(this.requestId, createLaunchConfigurationResponse.requestId) &&
				Objects.equals(this.returnCode, createLaunchConfigurationResponse.returnCode) &&
				Objects.equals(this.returnMessage, createLaunchConfigurationResponse.returnMessage) &&
				Objects.equals(this.totalRows, createLaunchConfigurationResponse.totalRows) &&
				Objects.equals(this.launchConfigurationList, createLaunchConfigurationResponse.launchConfigurationList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, launchConfigurationList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateLaunchConfigurationResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		launchConfigurationList: ").append(toIndentedString(launchConfigurationList)).append("\n");
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

