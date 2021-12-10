package com.monocept.model.test;

import java.util.function.BiConsumer;

public class BiConsumerTest {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biConsumer = new BiConsumer<Integer, Integer>() {

			@Override
			public void accept(Integer a, Integer b) {
				System.out.println("Using Anonymous class : " + (a + b));
			}
		};

		System.out.println("BiConsumer Example");
		biConsumer.accept(10, 20);

		BiConsumer<Integer, Integer> biConsumer2 = (a, b) -> System.out.println("Using Lamda " + a * b);
		biConsumer2.accept(10, 20);

		BiConsumer<Integer, Integer> biConsumer3 = BiConsumerTest::getModulus;
		biConsumer3.accept(10, 20);

		BiConsumer<Integer, Integer> biConsumer4 = new BiConsumerTest()::getSubstraction;
		biConsumer4.accept(10, 20);

	}

	static void getModulus(int a, int b) {
		System.out.println("Using Method ref : " + (a % b));
	}

	public void getSubstraction(int a, int b) {
		System.out.println("Using Method ref : " + (a - b));
	}

}
