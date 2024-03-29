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
import java.util.ArrayList;
import java.util.List;

/**
 * DeleteLoginKeysRequest
 */
public class DeleteLoginKeysRequest {
	private List<String> keyNameList = new ArrayList<String>();

	private String responseFormatType = null;

	public DeleteLoginKeysRequest keyNameList(List<String> keyNameList) {
		this.keyNameList = keyNameList;
		return this;
	}

	public DeleteLoginKeysRequest addKeyNameListItem(String keyNameListItem) {
		this.keyNameList.add(keyNameListItem);
		return this;
	}

	 /**
	 * 키이름리스트
	 * @return keyNameList
	**/
	public List<String> getKeyNameList() {
		return keyNameList;
	}

	public void setKeyNameList(List<String> keyNameList) {
		this.keyNameList = keyNameList;
	}

	public DeleteLoginKeysRequest responseFormatType(String responseFormatType) {
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
		DeleteLoginKeysRequest deleteLoginKeysRequest = (DeleteLoginKeysRequest) o;
		return Objects.equals(this.keyNameList, deleteLoginKeysRequest.keyNameList) &&
				Objects.equals(this.responseFormatType, deleteLoginKeysRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(keyNameList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeleteLoginKeysRequest {\n");
		
		sb.append("		keyNameList: ").append(toIndentedString(keyNameList)).append("\n");
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

