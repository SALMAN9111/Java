package com.monocept.model;

import java.io.Serializable;

public class Contact implements Serializable{
	public Contact() {
		super();
	}

	private int id;
	private String name;

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

	public Contact(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
