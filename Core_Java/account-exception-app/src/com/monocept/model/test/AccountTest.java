package com.monocept.model.test;


import com.monocept.model.Account;
import com.monocept.model.InsufficientFundsException;

public class AccountTest {
	public static void main(String[] args) {
		//Account acc1 = new Account(101, "abc", 1000);
		//acc1.withDraw(501);

		Account acc2 = new Account(102, "xyz", 1500);
		try {
			acc2.withDraw(1001);
		} 
		catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
		finally {
			printInfo(acc2);
		}
		

		System.out.println("End of main.");
	}

	public static void printInfo(Account account) {
		System.out.println("Account Number is " + account.getAccountNumber());
		System.out.println("Account holder name is " + account.getName());
		System.out.println("Balance amount is " + account.getBalance() + "\n");
	}

}
