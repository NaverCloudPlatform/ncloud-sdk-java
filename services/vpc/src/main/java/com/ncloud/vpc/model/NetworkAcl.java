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
 * NetworkAcl
 */
public class NetworkAcl {
	private String networkAclNo = null;

	private String networkAclName = null;

	private String vpcNo = null;

	private CommonCode networkAclStatus = null;

	private String networkAclDescription = null;

	private String createDate = null;

	private Boolean isDefault = null;

	public NetworkAcl networkAclNo(String networkAclNo) {
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

	public NetworkAcl networkAclName(String networkAclName) {
		this.networkAclName = networkAclName;
		return this;
	}

	 /**
	 * 네트워크ACL이름
	 * @return networkAclName
	**/
	public String getNetworkAclName() {
		return networkAclName;
	}

	public void setNetworkAclName(String networkAclName) {
		this.networkAclName = networkAclName;
	}

	public NetworkAcl vpcNo(String vpcNo) {
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

	public NetworkAcl networkAclStatus(CommonCode networkAclStatus) {
		this.networkAclStatus = networkAclStatus;
		return this;
	}

	 /**
	 * 네트워크ACL상태
	 * @return networkAclStatus
	**/
	public CommonCode getNetworkAclStatus() {
		return networkAclStatus;
	}

	public void setNetworkAclStatus(CommonCode networkAclStatus) {
		this.networkAclStatus = networkAclStatus;
	}

	public NetworkAcl networkAclDescription(String networkAclDescription) {
		this.networkAclDescription = networkAclDescription;
		return this;
	}

	 /**
	 * 네트워크ACL설명
	 * @return networkAclDescription
	**/
	public String getNetworkAclDescription() {
		return networkAclDescription;
	}

	public void setNetworkAclDescription(String networkAclDescription) {
		this.networkAclDescription = networkAclDescription;
	}

	public NetworkAcl createDate(String createDate) {
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

	public NetworkAcl isDefault(Boolean isDefault) {
		this.isDefault = isDefault;
		return this;
	}

	 /**
	 * Default여부
	 * @return isDefault
	**/
	public Boolean isIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		NetworkAcl networkAcl = (NetworkAcl) o;
		return Objects.equals(this.networkAclNo, networkAcl.networkAclNo) &&
				Objects.equals(this.networkAclName, networkAcl.networkAclName) &&
				Objects.equals(this.vpcNo, networkAcl.vpcNo) &&
				Objects.equals(this.networkAclStatus, networkAcl.networkAclStatus) &&
				Objects.equals(this.networkAclDescription, networkAcl.networkAclDescription) &&
				Objects.equals(this.createDate, networkAcl.createDate) &&
				Objects.equals(this.isDefault, networkAcl.isDefault);
	}

	@Override
	public int hashCode() {
		return Objects.hash(networkAclNo, networkAclName, vpcNo, networkAclStatus, networkAclDescription, createDate, isDefault);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NetworkAcl {\n");
		
		sb.append("		networkAclNo: ").append(toIndentedString(networkAclNo)).append("\n");
		sb.append("		networkAclName: ").append(toIndentedString(networkAclName)).append("\n");
		sb.append("		vpcNo: ").append(toIndentedString(vpcNo)).append("\n");
		sb.append("		networkAclStatus: ").append(toIndentedString(networkAclStatus)).append("\n");
		sb.append("		networkAclDescription: ").append(toIndentedString(networkAclDescription)).append("\n");
		sb.append("		createDate: ").append(toIndentedString(createDate)).append("\n");
		sb.append("		isDefault: ").append(toIndentedString(isDefault)).append("\n");
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

