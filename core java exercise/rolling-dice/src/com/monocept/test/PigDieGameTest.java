package com.monocept.test;

import java.util.Scanner;

public class PigDieGameTest {
	public static void main(String[] args) {

		displayRulesOfGame();
		String continueGame = "yes";
		while (continueGame.equals("yes")) {
			startTurn();
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println("Do you want to play again then type yes or no to exit!");
			continueGame = scanner.nextLine();
		}
	}

	private static void displayRulesOfGame() {
		System.out.println("Let's Play PIG!\r\n" + "\r\n" + "* See how many turns it takes you to get to 20.\r\n"
				+ "* Turn ends when you hold or roll a 1.\r\n"
				+ "* If you roll a 1, you lose all points for the turn.\r\n"
				+ "* If you hold, you save all points for the turn.\r\n" + "");
	}

	private static void startTurn() {
		int turnsScore;
		int turns = 1;
		String userChoice;
		int totalScore = 0;
		int winPoints = 20;

		while (totalScore < winPoints) {
			System.out.println("TURN " + turns);
			System.out.print("Roll or Hold?(r/h)");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			userChoice = scanner.next();
			turnsScore = 0;
			totalScore = calculatingScore(turnsScore, totalScore, winPoints, userChoice);
			turns++;
			System.out.println();
		}
		System.out.println("you have finished in " + --turns + " turns!\n\n Game over!");

	}

	private static int calculatingScore(int turnsScore, int totalScore, int winPoints, String userChoice) {
		while (userChoice.equals("r")) {
			int die = (int) (Math.random() * 6 + 1);
			if (die == 1) {
				turnsScore = 0;
				System.out.println("Die: " + die);
				System.out.println("Turn over. No score");

				break;
			}

			else if (turnsScore < winPoints) {
				System.out.println("Die: " + die);
				turnsScore = turnsScore + die;
				System.out.print("Roll or Hold?(r/h)");
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
				userChoice = scanner.next();

			}

			if (userChoice.contentEquals("h")) {
				System.out.println("Score for turn: " + (turnsScore));
				totalScore = totalScore + turnsScore;
				System.out.println("Total score : " + (totalScore));

				break;
			}
		}
		return totalScore;

	}
}
