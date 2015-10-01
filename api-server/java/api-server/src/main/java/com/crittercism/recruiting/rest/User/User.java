package com.crittercism.recruiting.rest.User;

public class User {
    private long id;
    private String username;
    private String password;
    private long accountId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void set(String password) {
        this.password = password;
    }
}
