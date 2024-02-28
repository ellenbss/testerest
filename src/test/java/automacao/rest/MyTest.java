package automacao.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyTest {
	
	Response response;
	
	
	@Test
	public void firstTest() {
		response = RestAssured.get("https://reqres.in/api/users?page=2");
		assertEquals(200, response.statusCode());
	}

}
