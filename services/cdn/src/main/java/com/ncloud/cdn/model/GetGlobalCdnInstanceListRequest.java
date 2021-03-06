/*
 * cdn
 * <br/>https://ncloud.apigw.ntruss.com/cdn/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.cdn.model;

import java.util.Objects;

/**
 * GetGlobalCdnInstanceListRequest
 */
public class GetGlobalCdnInstanceListRequest {
	private String cdnInstanceNo = null;

	private Integer pageNo = null;

	private Integer pageSize = null;

	private String responseFormatType = null;

	public GetGlobalCdnInstanceListRequest cdnInstanceNo(String cdnInstanceNo) {
		this.cdnInstanceNo = cdnInstanceNo;
		return this;
	}

	 /**
	 * CDN 인스턴스 번호
	 * @return cdnInstanceNo
	**/
	public String getCdnInstanceNo() {
		return cdnInstanceNo;
	}

	public void setCdnInstanceNo(String cdnInstanceNo) {
		this.cdnInstanceNo = cdnInstanceNo;
	}

	public GetGlobalCdnInstanceListRequest pageNo(Integer pageNo) {
		this.pageNo = pageNo;
		return this;
	}

	 /**
	 * 페이지 번호
	 * @return pageNo
	**/
	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public GetGlobalCdnInstanceListRequest pageSize(Integer pageSize) {
		this.pageSize = pageSize;
		return this;
	}

	 /**
	 * 페이지 사이즈
	 * @return pageSize
	**/
	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetGlobalCdnInstanceListRequest responseFormatType(String responseFormatType) {
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
		GetGlobalCdnInstanceListRequest getGlobalCdnInstanceListRequest = (GetGlobalCdnInstanceListRequest) o;
		return Objects.equals(this.cdnInstanceNo, getGlobalCdnInstanceListRequest.cdnInstanceNo) &&
				Objects.equals(this.pageNo, getGlobalCdnInstanceListRequest.pageNo) &&
				Objects.equals(this.pageSize, getGlobalCdnInstanceListRequest.pageSize) &&
				Objects.equals(this.responseFormatType, getGlobalCdnInstanceListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cdnInstanceNo, pageNo, pageSize, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetGlobalCdnInstanceListRequest {\n");
		
		sb.append("		cdnInstanceNo: ").append(toIndentedString(cdnInstanceNo)).append("\n");
		sb.append("		pageNo: ").append(toIndentedString(pageNo)).append("\n");
		sb.append("		pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

