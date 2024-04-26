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

/**
 * AccessControlGroup
 */
public class AccessControlGroup {
	private String accessControlGroupConfigurationNo = null;

	private String accessControlGroupName = null;

	private String accessControlGroupDescription = null;

	private Boolean isDefaultGroup = null;

	private String createDate = null;

	public AccessControlGroup accessControlGroupConfigurationNo(String accessControlGroupConfigurationNo) {
		this.accessControlGroupConfigurationNo = accessControlGroupConfigurationNo;
		return this;
	}

	 /**
	 * 접근제어그룹설정번호
	 * @return accessControlGroupConfigurationNo
	**/
	public String getAccessControlGroupConfigurationNo() {
		return accessControlGroupConfigurationNo;
	}

	public void setAccessControlGroupConfigurationNo(String accessControlGroupConfigurationNo) {
		this.accessControlGroupConfigurationNo = accessControlGroupConfigurationNo;
	}

	public AccessControlGroup accessControlGroupName(String accessControlGroupName) {
		this.accessControlGroupName = accessControlGroupName;
		return this;
	}

	 /**
	 * 접근제어그룹명
	 * @return accessControlGroupName
	**/
	public String getAccessControlGroupName() {
		return accessControlGroupName;
	}

	public void setAccessControlGroupName(String accessControlGroupName) {
		this.accessControlGroupName = accessControlGroupName;
	}

	public AccessControlGroup accessControlGroupDescription(String accessControlGroupDescription) {
		this.accessControlGroupDescription = accessControlGroupDescription;
		return this;
	}

	 /**
	 * 접근제어그룹설명
	 * @return accessControlGroupDescription
	**/
	public String getAccessControlGroupDescription() {
		return accessControlGroupDescription;
	}

	public void setAccessControlGroupDescription(String accessControlGroupDescription) {
		this.accessControlGroupDescription = accessControlGroupDescription;
	}

	public AccessControlGroup isDefaultGroup(Boolean isDefaultGroup) {
		this.isDefaultGroup = isDefaultGroup;
		return this;
	}

	 /**
	 * 디폴트그룹여부
	 * @return isDefaultGroup
	**/
	public Boolean isIsDefaultGroup() {
		return isDefaultGroup;
	}

	public void setIsDefaultGroup(Boolean isDefaultGroup) {
		this.isDefaultGroup = isDefaultGroup;
	}

	public AccessControlGroup createDate(String createDate) {
		this.createDate = createDate;
		return this;
	}

	 /**
	 * 생성일자
	 * @return createDate
	**/
	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AccessControlGroup accessControlGroup = (AccessControlGroup) o;
		return Objects.equals(this.accessControlGroupConfigurationNo, accessControlGroup.accessControlGroupConfigurationNo) &&
				Objects.equals(this.accessControlGroupName, accessControlGroup.accessControlGroupName) &&
				Objects.equals(this.accessControlGroupDescription, accessControlGroup.accessControlGroupDescription) &&
				Objects.equals(this.isDefaultGroup, accessControlGroup.isDefaultGroup) &&
				Objects.equals(this.createDate, accessControlGroup.createDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(accessControlGroupConfigurationNo, accessControlGroupName, accessControlGroupDescription, isDefaultGroup, createDate);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccessControlGroup {\n");
		
		sb.append("		accessControlGroupConfigurationNo: ").append(toIndentedString(accessControlGroupConfigurationNo)).append("\n");
		sb.append("		accessControlGroupName: ").append(toIndentedString(accessControlGroupName)).append("\n");
		sb.append("		accessControlGroupDescription: ").append(toIndentedString(accessControlGroupDescription)).append("\n");
		sb.append("		isDefaultGroup: ").append(toIndentedString(isDefaultGroup)).append("\n");
		sb.append("		createDate: ").append(toIndentedString(createDate)).append("\n");
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

