package com.example.himanshu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.himanshu.entity.Employee;
import com.example.himanshu.service.Service;

@RestController
@RequestMapping
public class ApplicationController {

    @Autowired
    private Service service;
    
    @GetMapping("/fetch")
    public ResponseEntity<List<Employee>> fetchEmployee(){
       List<Employee> fetchedEmployee= service.fetchAllEmployee();
       return new ResponseEntity<List<Employee>>(fetchedEmployee, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee savedEmployee= service.addEmployee(employee);
        return new ResponseEntity<Employee>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping("/fetch/{id}")
    public ResponseEntity<Employee> fetchEmployeeById(@PathVariable("id") Long empId){
        Employee fetchedEmployee= service.findEmployeeById(empId);
        return new ResponseEntity<Employee>(fetchedEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployeeById(@PathVariable("id") Long empId){
        service.deleteEmployeeById(empId);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
}
