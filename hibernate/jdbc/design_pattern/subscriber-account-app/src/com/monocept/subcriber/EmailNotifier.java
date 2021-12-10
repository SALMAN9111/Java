package com.monocept.subcriber;

import publisher.Account;
import publisher.INotifiable;

public class EmailNotifier implements INotifiable {

	@Override
	public void notify(Account acc) {
		System.out.println(acc.getAccountName()+"  your balance is : "+acc.getBalance());
	}

}
