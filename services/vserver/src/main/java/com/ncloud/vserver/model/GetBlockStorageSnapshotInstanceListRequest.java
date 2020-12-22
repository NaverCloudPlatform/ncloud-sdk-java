/*
 * vserver
 * VPC Compute 관련 API<br/>https://ncloud.apigw.ntruss.com/vserver/v2
 *
 * OpenAPI spec version: 2020-11-18T09:44:20Z
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
 * GetBlockStorageSnapshotInstanceListRequest
 */
public class GetBlockStorageSnapshotInstanceListRequest {
	private String regionCode = null;

	private List<String> blockStorageSnapshotInstanceNoList = null;

	private List<String> originalBlockStorageInstanceNoList = null;

	private String blockStorageSnapshotInstanceStatusCode = null;

	private Integer pageNo = null;

	private Integer pageSize = null;

	private Long blockStorageSnapshotVolumeSize = null;

	private Boolean isEncryptedOriginalBlockStorageVolume = null;

	private String blockStorageSnapshotName = null;

	private String sortedBy = null;

	private String sortingOrder = null;

	private String responseFormatType = null;

	public GetBlockStorageSnapshotInstanceListRequest regionCode(String regionCode) {
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

	public GetBlockStorageSnapshotInstanceListRequest blockStorageSnapshotInstanceNoList(List<String> blockStorageSnapshotInstanceNoList) {
		this.blockStorageSnapshotInstanceNoList = blockStorageSnapshotInstanceNoList;
		return this;
	}

	public GetBlockStorageSnapshotInstanceListRequest addBlockStorageSnapshotInstanceNoListItem(String blockStorageSnapshotInstanceNoListItem) {
		if (this.blockStorageSnapshotInstanceNoList == null) {
			this.blockStorageSnapshotInstanceNoList = new ArrayList<String>();
		}
		this.blockStorageSnapshotInstanceNoList.add(blockStorageSnapshotInstanceNoListItem);
		return this;
	}

	 /**
	 * 블록스토리지스냅샷인스턴스번호리스트
	 * @return blockStorageSnapshotInstanceNoList
	**/
	public List<String> getBlockStorageSnapshotInstanceNoList() {
		return blockStorageSnapshotInstanceNoList;
	}

	public void setBlockStorageSnapshotInstanceNoList(List<String> blockStorageSnapshotInstanceNoList) {
		this.blockStorageSnapshotInstanceNoList = blockStorageSnapshotInstanceNoList;
	}

	public GetBlockStorageSnapshotInstanceListRequest originalBlockStorageInstanceNoList(List<String> originalBlockStorageInstanceNoList) {
		this.originalBlockStorageInstanceNoList = originalBlockStorageInstanceNoList;
		return this;
	}

	public GetBlockStorageSnapshotInstanceListRequest addOriginalBlockStorageInstanceNoListItem(String originalBlockStorageInstanceNoListItem) {
		if (this.originalBlockStorageInstanceNoList == null) {
			this.originalBlockStorageInstanceNoList = new ArrayList<String>();
		}
		this.originalBlockStorageInstanceNoList.add(originalBlockStorageInstanceNoListItem);
		return this;
	}

	 /**
	 * 원본블록스토리지인스턴스번호리스트
	 * @return originalBlockStorageInstanceNoList
	**/
	public List<String> getOriginalBlockStorageInstanceNoList() {
		return originalBlockStorageInstanceNoList;
	}

	public void setOriginalBlockStorageInstanceNoList(List<String> originalBlockStorageInstanceNoList) {
		this.originalBlockStorageInstanceNoList = originalBlockStorageInstanceNoList;
	}

	public GetBlockStorageSnapshotInstanceListRequest blockStorageSnapshotInstanceStatusCode(String blockStorageSnapshotInstanceStatusCode) {
		this.blockStorageSnapshotInstanceStatusCode = blockStorageSnapshotInstanceStatusCode;
		return this;
	}

	 /**
	 * 블록스토리지스냅샷인스턴스상태코드
	 * @return blockStorageSnapshotInstanceStatusCode
	**/
	public String getBlockStorageSnapshotInstanceStatusCode() {
		return blockStorageSnapshotInstanceStatusCode;
	}

	public void setBlockStorageSnapshotInstanceStatusCode(String blockStorageSnapshotInstanceStatusCode) {
		this.blockStorageSnapshotInstanceStatusCode = blockStorageSnapshotInstanceStatusCode;
	}

	public GetBlockStorageSnapshotInstanceListRequest pageNo(Integer pageNo) {
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

	public GetBlockStorageSnapshotInstanceListRequest pageSize(Integer pageSize) {
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

	public GetBlockStorageSnapshotInstanceListRequest blockStorageSnapshotVolumeSize(Long blockStorageSnapshotVolumeSize) {
		this.blockStorageSnapshotVolumeSize = blockStorageSnapshotVolumeSize;
		return this;
	}

	 /**
	 * 블록스토리지스냅샷볼륨사이즈
	 * @return blockStorageSnapshotVolumeSize
	**/
	public Long getBlockStorageSnapshotVolumeSize() {
		return blockStorageSnapshotVolumeSize;
	}

	public void setBlockStorageSnapshotVolumeSize(Long blockStorageSnapshotVolumeSize) {
		this.blockStorageSnapshotVolumeSize = blockStorageSnapshotVolumeSize;
	}

	public GetBlockStorageSnapshotInstanceListRequest isEncryptedOriginalBlockStorageVolume(Boolean isEncryptedOriginalBlockStorageVolume) {
		this.isEncryptedOriginalBlockStorageVolume = isEncryptedOriginalBlockStorageVolume;
		return this;
	}

	 /**
	 * 원본블록스토리지볼륨암호화여부
	 * @return isEncryptedOriginalBlockStorageVolume
	**/
	public Boolean isIsEncryptedOriginalBlockStorageVolume() {
		return isEncryptedOriginalBlockStorageVolume;
	}

	public void setIsEncryptedOriginalBlockStorageVolume(Boolean isEncryptedOriginalBlockStorageVolume) {
		this.isEncryptedOriginalBlockStorageVolume = isEncryptedOriginalBlockStorageVolume;
	}

	public GetBlockStorageSnapshotInstanceListRequest blockStorageSnapshotName(String blockStorageSnapshotName) {
		this.blockStorageSnapshotName = blockStorageSnapshotName;
		return this;
	}

	 /**
	 * 블록스토리지스냅샷이름
	 * @return blockStorageSnapshotName
	**/
	public String getBlockStorageSnapshotName() {
		return blockStorageSnapshotName;
	}

	public void setBlockStorageSnapshotName(String blockStorageSnapshotName) {
		this.blockStorageSnapshotName = blockStorageSnapshotName;
	}

	public GetBlockStorageSnapshotInstanceListRequest sortedBy(String sortedBy) {
		this.sortedBy = sortedBy;
		return this;
	}

	 /**
	 * 정렬대상
	 * @return sortedBy
	**/
	public String getSortedBy() {
		return sortedBy;
	}

	public void setSortedBy(String sortedBy) {
		this.sortedBy = sortedBy;
	}

	public GetBlockStorageSnapshotInstanceListRequest sortingOrder(String sortingOrder) {
		this.sortingOrder = sortingOrder;
		return this;
	}

	 /**
	 * 정렬순서
	 * @return sortingOrder
	**/
	public String getSortingOrder() {
		return sortingOrder;
	}

	public void setSortingOrder(String sortingOrder) {
		this.sortingOrder = sortingOrder;
	}

	public GetBlockStorageSnapshotInstanceListRequest responseFormatType(String responseFormatType) {
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
		GetBlockStorageSnapshotInstanceListRequest getBlockStorageSnapshotInstanceListRequest = (GetBlockStorageSnapshotInstanceListRequest) o;
		return Objects.equals(this.regionCode, getBlockStorageSnapshotInstanceListRequest.regionCode) &&
				Objects.equals(this.blockStorageSnapshotInstanceNoList, getBlockStorageSnapshotInstanceListRequest.blockStorageSnapshotInstanceNoList) &&
				Objects.equals(this.originalBlockStorageInstanceNoList, getBlockStorageSnapshotInstanceListRequest.originalBlockStorageInstanceNoList) &&
				Objects.equals(this.blockStorageSnapshotInstanceStatusCode, getBlockStorageSnapshotInstanceListRequest.blockStorageSnapshotInstanceStatusCode) &&
				Objects.equals(this.pageNo, getBlockStorageSnapshotInstanceListRequest.pageNo) &&
				Objects.equals(this.pageSize, getBlockStorageSnapshotInstanceListRequest.pageSize) &&
				Objects.equals(this.blockStorageSnapshotVolumeSize, getBlockStorageSnapshotInstanceListRequest.blockStorageSnapshotVolumeSize) &&
				Objects.equals(this.isEncryptedOriginalBlockStorageVolume, getBlockStorageSnapshotInstanceListRequest.isEncryptedOriginalBlockStorageVolume) &&
				Objects.equals(this.blockStorageSnapshotName, getBlockStorageSnapshotInstanceListRequest.blockStorageSnapshotName) &&
				Objects.equals(this.sortedBy, getBlockStorageSnapshotInstanceListRequest.sortedBy) &&
				Objects.equals(this.sortingOrder, getBlockStorageSnapshotInstanceListRequest.sortingOrder) &&
				Objects.equals(this.responseFormatType, getBlockStorageSnapshotInstanceListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, blockStorageSnapshotInstanceNoList, originalBlockStorageInstanceNoList, blockStorageSnapshotInstanceStatusCode, pageNo, pageSize, blockStorageSnapshotVolumeSize, isEncryptedOriginalBlockStorageVolume, blockStorageSnapshotName, sortedBy, sortingOrder, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetBlockStorageSnapshotInstanceListRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		blockStorageSnapshotInstanceNoList: ").append(toIndentedString(blockStorageSnapshotInstanceNoList)).append("\n");
		sb.append("		originalBlockStorageInstanceNoList: ").append(toIndentedString(originalBlockStorageInstanceNoList)).append("\n");
		sb.append("		blockStorageSnapshotInstanceStatusCode: ").append(toIndentedString(blockStorageSnapshotInstanceStatusCode)).append("\n");
		sb.append("		pageNo: ").append(toIndentedString(pageNo)).append("\n");
		sb.append("		pageSize: ").append(toIndentedString(pageSize)).append("\n");
		sb.append("		blockStorageSnapshotVolumeSize: ").append(toIndentedString(blockStorageSnapshotVolumeSize)).append("\n");
		sb.append("		isEncryptedOriginalBlockStorageVolume: ").append(toIndentedString(isEncryptedOriginalBlockStorageVolume)).append("\n");
		sb.append("		blockStorageSnapshotName: ").append(toIndentedString(blockStorageSnapshotName)).append("\n");
		sb.append("		sortedBy: ").append(toIndentedString(sortedBy)).append("\n");
		sb.append("		sortingOrder: ").append(toIndentedString(sortingOrder)).append("\n");
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

