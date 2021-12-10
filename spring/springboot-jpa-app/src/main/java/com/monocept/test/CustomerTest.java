package com.monocept.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;

import com.monocept.repository.CustomerRepository;

@SpringBootApplication(scanBasePackages = { "com.monocept" })
@EntityScan(basePackages = { "com.monocept.model" })
public class CustomerTest {
	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(CustomerTest.class, args);
		
		CustomerRepository repo = cxt.getBean(CustomerRepository.class);
//		repo.add();
		repo.update();
//		repo.delete();
		repo.getAllData();
		
		
	}
	

}
