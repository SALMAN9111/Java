package com.monocept.test;

import java.util.Scanner;

public class NestedIfTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter year to check it is leap year or not");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		
		if(year % 4 ==0) {
			if(year % 100 == 0) {
				if(year % 400 ==0) 
					System.out.println("It is leap year");
				
				else 
					System.out.println("Not a leap year");
			}
			else
				System.out.println("century leap year");
		}
		else
			System.out.println("Not a leap year");
			
		}

}


