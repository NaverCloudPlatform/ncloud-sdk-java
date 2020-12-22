/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * OpenAPI spec version: 2020-11-18T09:44:01Z
 *
 * 
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
 * GetBlockStorageInstanceListRequest
 */
public class GetBlockStorageInstanceListRequest {
	private String serverInstanceNo = null;

	private List<String> blockStorageInstanceNoList = null;

	private String searchFilterName = null;

	private String searchFilterValue = null;

	private List<String> blockStorageTypeCodeList = null;

	private Integer pageNo = null;

	private Integer pageSize = null;

	private String blockStorageInstanceStatusCode = null;

	private String diskTypeCode = null;

	private String diskDetailTypeCode = null;

	private String regionNo = null;

	private String zoneNo = null;

	private String sortedBy = null;

	private String sortingOrder = null;

	private String responseFormatType = null;

	public GetBlockStorageInstanceListRequest serverInstanceNo(String serverInstanceNo) {
		this.serverInstanceNo = serverInstanceNo;
		return this;
	}

	 /**
	 * 서버인스턴스번호
	 * @return serverInstanceNo
	**/
	public String getServerInstanceNo() {
		return serverInstanceNo;
	}

	public void setServerInstanceNo(String serverInstanceNo) {
		this.serverInstanceNo = serverInstanceNo;
	}

	public GetBlockStorageInstanceListRequest blockStorageInstanceNoList(List<String> blockStorageInstanceNoList) {
		this.blockStorageInstanceNoList = blockStorageInstanceNoList;
		return this;
	}

	public GetBlockStorageInstanceListRequest addBlockStorageInstanceNoListItem(String blockStorageInstanceNoListItem) {
		if (this.blockStorageInstanceNoList == null) {
			this.blockStorageInstanceNoList = new ArrayList<String>();
		}
		this.blockStorageInstanceNoList.add(blockStorageInstanceNoListItem);
		return this;
	}

	 /**
	 * 블록스토리지인스턴스번호리스트
	 * @return blockStorageInstanceNoList
	**/
	public List<String> getBlockStorageInstanceNoList() {
		return blockStorageInstanceNoList;
	}

	public void setBlockStorageInstanceNoList(List<String> blockStorageInstanceNoList) {
		this.blockStorageInstanceNoList = blockStorageInstanceNoList;
	}

