package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.services.GreetingService;

@Controller
public class ConstructorInjectionController {

	private final GreetingService greetingService;

	@Autowired
	public ConstructorInjectionController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGrerting() {
		return greetingService.sayGreeting();
	}
	
	
}
