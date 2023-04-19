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
 * ClusterLogInput
 */
public class ClusterLogInput {
	private Boolean audit = false;

	public ClusterLogInput audit(Boolean audit) {
		this.audit = audit;
		return this;
	}

	 /**
	 * audit log 설정
	 * @return audit
	**/
	public Boolean isAudit() {
		return audit;
	}

	public void setAudit(Boolean audit) {
		this.audit = audit;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ClusterLogInput clusterLogInput = (ClusterLogInput) o;
		return Objects.equals(this.audit, clusterLogInput.audit);
	}

	@Override
	public int hashCode() {
		return Objects.hash(audit);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ClusterLogInput {\n");
		
		sb.append("		audit: ").append(toIndentedString(audit)).append("\n");
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
