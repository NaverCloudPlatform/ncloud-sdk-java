/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * OpenAPI spec version: 2021-03-04T10:39:42Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.server.model;

import java.util.Objects;
import com.ncloud.server.model.InstanceTagParameter;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateInstanceTagsRequest
 */
public class CreateInstanceTagsRequest {
	private List<String> instanceNoList = new ArrayList<String>();

	private List<InstanceTagParameter> instanceTagList = new ArrayList<InstanceTagParameter>();

	private String responseFormatType = null;

	public CreateInstanceTagsRequest instanceNoList(List<String> instanceNoList) {
		this.instanceNoList = instanceNoList;
		return this;
	}

	public CreateInstanceTagsRequest addInstanceNoListItem(String instanceNoListItem) {
		this.instanceNoList.add(instanceNoListItem);
		return this;
	}

	 /**
	 * 인스턴스번호리스트
	 * @return instanceNoList
	**/
	public List<String> getInstanceNoList() {
		return instanceNoList;
	}

	public void setInstanceNoList(List<String> instanceNoList) {
		this.instanceNoList = instanceNoList;
	}

	public CreateInstanceTagsRequest instanceTagList(List<InstanceTagParameter> instanceTagList) {
		this.instanceTagList = instanceTagList;
		return this;
	}

	public CreateInstanceTagsRequest addInstanceTagListItem(InstanceTagParameter instanceTagListItem) {
		this.instanceTagList.add(instanceTagListItem);
		return this;
	}

	 /**
	 * 인스턴스태그리스트
	 * @return instanceTagList
	**/
	public List<InstanceTagParameter> getInstanceTagList() {
		return instanceTagList;
	}

	public void setInstanceTagList(List<InstanceTagParameter> instanceTagList) {
		this.instanceTagList = instanceTagList;
	}

	public CreateInstanceTagsRequest responseFormatType(String responseFormatType) {
		this.responseFormatType = responseFormatType;
		return this;
	}

	 /**
	 * responseFormatType {json, xml}
	 * @return responseFormatType
	**/
	public String getResponseFormatType() {
		return responseFormatType;
	}

	public void setResponseFormatType(String responseFormatType) {
		this.responseFormatType = responseFormatType;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CreateInstanceTagsRequest createInstanceTagsRequest = (CreateInstanceTagsRequest) o;
		return Objects.equals(this.instanceNoList, createInstanceTagsRequest.instanceNoList) &&
				Objects.equals(this.instanceTagList, createInstanceTagsRequest.instanceTagList) &&
				Objects.equals(this.responseFormatType, createInstanceTagsRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(instanceNoList, instanceTagList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateInstanceTagsRequest {\n");
		
		sb.append("		instanceNoList: ").append(toIndentedString(instanceNoList)).append("\n");
		sb.append("		instanceTagList: ").append(toIndentedString(instanceTagList)).append("\n");
		sb.append("		responseFormatType: ").append(toIndentedString(responseFormatType)).append("\n");
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

