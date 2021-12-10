package com.swabhav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"com.swabhav"})
@EntityScan("com.swabhav")
public class JwtApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(JwtApp1Application.class, args);
	}

}
