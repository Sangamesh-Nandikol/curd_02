package com.curd.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curd.dto.NewEmployeeDto;
import com.curd.entity.Employee;
import com.curd.repository.EmployeeRepo;
import com.curd.responseDto.GetEmpResponse;
import com.curd.responseDto.ResponseDto;
import com.curd.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	
	
	@Autowired
	private EmployeeService empSer;
	
	@PostMapping("/newEmp")
	public ResponseDto addEmp(@RequestBody NewEmployeeDto data) {
		
		ResponseDto emp = empSer.addEmp(data);
		
		
		return emp;
		
		
	}
	
	@GetMapping("/getAll")
	public GetEmpResponse getAllEmp() {
		
		GetEmpResponse getllEmp = empSer.getllEmp();
		
		return getllEmp;
		
		
	}
	
	@GetMapping("/getById")
	public Optional<Employee> getByID(@RequestParam Integer Id) {
		
		Optional<Employee> byId = empSer.getById(Id);
		
		return byId;
	}

}
