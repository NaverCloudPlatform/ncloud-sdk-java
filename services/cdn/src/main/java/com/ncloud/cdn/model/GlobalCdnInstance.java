/*
 * cdn
 * <br/>https://ncloud.apigw.ntruss.com/cdn/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.cdn.model;

import java.util.Objects;
import com.ncloud.cdn.model.CommonCode;
import com.ncloud.cdn.model.GlobalCdnRule;
import com.ncloud.cdn.model.GlobalCdnServiceDomain;
import java.util.ArrayList;
import java.util.List;

/**
 * GlobalCdnInstance
 */
public class GlobalCdnInstance {
	private String cdnInstanceNo = null;

	private CommonCode cdnInstanceStatus = null;

	private CommonCode cdnInstanceOperation = null;

	private String cdnInstanceStatusName = null;

	private String createDate = null;

	private String lastModifiedDate = null;

	private String cdnInstanceDescription = null;

	private String serviceName = null;

	private Boolean isAvailablePartialDomainPurge = null;

	private List<GlobalCdnServiceDomain> globalCdnServiceDomainList = null;

	private GlobalCdnRule globalCdnRule = null;

	public GlobalCdnInstance cdnInstanceNo(String cdnInstanceNo) {
		this.cdnInstanceNo = cdnInstanceNo;
		return this;
	}

	 /**
	 * CDN인스턴스번호
	 * @return cdnInstanceNo
	**/
	public String getCdnInstanceNo() {
		return cdnInstanceNo;
	}

	public void setCdnInstanceNo(String cdnInstanceNo) {
		this.cdnInstanceNo = cdnInstanceNo;
	}

	public GlobalCdnInstance cdnInstanceStatus(CommonCode cdnInstanceStatus) {
		this.cdnInstanceStatus = cdnInstanceStatus;
		return this;
	}

	 /**
	 * CDN인스턴스상태
	 * @return cdnInstanceStatus
	**/
	public CommonCode getCdnInstanceStatus() {
		return cdnInstanceStatus;
	}

	public void setCdnInstanceStatus(CommonCode cdnInstanceStatus) {
		this.cdnInstanceStatus = cdnInstanceStatus;
	}

	public GlobalCdnInstance cdnInstanceOperation(CommonCode cdnInstanceOperation) {
		this.cdnInstanceOperation = cdnInstanceOperation;
		return this;
	}

	 /**
	 * CDN인스턴스OP
	 * @return cdnInstanceOperation
	**/
	public CommonCode getCdnInstanceOperation() {
		return cdnInstanceOperation;
	}

	public void setCdnInstanceOperation(CommonCode cdnInstanceOperation) {
		this.cdnInstanceOperation = cdnInstanceOperation;
	}

	public GlobalCdnInstance cdnInstanceStatusName(String cdnInstanceStatusName) {
		this.cdnInstanceStatusName = cdnInstanceStatusName;
		return this;
	}

	 /**
	 * CDN인스턴스상태명
	 * @return cdnInstanceStatusName
	**/
	public String getCdnInstanceStatusName() {
		return cdnInstanceStatusName;
	}

	public void setCdnInstanceStatusName(String cdnInstanceStatusName) {
		this.cdnInstanceStatusName = cdnInstanceStatusName;
	}

	public GlobalCdnInstance createDate(String createDate) {
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

	public GlobalCdnInstance lastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
		return this;
	}

	 /**
	 * UPTIME
	 * @return lastModifiedDate
	**/
	public String getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public GlobalCdnInstance cdnInstanceDescription(String cdnInstanceDescription) {
		this.cdnInstanceDescription = cdnInstanceDescription;
		return this;
	}

	 /**
	 * CDN인스턴스설명
	 * @return cdnInstanceDescription
	**/
	public String getCdnInstanceDescription() {
		return cdnInstanceDescription;
	}

	public void setCdnInstanceDescription(String cdnInstanceDescription) {
		this.cdnInstanceDescription = cdnInstanceDescription;
	}

	public GlobalCdnInstance serviceName(String serviceName) {
		this.serviceName = serviceName;
		return this;
	}

	 /**
	 * 서비스이름
	 * @return serviceName
	**/
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public GlobalCdnInstance isAvailablePartialDomainPurge(Boolean isAvailablePartialDomainPurge) {
		this.isAvailablePartialDomainPurge = isAvailablePartialDomainPurge;
		return this;
	}

	 /**
	 * Get isAvailablePartialDomainPurge
	 * @return isAvailablePartialDomainPurge
	**/
	public Boolean isIsAvailablePartialDomainPurge() {
		return isAvailablePartialDomainPurge;
	}

