package com.monocept.facade.pattern.test;

import com.monocept.facade.pattern.BankAccountFacade;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
		accessingBank.withdrawCash(50.00);
		accessingBank.withdrawCash(990.00);
	}

}