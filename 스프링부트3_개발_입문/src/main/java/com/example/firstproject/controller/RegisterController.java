package com.example.firstproject.controller;


import com.example.firstproject.dto.SignupDTO;
import com.example.firstproject.entity.Signup;
import com.example.firstproject.repository.SignupRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class RegisterController {
    @Autowired
    SignupRepository signupRepository;

    @GetMapping("/register/signup")
    public String Register() {

        return "register/signup";
    }

    @PostMapping("/register/signup/create")
    public String createRegister(SignupDTO signupDTO) {


        Signup signup = signupDTO.toEntity();

        Signup save = signupRepository.save(signup);

        log.info(save.toString());

      return "";
    }

    @GetMapping("/register/list")
    public String listRegister(Model model) {

        ArrayList<Signup> signupEntityList = signupRepository.findAll();

        model.addAttribute("userList", signupEntityList);

        return "register/list";
    }
}
