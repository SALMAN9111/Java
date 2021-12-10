package com.monocept.model.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import com.monocept.model.Customer;

public class CustomerTest {
	public static void main(String[] args) {
		// caseStudy1();
		// caseStudy2();
		// caseStudy3();
		// caseStudy4();
		// caseStudy5();
		caseStudy6();
	}

	private static void caseStudy1() {
		Map<Integer, String> dictionary;
		dictionary = new TreeMap<Integer, String>();

		dictionary.put(1, "one");
		dictionary.put(2, "two");
		dictionary.put(3, "three");
		dictionary.put(3, "three");
		dictionary.put(4, "four");
		System.out.println(dictionary.size());
		// display(dictionary);
	}

	private static void caseStudy2() {
		Map<Customer, Customer> dictionary;
		dictionary = new HashMap<Customer, Customer>();

		Customer c1 = new Customer(1, "abc", 5000, 101);
		Customer c2 = new Customer(1, "ab", 7000, 101);
		Customer c3 = new Customer(2, "ac", 9000, 102);

		dictionary.put(c1, c1);
		dictionary.put(c2, c2);
		dictionary.put(c3, c3);
		System.out.println(dictionary.size());

		display(dictionary);
	}

	private static void caseStudy3() {
		Map<Customer, Customer> dictionary;
		dictionary = new LinkedHashMap<Customer, Customer>();

		Customer c1 = new Customer(1, "abc", 5000, 101);
		Customer c2 = new Customer(1, "ab", 7000, 101);
		Customer c3 = new Customer(2, "ac", 9000, 102);

		dictionary.put(c1, c1);
		System.out.println(c1.hashCode());
		dictionary.put(c2, c2);
		System.out.println(c2.hashCode());
		dictionary.put(c3, c3);
		System.out.println(c3.hashCode());
		System.out.println(dictionary.size());

		display(dictionary);
	}

	private static void caseStudy4() {
		Map<Customer, Customer> dictionary;
		dictionary = new TreeMap<Customer, Customer>();

		Customer c1 = new Customer(1, "abc", 5000, 101);
		Customer c2 = new Customer(1, "ab", 7000, 101);
		Customer c3 = new Customer(2, "ac", 9000, 102);

		dictionary.put(c1, c1);
		System.out.println(c1.hashCode());
		dictionary.put(c2, c2);
		System.out.println(c2.hashCode());
		dictionary.put(c3, c3);
		System.out.println(c3.hashCode());
		System.out.println(dictionary.size());

		display(dictionary);
	}

	private static void caseStudy5() {
		Map<Customer, Customer> dictionary;
		dictionary = new TreeMap<Customer, Customer>(new SortByNameComparator());

		Customer c1 = new Customer(1, "abc", 5000, 101);
		Customer c2 = new Customer(1, "abc", 7000, 101);
		Customer c3 = new Customer(2, "ac", 9000, 102);

		dictionary.put(c1, c1);
		System.out.println(c1.hashCode());
		dictionary.put(c2, c2);
		System.out.println(c2.hashCode());
		dictionary.put(c3, c3);
		System.out.println(c3.hashCode());
		System.out.println(dictionary.size());

		display(dictionary);
	}

	private static void caseStudy6() {
		Map<Customer, Customer> dictionary;
		dictionary = new TreeMap<Customer, Customer>(new SortByOrderAmountComparator());

		Customer c1 = new Customer(1, "abc", 5000, 101);
		Customer c2 = new Customer(2, "abc", 7000, 102);
		Customer c3 = new Customer(3, "ac", 5000, 103);

		dictionary.put(c1, c1);
		System.out.println(c1.hashCode());
		dictionary.put(c2, c2);
		System.out.println(c2.hashCode());
		dictionary.put(c3, c3);
		System.out.println(c3.hashCode());
		System.out.println(dictionary.size());

		display(dictionary);
	}

	private static void display(Map<Customer, Customer> dict) {
		for (Map.Entry<Customer, Customer> d : dict.entrySet()) {
			System.out.println(d.getKey());

		}
	}

}
