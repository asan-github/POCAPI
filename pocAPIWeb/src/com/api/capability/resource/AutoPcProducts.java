package com.api.capability.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.api.model.UnifiedAutoPolicyBO;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class AutoPcProducts{
	
	@GET
	@Path("capability/pc-products/auto")
    public List<UnifiedAutoPolicyBO> getQuote(@HeaderParam("partyId") String partyId) {
		return null;
}

}
