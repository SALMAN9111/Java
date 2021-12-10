package com.monocept.model;

public class Customer implements Comparable<Customer> {
	private int amount;
	private String name;
	private int id = 0;
	private int orderId;

	public Customer(int id, String name, int amount, int orderId) {
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.orderId = orderId;
	}

	public int getId() {
		return id;
	}

	public int getAmount() {
		return amount;
	}

	public String getName() {
		return name;
	}

	public int getOrderId() {
		return orderId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + orderId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (amount != other.amount)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (orderId != other.orderId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "amount=" + amount + ", name=" + name + ", id=" + id + ", orderId=" + orderId;
	}

	@Override
	public int compareTo(Customer o) {
		if (this.id < o.id)
			return -1;
		if (this.id > o.id)
			return 1;
		return 0;
	}

}
