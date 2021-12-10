package com.monocept.test;

class SubClass extends SuperClass {
	// SubClass declaring a child exception
	// of RuntimeException
	void method() throws ArithmeticException {
		// ArithmeticException is a child exception
		// of the RuntimeException
		// So the compiler won't give an error
		System.out.println("SubClass");
	}
}
