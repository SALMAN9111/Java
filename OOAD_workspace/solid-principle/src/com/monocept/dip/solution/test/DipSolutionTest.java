package com.monocept.dip.solution.test;

import com.monocept.dip.solution.EmailLogger;
import com.monocept.dip.solution.TaxCalculator;
import com.monocept.dip.solution.TxtLogger;

public class DipSolutionTest {
	public static void main(String[] args) {
		TaxCalculator calcTax = new TaxCalculator(new EmailLogger());
		System.out.println(calcTax.calculate(10, 0));
		System.out.println();
		
		TaxCalculator calcTax1 = new TaxCalculator(new TxtLogger());
		System.out.println(calcTax1.calculate(10, 0));
		System.out.println();
		
		TaxCalculator calcTax2 = new TaxCalculator(new EmailLogger());
		System.out.println(calcTax2.calculate(10, 2));
	}

}
