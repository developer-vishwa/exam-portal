package com.examportal.service.impl;

import com.examportal.domain.Role;
import com.examportal.domain.User;
import com.examportal.domain.UserRole;
import com.examportal.repository.RoleRepository;
import com.examportal.repository.UserRepository;
import com.examportal.service.UserServices;
import org.hibernate.bytecode.internal.bytebuddy.BytecodeProviderImpl;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class UserServiceImpl implements UserServices {


//    private static final Logger logger = (Logger) LoggerFactory.getLogger(UserServices.class);

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        User currentUser = this.userRepository.findByUserName(user.getUserName());
        if (currentUser != null) {
//            logger.info("this User Already Exist");
        } else {
            currentUser = this.userRepository.save(user);
        }
        return currentUser;
    }
}
