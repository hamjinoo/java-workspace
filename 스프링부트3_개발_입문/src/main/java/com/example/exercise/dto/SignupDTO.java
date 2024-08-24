package com.example.exercise.dto;


import com.example.exercise.entity.Signup;

public class SignupDTO {
    // DTO 값
    private Long id;
    private String email;
    private String password;

    // 생성자
    public SignupDTO(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    // ToString
    @Override
    public String toString() {
        return "SignupDTO{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    // Entity to DTO
    public Signup toEntity() {
        return new Signup(null, email, password);
    }
}
