package com.monocept.model.test;

import java.util.function.BiPredicate;

public class BiPredicatedTest {
	public static void main(String[] args) {
		BiPredicate<String, String> biPredicate = new BiPredicate<String, String>() {
			
			@Override
			public boolean test(String str1, String str2) {
				if(str1.equals(str2)) {
					return true;
				}
				return false;
			}
		};
		System.out.println("BiPredicate example");
		
		System.out.println("Using Anonymous class :"+biPredicate.test("Java", "Java"));
		
		BiPredicate<String, String> biPredicate2 = (str1,str2) -> str1.equals(str2);
		System.out.println("Using Lamda "+biPredicate2.test("Java", "java"));
		
		BiPredicate<String, String> biPredicate3 = BiPredicatedTest :: compareStrings;
		System.out.println("Using Method ref : "+biPredicate3.test("Java", "Java"));
	}
	
	static boolean compareStrings(String str1 , String str2) {
		if(str1.equals(str2)) {
			return true;
		}
		return false;
	}

}
