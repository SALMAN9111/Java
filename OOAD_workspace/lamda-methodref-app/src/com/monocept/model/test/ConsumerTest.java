package com.monocept.model.test;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String string) {
				System.out.println("Using Anonymous Name is " + string);
			}
		};

		System.out.println("Consumer Example ");
		consumer.accept("Frank");

		Consumer<String> consumer1 = (name) -> System.out.println("Using Lamda Name is " + name);
		consumer1.accept("Frank");
		
		Consumer<String> consumer2 = ConsumerTest :: displayName;
		consumer2.accept("Frank");
		
		Consumer<String> consumer3 = new ConsumerTest() :: displayFulName;
		consumer3.accept(" Victor Frankenstein");
	}

	static void displayName(String name) {
		System.out.println("Using Method ref Name is " + name);
	}

	public void displayFulName(String name) {
		System.out.println("Using Method ref Name is " + name);
	}

}
