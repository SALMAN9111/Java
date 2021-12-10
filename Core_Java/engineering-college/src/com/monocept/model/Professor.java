package com.monocept.model;

public class Professor  {
	private double salary;
	private Person person;

	public Professor(int id, String address, String dob, String name, double salary) {
		this.salary = salary;
		this.person = new Person(id, address, dob, name);
	}

	public double getSalary() {
		return salary;

	}

	public Person getPerson() {
		return person;
	}
}
