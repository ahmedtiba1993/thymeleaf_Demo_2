package com.jpa.thymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.thymeleaf.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
