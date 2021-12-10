package com.monocept.model.test;

import com.monocept.model.IOperation;

public class Test {
	public static void main(String[] args) {
		IOperation op1 = new IOperation() {

			@Override
			public double doMathOperation(int a, int b) {
				return a + b;
			}
		};

		System.out.println("Using anonymous class : " + op1.doMathOperation(10, 20));

		IOperation op2 = (a, b) -> a * b;
		System.out.println("Using lamda : "+op2.doMathOperation(10, 20));
		
		IOperation op3 = Test :: getModulus;
		System.out.println("Using Method ref : "+op3.doMathOperation(10, 20));
		
		IOperation op4 = new Test() :: getSubstraction;
		System.out.println("Using Method ref : "+op4.doMathOperation(10, 20));
			
	}
	
	static double getModulus(int a, int b) {
		return a%b;
	}
	
	public double getSubstraction(int a, int b) {
		return a-b;
	}
}
