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
 * BlockStorage
 */
public class BlockStorage {
	private Integer order = null;

	private String snapshotInstanceNo = null;

	private Integer blockStorageSize = null;

	private String blockStorageVolumeTypeCode = null;

	private Boolean emptyBlockStorage = null;

	private Boolean noBlockStorage = null;

	public BlockStorage order(Integer order) {
		this.order = order;
		return this;
	}

	 /**
	 * 스토리지 순서
	 * @return order
	**/
	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public BlockStorage snapshotInstanceNo(String snapshotInstanceNo) {
		this.snapshotInstanceNo = snapshotInstanceNo;
		return this;
	}

	 /**
	 * 스토리지 스냅샷 인스턴스 번호
	 * @return snapshotInstanceNo
	**/
	public String getSnapshotInstanceNo() {
		return snapshotInstanceNo;
	}

	public void setSnapshotInstanceNo(String snapshotInstanceNo) {
		this.snapshotInstanceNo = snapshotInstanceNo;
	}

	public BlockStorage blockStorageSize(Integer blockStorageSize) {
		this.blockStorageSize = blockStorageSize;
		return this;
	}

	 /**
	 * 스토리지 크기(GB)
	 * @return blockStorageSize
	**/
	public Integer getBlockStorageSize() {
		return blockStorageSize;
	}

	public void setBlockStorageSize(Integer blockStorageSize) {
		this.blockStorageSize = blockStorageSize;
	}

	public BlockStorage blockStorageVolumeTypeCode(String blockStorageVolumeTypeCode) {
		this.blockStorageVolumeTypeCode = blockStorageVolumeTypeCode;
		return this;
	}

	 /**
	 * 스토리지 타입
	 * @return blockStorageVolumeTypeCode
	**/
	public String getBlockStorageVolumeTypeCode() {
		return blockStorageVolumeTypeCode;
	}

	public void setBlockStorageVolumeTypeCode(String blockStorageVolumeTypeCode) {
		this.blockStorageVolumeTypeCode = blockStorageVolumeTypeCode;
	}

	public BlockStorage emptyBlockStorage(Boolean emptyBlockStorage) {
		this.emptyBlockStorage = emptyBlockStorage;
		return this;
	}

	 /**
	 * 신규 스토리지 생성 여부
	 * @return emptyBlockStorage
	**/
	public Boolean isEmptyBlockStorage() {
		return emptyBlockStorage;
	}

	public void setEmptyBlockStorage(Boolean emptyBlockStorage) {
		this.emptyBlockStorage = emptyBlockStorage;
	}

	public BlockStorage noBlockStorage(Boolean noBlockStorage) {
		this.noBlockStorage = noBlockStorage;
		return this;
	}

	 /**
	 * 기존 스토이지 삭제 여부
	 * @return noBlockStorage
	**/
	public Boolean isNoBlockStorage() {
		return noBlockStorage;
	}

	public void setNoBlockStorage(Boolean noBlockStorage) {
		this.noBlockStorage = noBlockStorage;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BlockStorage blockStorage = (BlockStorage) o;
		return Objects.equals(this.order, blockStorage.order) &&
				Objects.equals(this.snapshotInstanceNo, blockStorage.snapshotInstanceNo) &&
				Objects.equals(this.blockStorageSize, blockStorage.blockStorageSize) &&
				Objects.equals(this.blockStorageVolumeTypeCode, blockStorage.blockStorageVolumeTypeCode) &&
				Objects.equals(this.emptyBlockStorage, blockStorage.emptyBlockStorage) &&
				Objects.equals(this.noBlockStorage, blockStorage.noBlockStorage);
	}

	@Override
	public int hashCode() {
		return Objects.hash(order, snapshotInstanceNo, blockStorageSize, blockStorageVolumeTypeCode, emptyBlockStorage, noBlockStorage);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BlockStorage {\n");
		
		sb.append("		order: ").append(toIndentedString(order)).append("\n");
		sb.append("		snapshotInstanceNo: ").append(toIndentedString(snapshotInstanceNo)).append("\n");
		sb.append("		blockStorageSize: ").append(toIndentedString(blockStorageSize)).append("\n");
		sb.append("		blockStorageVolumeTypeCode: ").append(toIndentedString(blockStorageVolumeTypeCode)).append("\n");
		sb.append("		emptyBlockStorage: ").append(toIndentedString(emptyBlockStorage)).append("\n");
		sb.append("		noBlockStorage: ").append(toIndentedString(noBlockStorage)).append("\n");
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

