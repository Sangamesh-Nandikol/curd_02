package com.curd.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.curd.dto.NewEmployeeDto;
import com.curd.entity.Employee;
import com.curd.responseDto.GetEmpResponse;
import com.curd.responseDto.ResponseDto;

@Service
public interface EmployeeService {

	public ResponseDto addEmp(NewEmployeeDto emp);
	
	public GetEmpResponse getllEmp();
	
	public Optional<Employee>getById(Integer empId);
}
