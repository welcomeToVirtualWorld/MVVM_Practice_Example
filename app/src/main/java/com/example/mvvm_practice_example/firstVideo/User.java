package com.example.mvvm_practice_example.firstVideo;

public class User {
    private String email;
    private String password;
    public String emailHint;
    public String passwordHint;

    public User(String emailHint, String passwordHint) {
        this.emailHint = emailHint;
        this.passwordHint = passwordHint;
    }
}
