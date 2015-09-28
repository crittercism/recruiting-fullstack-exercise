package com.crittercism.recruiting.rest.healthcheck;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("healthcheck")
public class HealthCheckController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HealthCheck get() {
        return new HealthCheck("0:OK 0:1");
    }
}