	public void setIsAvailablePartialDomainPurge(Boolean isAvailablePartialDomainPurge) {
		this.isAvailablePartialDomainPurge = isAvailablePartialDomainPurge;
	}

	public GlobalCdnInstance globalCdnServiceDomainList(List<GlobalCdnServiceDomain> globalCdnServiceDomainList) {
		this.globalCdnServiceDomainList = globalCdnServiceDomainList;
		return this;
	}

	public GlobalCdnInstance addGlobalCdnServiceDomainListItem(GlobalCdnServiceDomain globalCdnServiceDomainListItem) {
		if (this.globalCdnServiceDomainList == null) {
			this.globalCdnServiceDomainList = new ArrayList<GlobalCdnServiceDomain>();
		}
		this.globalCdnServiceDomainList.add(globalCdnServiceDomainListItem);
		return this;
	}

	 /**
	 * Get globalCdnServiceDomainList
	 * @return globalCdnServiceDomainList
	**/
	public List<GlobalCdnServiceDomain> getGlobalCdnServiceDomainList() {
		return globalCdnServiceDomainList;
	}

	public void setGlobalCdnServiceDomainList(List<GlobalCdnServiceDomain> globalCdnServiceDomainList) {
		this.globalCdnServiceDomainList = globalCdnServiceDomainList;
	}

	public GlobalCdnInstance globalCdnRule(GlobalCdnRule globalCdnRule) {
		this.globalCdnRule = globalCdnRule;
		return this;
	}

	 /**
	 * Get globalCdnRule
	 * @return globalCdnRule
	**/
	public GlobalCdnRule getGlobalCdnRule() {
		return globalCdnRule;
	}

	public void setGlobalCdnRule(GlobalCdnRule globalCdnRule) {
		this.globalCdnRule = globalCdnRule;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GlobalCdnInstance globalCdnInstance = (GlobalCdnInstance) o;
		return Objects.equals(this.cdnInstanceNo, globalCdnInstance.cdnInstanceNo) &&
				Objects.equals(this.cdnInstanceStatus, globalCdnInstance.cdnInstanceStatus) &&
				Objects.equals(this.cdnInstanceOperation, globalCdnInstance.cdnInstanceOperation) &&
				Objects.equals(this.cdnInstanceStatusName, globalCdnInstance.cdnInstanceStatusName) &&
				Objects.equals(this.createDate, globalCdnInstance.createDate) &&
				Objects.equals(this.lastModifiedDate, globalCdnInstance.lastModifiedDate) &&
				Objects.equals(this.cdnInstanceDescription, globalCdnInstance.cdnInstanceDescription) &&
				Objects.equals(this.serviceName, globalCdnInstance.serviceName) &&
				Objects.equals(this.isAvailablePartialDomainPurge, globalCdnInstance.isAvailablePartialDomainPurge) &&
				Objects.equals(this.globalCdnServiceDomainList, globalCdnInstance.globalCdnServiceDomainList) &&
				Objects.equals(this.globalCdnRule, globalCdnInstance.globalCdnRule);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cdnInstanceNo, cdnInstanceStatus, cdnInstanceOperation, cdnInstanceStatusName, createDate, lastModifiedDate, cdnInstanceDescription, serviceName, isAvailablePartialDomainPurge, globalCdnServiceDomainList, globalCdnRule);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GlobalCdnInstance {\n");
		
		sb.append("		cdnInstanceNo: ").append(toIndentedString(cdnInstanceNo)).append("\n");
		sb.append("		cdnInstanceStatus: ").append(toIndentedString(cdnInstanceStatus)).append("\n");
		sb.append("		cdnInstanceOperation: ").append(toIndentedString(cdnInstanceOperation)).append("\n");
		sb.append("		cdnInstanceStatusName: ").append(toIndentedString(cdnInstanceStatusName)).append("\n");
		sb.append("		createDate: ").append(toIndentedString(createDate)).append("\n");
		sb.append("		lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
		sb.append("		cdnInstanceDescription: ").append(toIndentedString(cdnInstanceDescription)).append("\n");
		sb.append("		serviceName: ").append(toIndentedString(serviceName)).append("\n");
		sb.append("		isAvailablePartialDomainPurge: ").append(toIndentedString(isAvailablePartialDomainPurge)).append("\n");
		sb.append("		globalCdnServiceDomainList: ").append(toIndentedString(globalCdnServiceDomainList)).append("\n");
		sb.append("		globalCdnRule: ").append(toIndentedString(globalCdnRule)).append("\n");
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

