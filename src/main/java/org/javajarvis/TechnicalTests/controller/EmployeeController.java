package org.javajarvis.TechnicalTests.controller;


import org.javajarvis.TechnicalTests.dto.ResponseData;
import org.javajarvis.TechnicalTests.model.User;
import org.javajarvis.TechnicalTests.repository.UserRepository;
import org.javajarvis.TechnicalTests.service.UserService;
import org.javajarvis.TechnicalTests.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/user")
public class EmployeeController {
    @Autowired
    private UserService services;
    @Autowired
    private UserRepository userRepository;


    @Autowired
    private UserDetailService userDetailService;

    @Autowired
    UserService userService;


    @PostMapping("/signup")
    @ResponseBody
    public String register(@RequestBody User employee){
        ResponseData<User> response = new ResponseData<>();
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        userDetailService.save(employee);
        return "Registered";
    }

    @PutMapping("/signup")
    @ResponseBody
    public String updateRegister(@RequestBody User user){
        userDetailService.save(user);
        return "Registered";
    }


    @GetMapping("/getAllUser")
    public List<User> findAll(){
        return services.findAll();
    }

    @GetMapping("/{id}")
    public User findOne (@PathVariable ("id") Integer id){
        Optional<User> p = userRepository.findById(id);
        if (!p.isPresent()){
            return  null;
        }
        return services.findOne(id);
    }

}
