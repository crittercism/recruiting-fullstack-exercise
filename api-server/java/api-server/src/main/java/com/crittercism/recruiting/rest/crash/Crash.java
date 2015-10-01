package com.crittercism.recruiting.rest.crash;

public class Crash {
    private long id;
    private long appId;
    private String reason;
    private String[] stackTrace;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAppId() {
        return appId;
    }

    public void setAppId(long appId) {
        this.appId = appId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String[] getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String[] stackTrace) {
        this.stackTrace = stackTrace;
    }
}
