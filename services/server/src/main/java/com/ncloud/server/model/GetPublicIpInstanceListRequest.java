/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.server.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * GetPublicIpInstanceListRequest
 */
public class GetPublicIpInstanceListRequest {
	private Boolean isAssociated = null;

	private List<String> publicIpInstanceNoList = null;

	private List<String> publicIpList = null;

	private String searchFilterName = null;

	private String searchFilterValue = null;

	private String internetLineTypeCode = null;

	private String regionNo = null;

	private String zoneNo = null;

	private Integer pageNo = null;

	private Integer pageSize = null;

	private String sortedBy = null;

	private String sortingOrder = null;

	private String responseFormatType = null;

	public GetPublicIpInstanceListRequest isAssociated(Boolean isAssociated) {
		this.isAssociated = isAssociated;
		return this;
	}

	 /**
	 * 할당여부
	 * @return isAssociated
	**/
	public Boolean isIsAssociated() {
		return isAssociated;
	}

	public void setIsAssociated(Boolean isAssociated) {
		this.isAssociated = isAssociated;
	}

	public GetPublicIpInstanceListRequest publicIpInstanceNoList(List<String> publicIpInstanceNoList) {
		this.publicIpInstanceNoList = publicIpInstanceNoList;
		return this;
	}

	public GetPublicIpInstanceListRequest addPublicIpInstanceNoListItem(String publicIpInstanceNoListItem) {
		if (this.publicIpInstanceNoList == null) {
			this.publicIpInstanceNoList = new ArrayList<String>();
		}
		this.publicIpInstanceNoList.add(publicIpInstanceNoListItem);
		return this;
	}

	 /**
	 * 공인IP인스턴스번호리스트
	 * @return publicIpInstanceNoList
	**/
	public List<String> getPublicIpInstanceNoList() {
		return publicIpInstanceNoList;
	}

	public void setPublicIpInstanceNoList(List<String> publicIpInstanceNoList) {
		this.publicIpInstanceNoList = publicIpInstanceNoList;
	}

	public GetPublicIpInstanceListRequest publicIpList(List<String> publicIpList) {
		this.publicIpList = publicIpList;
		return this;
	}

	public GetPublicIpInstanceListRequest addPublicIpListItem(String publicIpListItem) {
		if (this.publicIpList == null) {
			this.publicIpList = new ArrayList<String>();
		}
		this.publicIpList.add(publicIpListItem);
		return this;
	}

	 /**
	 * 공인IP리스트
	 * @return publicIpList
	**/
	public List<String> getPublicIpList() {
		return publicIpList;
	}

	public void setPublicIpList(List<String> publicIpList) {
		this.publicIpList = publicIpList;
	}

	public GetPublicIpInstanceListRequest searchFilterName(String searchFilterName) {
		this.searchFilterName = searchFilterName;
		return this;
	}

	 /**
	 * 검색할필터명
	 * @return searchFilterName
	**/
	public String getSearchFilterName() {
		return searchFilterName;
	}

	public void setSearchFilterName(String searchFilterName) {
		this.searchFilterName = searchFilterName;
	}

	public GetPublicIpInstanceListRequest searchFilterValue(String searchFilterValue) {
		this.searchFilterValue = searchFilterValue;
		return this;
	}

	 /**
	 * 검색할필터값
	 * @return searchFilterValue
	**/
	public String getSearchFilterValue() {
		return searchFilterValue;
	}

	public void setSearchFilterValue(String searchFilterValue) {
		this.searchFilterValue = searchFilterValue;
	}

	public GetPublicIpInstanceListRequest internetLineTypeCode(String internetLineTypeCode) {
		this.internetLineTypeCode = internetLineTypeCode;
		return this;
	}

	 /**
	 * 인터넷라인구분코드
	 * @return internetLineTypeCode
	**/
	public String getInternetLineTypeCode() {
		return internetLineTypeCode;
	}

	public void setInternetLineTypeCode(String internetLineTypeCode) {
		this.internetLineTypeCode = internetLineTypeCode;
	}

	public GetPublicIpInstanceListRequest regionNo(String regionNo) {
		this.regionNo = regionNo;
		return this;
	}

	 /**
	 * 리전번호
	 * @return regionNo
	**/
	public String getRegionNo() {
		return regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
	}

