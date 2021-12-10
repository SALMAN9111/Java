package com.moncept.test;

import com.monocept.model.Account;

public class AccountToStringTest {
	public static void main(String[] args) {
		Account account = new Account(101,"virat",5000);
		System.out.println(account);
		Account string  = account;
		System.out.println(string);
		System.out.println(account.toString());
		System.out.println(account.getClass().getName()+"@"+Integer.toHexString(account.hashCode()));
		//System.out.println(myToString(account));
	}
	
	public static Object myToString(Object c) {
	        return c.getClass().getName() + "@" + Integer.toHexString(c.hashCode());
	    }

}
/*This is because while printing the object, the toString() method of the object 
 * class is called. It formats the object in the default format. That is,
 */

/*Test - name of the class
@ - joins the string
512ddf17 - hashcode value of the object*/