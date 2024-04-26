/*
 * cdn
 * <br/>https://ncloud.apigw.ntruss.com/cdn/v2
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.cdn.model;

import java.util.Objects;
import com.ncloud.cdn.model.GlobalCdnCustomHeader;
import java.util.ArrayList;
import java.util.List;

/**
 * GlobalCdnRule
 */
public class GlobalCdnRule {
	private String protocolTypeCode = null;

	private String serviceDomainTypeCode = null;

	private String originUrl = null;

	private String originPath = null;

	private Integer originHttpPort = null;

	private Integer originHttpsPort = null;

	private String forwardHostHeaderTypeCode = null;

	private String forwardHostHeader = null;

	private String cacheKeyHostNameTypeCode = null;

	private Boolean isGzipCompressionUse = null;

	private String cachingOptionTypeCode = null;

	private Boolean isErrorContentsResponseUse = null;

	private Integer cachingTtlTime = null;

	private Boolean isQueryStringIgnoreUse = null;

	private Boolean isRemoveVaryHeaderUse = null;

	private Boolean isLargeFileOptimizationUse = null;

	private String gzipResponseTypeCode = null;

	private Boolean isReferrerDomainUse = null;

	private List<String> referrerDomainList = null;

	private Boolean isReferrerDomainRestrictUse = null;

	private Boolean isSecureTokenUse = null;

	private String secureTokenPassword = null;

	private Boolean isReissueSecureTokenPassword = null;

	private String certificateName = null;

	private Boolean isAccessLogUse = null;

	private String accessLogFileStorageContainerName = null;

	private Boolean isRequestCustomHeaderUse = null;

	private List<GlobalCdnCustomHeader> requestCustomHeaderList = null;

	private Boolean isResponseCustomHeaderUse = null;

	private List<GlobalCdnCustomHeader> responseCustomHeaderList = null;

	public GlobalCdnRule protocolTypeCode(String protocolTypeCode) {
		this.protocolTypeCode = protocolTypeCode;
		return this;
	}

	 /**
	 * 프로토콜구분코드
	 * @return protocolTypeCode
	**/
	public String getProtocolTypeCode() {
		return protocolTypeCode;
	}

	public void setProtocolTypeCode(String protocolTypeCode) {
		this.protocolTypeCode = protocolTypeCode;
	}

	public GlobalCdnRule serviceDomainTypeCode(String serviceDomainTypeCode) {
		this.serviceDomainTypeCode = serviceDomainTypeCode;
		return this;
	}

	 /**
	 * 서비스도메인구분코드
	 * @return serviceDomainTypeCode
	**/
	public String getServiceDomainTypeCode() {
		return serviceDomainTypeCode;
	}

	public void setServiceDomainTypeCode(String serviceDomainTypeCode) {
		this.serviceDomainTypeCode = serviceDomainTypeCode;
	}

	public GlobalCdnRule originUrl(String originUrl) {
		this.originUrl = originUrl;
		return this;
	}

	 /**
	 * 원본URL
	 * @return originUrl
	**/
	public String getOriginUrl() {
		return originUrl;
	}

	public void setOriginUrl(String originUrl) {
		this.originUrl = originUrl;
	}

	public GlobalCdnRule originPath(String originPath) {
		this.originPath = originPath;
		return this;
	}

	 /**
	 * 원본경로
	 * @return originPath
	**/
	public String getOriginPath() {
		return originPath;
	}

	public void setOriginPath(String originPath) {
		this.originPath = originPath;
	}

	public GlobalCdnRule originHttpPort(Integer originHttpPort) {
		this.originHttpPort = originHttpPort;
		return this;
	}

	 /**
	 * 원본HTTP포트
	 * @return originHttpPort
	**/
	public Integer getOriginHttpPort() {
		return originHttpPort;
	}

	public void setOriginHttpPort(Integer originHttpPort) {
		this.originHttpPort = originHttpPort;
	}

	public GlobalCdnRule originHttpsPort(Integer originHttpsPort) {
		this.originHttpsPort = originHttpsPort;
		return this;
	}

	 /**
	 * 원본HTTPS포트
	 * @return originHttpsPort
	**/
	public Integer getOriginHttpsPort() {
		return originHttpsPort;
	}

	public void setOriginHttpsPort(Integer originHttpsPort) {
		this.originHttpsPort = originHttpsPort;
	}

