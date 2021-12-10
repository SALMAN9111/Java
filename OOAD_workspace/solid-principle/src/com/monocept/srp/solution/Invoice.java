package com.monocept.srp.solution;

public class Invoice {
		private int id;
		private String description;
		private double tax;
		private double discount;
		private double amount;
		
		public Invoice(int id, String description, double tax, double discount, double amount) {
			this.id = id;
			this.description = description;
			this.tax = tax;
			this.discount = discount;
			this.amount = amount;
			
		}
		
		public double calcTaxAmount(double tax) {
			return  amount * tax;
		}
		
		public double calcDiscountAmount(double discount) {
			return  amount * discount;
		}
		
		public int getId() {
			return id;
		}
		public String getDescription() {
			return description;
		}
		public double getTax() {
			tax = calcTaxAmount(tax);
			return tax;
		}
		public double getDiscount() {
			discount = calcDiscountAmount(discount);
			return discount;
		}
		public double getAmount() {
			return amount;
		}
		
		public double calcTotalAmount() {
			return amount + tax - discount;
		}

}
