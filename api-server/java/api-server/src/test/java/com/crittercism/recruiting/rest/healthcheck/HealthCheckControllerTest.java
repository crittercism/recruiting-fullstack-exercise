package com.crittercism.recruiting.rest.healthcheck;

import com.crittercism.recruiting.rest.common.AbstractControllerTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealthCheckControllerTest extends AbstractControllerTest {
    @Test
    public void testGetIt() {
        String responseMsg = getTarget()
                .path("healthcheck")
                .request()
                .get(String.class);
        assertEquals("{\"status\":\"0:OK 0:1\"}", responseMsg);
    }
}
