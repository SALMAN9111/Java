package com.monocept.model;

public class Student {
	private String branch;
	private Person person;

	public Student(int id, String address, String dob, String name, String branch) {
		this.branch = branch;
		this.person = new Person(id, address, dob, name);
	}

	public String getBranch() {
		return branch;
	}
	
	public Person getPerson() {
		return person;
	}

}
