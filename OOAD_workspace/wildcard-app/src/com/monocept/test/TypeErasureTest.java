package com.monocept.test;

import java.util.ArrayList;
import java.util.List;

public class TypeErasureTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Steve");
		names.add("Smith");
		
		@SuppressWarnings("rawtypes")
		List numbers = names;
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		System.out.println(names);
		System.out.println(numbers);
	}

}
