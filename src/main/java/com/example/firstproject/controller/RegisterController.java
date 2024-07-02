package com.example.firstproject.controller;

import com.example.firstproject.dto.SignupDTO;
import com.example.firstproject.entity.Signup;
import com.example.firstproject.repository.SignupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
    @Autowired
    private SignupRepository signupRepository;

    @GetMapping("/signup")
    public String pageRegister() {
        return "register/signup";
    }

    @PostMapping("/signup/create")
    public String createRegister(SignupDTO signupDTO) {
        System.out.println(signupDTO.toString());

        // DTO to Entity
        Signup signup = signupDTO.toEntity();

        //레포지토리로 Entity를 DB에 저장
        Signup saved = signupRepository.save(signup);
        System.out.println(saved.toString());

        return "";
    }
}
