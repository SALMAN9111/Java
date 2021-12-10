package com.monocept.test;

import java.util.Scanner;

public class DieGameTest {
	public static void main(String[] args) {
		int winPoints = 20;
		int playerPoints = 0;
		int playerGeneratorNumber = 0;
		String roll = "r";
		int totalScore = 0;

		System.out.println("Let's Play PIG!\r\n" + "\r\n" + "* See how many turns it takes you to get to 20.\r\n"
				+ "* Turn ends when you hold or roll a 1.\r\n"
				+ "* If you roll a 1, you lose all points for the turn.\r\n"
				+ "* If you hold, you save all points for the turn.\r\n" + "");
		String continueGame = "yes";
		while (continueGame.equals("yes")) {
			totalScore = 0;
			int  turns = 1;
			
			while (totalScore < winPoints) {
				System.out.println("TURN " + turns);
				System.out.print("Roll or Hold?(r/h)");
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
				roll = scanner.next();
				playerPoints = 0;
				while (roll.equals("r")) {
					playerGeneratorNumber = (int) (Math.random() * 6 + 1);

					if (playerGeneratorNumber == 1) {
						playerPoints = 0;
						System.out.println("Die: " + playerGeneratorNumber);
						System.out.println("Turn over. No score");

						break;
					}

					if (playerPoints < winPoints) {
						System.out.println("Die: " + playerGeneratorNumber);
						playerPoints = playerPoints + playerGeneratorNumber;
						System.out.print("Roll or Hold?(r/h)");
						roll = scanner.next();
					}

					if (roll.contentEquals("h")) {
						System.out.println("Score for turn: " + playerPoints);
						totalScore = totalScore + playerPoints;
						System.out.println("Total score : " + totalScore);

						break;
					}
				}
				turns++;
				System.out.println();

			}
			System.out.println("you have finished in " + --turns + " turns!\n\n Game over!");
			System.out.println("Do you wanna pkay again!");
			Scanner scanner = new Scanner(System.in);
			continueGame = scanner.nextLine();
			
		}
		
	}
}











/*
 * package com.monocept.test;
 * 
 * import java.util.Scanner;
 * 
 * public class PigDieGameTest { public static void main(String[] args) { int
 * winPoints = 20; int playerPoints = 0,n = 1; //int playerGeneratorNumber = 0;
 * String roll = "r"; int totalScore = 0;
 * 
 * DisplayRulesOfGame(); PigDieGame(playerPoints, n, totalScore, winPoints);
 * 
 * System.out.println("you have finished in 4 turns!\n\n\n Game over!"); }
 * 
 * private static void DisplayRulesOfGame() {
 * System.out.println("Let's Play PIG!\r\n" + "\r\n" +
 * "* See how many turns it takes you to get to 20.\r\n" +
 * "* Turn ends when you hold or roll a 1.\r\n" +
 * "* If you roll a 1, you lose all points for the turn.\r\n" +
 * "* If you hold, you save all points for the turn.\r\n" + ""); }
 * 
 * private static void PigDieGame(int playerPoints, int n, int totalScore, int
 * winPoints) { int playerGeneratorNumber; String roll; while (n < 5) {
 * System.out.println("TURN " + n); System.out.println("Roll or Hold?(r/h)");
 * Scanner scanner = new Scanner(System.in); roll = scanner.next(); playerPoints
 * = 0; while (roll.equals("r")) { playerGeneratorNumber = (int) (Math.random()
 * * 6 + 1);
 * 
 * if (playerGeneratorNumber == 1) { playerPoints = 0;
 * System.out.println("Die: " + playerGeneratorNumber); //
 * System.out.println(playerPoints); System.out.println("Turn over. No score");
 * 
 * break; }
 * 
 * if (playerPoints < winPoints) { System.out.println("Die: " +
 * playerGeneratorNumber); playerPoints = playerPoints + playerGeneratorNumber;
 * System.out.println("Roll or Hold?(r/h)"); roll = scanner.next();
 * 
 * }
 * 
 * if (roll.contentEquals("h")) { System.out.println("Score for turn: " +
 * (playerPoints)); totalScore = totalScore + playerPoints;
 * System.out.println("Total score : " + (totalScore));
 * 
 * break; } } n++; System.out.println(); } }
 * 
 * }
 */