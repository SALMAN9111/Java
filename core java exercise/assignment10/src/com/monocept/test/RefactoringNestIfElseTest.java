package com.monocept.test;

import java.util.Scanner;

public class RefactoringNestIfElseTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a team name first letter to display name of the team");
		String teamFirstLetter = scanner.next();

		switch (teamFirstLetter) {
		case "K":
			System.out.println("Kolkata Knight Riders");
			break;

		case "c":
			System.out.println("Chennai Super King");
			break;

		case "b":
			System.out.println("Royal Chalenger Bangalore");
			break;

		default:
			System.out.println("There is no such team with that letter.");
		}
	}
}