	public GetBlockStorageInstanceListRequest searchFilterName(String searchFilterName) {
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

	public GetBlockStorageInstanceListRequest searchFilterValue(String searchFilterValue) {
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

	public GetBlockStorageInstanceListRequest blockStorageTypeCodeList(List<String> blockStorageTypeCodeList) {
		this.blockStorageTypeCodeList = blockStorageTypeCodeList;
		return this;
	}

	public GetBlockStorageInstanceListRequest addBlockStorageTypeCodeListItem(String blockStorageTypeCodeListItem) {
		if (this.blockStorageTypeCodeList == null) {
			this.blockStorageTypeCodeList = new ArrayList<String>();
		}
		this.blockStorageTypeCodeList.add(blockStorageTypeCodeListItem);
		return this;
	}

	 /**
	 * 블록스토리지구분코드리스트
	 * @return blockStorageTypeCodeList
	**/
	public List<String> getBlockStorageTypeCodeList() {
		return blockStorageTypeCodeList;
	}

	public void setBlockStorageTypeCodeList(List<String> blockStorageTypeCodeList) {
		this.blockStorageTypeCodeList = blockStorageTypeCodeList;
	}

	public GetBlockStorageInstanceListRequest pageNo(Integer pageNo) {
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

	public GetBlockStorageInstanceListRequest pageSize(Integer pageSize) {
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

	public GetBlockStorageInstanceListRequest blockStorageInstanceStatusCode(String blockStorageInstanceStatusCode) {
		this.blockStorageInstanceStatusCode = blockStorageInstanceStatusCode;
		return this;
	}

	 /**
	 * 블록스토리지인스턴스상태코드
	 * @return blockStorageInstanceStatusCode
	**/
	public String getBlockStorageInstanceStatusCode() {
		return blockStorageInstanceStatusCode;
	}

	public void setBlockStorageInstanceStatusCode(String blockStorageInstanceStatusCode) {
		this.blockStorageInstanceStatusCode = blockStorageInstanceStatusCode;
	}

	public GetBlockStorageInstanceListRequest diskTypeCode(String diskTypeCode) {
		this.diskTypeCode = diskTypeCode;
		return this;
	}

	 /**
	 * 디스크유형코드
	 * @return diskTypeCode
	**/
	public String getDiskTypeCode() {
		return diskTypeCode;
	}

	public void setDiskTypeCode(String diskTypeCode) {
		this.diskTypeCode = diskTypeCode;
	}

	public GetBlockStorageInstanceListRequest diskDetailTypeCode(String diskDetailTypeCode) {
		this.diskDetailTypeCode = diskDetailTypeCode;
		return this;
	}

	 /**
	 * 디스크유형상세코드
	 * @return diskDetailTypeCode
	**/
	public String getDiskDetailTypeCode() {
		return diskDetailTypeCode;
	}

	public void setDiskDetailTypeCode(String diskDetailTypeCode) {
		this.diskDetailTypeCode = diskDetailTypeCode;
	}

	public GetBlockStorageInstanceListRequest regionNo(String regionNo) {
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

	public GetBlockStorageInstanceListRequest zoneNo(String zoneNo) {
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

	public GetBlockStorageInstanceListRequest sortedBy(String sortedBy) {
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

	public GetBlockStorageInstanceListRequest sortingOrder(String sortingOrder) {
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

	public GetBlockStorageInstanceListRequest responseFormatType(String responseFormatType) {
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
		GetBlockStorageInstanceListRequest getBlockStorageInstanceListRequest = (GetBlockStorageInstanceListRequest) o;
		return Objects.equals(this.serverInstanceNo, getBlockStorageInstanceListRequest.serverInstanceNo) &&
				Objects.equals(this.blockStorageInstanceNoList, getBlockStorageInstanceListRequest.blockStorageInstanceNoList) &&
				Objects.equals(this.searchFilterName, getBlockStorageInstanceListRequest.searchFilterName) &&
				Objects.equals(this.searchFilterValue, getBlockStorageInstanceListRequest.searchFilterValue) &&
				Objects.equals(this.blockStorageTypeCodeList, getBlockStorageInstanceListRequest.blockStorageTypeCodeList) &&
				Objects.equals(this.pageNo, getBlockStorageInstanceListRequest.pageNo) &&
				Objects.equals(this.pageSize, getBlockStorageInstanceListRequest.pageSize) &&
				Objects.equals(this.blockStorageInstanceStatusCode, getBlockStorageInstanceListRequest.blockStorageInstanceStatusCode) &&
				Objects.equals(this.diskTypeCode, getBlockStorageInstanceListRequest.diskTypeCode) &&
				Objects.equals(this.diskDetailTypeCode, getBlockStorageInstanceListRequest.diskDetailTypeCode) &&
				Objects.equals(this.regionNo, getBlockStorageInstanceListRequest.regionNo) &&
				Objects.equals(this.zoneNo, getBlockStorageInstanceListRequest.zoneNo) &&
				Objects.equals(this.sortedBy, getBlockStorageInstanceListRequest.sortedBy) &&
				Objects.equals(this.sortingOrder, getBlockStorageInstanceListRequest.sortingOrder) &&
				Objects.equals(this.responseFormatType, getBlockStorageInstanceListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(serverInstanceNo, blockStorageInstanceNoList, searchFilterName, searchFilterValue, blockStorageTypeCodeList, pageNo, pageSize, blockStorageInstanceStatusCode, diskTypeCode, diskDetailTypeCode, regionNo, zoneNo, sortedBy, sortingOrder, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetBlockStorageInstanceListRequest {\n");
		
		sb.append("		serverInstanceNo: ").append(toIndentedString(serverInstanceNo)).append("\n");
		sb.append("		blockStorageInstanceNoList: ").append(toIndentedString(blockStorageInstanceNoList)).append("\n");
		sb.append("		searchFilterName: ").append(toIndentedString(searchFilterName)).append("\n");
		sb.append("		searchFilterValue: ").append(toIndentedString(searchFilterValue)).append("\n");
		sb.append("		blockStorageTypeCodeList: ").append(toIndentedString(blockStorageTypeCodeList)).append("\n");
		sb.append("		pageNo: ").append(toIndentedString(pageNo)).append("\n");
		sb.append("		pageSize: ").append(toIndentedString(pageSize)).append("\n");
		sb.append("		blockStorageInstanceStatusCode: ").append(toIndentedString(blockStorageInstanceStatusCode)).append("\n");
		sb.append("		diskTypeCode: ").append(toIndentedString(diskTypeCode)).append("\n");
		sb.append("		diskDetailTypeCode: ").append(toIndentedString(diskDetailTypeCode)).append("\n");
		sb.append("		regionNo: ").append(toIndentedString(regionNo)).append("\n");
		sb.append("		zoneNo: ").append(toIndentedString(zoneNo)).append("\n");
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

