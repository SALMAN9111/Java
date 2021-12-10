package com.monocept.test;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.monocept.service.GreetingService;


public class Application {
	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(Foo.class, args);
		System.out.println("Inside main");
		
		GreetingService greeter = cxt.getBean(GreetingService.class);
		System.out.println(greeter.greet("Frank"));
	}
}
