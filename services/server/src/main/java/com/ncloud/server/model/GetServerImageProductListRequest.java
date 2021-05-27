/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * OpenAPI spec version: 2021-03-04T10:39:42Z
 *
 * 
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
 * GetServerImageProductListRequest
 */
public class GetServerImageProductListRequest {
	private String exclusionProductCode = null;

	private String productCode = null;

	private List<String> platformTypeCodeList = null;

	private Integer blockStorageSize = null;

	private String regionNo = null;

	private String infraResourceDetailTypeCode = null;

	private String responseFormatType = null;

	public GetServerImageProductListRequest exclusionProductCode(String exclusionProductCode) {
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

	public GetServerImageProductListRequest productCode(String productCode) {
		this.productCode = productCode;
		return this;
	}

	 /**
	 * 조회할상품코드
	 * @return productCode
	**/
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public GetServerImageProductListRequest platformTypeCodeList(List<String> platformTypeCodeList) {
		this.platformTypeCodeList = platformTypeCodeList;
		return this;
	}

	public GetServerImageProductListRequest addPlatformTypeCodeListItem(String platformTypeCodeListItem) {
		if (this.platformTypeCodeList == null) {
			this.platformTypeCodeList = new ArrayList<String>();
		}
		this.platformTypeCodeList.add(platformTypeCodeListItem);
		return this;
	}

	 /**
	 * 플랫폼유형코드리스트
	 * @return platformTypeCodeList
	**/
	public List<String> getPlatformTypeCodeList() {
		return platformTypeCodeList;
	}

	public void setPlatformTypeCodeList(List<String> platformTypeCodeList) {
		this.platformTypeCodeList = platformTypeCodeList;
	}

	public GetServerImageProductListRequest blockStorageSize(Integer blockStorageSize) {
		this.blockStorageSize = blockStorageSize;
		return this;
	}

	 /**
	 * 블록스토리지사이즈
	 * @return blockStorageSize
	**/
	public Integer getBlockStorageSize() {
		return blockStorageSize;
	}

	public void setBlockStorageSize(Integer blockStorageSize) {
		this.blockStorageSize = blockStorageSize;
	}

	public GetServerImageProductListRequest regionNo(String regionNo) {
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

	public GetServerImageProductListRequest infraResourceDetailTypeCode(String infraResourceDetailTypeCode) {
		this.infraResourceDetailTypeCode = infraResourceDetailTypeCode;
		return this;
	}

	 /**
	 * 인프라자원상세구분코드
	 * @return infraResourceDetailTypeCode
	**/
	public String getInfraResourceDetailTypeCode() {
		return infraResourceDetailTypeCode;
	}

	public void setInfraResourceDetailTypeCode(String infraResourceDetailTypeCode) {
		this.infraResourceDetailTypeCode = infraResourceDetailTypeCode;
	}

	public GetServerImageProductListRequest responseFormatType(String responseFormatType) {
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
		GetServerImageProductListRequest getServerImageProductListRequest = (GetServerImageProductListRequest) o;
		return Objects.equals(this.exclusionProductCode, getServerImageProductListRequest.exclusionProductCode) &&
				Objects.equals(this.productCode, getServerImageProductListRequest.productCode) &&
				Objects.equals(this.platformTypeCodeList, getServerImageProductListRequest.platformTypeCodeList) &&
				Objects.equals(this.blockStorageSize, getServerImageProductListRequest.blockStorageSize) &&
				Objects.equals(this.regionNo, getServerImageProductListRequest.regionNo) &&
				Objects.equals(this.infraResourceDetailTypeCode, getServerImageProductListRequest.infraResourceDetailTypeCode) &&
				Objects.equals(this.responseFormatType, getServerImageProductListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(exclusionProductCode, productCode, platformTypeCodeList, blockStorageSize, regionNo, infraResourceDetailTypeCode, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetServerImageProductListRequest {\n");
		
		sb.append("		exclusionProductCode: ").append(toIndentedString(exclusionProductCode)).append("\n");
		sb.append("		productCode: ").append(toIndentedString(productCode)).append("\n");
		sb.append("		platformTypeCodeList: ").append(toIndentedString(platformTypeCodeList)).append("\n");
		sb.append("		blockStorageSize: ").append(toIndentedString(blockStorageSize)).append("\n");
		sb.append("		regionNo: ").append(toIndentedString(regionNo)).append("\n");
		sb.append("		infraResourceDetailTypeCode: ").append(toIndentedString(infraResourceDetailTypeCode)).append("\n");
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

