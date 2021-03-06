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
import com.ncloud.clouddb.model.CommonCode;

/**
 * Product
 */
public class Product {
	private String productCode = null;

	private String productName = null;

	private CommonCode productType = null;

	private String productDescription = null;

	private CommonCode infraResourceType = null;

	private Integer cpuCount = null;

	private Long memorySize = null;

	private Long baseBlockStorageSize = null;

	private CommonCode platformType = null;

	private String osInformation = null;

	private CommonCode diskType = null;

	private String dbKindCode = null;

	private Long addBlockStroageSize = null;

	public Product productCode(String productCode) {
		this.productCode = productCode;
		return this;
	}

	 /**
	 * 상품코드
	 * @return productCode
	**/
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Product productName(String productName) {
		this.productName = productName;
		return this;
	}

	 /**
	 * 상품명
	 * @return productName
	**/
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Product productType(CommonCode productType) {
		this.productType = productType;
		return this;
	}

	 /**
	 * 상품유형
	 * @return productType
	**/
	public CommonCode getProductType() {
		return productType;
	}

	public void setProductType(CommonCode productType) {
		this.productType = productType;
	}

	public Product productDescription(String productDescription) {
		this.productDescription = productDescription;
		return this;
	}

	 /**
	 * 상품설명
	 * @return productDescription
	**/
	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Product infraResourceType(CommonCode infraResourceType) {
		this.infraResourceType = infraResourceType;
		return this;
	}

	 /**
	 * 인프라자원구분
	 * @return infraResourceType
	**/
	public CommonCode getInfraResourceType() {
		return infraResourceType;
	}

	public void setInfraResourceType(CommonCode infraResourceType) {
		this.infraResourceType = infraResourceType;
	}

	public Product cpuCount(Integer cpuCount) {
		this.cpuCount = cpuCount;
		return this;
	}

	 /**
	 * CPU수
	 * @return cpuCount
	**/
	public Integer getCpuCount() {
		return cpuCount;
	}

	public void setCpuCount(Integer cpuCount) {
		this.cpuCount = cpuCount;
	}

	public Product memorySize(Long memorySize) {
		this.memorySize = memorySize;
		return this;
	}

	 /**
	 * 메모리사이즈
	 * @return memorySize
	**/
	public Long getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(Long memorySize) {
		this.memorySize = memorySize;
	}

	public Product baseBlockStorageSize(Long baseBlockStorageSize) {
		this.baseBlockStorageSize = baseBlockStorageSize;
		return this;
	}

	 /**
	 * 기본블록스토리지사이즈
	 * @return baseBlockStorageSize
	**/
	public Long getBaseBlockStorageSize() {
		return baseBlockStorageSize;
	}

	public void setBaseBlockStorageSize(Long baseBlockStorageSize) {
		this.baseBlockStorageSize = baseBlockStorageSize;
	}

	public Product platformType(CommonCode platformType) {
		this.platformType = platformType;
		return this;
	}

	 /**
	 * 플랫폼구분
	 * @return platformType
	**/
	public CommonCode getPlatformType() {
		return platformType;
	}

	public void setPlatformType(CommonCode platformType) {
		this.platformType = platformType;
	}

	public Product osInformation(String osInformation) {
		this.osInformation = osInformation;
		return this;
	}

	 /**
	 * OS정보
	 * @return osInformation
	**/
	public String getOsInformation() {
		return osInformation;
	}

	public void setOsInformation(String osInformation) {
		this.osInformation = osInformation;
	}

	public Product diskType(CommonCode diskType) {
		this.diskType = diskType;
		return this;
	}

	 /**
	 * 디스크유형
	 * @return diskType
	**/
	public CommonCode getDiskType() {
		return diskType;
	}

	public void setDiskType(CommonCode diskType) {
		this.diskType = diskType;
	}

	public Product dbKindCode(String dbKindCode) {
		this.dbKindCode = dbKindCode;
		return this;
	}

	 /**
	 * DB유형코드
	 * @return dbKindCode
	**/
	public String getDbKindCode() {
		return dbKindCode;
	}

	public void setDbKindCode(String dbKindCode) {
		this.dbKindCode = dbKindCode;
	}

	public Product addBlockStroageSize(Long addBlockStroageSize) {
		this.addBlockStroageSize = addBlockStroageSize;
		return this;
	}

	 /**
	 * 추가블록스토리지사이즈
	 * @return addBlockStroageSize
	**/
	public Long getAddBlockStroageSize() {
		return addBlockStroageSize;
	}

	public void setAddBlockStroageSize(Long addBlockStroageSize) {
		this.addBlockStroageSize = addBlockStroageSize;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Product product = (Product) o;
		return Objects.equals(this.productCode, product.productCode) &&
				Objects.equals(this.productName, product.productName) &&
				Objects.equals(this.productType, product.productType) &&
				Objects.equals(this.productDescription, product.productDescription) &&
				Objects.equals(this.infraResourceType, product.infraResourceType) &&
				Objects.equals(this.cpuCount, product.cpuCount) &&
				Objects.equals(this.memorySize, product.memorySize) &&
				Objects.equals(this.baseBlockStorageSize, product.baseBlockStorageSize) &&
				Objects.equals(this.platformType, product.platformType) &&
				Objects.equals(this.osInformation, product.osInformation) &&
				Objects.equals(this.diskType, product.diskType) &&
				Objects.equals(this.dbKindCode, product.dbKindCode) &&
				Objects.equals(this.addBlockStroageSize, product.addBlockStroageSize);
	}

	@Override
	public int hashCode() {
		return Objects.hash(productCode, productName, productType, productDescription, infraResourceType, cpuCount, memorySize, baseBlockStorageSize, platformType, osInformation, diskType, dbKindCode, addBlockStroageSize);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Product {\n");
		
		sb.append("		productCode: ").append(toIndentedString(productCode)).append("\n");
		sb.append("		productName: ").append(toIndentedString(productName)).append("\n");
		sb.append("		productType: ").append(toIndentedString(productType)).append("\n");
		sb.append("		productDescription: ").append(toIndentedString(productDescription)).append("\n");
		sb.append("		infraResourceType: ").append(toIndentedString(infraResourceType)).append("\n");
		sb.append("		cpuCount: ").append(toIndentedString(cpuCount)).append("\n");
		sb.append("		memorySize: ").append(toIndentedString(memorySize)).append("\n");
		sb.append("		baseBlockStorageSize: ").append(toIndentedString(baseBlockStorageSize)).append("\n");
		sb.append("		platformType: ").append(toIndentedString(platformType)).append("\n");
		sb.append("		osInformation: ").append(toIndentedString(osInformation)).append("\n");
		sb.append("		diskType: ").append(toIndentedString(diskType)).append("\n");
		sb.append("		dbKindCode: ").append(toIndentedString(dbKindCode)).append("\n");
		sb.append("		addBlockStroageSize: ").append(toIndentedString(addBlockStroageSize)).append("\n");
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

