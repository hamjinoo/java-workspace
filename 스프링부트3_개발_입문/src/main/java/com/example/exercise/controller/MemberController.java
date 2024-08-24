package com.example.exercise.controller;

import com.example.exercise.dto.SignupDTO;
import com.example.exercise.entity.Signup;
import com.example.exercise.repository.SignupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    @Autowired
    private SignupRepository signupRepository;

    @GetMapping("/signup")
    public String signup() {
        return "/members/signup";
    }

    @PostMapping("/signup/create")
    public String createSignup(SignupDTO signupDTO) {// 폼에서 값을 받아와서 (형식은 SignupDTO)

        // DTO를 Entity로 변환
        Signup signup = signupDTO.toEntity();

        // 레포지토리를 통해 DB에 넣는다.
        Signup saved = signupRepository.save(signup);
        System.out.println(saved.toString());

        return "";

        // controller와 entity는 본인 역할만 하고 구체적인 것들은 원래는 다른 곳에서 하는데 일단 지금은 dto에서 함
    }

}
