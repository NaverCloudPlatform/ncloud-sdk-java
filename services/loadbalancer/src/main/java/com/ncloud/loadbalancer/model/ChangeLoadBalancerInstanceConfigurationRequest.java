/*
 * loadbalancer
 * <br/>https://ncloud.apigw.ntruss.com/loadbalancer/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.loadbalancer.model;

import java.util.Objects;
import com.ncloud.loadbalancer.model.LoadBalancerRuleParameter;
import java.util.ArrayList;
import java.util.List;

/**
 * ChangeLoadBalancerInstanceConfigurationRequest
 */
public class ChangeLoadBalancerInstanceConfigurationRequest {
	private String loadBalancerInstanceNo = null;

	private String loadBalancerAlgorithmTypeCode = null;

	private String loadBalancerDescription = null;

	private List<LoadBalancerRuleParameter> loadBalancerRuleList = new ArrayList<LoadBalancerRuleParameter>();

	private List<String> zoneNoList = null;

	private String responseFormatType = null;

	public ChangeLoadBalancerInstanceConfigurationRequest loadBalancerInstanceNo(String loadBalancerInstanceNo) {
		this.loadBalancerInstanceNo = loadBalancerInstanceNo;
		return this;
	}

	 /**
	 * 로드밸런서인스턴스번호
	 * @return loadBalancerInstanceNo
	**/
	public String getLoadBalancerInstanceNo() {
		return loadBalancerInstanceNo;
	}

	public void setLoadBalancerInstanceNo(String loadBalancerInstanceNo) {
		this.loadBalancerInstanceNo = loadBalancerInstanceNo;
	}

	public ChangeLoadBalancerInstanceConfigurationRequest loadBalancerAlgorithmTypeCode(String loadBalancerAlgorithmTypeCode) {
		this.loadBalancerAlgorithmTypeCode = loadBalancerAlgorithmTypeCode;
		return this;
	}

	 /**
	 * 로드밸런서알고리즘구분코드
	 * @return loadBalancerAlgorithmTypeCode
	**/
	public String getLoadBalancerAlgorithmTypeCode() {
		return loadBalancerAlgorithmTypeCode;
	}

	public void setLoadBalancerAlgorithmTypeCode(String loadBalancerAlgorithmTypeCode) {
		this.loadBalancerAlgorithmTypeCode = loadBalancerAlgorithmTypeCode;
	}

	public ChangeLoadBalancerInstanceConfigurationRequest loadBalancerDescription(String loadBalancerDescription) {
		this.loadBalancerDescription = loadBalancerDescription;
		return this;
	}

	 /**
	 * 로드밸런서설명
	 * @return loadBalancerDescription
	**/
	public String getLoadBalancerDescription() {
		return loadBalancerDescription;
	}

	public void setLoadBalancerDescription(String loadBalancerDescription) {
		this.loadBalancerDescription = loadBalancerDescription;
	}

	public ChangeLoadBalancerInstanceConfigurationRequest loadBalancerRuleList(List<LoadBalancerRuleParameter> loadBalancerRuleList) {
		this.loadBalancerRuleList = loadBalancerRuleList;
		return this;
	}

	public ChangeLoadBalancerInstanceConfigurationRequest addLoadBalancerRuleListItem(LoadBalancerRuleParameter loadBalancerRuleListItem) {
		this.loadBalancerRuleList.add(loadBalancerRuleListItem);
		return this;
	}

	 /**
	 * 로드밸런RULE리스트
	 * @return loadBalancerRuleList
	**/
	public List<LoadBalancerRuleParameter> getLoadBalancerRuleList() {
		return loadBalancerRuleList;
	}

	public void setLoadBalancerRuleList(List<LoadBalancerRuleParameter> loadBalancerRuleList) {
		this.loadBalancerRuleList = loadBalancerRuleList;
	}

	public ChangeLoadBalancerInstanceConfigurationRequest zoneNoList(List<String> zoneNoList) {
		this.zoneNoList = zoneNoList;
		return this;
	}

	public ChangeLoadBalancerInstanceConfigurationRequest addZoneNoListItem(String zoneNoListItem) {
		if (this.zoneNoList == null) {
			this.zoneNoList = new ArrayList<String>();
		}
		this.zoneNoList.add(zoneNoListItem);
		return this;
	}

	 /**
	 * ZONE번호리스트
	 * @return zoneNoList
	**/
	public List<String> getZoneNoList() {
		return zoneNoList;
	}

	public void setZoneNoList(List<String> zoneNoList) {
		this.zoneNoList = zoneNoList;
	}

	public ChangeLoadBalancerInstanceConfigurationRequest responseFormatType(String responseFormatType) {
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
		ChangeLoadBalancerInstanceConfigurationRequest changeLoadBalancerInstanceConfigurationRequest = (ChangeLoadBalancerInstanceConfigurationRequest) o;
		return Objects.equals(this.loadBalancerInstanceNo, changeLoadBalancerInstanceConfigurationRequest.loadBalancerInstanceNo) &&
				Objects.equals(this.loadBalancerAlgorithmTypeCode, changeLoadBalancerInstanceConfigurationRequest.loadBalancerAlgorithmTypeCode) &&
				Objects.equals(this.loadBalancerDescription, changeLoadBalancerInstanceConfigurationRequest.loadBalancerDescription) &&
				Objects.equals(this.loadBalancerRuleList, changeLoadBalancerInstanceConfigurationRequest.loadBalancerRuleList) &&
				Objects.equals(this.zoneNoList, changeLoadBalancerInstanceConfigurationRequest.zoneNoList) &&
				Objects.equals(this.responseFormatType, changeLoadBalancerInstanceConfigurationRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(loadBalancerInstanceNo, loadBalancerAlgorithmTypeCode, loadBalancerDescription, loadBalancerRuleList, zoneNoList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ChangeLoadBalancerInstanceConfigurationRequest {\n");
		
		sb.append("		loadBalancerInstanceNo: ").append(toIndentedString(loadBalancerInstanceNo)).append("\n");
		sb.append("		loadBalancerAlgorithmTypeCode: ").append(toIndentedString(loadBalancerAlgorithmTypeCode)).append("\n");
		sb.append("		loadBalancerDescription: ").append(toIndentedString(loadBalancerDescription)).append("\n");
		sb.append("		loadBalancerRuleList: ").append(toIndentedString(loadBalancerRuleList)).append("\n");
		sb.append("		zoneNoList: ").append(toIndentedString(zoneNoList)).append("\n");
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

