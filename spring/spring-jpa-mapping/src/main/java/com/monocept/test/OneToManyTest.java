package com.monocept.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;

import com.monocept.repository.DepartmentRepository;


@SpringBootApplication(scanBasePackages = {"com.monocept"})
@EntityScan("com.monocept")
public class OneToManyTest {
	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(OneToManyTest.class, args);
		
		DepartmentRepository deptRepo = cxt.getBean(DepartmentRepository.class);
		deptRepo.add();
	}
}
