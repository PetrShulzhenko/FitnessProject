package com.fitness.webapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IdsPair {
    private final String login;
    private final String password;

    public IdsPair(@JsonProperty("login") String login,
                   @JsonProperty("password") String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() { return login; }

    public String getPassword() { return password; }

    @Override
    public String toString() {
        return "{" +
                "login: '" + login + '\'' +
                ", password: '" + password + '\'' +
                "}";
    }
}
