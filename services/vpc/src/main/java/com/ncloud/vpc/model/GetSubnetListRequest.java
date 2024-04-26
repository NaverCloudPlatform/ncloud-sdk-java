/*
 * vpc
 * VPC Network 관련 API<br/>https://ncloud.apigw.ntruss.com/vpc/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vpc.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * GetSubnetListRequest
 */
public class GetSubnetListRequest {
	private String regionCode = null;

	private List<String> subnetNoList = null;

	private String subnetName = null;

	private String subnet = null;

	private String subnetTypeCode = null;

	private String usageTypeCode = null;

	private String networkAclNo = null;

	private Integer pageNo = null;

	private Integer pageSize = null;

	private String subnetStatusCode = null;

	private String vpcNo = null;

	private String zoneCode = null;

	private String responseFormatType = null;

	public GetSubnetListRequest regionCode(String regionCode) {
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

	public GetSubnetListRequest subnetNoList(List<String> subnetNoList) {
		this.subnetNoList = subnetNoList;
		return this;
	}

	public GetSubnetListRequest addSubnetNoListItem(String subnetNoListItem) {
		if (this.subnetNoList == null) {
			this.subnetNoList = new ArrayList<String>();
		}
		this.subnetNoList.add(subnetNoListItem);
		return this;
	}

	 /**
	 * 서브넷번호리스트
	 * @return subnetNoList
	**/
	public List<String> getSubnetNoList() {
		return subnetNoList;
	}

	public void setSubnetNoList(List<String> subnetNoList) {
		this.subnetNoList = subnetNoList;
	}

	public GetSubnetListRequest subnetName(String subnetName) {
		this.subnetName = subnetName;
		return this;
	}

	 /**
	 * 서브넷이름
	 * @return subnetName
	**/
	public String getSubnetName() {
		return subnetName;
	}

	public void setSubnetName(String subnetName) {
		this.subnetName = subnetName;
	}

	public GetSubnetListRequest subnet(String subnet) {
		this.subnet = subnet;
		return this;
	}

	 /**
	 * 서브넷
	 * @return subnet
	**/
	public String getSubnet() {
		return subnet;
	}

	public void setSubnet(String subnet) {
		this.subnet = subnet;
	}

	public GetSubnetListRequest subnetTypeCode(String subnetTypeCode) {
		this.subnetTypeCode = subnetTypeCode;
		return this;
	}

	 /**
	 * 서브넷유형코드
	 * @return subnetTypeCode
	**/
	public String getSubnetTypeCode() {
		return subnetTypeCode;
	}

	public void setSubnetTypeCode(String subnetTypeCode) {
		this.subnetTypeCode = subnetTypeCode;
	}

	public GetSubnetListRequest usageTypeCode(String usageTypeCode) {
		this.usageTypeCode = usageTypeCode;
		return this;
	}

	 /**
	 * 용도유형코드
	 * @return usageTypeCode
	**/
	public String getUsageTypeCode() {
		return usageTypeCode;
	}

	public void setUsageTypeCode(String usageTypeCode) {
		this.usageTypeCode = usageTypeCode;
	}

	public GetSubnetListRequest networkAclNo(String networkAclNo) {
		this.networkAclNo = networkAclNo;
		return this;
	}

	 /**
	 * 네트워크ACL번호
	 * @return networkAclNo
	**/
	public String getNetworkAclNo() {
		return networkAclNo;
	}

	public void setNetworkAclNo(String networkAclNo) {
		this.networkAclNo = networkAclNo;
	}

	public GetSubnetListRequest pageNo(Integer pageNo) {
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

	public GetSubnetListRequest pageSize(Integer pageSize) {
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

	public GetSubnetListRequest subnetStatusCode(String subnetStatusCode) {
		this.subnetStatusCode = subnetStatusCode;
		return this;
	}

	 /**
	 * 서브넷상태코드
	 * @return subnetStatusCode
	**/
	public String getSubnetStatusCode() {
		return subnetStatusCode;
	}

	public void setSubnetStatusCode(String subnetStatusCode) {
		this.subnetStatusCode = subnetStatusCode;
	}

	public GetSubnetListRequest vpcNo(String vpcNo) {
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

	public GetSubnetListRequest zoneCode(String zoneCode) {
		this.zoneCode = zoneCode;
		return this;
	}

	 /**
	 * ZONE코드
	 * @return zoneCode
	**/
	public String getZoneCode() {
		return zoneCode;
	}

	public void setZoneCode(String zoneCode) {
		this.zoneCode = zoneCode;
	}

	public GetSubnetListRequest responseFormatType(String responseFormatType) {
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
		GetSubnetListRequest getSubnetListRequest = (GetSubnetListRequest) o;
		return Objects.equals(this.regionCode, getSubnetListRequest.regionCode) &&
				Objects.equals(this.subnetNoList, getSubnetListRequest.subnetNoList) &&
				Objects.equals(this.subnetName, getSubnetListRequest.subnetName) &&
				Objects.equals(this.subnet, getSubnetListRequest.subnet) &&
				Objects.equals(this.subnetTypeCode, getSubnetListRequest.subnetTypeCode) &&
				Objects.equals(this.usageTypeCode, getSubnetListRequest.usageTypeCode) &&
				Objects.equals(this.networkAclNo, getSubnetListRequest.networkAclNo) &&
				Objects.equals(this.pageNo, getSubnetListRequest.pageNo) &&
				Objects.equals(this.pageSize, getSubnetListRequest.pageSize) &&
				Objects.equals(this.subnetStatusCode, getSubnetListRequest.subnetStatusCode) &&
				Objects.equals(this.vpcNo, getSubnetListRequest.vpcNo) &&
				Objects.equals(this.zoneCode, getSubnetListRequest.zoneCode) &&
				Objects.equals(this.responseFormatType, getSubnetListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, subnetNoList, subnetName, subnet, subnetTypeCode, usageTypeCode, networkAclNo, pageNo, pageSize, subnetStatusCode, vpcNo, zoneCode, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetSubnetListRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		subnetNoList: ").append(toIndentedString(subnetNoList)).append("\n");
		sb.append("		subnetName: ").append(toIndentedString(subnetName)).append("\n");
		sb.append("		subnet: ").append(toIndentedString(subnet)).append("\n");
		sb.append("		subnetTypeCode: ").append(toIndentedString(subnetTypeCode)).append("\n");
		sb.append("		usageTypeCode: ").append(toIndentedString(usageTypeCode)).append("\n");
		sb.append("		networkAclNo: ").append(toIndentedString(networkAclNo)).append("\n");
		sb.append("		pageNo: ").append(toIndentedString(pageNo)).append("\n");
		sb.append("		pageSize: ").append(toIndentedString(pageSize)).append("\n");
		sb.append("		subnetStatusCode: ").append(toIndentedString(subnetStatusCode)).append("\n");
		sb.append("		vpcNo: ").append(toIndentedString(vpcNo)).append("\n");
		sb.append("		zoneCode: ").append(toIndentedString(zoneCode)).append("\n");
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

