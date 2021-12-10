package com.monocept.srp.violation.test;

import com.monocept.srp.violation.Invoice;

public class SrpViolationTest {
	public static void main(String[] args) {
		Invoice invoice1 = new Invoice(1, "Food invoice", 0.05, 0.4, 1000);
		invoice1.print();
	}

}
