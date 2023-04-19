/*
 * vnks
 * <br/>https://nks.apigw.ntruss.com/vnks/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vnks.model;

import java.util.Objects;
import com.ncloud.vnks.model.AutoscaleOption;
import java.util.ArrayList;
import java.util.List;

/**
 * NodePoolRes
 */
public class NodePoolRes {
	private Integer instanceNo = null;

	private Boolean isDefault = null;

	private String name = null;

	private Integer nodeCount = null;

	private List<Integer> subnetNoList = null;

	private List<String> subnetNameList = null;

	private String productCode = null;

	private String status = null;

	private String k8sVersion = null;

	private AutoscaleOption autoscale = null;

	public NodePoolRes instanceNo(Integer instanceNo) {
		this.instanceNo = instanceNo;
		return this;
	}

	 /**
	 * 인스턴스 No
	 * @return instanceNo
	**/
	public Integer getInstanceNo() {
		return instanceNo;
	}

	public void setInstanceNo(Integer instanceNo) {
		this.instanceNo = instanceNo;
	}

	public NodePoolRes isDefault(Boolean isDefault) {
		this.isDefault = isDefault;
		return this;
	}

	 /**
	 * default pool 여부
	 * @return isDefault
	**/
	public Boolean isIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public NodePoolRes name(String name) {
		this.name = name;
		return this;
	}

	 /**
	 * 노드풀 이름
	 * @return name
	**/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NodePoolRes nodeCount(Integer nodeCount) {
		this.nodeCount = nodeCount;
		return this;
	}

	 /**
	 * 노드 개수
	 * @return nodeCount
	**/
	public Integer getNodeCount() {
		return nodeCount;
	}

	public void setNodeCount(Integer nodeCount) {
		this.nodeCount = nodeCount;
	}

	public NodePoolRes subnetNoList(List<Integer> subnetNoList) {
		this.subnetNoList = subnetNoList;
		return this;
	}

	public NodePoolRes addSubnetNoListItem(Integer subnetNoListItem) {
		if (this.subnetNoList == null) {
			this.subnetNoList = new ArrayList<Integer>();
		}
		this.subnetNoList.add(subnetNoListItem);
		return this;
	}

	 /**
	 * Subnet no list
	 * @return subnetNoList
	**/
	public List<Integer> getSubnetNoList() {
		return subnetNoList;
	}

	public void setSubnetNoList(List<Integer> subnetNoList) {
		this.subnetNoList = subnetNoList;
	}

	public NodePoolRes subnetNameList(List<String> subnetNameList) {
		this.subnetNameList = subnetNameList;
		return this;
	}

	public NodePoolRes addSubnetNameListItem(String subnetNameListItem) {
		if (this.subnetNameList == null) {
			this.subnetNameList = new ArrayList<String>();
		}
		this.subnetNameList.add(subnetNameListItem);
		return this;
	}

	 /**
	 * Subnet name list
	 * @return subnetNameList
	**/
	public List<String> getSubnetNameList() {
		return subnetNameList;
	}

	public void setSubnetNameList(List<String> subnetNameList) {
		this.subnetNameList = subnetNameList;
	}

	public NodePoolRes productCode(String productCode) {
		this.productCode = productCode;
		return this;
	}

	 /**
	 * 상품 코드
	 * @return productCode
	**/
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public NodePoolRes status(String status) {
		this.status = status;
		return this;
	}

	 /**
	 * 노드풀 상태
	 * @return status
	**/
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public NodePoolRes k8sVersion(String k8sVersion) {
		this.k8sVersion = k8sVersion;
		return this;
	}

	 /**
	 * k8s version
	 * @return k8sVersion
	**/
	public String getK8sVersion() {
		return k8sVersion;
	}

	public void setK8sVersion(String k8sVersion) {
		this.k8sVersion = k8sVersion;
	}

	public NodePoolRes autoscale(AutoscaleOption autoscale) {
		this.autoscale = autoscale;
		return this;
	}

	 /**
	 * 오토스케일
	 * @return autoscale
	**/
	public AutoscaleOption getAutoscale() {
		return autoscale;
	}

	public void setAutoscale(AutoscaleOption autoscale) {
		this.autoscale = autoscale;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		NodePoolRes nodePoolRes = (NodePoolRes) o;
		return Objects.equals(this.instanceNo, nodePoolRes.instanceNo) &&
				Objects.equals(this.isDefault, nodePoolRes.isDefault) &&
				Objects.equals(this.name, nodePoolRes.name) &&
				Objects.equals(this.nodeCount, nodePoolRes.nodeCount) &&
				Objects.equals(this.subnetNoList, nodePoolRes.subnetNoList) &&
				Objects.equals(this.subnetNameList, nodePoolRes.subnetNameList) &&
				Objects.equals(this.productCode, nodePoolRes.productCode) &&
				Objects.equals(this.status, nodePoolRes.status) &&
				Objects.equals(this.k8sVersion, nodePoolRes.k8sVersion) &&
				Objects.equals(this.autoscale, nodePoolRes.autoscale);
	}

	@Override
	public int hashCode() {
		return Objects.hash(instanceNo, isDefault, name, nodeCount, subnetNoList, subnetNameList, productCode, status, k8sVersion, autoscale);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NodePoolRes {\n");
		
		sb.append("		instanceNo: ").append(toIndentedString(instanceNo)).append("\n");
		sb.append("		isDefault: ").append(toIndentedString(isDefault)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
		sb.append("		subnetNoList: ").append(toIndentedString(subnetNoList)).append("\n");
		sb.append("		subnetNameList: ").append(toIndentedString(subnetNameList)).append("\n");
		sb.append("		productCode: ").append(toIndentedString(productCode)).append("\n");
		sb.append("		status: ").append(toIndentedString(status)).append("\n");
		sb.append("		k8sVersion: ").append(toIndentedString(k8sVersion)).append("\n");
		sb.append("		autoscale: ").append(toIndentedString(autoscale)).append("\n");
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
