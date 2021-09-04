package org.javajarvis.SistemCuti_UASJava.service;

import org.javajarvis.SistemCuti_UASJava.model.Employee;
import org.javajarvis.SistemCuti_UASJava.model.Role;
import org.javajarvis.SistemCuti_UASJava.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginServiceImplement implements loginService {

    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public Employee login(String username, String password) {
        Employee admin = employeeRepository.findEmployeeByUsernameAndPassword(username,password);
        return admin;
    }

}
