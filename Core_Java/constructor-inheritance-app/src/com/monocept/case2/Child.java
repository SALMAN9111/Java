package com.monocept.case2;

public class Child extends Parent{
	public Child() {
		super(100);
		System.out.println("Child created");
	}
	
	public Child(int value) {
		super(value);
		System.out.println("Child Created");
		
	}

}
