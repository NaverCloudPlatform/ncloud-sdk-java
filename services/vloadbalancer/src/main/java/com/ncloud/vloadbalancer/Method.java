/*
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vloadbalancer;

import com.ncloud.vloadbalancer.exception.SdkException;

/**
 * The enum Method.
 */
public enum Method {
	/**
	 *Get method.
	 */
	GET,
	/**
	 *Post method.
	 */
	POST,
	/**
	 *Put method.
	 */
	PUT,
	/**
	 *Delete method.
	 */
	DELETE,
	/**
	 *Patch method.
	 */
	PATCH,
	/**
	 *Options method.
	 */
	OPTIONS,
	/**
	 *Head method.
	 */
	HEAD;

	public static Method get(String name) {
		for (Method method : Method.values()) {
			if (method.name().equalsIgnoreCase(name) == true) {
				return method;
			}
		}
		throw new SdkException("This method is not supported.: " + name);
	}
}
