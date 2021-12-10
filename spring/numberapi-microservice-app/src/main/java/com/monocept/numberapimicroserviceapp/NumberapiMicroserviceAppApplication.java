package com.monocept.numberapimicroserviceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.monocept.controller.NumberController;

@SpringBootApplication(scanBasePackages = { "com.monocept" })
public class NumberapiMicroserviceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(NumberapiMicroserviceAppApplication.class, args);
//		NumberController nc = cxt.getBean(NumberController.class);
//		nc.showNumberDetails(25);

	}

}
