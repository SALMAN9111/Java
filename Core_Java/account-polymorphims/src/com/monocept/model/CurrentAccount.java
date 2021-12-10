package com.monocept.model;

public class CurrentAccount extends Account {
	private double overDue = 10000;
	private double due = 0;
	

	public CurrentAccount(int accountNo, String name, double balance) {
		super(accountNo, name, balance);
	}

	@Override
	public void withdraw(double amount) {

		if(due > overDue) {
			System.out.println("Your Over due amount limit is reached, you cannot remove futher money!.");
			return;
		}

		if (amount > balance) {
			due = due + (amount - balance);
		}
		this.balance = balance - amount;
		overDueLimitAmountCheck(due, balance);
	}
	
	private void overDueLimitAmountCheck(double due, double balance) {
		if(due > overDue) {
			System.out.println("Your Over due amount limit is reached, you cannot remove futher money!.");
			return;
		}
		
	}

}
