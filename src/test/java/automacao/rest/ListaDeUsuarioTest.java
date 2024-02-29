package automacao.rest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ListaDeUsuarioTest {
	
	Response response;
	
	
	@Test
	public void validarLista() {
		response = RestAssured.get("https://reqres.in/api/users?page=2");
		assertEquals(200, response.statusCode());
	}

}