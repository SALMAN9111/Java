package com.monocept.model;

public class Account implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	final int accountNo;
	final String name;
	double balance = 0;
	

	public Account(int accountNo, String name) {
		this(accountNo, name, 500);
	}

	public Account(int accountNo, String name, double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public void deposite(double amount) {
		this.balance = balance + amount;
	}

	public void withDraw(double amount) {
		if (balance <= 500) {
			System.out.println("You have reached minimum account balance that is Rs 500.");
			return;
		}
		this.balance = balance - amount;
		minBalance(this.balance, amount);
	}

	private void minBalance(double balance, double amount) {
		if (this.balance < 500) {
			System.out.println("You must keep your balance atleast Rs 500");
			this.balance = balance + amount;
			return;
		}
	}

	public double getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNo;
	}

	public String getName() {
		return name;
	}


}
