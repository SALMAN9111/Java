package com.monocept.test;

public class FunctionTest {
	public static void main(String[] args) {
		int mark = 100;
		int marks[] = {10,20,30,40,50,};
		
		FunctionTest funtionTest = new FunctionTest();
		funtionTest.updateMarkToZero(mark);
		System.out.println("After updating single mark "+mark);
		
		funtionTest.updateMarksToZero(marks);
		System.out.println("\nAfter updating array of marks");
		for(int m : marks) {
			System.out.println(m);
		}
	}
	
	private void updateMarkToZero(int mark) {
		mark = 0;
	}
	
	private void updateMarksToZero(int marksPassed[]) {
		for(int i=0; i<marksPassed.length; i++) {
			marksPassed[i] = 0;
		}
	}
}
	

