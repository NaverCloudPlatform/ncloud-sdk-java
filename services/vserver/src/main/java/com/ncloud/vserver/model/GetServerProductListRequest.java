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

/**
 * GetServerProductListRequest
 */
public class GetServerProductListRequest {
	private String regionCode = null;

	private String zoneCode = null;

	private String serverImageProductCode = null;

	private String exclusionProductCode = null;

	private String productCode = null;

	private String generationCode = null;

	private String memberServerImageInstanceNo = null;

	private String responseFormatType = null;

	public GetServerProductListRequest regionCode(String regionCode) {
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

	public GetServerProductListRequest zoneCode(String zoneCode) {
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

	public GetServerProductListRequest serverImageProductCode(String serverImageProductCode) {
		this.serverImageProductCode = serverImageProductCode;
		return this;
	}

	 /**
	 * 서버이미지상품코드
	 * @return serverImageProductCode
	**/
	public String getServerImageProductCode() {
		return serverImageProductCode;
	}

	public void setServerImageProductCode(String serverImageProductCode) {
		this.serverImageProductCode = serverImageProductCode;
	}

	public GetServerProductListRequest exclusionProductCode(String exclusionProductCode) {
		this.exclusionProductCode = exclusionProductCode;
		return this;
	}

	 /**
	 * 제외할상품코드
	 * @return exclusionProductCode
	**/
	public String getExclusionProductCode() {
		return exclusionProductCode;
	}

	public void setExclusionProductCode(String exclusionProductCode) {
		this.exclusionProductCode = exclusionProductCode;
	}

	public GetServerProductListRequest productCode(String productCode) {
		this.productCode = productCode;
		return this;
	}

	 /**
	 * 상품코드
	 * @return productCode
	**/
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public GetServerProductListRequest generationCode(String generationCode) {
		this.generationCode = generationCode;
		return this;
	}

	 /**
	 * 세대코드
	 * @return generationCode
	**/
	public String getGenerationCode() {
		return generationCode;
	}

	public void setGenerationCode(String generationCode) {
		this.generationCode = generationCode;
	}

	public GetServerProductListRequest memberServerImageInstanceNo(String memberServerImageInstanceNo) {
		this.memberServerImageInstanceNo = memberServerImageInstanceNo;
		return this;
	}

	 /**
	 * 회원서버이미지인스턴스번호
	 * @return memberServerImageInstanceNo
	**/
	public String getMemberServerImageInstanceNo() {
		return memberServerImageInstanceNo;
	}

	public void setMemberServerImageInstanceNo(String memberServerImageInstanceNo) {
		this.memberServerImageInstanceNo = memberServerImageInstanceNo;
	}

	public GetServerProductListRequest responseFormatType(String responseFormatType) {
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
		GetServerProductListRequest getServerProductListRequest = (GetServerProductListRequest) o;
		return Objects.equals(this.regionCode, getServerProductListRequest.regionCode) &&
				Objects.equals(this.zoneCode, getServerProductListRequest.zoneCode) &&
				Objects.equals(this.serverImageProductCode, getServerProductListRequest.serverImageProductCode) &&
				Objects.equals(this.exclusionProductCode, getServerProductListRequest.exclusionProductCode) &&
				Objects.equals(this.productCode, getServerProductListRequest.productCode) &&
				Objects.equals(this.generationCode, getServerProductListRequest.generationCode) &&
				Objects.equals(this.memberServerImageInstanceNo, getServerProductListRequest.memberServerImageInstanceNo) &&
				Objects.equals(this.responseFormatType, getServerProductListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, zoneCode, serverImageProductCode, exclusionProductCode, productCode, generationCode, memberServerImageInstanceNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetServerProductListRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		zoneCode: ").append(toIndentedString(zoneCode)).append("\n");
		sb.append("		serverImageProductCode: ").append(toIndentedString(serverImageProductCode)).append("\n");
		sb.append("		exclusionProductCode: ").append(toIndentedString(exclusionProductCode)).append("\n");
		sb.append("		productCode: ").append(toIndentedString(productCode)).append("\n");
		sb.append("		generationCode: ").append(toIndentedString(generationCode)).append("\n");
		sb.append("		memberServerImageInstanceNo: ").append(toIndentedString(memberServerImageInstanceNo)).append("\n");
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

