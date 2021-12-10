package com.moncept.test;

public class ConstrutorTest {
	public static void main(String[] args) {
		ConstrutorTest construtor = new ConstrutorTest(10, 20);
		ConstrutorTest construtor1 = new ConstrutorTest(10, 20, 30);
	}

	private int a, b, c;

	public ConstrutorTest(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Inside construtor which takes two integers as parameter");
	}

	private ConstrutorTest(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("Inside construtor which takes three integers as parameter");
	}
}
