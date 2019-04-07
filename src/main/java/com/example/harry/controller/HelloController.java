package com.example.harry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String HelloTest() {
		return "you are success visit the spring boot project";
	}

}
