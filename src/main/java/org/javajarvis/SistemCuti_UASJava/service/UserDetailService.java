package org.javajarvis.SistemCuti_UASJava.service;

import org.javajarvis.SistemCuti_UASJava.model.Employee;
import org.javajarvis.SistemCuti_UASJava.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserDetailService { //implements UserDetailsService

    @Autowired
    private EmployeeRepository employeeRepository;

//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        Employee employee = employeeRepository.findByUsername(s).get();
//        return  employee;
//    }
//
//    public List<Employee>getAll(){
//        return employeeRepository.findAll();
//    }
//
//    public  void save (Employee employee){
//        employee.setPassword(new BCryptPasswordEncoder().encode(employee.getPassword()) );
//        employeeRepository.save(employee);
//    }
}
