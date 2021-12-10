////package com.monocept.test;
////
////import org.springframework.boot.SpringApplication;
////import org.springframework.boot.autoconfigure.SpringBootApplication;
////import org.springframework.boot.autoconfigure.domain.EntityScan;
////import org.springframework.context.ApplicationContext;
////
////import com.monocept.repository.ContactRepository;
////
////@SpringBootApplication(scanBasePackages = { "com.monocept" })
////@EntityScan(basePackages = { "com.monocept.model" })
////public class ContactTest {
////	public static void main(String[] args) {
////
////		ApplicationContext cxt = SpringApplication.run(ContactTest.class, args);
////
////		ContactRepository repo = cxt.getBean(ContactRepository.class);
//		repo.add();
////		repo.getAllContact();
////
////	}
////
////}
