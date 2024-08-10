package com.curd.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class NewEmployeeDto {

	private Integer empId;	
	private String empName;
	private String empAddress;
	private Integer empAge;
	private String joningDate;
	private Double salary;

	
	
}
