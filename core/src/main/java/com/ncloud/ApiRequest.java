/*
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud;

import java.util.Map;

/**
 * The type Api request.
 *
 * @param <T> the type parameter
 */
public class ApiRequest<T> {
	private final String basePath;
	private final String method;
	private final String path;
	private final Map<String, Object> queryParams;
	private final Map<String, Object> formParams;
	private final Map<String, Object> httpHeaders;
	private final T body;
	private final boolean isCustomFormParams;
    private final boolean isRequiredApiKey;

	/**
	 * Instantiates a new Api request.
	 *
	 * @param basePath basePath
	 * @param method the method
	 * @param path the path
	 * @param queryParams the query params
	 * @param formParams the form params
	 * @param httpHeaders the http headers
	 */
	public ApiRequest(String basePath, String method, String path, Map<String, Object> queryParams, Map<String, Object> formParams, Map<String, Object> httpHeaders, boolean isRequiredApiKey) {
		this.basePath = basePath;
		this.method = Method.get(method).name();
		this.path = path;
		this.queryParams = queryParams;
		this.formParams = formParams;
		this.httpHeaders = httpHeaders;
		this.body = null;
		this.isCustomFormParams = false;
        this.isRequiredApiKey = isRequiredApiKey;
	}

	/**
	 * Instantiates a new Api request.
	 *
	 * @param basePath basePath
	 * @param method the method
	 * @param path the path
	 * @param queryParams the query params
	 * @param formParams the form params
	 * @param httpHeaders the http headers
	 * @param body the body
	 * @param isCustomFormParams the is custom form params
	 */
	public ApiRequest(String basePath, String method, String path, Map<String, Object> queryParams, Map<String, Object> formParams, Map<String, Object> httpHeaders, T body, boolean isCustomFormParams, boolean isRequiredApiKey) {
		this.basePath = basePath;
		this.method = Method.get(method).name();
		this.path = path;
		this.queryParams = queryParams;
		this.formParams = formParams;
		this.httpHeaders = httpHeaders;
		this.body = body;
		this.isCustomFormParams = isCustomFormParams;
        this.isRequiredApiKey = isRequiredApiKey;
	}

	/**
	 * Gets method.
	 *
	 * @return the method
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * Gets base path.
	 *
	 * @return the base path
	 */
	public String getBasePath() {
		return basePath;
	}

	/**
	 * Gets path.
	 *
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * Gets query params.
	 *
	 * @return the query params
	 */
	public Map<String, Object> getQueryParams() {
		return queryParams;
	}

	/**
	 * Gets form params.
	 *
	 * @return the form params
	 */
	public Map<String, Object> getFormParams() {
		return formParams;
	}

	/**
	 * Gets http headers.
	 *
	 * @return the http headers
	 */
	public Map<String, Object> getHttpHeaders() {
		return httpHeaders;
	}

	/**
	 * Gets body.
	 *
	 * @return the body
	 */
	public T getBody() {
		return body;
	}

	/**
	 * Is custom form params boolean.
	 *
	 * @return the boolean
	 */
	public boolean isCustomFormParams() {
		return isCustomFormParams;
	}

	/**
	 * Is required api key boolean.
	 *
	 * @return the boolean
	 */
	public boolean isRequiredApiKey() {
		return isRequiredApiKey;
	}
}
