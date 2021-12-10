package com.monocept.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	
	public GreetingService() {
		System.out.println("Service Created");
	}
	
	public String greet(String name) {
		return "Good Evening " +name;
		
	}
}
