package com.example.firstproject.dto;

import com.example.firstproject.entity.Signup;

public class SignupDTO {
    private String email;
    private String password;

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

    public Signup toEntity(){
        //Signup 객체를 생성해서 리턴해주겟다
        return new Signup(null, email, password);
    }
}
