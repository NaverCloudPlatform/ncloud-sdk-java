/*
 * vloadbalancer
 * VPC Load Balancer 관련 API<br/>https://ncloud.apigw.ntruss.com/vloadbalancer/v2
 *
 * OpenAPI spec version: 2020-12-22T09:19:59Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vloadbalancer.model;

import java.util.Objects;
import com.ncloud.vloadbalancer.model.CommonCode;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateTargetGroupRequest
 */
public class CreateTargetGroupRequest {
	private String regionCode = null;

	private Integer targetGroupPort = null;

	private CommonCode targetGroupProtocolTypeCode = null;

	private String targetGroupDescription = null;

	private Integer healthCheckCycle = null;

	private Integer healthCheckDownThreshold = null;

	private String healthCheckHttpMethodTypeCode = null;

	private Integer healthCheckPort = null;

	private String healthCheckProtocolTypeCode = null;

	private Integer healthCheckUpThreshold = null;

	private String healthCheckUrlPath = null;

	private String targetGroupName = null;

	private List<String> targetNoList = null;

	private String targetTypeCode = null;

	private String vpcNo = null;

	private String responseFormatType = null;

	public CreateTargetGroupRequest regionCode(String regionCode) {
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

	public CreateTargetGroupRequest targetGroupPort(Integer targetGroupPort) {
		this.targetGroupPort = targetGroupPort;
		return this;
	}

	 /**
	 * 타겟그룹포트
	 * @return targetGroupPort
	**/
	public Integer getTargetGroupPort() {
		return targetGroupPort;
	}

	public void setTargetGroupPort(Integer targetGroupPort) {
		this.targetGroupPort = targetGroupPort;
	}

	public CreateTargetGroupRequest targetGroupProtocolTypeCode(CommonCode targetGroupProtocolTypeCode) {
		this.targetGroupProtocolTypeCode = targetGroupProtocolTypeCode;
		return this;
	}

	 /**
	 * 타겟그룹프로토콜유형코드
	 * @return targetGroupProtocolTypeCode
	**/
	public CommonCode getTargetGroupProtocolTypeCode() {
		return targetGroupProtocolTypeCode;
	}

	public void setTargetGroupProtocolTypeCode(CommonCode targetGroupProtocolTypeCode) {
		this.targetGroupProtocolTypeCode = targetGroupProtocolTypeCode;
	}

	public CreateTargetGroupRequest targetGroupDescription(String targetGroupDescription) {
		this.targetGroupDescription = targetGroupDescription;
		return this;
	}

	 /**
	 * 타겟그룹설명
	 * @return targetGroupDescription
	**/
	public String getTargetGroupDescription() {
		return targetGroupDescription;
	}

	public void setTargetGroupDescription(String targetGroupDescription) {
		this.targetGroupDescription = targetGroupDescription;
	}

	public CreateTargetGroupRequest healthCheckCycle(Integer healthCheckCycle) {
		this.healthCheckCycle = healthCheckCycle;
		return this;
	}

	 /**
	 * 헬스체크주기
	 * @return healthCheckCycle
	**/
	public Integer getHealthCheckCycle() {
		return healthCheckCycle;
	}

	public void setHealthCheckCycle(Integer healthCheckCycle) {
		this.healthCheckCycle = healthCheckCycle;
	}

	public CreateTargetGroupRequest healthCheckDownThreshold(Integer healthCheckDownThreshold) {
		this.healthCheckDownThreshold = healthCheckDownThreshold;
		return this;
	}

	 /**
	 * 헬스체크실패임계값
	 * @return healthCheckDownThreshold
	**/
	public Integer getHealthCheckDownThreshold() {
		return healthCheckDownThreshold;
	}

	public void setHealthCheckDownThreshold(Integer healthCheckDownThreshold) {
		this.healthCheckDownThreshold = healthCheckDownThreshold;
	}

	public CreateTargetGroupRequest healthCheckHttpMethodTypeCode(String healthCheckHttpMethodTypeCode) {
		this.healthCheckHttpMethodTypeCode = healthCheckHttpMethodTypeCode;
		return this;
	}

	 /**
	 * 헬스체크HTTP메소드유형코드
	 * @return healthCheckHttpMethodTypeCode
	**/
	public String getHealthCheckHttpMethodTypeCode() {
		return healthCheckHttpMethodTypeCode;
	}

	public void setHealthCheckHttpMethodTypeCode(String healthCheckHttpMethodTypeCode) {
		this.healthCheckHttpMethodTypeCode = healthCheckHttpMethodTypeCode;
	}

	public CreateTargetGroupRequest healthCheckPort(Integer healthCheckPort) {
		this.healthCheckPort = healthCheckPort;
		return this;
	}

	 /**
	 * 헬스체크포트
	 * @return healthCheckPort
	**/
	public Integer getHealthCheckPort() {
		return healthCheckPort;
	}

	public void setHealthCheckPort(Integer healthCheckPort) {
		this.healthCheckPort = healthCheckPort;
	}

	public CreateTargetGroupRequest healthCheckProtocolTypeCode(String healthCheckProtocolTypeCode) {
		this.healthCheckProtocolTypeCode = healthCheckProtocolTypeCode;
		return this;
	}

	 /**
	 * 헬스체크프로토콜유형코드
	 * @return healthCheckProtocolTypeCode
	**/
	public String getHealthCheckProtocolTypeCode() {
		return healthCheckProtocolTypeCode;
	}

	public void setHealthCheckProtocolTypeCode(String healthCheckProtocolTypeCode) {
		this.healthCheckProtocolTypeCode = healthCheckProtocolTypeCode;
	}

	public CreateTargetGroupRequest healthCheckUpThreshold(Integer healthCheckUpThreshold) {
		this.healthCheckUpThreshold = healthCheckUpThreshold;
		return this;
	}

	 /**
	 * 헬스체크정상임계값
	 * @return healthCheckUpThreshold
	**/
	public Integer getHealthCheckUpThreshold() {
		return healthCheckUpThreshold;
	}

	public void setHealthCheckUpThreshold(Integer healthCheckUpThreshold) {
		this.healthCheckUpThreshold = healthCheckUpThreshold;
	}

	public CreateTargetGroupRequest healthCheckUrlPath(String healthCheckUrlPath) {
		this.healthCheckUrlPath = healthCheckUrlPath;
		return this;
	}

	 /**
	 * 헬스체크URL경로
	 * @return healthCheckUrlPath
	**/
	public String getHealthCheckUrlPath() {
		return healthCheckUrlPath;
	}

	public void setHealthCheckUrlPath(String healthCheckUrlPath) {
		this.healthCheckUrlPath = healthCheckUrlPath;
	}

	public CreateTargetGroupRequest targetGroupName(String targetGroupName) {
		this.targetGroupName = targetGroupName;
		return this;
	}

	 /**
	 * 타겟그룹이름
	 * @return targetGroupName
	**/
	public String getTargetGroupName() {
		return targetGroupName;
	}

	public void setTargetGroupName(String targetGroupName) {
		this.targetGroupName = targetGroupName;
	}

	public CreateTargetGroupRequest targetNoList(List<String> targetNoList) {
		this.targetNoList = targetNoList;
		return this;
	}

	public CreateTargetGroupRequest addTargetNoListItem(String targetNoListItem) {
		if (this.targetNoList == null) {
			this.targetNoList = new ArrayList<String>();
		}
		this.targetNoList.add(targetNoListItem);
		return this;
	}

	 /**
	 * 타겟번호리스트
	 * @return targetNoList
	**/
	public List<String> getTargetNoList() {
		return targetNoList;
	}

	public void setTargetNoList(List<String> targetNoList) {
		this.targetNoList = targetNoList;
	}

	public CreateTargetGroupRequest targetTypeCode(String targetTypeCode) {
		this.targetTypeCode = targetTypeCode;
		return this;
	}

	 /**
	 * 타겟유형코드
	 * @return targetTypeCode
	**/
	public String getTargetTypeCode() {
		return targetTypeCode;
	}

	public void setTargetTypeCode(String targetTypeCode) {
		this.targetTypeCode = targetTypeCode;
	}

	public CreateTargetGroupRequest vpcNo(String vpcNo) {
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

	public CreateTargetGroupRequest responseFormatType(String responseFormatType) {
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
		CreateTargetGroupRequest createTargetGroupRequest = (CreateTargetGroupRequest) o;
		return Objects.equals(this.regionCode, createTargetGroupRequest.regionCode) &&
				Objects.equals(this.targetGroupPort, createTargetGroupRequest.targetGroupPort) &&
				Objects.equals(this.targetGroupProtocolTypeCode, createTargetGroupRequest.targetGroupProtocolTypeCode) &&
				Objects.equals(this.targetGroupDescription, createTargetGroupRequest.targetGroupDescription) &&
				Objects.equals(this.healthCheckCycle, createTargetGroupRequest.healthCheckCycle) &&
				Objects.equals(this.healthCheckDownThreshold, createTargetGroupRequest.healthCheckDownThreshold) &&
				Objects.equals(this.healthCheckHttpMethodTypeCode, createTargetGroupRequest.healthCheckHttpMethodTypeCode) &&
				Objects.equals(this.healthCheckPort, createTargetGroupRequest.healthCheckPort) &&
				Objects.equals(this.healthCheckProtocolTypeCode, createTargetGroupRequest.healthCheckProtocolTypeCode) &&
				Objects.equals(this.healthCheckUpThreshold, createTargetGroupRequest.healthCheckUpThreshold) &&
				Objects.equals(this.healthCheckUrlPath, createTargetGroupRequest.healthCheckUrlPath) &&
				Objects.equals(this.targetGroupName, createTargetGroupRequest.targetGroupName) &&
				Objects.equals(this.targetNoList, createTargetGroupRequest.targetNoList) &&
				Objects.equals(this.targetTypeCode, createTargetGroupRequest.targetTypeCode) &&
				Objects.equals(this.vpcNo, createTargetGroupRequest.vpcNo) &&
				Objects.equals(this.responseFormatType, createTargetGroupRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, targetGroupPort, targetGroupProtocolTypeCode, targetGroupDescription, healthCheckCycle, healthCheckDownThreshold, healthCheckHttpMethodTypeCode, healthCheckPort, healthCheckProtocolTypeCode, healthCheckUpThreshold, healthCheckUrlPath, targetGroupName, targetNoList, targetTypeCode, vpcNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateTargetGroupRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		targetGroupPort: ").append(toIndentedString(targetGroupPort)).append("\n");
		sb.append("		targetGroupProtocolTypeCode: ").append(toIndentedString(targetGroupProtocolTypeCode)).append("\n");
		sb.append("		targetGroupDescription: ").append(toIndentedString(targetGroupDescription)).append("\n");
		sb.append("		healthCheckCycle: ").append(toIndentedString(healthCheckCycle)).append("\n");
		sb.append("		healthCheckDownThreshold: ").append(toIndentedString(healthCheckDownThreshold)).append("\n");
		sb.append("		healthCheckHttpMethodTypeCode: ").append(toIndentedString(healthCheckHttpMethodTypeCode)).append("\n");
		sb.append("		healthCheckPort: ").append(toIndentedString(healthCheckPort)).append("\n");
		sb.append("		healthCheckProtocolTypeCode: ").append(toIndentedString(healthCheckProtocolTypeCode)).append("\n");
		sb.append("		healthCheckUpThreshold: ").append(toIndentedString(healthCheckUpThreshold)).append("\n");
		sb.append("		healthCheckUrlPath: ").append(toIndentedString(healthCheckUrlPath)).append("\n");
		sb.append("		targetGroupName: ").append(toIndentedString(targetGroupName)).append("\n");
		sb.append("		targetNoList: ").append(toIndentedString(targetNoList)).append("\n");
		sb.append("		targetTypeCode: ").append(toIndentedString(targetTypeCode)).append("\n");
		sb.append("		vpcNo: ").append(toIndentedString(vpcNo)).append("\n");
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

