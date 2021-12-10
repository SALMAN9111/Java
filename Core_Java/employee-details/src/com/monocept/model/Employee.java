package com.monocept.model;

public abstract class Employee {
	private int id;
	private String name;
	protected double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	
	public abstract double getCTC();
}
