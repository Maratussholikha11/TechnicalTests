package com.example.tesprogrammer.service;
import com.example.tesprogrammer.model.User;
import com.example.tesprogrammer.repository.UserRepository;
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
