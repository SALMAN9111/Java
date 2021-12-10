package com.monocept.test;

import java.util.Arrays;
import java.util.List;

public class ForEachTest {
	public static void main(String[] args) {
		List<String> argsList = Arrays.asList(args);
		argsList.forEach(x -> System.out.println(x));

		System.out.println();
		List<String> argsList1 = Arrays.asList(args);
		argsList1.stream()
			.mapToInt(x -> Integer.parseInt(x))
			.filter(x -> x >= 20)
			.forEach(System.out::println);
	}
}
