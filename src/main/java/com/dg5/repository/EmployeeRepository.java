package com.dg5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dg5.dto.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}