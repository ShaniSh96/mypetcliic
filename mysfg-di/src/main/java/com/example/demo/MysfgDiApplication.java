package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.ConstructorInjectionController;
import com.example.demo.controller.I18Controller;
import com.example.demo.controller.MyController;
import com.example.demo.controller.PropetyInjectionController;
import com.example.demo.controller.SetterInjectionController;


@SpringBootApplication
public class MysfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MysfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		
		System.out.println("I 18");
		I18Controller controller = (I18Controller) ctx.getBean("i18Controller");
		System.out.println(controller.sayHelloWorld());
		
		System.out.println("--- Primary Bean");
		System.out.println(myController.sayHelloWorld());
		
		
		System.out.println("------- Property");
		
		PropetyInjectionController propertyControlller = (PropetyInjectionController) ctx.getBean("propetyInjectionController");
		System.out.println(propertyControlller.getGrerting());
		
		System.out.println("------- Setter");
		
		SetterInjectionController setterControlller = (SetterInjectionController) ctx.getBean("setterInjectionController");
		System.out.println(setterControlller.getGrerting());
		
		System.out.println("------- Constructor");
		
		ConstructorInjectionController constructorControlller = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");
		System.out.println(constructorControlller.getGrerting());
		
	}

}
