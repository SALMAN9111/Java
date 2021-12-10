package com.monocept.dip.violation.test;

import com.monocept.dip.violation.LogType;
import com.monocept.dip.violation.TaxCalculator;

public class DipViolationTest {
	public static void main(String[] args) {
		TaxCalculator tax = new TaxCalculator(LogType.EMAIL);
		System.out.println(tax.calculate(10, 2));
		System.out.println();
		
		TaxCalculator calcTax = new TaxCalculator(LogType.EMAIL);
		System.out.println(calcTax.calculate(10, 0));
		System.out.println();
		
		TaxCalculator calcTax1 = new TaxCalculator(LogType.TXT);
		System.out.println(calcTax1.calculate(10, 0));
		
		
	}

}
