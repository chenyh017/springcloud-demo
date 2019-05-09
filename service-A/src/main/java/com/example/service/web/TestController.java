package com.example.service.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


	@GetMapping(value = "/hello")
	public String hello() {
		System.out.println(8080);
		return "hello world";
	}

}
