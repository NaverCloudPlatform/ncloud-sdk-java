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
import com.ncloud.vserver.model.BlockStorage;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateServerImageRequest
 */
public class CreateServerImageRequest {
	private String regionCode = null;

	private String serverInstanceNo = null;

	private String serverImageName = null;

	private String serverImageDescription = null;

	private String responseFormatType = null;

	private List<BlockStorage> blockStorageList = new ArrayList<BlockStorage>();

	public CreateServerImageRequest regionCode(String regionCode) {
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

	public CreateServerImageRequest serverInstanceNo(String serverInstanceNo) {
		this.serverInstanceNo = serverInstanceNo;
		return this;
	}

	 /**
	 * 원본서버인스턴스번호
	 * @return serverInstanceNo
	**/
	public String getServerInstanceNo() {
		return serverInstanceNo;
	}

	public void setServerInstanceNo(String serverInstanceNo) {
		this.serverInstanceNo = serverInstanceNo;
	}

	public CreateServerImageRequest serverImageName(String serverImageName) {
		this.serverImageName = serverImageName;
		return this;
	}

	 /**
	 * 서버이미지이름
	 * @return serverImageName
	**/
	public String getServerImageName() {
		return serverImageName;
	}

	public void setServerImageName(String serverImageName) {
		this.serverImageName = serverImageName;
	}

	public CreateServerImageRequest serverImageDescription(String serverImageDescription) {
		this.serverImageDescription = serverImageDescription;
		return this;
	}

	 /**
	 * 서버이미지설명
	 * @return serverImageDescription
	**/
	public String getServerImageDescription() {
		return serverImageDescription;
	}

	public void setServerImageDescription(String serverImageDescription) {
		this.serverImageDescription = serverImageDescription;
	}

	public CreateServerImageRequest responseFormatType(String responseFormatType) {
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

	public CreateServerImageRequest blockStorageList(List<BlockStorage> blockStorageList) {
		this.blockStorageList = blockStorageList;
		return this;
	}

	public CreateServerImageRequest addBlockStorageListItem(BlockStorage blockStorageListItem) {
		this.blockStorageList.add(blockStorageListItem);
		return this;
	}

	 /**
	 * 스토리지리스트
	 * @return blockStorageList
	**/
	public List<BlockStorage> getBlockStorageList() {
		return blockStorageList;
	}

	public void setBlockStorageList(List<BlockStorage> blockStorageList) {
		this.blockStorageList = blockStorageList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CreateServerImageRequest createServerImageRequest = (CreateServerImageRequest) o;
		return Objects.equals(this.regionCode, createServerImageRequest.regionCode) &&
				Objects.equals(this.serverInstanceNo, createServerImageRequest.serverInstanceNo) &&
				Objects.equals(this.serverImageName, createServerImageRequest.serverImageName) &&
				Objects.equals(this.serverImageDescription, createServerImageRequest.serverImageDescription) &&
				Objects.equals(this.responseFormatType, createServerImageRequest.responseFormatType) &&
				Objects.equals(this.blockStorageList, createServerImageRequest.blockStorageList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, serverInstanceNo, serverImageName, serverImageDescription, responseFormatType, blockStorageList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateServerImageRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		serverInstanceNo: ").append(toIndentedString(serverInstanceNo)).append("\n");
		sb.append("		serverImageName: ").append(toIndentedString(serverImageName)).append("\n");
		sb.append("		serverImageDescription: ").append(toIndentedString(serverImageDescription)).append("\n");
		sb.append("		responseFormatType: ").append(toIndentedString(responseFormatType)).append("\n");
		sb.append("		blockStorageList: ").append(toIndentedString(blockStorageList)).append("\n");
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

