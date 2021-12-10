package com.monocept.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {
	@Id
	private int id;
	private String name;

	public Contact() {
		
	}
	
	public Contact(int id, String name) {
		this.id = id;
		this.name = name;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
