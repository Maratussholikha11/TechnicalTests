package org.javajarvis.TechnicalTests.controller;


import org.javajarvis.TechnicalTests.service.loginService;
import org.javajarvis.TechnicalTests.model.User;
import org.javajarvis.TechnicalTests.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class loginController {
    @Autowired
    loginService loginService;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/signin")
    public String login(@ModelAttribute("employee") User user){
        User authlogin = loginService.login(user.getUsername(), user.getPassword());
        System.out.println(authlogin);
        return "sukses";
    }

}

