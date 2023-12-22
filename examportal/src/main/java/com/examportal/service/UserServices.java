package com.examportal.service;

import com.examportal.domain.User;
import com.examportal.domain.UserRole;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserServices {


    public User createUser(User user);
}
