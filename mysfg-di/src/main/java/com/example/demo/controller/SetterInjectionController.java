package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.services.GreetingService;

@Controller
public class SetterInjectionController {

	public GreetingService greetingService;

	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGrerting() {
		return greetingService.sayGreeting();
	}
}
