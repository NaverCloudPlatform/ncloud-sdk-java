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
 * GetMemberServerImageListRequest
 */
public class GetMemberServerImageListRequest {
	private List<String> memberServerImageNoList = null;

	private List<String> platformTypeCodeList = null;

	private Integer pageNo = null;

	private Integer pageSize = null;

	private String regionNo = null;

	private String sortedBy = null;

	private String sortingOrder = null;

	private String responseFormatType = null;

	public GetMemberServerImageListRequest memberServerImageNoList(List<String> memberServerImageNoList) {
		this.memberServerImageNoList = memberServerImageNoList;
		return this;
	}

	public GetMemberServerImageListRequest addMemberServerImageNoListItem(String memberServerImageNoListItem) {
		if (this.memberServerImageNoList == null) {
			this.memberServerImageNoList = new ArrayList<String>();
		}
		this.memberServerImageNoList.add(memberServerImageNoListItem);
		return this;
	}

	 /**
	 * 회원서버이미지번호리스트
	 * @return memberServerImageNoList
	**/
	public List<String> getMemberServerImageNoList() {
		return memberServerImageNoList;
	}

	public void setMemberServerImageNoList(List<String> memberServerImageNoList) {
		this.memberServerImageNoList = memberServerImageNoList;
	}

	public GetMemberServerImageListRequest platformTypeCodeList(List<String> platformTypeCodeList) {
		this.platformTypeCodeList = platformTypeCodeList;
		return this;
	}

	public GetMemberServerImageListRequest addPlatformTypeCodeListItem(String platformTypeCodeListItem) {
		if (this.platformTypeCodeList == null) {
			this.platformTypeCodeList = new ArrayList<String>();
		}
		this.platformTypeCodeList.add(platformTypeCodeListItem);
		return this;
	}

	 /**
	 * 플랫폼타입코드리스트
	 * @return platformTypeCodeList
	**/
	public List<String> getPlatformTypeCodeList() {
		return platformTypeCodeList;
	}

	public void setPlatformTypeCodeList(List<String> platformTypeCodeList) {
		this.platformTypeCodeList = platformTypeCodeList;
	}

	public GetMemberServerImageListRequest pageNo(Integer pageNo) {
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

	public GetMemberServerImageListRequest pageSize(Integer pageSize) {
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

	public GetMemberServerImageListRequest regionNo(String regionNo) {
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

	public GetMemberServerImageListRequest sortedBy(String sortedBy) {
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

	public GetMemberServerImageListRequest sortingOrder(String sortingOrder) {
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

	public GetMemberServerImageListRequest responseFormatType(String responseFormatType) {
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
		GetMemberServerImageListRequest getMemberServerImageListRequest = (GetMemberServerImageListRequest) o;
		return Objects.equals(this.memberServerImageNoList, getMemberServerImageListRequest.memberServerImageNoList) &&
				Objects.equals(this.platformTypeCodeList, getMemberServerImageListRequest.platformTypeCodeList) &&
				Objects.equals(this.pageNo, getMemberServerImageListRequest.pageNo) &&
				Objects.equals(this.pageSize, getMemberServerImageListRequest.pageSize) &&
				Objects.equals(this.regionNo, getMemberServerImageListRequest.regionNo) &&
				Objects.equals(this.sortedBy, getMemberServerImageListRequest.sortedBy) &&
				Objects.equals(this.sortingOrder, getMemberServerImageListRequest.sortingOrder) &&
				Objects.equals(this.responseFormatType, getMemberServerImageListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(memberServerImageNoList, platformTypeCodeList, pageNo, pageSize, regionNo, sortedBy, sortingOrder, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetMemberServerImageListRequest {\n");
		
		sb.append("		memberServerImageNoList: ").append(toIndentedString(memberServerImageNoList)).append("\n");
		sb.append("		platformTypeCodeList: ").append(toIndentedString(platformTypeCodeList)).append("\n");
		sb.append("		pageNo: ").append(toIndentedString(pageNo)).append("\n");
		sb.append("		pageSize: ").append(toIndentedString(pageSize)).append("\n");
		sb.append("		regionNo: ").append(toIndentedString(regionNo)).append("\n");
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

