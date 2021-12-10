package com.monocept.model;

public class Person {
	private int id;
	private String address;
	private String dob;
	private String name;

	public Person(int id, String address, String dob, String name) {
		this.id = id;
		this.address = address;
		this.dob = dob;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public String getDod() {
		return dob;
	}
	

	public void Student(Person person) {
		Student(this);
	}
	
	public void Professor(Person perosn) {
		Professor(this);
	}

	@Override
	public String toString() {
		return "Id: "+id + "\ndob: " + dob + "\nname:" + name + "\naddress: " + address;
	}

}
