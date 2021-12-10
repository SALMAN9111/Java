package com.monocept.test;

import java.util.Scanner;

public class RefactoringNestedIfTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter year to check it is leap year or not");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();

		if (year % 4 == 0 || year % 400 == 0 ) {
			System.out.println("It is leap year");
			return;
		}
		System.out.println("Not a leap year");
	}
}
