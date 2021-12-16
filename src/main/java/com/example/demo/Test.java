package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@PostMapping(value = "/api")
	public String hello() {
		System.out.println("Hello Spring Controller");
		return "Welcome to Spring Rest World";
		
	}

}
