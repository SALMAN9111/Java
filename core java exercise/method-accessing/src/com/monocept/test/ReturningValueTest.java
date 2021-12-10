package com.monocept.test;

public class ReturningValueTest {

	public static void main(String[] args) {
		ReturningValueTest returnValue = new ReturningValueTest();
		System.out.println("Addition of two number is "+returnValue.getAddition(10, 11));
		System.out.println("Subtraction of two number is "+returnValue.getSubtraction(20, 10));
	}
	
	private int getAddition(int number1, int number2) {
		return number1+number2;
	}
	
	private int getSubtraction(int number1, int number2) {
		return number1-number2;
	}
	

}
