package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.services.ConstructorGreetingServiceImpl;

class PropetyInjectionControllerTest {

	PropetyInjectionController propertyController;
	
	@BeforeEach
	void setUp() throws Exception {
		propertyController = new PropetyInjectionController();
		propertyController.greetingService = new ConstructorGreetingServiceImpl();
	}

	@Test
	void testGetGrerting() {
		System.out.println(propertyController.getGrerting());
	}

}
