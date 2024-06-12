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

/**
 * NodePool
 */
public class NodePool {
	private String name = null;

	private Integer nodeCount = null;

	private Integer subnetNo = null;

	private String productCode = null;

	public NodePool name(String name) {
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

	public NodePool nodeCount(Integer nodeCount) {
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

	public NodePool subnetNo(Integer subnetNo) {
		this.subnetNo = subnetNo;
		return this;
	}

	 /**
	 * Subnet 번호
	 * @return subnetNo
	**/
	public Integer getSubnetNo() {
		return subnetNo;
	}

	public void setSubnetNo(Integer subnetNo) {
		this.subnetNo = subnetNo;
	}

	public NodePool productCode(String productCode) {
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


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		NodePool nodePool = (NodePool) o;
		return Objects.equals(this.name, nodePool.name) &&
				Objects.equals(this.nodeCount, nodePool.nodeCount) &&
				Objects.equals(this.subnetNo, nodePool.subnetNo) &&
				Objects.equals(this.productCode, nodePool.productCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, nodeCount, subnetNo, productCode);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NodePool {\n");
		
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
		sb.append("		subnetNo: ").append(toIndentedString(subnetNo)).append("\n");
		sb.append("		productCode: ").append(toIndentedString(productCode)).append("\n");
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

