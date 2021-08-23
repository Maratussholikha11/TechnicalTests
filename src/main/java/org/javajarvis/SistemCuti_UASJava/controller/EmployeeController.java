package org.javajarvis.SistemCuti_UASJava.controller;


import org.javajarvis.SistemCuti_UASJava.dto.EmployeeDTO;
import org.javajarvis.SistemCuti_UASJava.dto.ResponseData;
import org.javajarvis.SistemCuti_UASJava.model.Employee;
import org.javajarvis.SistemCuti_UASJava.repository.EmployeeRepository;
import org.javajarvis.SistemCuti_UASJava.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService services;
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private  ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<ResponseData<Employee>> create(@RequestBody Employee employee, Errors errors){
        ResponseData<Employee> responseData = new ResponseData<>();

        if (errors.hasErrors()){
            for (ObjectError error : errors.getAllErrors()){
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        responseData.setStatus(true);
        responseData.setPayload(services.save(employee));
        return ResponseEntity.ok(responseData);
    }

    @PutMapping
    public ResponseEntity<ResponseData<Employee>> update(@RequestBody EmployeeDTO employeeDTO, Errors errors){
        ResponseData<Employee> responseData = new ResponseData<>();

        if (errors.hasErrors()){
            for (ObjectError error : errors.getAllErrors()){
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        Employee employee = modelMapper.map(employeeDTO, Employee.class);
        responseData.setStatus(true);
        responseData.setPayload(services.save(employee));
        return ResponseEntity.ok(responseData);
    }

    @GetMapping
    public List<Employee> findAll(){
        return services.findAll();
    }

    @GetMapping("/{id}")
    public Employee findOne (@PathVariable ("id") Integer id){
        Optional<Employee> p = employeeRepository.findById(id);
        if (!p.isPresent()){
            return  null;
        }
        return services.findOne(id);
    }


}
