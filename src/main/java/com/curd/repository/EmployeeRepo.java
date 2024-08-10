package com.curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.curd.entity.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
