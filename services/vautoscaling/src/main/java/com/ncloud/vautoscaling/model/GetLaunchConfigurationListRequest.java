/*
 * vautoscaling
 * VPC Auto Scaling 관련 API<br/>https://ncloud.apigw.ntruss.com/vautoscaling/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vautoscaling.model;

import java.util.Objects;
import com.ncloud.vautoscaling.model.Sort;
import java.util.ArrayList;
import java.util.List;

/**
 * GetLaunchConfigurationListRequest
 */
public class GetLaunchConfigurationListRequest {
	private String regionCode = null;

	private List<String> launchConfigurationNoList = null;

	private List<String> launchConfigurationNameList = null;

	private Integer pageNo = null;

	private Integer pageSize = null;

	private List<Sort> sortList = null;

	private String responseFormatType = null;

	public GetLaunchConfigurationListRequest regionCode(String regionCode) {
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

	public GetLaunchConfigurationListRequest launchConfigurationNoList(List<String> launchConfigurationNoList) {
		this.launchConfigurationNoList = launchConfigurationNoList;
		return this;
	}

	public GetLaunchConfigurationListRequest addLaunchConfigurationNoListItem(String launchConfigurationNoListItem) {
		if (this.launchConfigurationNoList == null) {
			this.launchConfigurationNoList = new ArrayList<String>();
		}
		this.launchConfigurationNoList.add(launchConfigurationNoListItem);
		return this;
	}

	 /**
	 * 론치설정번호리스트
	 * @return launchConfigurationNoList
	**/
	public List<String> getLaunchConfigurationNoList() {
		return launchConfigurationNoList;
	}

	public void setLaunchConfigurationNoList(List<String> launchConfigurationNoList) {
		this.launchConfigurationNoList = launchConfigurationNoList;
	}

	public GetLaunchConfigurationListRequest launchConfigurationNameList(List<String> launchConfigurationNameList) {
		this.launchConfigurationNameList = launchConfigurationNameList;
		return this;
	}

	public GetLaunchConfigurationListRequest addLaunchConfigurationNameListItem(String launchConfigurationNameListItem) {
		if (this.launchConfigurationNameList == null) {
			this.launchConfigurationNameList = new ArrayList<String>();
		}
		this.launchConfigurationNameList.add(launchConfigurationNameListItem);
		return this;
	}

	 /**
	 * 론치설정이름리스트
	 * @return launchConfigurationNameList
	**/
	public List<String> getLaunchConfigurationNameList() {
		return launchConfigurationNameList;
	}

	public void setLaunchConfigurationNameList(List<String> launchConfigurationNameList) {
		this.launchConfigurationNameList = launchConfigurationNameList;
	}

	public GetLaunchConfigurationListRequest pageNo(Integer pageNo) {
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

	public GetLaunchConfigurationListRequest pageSize(Integer pageSize) {
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

	public GetLaunchConfigurationListRequest sortList(List<Sort> sortList) {
		this.sortList = sortList;
		return this;
	}

	public GetLaunchConfigurationListRequest addSortListItem(Sort sortListItem) {
		if (this.sortList == null) {
			this.sortList = new ArrayList<Sort>();
		}
		this.sortList.add(sortListItem);
		return this;
	}

	 /**
	 * 정렬리스트
	 * @return sortList
	**/
	public List<Sort> getSortList() {
		return sortList;
	}

	public void setSortList(List<Sort> sortList) {
		this.sortList = sortList;
	}

	public GetLaunchConfigurationListRequest responseFormatType(String responseFormatType) {
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
		GetLaunchConfigurationListRequest getLaunchConfigurationListRequest = (GetLaunchConfigurationListRequest) o;
		return Objects.equals(this.regionCode, getLaunchConfigurationListRequest.regionCode) &&
				Objects.equals(this.launchConfigurationNoList, getLaunchConfigurationListRequest.launchConfigurationNoList) &&
				Objects.equals(this.launchConfigurationNameList, getLaunchConfigurationListRequest.launchConfigurationNameList) &&
				Objects.equals(this.pageNo, getLaunchConfigurationListRequest.pageNo) &&
				Objects.equals(this.pageSize, getLaunchConfigurationListRequest.pageSize) &&
				Objects.equals(this.sortList, getLaunchConfigurationListRequest.sortList) &&
				Objects.equals(this.responseFormatType, getLaunchConfigurationListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, launchConfigurationNoList, launchConfigurationNameList, pageNo, pageSize, sortList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetLaunchConfigurationListRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		launchConfigurationNoList: ").append(toIndentedString(launchConfigurationNoList)).append("\n");
		sb.append("		launchConfigurationNameList: ").append(toIndentedString(launchConfigurationNameList)).append("\n");
		sb.append("		pageNo: ").append(toIndentedString(pageNo)).append("\n");
		sb.append("		pageSize: ").append(toIndentedString(pageSize)).append("\n");
		sb.append("		sortList: ").append(toIndentedString(sortList)).append("\n");
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

