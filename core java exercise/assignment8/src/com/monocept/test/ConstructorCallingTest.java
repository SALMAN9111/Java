package com.monocept.test;

public class ConstructorCallingTest {
	public static void main(String[] args) {
		ConstructorCallingTest constructorCalling = new ConstructorCallingTest();
	}

	public ConstructorCallingTest() {
		this("Java");
		System.out.println("Default constructor called.");
	}

	public ConstructorCallingTest(String name) {
		System.out.println("Parameterized constructor called.");
	}

}
