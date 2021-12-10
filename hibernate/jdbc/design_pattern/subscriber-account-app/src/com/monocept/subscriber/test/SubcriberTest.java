package com.monocept.subscriber.test;

import com.monocept.subcriber.EmailNotifier;
import com.monocept.subcriber.SmsNotifier;

import publisher.Account;

public class SubcriberTest {
	public static void main(String[] args) {
		Account acc1 = new Account(101, "Vidya", 5000);
		acc1.add(new SmsNotifier());
		acc1.add(new EmailNotifier());
		acc1.deposit(1000);
	}

}
