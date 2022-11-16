package org.launchcode.spaday.models;

import org.springframework.context.annotation.Lazy;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    @NotEmpty
    @Size(min = 5, max = 15)
    private String username;

    @Email
    private String email;

    @NotEmpty
    @Size(min = 6)
    private String password;

    @NotEmpty
    @Size(min = 6)
    @NotNull(message = "Passwords do not match")
    private String verifyPassword;

    public User() {

    }

    public User(String username, String email, String password, String verifyPassword) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verifyPassword = verifyPassword;
    }


//    || this.getPassword() == null || this.getVerifyPassword() == null
    private void checkPassword () {
        if (!this.getPassword().equals(this.getVerifyPassword())) {
            verifyPassword = null;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        checkPassword();
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
        checkPassword();
    }
}
