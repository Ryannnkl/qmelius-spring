package com.ryannnkl.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ryannnkl.backend.model.Users;
import com.ryannnkl.backend.repository.UserRepository;
import com.ryannnkl.backend.service.UserService;

@RequestMapping("/users")
@RestController
public class UserController {
  @Autowired
  private UserRepository repository;

  @GetMapping
  public List<Users> findAll() {
    return this.repository.findAll();
  }

  @PostMapping
  public Users save(@RequestBody Users createUser) {
    return this.repository.save(createUser);
  }
}
