package com.monocept.subscriber.test;

import com.monocept.publisher.Account;
import com.monocept.subscriber.EmailNotifier;
import com.monocept.subscriber.SmsNotifier;

public class SubcriberTest {
	public static void main(String[] args) {
		Account acc1 = new Account(101, "Vidya", 5000);
		acc1.addNotifier(new SmsNotifier());
		acc1.addNotifier(new EmailNotifier());
		acc1.deposite(1000);
	}
}
