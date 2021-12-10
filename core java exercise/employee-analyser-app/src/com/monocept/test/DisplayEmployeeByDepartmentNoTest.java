package com.monocept.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DisplayEmployeeByDepartmentNoTest {
	public static void main(String[] args) throws IOException {

		String line;
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader("data//employeedata.txt"));

		int numberOfEmployee = 0;
		System.out.println("Details of employee who's department number is 30: \n");
		while ((line = br.readLine()) != null) {
			String[] words = line.split(",");
			if (Integer.parseInt(words[7]) == 30) {
				numberOfEmployee++;
				System.out.println(line);
			}

		}
		System.out.println("\nNumber of employee's in department number 30 are: " + numberOfEmployee);
	}
}


//Path path = Paths.get("data//employeedata.txt");
// Charset charset = Charset.forName("UTF-8");
//Scanner scanner = new Scanner(path, charset.name());
//scanner.hasNextLine()) {
//line = scanner.nextLine();
//scanner.close();