package com.basic.springboot01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {

	
	@Value("${welcome.message}")
	private String welcomeMessage;
	
	
	@GetMapping("/")
	public String helloWorld() {
		return welcomeMessage;
	}
	
}
