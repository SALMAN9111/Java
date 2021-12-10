package com.monocept.test;

public class OverloadTest {
	public static void main(String[] args) {
		PrintInfo("Salman");
		PrintInfo(27);
		PrintInfo(19.11f);
	}

	public static void PrintInfo(String name) {
		System.out.println("Inside PrintInfo with string");
		System.out.println(name);
	}
	
	public static void PrintInfo(int num) {
		System.out.println("\nInside PrintInfo with Integer");
		System.out.println(num);
	}
	
	public static void PrintInfo(float number) {
		System.out.println("\nInside PrintInfo with Float");
		System.out.println(number);
	}
		
}