	public GlobalCdnRule forwardHostHeaderTypeCode(String forwardHostHeaderTypeCode) {
		this.forwardHostHeaderTypeCode = forwardHostHeaderTypeCode;
		return this;
	}

	 /**
	 * 포워드호스트헤더구분코드
	 * @return forwardHostHeaderTypeCode
	**/
	public String getForwardHostHeaderTypeCode() {
		return forwardHostHeaderTypeCode;
	}

	public void setForwardHostHeaderTypeCode(String forwardHostHeaderTypeCode) {
		this.forwardHostHeaderTypeCode = forwardHostHeaderTypeCode;
	}

	public GlobalCdnRule forwardHostHeader(String forwardHostHeader) {
		this.forwardHostHeader = forwardHostHeader;
		return this;
	}

	 /**
	 * 포워드호스트헤더
	 * @return forwardHostHeader
	**/
	public String getForwardHostHeader() {
		return forwardHostHeader;
	}

	public void setForwardHostHeader(String forwardHostHeader) {
		this.forwardHostHeader = forwardHostHeader;
	}

	public GlobalCdnRule cacheKeyHostNameTypeCode(String cacheKeyHostNameTypeCode) {
		this.cacheKeyHostNameTypeCode = cacheKeyHostNameTypeCode;
		return this;
	}

	 /**
	 * 캐쉬키호스트명구분코드
	 * @return cacheKeyHostNameTypeCode
	**/
	public String getCacheKeyHostNameTypeCode() {
		return cacheKeyHostNameTypeCode;
	}

	public void setCacheKeyHostNameTypeCode(String cacheKeyHostNameTypeCode) {
		this.cacheKeyHostNameTypeCode = cacheKeyHostNameTypeCode;
	}

	public GlobalCdnRule isGzipCompressionUse(Boolean isGzipCompressionUse) {
		this.isGzipCompressionUse = isGzipCompressionUse;
		return this;
	}

	 /**
	 * GZIP압축사용여부
	 * @return isGzipCompressionUse
	**/
	public Boolean isIsGzipCompressionUse() {
		return isGzipCompressionUse;
	}

	public void setIsGzipCompressionUse(Boolean isGzipCompressionUse) {
		this.isGzipCompressionUse = isGzipCompressionUse;
	}

	public GlobalCdnRule cachingOptionTypeCode(String cachingOptionTypeCode) {
		this.cachingOptionTypeCode = cachingOptionTypeCode;
		return this;
	}

	 /**
	 * 캐싱옵션구분코드
	 * @return cachingOptionTypeCode
	**/
	public String getCachingOptionTypeCode() {
		return cachingOptionTypeCode;
	}

	public void setCachingOptionTypeCode(String cachingOptionTypeCode) {
		this.cachingOptionTypeCode = cachingOptionTypeCode;
	}

	public GlobalCdnRule isErrorContentsResponseUse(Boolean isErrorContentsResponseUse) {
		this.isErrorContentsResponseUse = isErrorContentsResponseUse;
		return this;
	}

	 /**
	 * 오류내용응답사용여부
	 * @return isErrorContentsResponseUse
	**/
	public Boolean isIsErrorContentsResponseUse() {
		return isErrorContentsResponseUse;
	}

	public void setIsErrorContentsResponseUse(Boolean isErrorContentsResponseUse) {
		this.isErrorContentsResponseUse = isErrorContentsResponseUse;
	}

	public GlobalCdnRule cachingTtlTime(Integer cachingTtlTime) {
		this.cachingTtlTime = cachingTtlTime;
		return this;
	}

	 /**
	 * TTL캐싱
	 * @return cachingTtlTime
	**/
	public Integer getCachingTtlTime() {
		return cachingTtlTime;
	}

	public void setCachingTtlTime(Integer cachingTtlTime) {
		this.cachingTtlTime = cachingTtlTime;
	}

	public GlobalCdnRule isQueryStringIgnoreUse(Boolean isQueryStringIgnoreUse) {
		this.isQueryStringIgnoreUse = isQueryStringIgnoreUse;
		return this;
	}

	 /**
	 * 쿼리스트링무시여부
	 * @return isQueryStringIgnoreUse
	**/
	public Boolean isIsQueryStringIgnoreUse() {
		return isQueryStringIgnoreUse;
	}

	public void setIsQueryStringIgnoreUse(Boolean isQueryStringIgnoreUse) {
		this.isQueryStringIgnoreUse = isQueryStringIgnoreUse;
	}

