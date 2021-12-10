package com.monocept.model;

public class AddressDto {

	private int addressId;
	private String address;

	private Student stud ;
	
	public AddressDto(int addressId, String address) {
		super();
		this.addressId = addressId;
		this.address = address;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}
	
}
