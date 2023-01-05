package com.mahadev.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(path = "hello-world")
	public String sayHello() {
		return "Welcome to Springboot";
	}
}
