package com.monocept.test;

public class ExceptionTest {
	// Java Program to Illustrate Exception Handling
	// with Method Overriding
	// Where SuperClass declares an exception and
	// SubClass declares a child exception
	// of the SuperClass declared Exception

	// Importing required classes
	public static void main(String args[]) {
		SuperClass s = new SubClass();
		s.method();
	}
}