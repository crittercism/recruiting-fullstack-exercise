package com.crittercism.recruiting.rest.app;


import com.crittercism.recruiting.entity.EntityReader;
import com.crittercism.recruiting.rest.security.Authenticated;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

/**
 * TODO: Modify this class to do the following:
 * TODO: 1. Return a single app given its id.
 * TODO: 2. Refuse to return the app if the supplied user does not have the right to see it.
 */
@Path("app")
@Authenticated
public class AppController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public App get() throws IOException {
        return new EntityReader().readEntity(App.class, "/data/apps/app1.json");
    }
}
