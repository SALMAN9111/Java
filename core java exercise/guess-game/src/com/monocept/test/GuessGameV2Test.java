package com.monocept.test;

import java.util.Scanner;

public class GuessGameV2Test {
	private static boolean numberGuessedCorrectly;

	public static void main(String[] args) {
		startGame();
	}

	private static void startGame() {
		GuessGameV2Test guessGame = new GuessGameV2Test();
		String continueGame = "yes";
		int maxChance = 2;
		int userTries = 0;
		int gameGeneratorNumber;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (continueGame.equals("yes")) {
			gameGeneratorNumber = (int) (Math.random() * 100 + 1);
			System.out.println(gameGeneratorNumber);
			numberGuessedCorrectly = false;

			for (int i = 0; i < maxChance; i++) {
				if (!numberGuessedCorrectly) {
					System.out.println("Enter number to guess Generator number");
					int userGeneratorNumber = scanner.nextInt();
					guessGame.numberGuessGame(userGeneratorNumber, gameGeneratorNumber, userTries);
					userTries = 1;
				}
			}

			System.out.println("Game over. Do you want to play game again then type YES, if not type NO");
			continueGame = scanner.next();
		}
	}

	private void numberGuessGame(int userGeneratorNumber, int gameGeneratorNumber, int userTries) {

		if (gameGeneratorNumber > userGeneratorNumber) {
			System.out.println("Sorry too low");
			return;
		}

		if (gameGeneratorNumber < userGeneratorNumber) {
			System.out.println("Sorry too high");
			return;
		}

		if (gameGeneratorNumber == userGeneratorNumber) {
			System.out.println("You guessed Correct number. By trying " + ++userTries + " times");
			numberGuessedCorrectly = true;
			return;
		}
	}

}
