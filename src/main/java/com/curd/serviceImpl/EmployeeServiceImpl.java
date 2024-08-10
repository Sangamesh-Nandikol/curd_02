package com.curd.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curd.constants.SuccessConstants;
import com.curd.dto.NewEmployeeDto;
import com.curd.entity.Employee;
import com.curd.repository.EmployeeRepo;
import com.curd.responseDto.GetEmpResponse;
import com.curd.responseDto.ResponseDto;
import com.curd.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;
	
	ResponseDto responseDto = new ResponseDto();
	
	GetEmpResponse empResponse=new GetEmpResponse();
	
	@Override
	public ResponseDto addEmp(NewEmployeeDto emp) {
		
		Employee e=new Employee();
		
		
		e.setEmpName(emp.getEmpName());
		e.setEmpAddress(emp.getEmpAddress());
		e.setEmpAge(emp.getEmpAge());
		e.setSalary(emp.getSalary());
		e.setJoningDate(emp.getJoningDate());
		Employee save = empRepo.save(e);
		
		if(save!=null) {
			
			responseDto.setMessage(SuccessConstants.successMessage);
			responseDto.setStatus(SuccessConstants.status);
			responseDto.setResponse(SuccessConstants.response);
			
			return responseDto;
		}
		else{
			return responseDto;
		}
		
		
	}


	@Override
	public GetEmpResponse getllEmp() {

		List<Employee> all = empRepo.findAll();
		
	   if(all!=null) {
		   empResponse.setMessage(SuccessConstants.successMessage);
		   empResponse.setStatus(SuccessConstants.status);
			empResponse.setResponse(SuccessConstants.response);
			empResponse.setList(all);
			return empResponse;
		   
	   }else {
		   empResponse.setMessage("failed");
		   empResponse.setStatus(false);
			empResponse.setResponse("500");
			return empResponse;
	   }

		
		
	}


	@Override
	public Optional<Employee> getById(Integer empId) {
		
		Optional<Employee> byId = empRepo.findById(empId);
		
		if(byId!=null) {
			return byId;
		}
		
		return byId;
	}

}
