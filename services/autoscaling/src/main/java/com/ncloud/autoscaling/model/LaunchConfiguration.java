/*
 * autoscaling
 * <br/>https://ncloud.apigw.ntruss.com/autoscaling/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.autoscaling.model;

import java.util.Objects;
import com.ncloud.autoscaling.model.AccessControlGroup;
import java.util.ArrayList;
import java.util.List;

/**
 * LaunchConfiguration
 */
public class LaunchConfiguration {
	private String launchConfigurationName = null;

	private String serverImageProductCode = null;

	private String serverProductCode = null;

	private String memberServerImageNo = null;

	private String loginKeyName = null;

	private String createDate = null;

	private String userData = null;

	private List<AccessControlGroup> accessControlGroupList = null;

	public LaunchConfiguration launchConfigurationName(String launchConfigurationName) {
		this.launchConfigurationName = launchConfigurationName;
		return this;
	}

	 /**
	 * 론치설정명
	 * @return launchConfigurationName
	**/
	public String getLaunchConfigurationName() {
		return launchConfigurationName;
	}

	public void setLaunchConfigurationName(String launchConfigurationName) {
		this.launchConfigurationName = launchConfigurationName;
	}

	public LaunchConfiguration serverImageProductCode(String serverImageProductCode) {
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

	public LaunchConfiguration serverProductCode(String serverProductCode) {
		this.serverProductCode = serverProductCode;
		return this;
	}

	 /**
	 * 서버상품코드
	 * @return serverProductCode
	**/
	public String getServerProductCode() {
		return serverProductCode;
	}

	public void setServerProductCode(String serverProductCode) {
		this.serverProductCode = serverProductCode;
	}

	public LaunchConfiguration memberServerImageNo(String memberServerImageNo) {
		this.memberServerImageNo = memberServerImageNo;
		return this;
	}

	 /**
	 * 회원서버이미지번호
	 * @return memberServerImageNo
	**/
	public String getMemberServerImageNo() {
		return memberServerImageNo;
	}

	public void setMemberServerImageNo(String memberServerImageNo) {
		this.memberServerImageNo = memberServerImageNo;
	}

	public LaunchConfiguration loginKeyName(String loginKeyName) {
		this.loginKeyName = loginKeyName;
		return this;
	}

	 /**
	 * 로그인키명
	 * @return loginKeyName
	**/
	public String getLoginKeyName() {
		return loginKeyName;
	}

	public void setLoginKeyName(String loginKeyName) {
		this.loginKeyName = loginKeyName;
	}

	public LaunchConfiguration createDate(String createDate) {
		this.createDate = createDate;
		return this;
	}

	 /**
	 * 생성일시
	 * @return createDate
	**/
	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public LaunchConfiguration userData(String userData) {
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

	public LaunchConfiguration accessControlGroupList(List<AccessControlGroup> accessControlGroupList) {
		this.accessControlGroupList = accessControlGroupList;
		return this;
	}

	public LaunchConfiguration addAccessControlGroupListItem(AccessControlGroup accessControlGroupListItem) {
		if (this.accessControlGroupList == null) {
			this.accessControlGroupList = new ArrayList<AccessControlGroup>();
		}
		this.accessControlGroupList.add(accessControlGroupListItem);
		return this;
	}

	 /**
	 * ACG리스트
	 * @return accessControlGroupList
	**/
	public List<AccessControlGroup> getAccessControlGroupList() {
		return accessControlGroupList;
	}

	public void setAccessControlGroupList(List<AccessControlGroup> accessControlGroupList) {
		this.accessControlGroupList = accessControlGroupList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LaunchConfiguration launchConfiguration = (LaunchConfiguration) o;
		return Objects.equals(this.launchConfigurationName, launchConfiguration.launchConfigurationName) &&
				Objects.equals(this.serverImageProductCode, launchConfiguration.serverImageProductCode) &&
				Objects.equals(this.serverProductCode, launchConfiguration.serverProductCode) &&
				Objects.equals(this.memberServerImageNo, launchConfiguration.memberServerImageNo) &&
				Objects.equals(this.loginKeyName, launchConfiguration.loginKeyName) &&
				Objects.equals(this.createDate, launchConfiguration.createDate) &&
				Objects.equals(this.userData, launchConfiguration.userData) &&
				Objects.equals(this.accessControlGroupList, launchConfiguration.accessControlGroupList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(launchConfigurationName, serverImageProductCode, serverProductCode, memberServerImageNo, loginKeyName, createDate, userData, accessControlGroupList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LaunchConfiguration {\n");
		
		sb.append("		launchConfigurationName: ").append(toIndentedString(launchConfigurationName)).append("\n");
		sb.append("		serverImageProductCode: ").append(toIndentedString(serverImageProductCode)).append("\n");
		sb.append("		serverProductCode: ").append(toIndentedString(serverProductCode)).append("\n");
		sb.append("		memberServerImageNo: ").append(toIndentedString(memberServerImageNo)).append("\n");
		sb.append("		loginKeyName: ").append(toIndentedString(loginKeyName)).append("\n");
		sb.append("		createDate: ").append(toIndentedString(createDate)).append("\n");
		sb.append("		userData: ").append(toIndentedString(userData)).append("\n");
		sb.append("		accessControlGroupList: ").append(toIndentedString(accessControlGroupList)).append("\n");
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

