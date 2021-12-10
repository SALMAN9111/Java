package com.monocept.test;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.monocept.model.Contact;
import com.monocept.service.ContactService;

@SpringBootApplication(scanBasePackages = { "com.monocept" })
public class ContactTest {

	public static void main(String[] args) {
		boolean runApp = true;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ApplicationContext cxt = SpringApplication.run(ContactTest.class, args);
		ContactService cs = cxt.getBean(ContactService.class);
		while (runApp) {
			System.out.println("1.Add contact \n2.Display contacts \n3.Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter contact ID");
				int id = sc.nextInt();
				System.out.println("Enter contact name");
				String name = sc.next();
				cs.addContact(new Contact(id, name));
				System.out.println("successfully added contact");
				break;

			case 2:
				System.out.println("ID \t NAME");
				cs.getContacts().forEach(c -> System.out.println(c.getId() + "\t" + c.getName()));
				break;
			case 3:
				runApp = false;
				break;

			default:
				System.out.println("invalid choice");
				break;
			}

		}
		System.out.println("Exited");

	}

}
