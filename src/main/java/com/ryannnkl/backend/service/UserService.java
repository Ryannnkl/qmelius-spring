package com.ryannnkl.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ryannnkl.backend.model.Users;
import com.ryannnkl.backend.repository.UserRepository;

public class UserService {
  
  @Autowired
  private UserRepository repository;

  public List<Users> findAll() {
    return this.repository.findAll();
  }

}
