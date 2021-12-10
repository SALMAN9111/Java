package com.swabhav.containerizationapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ContainerizationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContainerizationAppApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello says Salman";
	}

}
