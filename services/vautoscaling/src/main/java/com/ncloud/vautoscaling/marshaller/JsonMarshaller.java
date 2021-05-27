/*
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vautoscaling.marshaller;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The type Json marshaller.
 */
public class JsonMarshaller implements Marshaller {
	private static JsonMarshaller instance;
	private final String contentType;
	private final ObjectMapper objectMapper;

	private JsonMarshaller() {
		contentType = "application/json";
		objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}

	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static JsonMarshaller getInstance() {
		if (instance == null) {
			instance = new JsonMarshaller();
		}
		return instance;
	}

	public String getContentType() {
		return contentType;
	}

	public String writeValueAsString(Object value) throws IOException {
		return objectMapper.writeValueAsString(value);
	}

	public <T> T readValue(InputStream src, Class clazz) throws IOException {
		JsonNode tree = objectMapper.readTree(src);
		String simpleName = clazz.getSimpleName();
		String className = Character.toLowerCase(simpleName.charAt(0)) + simpleName.substring(1);

		JsonNode jsonNode = tree.get(className);
		if (jsonNode == null) {
			return (T)objectMapper.readValue(tree.toString(), clazz);
		} else {
			return (T)objectMapper.readValue(jsonNode.toString(), clazz);
		}
	}
}
