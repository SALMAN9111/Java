package com.monocept.model;

public class Student1 {
	private int id;
	private String name;
	private double cgps;
	private String location;

	public Student1(int id, String name, double cgpa, String location) {
		this.id = id;
		this.name = name;
		this.cgps = cgpa;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgps() {
		return cgps;
	}

	public String getLocation() {
		return location;
	}

}
