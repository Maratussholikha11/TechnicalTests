package org.javajarvis.TechnicalTests.service;

import org.javajarvis.TechnicalTests.model.User;
import org.javajarvis.TechnicalTests.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginServiceImplement implements loginService {

    @Autowired
    UserRepository userRepository;


    @Override
    public User login(String username, String password) {
        User admin = userRepository.findEmployeeByUsernameAndPassword(username,password);
        return admin;
    }

}
