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
import com.ncloud.vserver.model.CommonCode;
import java.util.ArrayList;
import java.util.List;

/**
 * BlockStorageVolumeType
 */
public class BlockStorageVolumeType {
	private List<String> zoneCodeList = null;

	private CommonCode blockStorageVolumeType = null;

	private CommonCode hypervisorType = null;

	private Integer minThroughput = null;

	private Integer maxThroughput = null;

	private Integer minIops = null;

	private Integer maxIops = null;

	private Integer minVolumeSize = null;

	private Integer maxVolumeSize = null;

	private Integer minBaseVolumeSize = null;

	private Integer maxBaseVolumeSize = null;

	private Boolean isAvailableBase = null;

	public BlockStorageVolumeType zoneCodeList(List<String> zoneCodeList) {
		this.zoneCodeList = zoneCodeList;
		return this;
	}

	public BlockStorageVolumeType addZoneCodeListItem(String zoneCodeListItem) {
		if (this.zoneCodeList == null) {
			this.zoneCodeList = new ArrayList<String>();
		}
		this.zoneCodeList.add(zoneCodeListItem);
		return this;
	}

	 /**
	 * ZONE코드리스트
	 * @return zoneCodeList
	**/
	public List<String> getZoneCodeList() {
		return zoneCodeList;
	}

	public void setZoneCodeList(List<String> zoneCodeList) {
		this.zoneCodeList = zoneCodeList;
	}

	public BlockStorageVolumeType blockStorageVolumeType(CommonCode blockStorageVolumeType) {
		this.blockStorageVolumeType = blockStorageVolumeType;
		return this;
	}

	 /**
	 * 블록스토리지볼륨타입
	 * @return blockStorageVolumeType
	**/
	public CommonCode getBlockStorageVolumeType() {
		return blockStorageVolumeType;
	}

	public void setBlockStorageVolumeType(CommonCode blockStorageVolumeType) {
		this.blockStorageVolumeType = blockStorageVolumeType;
	}

	public BlockStorageVolumeType hypervisorType(CommonCode hypervisorType) {
		this.hypervisorType = hypervisorType;
		return this;
	}

	 /**
	 * 하이퍼바이저타입
	 * @return hypervisorType
	**/
	public CommonCode getHypervisorType() {
		return hypervisorType;
	}

	public void setHypervisorType(CommonCode hypervisorType) {
		this.hypervisorType = hypervisorType;
	}

	public BlockStorageVolumeType minThroughput(Integer minThroughput) {
		this.minThroughput = minThroughput;
		return this;
	}

	 /**
	 * 블록스토리지 볼륨타입 최소 throughput
	 * @return minThroughput
	**/
	public Integer getMinThroughput() {
		return minThroughput;
	}

	public void setMinThroughput(Integer minThroughput) {
		this.minThroughput = minThroughput;
	}

	public BlockStorageVolumeType maxThroughput(Integer maxThroughput) {
		this.maxThroughput = maxThroughput;
		return this;
	}

	 /**
	 * 블록스토리지 볼륨타입 최대 throughput
	 * @return maxThroughput
	**/
	public Integer getMaxThroughput() {
		return maxThroughput;
	}

	public void setMaxThroughput(Integer maxThroughput) {
		this.maxThroughput = maxThroughput;
	}

	public BlockStorageVolumeType minIops(Integer minIops) {
		this.minIops = minIops;
		return this;
	}

	 /**
	 * 블록스토리지 볼륨타입 최소 iops
	 * @return minIops
	**/
	public Integer getMinIops() {
		return minIops;
	}

	public void setMinIops(Integer minIops) {
		this.minIops = minIops;
	}

	public BlockStorageVolumeType maxIops(Integer maxIops) {
		this.maxIops = maxIops;
		return this;
	}

	 /**
	 * 블록스토리지 볼륨타입 최대 iops
	 * @return maxIops
	**/
	public Integer getMaxIops() {
		return maxIops;
	}

	public void setMaxIops(Integer maxIops) {
		this.maxIops = maxIops;
	}

	public BlockStorageVolumeType minVolumeSize(Integer minVolumeSize) {
		this.minVolumeSize = minVolumeSize;
		return this;
	}

	 /**
	 * 블록스토리지 볼륨타입 최소 volumeSize
	 * @return minVolumeSize
	**/
	public Integer getMinVolumeSize() {
		return minVolumeSize;
	}

	public void setMinVolumeSize(Integer minVolumeSize) {
		this.minVolumeSize = minVolumeSize;
	}

	public BlockStorageVolumeType maxVolumeSize(Integer maxVolumeSize) {
		this.maxVolumeSize = maxVolumeSize;
		return this;
	}

