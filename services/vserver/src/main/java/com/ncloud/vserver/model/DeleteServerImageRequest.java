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
 * DeleteServerImageRequest
 */
public class DeleteServerImageRequest {
	private String regionCode = null;

	private String responseFormatType = null;

	private List<String> serverImageNoList = null;

	public DeleteServerImageRequest regionCode(String regionCode) {
		this.regionCode = regionCode;
		return this;
	}

	 /**
	 * REGION코드
	 * @return regionCode
	**/
	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public DeleteServerImageRequest responseFormatType(String responseFormatType) {
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

	public DeleteServerImageRequest serverImageNoList(List<String> serverImageNoList) {
		this.serverImageNoList = serverImageNoList;
		return this;
	}

	public DeleteServerImageRequest addServerImageNoListItem(String serverImageNoListItem) {
		if (this.serverImageNoList == null) {
			this.serverImageNoList = new ArrayList<String>();
		}
		this.serverImageNoList.add(serverImageNoListItem);
		return this;
	}

	 /**
	 * 서버이미지번호리스트
	 * @return serverImageNoList
	**/
	public List<String> getServerImageNoList() {
		return serverImageNoList;
	}

	public void setServerImageNoList(List<String> serverImageNoList) {
		this.serverImageNoList = serverImageNoList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeleteServerImageRequest deleteServerImageRequest = (DeleteServerImageRequest) o;
		return Objects.equals(this.regionCode, deleteServerImageRequest.regionCode) &&
				Objects.equals(this.responseFormatType, deleteServerImageRequest.responseFormatType) &&
				Objects.equals(this.serverImageNoList, deleteServerImageRequest.serverImageNoList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, responseFormatType, serverImageNoList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeleteServerImageRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		responseFormatType: ").append(toIndentedString(responseFormatType)).append("\n");
		sb.append("		serverImageNoList: ").append(toIndentedString(serverImageNoList)).append("\n");
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
