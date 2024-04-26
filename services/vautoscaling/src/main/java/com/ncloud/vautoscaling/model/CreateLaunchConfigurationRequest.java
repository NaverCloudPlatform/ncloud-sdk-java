/*
 * vautoscaling
 * VPC Auto Scaling 관련 API<br/>https://ncloud.apigw.ntruss.com/vautoscaling/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vautoscaling.model;

import java.util.Objects;

/**
 * CreateLaunchConfigurationRequest
 */
public class CreateLaunchConfigurationRequest {
	private String regionCode = null;

	private String serverImageProductCode = null;

	private String memberServerImageInstanceNo = null;

	private String serverProductCode = null;

	private Boolean isEncryptedVolume = null;

	private String initScriptNo = null;

	private String launchConfigurationName = null;

	private String loginKeyName = null;

	private String responseFormatType = null;

	public CreateLaunchConfigurationRequest regionCode(String regionCode) {
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

	public CreateLaunchConfigurationRequest serverImageProductCode(String serverImageProductCode) {
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

	public CreateLaunchConfigurationRequest memberServerImageInstanceNo(String memberServerImageInstanceNo) {
		this.memberServerImageInstanceNo = memberServerImageInstanceNo;
		return this;
	}

	 /**
	 * 회원서버이미지인스턴스번호
	 * @return memberServerImageInstanceNo
	**/
	public String getMemberServerImageInstanceNo() {
		return memberServerImageInstanceNo;
	}

	public void setMemberServerImageInstanceNo(String memberServerImageInstanceNo) {
		this.memberServerImageInstanceNo = memberServerImageInstanceNo;
	}

	public CreateLaunchConfigurationRequest serverProductCode(String serverProductCode) {
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

	public CreateLaunchConfigurationRequest isEncryptedVolume(Boolean isEncryptedVolume) {
		this.isEncryptedVolume = isEncryptedVolume;
		return this;
	}

	 /**
	 * 볼륨암호화여부
	 * @return isEncryptedVolume
	**/
	public Boolean isIsEncryptedVolume() {
		return isEncryptedVolume;
	}

	public void setIsEncryptedVolume(Boolean isEncryptedVolume) {
		this.isEncryptedVolume = isEncryptedVolume;
	}

	public CreateLaunchConfigurationRequest initScriptNo(String initScriptNo) {
		this.initScriptNo = initScriptNo;
		return this;
	}

	 /**
	 * 초기화스크립트번호
	 * @return initScriptNo
	**/
	public String getInitScriptNo() {
		return initScriptNo;
	}

	public void setInitScriptNo(String initScriptNo) {
		this.initScriptNo = initScriptNo;
	}

	public CreateLaunchConfigurationRequest launchConfigurationName(String launchConfigurationName) {
		this.launchConfigurationName = launchConfigurationName;
		return this;
	}

	 /**
	 * 론치설정이름
	 * @return launchConfigurationName
	**/
	public String getLaunchConfigurationName() {
		return launchConfigurationName;
	}

	public void setLaunchConfigurationName(String launchConfigurationName) {
		this.launchConfigurationName = launchConfigurationName;
	}

	public CreateLaunchConfigurationRequest loginKeyName(String loginKeyName) {
		this.loginKeyName = loginKeyName;
		return this;
	}

	 /**
	 * 로그인키이름
	 * @return loginKeyName
	**/
	public String getLoginKeyName() {
		return loginKeyName;
	}

	public void setLoginKeyName(String loginKeyName) {
		this.loginKeyName = loginKeyName;
	}

	public CreateLaunchConfigurationRequest responseFormatType(String responseFormatType) {
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
		CreateLaunchConfigurationRequest createLaunchConfigurationRequest = (CreateLaunchConfigurationRequest) o;
		return Objects.equals(this.regionCode, createLaunchConfigurationRequest.regionCode) &&
				Objects.equals(this.serverImageProductCode, createLaunchConfigurationRequest.serverImageProductCode) &&
				Objects.equals(this.memberServerImageInstanceNo, createLaunchConfigurationRequest.memberServerImageInstanceNo) &&
				Objects.equals(this.serverProductCode, createLaunchConfigurationRequest.serverProductCode) &&
				Objects.equals(this.isEncryptedVolume, createLaunchConfigurationRequest.isEncryptedVolume) &&
				Objects.equals(this.initScriptNo, createLaunchConfigurationRequest.initScriptNo) &&
				Objects.equals(this.launchConfigurationName, createLaunchConfigurationRequest.launchConfigurationName) &&
				Objects.equals(this.loginKeyName, createLaunchConfigurationRequest.loginKeyName) &&
				Objects.equals(this.responseFormatType, createLaunchConfigurationRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, serverImageProductCode, memberServerImageInstanceNo, serverProductCode, isEncryptedVolume, initScriptNo, launchConfigurationName, loginKeyName, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateLaunchConfigurationRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		serverImageProductCode: ").append(toIndentedString(serverImageProductCode)).append("\n");
		sb.append("		memberServerImageInstanceNo: ").append(toIndentedString(memberServerImageInstanceNo)).append("\n");
		sb.append("		serverProductCode: ").append(toIndentedString(serverProductCode)).append("\n");
		sb.append("		isEncryptedVolume: ").append(toIndentedString(isEncryptedVolume)).append("\n");
		sb.append("		initScriptNo: ").append(toIndentedString(initScriptNo)).append("\n");
		sb.append("		launchConfigurationName: ").append(toIndentedString(launchConfigurationName)).append("\n");
		sb.append("		loginKeyName: ").append(toIndentedString(loginKeyName)).append("\n");
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