	public GlobalCdnRule isRemoveVaryHeaderUse(Boolean isRemoveVaryHeaderUse) {
		this.isRemoveVaryHeaderUse = isRemoveVaryHeaderUse;
		return this;
	}

	 /**
	 * 헤더제거사용여부
	 * @return isRemoveVaryHeaderUse
	**/
	public Boolean isIsRemoveVaryHeaderUse() {
		return isRemoveVaryHeaderUse;
	}

	public void setIsRemoveVaryHeaderUse(Boolean isRemoveVaryHeaderUse) {
		this.isRemoveVaryHeaderUse = isRemoveVaryHeaderUse;
	}

	public GlobalCdnRule isLargeFileOptimizationUse(Boolean isLargeFileOptimizationUse) {
		this.isLargeFileOptimizationUse = isLargeFileOptimizationUse;
		return this;
	}

	 /**
	 * 대용량파일최적화사용여부
	 * @return isLargeFileOptimizationUse
	**/
	public Boolean isIsLargeFileOptimizationUse() {
		return isLargeFileOptimizationUse;
	}

	public void setIsLargeFileOptimizationUse(Boolean isLargeFileOptimizationUse) {
		this.isLargeFileOptimizationUse = isLargeFileOptimizationUse;
	}

	public GlobalCdnRule gzipResponseTypeCode(String gzipResponseTypeCode) {
		this.gzipResponseTypeCode = gzipResponseTypeCode;
		return this;
	}

	 /**
	 * GZIP응답구분코드
	 * @return gzipResponseTypeCode
	**/
	public String getGzipResponseTypeCode() {
		return gzipResponseTypeCode;
	}

	public void setGzipResponseTypeCode(String gzipResponseTypeCode) {
		this.gzipResponseTypeCode = gzipResponseTypeCode;
	}

	public GlobalCdnRule isReferrerDomainUse(Boolean isReferrerDomainUse) {
		this.isReferrerDomainUse = isReferrerDomainUse;
		return this;
	}

	 /**
	 * 레퍼러도메인사용여부
	 * @return isReferrerDomainUse
	**/
	public Boolean isIsReferrerDomainUse() {
		return isReferrerDomainUse;
	}

	public void setIsReferrerDomainUse(Boolean isReferrerDomainUse) {
		this.isReferrerDomainUse = isReferrerDomainUse;
	}

	public GlobalCdnRule referrerDomainList(List<String> referrerDomainList) {
		this.referrerDomainList = referrerDomainList;
		return this;
	}

	public GlobalCdnRule addReferrerDomainListItem(String referrerDomainListItem) {
		if (this.referrerDomainList == null) {
			this.referrerDomainList = new ArrayList<String>();
		}
		this.referrerDomainList.add(referrerDomainListItem);
		return this;
	}

	 /**
	 * 레퍼러도메인리스트
	 * @return referrerDomainList
	**/
	public List<String> getReferrerDomainList() {
		return referrerDomainList;
	}

	public void setReferrerDomainList(List<String> referrerDomainList) {
		this.referrerDomainList = referrerDomainList;
	}

	public GlobalCdnRule isReferrerDomainRestrictUse(Boolean isReferrerDomainRestrictUse) {
		this.isReferrerDomainRestrictUse = isReferrerDomainRestrictUse;
		return this;
	}

	 /**
	 * 레퍼러도메인제한사용여부
	 * @return isReferrerDomainRestrictUse
	**/
	public Boolean isIsReferrerDomainRestrictUse() {
		return isReferrerDomainRestrictUse;
	}

	public void setIsReferrerDomainRestrictUse(Boolean isReferrerDomainRestrictUse) {
		this.isReferrerDomainRestrictUse = isReferrerDomainRestrictUse;
	}

	public GlobalCdnRule isSecureTokenUse(Boolean isSecureTokenUse) {
		this.isSecureTokenUse = isSecureTokenUse;
		return this;
	}

	 /**
	 * 보안토큰사용여부
	 * @return isSecureTokenUse
	**/
	public Boolean isIsSecureTokenUse() {
		return isSecureTokenUse;
	}

	public void setIsSecureTokenUse(Boolean isSecureTokenUse) {
		this.isSecureTokenUse = isSecureTokenUse;
	}

	public GlobalCdnRule secureTokenPassword(String secureTokenPassword) {
		this.secureTokenPassword = secureTokenPassword;
		return this;
	}

