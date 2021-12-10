package com.monocept.model;

public class Foo {

	@MyAnnotation(string = "Need Some attention.")
	public void M1() {
		System.out.println("Refactor M1");
	}


	public void M2() {
		System.out.println("Inside m2");
	}

	public void M3() {
		System.out.println("Inside m3");
	}

	@MyAnnotation(string = "Need Some attention.")
	public void M4() {
		System.out.println("Refactor M4");
	}
}
