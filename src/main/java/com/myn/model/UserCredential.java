package com.myn.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class ready for serialization/deserialization
 *
 */
public class UserCredential {
    private final String username;
    private final String password;

    @JsonCreator
    public UserCredential(@JsonProperty("user_name") final String username,
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

// SIMPLE CLASS
//public class UserCredential {
//    private final String username;
//    private final String password;
//
//    public UserCredential(final String username, final String password) {
//        this.username = username;
//        this.password = password;
//    }
//
//    public String getUsername() {
//        return this.username;
//    }
//
//    public String getPassword() {
//        return this.password;
//    }
//}
