package com.crittercism.recruiting.rest.healthcheck;

public class HealthCheck {
    private String status;

    public HealthCheck(String status) {
        this.status = status;
    }


    public String getStatus() {
        return status;
    }
}
