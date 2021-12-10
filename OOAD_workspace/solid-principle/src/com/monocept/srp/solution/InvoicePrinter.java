package com.monocept.srp.solution;

import com.monocept.srp.violation.Invoice;

public class InvoicePrinter {
	
	
	public void printDetails(Invoice invoice1) {
		System.out.println("Id: "+invoice1.getId());
		System.out.println("Description: "+invoice1.getDescription());
		System.out.println("Tax amount: "+invoice1.getTax());
		System.out.println("Discount: "+invoice1.getDiscount());
		System.out.println("Total amount: "+invoice1.calcTotalAmount());
	}

}
