package controller;

import static org.junit.Assert.assertEquals;

import java.net.URI;

//import java.net.URI;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


import com.project.assignment.AbstractClass;

public class AppAssignmentTest extends AbstractClass {
	
	@Override
	@Before
	public void setUp() {
		super.setUp();
	}

	@Test
	public void testGetApi() throws Exception {
		
		RestTemplate restTemplate = new RestTemplate();
	    
	    final String baseUrl = "http://localhost:8080/assignment/myApi";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	    int statusCode = result.getStatusCodeValue();
	    assertEquals(true, result.getBody().contains("Welcome to my machine"));
	    assertEquals(statusCode, 200);
	}
}
