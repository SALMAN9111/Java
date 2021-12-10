package com.monocept.model;


public class Manager extends Employee {
	private double hra = 0;
	private double ta = 0;
	private double salesIncentives = 0;
	private double bonus;

	private void calcBonus() {
		hra = salary * 0.6;
		ta = salary * 0.2;
		salesIncentives = salary * 0.2;
		bonus = hra + ta + salesIncentives;
	}

	public String displayIncentivesOfHR() {
		return ("HR's Incentives details\n") + ("HRA: " + hra + "\n") + ("TA: " + ta + "\n")
				+ ("SalesIncentives: " + salesIncentives);
	}

	public Manager(int id, String name, double salary) {
		super(id, name, salary);
	}

	@Override
	public double getCTC() {
		calcBonus();
		System.out.println(displayIncentivesOfHR());
		return salary = salary * 12 + bonus;
	}

}
