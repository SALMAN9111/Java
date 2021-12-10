package com.monocept.model.test;

import com.monocept.model.Calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.cubeEvenNumber(5));
		
		/*try {
			System.out.println(calc.cubeEvenNumber(5));
		}

		catch (OddNumberNotSupportedException ox) {
			System.out.println(ox.getMessage());
			//ox.printStackTrace();
		}*/
	}
}
