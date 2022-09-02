package com.java.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/testing")
public class testhello {
	
	
	@GET
	@Path("/testHTML")
	@Produces(MediaType.TEXT_HTML)
	public String test() {
		return "HelloTest.html";
	}

}
