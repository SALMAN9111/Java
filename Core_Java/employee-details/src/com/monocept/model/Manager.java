package com.monocept.model;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Manager extends Employee {
	private double hra = 0;
	private double ta = 0;
	private double salesIncentives = 0;
	private double bonus;
	private double basicSalary;

	private void calcBonus() {
		hra = salary * 0.6;
		ta = salary * 0.2;
		salesIncentives = salary * 0.2;
		bonus = hra + ta + salesIncentives;
	}

	// private String displayIncentivesOfHR() {
	// return (" "+hra+" "+ta+" "+salesIncentives+" ");
	// }

	public Manager(int id, String name, double salary) {
		super(id, name, salary);
	}

	@Override
	public double getCTC() {
		calcBonus();
		// System.out.println(displayIncentivesOfHR());
		basicSalary = salary;
		return salary = salary * 12 + bonus;
	}

	public void writeDetailsTOfile() throws IOException {
		// String details = getId() + displayIncentivesOfHR() +" "+getCTC() + "MANAGER";
		String fname = this.getName();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss.SSS");

		String outTimestamp = sdf.format(new java.util.Date());
		String outFilename = fname + "_" + outTimestamp;

		File f = new File("data//" + outFilename + ".html");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));

		bw.write("<html><body><table><tr><th>ID | </th><th>NAME | </th><th>SALARY | </th><th>HRA | </th><th>TA | </th>"
				+ "<th>SALES INCENTIVES | </th><th>ROLE | </th><th>ANNUAL SALARY | </th></tr>");

		bw.write("<tr><td>" + getId() + "</th><th>" + getName() + "</th><th>" + basicSalary + "</th><th>" + hra
				+ "</th><th>" + ta + "</th><th>" + salesIncentives + "</th><th>MANAGER</th><th>" + salary
				+ "</th></tr></table></body></html>");

		bw.close();

		Desktop.getDesktop().browse(f.toURI());
	}
}
