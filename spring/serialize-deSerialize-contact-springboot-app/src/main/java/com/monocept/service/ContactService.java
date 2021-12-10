package com.monocept.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.model.Contact;
import com.monocept.serialize.ContactSerialize;

@Service
public class ContactService {
	@Autowired
	private ContactSerialize ser ;
	
	public ContactService() {
		System.out.println("ContactService created");
	}
	
	public List<Contact> getContacts() throws ClassNotFoundException, IOException{
		return ser.getContacts();
		
	}
//	
//	public int getContactsCount() {
////		return repo.getContacts().size();
//	}

	public void addContact(Contact contact) throws IOException {
//		repo.add(contact);
		ser.add(contact);
	}
}
