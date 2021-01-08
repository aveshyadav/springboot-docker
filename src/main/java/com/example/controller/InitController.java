package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {
	
	@GetMapping(path = "/")
	public String initMethod() {
		
		return "Welcome to Spring Boot";
	}
	
	@GetMapping(path = "/test")
	public String initMethod2() {
		
		return "Welcome to Spring Boot Test";
	}	

}
