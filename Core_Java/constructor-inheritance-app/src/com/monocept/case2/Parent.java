package com.monocept.case2;

public class Parent {
	private int foo;
	
	public Parent(int foo) {
		this.foo = foo;
		System.out.println("Parent created");
	}
	
	public int getFoo() {
		return foo;
	}

}
