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
 * GetAccessControlGroupListRequest
 */
public class GetAccessControlGroupListRequest {
	private String regionCode = null;

	private List<String> accessControlGroupNoList = null;

	private String accessControlGroupName = null;

	private String accessControlGroupStatusCode = null;

	private Integer pageNo = null;

	private Integer pageSize = null;

	private String vpcNo = null;

	private String responseFormatType = null;

	public GetAccessControlGroupListRequest regionCode(String regionCode) {
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

	public GetAccessControlGroupListRequest accessControlGroupNoList(List<String> accessControlGroupNoList) {
		this.accessControlGroupNoList = accessControlGroupNoList;
		return this;
	}

	public GetAccessControlGroupListRequest addAccessControlGroupNoListItem(String accessControlGroupNoListItem) {
		if (this.accessControlGroupNoList == null) {
			this.accessControlGroupNoList = new ArrayList<String>();
		}
		this.accessControlGroupNoList.add(accessControlGroupNoListItem);
		return this;
	}

	 /**
	 * ACG번호리스트
	 * @return accessControlGroupNoList
	**/
	public List<String> getAccessControlGroupNoList() {
		return accessControlGroupNoList;
	}

	public void setAccessControlGroupNoList(List<String> accessControlGroupNoList) {
		this.accessControlGroupNoList = accessControlGroupNoList;
	}

	public GetAccessControlGroupListRequest accessControlGroupName(String accessControlGroupName) {
		this.accessControlGroupName = accessControlGroupName;
		return this;
	}

	 /**
	 * ACG이름
	 * @return accessControlGroupName
	**/
	public String getAccessControlGroupName() {
		return accessControlGroupName;
	}

	public void setAccessControlGroupName(String accessControlGroupName) {
		this.accessControlGroupName = accessControlGroupName;
	}

	public GetAccessControlGroupListRequest accessControlGroupStatusCode(String accessControlGroupStatusCode) {
		this.accessControlGroupStatusCode = accessControlGroupStatusCode;
		return this;
	}

	 /**
	 * ACG상태코드
	 * @return accessControlGroupStatusCode
	**/
	public String getAccessControlGroupStatusCode() {
		return accessControlGroupStatusCode;
	}

	public void setAccessControlGroupStatusCode(String accessControlGroupStatusCode) {
		this.accessControlGroupStatusCode = accessControlGroupStatusCode;
	}

	public GetAccessControlGroupListRequest pageNo(Integer pageNo) {
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

	public GetAccessControlGroupListRequest pageSize(Integer pageSize) {
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

	public GetAccessControlGroupListRequest vpcNo(String vpcNo) {
		this.vpcNo = vpcNo;
		return this;
	}

	 /**
	 * VPC번호
	 * @return vpcNo
	**/
	public String getVpcNo() {
		return vpcNo;
	}

	public void setVpcNo(String vpcNo) {
		this.vpcNo = vpcNo;
	}

	public GetAccessControlGroupListRequest responseFormatType(String responseFormatType) {
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
		GetAccessControlGroupListRequest getAccessControlGroupListRequest = (GetAccessControlGroupListRequest) o;
		return Objects.equals(this.regionCode, getAccessControlGroupListRequest.regionCode) &&
				Objects.equals(this.accessControlGroupNoList, getAccessControlGroupListRequest.accessControlGroupNoList) &&
				Objects.equals(this.accessControlGroupName, getAccessControlGroupListRequest.accessControlGroupName) &&
				Objects.equals(this.accessControlGroupStatusCode, getAccessControlGroupListRequest.accessControlGroupStatusCode) &&
				Objects.equals(this.pageNo, getAccessControlGroupListRequest.pageNo) &&
				Objects.equals(this.pageSize, getAccessControlGroupListRequest.pageSize) &&
				Objects.equals(this.vpcNo, getAccessControlGroupListRequest.vpcNo) &&
				Objects.equals(this.responseFormatType, getAccessControlGroupListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, accessControlGroupNoList, accessControlGroupName, accessControlGroupStatusCode, pageNo, pageSize, vpcNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetAccessControlGroupListRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		accessControlGroupNoList: ").append(toIndentedString(accessControlGroupNoList)).append("\n");
		sb.append("		accessControlGroupName: ").append(toIndentedString(accessControlGroupName)).append("\n");
		sb.append("		accessControlGroupStatusCode: ").append(toIndentedString(accessControlGroupStatusCode)).append("\n");
		sb.append("		pageNo: ").append(toIndentedString(pageNo)).append("\n");
		sb.append("		pageSize: ").append(toIndentedString(pageSize)).append("\n");
		sb.append("		vpcNo: ").append(toIndentedString(vpcNo)).append("\n");
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

