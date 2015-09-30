package com.crittercism.recruiting.entity;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.io.InputStream;

public class EntityReader {
    /**
     * Read's a JSON entity into an associated POJO.
     * @param entityClass The class of POJO to be hydrated.
     * @param path The path of the JSON blob.
     * @param <T> The type of the POJO read.
     * @return The hydrated POJO.
     * @throws IOException If an error occurs.
     */
    public @NotNull <T> T readEntity(@NotNull Class<T> entityClass, @NotNull String path) throws IOException {
        try (InputStream is = getClass().getResourceAsStream(path)) {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(is, entityClass);
        }
    }
}
