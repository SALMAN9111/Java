package com.monocept.srp.solution.test;

import com.monocept.srp.solution.InvoicePrinter;
import com.monocept.srp.violation.Invoice;

public class SrpSolutionTest {
	public static void main(String[] args) {
		Invoice invoice1 = new Invoice(1, "Food invoice", 0.05, 0.4, 1000);
		Invoice invoice2 = new Invoice(2, "Food", 0.05, 0.1, 100);
		InvoicePrinter display = new InvoicePrinter();
		display.printDetails(invoice1);
		display.printDetails(invoice2);
		
	}

}
