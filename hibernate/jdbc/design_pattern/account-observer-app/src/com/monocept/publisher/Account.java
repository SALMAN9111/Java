package com.monocept.publisher;

import java.util.ArrayList;
import java.util.List;


public class Account {
	private int accNumber;
	private String name;
	private double balance;
	private List<INotifier> notifiers = new ArrayList<>();
	
	public Account(int accNumber, String name, double balance) {
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposite(double amount) {
		this.balance = balance + amount;
		for(int i=0; i<notifiers.size(); i++) {
			notifiers.get(i).notify(this);
		}
	}
	
	public void withDraw(double amount) {
		if(balance - amount < 500) {
			throw new RuntimeException("You must keep account balance atleast Rs 500");
		}
		this.balance = balance - amount;
		for(int i=0; i<notifiers.size(); i++) {
			notifiers.get(i).notify(this);
		}
		
	}
	
	public void addNotifier(INotifier notifier) {
		notifiers.add(notifier);
	}

	public String getName() {
		return name;
	}

	public int getAccNumber() {
		return accNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
}
