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
 * CreateBlockStorageInstanceRequest
 */
public class CreateBlockStorageInstanceRequest {
	private String regionCode = null;

	private String blockStorageName = null;

	private Integer blockStorageSize = null;

	private String blockStorageDiskDetailTypeCode = null;

	private String blockStorageDescription = null;

	private String serverInstanceNo = null;

	private String blockStorageSnapshotInstanceNo = null;

	private String zoneCode = null;

	private Boolean isReturnProtection = null;

	private String responseFormatType = null;

	public CreateBlockStorageInstanceRequest regionCode(String regionCode) {
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

	public CreateBlockStorageInstanceRequest blockStorageName(String blockStorageName) {
		this.blockStorageName = blockStorageName;
		return this;
	}

	 /**
	 * 블록스토리지이름
	 * @return blockStorageName
	**/
	public String getBlockStorageName() {
		return blockStorageName;
	}

	public void setBlockStorageName(String blockStorageName) {
		this.blockStorageName = blockStorageName;
	}

	public CreateBlockStorageInstanceRequest blockStorageSize(Integer blockStorageSize) {
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

	public CreateBlockStorageInstanceRequest blockStorageDiskDetailTypeCode(String blockStorageDiskDetailTypeCode) {
		this.blockStorageDiskDetailTypeCode = blockStorageDiskDetailTypeCode;
		return this;
	}

	 /**
	 * 블록스토리지디스크상세유형코드
	 * @return blockStorageDiskDetailTypeCode
	**/
	public String getBlockStorageDiskDetailTypeCode() {
		return blockStorageDiskDetailTypeCode;
	}

	public void setBlockStorageDiskDetailTypeCode(String blockStorageDiskDetailTypeCode) {
		this.blockStorageDiskDetailTypeCode = blockStorageDiskDetailTypeCode;
	}

	public CreateBlockStorageInstanceRequest blockStorageDescription(String blockStorageDescription) {
		this.blockStorageDescription = blockStorageDescription;
		return this;
	}

	 /**
	 * 블록스토리지설명
	 * @return blockStorageDescription
	**/
	public String getBlockStorageDescription() {
		return blockStorageDescription;
	}

	public void setBlockStorageDescription(String blockStorageDescription) {
		this.blockStorageDescription = blockStorageDescription;
	}

	public CreateBlockStorageInstanceRequest serverInstanceNo(String serverInstanceNo) {
		this.serverInstanceNo = serverInstanceNo;
		return this;
	}

	 /**
	 * 서버인스턴스번호
	 * @return serverInstanceNo
	**/
	public String getServerInstanceNo() {
		return serverInstanceNo;
	}

	public void setServerInstanceNo(String serverInstanceNo) {
		this.serverInstanceNo = serverInstanceNo;
	}

	public CreateBlockStorageInstanceRequest blockStorageSnapshotInstanceNo(String blockStorageSnapshotInstanceNo) {
		this.blockStorageSnapshotInstanceNo = blockStorageSnapshotInstanceNo;
		return this;
	}

	 /**
	 * 블록스토리지스냅샷인스턴스번호
	 * @return blockStorageSnapshotInstanceNo
	**/
	public String getBlockStorageSnapshotInstanceNo() {
		return blockStorageSnapshotInstanceNo;
	}

	public void setBlockStorageSnapshotInstanceNo(String blockStorageSnapshotInstanceNo) {
		this.blockStorageSnapshotInstanceNo = blockStorageSnapshotInstanceNo;
	}

	public CreateBlockStorageInstanceRequest zoneCode(String zoneCode) {
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

	public CreateBlockStorageInstanceRequest isReturnProtection(Boolean isReturnProtection) {
		this.isReturnProtection = isReturnProtection;
		return this;
	}

	 /**
	 * 반납보호여부
	 * @return isReturnProtection
	**/
	public Boolean isIsReturnProtection() {
		return isReturnProtection;
	}

	public void setIsReturnProtection(Boolean isReturnProtection) {
		this.isReturnProtection = isReturnProtection;
	}

	public CreateBlockStorageInstanceRequest responseFormatType(String responseFormatType) {
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
		CreateBlockStorageInstanceRequest createBlockStorageInstanceRequest = (CreateBlockStorageInstanceRequest) o;
		return Objects.equals(this.regionCode, createBlockStorageInstanceRequest.regionCode) &&
				Objects.equals(this.blockStorageName, createBlockStorageInstanceRequest.blockStorageName) &&
				Objects.equals(this.blockStorageSize, createBlockStorageInstanceRequest.blockStorageSize) &&
				Objects.equals(this.blockStorageDiskDetailTypeCode, createBlockStorageInstanceRequest.blockStorageDiskDetailTypeCode) &&
				Objects.equals(this.blockStorageDescription, createBlockStorageInstanceRequest.blockStorageDescription) &&
				Objects.equals(this.serverInstanceNo, createBlockStorageInstanceRequest.serverInstanceNo) &&
				Objects.equals(this.blockStorageSnapshotInstanceNo, createBlockStorageInstanceRequest.blockStorageSnapshotInstanceNo) &&
				Objects.equals(this.zoneCode, createBlockStorageInstanceRequest.zoneCode) &&
				Objects.equals(this.isReturnProtection, createBlockStorageInstanceRequest.isReturnProtection) &&
				Objects.equals(this.responseFormatType, createBlockStorageInstanceRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, blockStorageName, blockStorageSize, blockStorageDiskDetailTypeCode, blockStorageDescription, serverInstanceNo, blockStorageSnapshotInstanceNo, zoneCode, isReturnProtection, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateBlockStorageInstanceRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		blockStorageName: ").append(toIndentedString(blockStorageName)).append("\n");
		sb.append("		blockStorageSize: ").append(toIndentedString(blockStorageSize)).append("\n");
		sb.append("		blockStorageDiskDetailTypeCode: ").append(toIndentedString(blockStorageDiskDetailTypeCode)).append("\n");
		sb.append("		blockStorageDescription: ").append(toIndentedString(blockStorageDescription)).append("\n");
		sb.append("		serverInstanceNo: ").append(toIndentedString(serverInstanceNo)).append("\n");
		sb.append("		blockStorageSnapshotInstanceNo: ").append(toIndentedString(blockStorageSnapshotInstanceNo)).append("\n");
		sb.append("		zoneCode: ").append(toIndentedString(zoneCode)).append("\n");
		sb.append("		isReturnProtection: ").append(toIndentedString(isReturnProtection)).append("\n");
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

