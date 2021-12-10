package com.monocept.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DisplayEmployeeByDesignaionTest {
	public static void main(String[] args) throws NumberFormatException, IOException {

		String line;
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader("data//employeedata.txt"));

		int numberOfEmployee = 0;
		System.out.println("Details of employee by their degisnation: \n");
		while ((line = br.readLine()) != null) {
			if(line.contains("ANALYST")) {
				numberOfEmployee++;
				System.out.println(line);
			}

		}
		System.out.println("\nNumber of employee's are: " + numberOfEmployee);
	}

}
