package com.curd.responseDto;

import java.util.ArrayList;
import java.util.List;

import com.curd.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetEmpResponse {
	
	private String response;
	private String message;
	private boolean status;
	private List<Employee> list;
	
	

}
