package com.monocept.test;

import java.util.Scanner;

public class ScannerExampleTest {
	public static void main(String[] args) {
		
		String[] namesPart = {"First Name", "Middle Name", "Last name"};

		//displayFullnameUsingSubstring();
		displayFullNameUsingSplit(namesPart);
	}

	private static void displayFullNameUsingSplit(String[] namesPart) {
		String name;
		String[] tokens;
		System.out.println("Enter full name");
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();
		tokens = name.split(" ");

		if (tokens.length == 2) {
			System.out.println(namesPart[0] + " " + tokens[0]);
			System.out.println(namesPart[2] + " " + tokens[1]);

		} else {
			for (int i = 0; i < tokens.length; i++) {
				System.out.println(namesPart[i] + " " + tokens[i]);
			}

		}
	}

	private static void displayFullnameUsingSubstring() {
		String firstName;
		String middleName;
		String lastName;
		String name;
		String[] tokens;
		System.out.println("Enter the full name");
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();

		tokens = name.split(" ");
		int firstSpace = name.indexOf(" ");
		firstName = name.substring(0, firstSpace);

		int secondSpace = name.indexOf(" ", firstSpace + 1);

		if (tokens.length == 1) {
			System.out.println("Firsts name " + tokens[0]);
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
			System.out.println("Middle name " + middleName + "\nLast name" + lastName);
		}
	}

}
