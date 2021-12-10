package com.monocept.test;

public class ValidateAgeTest {
	public static void main(String[] agrs) throws InvalidAgeException {
		validate(13);
	}
	
	public static void validate(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Age not valid to vote");
		}
		else {
			System.out.println("Eligible to vote");
		}
	}

}
