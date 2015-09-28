package com.crittercism.recruiting.rest.security;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.Base64;

/**
 * Created by kdunsmore on 9/27/15.
 */
public class AuthenticationFilter implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        // Automatically allow certain requests.
        String method = requestContext.getMethod();
//        String path = requestContext.getPath();
//        if (method.equals("GET") && path.equals("application.wadl")) {
//            return;
//        }

        // Get the authentication passed in HTTP headers parameters
        String auth = requestContext.getHeaderString("authorization");
        if (auth == null) {
            requestContext.abortWith(Response
                    .status(Response.Status.UNAUTHORIZED)
                    .entity("User cannot access the resource.")
                    .build());
            return;
        }

        auth = auth.replaceFirst("[Bb]asic ", "");
        String userColonPass = new String(Base64.getDecoder().decode(auth.getBytes()));

        if (!userColonPass.equals("admin:arse")) {
            requestContext.abortWith(Response
                    .status(Response.Status.UNAUTHORIZED)
                    .entity("User cannot access the resource.")
                    .build());
        }
    }
}
