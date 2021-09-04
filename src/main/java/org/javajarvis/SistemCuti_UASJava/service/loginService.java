package org.javajarvis.SistemCuti_UASJava.service;


import org.javajarvis.SistemCuti_UASJava.dto.EmployeeDTO;
import org.javajarvis.SistemCuti_UASJava.model.Employee;
import org.javajarvis.SistemCuti_UASJava.model.Role;

public interface loginService {

    public Employee login (String username, String password);
}
