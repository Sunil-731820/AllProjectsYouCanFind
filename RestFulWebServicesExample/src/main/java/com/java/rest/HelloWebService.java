package com.java.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWebService {
	
	@GET
	@Path("/helloFunction")
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "i am calling hello";
	}
	
	
	@GET
	@Path("/sumOfTwoNumber/{a}/{b}")
	public int sum(@PathParam("a") int a,@PathParam("b") int b) {
		return a+b;
	}
	

}
