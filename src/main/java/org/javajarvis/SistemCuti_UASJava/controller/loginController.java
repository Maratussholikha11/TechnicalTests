package org.javajarvis.SistemCuti_UASJava.controller;


import org.javajarvis.SistemCuti_UASJava.service.loginService;
import org.javajarvis.SistemCuti_UASJava.model.Employee;
import org.javajarvis.SistemCuti_UASJava.repository.EmployeeRepository;
import org.javajarvis.SistemCuti_UASJava.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

@RestController
@RequestMapping("/masuk")
public class loginController {
    @Autowired
    loginService loginService;

    @Autowired
    EmployeeRepository employeeRepository;




//    @RequestMapping("/masuk")
//    public ModelAndView login(){
//        ModelAndView mav = new ModelAndView("logIn");
//
//        return mav;
//    }

    @GetMapping("/cekmasuk")
    public String login(@ModelAttribute("employee")Employee employee){
        Employee authlogin = loginService.login(employee.getUsername(),employee.getPassword());
        System.out.println(authlogin);

        if (Objects.nonNull(authlogin)){
            return "forward:/index.html";
        }else {
            return "gagal";
        }
    }

}
