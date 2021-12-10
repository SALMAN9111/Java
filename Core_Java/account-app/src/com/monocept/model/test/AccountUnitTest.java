package com.monocept.model.test;

import org.junit.Assert;
import org.junit.Test;

import com.monocept.model.Account;

public class AccountUnitTest {

	@Test
	public void twoparameter_construtor_initializing() {
		// Arrange and act
		Account acc1 = new Account(101, "Virat");
		int exceptedAccNumber = 101;
		String exceptedAccName = "Virat";

		// Assert
		Assert.assertEquals(acc1.getAccountNumber(), exceptedAccNumber);
		Assert.assertEquals(acc1.getName(), exceptedAccName);

	}

	@Test
	public void twoparameter_construtor_initializing_with_defaultBalance_500() {
		// Arrange and act
		Account acc2 = new Account(101, "Virat");
		int exceptedAccBalance = 500;

		// Assert
		Assert.assertTrue(acc2.getBalance() == exceptedAccBalance);

	}

	@Test
	public void threeparameter_constructor_initializing() {
		//Arrange and act
		Account acc2 = new Account(101, "Virat",5000);
		int exceptedAccBalance = 5000;
		int exceptedAccNumber = 101;
		String exceptedName = "Virat";
		
		//Assert
		Assert.assertEquals(acc2.getAccountNumber(),exceptedAccNumber);
		Assert.assertEquals(acc2.getName(), exceptedName);
		Assert.assertTrue(acc2.getBalance() == exceptedAccBalance);
		
	}

}
