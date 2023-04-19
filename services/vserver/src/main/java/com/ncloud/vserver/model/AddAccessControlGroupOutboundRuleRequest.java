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
import com.ncloud.vserver.model.AddAccessControlGroupRuleParameter;
import java.util.ArrayList;
import java.util.List;

/**
 * AddAccessControlGroupOutboundRuleRequest
 */
public class AddAccessControlGroupOutboundRuleRequest {
	private String regionCode = null;

	private String accessControlGroupNo = null;

	private String vpcNo = null;

	private List<AddAccessControlGroupRuleParameter> accessControlGroupRuleList = new ArrayList<AddAccessControlGroupRuleParameter>();

	private String responseFormatType = null;

	public AddAccessControlGroupOutboundRuleRequest regionCode(String regionCode) {
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

	public AddAccessControlGroupOutboundRuleRequest accessControlGroupNo(String accessControlGroupNo) {
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

	public AddAccessControlGroupOutboundRuleRequest vpcNo(String vpcNo) {
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

	public AddAccessControlGroupOutboundRuleRequest accessControlGroupRuleList(List<AddAccessControlGroupRuleParameter> accessControlGroupRuleList) {
		this.accessControlGroupRuleList = accessControlGroupRuleList;
		return this;
	}

	public AddAccessControlGroupOutboundRuleRequest addAccessControlGroupRuleListItem(AddAccessControlGroupRuleParameter accessControlGroupRuleListItem) {
		this.accessControlGroupRuleList.add(accessControlGroupRuleListItem);
		return this;
	}

	 /**
	 * ACGRule리스트
	 * @return accessControlGroupRuleList
	**/
	public List<AddAccessControlGroupRuleParameter> getAccessControlGroupRuleList() {
		return accessControlGroupRuleList;
	}

	public void setAccessControlGroupRuleList(List<AddAccessControlGroupRuleParameter> accessControlGroupRuleList) {
		this.accessControlGroupRuleList = accessControlGroupRuleList;
	}

	public AddAccessControlGroupOutboundRuleRequest responseFormatType(String responseFormatType) {
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
		AddAccessControlGroupOutboundRuleRequest addAccessControlGroupOutboundRuleRequest = (AddAccessControlGroupOutboundRuleRequest) o;
		return Objects.equals(this.regionCode, addAccessControlGroupOutboundRuleRequest.regionCode) &&
				Objects.equals(this.accessControlGroupNo, addAccessControlGroupOutboundRuleRequest.accessControlGroupNo) &&
				Objects.equals(this.vpcNo, addAccessControlGroupOutboundRuleRequest.vpcNo) &&
				Objects.equals(this.accessControlGroupRuleList, addAccessControlGroupOutboundRuleRequest.accessControlGroupRuleList) &&
				Objects.equals(this.responseFormatType, addAccessControlGroupOutboundRuleRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, accessControlGroupNo, vpcNo, accessControlGroupRuleList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AddAccessControlGroupOutboundRuleRequest {\n");
		
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

