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
 * InitScript
 */
public class InitScript {
	private String initScriptNo = null;

	private String initScriptName = null;

	private String createDate = null;

	private String initScriptDescription = null;

	private String initScriptContent = null;

	private CommonCode osType = null;

	public InitScript initScriptNo(String initScriptNo) {
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

	public InitScript initScriptName(String initScriptName) {
		this.initScriptName = initScriptName;
		return this;
	}

	 /**
	 * 초기화스크립트이름
	 * @return initScriptName
	**/
	public String getInitScriptName() {
		return initScriptName;
	}

	public void setInitScriptName(String initScriptName) {
		this.initScriptName = initScriptName;
	}

	public InitScript createDate(String createDate) {
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

	public InitScript initScriptDescription(String initScriptDescription) {
		this.initScriptDescription = initScriptDescription;
		return this;
	}

	 /**
	 * 초기화스크립트설명
	 * @return initScriptDescription
	**/
	public String getInitScriptDescription() {
		return initScriptDescription;
	}

	public void setInitScriptDescription(String initScriptDescription) {
		this.initScriptDescription = initScriptDescription;
	}

	public InitScript initScriptContent(String initScriptContent) {
		this.initScriptContent = initScriptContent;
		return this;
	}

	 /**
	 * 초기화스크립트내용
	 * @return initScriptContent
	**/
	public String getInitScriptContent() {
		return initScriptContent;
	}

	public void setInitScriptContent(String initScriptContent) {
		this.initScriptContent = initScriptContent;
	}

	public InitScript osType(CommonCode osType) {
		this.osType = osType;
		return this;
	}

	 /**
	 * OS유형
	 * @return osType
	**/
	public CommonCode getOsType() {
		return osType;
	}

	public void setOsType(CommonCode osType) {
		this.osType = osType;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InitScript initScript = (InitScript) o;
		return Objects.equals(this.initScriptNo, initScript.initScriptNo) &&
				Objects.equals(this.initScriptName, initScript.initScriptName) &&
				Objects.equals(this.createDate, initScript.createDate) &&
				Objects.equals(this.initScriptDescription, initScript.initScriptDescription) &&
				Objects.equals(this.initScriptContent, initScript.initScriptContent) &&
				Objects.equals(this.osType, initScript.osType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(initScriptNo, initScriptName, createDate, initScriptDescription, initScriptContent, osType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InitScript {\n");
		
		sb.append("		initScriptNo: ").append(toIndentedString(initScriptNo)).append("\n");
		sb.append("		initScriptName: ").append(toIndentedString(initScriptName)).append("\n");
		sb.append("		createDate: ").append(toIndentedString(createDate)).append("\n");
		sb.append("		initScriptDescription: ").append(toIndentedString(initScriptDescription)).append("\n");
		sb.append("		initScriptContent: ").append(toIndentedString(initScriptContent)).append("\n");
		sb.append("		osType: ").append(toIndentedString(osType)).append("\n");
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

