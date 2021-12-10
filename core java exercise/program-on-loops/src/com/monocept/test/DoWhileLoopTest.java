package com.monocept.test;

public class DoWhileLoopTest {
	public static void main(String[] args) {
		int number = 1191, reverse = 0;  
		do 
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}while(number != 0); 
		System.out.println("The reverse of the given number is: " + reverse);  
	}

}
