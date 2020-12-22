/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * OpenAPI spec version: 2020-11-18T09:44:01Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.server.model;

import java.util.Objects;
import com.ncloud.server.model.Region;
import com.ncloud.server.model.Zone;

/**
 * NetworkInterface
 */
public class NetworkInterface {
	private String networkInterfaceNo = null;

	private String networkInterfaceName = null;

	private String networkInterfaceIp = null;

	private String networkInterfaceDescription = null;

	private String serverInstanceNo = null;

	private String statusCode = null;

	private Region region = null;

	private Zone zone = null;

	public NetworkInterface networkInterfaceNo(String networkInterfaceNo) {
		this.networkInterfaceNo = networkInterfaceNo;
		return this;
	}

	 /**
	 * Network Interface번호
	 * @return networkInterfaceNo
	**/
	public String getNetworkInterfaceNo() {
		return networkInterfaceNo;
	}

	public void setNetworkInterfaceNo(String networkInterfaceNo) {
		this.networkInterfaceNo = networkInterfaceNo;
	}

	public NetworkInterface networkInterfaceName(String networkInterfaceName) {
		this.networkInterfaceName = networkInterfaceName;
		return this;
	}

	 /**
	 * Network Interface이름
	 * @return networkInterfaceName
	**/
	public String getNetworkInterfaceName() {
		return networkInterfaceName;
	}

	public void setNetworkInterfaceName(String networkInterfaceName) {
		this.networkInterfaceName = networkInterfaceName;
	}

	public NetworkInterface networkInterfaceIp(String networkInterfaceIp) {
		this.networkInterfaceIp = networkInterfaceIp;
		return this;
	}

	 /**
	 * Network Interface IP
	 * @return networkInterfaceIp
	**/
	public String getNetworkInterfaceIp() {
		return networkInterfaceIp;
	}

	public void setNetworkInterfaceIp(String networkInterfaceIp) {
		this.networkInterfaceIp = networkInterfaceIp;
	}

	public NetworkInterface networkInterfaceDescription(String networkInterfaceDescription) {
		this.networkInterfaceDescription = networkInterfaceDescription;
		return this;
	}

	 /**
	 * Network Interface 설명
	 * @return networkInterfaceDescription
	**/
	public String getNetworkInterfaceDescription() {
		return networkInterfaceDescription;
	}

	public void setNetworkInterfaceDescription(String networkInterfaceDescription) {
		this.networkInterfaceDescription = networkInterfaceDescription;
	}

	public NetworkInterface serverInstanceNo(String serverInstanceNo) {
		this.serverInstanceNo = serverInstanceNo;
		return this;
	}

	 /**
	 * 서버인스턴스번호
	 * @return serverInstanceNo
	**/
	public String getServerInstanceNo() {
		return serverInstanceNo;
	}

	public void setServerInstanceNo(String serverInstanceNo) {
		this.serverInstanceNo = serverInstanceNo;
	}

	public NetworkInterface statusCode(String statusCode) {
		this.statusCode = statusCode;
		return this;
	}

	 /**
	 * 상태코드
	 * @return statusCode
	**/
	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public NetworkInterface region(Region region) {
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

	public NetworkInterface zone(Zone zone) {
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
		NetworkInterface networkInterface = (NetworkInterface) o;
		return Objects.equals(this.networkInterfaceNo, networkInterface.networkInterfaceNo) &&
				Objects.equals(this.networkInterfaceName, networkInterface.networkInterfaceName) &&
				Objects.equals(this.networkInterfaceIp, networkInterface.networkInterfaceIp) &&
				Objects.equals(this.networkInterfaceDescription, networkInterface.networkInterfaceDescription) &&
				Objects.equals(this.serverInstanceNo, networkInterface.serverInstanceNo) &&
				Objects.equals(this.statusCode, networkInterface.statusCode) &&
				Objects.equals(this.region, networkInterface.region) &&
				Objects.equals(this.zone, networkInterface.zone);
	}

	@Override
	public int hashCode() {
		return Objects.hash(networkInterfaceNo, networkInterfaceName, networkInterfaceIp, networkInterfaceDescription, serverInstanceNo, statusCode, region, zone);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NetworkInterface {\n");
		
		sb.append("		networkInterfaceNo: ").append(toIndentedString(networkInterfaceNo)).append("\n");
		sb.append("		networkInterfaceName: ").append(toIndentedString(networkInterfaceName)).append("\n");
		sb.append("		networkInterfaceIp: ").append(toIndentedString(networkInterfaceIp)).append("\n");
		sb.append("		networkInterfaceDescription: ").append(toIndentedString(networkInterfaceDescription)).append("\n");
		sb.append("		serverInstanceNo: ").append(toIndentedString(serverInstanceNo)).append("\n");
		sb.append("		statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