	public GetPublicIpInstanceListRequest zoneNo(String zoneNo) {
		this.zoneNo = zoneNo;
		return this;
	}

	 /**
	 * ZONE번호
	 * @return zoneNo
	**/
	public String getZoneNo() {
		return zoneNo;
	}

	public void setZoneNo(String zoneNo) {
		this.zoneNo = zoneNo;
	}

	public GetPublicIpInstanceListRequest pageNo(Integer pageNo) {
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

	public GetPublicIpInstanceListRequest pageSize(Integer pageSize) {
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

	public GetPublicIpInstanceListRequest sortedBy(String sortedBy) {
		this.sortedBy = sortedBy;
		return this;
	}

	 /**
	 * 소팅대상
	 * @return sortedBy
	**/
	public String getSortedBy() {
		return sortedBy;
	}

	public void setSortedBy(String sortedBy) {
		this.sortedBy = sortedBy;
	}

	public GetPublicIpInstanceListRequest sortingOrder(String sortingOrder) {
		this.sortingOrder = sortingOrder;
		return this;
	}

	 /**
	 * 소팅순서
	 * @return sortingOrder
	**/
	public String getSortingOrder() {
		return sortingOrder;
	}

	public void setSortingOrder(String sortingOrder) {
		this.sortingOrder = sortingOrder;
	}

	public GetPublicIpInstanceListRequest responseFormatType(String responseFormatType) {
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
		GetPublicIpInstanceListRequest getPublicIpInstanceListRequest = (GetPublicIpInstanceListRequest) o;
		return Objects.equals(this.isAssociated, getPublicIpInstanceListRequest.isAssociated) &&
				Objects.equals(this.publicIpInstanceNoList, getPublicIpInstanceListRequest.publicIpInstanceNoList) &&
				Objects.equals(this.publicIpList, getPublicIpInstanceListRequest.publicIpList) &&
				Objects.equals(this.searchFilterName, getPublicIpInstanceListRequest.searchFilterName) &&
				Objects.equals(this.searchFilterValue, getPublicIpInstanceListRequest.searchFilterValue) &&
				Objects.equals(this.internetLineTypeCode, getPublicIpInstanceListRequest.internetLineTypeCode) &&
				Objects.equals(this.regionNo, getPublicIpInstanceListRequest.regionNo) &&
				Objects.equals(this.zoneNo, getPublicIpInstanceListRequest.zoneNo) &&
				Objects.equals(this.pageNo, getPublicIpInstanceListRequest.pageNo) &&
				Objects.equals(this.pageSize, getPublicIpInstanceListRequest.pageSize) &&
				Objects.equals(this.sortedBy, getPublicIpInstanceListRequest.sortedBy) &&
				Objects.equals(this.sortingOrder, getPublicIpInstanceListRequest.sortingOrder) &&
				Objects.equals(this.responseFormatType, getPublicIpInstanceListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(isAssociated, publicIpInstanceNoList, publicIpList, searchFilterName, searchFilterValue, internetLineTypeCode, regionNo, zoneNo, pageNo, pageSize, sortedBy, sortingOrder, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetPublicIpInstanceListRequest {\n");
		
		sb.append("		isAssociated: ").append(toIndentedString(isAssociated)).append("\n");
		sb.append("		publicIpInstanceNoList: ").append(toIndentedString(publicIpInstanceNoList)).append("\n");
		sb.append("		publicIpList: ").append(toIndentedString(publicIpList)).append("\n");
		sb.append("		searchFilterName: ").append(toIndentedString(searchFilterName)).append("\n");
		sb.append("		searchFilterValue: ").append(toIndentedString(searchFilterValue)).append("\n");
		sb.append("		internetLineTypeCode: ").append(toIndentedString(internetLineTypeCode)).append("\n");
		sb.append("		regionNo: ").append(toIndentedString(regionNo)).append("\n");
		sb.append("		zoneNo: ").append(toIndentedString(zoneNo)).append("\n");
		sb.append("		pageNo: ").append(toIndentedString(pageNo)).append("\n");
		sb.append("		pageSize: ").append(toIndentedString(pageSize)).append("\n");
		sb.append("		sortedBy: ").append(toIndentedString(sortedBy)).append("\n");
		sb.append("		sortingOrder: ").append(toIndentedString(sortingOrder)).append("\n");
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

