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
 * BlockDevicePartition
 */
public class BlockDevicePartition {
	private String mountPoint = null;

	private String partitionSize = null;

	public BlockDevicePartition mountPoint(String mountPoint) {
		this.mountPoint = mountPoint;
		return this;
	}

	 /**
	 * 마운트포인트
	 * @return mountPoint
	**/
	public String getMountPoint() {
		return mountPoint;
	}

	public void setMountPoint(String mountPoint) {
		this.mountPoint = mountPoint;
	}

	public BlockDevicePartition partitionSize(String partitionSize) {
		this.partitionSize = partitionSize;
		return this;
	}

	 /**
	 * 파티션사이즈
	 * @return partitionSize
	**/
	public String getPartitionSize() {
		return partitionSize;
	}

	public void setPartitionSize(String partitionSize) {
		this.partitionSize = partitionSize;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BlockDevicePartition blockDevicePartition = (BlockDevicePartition) o;
		return Objects.equals(this.mountPoint, blockDevicePartition.mountPoint) &&
				Objects.equals(this.partitionSize, blockDevicePartition.partitionSize);
	}

	@Override
	public int hashCode() {
		return Objects.hash(mountPoint, partitionSize);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BlockDevicePartition {\n");
		
		sb.append("		mountPoint: ").append(toIndentedString(mountPoint)).append("\n");
		sb.append("		partitionSize: ").append(toIndentedString(partitionSize)).append("\n");
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

