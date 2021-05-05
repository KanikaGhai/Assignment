package com.project.assignment.controller;

import java.util.TimeZone;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.assignment.models.Response;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/assignment")
public class AppAssignment {
	
	
	// get function to return the constant message and current timestamp
	@RequestMapping("/myApi")
	public Response Sample() {
		Response response = new Response();
		try {
		Date date = new Date(System.currentTimeMillis());

		//Conversion
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
		sdf.setTimeZone(TimeZone.getTimeZone("CET"));
		String date_text = sdf.format(date);
		response.setDate(date_text);
		response.setMessage("Welcome to my machine");
		}
		catch (Exception e) {
			e.printStackTrace();
			response.setMessage("Error in displaying Message");
		}
		
		return response;
	}
	
}