package com.moncept.test;

import java.util.Arrays;
import java.util.Iterator;

import com.monocept.model.Account;

public class AccountArrayTest {
	public static void main(String[] args) {
		Account[] account = new Account[5];
		
		Account acc1 = new Account(101, "abc", 1000);
		acc1.deposite(500);
		account[0] = acc1;
		
		Account acc2 = new Account(102, "xyz", 1000);
		acc2.deposite(100);
		account[1] = acc2;
		
		Account acc3 = new Account(103, "cba", 10000);
		acc3.deposite(500);
		account[2] = acc3;
		
		Account acc4 = new Account(104, "zyx", 500);
		acc4.deposite(500);
		account[3] = acc4;
		
		Account acc5 = new Account(105, "pqr", 1500);
		acc5.deposite(500);
		account[4] = acc5;
		
		//printInfoUsingWhileLoop(account);
		printInfoUsingIterator(account);
	}
	
	private static void printInfoUsingWhileLoop(Account[] account) {
		int i = 0;
		while(i<account.length) {
			System.out.println("Account Number: "+account[i].getAccountNumber());
			System.out.println("Account Holder Name: "+account[i].getName());
			System.out.println("Balance: "+account[i].getBalance()+"\n");
			i++;
		}
	}
	
	private static void printInfoUsingIterator(Account[] account) {
		Iterator<Account> it = Arrays.asList(account).iterator();
		//it.forEachRemaining(System.out::println);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
