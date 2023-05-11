package com.example.himanshu.service;

import java.util.List;

import com.example.himanshu.entity.Employee;

public interface Service {

    public List<Employee> fetchAllEmployee();

    public Employee addEmployee(Employee employee);

    public Employee findEmployeeById(Long empId);

    public void deleteEmployeeById(Long empId);
    
}
