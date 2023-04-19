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
 * GetBlockStorageInstanceDetailRequest
 */
public class GetBlockStorageInstanceDetailRequest {
	private String regionCode = null;

	private String blockStorageInstanceNo = null;

	private String responseFormatType = null;

	public GetBlockStorageInstanceDetailRequest regionCode(String regionCode) {
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

	public GetBlockStorageInstanceDetailRequest blockStorageInstanceNo(String blockStorageInstanceNo) {
		this.blockStorageInstanceNo = blockStorageInstanceNo;
		return this;
	}

	 /**
	 * 블록스토리지인스턴스번호
	 * @return blockStorageInstanceNo
	**/
	public String getBlockStorageInstanceNo() {
		return blockStorageInstanceNo;
	}

	public void setBlockStorageInstanceNo(String blockStorageInstanceNo) {
		this.blockStorageInstanceNo = blockStorageInstanceNo;
	}

	public GetBlockStorageInstanceDetailRequest responseFormatType(String responseFormatType) {
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
		GetBlockStorageInstanceDetailRequest getBlockStorageInstanceDetailRequest = (GetBlockStorageInstanceDetailRequest) o;
		return Objects.equals(this.regionCode, getBlockStorageInstanceDetailRequest.regionCode) &&
				Objects.equals(this.blockStorageInstanceNo, getBlockStorageInstanceDetailRequest.blockStorageInstanceNo) &&
				Objects.equals(this.responseFormatType, getBlockStorageInstanceDetailRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, blockStorageInstanceNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetBlockStorageInstanceDetailRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		blockStorageInstanceNo: ").append(toIndentedString(blockStorageInstanceNo)).append("\n");
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

