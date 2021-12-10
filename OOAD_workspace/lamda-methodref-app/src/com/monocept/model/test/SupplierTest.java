package com.monocept.model.test;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		Supplier<LocalDateTime> supplier = new Supplier<LocalDateTime>() {

			@Override
			public LocalDateTime get() {
				return LocalDateTime.now();
			}
		};
		
		System.out.println("Supplier Example");
		
		System.out.println("Using Anonymous class : "+supplier.get());
		
		Supplier<LocalDateTime> supplier1 = () -> LocalDateTime.now();
		System.out.println("Using Lamda : "+supplier1.get());
		
		Supplier<LocalDateTime> supplier3 = SupplierTest :: getLocalTime;
		System.out.println("Using Method ref : "+supplier3.get());
		
	}
	
	static LocalDateTime getLocalTime() {
		return LocalDateTime.now();
		
	}
}
