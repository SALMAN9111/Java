package com.monocept.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {

	@Id
	private int adressId;
	private String address;

	@ManyToOne
	@JoinColumn
	private Student stud;

	public Address() {

	}

	public Address(int adressId, String address) {
		this.adressId = adressId;
		this.address = address;
	}

	public int getAdressId() {
		return adressId;
	}

	public void setAdressId(int adressId) {
		this.adressId = adressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}


}
