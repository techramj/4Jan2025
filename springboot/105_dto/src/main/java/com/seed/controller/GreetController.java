package com.seed.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	//@RequestMapping(method = RequestMethod.GET, path = "/greet")
	@GetMapping("/greet")
	public String greet() {
		return "Good morning";
	}
	
	@GetMapping("/greet/{name}")
	public String greetPerson(@PathVariable("name") String name) {
		return "Good morning "+name;
	}

}
