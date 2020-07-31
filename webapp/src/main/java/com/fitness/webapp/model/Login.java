package com.fitness.webapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotBlank;

public class Login {
    @NotBlank
    private final String login;
    @NotBlank
    private final String password;
    @NotBlank
    private final String name;
    @NotBlank
    private final String surname;
    private final String fathersName;
    private final boolean isSub;

    public Login(@JsonProperty("login") String login,
                 @JsonProperty("password") String password,
                 @JsonProperty("name") String name,
                 @JsonProperty("surname") String surname,
                 @JsonProperty("fathersName") String fathersName,
                 @JsonProperty("isSub") boolean isSub) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.fathersName = fathersName;
        this.isSub = isSub;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFathersName() {
        return fathersName;
    }

    public boolean getIsSub() {
        return isSub;
    }

    public String getAccountInforamtion() {
        int sub = (isSub) ? 1 : 0;

        return "('" + name + "', '" + surname + "', '" + fathersName+ "', '" + sub + "')";
    }

    @Override
    public String toString() {
        return "{" +
                "login: '" + login + '\'' +
                ", password: '" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Login other = (Login) o;

        return login.equals(other.login) & password.equals(other.password);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + login.hashCode();
        result = 31 * result + password.hashCode();

        return result;
    }
}
