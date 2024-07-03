package com.example.firstproject.dto;

import com.example.firstproject.entity.Signup;

public class SignupDTO {

    public String email;
    public String password;

    public SignupDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "SignupDTO{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Signup toEntity() {
        return new Signup(null, email, password);
    }
}
