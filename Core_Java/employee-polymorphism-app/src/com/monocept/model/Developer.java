package com.monocept.model;

public class Developer extends Employee {
	private double perfAllowance;
	private double annualIncentives;
	private double bonus; 

	public Developer(int id, String name, double salary) {
		super(id, name, salary);
	}

	private void calcBonus() {
		perfAllowance = this.salary * 0.5;
		annualIncentives = this.salary * 0.5;
		bonus = perfAllowance + annualIncentives;
	}

	private String displayIncentivesOfDeveloper() {
		return (("Developer's Incentives details\n") + ("Perfermance Allowance: " + perfAllowance + "\n")
				+ ("Annual Incentives: " + annualIncentives));
	}

	@Override
	public double getCTC() {
		calcBonus();
		System.out.println(displayIncentivesOfDeveloper());
		return this.salary = salary * 12 + bonus;
	}
}