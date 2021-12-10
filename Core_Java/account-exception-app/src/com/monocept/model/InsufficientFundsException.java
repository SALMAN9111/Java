package com.monocept.model;

@SuppressWarnings("serial")
public class InsufficientFundsException extends RuntimeException {
	@SuppressWarnings("unused")
	private Account acc;
	private String detailMessage;

	public InsufficientFundsException(Account acc) {
		this.acc = acc;
		buildMessage(acc);
	}

	private void buildMessage(Account acc) {
		detailMessage = "Account Holder name " + acc.getName() + " Account Number: " + acc.getAccountNumber()
				+ " You must keep your account balance atleast Rs 500.";
	}

	@Override
	public String getMessage() {
		return detailMessage;
	}

}
