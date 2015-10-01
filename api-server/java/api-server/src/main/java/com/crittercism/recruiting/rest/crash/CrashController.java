package com.crittercism.recruiting.rest.crash;


import com.crittercism.recruiting.entity.EntityReader;
import com.crittercism.recruiting.rest.security.Authenticated;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

//GET /crash/1
//GET /app/3/crash/
//GET crash/app/1

//GET crash/?appId=1

/**
 * TODO: Modify this class to do the following:
 * TODO: 1. Return a single crash given its id.
 * TODO: 2. Refuse to return the crash if the supplied user does not have the right to see it.
 */
@Path("crash/")
@Authenticated
public class CrashController {
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Crash get(@PathParam("id") int id)  throws IOException {

        return new EntityReader().readEntity(Crash.class, "/data/crashes/crash" + id + ".json");
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Crash> getByApp(@QueryParam("appId") int appId)  throws IOException {
        List<Crash> cList = new ArrayList<Crash>();
        Crash crash = new Crash();
        for (int i = 1; i < 5; i++) {
            crash = new EntityReader().readEntity(Crash.class, "/data/crashes/crash" + i + ".json");
            if (crash.getAppId() == appId)
                cList.add(crash);
        }

        return cList;
    }

}
