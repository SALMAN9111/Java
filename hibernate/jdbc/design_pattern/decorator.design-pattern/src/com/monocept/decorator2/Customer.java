package com.monocept.decorator2;

public class Customer {
	private int id;
	private String name;
	private String gmail;
	private String facebook;
	private String slackAcc;
	private double mobileNumber;

	public Customer(int id, String name, String gmail, String facebook, String slackAcc, double mobileNumber) {
		this.id = id;
		this.name =name;
		this.gmail = gmail;
		this.facebook =facebook;
		this.slackAcc = slackAcc;
		this.mobileNumber = mobileNumber;
				
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getGmail() {
		return gmail;
	}

	public String getFacebook() {
		return facebook;
	}

	public String getSlackAcc() {
		return slackAcc;
	}

	public double getMobileNumber() {
		return mobileNumber;
	}

}
