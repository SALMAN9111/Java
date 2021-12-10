package com.monocept.test;

import java.util.Scanner;

public class RollingDiceTest1 {
	public static void main(String[] args) {
		int max = 6;
		int number, n;
		int dice;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of dice you want to rotate");
		number = scanner.nextInt();

		for (int i = 0; i < number; i++) {
			System.out.println("\nEnter number to rotate Dice" + (i + 1));
			n = scanner.nextInt();
			System.out.print("Rolling Dice" + (i + 1) + " for " + n + " times: ");
			System.out.print("(");
			for (int j = 0; j < n; j++) {
				dice = (int) (Math.random() * max + 1);
				System.out.print(dice);
				if (j != (n - 1)) {
					System.out.print(",");
				}
			}
			System.out.print(")");
			System.out.println();

		}

	}

}
