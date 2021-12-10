package com.monocept.test;

import java.util.Scanner;

public class UsingSplitTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		String name = null;
		String[] tokens;
		String[] namesPart = {"First Name","Middle Name", "Last name"};
		
		System.out.println("Enter full name");
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();
		tokens = name.split(" ");
		
		if(tokens.length==2) {
			System.out.println(namesPart[0]+" "+tokens[0]);
			System.out.println(namesPart[2]+" "+tokens[1]);
			
		}
		else {
			for(int i=0; i<tokens.length; i++) {
			System.out.println(namesPart[i]+" "+tokens[i]);
			}
			
		}

	}

}
