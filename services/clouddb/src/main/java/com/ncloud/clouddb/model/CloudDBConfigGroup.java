/*
 * clouddb
 * Cloud DB<br/>https://ncloud.apigw.ntruss.com/clouddb/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.clouddb.model;

import java.util.Objects;

/**
 * CloudDBConfigGroup
 */
public class CloudDBConfigGroup {
	private String configGroupNo = null;

	private String configGroupType = null;

	private String configGroupName = null;

	public CloudDBConfigGroup configGroupNo(String configGroupNo) {
		this.configGroupNo = configGroupNo;
		return this;
	}

	 /**
	 * 설정그룹번호
	 * @return configGroupNo
	**/
	public String getConfigGroupNo() {
		return configGroupNo;
	}

	public void setConfigGroupNo(String configGroupNo) {
		this.configGroupNo = configGroupNo;
	}

	public CloudDBConfigGroup configGroupType(String configGroupType) {
		this.configGroupType = configGroupType;
		return this;
	}

	 /**
	 * 설정그룹유형
	 * @return configGroupType
	**/
	public String getConfigGroupType() {
		return configGroupType;
	}

	public void setConfigGroupType(String configGroupType) {
		this.configGroupType = configGroupType;
	}

	public CloudDBConfigGroup configGroupName(String configGroupName) {
		this.configGroupName = configGroupName;
		return this;
	}

	 /**
	 * 설정그룹이름
	 * @return configGroupName
	**/
	public String getConfigGroupName() {
		return configGroupName;
	}

	public void setConfigGroupName(String configGroupName) {
		this.configGroupName = configGroupName;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CloudDBConfigGroup cloudDBConfigGroup = (CloudDBConfigGroup) o;
		return Objects.equals(this.configGroupNo, cloudDBConfigGroup.configGroupNo) &&
				Objects.equals(this.configGroupType, cloudDBConfigGroup.configGroupType) &&
				Objects.equals(this.configGroupName, cloudDBConfigGroup.configGroupName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(configGroupNo, configGroupType, configGroupName);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CloudDBConfigGroup {\n");
		
		sb.append("		configGroupNo: ").append(toIndentedString(configGroupNo)).append("\n");
		sb.append("		configGroupType: ").append(toIndentedString(configGroupType)).append("\n");
		sb.append("		configGroupName: ").append(toIndentedString(configGroupName)).append("\n");
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

