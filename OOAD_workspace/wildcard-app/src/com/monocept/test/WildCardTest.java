package com.monocept.test;

import java.util.Arrays;
import java.util.List;

public class WildCardTest {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("hello","world");
//		printDetails(names);
		
		List<Integer> numbers = Arrays.asList(10,20,30);
//		printDetails(numbers);
		
	}
	
	private static void printDetails(List<Object> items) {
		items.forEach(System.out::println);
	}
}
//?