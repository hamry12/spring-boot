package com.example.himanshu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.himanshu.entity.Employee;
import com.example.himanshu.repository.CrudRepo;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{

    @Autowired
    private CrudRepo crudRepo;

    @Override
    public List<Employee> fetchAllEmployee() {
        return crudRepo.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee){
        return crudRepo.save(employee);
    }

    @Override
    public Employee findEmployeeById(Long empId){
        return crudRepo.findById(empId).get();
    }

    @Override
    public void deleteEmployeeById(Long empId) {
        crudRepo.deleteById(empId);
    }

    
    
}
