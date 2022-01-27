package com.api;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Data_Validation {

	@Test
	public void validate_Data() {
	
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		Response response = request.get("api/users?page=2");
		
		String response_body = response.asString();
		System.out.println(response_body);
		System.out.println("************************************");
		
		ResponseBody body = response.getBody();
		String body_full = body.asString();
		System.out.println("body : "+body_full);
		System.out.println("************************************");
		
		int statusCode = response.getStatusCode();
		System.out.println("status code : " + statusCode);
		System.out.println("************************************");
		
		String header = response.getHeader("Date");
		System.out.println("header : "+header);
		System.out.println("************************************");
		
		String statusLine = response.getStatusLine();
		System.out.println("statusLine : "+statusLine);
		System.out.println("************************************");
		
		long time = response.getTime();
		System.out.println("time taken : "+time);
		System.out.println("************************************");
		
		String sessionId = response.getSessionId();
		System.out.println("sessionId : " +sessionId);
		System.out.println("************************************");
		
		Assert.assertEquals(200,statusCode );
		System.out.println("data validation successful for status code");
		
		Assert.assertEquals(response_body,body_full );
		System.out.println("data validation successful for response body");
	}

}
