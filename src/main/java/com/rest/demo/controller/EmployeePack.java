package com.rest.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restdemo.dto.Employee;

@RestController
public class EmployeePack {
	
	
	@PostMapping("/employee")
	public String employeeEmployeeData(@RequestBody Employee employee) {
		if(employee.getUserName().equals("David")) {
			return "Valid userName";
			}
			return "Invalid user";
			
		
	}

}
