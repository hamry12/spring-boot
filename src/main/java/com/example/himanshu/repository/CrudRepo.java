package com.example.himanshu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.himanshu.entity.Employee;

@Repository
public interface CrudRepo extends JpaRepository<Employee, Long> {
    
}
