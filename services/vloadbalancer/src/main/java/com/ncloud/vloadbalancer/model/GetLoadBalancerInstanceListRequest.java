/*
 * vloadbalancer
 * VPC Load Balancer 관련 API<br/>https://ncloud.apigw.ntruss.com/vloadbalancer/v2
 *
 * OpenAPI spec version: 2020-12-22T09:19:59Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vloadbalancer.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * GetLoadBalancerInstanceListRequest
 */
public class GetLoadBalancerInstanceListRequest {
	private String regionCode = null;

	private List<String> loadBalancerInstanceNoList = null;

	private String loadBalancerNetworkTypeCode = null;

	private String loadBalancerTypeCode = null;

	private Integer pageNo = null;

	private Integer pageSize = null;

	private String sortList = null;

	private String vpcNo = null;

	private String responseFormatType = null;

	public GetLoadBalancerInstanceListRequest regionCode(String regionCode) {
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

	public GetLoadBalancerInstanceListRequest loadBalancerInstanceNoList(List<String> loadBalancerInstanceNoList) {
		this.loadBalancerInstanceNoList = loadBalancerInstanceNoList;
		return this;
	}

	public GetLoadBalancerInstanceListRequest addLoadBalancerInstanceNoListItem(String loadBalancerInstanceNoListItem) {
		if (this.loadBalancerInstanceNoList == null) {
			this.loadBalancerInstanceNoList = new ArrayList<String>();
		}
		this.loadBalancerInstanceNoList.add(loadBalancerInstanceNoListItem);
		return this;
	}

	 /**
	 * 로드밸런서인스턴스번호리스트
	 * @return loadBalancerInstanceNoList
	**/
	public List<String> getLoadBalancerInstanceNoList() {
		return loadBalancerInstanceNoList;
	}

	public void setLoadBalancerInstanceNoList(List<String> loadBalancerInstanceNoList) {
		this.loadBalancerInstanceNoList = loadBalancerInstanceNoList;
	}

	public GetLoadBalancerInstanceListRequest loadBalancerNetworkTypeCode(String loadBalancerNetworkTypeCode) {
		this.loadBalancerNetworkTypeCode = loadBalancerNetworkTypeCode;
		return this;
	}

	 /**
	 * 로드밸런서네트워크유형코드
	 * @return loadBalancerNetworkTypeCode
	**/
	public String getLoadBalancerNetworkTypeCode() {
		return loadBalancerNetworkTypeCode;
	}

	public void setLoadBalancerNetworkTypeCode(String loadBalancerNetworkTypeCode) {
		this.loadBalancerNetworkTypeCode = loadBalancerNetworkTypeCode;
	}

	public GetLoadBalancerInstanceListRequest loadBalancerTypeCode(String loadBalancerTypeCode) {
		this.loadBalancerTypeCode = loadBalancerTypeCode;
		return this;
	}

	 /**
	 * 로드밸런서유형코드
	 * @return loadBalancerTypeCode
	**/
	public String getLoadBalancerTypeCode() {
		return loadBalancerTypeCode;
	}

	public void setLoadBalancerTypeCode(String loadBalancerTypeCode) {
		this.loadBalancerTypeCode = loadBalancerTypeCode;
	}

	public GetLoadBalancerInstanceListRequest pageNo(Integer pageNo) {
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

	public GetLoadBalancerInstanceListRequest pageSize(Integer pageSize) {
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

	public GetLoadBalancerInstanceListRequest sortList(String sortList) {
		this.sortList = sortList;
		return this;
	}

	 /**
	 * 정렬리스트
	 * @return sortList
	**/
	public String getSortList() {
		return sortList;
	}

	public void setSortList(String sortList) {
		this.sortList = sortList;
	}

	public GetLoadBalancerInstanceListRequest vpcNo(String vpcNo) {
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

	public GetLoadBalancerInstanceListRequest responseFormatType(String responseFormatType) {
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
		GetLoadBalancerInstanceListRequest getLoadBalancerInstanceListRequest = (GetLoadBalancerInstanceListRequest) o;
		return Objects.equals(this.regionCode, getLoadBalancerInstanceListRequest.regionCode) &&
				Objects.equals(this.loadBalancerInstanceNoList, getLoadBalancerInstanceListRequest.loadBalancerInstanceNoList) &&
				Objects.equals(this.loadBalancerNetworkTypeCode, getLoadBalancerInstanceListRequest.loadBalancerNetworkTypeCode) &&
				Objects.equals(this.loadBalancerTypeCode, getLoadBalancerInstanceListRequest.loadBalancerTypeCode) &&
				Objects.equals(this.pageNo, getLoadBalancerInstanceListRequest.pageNo) &&
				Objects.equals(this.pageSize, getLoadBalancerInstanceListRequest.pageSize) &&
				Objects.equals(this.sortList, getLoadBalancerInstanceListRequest.sortList) &&
				Objects.equals(this.vpcNo, getLoadBalancerInstanceListRequest.vpcNo) &&
				Objects.equals(this.responseFormatType, getLoadBalancerInstanceListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, loadBalancerInstanceNoList, loadBalancerNetworkTypeCode, loadBalancerTypeCode, pageNo, pageSize, sortList, vpcNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetLoadBalancerInstanceListRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		loadBalancerInstanceNoList: ").append(toIndentedString(loadBalancerInstanceNoList)).append("\n");
		sb.append("		loadBalancerNetworkTypeCode: ").append(toIndentedString(loadBalancerNetworkTypeCode)).append("\n");
		sb.append("		loadBalancerTypeCode: ").append(toIndentedString(loadBalancerTypeCode)).append("\n");
		sb.append("		pageNo: ").append(toIndentedString(pageNo)).append("\n");
		sb.append("		pageSize: ").append(toIndentedString(pageSize)).append("\n");
		sb.append("		sortList: ").append(toIndentedString(sortList)).append("\n");
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

