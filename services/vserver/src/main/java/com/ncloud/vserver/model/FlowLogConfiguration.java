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

/**
 * FlowLogConfiguration
 */
public class FlowLogConfiguration {
	private String networkInterfaceNo = null;

	private CommonCode collectActionType = null;

	private Integer collectIntervalMinute = null;

	private CommonCode storageType = null;

	private String storageBucketName = null;

	private String storageBucketDirectoryName = null;

	public FlowLogConfiguration networkInterfaceNo(String networkInterfaceNo) {
		this.networkInterfaceNo = networkInterfaceNo;
		return this;
	}

	 /**
	 * Get networkInterfaceNo
	 * @return networkInterfaceNo
	**/
	public String getNetworkInterfaceNo() {
		return networkInterfaceNo;
	}

	public void setNetworkInterfaceNo(String networkInterfaceNo) {
		this.networkInterfaceNo = networkInterfaceNo;
	}

	public FlowLogConfiguration collectActionType(CommonCode collectActionType) {
		this.collectActionType = collectActionType;
		return this;
	}

	 /**
	 * Get collectActionType
	 * @return collectActionType
	**/
	public CommonCode getCollectActionType() {
		return collectActionType;
	}

	public void setCollectActionType(CommonCode collectActionType) {
		this.collectActionType = collectActionType;
	}

	public FlowLogConfiguration collectIntervalMinute(Integer collectIntervalMinute) {
		this.collectIntervalMinute = collectIntervalMinute;
		return this;
	}

	 /**
	 * Get collectIntervalMinute
	 * minimum: 5
	 * maximum: 15
	 * @return collectIntervalMinute
	**/
	public Integer getCollectIntervalMinute() {
		return collectIntervalMinute;
	}

	public void setCollectIntervalMinute(Integer collectIntervalMinute) {
		this.collectIntervalMinute = collectIntervalMinute;
	}

	public FlowLogConfiguration storageType(CommonCode storageType) {
		this.storageType = storageType;
		return this;
	}

	 /**
	 * Get storageType
	 * @return storageType
	**/
	public CommonCode getStorageType() {
		return storageType;
	}

	public void setStorageType(CommonCode storageType) {
		this.storageType = storageType;
	}

	public FlowLogConfiguration storageBucketName(String storageBucketName) {
		this.storageBucketName = storageBucketName;
		return this;
	}

	 /**
	 * Get storageBucketName
	 * @return storageBucketName
	**/
	public String getStorageBucketName() {
		return storageBucketName;
	}

	public void setStorageBucketName(String storageBucketName) {
		this.storageBucketName = storageBucketName;
	}

	public FlowLogConfiguration storageBucketDirectoryName(String storageBucketDirectoryName) {
		this.storageBucketDirectoryName = storageBucketDirectoryName;
		return this;
	}

	 /**
	 * Get storageBucketDirectoryName
	 * @return storageBucketDirectoryName
	**/
	public String getStorageBucketDirectoryName() {
		return storageBucketDirectoryName;
	}

	public void setStorageBucketDirectoryName(String storageBucketDirectoryName) {
		this.storageBucketDirectoryName = storageBucketDirectoryName;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FlowLogConfiguration flowLogConfiguration = (FlowLogConfiguration) o;
		return Objects.equals(this.networkInterfaceNo, flowLogConfiguration.networkInterfaceNo) &&
				Objects.equals(this.collectActionType, flowLogConfiguration.collectActionType) &&
				Objects.equals(this.collectIntervalMinute, flowLogConfiguration.collectIntervalMinute) &&
				Objects.equals(this.storageType, flowLogConfiguration.storageType) &&
				Objects.equals(this.storageBucketName, flowLogConfiguration.storageBucketName) &&
				Objects.equals(this.storageBucketDirectoryName, flowLogConfiguration.storageBucketDirectoryName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(networkInterfaceNo, collectActionType, collectIntervalMinute, storageType, storageBucketName, storageBucketDirectoryName);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FlowLogConfiguration {\n");
		
		sb.append("		networkInterfaceNo: ").append(toIndentedString(networkInterfaceNo)).append("\n");
		sb.append("		collectActionType: ").append(toIndentedString(collectActionType)).append("\n");
		sb.append("		collectIntervalMinute: ").append(toIndentedString(collectIntervalMinute)).append("\n");
		sb.append("		storageType: ").append(toIndentedString(storageType)).append("\n");
		sb.append("		storageBucketName: ").append(toIndentedString(storageBucketName)).append("\n");
		sb.append("		storageBucketDirectoryName: ").append(toIndentedString(storageBucketDirectoryName)).append("\n");
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

