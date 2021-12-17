package com.example.tesprogrammer.controller;

import com.example.tesprogrammer.model.User;
import com.example.tesprogrammer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {
    @Autowired
    com.example.tesprogrammer.service.loginService loginService;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/signin")
    public String login(@ModelAttribute("employee") User user){
        User authlogin = loginService.login(user.getUsername(), user.getPassword());
        System.out.println(authlogin);
        return "sukses";
    }

}

