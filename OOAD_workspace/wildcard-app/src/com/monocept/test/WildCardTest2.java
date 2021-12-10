package com.monocept.test;

import java.util.Arrays;
import java.util.List;


public class WildCardTest2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("hello","world");
		printDetails(names);
		
		List<Integer> numbers = Arrays.asList(10,20,30,40);
		printDetails(numbers);
		
		List<?> someReadOnlyType = names;
		System.out.println(someReadOnlyType);
		
		someReadOnlyType = numbers;
		System.out.println(someReadOnlyType);
	}
	
	private static void printDetails(List<?> items) {
//		items.add(50);
		items.forEach(System.out::println);
		System.out.println(items.get(0));
	}
}
