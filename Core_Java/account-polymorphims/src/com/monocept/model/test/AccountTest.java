package com.monocept.model.test;

import com.monocept.model.Account;
import com.monocept.model.CurrentAccount;
import com.monocept.model.SavingAccount;

public class AccountTest {
	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount(101, "abc", 5000);
		printInfo(sa);
		
		sa.withdraw(4500);
		printInfo(sa);
		
		sa.withdraw(100);
		printInfo(sa);
		
		
		
		CurrentAccount ca = new CurrentAccount(102, "xyz", 5000);
		printInfo(ca);
		
		ca.withdraw(14000);
		printInfo(ca);
		
		ca.withdraw(1000);
		printInfo(ca);
		
		ca.withdraw(1000);
		printInfo(ca);
		
		
	}
	
	public static void printInfo(Account account) {
		System.out.println("Account number is "+account.getAccount());
		System.out.println("Account holder name: "+account.getName());
		System.out.println("Account balance is : "+account.getBalance()+"\n");
	}
}
