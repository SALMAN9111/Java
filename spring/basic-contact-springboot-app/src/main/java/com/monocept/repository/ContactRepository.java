package com.monocept.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.monocept.model.Contact;

@Repository
public class ContactRepository {
	private List<Contact> contacts = new ArrayList<Contact>();
	Contact c1 = new Contact(101, "Sayed");
	Contact c2 = new Contact(102, "Aditya");
	Contact c3 = new Contact(103, "Kaustubh");

	public ContactRepository() {
		System.out.println("Repository created");
		contacts.add(c1);
		contacts.add(c2);
		contacts.add(c3);
	}

	public List<Contact> getContacts() {

		return contacts;
	}

	public void add(Contact contact) {
		contacts.add(contact);
	}

}