	 /**
	 * 보안토큰비밀번호
	 * @return secureTokenPassword
	**/
	public String getSecureTokenPassword() {
		return secureTokenPassword;
	}

	public void setSecureTokenPassword(String secureTokenPassword) {
		this.secureTokenPassword = secureTokenPassword;
	}

	public GlobalCdnRule isReissueSecureTokenPassword(Boolean isReissueSecureTokenPassword) {
		this.isReissueSecureTokenPassword = isReissueSecureTokenPassword;
		return this;
	}

	 /**
	 * 보안토큰재발급여부
	 * @return isReissueSecureTokenPassword
	**/
	public Boolean isIsReissueSecureTokenPassword() {
		return isReissueSecureTokenPassword;
	}

	public void setIsReissueSecureTokenPassword(Boolean isReissueSecureTokenPassword) {
		this.isReissueSecureTokenPassword = isReissueSecureTokenPassword;
	}

	public GlobalCdnRule certificateName(String certificateName) {
		this.certificateName = certificateName;
		return this;
	}

	 /**
	 * 인증서이름
	 * @return certificateName
	**/
	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public GlobalCdnRule isAccessLogUse(Boolean isAccessLogUse) {
		this.isAccessLogUse = isAccessLogUse;
		return this;
	}

	 /**
	 * 엑세스로그사용여부
	 * @return isAccessLogUse
	**/
	public Boolean isIsAccessLogUse() {
		return isAccessLogUse;
	}

	public void setIsAccessLogUse(Boolean isAccessLogUse) {
		this.isAccessLogUse = isAccessLogUse;
	}

	public GlobalCdnRule accessLogFileStorageContainerName(String accessLogFileStorageContainerName) {
		this.accessLogFileStorageContainerName = accessLogFileStorageContainerName;
		return this;
	}

	 /**
	 * 엑세스로그파일스토리지인스턴스이름
	 * @return accessLogFileStorageContainerName
	**/
	public String getAccessLogFileStorageContainerName() {
		return accessLogFileStorageContainerName;
	}

	public void setAccessLogFileStorageContainerName(String accessLogFileStorageContainerName) {
		this.accessLogFileStorageContainerName = accessLogFileStorageContainerName;
	}

	public GlobalCdnRule isRequestCustomHeaderUse(Boolean isRequestCustomHeaderUse) {
		this.isRequestCustomHeaderUse = isRequestCustomHeaderUse;
		return this;
	}

	 /**
	 * 커스텀헤더요청사용여부
	 * @return isRequestCustomHeaderUse
	**/
	public Boolean isIsRequestCustomHeaderUse() {
		return isRequestCustomHeaderUse;
	}

	public void setIsRequestCustomHeaderUse(Boolean isRequestCustomHeaderUse) {
		this.isRequestCustomHeaderUse = isRequestCustomHeaderUse;
	}

	public GlobalCdnRule requestCustomHeaderList(List<GlobalCdnCustomHeader> requestCustomHeaderList) {
		this.requestCustomHeaderList = requestCustomHeaderList;
		return this;
	}

	public GlobalCdnRule addRequestCustomHeaderListItem(GlobalCdnCustomHeader requestCustomHeaderListItem) {
		if (this.requestCustomHeaderList == null) {
			this.requestCustomHeaderList = new ArrayList<GlobalCdnCustomHeader>();
		}
		this.requestCustomHeaderList.add(requestCustomHeaderListItem);
		return this;
	}

	 /**
	 * Get requestCustomHeaderList
	 * @return requestCustomHeaderList
	**/
	public List<GlobalCdnCustomHeader> getRequestCustomHeaderList() {
		return requestCustomHeaderList;
	}

	public void setRequestCustomHeaderList(List<GlobalCdnCustomHeader> requestCustomHeaderList) {
		this.requestCustomHeaderList = requestCustomHeaderList;
	}

	public GlobalCdnRule isResponseCustomHeaderUse(Boolean isResponseCustomHeaderUse) {
		this.isResponseCustomHeaderUse = isResponseCustomHeaderUse;
		return this;
	}

	 /**
	 * 커스텀헤더반환사용여부
	 * @return isResponseCustomHeaderUse
	**/
	public Boolean isIsResponseCustomHeaderUse() {
		return isResponseCustomHeaderUse;
	}

	public void setIsResponseCustomHeaderUse(Boolean isResponseCustomHeaderUse) {
		this.isResponseCustomHeaderUse = isResponseCustomHeaderUse;
	}

