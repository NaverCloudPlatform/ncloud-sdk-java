/*
 * vserver
 * VPC Compute 관련 API<br/>https://ncloud.apigw.ntruss.com/vserver/v2
 *
 * OpenAPI spec version: 2020-09-17T02:28:03Z
 *
 * 
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
 * GetInitScriptListRequest
 */
public class GetInitScriptListRequest {
	private String regionCode = null;

	private String osTypeCode = null;

	private Integer pageNo = null;

	private Integer pageSize = null;

	private String sortedBy = null;

	private String sortingOrder = null;

	private String initScriptName = null;

	private List<String> initScriptNoList = null;

	private String responseFormatType = null;

	public GetInitScriptListRequest regionCode(String regionCode) {
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

	public GetInitScriptListRequest osTypeCode(String osTypeCode) {
		this.osTypeCode = osTypeCode;
		return this;
	}

	 /**
	 * OS유형코드
	 * @return osTypeCode
	**/
	public String getOsTypeCode() {
		return osTypeCode;
	}

	public void setOsTypeCode(String osTypeCode) {
		this.osTypeCode = osTypeCode;
	}

	public GetInitScriptListRequest pageNo(Integer pageNo) {
		this.pageNo = pageNo;
		return this;
	}

	 /**
	 * 페이지번호
	 * @return pageNo
	**/
	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public GetInitScriptListRequest pageSize(Integer pageSize) {
		this.pageSize = pageSize;
		return this;
	}

	 /**
	 * 페이지사이즈
	 * @return pageSize
	**/
	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetInitScriptListRequest sortedBy(String sortedBy) {
		this.sortedBy = sortedBy;
		return this;
	}

	 /**
	 * 정렬대상
	 * @return sortedBy
	**/
	public String getSortedBy() {
		return sortedBy;
	}

	public void setSortedBy(String sortedBy) {
		this.sortedBy = sortedBy;
	}

	public GetInitScriptListRequest sortingOrder(String sortingOrder) {
		this.sortingOrder = sortingOrder;
		return this;
	}

	 /**
	 * 정렬순서
	 * @return sortingOrder
	**/
	public String getSortingOrder() {
		return sortingOrder;
	}

	public void setSortingOrder(String sortingOrder) {
		this.sortingOrder = sortingOrder;
	}

	public GetInitScriptListRequest initScriptName(String initScriptName) {
		this.initScriptName = initScriptName;
		return this;
	}

	 /**
	 * 초기화스크립트이름
	 * @return initScriptName
	**/
	public String getInitScriptName() {
		return initScriptName;
	}

	public void setInitScriptName(String initScriptName) {
		this.initScriptName = initScriptName;
	}

	public GetInitScriptListRequest initScriptNoList(List<String> initScriptNoList) {
		this.initScriptNoList = initScriptNoList;
		return this;
	}

	public GetInitScriptListRequest addInitScriptNoListItem(String initScriptNoListItem) {
		if (this.initScriptNoList == null) {
			this.initScriptNoList = new ArrayList<String>();
		}
		this.initScriptNoList.add(initScriptNoListItem);
		return this;
	}

	 /**
	 * 초기화스크립트번호리스트
	 * @return initScriptNoList
	**/
	public List<String> getInitScriptNoList() {
		return initScriptNoList;
	}

	public void setInitScriptNoList(List<String> initScriptNoList) {
		this.initScriptNoList = initScriptNoList;
	}

	public GetInitScriptListRequest responseFormatType(String responseFormatType) {
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
		GetInitScriptListRequest getInitScriptListRequest = (GetInitScriptListRequest) o;
		return Objects.equals(this.regionCode, getInitScriptListRequest.regionCode) &&
				Objects.equals(this.osTypeCode, getInitScriptListRequest.osTypeCode) &&
				Objects.equals(this.pageNo, getInitScriptListRequest.pageNo) &&
				Objects.equals(this.pageSize, getInitScriptListRequest.pageSize) &&
				Objects.equals(this.sortedBy, getInitScriptListRequest.sortedBy) &&
				Objects.equals(this.sortingOrder, getInitScriptListRequest.sortingOrder) &&
				Objects.equals(this.initScriptName, getInitScriptListRequest.initScriptName) &&
				Objects.equals(this.initScriptNoList, getInitScriptListRequest.initScriptNoList) &&
				Objects.equals(this.responseFormatType, getInitScriptListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, osTypeCode, pageNo, pageSize, sortedBy, sortingOrder, initScriptName, initScriptNoList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetInitScriptListRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		osTypeCode: ").append(toIndentedString(osTypeCode)).append("\n");
		sb.append("		pageNo: ").append(toIndentedString(pageNo)).append("\n");
		sb.append("		pageSize: ").append(toIndentedString(pageSize)).append("\n");
		sb.append("		sortedBy: ").append(toIndentedString(sortedBy)).append("\n");
		sb.append("		sortingOrder: ").append(toIndentedString(sortingOrder)).append("\n");
		sb.append("		initScriptName: ").append(toIndentedString(initScriptName)).append("\n");
		sb.append("		initScriptNoList: ").append(toIndentedString(initScriptNoList)).append("\n");
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
