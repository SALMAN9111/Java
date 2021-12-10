package com.monocept.test;


public class WhileLoopTest {
	public static void main(String[] agrs) {
		int n = 987654, reverse = 0;  
		while(n != 0)   
		{  
		int remainder = n % 10;  
		reverse = reverse * 10 + remainder;  
		n = n/10;  
		}  
		System.out.println("The reverse of the given n is: " + reverse);  
	}

}
