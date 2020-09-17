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
 * GetPublicIpInstanceListRequest
 */
public class GetPublicIpInstanceListRequest {
	private String regionCode = null;

	private List<String> publicIpInstanceNoList = null;

	private String publicIp = null;

	private String privateIp = null;

	private Boolean isAssociated = null;

	private String serverName = null;

	private String publicIpInstanceStatusCode = null;

	private Integer pageNo = null;

	private Integer pageSize = null;

	private String vpcNo = null;

	private String responseFormatType = null;

	public GetPublicIpInstanceListRequest regionCode(String regionCode) {
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

	public GetPublicIpInstanceListRequest publicIp(String publicIp) {
		this.publicIp = publicIp;
		return this;
	}

	 /**
	 * 공인IP주소
	 * @return publicIp
	**/
	public String getPublicIp() {
		return publicIp;
	}

	public void setPublicIp(String publicIp) {
		this.publicIp = publicIp;
	}

	public GetPublicIpInstanceListRequest privateIp(String privateIp) {
		this.privateIp = privateIp;
		return this;
	}

	 /**
	 * 비공인IP주소
	 * @return privateIp
	**/
	public String getPrivateIp() {
		return privateIp;
	}

	public void setPrivateIp(String privateIp) {
		this.privateIp = privateIp;
	}

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

	public GetPublicIpInstanceListRequest serverName(String serverName) {
		this.serverName = serverName;
		return this;
	}

	 /**
	 * 서버이름
	 * @return serverName
	**/
	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public GetPublicIpInstanceListRequest publicIpInstanceStatusCode(String publicIpInstanceStatusCode) {
		this.publicIpInstanceStatusCode = publicIpInstanceStatusCode;
		return this;
	}

	 /**
	 * 공인IP인스턴스상태코드
	 * @return publicIpInstanceStatusCode
	**/
	public String getPublicIpInstanceStatusCode() {
		return publicIpInstanceStatusCode;
	}

	public void setPublicIpInstanceStatusCode(String publicIpInstanceStatusCode) {
		this.publicIpInstanceStatusCode = publicIpInstanceStatusCode;
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

	public GetPublicIpInstanceListRequest vpcNo(String vpcNo) {
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
		return Objects.equals(this.regionCode, getPublicIpInstanceListRequest.regionCode) &&
				Objects.equals(this.publicIpInstanceNoList, getPublicIpInstanceListRequest.publicIpInstanceNoList) &&
				Objects.equals(this.publicIp, getPublicIpInstanceListRequest.publicIp) &&
				Objects.equals(this.privateIp, getPublicIpInstanceListRequest.privateIp) &&
				Objects.equals(this.isAssociated, getPublicIpInstanceListRequest.isAssociated) &&
				Objects.equals(this.serverName, getPublicIpInstanceListRequest.serverName) &&
				Objects.equals(this.publicIpInstanceStatusCode, getPublicIpInstanceListRequest.publicIpInstanceStatusCode) &&
				Objects.equals(this.pageNo, getPublicIpInstanceListRequest.pageNo) &&
				Objects.equals(this.pageSize, getPublicIpInstanceListRequest.pageSize) &&
				Objects.equals(this.vpcNo, getPublicIpInstanceListRequest.vpcNo) &&
				Objects.equals(this.responseFormatType, getPublicIpInstanceListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, publicIpInstanceNoList, publicIp, privateIp, isAssociated, serverName, publicIpInstanceStatusCode, pageNo, pageSize, vpcNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetPublicIpInstanceListRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		publicIpInstanceNoList: ").append(toIndentedString(publicIpInstanceNoList)).append("\n");
		sb.append("		publicIp: ").append(toIndentedString(publicIp)).append("\n");
		sb.append("		privateIp: ").append(toIndentedString(privateIp)).append("\n");
		sb.append("		isAssociated: ").append(toIndentedString(isAssociated)).append("\n");
		sb.append("		serverName: ").append(toIndentedString(serverName)).append("\n");
		sb.append("		publicIpInstanceStatusCode: ").append(toIndentedString(publicIpInstanceStatusCode)).append("\n");
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
