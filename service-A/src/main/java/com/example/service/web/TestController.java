package com.example.service.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired

	@GetMapping(value = "/hello")
	public String hello() {
		return "hello world";
	}
	
	public String callB() {
		return 
		
	}
}
