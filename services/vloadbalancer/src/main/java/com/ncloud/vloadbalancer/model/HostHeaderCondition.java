/*
 * vloadbalancer
 * VPC Load Balancer 관련 API<br/>https://ncloud.apigw.ntruss.com/vloadbalancer/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vloadbalancer.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * HostHeaderCondition
 */
public class HostHeaderCondition {
	private List<String> hostHeaderList = null;

	public HostHeaderCondition hostHeaderList(List<String> hostHeaderList) {
		this.hostHeaderList = hostHeaderList;
		return this;
	}

	public HostHeaderCondition addHostHeaderListItem(String hostHeaderListItem) {
		if (this.hostHeaderList == null) {
			this.hostHeaderList = new ArrayList<String>();
		}
		this.hostHeaderList.add(hostHeaderListItem);
		return this;
	}

	 /**
	 * 호스트헤더리스트
	 * @return hostHeaderList
	**/
	public List<String> getHostHeaderList() {
		return hostHeaderList;
	}

	public void setHostHeaderList(List<String> hostHeaderList) {
		this.hostHeaderList = hostHeaderList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HostHeaderCondition hostHeaderCondition = (HostHeaderCondition) o;
		return Objects.equals(this.hostHeaderList, hostHeaderCondition.hostHeaderList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(hostHeaderList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HostHeaderCondition {\n");
		
		sb.append("		hostHeaderList: ").append(toIndentedString(hostHeaderList)).append("\n");
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

