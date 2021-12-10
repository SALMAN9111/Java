package com.monocept.test;

import java.util.*;

public class RollingDiceOneTimeTest {
	public static void main(String[] args) {
		int max = 6;
		int number;
		int dice;
		
		
		System.out.println("Enter number to rotate dice");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		System.out.println("Dice will rotate for "+number+" times");
		System.out.println("Dice1");
		
		for(int i=0; i<number; i++) {
			dice = (int) (Math.random()*max + 1);
			System.out.println(dice);
			
		}
		
	}
}