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
import com.ncloud.server.model.PortForwardingRuleParameter;
import java.util.ArrayList;
import java.util.List;

/**
 * AddPortForwardingRulesRequest
 */
public class AddPortForwardingRulesRequest {
	private String portForwardingConfigurationNo = null;

	private List<PortForwardingRuleParameter> portForwardingRuleList = new ArrayList<PortForwardingRuleParameter>();

	private String responseFormatType = null;

	public AddPortForwardingRulesRequest portForwardingConfigurationNo(String portForwardingConfigurationNo) {
		this.portForwardingConfigurationNo = portForwardingConfigurationNo;
		return this;
	}

	 /**
	 * 포트포워딩설정번호
	 * @return portForwardingConfigurationNo
	**/
	public String getPortForwardingConfigurationNo() {
		return portForwardingConfigurationNo;
	}

	public void setPortForwardingConfigurationNo(String portForwardingConfigurationNo) {
		this.portForwardingConfigurationNo = portForwardingConfigurationNo;
	}

	public AddPortForwardingRulesRequest portForwardingRuleList(List<PortForwardingRuleParameter> portForwardingRuleList) {
		this.portForwardingRuleList = portForwardingRuleList;
		return this;
	}

	public AddPortForwardingRulesRequest addPortForwardingRuleListItem(PortForwardingRuleParameter portForwardingRuleListItem) {
		this.portForwardingRuleList.add(portForwardingRuleListItem);
		return this;
	}

	 /**
	 * 포트포워딩RULE리스트
	 * @return portForwardingRuleList
	**/
	public List<PortForwardingRuleParameter> getPortForwardingRuleList() {
		return portForwardingRuleList;
	}

	public void setPortForwardingRuleList(List<PortForwardingRuleParameter> portForwardingRuleList) {
		this.portForwardingRuleList = portForwardingRuleList;
	}

	public AddPortForwardingRulesRequest responseFormatType(String responseFormatType) {
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
		AddPortForwardingRulesRequest addPortForwardingRulesRequest = (AddPortForwardingRulesRequest) o;
		return Objects.equals(this.portForwardingConfigurationNo, addPortForwardingRulesRequest.portForwardingConfigurationNo) &&
				Objects.equals(this.portForwardingRuleList, addPortForwardingRulesRequest.portForwardingRuleList) &&
				Objects.equals(this.responseFormatType, addPortForwardingRulesRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(portForwardingConfigurationNo, portForwardingRuleList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AddPortForwardingRulesRequest {\n");
		
		sb.append("		portForwardingConfigurationNo: ").append(toIndentedString(portForwardingConfigurationNo)).append("\n");
		sb.append("		portForwardingRuleList: ").append(toIndentedString(portForwardingRuleList)).append("\n");
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

