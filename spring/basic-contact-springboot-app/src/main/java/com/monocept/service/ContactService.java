package com.monocept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.model.Contact;
import com.monocept.repository.ContactRepository;

@Service("contactSvc")
public class ContactService {
	@Autowired
	private ContactRepository repo;

	public ContactService() {
		System.out.println("ContactService created");
	}

	public List<Contact> getContacts() {
		return repo.getContacts();

	}

	public int getContactsCount() {
		return repo.getContacts().size();
	}

	public void addContact(Contact contact) {
		repo.add(contact);

	}
}
