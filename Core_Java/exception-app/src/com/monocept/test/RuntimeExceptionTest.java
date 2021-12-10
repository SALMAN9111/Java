package com.monocept.test;

public class RuntimeExceptionTest {
	public static void main(String[] args) {
		try {
			m1();
		} catch (RuntimeException e) {
			System.out.println(e.hashCode());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("End of main");
	}

	private static void m1() {
		System.out.println("Inside m1.");
		m2();
	}

	private static void m2() {
		System.out.println("Inside m2.");
		m3();
	}

	private static void m3() {
		System.out.println("Inside m3.");

		RuntimeException ex;
		ex = new RuntimeException("Somthing went wrong in m3!.");
		System.out.println(ex.hashCode());
		throw ex;

	}
}
