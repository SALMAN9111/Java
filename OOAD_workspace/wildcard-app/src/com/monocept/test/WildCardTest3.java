package com.monocept.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest3 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		printDetails(numbers);
		
		
		List<Double> doubleNumbers = new ArrayList<Double>();
		doubleNumbers.add(10.1);
		doubleNumbers.add(20.1);
		doubleNumbers.add(30.1);
		printDetails(doubleNumbers);
		
		List<Number> numberList = new ArrayList<Number>();
		addNumbersToList(numberList,10);
		addNumbersToList(numberList,10.55);
		System.out.println(numberList);
		
		List<Object> objectList = new ArrayList<Object>();
		addNumbersToList(objectList, 20);
		addNumbersToList(objectList, 20.22);
		System.out.println("Super type "+objectList);
		
		
	}
	
	private static void addNumbersToList(List<? super  Number> value, Number number) {
		value.add(number);
		System.out.println(value.get(0));
	}
	
	private static void printDetails(List<? extends Number> items) {
		items.forEach(System.out::println);
		System.out.println(items.get(0));
	}
}
