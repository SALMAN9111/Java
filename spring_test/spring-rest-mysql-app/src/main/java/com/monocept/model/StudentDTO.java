package com.monocept.model;

import java.util.Set;

public class StudentDTO {
	private int id;
	private String name;
	private Set<Address> addresses;
	private Address address;

	public StudentDTO() {
		address = new Address();
	}
	
	public StudentDTO(Set<Address> set) {
		this.setAddresses(set);
	}

	public StudentDTO(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public StudentDTO(Object forEach) {
		
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

}
