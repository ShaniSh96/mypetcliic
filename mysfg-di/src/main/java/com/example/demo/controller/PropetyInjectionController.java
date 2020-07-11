package com.example.demo.controller;

import com.example.demo.services.GreetingService;

public class PropetyInjectionController {

	public GreetingService greetingService;
	
	public String getGrerting() {
		return greetingService.sayGreeting();
	}
}
