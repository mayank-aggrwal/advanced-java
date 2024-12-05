package com.myn.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserCredentialWithDiffSerDesSansFinal {
    private String username;
    private String password;

    public UserCredentialWithDiffSerDesSansFinal() {}

    public UserCredentialWithDiffSerDesSansFinal(final String username, final String password) {
        this.username = username;
        this.password = password;
    }

    @JsonProperty("user_name")
    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    @JsonProperty("userName")
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("UserCredential [username=");
        builder.append(this.username);
        builder.append(", password=");
        builder.append(this.password);
        builder.append("]");
        return builder.toString();
    }
}