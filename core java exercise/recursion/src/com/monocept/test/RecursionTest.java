package com.monocept.test;

public class RecursionTest {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n");
		int r = 10;
		System.out.print("Recursion method output: ");
		recursion(r);
	}
	
	public static int recursion(int r) {
		if(r == 0)
			return r;
			
		 
		System.out.print(recursion(r-1)+" ");
		 return r;
	}

}
