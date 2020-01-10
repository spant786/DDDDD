package com.example.facebook160250.model;

public class Login {

    private String email;
    private String password;

    public Login(String email, String password) {
        this.email = email;
        this.password = password;

    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
