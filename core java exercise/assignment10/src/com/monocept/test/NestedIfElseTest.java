package com.monocept.test;

import java.util.Scanner;

public class NestedIfElseTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a team name first letter to display name of the team.");
		String teamFirstLetter = scanner.next();
		
		if (teamFirstLetter.equals("k")) {
			System.out.println("Kolkata Knight Riders");
		} else if (teamFirstLetter.equals("c")) {
			System.out.println("Chennai Super King");
		} else if (teamFirstLetter.equals("b")) {
			System.out.println("Royal Chalenger Bangalore");
		}else {
			System.out.println("There is no such team with that letter.");
		}
	}

}
