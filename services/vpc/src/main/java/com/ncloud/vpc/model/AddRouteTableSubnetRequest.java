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
 * AddRouteTableSubnetRequest
 */
public class AddRouteTableSubnetRequest {
	private String regionCode = null;

	private String routeTableNo = null;

	private List<String> subnetNoList = new ArrayList<String>();

	private String vpcNo = null;

	private String responseFormatType = null;

	public AddRouteTableSubnetRequest regionCode(String regionCode) {
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

	public AddRouteTableSubnetRequest routeTableNo(String routeTableNo) {
		this.routeTableNo = routeTableNo;
		return this;
	}

	 /**
	 * 라우트테이블번호
	 * @return routeTableNo
	**/
	public String getRouteTableNo() {
		return routeTableNo;
	}

	public void setRouteTableNo(String routeTableNo) {
		this.routeTableNo = routeTableNo;
	}

	public AddRouteTableSubnetRequest subnetNoList(List<String> subnetNoList) {
		this.subnetNoList = subnetNoList;
		return this;
	}

	public AddRouteTableSubnetRequest addSubnetNoListItem(String subnetNoListItem) {
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

	public AddRouteTableSubnetRequest vpcNo(String vpcNo) {
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

	public AddRouteTableSubnetRequest responseFormatType(String responseFormatType) {
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
		AddRouteTableSubnetRequest addRouteTableSubnetRequest = (AddRouteTableSubnetRequest) o;
		return Objects.equals(this.regionCode, addRouteTableSubnetRequest.regionCode) &&
				Objects.equals(this.routeTableNo, addRouteTableSubnetRequest.routeTableNo) &&
				Objects.equals(this.subnetNoList, addRouteTableSubnetRequest.subnetNoList) &&
				Objects.equals(this.vpcNo, addRouteTableSubnetRequest.vpcNo) &&
				Objects.equals(this.responseFormatType, addRouteTableSubnetRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, routeTableNo, subnetNoList, vpcNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AddRouteTableSubnetRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		routeTableNo: ").append(toIndentedString(routeTableNo)).append("\n");
		sb.append("		subnetNoList: ").append(toIndentedString(subnetNoList)).append("\n");
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

