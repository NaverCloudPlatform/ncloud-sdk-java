/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * OpenAPI spec version: 2021-03-04T10:39:42Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.server.model;

import java.util.Objects;
import com.ncloud.server.model.CommonCode;
import com.ncloud.server.model.Region;
import com.ncloud.server.model.Zone;

/**
 * PrivateSubnetInstance
 */
public class PrivateSubnetInstance {
	private String privateSubnetInstanceNo = null;

	private String subnet = null;

	private String privateSubnetDescription = null;

	private String createDate = null;

	private CommonCode privateSubnetInstanceStatus = null;

	private CommonCode privateSubnetInstanceOperation = null;

	private String privateSubnetInstanceStatusName = null;

	private Region region = null;

	private Zone zone = null;

	public PrivateSubnetInstance privateSubnetInstanceNo(String privateSubnetInstanceNo) {
		this.privateSubnetInstanceNo = privateSubnetInstanceNo;
		return this;
	}

	 /**
	 * Private Subnet인스턴스번호
	 * @return privateSubnetInstanceNo
	**/
	public String getPrivateSubnetInstanceNo() {
		return privateSubnetInstanceNo;
	}

	public void setPrivateSubnetInstanceNo(String privateSubnetInstanceNo) {
		this.privateSubnetInstanceNo = privateSubnetInstanceNo;
	}

	public PrivateSubnetInstance subnet(String subnet) {
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

	public PrivateSubnetInstance privateSubnetDescription(String privateSubnetDescription) {
		this.privateSubnetDescription = privateSubnetDescription;
		return this;
	}

	 /**
	 * Private Subnet설명
	 * @return privateSubnetDescription
	**/
	public String getPrivateSubnetDescription() {
		return privateSubnetDescription;
	}

	public void setPrivateSubnetDescription(String privateSubnetDescription) {
		this.privateSubnetDescription = privateSubnetDescription;
	}

	public PrivateSubnetInstance createDate(String createDate) {
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

	public PrivateSubnetInstance privateSubnetInstanceStatus(CommonCode privateSubnetInstanceStatus) {
		this.privateSubnetInstanceStatus = privateSubnetInstanceStatus;
		return this;
	}

	 /**
	 * Private Subnet인스턴스상태
	 * @return privateSubnetInstanceStatus
	**/
	public CommonCode getPrivateSubnetInstanceStatus() {
		return privateSubnetInstanceStatus;
	}

	public void setPrivateSubnetInstanceStatus(CommonCode privateSubnetInstanceStatus) {
		this.privateSubnetInstanceStatus = privateSubnetInstanceStatus;
	}

	public PrivateSubnetInstance privateSubnetInstanceOperation(CommonCode privateSubnetInstanceOperation) {
		this.privateSubnetInstanceOperation = privateSubnetInstanceOperation;
		return this;
	}

	 /**
	 * Private Subnet OP
	 * @return privateSubnetInstanceOperation
	**/
	public CommonCode getPrivateSubnetInstanceOperation() {
		return privateSubnetInstanceOperation;
	}

	public void setPrivateSubnetInstanceOperation(CommonCode privateSubnetInstanceOperation) {
		this.privateSubnetInstanceOperation = privateSubnetInstanceOperation;
	}

	public PrivateSubnetInstance privateSubnetInstanceStatusName(String privateSubnetInstanceStatusName) {
		this.privateSubnetInstanceStatusName = privateSubnetInstanceStatusName;
		return this;
	}

	 /**
	 * Private Subnet상태이름
	 * @return privateSubnetInstanceStatusName
	**/
	public String getPrivateSubnetInstanceStatusName() {
		return privateSubnetInstanceStatusName;
	}

	public void setPrivateSubnetInstanceStatusName(String privateSubnetInstanceStatusName) {
		this.privateSubnetInstanceStatusName = privateSubnetInstanceStatusName;
	}

	public PrivateSubnetInstance region(Region region) {
		this.region = region;
		return this;
	}

	 /**
	 * 리전
	 * @return region
	**/
	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public PrivateSubnetInstance zone(Zone zone) {
		this.zone = zone;
		return this;
	}

	 /**
	 * ZONE
	 * @return zone
	**/
	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PrivateSubnetInstance privateSubnetInstance = (PrivateSubnetInstance) o;
		return Objects.equals(this.privateSubnetInstanceNo, privateSubnetInstance.privateSubnetInstanceNo) &&
				Objects.equals(this.subnet, privateSubnetInstance.subnet) &&
				Objects.equals(this.privateSubnetDescription, privateSubnetInstance.privateSubnetDescription) &&
				Objects.equals(this.createDate, privateSubnetInstance.createDate) &&
				Objects.equals(this.privateSubnetInstanceStatus, privateSubnetInstance.privateSubnetInstanceStatus) &&
				Objects.equals(this.privateSubnetInstanceOperation, privateSubnetInstance.privateSubnetInstanceOperation) &&
				Objects.equals(this.privateSubnetInstanceStatusName, privateSubnetInstance.privateSubnetInstanceStatusName) &&
				Objects.equals(this.region, privateSubnetInstance.region) &&
				Objects.equals(this.zone, privateSubnetInstance.zone);
	}

	@Override
	public int hashCode() {
		return Objects.hash(privateSubnetInstanceNo, subnet, privateSubnetDescription, createDate, privateSubnetInstanceStatus, privateSubnetInstanceOperation, privateSubnetInstanceStatusName, region, zone);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PrivateSubnetInstance {\n");
		
		sb.append("		privateSubnetInstanceNo: ").append(toIndentedString(privateSubnetInstanceNo)).append("\n");
		sb.append("		subnet: ").append(toIndentedString(subnet)).append("\n");
		sb.append("		privateSubnetDescription: ").append(toIndentedString(privateSubnetDescription)).append("\n");
		sb.append("		createDate: ").append(toIndentedString(createDate)).append("\n");
		sb.append("		privateSubnetInstanceStatus: ").append(toIndentedString(privateSubnetInstanceStatus)).append("\n");
		sb.append("		privateSubnetInstanceOperation: ").append(toIndentedString(privateSubnetInstanceOperation)).append("\n");
		sb.append("		privateSubnetInstanceStatusName: ").append(toIndentedString(privateSubnetInstanceStatusName)).append("\n");
		sb.append("		region: ").append(toIndentedString(region)).append("\n");
		sb.append("		zone: ").append(toIndentedString(zone)).append("\n");
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

