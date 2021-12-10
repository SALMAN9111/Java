package com.monocept.decorator2;

public class StandardNotifier implements INotifier {
	@SuppressWarnings("unused")
	private String msgs;
	private Customer customer;

	public StandardNotifier(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void sendMessage(String msgs) {
		this.msgs = msgs;
		System.out.println("Message sent.");
	}

	public Customer getCustomer() {
		return customer;
	}
}
