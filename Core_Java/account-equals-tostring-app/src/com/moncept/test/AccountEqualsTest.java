package com.moncept.test;

import com.monocept.model.Account;

public class AccountEqualsTest {
	public static void main(String[] args) {
		Account acc1 = new Account(101,"Sachin",5000);
		Account acc2 = new Account(101,"Sachin",5000);
		
		System.out.println(acc1==acc1);
		System.out.println(acc1.equals(acc1));
		System.out.println();
		
		System.out.println(acc1==acc2);
		System.out.println(acc1.equals(acc2));
		System.out.println();
		
		Account acc3 = acc1;
		System.out.println(acc3==acc1);
		System.out.println(acc3.equals(acc1));
		
	}
}
