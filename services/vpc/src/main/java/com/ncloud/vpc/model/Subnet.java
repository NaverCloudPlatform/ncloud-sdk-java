/*
 * vpc
 * VPC Network 관련 API<br/>https://ncloud.apigw.ntruss.com/vpc/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vpc.model;

import java.util.Objects;
import com.ncloud.vpc.model.CommonCode;

/**
 * Subnet
 */
public class Subnet {
	private String subnetNo = null;

	private String vpcNo = null;

	private String zoneCode = null;

	private String subnetName = null;

	private String subnet = null;

	private CommonCode subnetStatus = null;

	private String createDate = null;

	private CommonCode subnetType = null;

	private CommonCode usageType = null;

	private String networkAclNo = null;

	public Subnet subnetNo(String subnetNo) {
		this.subnetNo = subnetNo;
		return this;
	}

	 /**
	 * 서브넷번호
	 * @return subnetNo
	**/
	public String getSubnetNo() {
		return subnetNo;
	}

	public void setSubnetNo(String subnetNo) {
		this.subnetNo = subnetNo;
	}

	public Subnet vpcNo(String vpcNo) {
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

	public Subnet zoneCode(String zoneCode) {
		this.zoneCode = zoneCode;
		return this;
	}

	 /**
	 * ZONE코드
	 * @return zoneCode
	**/
	public String getZoneCode() {
		return zoneCode;
	}

	public void setZoneCode(String zoneCode) {
		this.zoneCode = zoneCode;
	}

	public Subnet subnetName(String subnetName) {
		this.subnetName = subnetName;
		return this;
	}

	 /**
	 * 서브넷이름
	 * @return subnetName
	**/
	public String getSubnetName() {
		return subnetName;
	}

	public void setSubnetName(String subnetName) {
		this.subnetName = subnetName;
	}

	public Subnet subnet(String subnet) {
		this.subnet = subnet;
		return this;
	}

	 /**
	 * 서브넷
	 * @return subnet
	**/
	public String getSubnet() {
		return subnet;
	}

	public void setSubnet(String subnet) {
		this.subnet = subnet;
	}

	public Subnet subnetStatus(CommonCode subnetStatus) {
		this.subnetStatus = subnetStatus;
		return this;
	}

	 /**
	 * 서브넷상태
	 * @return subnetStatus
	**/
	public CommonCode getSubnetStatus() {
		return subnetStatus;
	}

	public void setSubnetStatus(CommonCode subnetStatus) {
		this.subnetStatus = subnetStatus;
	}

	public Subnet createDate(String createDate) {
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

	public Subnet subnetType(CommonCode subnetType) {
		this.subnetType = subnetType;
		return this;
	}

	 /**
	 * 서브넷유형
	 * @return subnetType
	**/
	public CommonCode getSubnetType() {
		return subnetType;
	}

	public void setSubnetType(CommonCode subnetType) {
		this.subnetType = subnetType;
	}

	public Subnet usageType(CommonCode usageType) {
		this.usageType = usageType;
		return this;
	}

	 /**
	 * 용도유형
	 * @return usageType
	**/
	public CommonCode getUsageType() {
		return usageType;
	}

	public void setUsageType(CommonCode usageType) {
		this.usageType = usageType;
	}

	public Subnet networkAclNo(String networkAclNo) {
		this.networkAclNo = networkAclNo;
		return this;
	}

	 /**
	 * 네트워크ACL번호
	 * @return networkAclNo
	**/
	public String getNetworkAclNo() {
		return networkAclNo;
	}

	public void setNetworkAclNo(String networkAclNo) {
		this.networkAclNo = networkAclNo;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Subnet subnet = (Subnet) o;
		return Objects.equals(this.subnetNo, subnet.subnetNo) &&
				Objects.equals(this.vpcNo, subnet.vpcNo) &&
				Objects.equals(this.zoneCode, subnet.zoneCode) &&
				Objects.equals(this.subnetName, subnet.subnetName) &&
				Objects.equals(this.subnet, subnet.subnet) &&
				Objects.equals(this.subnetStatus, subnet.subnetStatus) &&
				Objects.equals(this.createDate, subnet.createDate) &&
				Objects.equals(this.subnetType, subnet.subnetType) &&
				Objects.equals(this.usageType, subnet.usageType) &&
				Objects.equals(this.networkAclNo, subnet.networkAclNo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(subnetNo, vpcNo, zoneCode, subnetName, subnet, subnetStatus, createDate, subnetType, usageType, networkAclNo);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Subnet {\n");
		
		sb.append("		subnetNo: ").append(toIndentedString(subnetNo)).append("\n");
		sb.append("		vpcNo: ").append(toIndentedString(vpcNo)).append("\n");
		sb.append("		zoneCode: ").append(toIndentedString(zoneCode)).append("\n");
		sb.append("		subnetName: ").append(toIndentedString(subnetName)).append("\n");
		sb.append("		subnet: ").append(toIndentedString(subnet)).append("\n");
		sb.append("		subnetStatus: ").append(toIndentedString(subnetStatus)).append("\n");
		sb.append("		createDate: ").append(toIndentedString(createDate)).append("\n");
		sb.append("		subnetType: ").append(toIndentedString(subnetType)).append("\n");
		sb.append("		usageType: ").append(toIndentedString(usageType)).append("\n");
		sb.append("		networkAclNo: ").append(toIndentedString(networkAclNo)).append("\n");
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

