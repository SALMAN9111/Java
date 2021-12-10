package com.monocept.model;

public class SavingAccount extends Account {
	
	public SavingAccount(int accountNo, String name ,double balance) {
		super(accountNo,name,balance);
	}

	@Override
	public void withdraw(double amount) {
		if(balance <= 500) {
			System.out.println("You have reached minimum account balance that is Rs 500.\n");
			return;
		}
		this.balance = balance - amount;
		minBalance(this.balance,amount);
	}
	
	private void minBalance(double balance, double amount) {
		if(this.balance < 500 ) {
			System.out.println("You must keep your balance atleast Rs 500 in your account as balance.");
			this.balance = balance + amount;
			return;
		}
	}

}
