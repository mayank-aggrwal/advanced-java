package com.myn.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserCredentialWithDiffSerDes {
    private final String username;
    private final String password;

    @JsonCreator
    public UserCredentialWithDiffSerDes(@JsonProperty("userName") final String username,
                          @JsonProperty("password") final String password) {
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
