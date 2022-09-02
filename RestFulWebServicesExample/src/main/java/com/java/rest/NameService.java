package com.java.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/nameService")
public class NameService {
	
	//concatenating the two String 
	
	@GET
	@Path("/addName/{firstName}/{lastName}")
	@Produces(MediaType.APPLICATION_JSON)
	public String addName(@PathParam("firstName") String firstName, 
			@PathParam("lastName") String lastName) {
//		String res ;
		return " Your Full Name is " +firstName+ "  " +  lastName;
	}

}
