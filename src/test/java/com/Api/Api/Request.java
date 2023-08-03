package com.Api.Api;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Request {
	
	@Test
	public void getRequest()
	{
		String url="https://reqres.in/api/users?page=2";
		Response response=RestAssured.get(url);
		Assert.assertEquals(response.getStatusCode(), 200,"Response codemismatched");
		
		int totalPages=response.jsonPath().getInt("total_pages");
		Assert.assertEquals(totalPages, 2);
		
		System.out.println("Change by American guy");
				
	}
	
	@Test
	public void postRequest()
	{
		String url="https://reqres.in/api/users";
		String contentType="application/json";
		String body="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		Response response=RestAssured.given().contentType(contentType)
				.body(body).when().post(url).then().extract().response();
		Assert.assertEquals(response.getStatusCode(), 201,"Response codemismatched");
		
		String name=response.jsonPath().get("job");
		Assert.assertEquals(name, "leader", "mismatch");
		
	}

}
