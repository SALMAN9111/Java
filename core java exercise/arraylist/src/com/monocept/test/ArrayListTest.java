package com.monocept.test;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> integer = new ArrayList<Integer>();
		integer.add(10);
		integer.add(20);
		integer.add(30);
		integer.add(1, 25);
		

		for (Integer number : integer) {
			System.out.println(number);
		}

		integer.set(0, 40);
		integer.remove(1);
		System.out.println();
		
		for (Integer number : integer) {
			System.out.println(number);
		}

	}

}
