package com.monocept.test;

import java.util.Scanner;

public class RollingDiceTest {
	public static void main(String[] args) {
		int max = 6;
		int number;
		int dice;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of dice you want to rotate");
		number = scanner.nextInt();
		System.out.println("Rolloing all "+number+" dice\n");

		for (int i = 0; i < number; i++) {
			
			System.out.print("Rolling Dice"+(i+1)+" for "+number+" times: ");
			System.out.print("(");
			for (int j = 0; j < number; j++) {
				dice = (int) (Math.random() * max + 1);
				System.out.print(dice);
				if(j!=(number-1)) {
					System.out.print(",");
				}
			}
			System.out.print(")");
			System.out.println();

		}

	}

}
