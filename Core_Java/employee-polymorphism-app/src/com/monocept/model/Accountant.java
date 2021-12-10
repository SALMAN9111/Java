package com.monocept.model;

public class Accountant extends Employee {
	private double perks;

	public Accountant(int id, String name, double salary) {
		super(id, name, salary);
	}

	private String displayIncentivesOfAccountant() {
		perks = this.salary * 0.3;
		return ("Accountant Incentives details\n" + "Perks: " + perks);

	}

	@Override
	public double getCTC() {
		System.out.println(displayIncentivesOfAccountant());
		return salary = salary * 12 + perks;
	}
}
