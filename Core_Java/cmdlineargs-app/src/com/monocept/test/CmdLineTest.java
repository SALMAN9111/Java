package com.monocept.test;


public class CmdLineTest {
	public static void main(String[] namesPassed) {
		System.out.println(namesPassed);
		System.out.println(namesPassed.length);
		
		if(namesPassed.length == 0) {
			System.out.println("can you provid some arguments while running program");
			return;
		}
		
		System.out.println("Displaying Values using for each loop");
		for(String name: namesPassed) {
			System.out.println("Hello "+name);
		}
		
		System.out.println("Displaying values using for lopp");
		for(int i=0; i<namesPassed.length; i++) {
			System.out.println("Hello "+namesPassed[i]);
		}
		
	}
}
