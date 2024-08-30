package com.rest.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restdemo.dto.Users;

@RestController
public class HomeController {
	
	@PostMapping("/save")
	public String saveUsersData(@RequestBody Users users) {
		if(users.getUserName().equals("Tony")) {
		return "Valid userName";
		}
		return "Invalid user";
		
	}
	
	

}