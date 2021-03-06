package com.monocept.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.regex.Pattern;

public class ArrayStreamTest {
	public static void main(String[] args) throws IOException {
//		caseStudy1();
//		caseStudy2();
		caseStudy3();
	}
	
	private static void caseStudy1() {
		String[] names = new String[] {"Frank","John","Mitneck"};
		Arrays.stream(names).filter(n->n.contains("a"))
							.sorted()
							.forEach(System.out::println);
		
		Arrays.stream(names).filter(n->n.contains("a"))
		.sorted()
		.forEach(n->System.out.println(n.toUpperCase()));
	}
	
	private static boolean isNumber(String s) {
		return Pattern.matches("\\d+", s);
		
	}
	
	private static void caseStudy2() {
		String[] marksArray = {"46","89","56","23","srt"};
		int total = Arrays.stream(marksArray)
							.filter(ArrayStreamTest::isNumber)
							.mapToInt(x->Integer.parseInt(x))
							.sum();
		System.out.println(total);
	}
	
	private static void caseStudy3() throws IOException {
		Files.lines(Paths.get("data\\names.txt"))
			.filter(n-> Pattern.matches("[a-z,A-Z ]+", n))
			.distinct()
			.sorted()
			.limit(2)
			.forEach(System.out::println);
	}
}
