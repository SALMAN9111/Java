package com.monocept.test;

public class CalesthenicRulesTest {
	public static void main(String[] args) {
		System.out.println(WithoutApplyingRule1());
		System.out.println(ByApplyingRule1());

		System.out.println(WithoutApplyingRule2());
		System.out.println(ByApplyingRule2());
		
		WithoutApplyingRule3();
		ByApplyingRule3();
	}

	

	private static String WithoutApplyingRule1() {
		int age = 15;
		
		System.out.println("Rule one");
		if (age <= 0) {
			return "Invalid input";
		}

		if (age > 0) {
			if (age < 18) {
				return "Not Eligible to vote";
			}
		}

		return "Eligible to vote";
	}

	private static String ByApplyingRule1() {
		int age = 19;

		if (age > 0 && age < 18) {
			return "Not Eligible to vote\n";
		}

		return "Eligible to vote\n";
	}

	private static String WithoutApplyingRule2() {
		int age = 19;
		System.out.println("Rule two ");

		if (age > 0 && age < 18) {
			return "Not Eligible to vote";
		} else {
			return "Eligible to vote";
		}
	}

	private static String ByApplyingRule2() {
		int age = 19;

		if (age > 0 && age < 18) {
			return "Not Eligible to vote";
		}
		return "Eligible to vote\n";
	}
	
	private static void WithoutApplyingRule3() {
		System.out.println("Rule 3");
		int temp = 1;
		int n = 3;
		for(int i = 1; i <= n; i++) {
		  temp *= i;
		  System.out.println(temp == i);
		}
	}
	
	private static void ByApplyingRule3() {
		int temporary = 1;
		int count = 3;
		for(int i = 1; i <= count; i++) {
		  temporary *= i;
		  System.out.println(temporary == i);
		}
	}

}
