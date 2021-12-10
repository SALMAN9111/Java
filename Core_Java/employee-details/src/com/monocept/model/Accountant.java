package com.monocept.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Accountant extends Employee {
	private double perks;
	private double basicSalary;

	public Accountant(int id, String name, double salary) {
		super(id, name, salary);
	}

	private String displayIncentivesOfAccountant() {
		perks = this.salary * 0.3;
		basicSalary = salary;
		return ("Accountant Incentives details\n" + "Perks: " + perks);

	}
	
	@Override
	public double getCTC() {
		System.out.println(displayIncentivesOfAccountant());
		return salary = salary * 12 + perks;
	}
	
	public void writeDetailsTOfile() throws IOException {
		// String details = getId() + displayIncentivesOfHR() +" "+getCTC() + "MANAGER";
		String fname = this.getName();
		String outFilename = fname + getId();

		// SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss.SSS");
		// String outTimestamp = sdf.format(new java.util.Date());

		File f = new File("data//" + outFilename + ".txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));

		bw.write("<html>\n<body>\n<table><tr><th>ID | </th><th>NAME | </th><th>SALARY | </th><th>PERKS | </th><th>ROLE | </th><th>ANNUAL SALARY</th></tr>");
		

		bw.write("<tr><td>\n" + getId() + "</th><th>" + getName() + "</th><th>" + basicSalary + "</th><th>"
				+ perks + "</th><th>ACCOUNTANT</th><th>" + salary
				+ "</th></tr>\n</table>\n</body>\n</html>");

		bw.close();

	}

}
