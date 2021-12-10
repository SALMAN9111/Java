package com.moncept.Service;

import java.util.ArrayList;
import java.util.List;

import com.monocept.model.Contact;

public class ContactService {
	private static ContactService instance = null;
	private static List<Contact> contactList = new ArrayList<Contact>();

	public ContactService() {
		
		Contact contact1 = new Contact("101", "Nihal", "Kamble", "nihal@kamble.com");
		Contact contact2 = new Contact("102", "Aditya", "Rugle", "aditya@rugle.com");
		Contact contact3 = new Contact("103", "Sayed", "Salman", "sayed@salman.com");
		Contact contact4 = new Contact("104", "Kaustubh", "Jirapure", "kaustubh@jirapure.com");
		Contact contact5 = new Contact("105", "Vidya", "Hinakule", "vidya@hinakule.com");

		contactList.add(contact1);
		contactList.add(contact2);
		contactList.add(contact3);
		contactList.add(contact4);
		contactList.add(contact5);

		System.out.println("service created");

	}

	public static ContactService getInstance() {
		if (instance == null) {
			instance = new ContactService();
		}
		return instance;

	}

	public List<Contact> getContacts() {
		return contactList;
	}

	public void addContact(Contact c) {
		contactList.add(c);
	}

	public Contact getById(int id) {
	  for(int i=0; i<contactList.size(); i++) {
			  
	  }
	return null;
  }
}