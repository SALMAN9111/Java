package com.monocept.model.test;

import com.monocept.model.GenderType;
import com.monocept.model.Player;

public class PlayerTest {
	public static void main(String[] args) {
		Player player1 = new Player(101, "Virat Kholi");
		printInfo(player1);

		Player player2 = new Player(102, "Sachin", GenderType.MALE, 25);
		printInfo(player2);
		
		Player elder = player1.elderPlayer(player2);
		System.out.println("Printing details of elder player");
		printInfo(elder);
	}

	public static void printInfo(Player player) {
		System.out.println("Player id is " + player.getId());
		System.out.println("Player name is " + player.getName());
		System.out.println("Player gender is " + player.getGender());
		System.out.println("Hascode is "+player.hashCode());
		System.out.println("Player age is " + player.getAge() + "\n");
	}
}
