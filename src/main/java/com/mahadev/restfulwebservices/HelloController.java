package com.mahadev.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(path = "hello-world")
	public String sayHello() {
		return "Welcome to @GetMapping";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world2")
	public String sayHello2() {
		return "Welcome to @RequestMapping";
	}
	
	@GetMapping(path = "/bean")
	public HelloWorld helloBean() {
		return new HelloWorld("Hello world");
	}
	
}
