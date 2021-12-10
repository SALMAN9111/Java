package com.monocept.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.monocept.model.Contact;
import com.monocept.repository.ContactRepository;

public class ContactService {

	private static ContactService instance = null;
	private static List<Contact> contactList = new ArrayList<Contact>();
	private ContactRepository repo;
	public ContactService() {
		this.repo = new ContactRepository();

		System.out.println("service created");

	}

	public static ContactService getInstance() {
		if (instance == null) {
			instance = new ContactService();
		}
		return instance;

	}

	public List<Contact> getContacts() throws SQLException {
		return repo.getContacts();
	}

	public void addContact(Contact contact) throws SQLException {
		repo.addToContacts(contact);
		return;
	}
	
	public Contact getContactById(String id) throws SQLException {
		return repo.getDataById(id);
	}
	
	public void updateContact(Contact c) throws SQLException {
		repo.modifyContact(c);
		return;
	}

}
