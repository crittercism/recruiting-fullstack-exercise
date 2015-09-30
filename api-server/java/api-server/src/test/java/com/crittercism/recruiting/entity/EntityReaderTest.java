package com.crittercism.recruiting.entity;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EntityReaderTest {
    private EntityReader reader;

    @Before
    public void setUp() {
        reader = new EntityReader();
    }

    @Test
    public void testReading() throws IOException {
        Thing thing = reader.readEntity(Thing.class, "/com/crittercism/recruiting/entity/thing.json");
        assertNotNull(thing);
        assertEquals("Giblets", thing.getName());
        assertEquals(4517734, thing.getId());
    }
}