	 /**
	 * 블록스토리지 볼륨타입 최대 volumeSize
	 * @return maxVolumeSize
	**/
	public Integer getMaxVolumeSize() {
		return maxVolumeSize;
	}

	public void setMaxVolumeSize(Integer maxVolumeSize) {
		this.maxVolumeSize = maxVolumeSize;
	}

	public BlockStorageVolumeType minBaseVolumeSize(Integer minBaseVolumeSize) {
		this.minBaseVolumeSize = minBaseVolumeSize;
		return this;
	}

	 /**
	 * 블록스토리지 볼륨타입 최소 rootVolumeSize
	 * @return minBaseVolumeSize
	**/
	public Integer getMinBaseVolumeSize() {
		return minBaseVolumeSize;
	}

	public void setMinBaseVolumeSize(Integer minBaseVolumeSize) {
		this.minBaseVolumeSize = minBaseVolumeSize;
	}

	public BlockStorageVolumeType maxBaseVolumeSize(Integer maxBaseVolumeSize) {
		this.maxBaseVolumeSize = maxBaseVolumeSize;
		return this;
	}

	 /**
	 * 블록스토리지 볼륨타입 최대 rootVolumeSize
	 * @return maxBaseVolumeSize
	**/
	public Integer getMaxBaseVolumeSize() {
		return maxBaseVolumeSize;
	}

	public void setMaxBaseVolumeSize(Integer maxBaseVolumeSize) {
		this.maxBaseVolumeSize = maxBaseVolumeSize;
	}

	public BlockStorageVolumeType isAvailableBase(Boolean isAvailableBase) {
		this.isAvailableBase = isAvailableBase;
		return this;
	}

	 /**
	 * 기본스토리지 가능 여부
	 * @return isAvailableBase
	**/
	public Boolean isIsAvailableBase() {
		return isAvailableBase;
	}

	public void setIsAvailableBase(Boolean isAvailableBase) {
		this.isAvailableBase = isAvailableBase;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BlockStorageVolumeType blockStorageVolumeType = (BlockStorageVolumeType) o;
		return Objects.equals(this.zoneCodeList, blockStorageVolumeType.zoneCodeList) &&
				Objects.equals(this.blockStorageVolumeType, blockStorageVolumeType.blockStorageVolumeType) &&
				Objects.equals(this.hypervisorType, blockStorageVolumeType.hypervisorType) &&
				Objects.equals(this.minThroughput, blockStorageVolumeType.minThroughput) &&
				Objects.equals(this.maxThroughput, blockStorageVolumeType.maxThroughput) &&
				Objects.equals(this.minIops, blockStorageVolumeType.minIops) &&
				Objects.equals(this.maxIops, blockStorageVolumeType.maxIops) &&
				Objects.equals(this.minVolumeSize, blockStorageVolumeType.minVolumeSize) &&
				Objects.equals(this.maxVolumeSize, blockStorageVolumeType.maxVolumeSize) &&
				Objects.equals(this.minBaseVolumeSize, blockStorageVolumeType.minBaseVolumeSize) &&
				Objects.equals(this.maxBaseVolumeSize, blockStorageVolumeType.maxBaseVolumeSize) &&
				Objects.equals(this.isAvailableBase, blockStorageVolumeType.isAvailableBase);
	}

	@Override
	public int hashCode() {
		return Objects.hash(zoneCodeList, blockStorageVolumeType, hypervisorType, minThroughput, maxThroughput, minIops, maxIops, minVolumeSize, maxVolumeSize, minBaseVolumeSize, maxBaseVolumeSize, isAvailableBase);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BlockStorageVolumeType {\n");
		
		sb.append("		zoneCodeList: ").append(toIndentedString(zoneCodeList)).append("\n");
		sb.append("		blockStorageVolumeType: ").append(toIndentedString(blockStorageVolumeType)).append("\n");
		sb.append("		hypervisorType: ").append(toIndentedString(hypervisorType)).append("\n");
		sb.append("		minThroughput: ").append(toIndentedString(minThroughput)).append("\n");
		sb.append("		maxThroughput: ").append(toIndentedString(maxThroughput)).append("\n");
		sb.append("		minIops: ").append(toIndentedString(minIops)).append("\n");
		sb.append("		maxIops: ").append(toIndentedString(maxIops)).append("\n");
		sb.append("		minVolumeSize: ").append(toIndentedString(minVolumeSize)).append("\n");
		sb.append("		maxVolumeSize: ").append(toIndentedString(maxVolumeSize)).append("\n");
		sb.append("		minBaseVolumeSize: ").append(toIndentedString(minBaseVolumeSize)).append("\n");
		sb.append("		maxBaseVolumeSize: ").append(toIndentedString(maxBaseVolumeSize)).append("\n");
		sb.append("		isAvailableBase: ").append(toIndentedString(isAvailableBase)).append("\n");
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

