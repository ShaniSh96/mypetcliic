package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.demo.services.GreetingService;

@Controller
public class I18Controller {

	private final GreetingService service;

	public I18Controller(@Qualifier("i18Service") GreetingService service) {
		this.service = service;
	}
	
	public String sayHelloWorld() {
		return service.sayGreeting();
	}
	
	
	
}
