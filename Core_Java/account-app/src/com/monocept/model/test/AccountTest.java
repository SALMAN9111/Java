package com.monocept.model.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.monocept.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account(101, "sachin", 5000);
		printInfo(account1);

		serializedToFile(account1);
		Account account2 = (Account) deserializeAccountFromFile();
		printInfo(account2);

	}

	private static Account deserializeAccountFromFile() {
		try {
			@SuppressWarnings("resource")
			ObjectInputStream out = new ObjectInputStream(new FileInputStream("file.txt"));
			Account acc = (Account) out.readObject();
			return acc;
			// System.out.println(acc.getName()+" "+acc.getAccountNumber());
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;

	}

	private static void serializedToFile(Object account) {
		try {
			FileOutputStream file = new FileOutputStream("data//file.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(account);
			out.flush();
			out.close();
			System.out.println("Serialization is successfull");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void printInfo(Account account) {
		System.out.println("Account Number is " + account.getAccountNumber());
		System.out.println("Account holder name is " + account.getName());
		System.out.println("Balance amount is " + account.getBalance() + "\n");
	}
}

/*
 * account1.withDraw(100);
 * 
 * printInfo(account1); account1.deposite(500); printInfo(account1);
 * account1.withDraw(600); printInfo(account1);
 */