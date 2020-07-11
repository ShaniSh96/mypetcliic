package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.services.GreetingServiceImpl;

class SetterInjectionControllerTest {

	public SetterInjectionController setterInjectionController;
	@BeforeEach
	void setUp() throws Exception {
		setterInjectionController = new SetterInjectionController();
		
		setterInjectionController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	void testGetGrerting() {
		System.out.println(setterInjectionController.getGrerting());
	}

}
