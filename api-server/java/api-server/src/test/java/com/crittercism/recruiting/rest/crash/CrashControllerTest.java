package com.crittercism.recruiting.rest.crash;

import com.crittercism.recruiting.rest.common.AbstractControllerTest;
import org.junit.Test;

import java.util.Base64;

import static org.junit.Assert.assertEquals;

public class CrashControllerTest extends AbstractControllerTest {
    /**
     * Test to see that the message "Got it!" is sent in the response.
     */
    @Test
    public void testGetIt() {
        String encodedCredentials = new String(Base64.getEncoder().encode("admin:admin".getBytes()));
        String responseMsg = getTarget()
                .path("crash")
                .request()
                .header("authorization", "Basic " + encodedCredentials)
                .get(String.class);
        assertEquals("Not implemented", responseMsg);
    }
}
