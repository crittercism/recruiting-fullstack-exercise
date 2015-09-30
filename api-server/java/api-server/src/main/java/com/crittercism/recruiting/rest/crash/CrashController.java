package com.crittercism.recruiting.rest.crash;


import com.crittercism.recruiting.rest.security.Authenticated;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * TODO: Modify this class to do the following:
 * TODO: 1. Return a single crash given its id.
 * TODO: 2. Refuse to return the crash if the supplied user does not have the right to see it.
 */
@Path("crash")
@Authenticated
public class CrashController {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return "Not implemented";
    }
}
