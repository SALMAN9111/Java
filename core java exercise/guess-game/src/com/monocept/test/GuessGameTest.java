package com.monocept.test;

import java.util.Scanner;

public class GuessGameTest {
	private static boolean exitPoint;

	public static void main(String[] args) {
		String continueGame = "yes";
		int maxChance = 2;
		int gameGeneratorNumber;
		int userTries = 0;

		GuessGameTest gameGuessNumber = new GuessGameTest();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (continueGame.equals("yes")) {
			gameGeneratorNumber = (int) (Math.random() * 100 + 1);
			System.out.println(gameGeneratorNumber);
			exitPoint = false;
			
			for (int i = 0; i < maxChance; i++) {
				if (!exitPoint ) {
					System.out.println("Enter number to guess Generator number");
					int userGeneratorNumber = scanner.nextInt();
					gameGuessNumber.numberGuessGame(userGeneratorNumber,userTries, gameGeneratorNumber);
					userTries = 1;
				}
			}
			
			System.out.println("Game over. Do you want to play game again then type YES, if not type NO");
			continueGame = scanner.next();

		}
	}

	private void numberGuessGame(int userGeneratorNumber,int userTries, 
			int gameGeneratorNumber) {

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
			exitPoint = true;
			return;
		}
	}

}






/*
 * static int userTries = 0; static int gameGeneratorNumber; static int
 * userGeneratorNumber; static int maxChance = 2; static boolean exitPoint =
 * false; static int chancesEqualToMaxChance = 0;
 */
//private static 
/*
 * private void guess() { int userTries = 0; int gameGeneratorNumber; int
 * userGeneratorNumber; int maxChance = 2; boolean exitPoint = false; int
 * chancesEqualToMaxChance = 0;
 * 
 * System.out.println("Enter number to guess Generator number"); Scanner scannum
 * = new Scanner(System.in); int userGeneratorNumber = scannum.nextInt(); if
 * (gameGeneratorNumber != userGeneratorNumber && maxChance ==
 * chancesEqualToMaxChance) { System.out.println("You lose."); userTries = 0;
 * return; } if (gameGeneratorNumber > userGeneratorNumber) {
 * System.out.println("Sorry too low"); userTries++; //
 * System.out.println(count); return; } if (gameGeneratorNumber <
 * userGeneratorNumber) { System.out.println("Sorry too high"); userTries++; //
 * System.out.println(count); return; } if (gameGeneratorNumber ==
 * userGeneratorNumber) {
 * System.out.println("You guessed Correct number. By trying " + ++userTries +
 * " times"); exitPoint = true; userTries = 0; return; }
 * 
 * }
 * 
 * }
 */