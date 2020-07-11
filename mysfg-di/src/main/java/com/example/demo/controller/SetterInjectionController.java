package com.example.demo.controller;

import com.example.demo.services.GreetingService;

public class SetterInjectionController {

	public GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGrerting() {
		return greetingService.sayGreeting();
	}
}
