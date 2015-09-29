package com.crittercism.recruiting.rest.crash;


import com.crittercism.recruiting.rest.security.Authenticated;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("crash")
@Authenticated
public class CrashController {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return "Not implemented";
    }
}
