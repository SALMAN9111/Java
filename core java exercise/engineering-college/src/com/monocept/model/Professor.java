package com.monocept.model;

public class Professor extends Person implements ISalary {
	private double basicSalary;

	public Professor(int id, String address, String dob, double basicSalary) {
		super(id, address, dob);
		this.basicSalary = basicSalary;
	}

	public double getbasicSalary() {
		return basicSalary;
	}

	@Override
	public double salary() {
		final double incentives = this.basicSalary * 0.2;
		final double bonus = this.basicSalary * 0.35;
		double salary = this.basicSalary + incentives + bonus;
		return salary;
	}

}
