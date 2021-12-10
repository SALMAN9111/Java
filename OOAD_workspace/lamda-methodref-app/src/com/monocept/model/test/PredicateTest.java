package com.monocept.model.test;

import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		Predicate<Integer> predicate = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				if (t % 2 == 0) {
					return true;
				}
				return false;
			}
		};
		System.out.println("Predicate Example");

		System.out.println("Using anonymous class : " + predicate.test(2));

		Predicate<Integer> pre = (number) -> number > 6;
		System.out.println("Using Lamda : " + pre.test(2));

		Predicate<Integer> pre1 = PredicateTest :: liesBetween;
		System.out.println("Using Method ref : " + pre1.test(5));

		Predicate<Integer> pre2 = new PredicateTest() :: isNumberDivisibleByFive;
		System.out.println("Using Method ref : "+pre2.test(27));

	}

	static boolean liesBetween(Integer number) {
		if (number > 1 && number < 10) {
			return true;
		}
		return false;
	}
	
	public boolean isNumberDivisibleByFive(Integer number) {
		if(number %5 == 0) {
			return true;
		}
		return false;
		
	}
}
