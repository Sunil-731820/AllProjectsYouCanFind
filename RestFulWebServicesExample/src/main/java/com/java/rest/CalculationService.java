package com.java.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("calculation")
public class CalculationService {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/sumOfTwoNum/{a}/{b}")
	public String sum(@PathParam("a") float a , @PathParam("b") float b) {
		String res = "";
		float c = a+b;
		res +=c;
		return res;
	}
	
	
	@GET
	@Path("/subOfTwoNum/{a}/{b}")
	@Produces(MediaType.APPLICATION_JSON)
	public String sub(@PathParam("a") double a , @PathParam("b") double b) {
		double c = a-b;
		String res ="";
		res += c;
		return res;
	}
	
	@GET
	@Path("/multiplicationOfTwoNum/{a}/{b}")
	@Produces(MediaType.APPLICATION_JSON)
	public String  multiplication(@PathParam("a") int a , @PathParam("b") int b) {
		String  res = "";
		res  += a*b; 
		System.out.println("the multiplication of the two Number is " + res);
		return  res;
	}

}
