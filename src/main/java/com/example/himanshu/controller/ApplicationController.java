package com.example.himanshu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.himanshu.entity.Employee;
import com.example.himanshu.service.Service;

@RestController
@RequestMapping
public class ApplicationController {

    @Autowired
    private Service service;
    
    @GetMapping("/fetchEmployee")
    public List<Employee> fetchEmployee(){
       return service.fetchAllEmployee();
    }
}
