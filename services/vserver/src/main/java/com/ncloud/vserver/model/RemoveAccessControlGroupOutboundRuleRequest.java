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
import com.ncloud.vserver.model.RemoveAccessControlGroupRuleParameter;
import java.util.ArrayList;
import java.util.List;

/**
 * RemoveAccessControlGroupOutboundRuleRequest
 */
public class RemoveAccessControlGroupOutboundRuleRequest {
	private String regionCode = null;

	private String accessControlGroupNo = null;

	private String vpcNo = null;

	private List<RemoveAccessControlGroupRuleParameter> accessControlGroupRuleList = new ArrayList<RemoveAccessControlGroupRuleParameter>();

	private String responseFormatType = null;

	public RemoveAccessControlGroupOutboundRuleRequest regionCode(String regionCode) {
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

	public RemoveAccessControlGroupOutboundRuleRequest accessControlGroupNo(String accessControlGroupNo) {
		this.accessControlGroupNo = accessControlGroupNo;
		return this;
	}

	 /**
	 * ACG번호
	 * @return accessControlGroupNo
	**/
	public String getAccessControlGroupNo() {
		return accessControlGroupNo;
	}

	public void setAccessControlGroupNo(String accessControlGroupNo) {
		this.accessControlGroupNo = accessControlGroupNo;
	}

	public RemoveAccessControlGroupOutboundRuleRequest vpcNo(String vpcNo) {
		this.vpcNo = vpcNo;
		return this;
	}

	 /**
	 * VPC번호
	 * @return vpcNo
	**/
	public String getVpcNo() {
		return vpcNo;
	}

	public void setVpcNo(String vpcNo) {
		this.vpcNo = vpcNo;
	}

	public RemoveAccessControlGroupOutboundRuleRequest accessControlGroupRuleList(List<RemoveAccessControlGroupRuleParameter> accessControlGroupRuleList) {
		this.accessControlGroupRuleList = accessControlGroupRuleList;
		return this;
	}

	public RemoveAccessControlGroupOutboundRuleRequest addAccessControlGroupRuleListItem(RemoveAccessControlGroupRuleParameter accessControlGroupRuleListItem) {
		this.accessControlGroupRuleList.add(accessControlGroupRuleListItem);
		return this;
	}

	 /**
	 * ACGRule리스트
	 * @return accessControlGroupRuleList
	**/
	public List<RemoveAccessControlGroupRuleParameter> getAccessControlGroupRuleList() {
		return accessControlGroupRuleList;
	}

	public void setAccessControlGroupRuleList(List<RemoveAccessControlGroupRuleParameter> accessControlGroupRuleList) {
		this.accessControlGroupRuleList = accessControlGroupRuleList;
	}

	public RemoveAccessControlGroupOutboundRuleRequest responseFormatType(String responseFormatType) {
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
		RemoveAccessControlGroupOutboundRuleRequest removeAccessControlGroupOutboundRuleRequest = (RemoveAccessControlGroupOutboundRuleRequest) o;
		return Objects.equals(this.regionCode, removeAccessControlGroupOutboundRuleRequest.regionCode) &&
				Objects.equals(this.accessControlGroupNo, removeAccessControlGroupOutboundRuleRequest.accessControlGroupNo) &&
				Objects.equals(this.vpcNo, removeAccessControlGroupOutboundRuleRequest.vpcNo) &&
				Objects.equals(this.accessControlGroupRuleList, removeAccessControlGroupOutboundRuleRequest.accessControlGroupRuleList) &&
				Objects.equals(this.responseFormatType, removeAccessControlGroupOutboundRuleRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, accessControlGroupNo, vpcNo, accessControlGroupRuleList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RemoveAccessControlGroupOutboundRuleRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		accessControlGroupNo: ").append(toIndentedString(accessControlGroupNo)).append("\n");
		sb.append("		vpcNo: ").append(toIndentedString(vpcNo)).append("\n");
		sb.append("		accessControlGroupRuleList: ").append(toIndentedString(accessControlGroupRuleList)).append("\n");
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

