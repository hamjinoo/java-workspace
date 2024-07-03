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

    @GetMapping("/register/signup")
    public String signup() {
        return "register/signup";
    }

    @PostMapping("/register/signup/create")
    public String createRegister(SignupDTO signupDTO) {

        Signup signup = signupDTO.toEntity();

        Signup save = signupRepository.save(signup);
        System.out.println(save);

        return "";
    }
}
