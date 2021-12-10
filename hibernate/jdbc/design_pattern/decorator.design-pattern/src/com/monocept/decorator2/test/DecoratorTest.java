package com.monocept.decorator2.test;

import com.monocept.decorator2.Customer;
import com.monocept.decorator2.FaceBookNotifier;
import com.monocept.decorator2.INotifier;
import com.monocept.decorator2.SlackNotifier;
import com.monocept.decorator2.SmsNotifier;
import com.monocept.decorator2.StandardNotifier;
import com.monocept.decorator2.WhatsAppNotifier;

public class DecoratorTest {
	public static void main(String[] args) {
		Customer c = new Customer(101, "Frank", "Frank@gmail.com", "13Frank27", "FrankSlack", 1234567893);
		INotifier notifier = new SlackNotifier(
				new FaceBookNotifier(new SmsNotifier(new WhatsAppNotifier(new StandardNotifier(c)))));
		notifier.sendMessage("Something......");
	}

}
