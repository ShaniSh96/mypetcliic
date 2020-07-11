package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.MyController;


@SpringBootApplication
public class MysfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MysfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		
		String greeting = myController.sayHelloWorld();
		System.out.println(greeting);
		
	}

}
