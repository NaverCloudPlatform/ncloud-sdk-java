/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.server.model;

import java.util.Objects;
import com.ncloud.server.model.InstanceTagParameter;
import java.util.ArrayList;
import java.util.List;

/**
 * RecreateServerInstanceRequest
 */
public class RecreateServerInstanceRequest {
	private String serverInstanceNo = null;

	private String serverInstanceName = null;

	private String serverImageProductCode = null;

	private String userData = null;

	private List<InstanceTagParameter> instanceTagList = null;

	private Boolean isVaccineInstall = null;

	private String responseFormatType = null;

	public RecreateServerInstanceRequest serverInstanceNo(String serverInstanceNo) {
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

	public RecreateServerInstanceRequest serverInstanceName(String serverInstanceName) {
		this.serverInstanceName = serverInstanceName;
		return this;
	}

	 /**
	 * 서버인스턴스이름
	 * @return serverInstanceName
	**/
	public String getServerInstanceName() {
		return serverInstanceName;
	}

	public void setServerInstanceName(String serverInstanceName) {
		this.serverInstanceName = serverInstanceName;
	}

	public RecreateServerInstanceRequest serverImageProductCode(String serverImageProductCode) {
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

	public RecreateServerInstanceRequest userData(String userData) {
		this.userData = userData;
		return this;
	}

	 /**
	 * 사용자데이터
	 * @return userData
	**/
	public String getUserData() {
		return userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
	}

	public RecreateServerInstanceRequest instanceTagList(List<InstanceTagParameter> instanceTagList) {
		this.instanceTagList = instanceTagList;
		return this;
	}

	public RecreateServerInstanceRequest addInstanceTagListItem(InstanceTagParameter instanceTagListItem) {
		if (this.instanceTagList == null) {
			this.instanceTagList = new ArrayList<InstanceTagParameter>();
		}
		this.instanceTagList.add(instanceTagListItem);
		return this;
	}

	 /**
	 * 인스턴스태그리스트
	 * @return instanceTagList
	**/
	public List<InstanceTagParameter> getInstanceTagList() {
		return instanceTagList;
	}

	public void setInstanceTagList(List<InstanceTagParameter> instanceTagList) {
		this.instanceTagList = instanceTagList;
	}

	public RecreateServerInstanceRequest isVaccineInstall(Boolean isVaccineInstall) {
		this.isVaccineInstall = isVaccineInstall;
		return this;
	}

	 /**
	 * 백신설치여부
	 * @return isVaccineInstall
	**/
	public Boolean isIsVaccineInstall() {
		return isVaccineInstall;
	}

	public void setIsVaccineInstall(Boolean isVaccineInstall) {
		this.isVaccineInstall = isVaccineInstall;
	}

	public RecreateServerInstanceRequest responseFormatType(String responseFormatType) {
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
		RecreateServerInstanceRequest recreateServerInstanceRequest = (RecreateServerInstanceRequest) o;
		return Objects.equals(this.serverInstanceNo, recreateServerInstanceRequest.serverInstanceNo) &&
				Objects.equals(this.serverInstanceName, recreateServerInstanceRequest.serverInstanceName) &&
				Objects.equals(this.serverImageProductCode, recreateServerInstanceRequest.serverImageProductCode) &&
				Objects.equals(this.userData, recreateServerInstanceRequest.userData) &&
				Objects.equals(this.instanceTagList, recreateServerInstanceRequest.instanceTagList) &&
				Objects.equals(this.isVaccineInstall, recreateServerInstanceRequest.isVaccineInstall) &&
				Objects.equals(this.responseFormatType, recreateServerInstanceRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(serverInstanceNo, serverInstanceName, serverImageProductCode, userData, instanceTagList, isVaccineInstall, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RecreateServerInstanceRequest {\n");
		
		sb.append("		serverInstanceNo: ").append(toIndentedString(serverInstanceNo)).append("\n");
		sb.append("		serverInstanceName: ").append(toIndentedString(serverInstanceName)).append("\n");
		sb.append("		serverImageProductCode: ").append(toIndentedString(serverImageProductCode)).append("\n");
		sb.append("		userData: ").append(toIndentedString(userData)).append("\n");
		sb.append("		instanceTagList: ").append(toIndentedString(instanceTagList)).append("\n");
		sb.append("		isVaccineInstall: ").append(toIndentedString(isVaccineInstall)).append("\n");
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

