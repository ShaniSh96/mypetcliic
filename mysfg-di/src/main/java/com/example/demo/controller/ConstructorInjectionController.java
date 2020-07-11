package com.example.demo.controller;

import com.example.demo.services.GreetingService;

public class ConstructorInjectionController {

	private final GreetingService greetingService;

	public ConstructorInjectionController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGrerting() {
		return greetingService.sayGreeting();
	}
	
	
}
