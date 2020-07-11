package com.example.demo.controller;

import com.example.demo.services.GreetingService;

public class ConstructorInjectionController {

	public GreetingService greetingService;

	public ConstructorInjectionController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGrerting() {
		return greetingService.sayGreeting();
	}
	
	
}
