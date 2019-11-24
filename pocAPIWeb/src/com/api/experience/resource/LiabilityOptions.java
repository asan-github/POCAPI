package com.api.experience.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class LiabilityOptions{

	@GET
	@Path("experience/liability-options")
    public List<String> getLiabilityOptions(@QueryParam("state") String state) {
		return  null;
	}

}
