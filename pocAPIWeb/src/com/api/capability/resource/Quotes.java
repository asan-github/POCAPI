package com.api.capability.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class Quotes {
	
	@GET
	@Path("capability/quotes/{quoteId}")
	public String getQuote(@PathParam("quoteId") String quoteId)
	{
		return "Hello";
	}

}
