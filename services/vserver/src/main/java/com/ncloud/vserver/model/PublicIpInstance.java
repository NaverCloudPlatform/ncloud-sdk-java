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
import com.ncloud.vserver.model.CommonCode;

/**
 * PublicIpInstance
 */
public class PublicIpInstance {
	private String publicIpInstanceNo = null;

	private String publicIp = null;

	private String publicIpDescription = null;

	private String createDate = null;

	private String publicIpInstanceStatusName = null;

	private CommonCode publicIpInstanceStatus = null;

	private String serverInstanceNo = null;

	private String serverName = null;

	private String privateIp = null;

	private String lastModifyDate = null;

	private CommonCode publicIpInstanceOperation = null;

	public PublicIpInstance publicIpInstanceNo(String publicIpInstanceNo) {
		this.publicIpInstanceNo = publicIpInstanceNo;
		return this;
	}

	 /**
	 * 공인IP인스턴스번호
	 * @return publicIpInstanceNo
	**/
	public String getPublicIpInstanceNo() {
		return publicIpInstanceNo;
	}

	public void setPublicIpInstanceNo(String publicIpInstanceNo) {
		this.publicIpInstanceNo = publicIpInstanceNo;
	}

	public PublicIpInstance publicIp(String publicIp) {
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

	public PublicIpInstance publicIpDescription(String publicIpDescription) {
		this.publicIpDescription = publicIpDescription;
		return this;
	}

	 /**
	 * 공인IP설명
	 * @return publicIpDescription
	**/
	public String getPublicIpDescription() {
		return publicIpDescription;
	}

	public void setPublicIpDescription(String publicIpDescription) {
		this.publicIpDescription = publicIpDescription;
	}

	public PublicIpInstance createDate(String createDate) {
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

	public PublicIpInstance publicIpInstanceStatusName(String publicIpInstanceStatusName) {
		this.publicIpInstanceStatusName = publicIpInstanceStatusName;
		return this;
	}

	 /**
	 * 공인IP인스턴스상태이름
	 * @return publicIpInstanceStatusName
	**/
	public String getPublicIpInstanceStatusName() {
		return publicIpInstanceStatusName;
	}

	public void setPublicIpInstanceStatusName(String publicIpInstanceStatusName) {
		this.publicIpInstanceStatusName = publicIpInstanceStatusName;
	}

	public PublicIpInstance publicIpInstanceStatus(CommonCode publicIpInstanceStatus) {
		this.publicIpInstanceStatus = publicIpInstanceStatus;
		return this;
	}

	 /**
	 * 공인IP인스턴스상태
	 * @return publicIpInstanceStatus
	**/
	public CommonCode getPublicIpInstanceStatus() {
		return publicIpInstanceStatus;
	}

	public void setPublicIpInstanceStatus(CommonCode publicIpInstanceStatus) {
		this.publicIpInstanceStatus = publicIpInstanceStatus;
	}

	public PublicIpInstance serverInstanceNo(String serverInstanceNo) {
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

	public PublicIpInstance serverName(String serverName) {
		this.serverName = serverName;
		return this;
	}

	 /**
	 * 서버이름
	 * @return serverName
	**/
	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public PublicIpInstance privateIp(String privateIp) {
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

	public PublicIpInstance lastModifyDate(String lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
		return this;
	}

	 /**
	 * 마지막수정일시
	 * @return lastModifyDate
	**/
	public String getLastModifyDate() {
		return lastModifyDate;
	}

	public void setLastModifyDate(String lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}

	public PublicIpInstance publicIpInstanceOperation(CommonCode publicIpInstanceOperation) {
		this.publicIpInstanceOperation = publicIpInstanceOperation;
		return this;
	}

	 /**
	 * 공인IP인스턴스OP
	 * @return publicIpInstanceOperation
	**/
	public CommonCode getPublicIpInstanceOperation() {
		return publicIpInstanceOperation;
	}

	public void setPublicIpInstanceOperation(CommonCode publicIpInstanceOperation) {
		this.publicIpInstanceOperation = publicIpInstanceOperation;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PublicIpInstance publicIpInstance = (PublicIpInstance) o;
		return Objects.equals(this.publicIpInstanceNo, publicIpInstance.publicIpInstanceNo) &&
				Objects.equals(this.publicIp, publicIpInstance.publicIp) &&
				Objects.equals(this.publicIpDescription, publicIpInstance.publicIpDescription) &&
				Objects.equals(this.createDate, publicIpInstance.createDate) &&
				Objects.equals(this.publicIpInstanceStatusName, publicIpInstance.publicIpInstanceStatusName) &&
				Objects.equals(this.publicIpInstanceStatus, publicIpInstance.publicIpInstanceStatus) &&
				Objects.equals(this.serverInstanceNo, publicIpInstance.serverInstanceNo) &&
				Objects.equals(this.serverName, publicIpInstance.serverName) &&
				Objects.equals(this.privateIp, publicIpInstance.privateIp) &&
				Objects.equals(this.lastModifyDate, publicIpInstance.lastModifyDate) &&
				Objects.equals(this.publicIpInstanceOperation, publicIpInstance.publicIpInstanceOperation);
	}

	@Override
	public int hashCode() {
		return Objects.hash(publicIpInstanceNo, publicIp, publicIpDescription, createDate, publicIpInstanceStatusName, publicIpInstanceStatus, serverInstanceNo, serverName, privateIp, lastModifyDate, publicIpInstanceOperation);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PublicIpInstance {\n");
		
		sb.append("		publicIpInstanceNo: ").append(toIndentedString(publicIpInstanceNo)).append("\n");
		sb.append("		publicIp: ").append(toIndentedString(publicIp)).append("\n");
		sb.append("		publicIpDescription: ").append(toIndentedString(publicIpDescription)).append("\n");
		sb.append("		createDate: ").append(toIndentedString(createDate)).append("\n");
		sb.append("		publicIpInstanceStatusName: ").append(toIndentedString(publicIpInstanceStatusName)).append("\n");
		sb.append("		publicIpInstanceStatus: ").append(toIndentedString(publicIpInstanceStatus)).append("\n");
		sb.append("		serverInstanceNo: ").append(toIndentedString(serverInstanceNo)).append("\n");
		sb.append("		serverName: ").append(toIndentedString(serverName)).append("\n");
		sb.append("		privateIp: ").append(toIndentedString(privateIp)).append("\n");
		sb.append("		lastModifyDate: ").append(toIndentedString(lastModifyDate)).append("\n");
		sb.append("		publicIpInstanceOperation: ").append(toIndentedString(publicIpInstanceOperation)).append("\n");
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

