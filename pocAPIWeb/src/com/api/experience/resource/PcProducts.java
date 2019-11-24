package com.api.experience.resource;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.api.model.ProductsRO;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class PcProducts{

	@GET
	@Path("experience/liability-options")
    public ProductsRO getQuote(@HeaderParam("partyId") String partyId) {
		return null;
	}

}
