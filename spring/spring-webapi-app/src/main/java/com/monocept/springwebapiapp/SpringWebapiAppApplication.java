package com.monocept.springwebapiapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.monocept"})
public class SpringWebapiAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebapiAppApplication.class, args);
	}

}
