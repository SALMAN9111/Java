package com.monocept.model.test;

import java.io.IOException;

import com.monocept.model.Accountant;
import com.monocept.model.Developer;
import com.monocept.model.Employee;
import com.monocept.model.Manager;

public class EmployeeTest {
	public static void main(String[] args) throws IOException {
		Manager mg = new Manager(101, "FRANK", 20000);
		printInfo(mg);
		mg.writeDetailsTOfile();

		Developer dp = new Developer(102, "MITNECK", 25000);
		printInfo(dp);
		dp.writeDetailsTOfile();
		
		Accountant ac = new Accountant(103, "VIRAT", 30000);
		ac.writeDetailsTOfile();

	}

	public static void printInfo(Employee employee) {
		System.out.println("Employee id: " + employee.getId());
		System.out.println("Employee name: " + employee.getName());
		System.out.println("Employee salary: " + employee.getCTC() + "\n");
	}

}
