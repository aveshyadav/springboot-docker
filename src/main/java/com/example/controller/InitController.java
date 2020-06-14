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

}
