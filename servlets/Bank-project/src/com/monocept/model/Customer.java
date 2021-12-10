package com.monocept.model;

public class Customer {

	private String Name;
	private Double Balance;
	private int Password;
	private String date;
	private String Type;

	public Customer(String name, Double balance, int password) {
		super();
		Name = name;
		Balance = balance;
		Password = password;
	}

	public Customer(String name, Double balance, String type, String date) {
		super();
		Name = name;
		Balance = balance;
		Type = type;
		this.date = date;
	}

	public Customer(String dbName) {
		this.Name = dbName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getBalance() {
		return Balance;
	}

	public void setBalance(Double balance) {
		Balance = balance;
	}

	public int getPassword() {
		return Password;
	}

	public void setPassword(int password) {
		Password = password;
	}

	@Override
	public String toString() {

		return this.Name + " " + this.Balance + " " + this.getPassword();

	}
}