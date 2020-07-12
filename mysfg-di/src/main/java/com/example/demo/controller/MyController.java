package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import com.example.demo.services.GreetingService;

@Controller
public class MyController {

	private final GreetingService serive;
	
	
	public MyController(GreetingService serive) {
		this.serive = serive;
	}


	public String sayHelloWorld() {
		return serive.sayGreeting();
	}
}
