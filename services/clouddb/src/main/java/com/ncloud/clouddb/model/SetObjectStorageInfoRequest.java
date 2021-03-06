/*
 * clouddb
 * Cloud DB<br/>https://ncloud.apigw.ntruss.com/clouddb/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.clouddb.model;

import java.util.Objects;

/**
 * SetObjectStorageInfoRequest
 */
public class SetObjectStorageInfoRequest {
	private String objectStorageAccessKey = null;

	private String objectStorageSecretKey = null;

	private String endpoint = null;

	private String bucketName = null;

	private String responseFormatType = null;

	public SetObjectStorageInfoRequest objectStorageAccessKey(String objectStorageAccessKey) {
		this.objectStorageAccessKey = objectStorageAccessKey;
		return this;
	}

	 /**
	 * 오브젝트스토리지 AccessKey
	 * @return objectStorageAccessKey
	**/
	public String getObjectStorageAccessKey() {
		return objectStorageAccessKey;
	}

	public void setObjectStorageAccessKey(String objectStorageAccessKey) {
		this.objectStorageAccessKey = objectStorageAccessKey;
	}

	public SetObjectStorageInfoRequest objectStorageSecretKey(String objectStorageSecretKey) {
		this.objectStorageSecretKey = objectStorageSecretKey;
		return this;
	}

	 /**
	 * 오브젝트스토리지 SecretKey
	 * @return objectStorageSecretKey
	**/
	public String getObjectStorageSecretKey() {
		return objectStorageSecretKey;
	}

	public void setObjectStorageSecretKey(String objectStorageSecretKey) {
		this.objectStorageSecretKey = objectStorageSecretKey;
	}

	public SetObjectStorageInfoRequest endpoint(String endpoint) {
		this.endpoint = endpoint;
		return this;
	}

	 /**
	 * 엔드포인트
	 * @return endpoint
	**/
	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public SetObjectStorageInfoRequest bucketName(String bucketName) {
		this.bucketName = bucketName;
		return this;
	}

	 /**
	 * 버킷이름
	 * @return bucketName
	**/
	public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public SetObjectStorageInfoRequest responseFormatType(String responseFormatType) {
		this.responseFormatType = responseFormatType;
		return this;
	}

	 /**
	 * responseFormatType {json, xml}
	 * @return responseFormatType
	**/
	public String getResponseFormatType() {
		return responseFormatType;
	}

	public void setResponseFormatType(String responseFormatType) {
		this.responseFormatType = responseFormatType;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SetObjectStorageInfoRequest setObjectStorageInfoRequest = (SetObjectStorageInfoRequest) o;
		return Objects.equals(this.objectStorageAccessKey, setObjectStorageInfoRequest.objectStorageAccessKey) &&
				Objects.equals(this.objectStorageSecretKey, setObjectStorageInfoRequest.objectStorageSecretKey) &&
				Objects.equals(this.endpoint, setObjectStorageInfoRequest.endpoint) &&
				Objects.equals(this.bucketName, setObjectStorageInfoRequest.bucketName) &&
				Objects.equals(this.responseFormatType, setObjectStorageInfoRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(objectStorageAccessKey, objectStorageSecretKey, endpoint, bucketName, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SetObjectStorageInfoRequest {\n");
		
		sb.append("		objectStorageAccessKey: ").append(toIndentedString(objectStorageAccessKey)).append("\n");
		sb.append("		objectStorageSecretKey: ").append(toIndentedString(objectStorageSecretKey)).append("\n");
		sb.append("		endpoint: ").append(toIndentedString(endpoint)).append("\n");
		sb.append("		bucketName: ").append(toIndentedString(bucketName)).append("\n");
		sb.append("		responseFormatType: ").append(toIndentedString(responseFormatType)).append("\n");
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

