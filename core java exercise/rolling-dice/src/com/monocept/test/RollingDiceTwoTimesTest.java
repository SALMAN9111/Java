package com.monocept.test;

import java.util.Scanner;

public class RollingDiceTwoTimesTest {
	public static void main(String[] args) {
		int max = 6;
		int number;
		int dice1;
		int dice2;
		
		
		System.out.println("Enter number to rotate two dice");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		System.out.println("Two dices will rotate for "+number+" times");
		System.out.println("Dice1    Dice2");
		
		for(int i=0; i<max; i++) {
			dice1 = (int) (Math.random()*max + 1);
			dice2 = (int) (Math.random()*max + 1);
			System.out.println(dice1+" "+"        "+dice2);
			
		}
		
	}

}
