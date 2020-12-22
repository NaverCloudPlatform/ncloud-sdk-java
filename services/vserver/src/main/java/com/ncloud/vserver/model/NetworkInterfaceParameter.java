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
import java.util.ArrayList;
import java.util.List;

/**
 * NetworkInterfaceParameter
 */
public class NetworkInterfaceParameter {
	private Integer networkInterfaceOrder = null;

	private String networkInterfaceNo = null;

	private String subnetNo = null;

	private String ip = null;

	private List<String> accessControlGroupNoList = new ArrayList<String>();

	public NetworkInterfaceParameter networkInterfaceOrder(Integer networkInterfaceOrder) {
		this.networkInterfaceOrder = networkInterfaceOrder;
		return this;
	}

	 /**
	 * 네트워크인터페이스순서
	 * @return networkInterfaceOrder
	**/
	public Integer getNetworkInterfaceOrder() {
		return networkInterfaceOrder;
	}

	public void setNetworkInterfaceOrder(Integer networkInterfaceOrder) {
		this.networkInterfaceOrder = networkInterfaceOrder;
	}

	public NetworkInterfaceParameter networkInterfaceNo(String networkInterfaceNo) {
		this.networkInterfaceNo = networkInterfaceNo;
		return this;
	}

	 /**
	 * 네트워크인터페이스번호
	 * @return networkInterfaceNo
	**/
	public String getNetworkInterfaceNo() {
		return networkInterfaceNo;
	}

	public void setNetworkInterfaceNo(String networkInterfaceNo) {
		this.networkInterfaceNo = networkInterfaceNo;
	}

	public NetworkInterfaceParameter subnetNo(String subnetNo) {
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

	public NetworkInterfaceParameter ip(String ip) {
		this.ip = ip;
		return this;
	}

	 /**
	 * IP주소
	 * @return ip
	**/
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public NetworkInterfaceParameter accessControlGroupNoList(List<String> accessControlGroupNoList) {
		this.accessControlGroupNoList = accessControlGroupNoList;
		return this;
	}

	public NetworkInterfaceParameter addAccessControlGroupNoListItem(String accessControlGroupNoListItem) {
		this.accessControlGroupNoList.add(accessControlGroupNoListItem);
		return this;
	}

	 /**
	 * ACG번호리스트
	 * @return accessControlGroupNoList
	**/
	public List<String> getAccessControlGroupNoList() {
		return accessControlGroupNoList;
	}

	public void setAccessControlGroupNoList(List<String> accessControlGroupNoList) {
		this.accessControlGroupNoList = accessControlGroupNoList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		NetworkInterfaceParameter networkInterfaceParameter = (NetworkInterfaceParameter) o;
		return Objects.equals(this.networkInterfaceOrder, networkInterfaceParameter.networkInterfaceOrder) &&
				Objects.equals(this.networkInterfaceNo, networkInterfaceParameter.networkInterfaceNo) &&
				Objects.equals(this.subnetNo, networkInterfaceParameter.subnetNo) &&
				Objects.equals(this.ip, networkInterfaceParameter.ip) &&
				Objects.equals(this.accessControlGroupNoList, networkInterfaceParameter.accessControlGroupNoList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(networkInterfaceOrder, networkInterfaceNo, subnetNo, ip, accessControlGroupNoList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NetworkInterfaceParameter {\n");
		
		sb.append("		networkInterfaceOrder: ").append(toIndentedString(networkInterfaceOrder)).append("\n");
		sb.append("		networkInterfaceNo: ").append(toIndentedString(networkInterfaceNo)).append("\n");
		sb.append("		subnetNo: ").append(toIndentedString(subnetNo)).append("\n");
		sb.append("		ip: ").append(toIndentedString(ip)).append("\n");
		sb.append("		accessControlGroupNoList: ").append(toIndentedString(accessControlGroupNoList)).append("\n");
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

