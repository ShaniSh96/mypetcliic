package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.services.GreetingService;

@Controller
public class PropetyInjectionController {

	@Autowired
	public GreetingService greetingService;
	
	public String getGrerting() {
		return greetingService.sayGreeting();
	}
}