	public GlobalCdnRule responseCustomHeaderList(List<GlobalCdnCustomHeader> responseCustomHeaderList) {
		this.responseCustomHeaderList = responseCustomHeaderList;
		return this;
	}

	public GlobalCdnRule addResponseCustomHeaderListItem(GlobalCdnCustomHeader responseCustomHeaderListItem) {
		if (this.responseCustomHeaderList == null) {
			this.responseCustomHeaderList = new ArrayList<GlobalCdnCustomHeader>();
		}
		this.responseCustomHeaderList.add(responseCustomHeaderListItem);
		return this;
	}

	 /**
	 * Get responseCustomHeaderList
	 * @return responseCustomHeaderList
	**/
	public List<GlobalCdnCustomHeader> getResponseCustomHeaderList() {
		return responseCustomHeaderList;
	}

	public void setResponseCustomHeaderList(List<GlobalCdnCustomHeader> responseCustomHeaderList) {
		this.responseCustomHeaderList = responseCustomHeaderList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GlobalCdnRule globalCdnRule = (GlobalCdnRule) o;
		return Objects.equals(this.protocolTypeCode, globalCdnRule.protocolTypeCode) &&
				Objects.equals(this.serviceDomainTypeCode, globalCdnRule.serviceDomainTypeCode) &&
				Objects.equals(this.originUrl, globalCdnRule.originUrl) &&
				Objects.equals(this.originPath, globalCdnRule.originPath) &&
				Objects.equals(this.originHttpPort, globalCdnRule.originHttpPort) &&
				Objects.equals(this.originHttpsPort, globalCdnRule.originHttpsPort) &&
				Objects.equals(this.forwardHostHeaderTypeCode, globalCdnRule.forwardHostHeaderTypeCode) &&
				Objects.equals(this.forwardHostHeader, globalCdnRule.forwardHostHeader) &&
				Objects.equals(this.cacheKeyHostNameTypeCode, globalCdnRule.cacheKeyHostNameTypeCode) &&
				Objects.equals(this.isGzipCompressionUse, globalCdnRule.isGzipCompressionUse) &&
				Objects.equals(this.cachingOptionTypeCode, globalCdnRule.cachingOptionTypeCode) &&
				Objects.equals(this.isErrorContentsResponseUse, globalCdnRule.isErrorContentsResponseUse) &&
				Objects.equals(this.cachingTtlTime, globalCdnRule.cachingTtlTime) &&
				Objects.equals(this.isQueryStringIgnoreUse, globalCdnRule.isQueryStringIgnoreUse) &&
				Objects.equals(this.isRemoveVaryHeaderUse, globalCdnRule.isRemoveVaryHeaderUse) &&
				Objects.equals(this.isLargeFileOptimizationUse, globalCdnRule.isLargeFileOptimizationUse) &&
				Objects.equals(this.gzipResponseTypeCode, globalCdnRule.gzipResponseTypeCode) &&
				Objects.equals(this.isReferrerDomainUse, globalCdnRule.isReferrerDomainUse) &&
				Objects.equals(this.referrerDomainList, globalCdnRule.referrerDomainList) &&
				Objects.equals(this.isReferrerDomainRestrictUse, globalCdnRule.isReferrerDomainRestrictUse) &&
				Objects.equals(this.isSecureTokenUse, globalCdnRule.isSecureTokenUse) &&
				Objects.equals(this.secureTokenPassword, globalCdnRule.secureTokenPassword) &&
				Objects.equals(this.isReissueSecureTokenPassword, globalCdnRule.isReissueSecureTokenPassword) &&
				Objects.equals(this.certificateName, globalCdnRule.certificateName) &&
				Objects.equals(this.isAccessLogUse, globalCdnRule.isAccessLogUse) &&
				Objects.equals(this.accessLogFileStorageContainerName, globalCdnRule.accessLogFileStorageContainerName) &&
				Objects.equals(this.isRequestCustomHeaderUse, globalCdnRule.isRequestCustomHeaderUse) &&
				Objects.equals(this.requestCustomHeaderList, globalCdnRule.requestCustomHeaderList) &&
				Objects.equals(this.isResponseCustomHeaderUse, globalCdnRule.isResponseCustomHeaderUse) &&
				Objects.equals(this.responseCustomHeaderList, globalCdnRule.responseCustomHeaderList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(protocolTypeCode, serviceDomainTypeCode, originUrl, originPath, originHttpPort, originHttpsPort, forwardHostHeaderTypeCode, forwardHostHeader, cacheKeyHostNameTypeCode, isGzipCompressionUse, cachingOptionTypeCode, isErrorContentsResponseUse, cachingTtlTime, isQueryStringIgnoreUse, isRemoveVaryHeaderUse, isLargeFileOptimizationUse, gzipResponseTypeCode, isReferrerDomainUse, referrerDomainList, isReferrerDomainRestrictUse, isSecureTokenUse, secureTokenPassword, isReissueSecureTokenPassword, certificateName, isAccessLogUse, accessLogFileStorageContainerName, isRequestCustomHeaderUse, requestCustomHeaderList, isResponseCustomHeaderUse, responseCustomHeaderList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GlobalCdnRule {\n");
		
		sb.append("		protocolTypeCode: ").append(toIndentedString(protocolTypeCode)).append("\n");
		sb.append("		serviceDomainTypeCode: ").append(toIndentedString(serviceDomainTypeCode)).append("\n");
		sb.append("		originUrl: ").append(toIndentedString(originUrl)).append("\n");
		sb.append("		originPath: ").append(toIndentedString(originPath)).append("\n");
		sb.append("		originHttpPort: ").append(toIndentedString(originHttpPort)).append("\n");
		sb.append("		originHttpsPort: ").append(toIndentedString(originHttpsPort)).append("\n");
		sb.append("		forwardHostHeaderTypeCode: ").append(toIndentedString(forwardHostHeaderTypeCode)).append("\n");
		sb.append("		forwardHostHeader: ").append(toIndentedString(forwardHostHeader)).append("\n");
		sb.append("		cacheKeyHostNameTypeCode: ").append(toIndentedString(cacheKeyHostNameTypeCode)).append("\n");
		sb.append("		isGzipCompressionUse: ").append(toIndentedString(isGzipCompressionUse)).append("\n");
		sb.append("		cachingOptionTypeCode: ").append(toIndentedString(cachingOptionTypeCode)).append("\n");
		sb.append("		isErrorContentsResponseUse: ").append(toIndentedString(isErrorContentsResponseUse)).append("\n");
		sb.append("		cachingTtlTime: ").append(toIndentedString(cachingTtlTime)).append("\n");
		sb.append("		isQueryStringIgnoreUse: ").append(toIndentedString(isQueryStringIgnoreUse)).append("\n");
		sb.append("		isRemoveVaryHeaderUse: ").append(toIndentedString(isRemoveVaryHeaderUse)).append("\n");
		sb.append("		isLargeFileOptimizationUse: ").append(toIndentedString(isLargeFileOptimizationUse)).append("\n");
		sb.append("		gzipResponseTypeCode: ").append(toIndentedString(gzipResponseTypeCode)).append("\n");
		sb.append("		isReferrerDomainUse: ").append(toIndentedString(isReferrerDomainUse)).append("\n");
		sb.append("		referrerDomainList: ").append(toIndentedString(referrerDomainList)).append("\n");
		sb.append("		isReferrerDomainRestrictUse: ").append(toIndentedString(isReferrerDomainRestrictUse)).append("\n");
		sb.append("		isSecureTokenUse: ").append(toIndentedString(isSecureTokenUse)).append("\n");
		sb.append("		secureTokenPassword: ").append(toIndentedString(secureTokenPassword)).append("\n");
		sb.append("		isReissueSecureTokenPassword: ").append(toIndentedString(isReissueSecureTokenPassword)).append("\n");
		sb.append("		certificateName: ").append(toIndentedString(certificateName)).append("\n");
		sb.append("		isAccessLogUse: ").append(toIndentedString(isAccessLogUse)).append("\n");
		sb.append("		accessLogFileStorageContainerName: ").append(toIndentedString(accessLogFileStorageContainerName)).append("\n");
		sb.append("		isRequestCustomHeaderUse: ").append(toIndentedString(isRequestCustomHeaderUse)).append("\n");
		sb.append("		requestCustomHeaderList: ").append(toIndentedString(requestCustomHeaderList)).append("\n");
		sb.append("		isResponseCustomHeaderUse: ").append(toIndentedString(isResponseCustomHeaderUse)).append("\n");
		sb.append("		responseCustomHeaderList: ").append(toIndentedString(responseCustomHeaderList)).append("\n");
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

