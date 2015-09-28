package com.crittercism.recruiting.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.grizzly.http.server.HttpServer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Base64;

import static org.junit.Assert.assertEquals;

public class HealthCheckTest {

    private HttpServer server;
    private WebTarget target;

    @Before
    public void setUp() throws Exception {
        // start the server
        server = Main.startServer();
        // create the client
        Client c = ClientBuilder.newClient();

        // uncomment the following line if you want to enable
        // support for JSON in the client (you also have to uncomment
        // dependency on jersey-media-json module in pom.xml and Main.startServer())
        // --
        // c.configuration().enable(new org.glassfish.jersey.media.json.JsonJaxbFeature());

        target = c.target(Main.BASE_URI);
    }

    @After
    public void tearDown() throws Exception {
        server.shutdownNow();
    }

    /**
     * Test to see that the message "Got it!" is sent in the response.
     */
    @Test
    public void testGetIt() {
        String encodedCredentials = new String(Base64.getEncoder().encode("admin:admin".getBytes()));
        String responseMsg = target
                .path("healthcheck")
                .request()
                .header("authorization", "Basic YWRtaW46YWRtaW4=")
                .get(String.class);
        System.out.println(responseMsg);
        assertEquals("{\"status\":\"0:OK 0:1\"}", responseMsg);
    }
}
