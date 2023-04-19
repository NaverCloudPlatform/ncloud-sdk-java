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
import com.ncloud.vpc.model.RouteParameter;
import java.util.ArrayList;
import java.util.List;

/**
 * AddRouteRequest
 */
public class AddRouteRequest {
	private String regionCode = null;

	private List<RouteParameter> routeList = new ArrayList<RouteParameter>();

	private String routeTableNo = null;

	private String vpcNo = null;

	private String responseFormatType = null;

	public AddRouteRequest regionCode(String regionCode) {
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

	public AddRouteRequest routeList(List<RouteParameter> routeList) {
		this.routeList = routeList;
		return this;
	}

	public AddRouteRequest addRouteListItem(RouteParameter routeListItem) {
		this.routeList.add(routeListItem);
		return this;
	}

	 /**
	 * 라우트리스트
	 * @return routeList
	**/
	public List<RouteParameter> getRouteList() {
		return routeList;
	}

	public void setRouteList(List<RouteParameter> routeList) {
		this.routeList = routeList;
	}

	public AddRouteRequest routeTableNo(String routeTableNo) {
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

	public AddRouteRequest vpcNo(String vpcNo) {
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

	public AddRouteRequest responseFormatType(String responseFormatType) {
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
		AddRouteRequest addRouteRequest = (AddRouteRequest) o;
		return Objects.equals(this.regionCode, addRouteRequest.regionCode) &&
				Objects.equals(this.routeList, addRouteRequest.routeList) &&
				Objects.equals(this.routeTableNo, addRouteRequest.routeTableNo) &&
				Objects.equals(this.vpcNo, addRouteRequest.vpcNo) &&
				Objects.equals(this.responseFormatType, addRouteRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, routeList, routeTableNo, vpcNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AddRouteRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		routeList: ").append(toIndentedString(routeList)).append("\n");
		sb.append("		routeTableNo: ").append(toIndentedString(routeTableNo)).append("\n");
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

