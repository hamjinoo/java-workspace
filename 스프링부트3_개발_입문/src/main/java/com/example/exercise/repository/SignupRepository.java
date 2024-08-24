package com.example.exercise.repository;


import com.example.exercise.entity.Signup;
import org.springframework.data.repository.CrudRepository;

public interface SignupRepository extends CrudRepository<Signup, Long> {
}
