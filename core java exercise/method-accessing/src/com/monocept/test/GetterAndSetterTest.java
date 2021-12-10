package com.monocept.test;

public class GetterAndSetterTest {
	public static void main(String[] args) {

		GetterAndSetterTest gs = new GetterAndSetterTest();
		gs.setName("Salman");
		System.out.println(gs.getName());
	}

	private String name;

	public String getName() {
		return ("Name is "+name);
	}

	private void setName(String name) {
		this.name = name;
		
	}

}
