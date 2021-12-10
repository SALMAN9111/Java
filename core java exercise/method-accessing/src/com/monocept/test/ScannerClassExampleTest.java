package com.monocept.test;

import java.util.Scanner;

public class ScannerClassExampleTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String firstName;
		String middleName;
		String lastName = null;
		String name;
		String[] tokens;

		System.out.println("Enter the full name");
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();
		
		tokens = name.split(" ");
		int firstSpace = name.indexOf(" ");
		firstName = name.substring(0, firstSpace);

		int secondSpace = name.indexOf(" ", firstSpace + 1);
		
		
		if(tokens.length==1) {
			System.out.println("Firsts name "+tokens[0]);
			return;
		}
		

		System.out.println("First name " + firstName);

		if (secondSpace < 0) {
			lastName = name.substring(firstSpace);
			System.out.println("Last name " + lastName);
		}

		if (secondSpace > 0) {
			middleName = name.substring(firstSpace, secondSpace);
			lastName = name.substring(secondSpace);
			System.out.println("Middle name" + middleName + "\nLast name" + lastName);
		}
	}
}
