package com.monocept.model;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Developer extends Employee {
	private double perfAllowance;
	private double annualIncentives;
	private double bonus;
	private double basicSalary;

	public Developer(int id, String name, double salary) {
		super(id, name, salary);
	}

	private void calcBonus() {
		perfAllowance = this.salary * 0.5;
		annualIncentives = this.salary * 0.5;
		bonus = perfAllowance + annualIncentives;
	}

	// private String displayIncentivesOfDeveloper() {
	// return (("Developer's Incentives details\n") + ("Perfermance Allowance: " +
	// perfAllowance + "\n")
	// + ("Annual Incentives: " + annualIncentives));
	// }

	@Override
	public double getCTC() {
		calcBonus();
		// System.out.println(displayIncentivesOfDeveloper());
		basicSalary = salary;
		return salary = salary * 12 + bonus;
	}

	public void writeDetailsTOfile() throws IOException {
		// String details = getId() + displayIncentivesOfHR() +" "+getCTC() + "MANAGER";
		String fname = this.getName();
		String outFilename = fname + getId();

		// SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss.SSS");
		// String outTimestamp = sdf.format(new java.util.Date());

		File f = new File("data//" + outFilename + ".html");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));

		bw.write("<html><body><table><tr><th>ID | </th><th>NAME | </th><th>SALARY | </th><th>PERFORMANCE ALLOWANCE | "
				+ "</th><th>ANNUAL INCENTIVES | </th>" + "</th><th>ROLE | </th><th>ANNUAL SALARY | </th></tr>");

		bw.write("<tr><td>" + getId() + "</th><th>" + getName() + "</th><th>" + basicSalary + "</th><th>"
				+ perfAllowance + "</th><th>" + annualIncentives + "</th><th>MANAGER</th><th>" + salary
				+ "</th></tr></table></body></html>");

		bw.close();

		Desktop.getDesktop().browse(f.toURI());
	}
}