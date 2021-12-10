/**
 * 
 */
package com.monocept.subscriber;

import com.monocept.publisher.Account;
import com.monocept.publisher.INotifier;

public class SmsNotifier implements INotifier {

	@Override
	public void notify(Account acc) {
		System.out.println(acc.getName()+"  your balance is : "+acc.getBalance());

	}

}
