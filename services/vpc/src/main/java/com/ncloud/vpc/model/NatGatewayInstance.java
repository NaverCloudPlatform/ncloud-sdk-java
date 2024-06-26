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
 * NatGatewayInstance
 */
public class NatGatewayInstance {
	private String vpcNo = null;

	private String vpcName = null;

	private String natGatewayInstanceNo = null;

	private String natGatewayName = null;

	private String publicIp = null;

	private CommonCode natGatewayInstanceStatus = null;

	private String natGatewayInstanceStatusName = null;

	private CommonCode natGatewayInstanceOperation = null;

	private String createDate = null;

	private String natGatewayDescription = null;

	private String zoneCode = null;

	private CommonCode natGatewayType = null;

	private String subnetNo = null;

	private String subnetName = null;

	private String publicIpInstanceNo = null;

	private String privateIp = null;

	public NatGatewayInstance vpcNo(String vpcNo) {
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

	public NatGatewayInstance vpcName(String vpcName) {
		this.vpcName = vpcName;
		return this;
	}

	 /**
	 * VPC이름
	 * @return vpcName
	**/
	public String getVpcName() {
		return vpcName;
	}

	public void setVpcName(String vpcName) {
		this.vpcName = vpcName;
	}

	public NatGatewayInstance natGatewayInstanceNo(String natGatewayInstanceNo) {
		this.natGatewayInstanceNo = natGatewayInstanceNo;
		return this;
	}

	 /**
	 * NATGateway인스턴스번호
	 * @return natGatewayInstanceNo
	**/
	public String getNatGatewayInstanceNo() {
		return natGatewayInstanceNo;
	}

	public void setNatGatewayInstanceNo(String natGatewayInstanceNo) {
		this.natGatewayInstanceNo = natGatewayInstanceNo;
	}

	public NatGatewayInstance natGatewayName(String natGatewayName) {
		this.natGatewayName = natGatewayName;
		return this;
	}

	 /**
	 * NATGateway이름
	 * @return natGatewayName
	**/
	public String getNatGatewayName() {
		return natGatewayName;
	}

	public void setNatGatewayName(String natGatewayName) {
		this.natGatewayName = natGatewayName;
	}

	public NatGatewayInstance publicIp(String publicIp) {
		this.publicIp = publicIp;
		return this;
	}

	 /**
	 * 공인IP주소
	 * @return publicIp
	**/
	public String getPublicIp() {
		return publicIp;
	}

	public void setPublicIp(String publicIp) {
		this.publicIp = publicIp;
	}

	public NatGatewayInstance natGatewayInstanceStatus(CommonCode natGatewayInstanceStatus) {
		this.natGatewayInstanceStatus = natGatewayInstanceStatus;
		return this;
	}

	 /**
	 * NATGateway인스턴스상태
	 * @return natGatewayInstanceStatus
	**/
	public CommonCode getNatGatewayInstanceStatus() {
		return natGatewayInstanceStatus;
	}

	public void setNatGatewayInstanceStatus(CommonCode natGatewayInstanceStatus) {
		this.natGatewayInstanceStatus = natGatewayInstanceStatus;
	}

	public NatGatewayInstance natGatewayInstanceStatusName(String natGatewayInstanceStatusName) {
		this.natGatewayInstanceStatusName = natGatewayInstanceStatusName;
		return this;
	}

	 /**
	 * NATGateway인스턴스상태이름
	 * @return natGatewayInstanceStatusName
	**/
	public String getNatGatewayInstanceStatusName() {
		return natGatewayInstanceStatusName;
	}

	public void setNatGatewayInstanceStatusName(String natGatewayInstanceStatusName) {
		this.natGatewayInstanceStatusName = natGatewayInstanceStatusName;
	}

	public NatGatewayInstance natGatewayInstanceOperation(CommonCode natGatewayInstanceOperation) {
		this.natGatewayInstanceOperation = natGatewayInstanceOperation;
		return this;
	}

	 /**
	 * NATGateway인스턴스OP
	 * @return natGatewayInstanceOperation
	**/
	public CommonCode getNatGatewayInstanceOperation() {
		return natGatewayInstanceOperation;
	}

	public void setNatGatewayInstanceOperation(CommonCode natGatewayInstanceOperation) {
		this.natGatewayInstanceOperation = natGatewayInstanceOperation;
	}

	public NatGatewayInstance createDate(String createDate) {
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

	public NatGatewayInstance natGatewayDescription(String natGatewayDescription) {
		this.natGatewayDescription = natGatewayDescription;
		return this;
	}

	 /**
	 * NATGateway설명
	 * @return natGatewayDescription
	**/
	public String getNatGatewayDescription() {
		return natGatewayDescription;
	}

	public void setNatGatewayDescription(String natGatewayDescription) {
		this.natGatewayDescription = natGatewayDescription;
	}

	public NatGatewayInstance zoneCode(String zoneCode) {
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

	public NatGatewayInstance natGatewayType(CommonCode natGatewayType) {
		this.natGatewayType = natGatewayType;
		return this;
	}

	 /**
	 * NATGateay 유형
	 * @return natGatewayType
	**/
	public CommonCode getNatGatewayType() {
		return natGatewayType;
	}

	public void setNatGatewayType(CommonCode natGatewayType) {
		this.natGatewayType = natGatewayType;
	}

	public NatGatewayInstance subnetNo(String subnetNo) {
		this.subnetNo = subnetNo;
		return this;
	}

	 /**
	 * Subnet번호
	 * @return subnetNo
	**/
	public String getSubnetNo() {
		return subnetNo;
	}

	public void setSubnetNo(String subnetNo) {
		this.subnetNo = subnetNo;
	}

	public NatGatewayInstance subnetName(String subnetName) {
		this.subnetName = subnetName;
		return this;
	}

	 /**
	 * Subnet이름
	 * @return subnetName
	**/
	public String getSubnetName() {
		return subnetName;
	}

	public void setSubnetName(String subnetName) {
		this.subnetName = subnetName;
	}

	public NatGatewayInstance publicIpInstanceNo(String publicIpInstanceNo) {
		this.publicIpInstanceNo = publicIpInstanceNo;
		return this;
	}

	 /**
	 * 공인아이피인스턴스번호
	 * @return publicIpInstanceNo
	**/
	public String getPublicIpInstanceNo() {
		return publicIpInstanceNo;
	}

	public void setPublicIpInstanceNo(String publicIpInstanceNo) {
		this.publicIpInstanceNo = publicIpInstanceNo;
	}

	public NatGatewayInstance privateIp(String privateIp) {
		this.privateIp = privateIp;
		return this;
	}

	 /**
	 * 사설IP주소
	 * @return privateIp
	**/
	public String getPrivateIp() {
		return privateIp;
	}

	public void setPrivateIp(String privateIp) {
		this.privateIp = privateIp;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		NatGatewayInstance natGatewayInstance = (NatGatewayInstance) o;
		return Objects.equals(this.vpcNo, natGatewayInstance.vpcNo) &&
				Objects.equals(this.vpcName, natGatewayInstance.vpcName) &&
				Objects.equals(this.natGatewayInstanceNo, natGatewayInstance.natGatewayInstanceNo) &&
				Objects.equals(this.natGatewayName, natGatewayInstance.natGatewayName) &&
				Objects.equals(this.publicIp, natGatewayInstance.publicIp) &&
				Objects.equals(this.natGatewayInstanceStatus, natGatewayInstance.natGatewayInstanceStatus) &&
				Objects.equals(this.natGatewayInstanceStatusName, natGatewayInstance.natGatewayInstanceStatusName) &&
				Objects.equals(this.natGatewayInstanceOperation, natGatewayInstance.natGatewayInstanceOperation) &&
				Objects.equals(this.createDate, natGatewayInstance.createDate) &&
				Objects.equals(this.natGatewayDescription, natGatewayInstance.natGatewayDescription) &&
				Objects.equals(this.zoneCode, natGatewayInstance.zoneCode) &&
				Objects.equals(this.natGatewayType, natGatewayInstance.natGatewayType) &&
				Objects.equals(this.subnetNo, natGatewayInstance.subnetNo) &&
				Objects.equals(this.subnetName, natGatewayInstance.subnetName) &&
				Objects.equals(this.publicIpInstanceNo, natGatewayInstance.publicIpInstanceNo) &&
				Objects.equals(this.privateIp, natGatewayInstance.privateIp);
	}

	@Override
	public int hashCode() {
		return Objects.hash(vpcNo, vpcName, natGatewayInstanceNo, natGatewayName, publicIp, natGatewayInstanceStatus, natGatewayInstanceStatusName, natGatewayInstanceOperation, createDate, natGatewayDescription, zoneCode, natGatewayType, subnetNo, subnetName, publicIpInstanceNo, privateIp);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NatGatewayInstance {\n");
		
		sb.append("		vpcNo: ").append(toIndentedString(vpcNo)).append("\n");
		sb.append("		vpcName: ").append(toIndentedString(vpcName)).append("\n");
		sb.append("		natGatewayInstanceNo: ").append(toIndentedString(natGatewayInstanceNo)).append("\n");
		sb.append("		natGatewayName: ").append(toIndentedString(natGatewayName)).append("\n");
		sb.append("		publicIp: ").append(toIndentedString(publicIp)).append("\n");
		sb.append("		natGatewayInstanceStatus: ").append(toIndentedString(natGatewayInstanceStatus)).append("\n");
		sb.append("		natGatewayInstanceStatusName: ").append(toIndentedString(natGatewayInstanceStatusName)).append("\n");
		sb.append("		natGatewayInstanceOperation: ").append(toIndentedString(natGatewayInstanceOperation)).append("\n");
		sb.append("		createDate: ").append(toIndentedString(createDate)).append("\n");
		sb.append("		natGatewayDescription: ").append(toIndentedString(natGatewayDescription)).append("\n");
		sb.append("		zoneCode: ").append(toIndentedString(zoneCode)).append("\n");
		sb.append("		natGatewayType: ").append(toIndentedString(natGatewayType)).append("\n");
		sb.append("		subnetNo: ").append(toIndentedString(subnetNo)).append("\n");
		sb.append("		subnetName: ").append(toIndentedString(subnetName)).append("\n");
		sb.append("		publicIpInstanceNo: ").append(toIndentedString(publicIpInstanceNo)).append("\n");
		sb.append("		privateIp: ").append(toIndentedString(privateIp)).append("\n");
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

