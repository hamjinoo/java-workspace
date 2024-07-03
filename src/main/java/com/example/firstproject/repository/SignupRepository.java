package com.example.firstproject.repository;

import com.example.firstproject.entity.Signup;
import org.springframework.data.repository.CrudRepository;

public interface SignupRepository extends CrudRepository<Signup, Long> {
}
