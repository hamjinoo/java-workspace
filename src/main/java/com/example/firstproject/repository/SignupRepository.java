package com.example.firstproject.repository;

import com.example.firstproject.entity.Signup;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface SignupRepository extends CrudRepository<Signup, Long> {
    @Override
    ArrayList<Signup> findAll();
}
