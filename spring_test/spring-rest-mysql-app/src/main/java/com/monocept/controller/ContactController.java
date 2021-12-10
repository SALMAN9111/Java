package com.monocept.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.model.Contact;
import com.monocept.repository.ContactRepository;

@RestController("/api/v1")
@CrossOrigin
public class ContactController {
	
	@Autowired
	private ContactRepository cr;
	
	@GetMapping("getContact")
	public ResponseEntity<Contact> getContact(){
		List<Contact> contactList = new ArrayList<>();
		
		
		return null;
		
	}
}
