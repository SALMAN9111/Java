package com.monocept.decorator2;

public class WhatsAppNotifier implements INotifier {

	@SuppressWarnings("unused")
	private String msgs;
	@SuppressWarnings("unused")
	private INotifier notify;
	
	public WhatsAppNotifier(INotifier notify) {
		this.notify =notify;
	}

	@Override
	public void sendMessage(String msgs) {
		this.msgs = msgs;
		System.out.println("Message sent.");
	}
}
