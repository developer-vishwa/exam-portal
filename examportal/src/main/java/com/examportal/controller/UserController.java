package com.examportal.controller;


import com.examportal.domain.User;
import com.examportal.repository.RoleRepository;
import com.examportal.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exam-portal/user")
public class UserController {

    @Autowired
    private UserServices userServices;

    @Autowired
    private RoleRepository roleRepository;

    @PostMapping("/save")
    public User CreateUser(@RequestBody User user) {
        User user1 = userServices.createUser(user);
        return user1;
    }



}



