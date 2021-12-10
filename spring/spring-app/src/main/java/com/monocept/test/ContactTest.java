package com.monocept.test;

import java.util.function.Consumer;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.monocept.model.Contact;
import com.monocept.service.ContactService;

public class ContactTest {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");

    ContactService sv1 = cxt.getBean("contactSvc", ContactService.class);
    System.out.println("Contacts Count" + sv1.getContactsCount());
    System.out.println(sv1.hashCode());

    ContactService sv2 = cxt.getBean("contactSvc", ContactService.class);
    System.out.println(sv2.getContactsCount());
    System.out.println(sv2.hashCode());

    
    sv1.getContacts().forEach(c->System.out.println(c.getName()));

  }

}