package org.javajarvis.SistemCuti_UASJava.controller;

import org.javajarvis.SistemCuti_UASJava.model.Employee;
import org.javajarvis.SistemCuti_UASJava.repository.EmployeeRepository;
import org.javajarvis.SistemCuti_UASJava.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "")
@CrossOrigin
public class CobaController {

    @Autowired
    private UserDetailService userDetailService;

    @Autowired
    private EmployeeRepository er;

    @GetMapping("/page1")
    @ResponseBody
    public String Hallo(){
        return "hallo ";
    }

    @GetMapping("/page2")
    @ResponseBody
    public String Hallo2(){
        return "hallo2 ";
    }

//    @PostMapping("/register")
//    @ResponseBody
//    public String register(@RequestBody Employee employee){
//        userDetailService.save(employee);
//        return "Registered";
//
//    }


}
