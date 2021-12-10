package com.monocept.model.test;

import java.io.FileWriter;
import java.io.IOException;

import com.monocept.model.Accountant;
import com.monocept.model.Developer;
import com.monocept.model.Employee;
import com.monocept.model.Manager;

public class EmployeeTest {
	public static void main(String[] args) throws IOException {
		Manager mg = new Manager(1, "abc", 20000);
		printInfo(mg);

		Developer dp = new Developer(2, "xyz", 15000);
		printInfo(dp);
		
		Accountant at = new Accountant(3, "pqr", 10000);
		printInfo(at);
		
		

	}

	public static void printInfo(Employee employee) {
		System.out.println("Employee id: " + employee.getId());
		System.out.println("Employee name: " + employee.getName());
		System.out.println("Employee salary: " + employee.getCTC() + "\n");
	}

}
