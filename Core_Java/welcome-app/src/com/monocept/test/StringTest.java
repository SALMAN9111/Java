package com.monocept.test;

public class StringTest {
	public static void main(String[] args) {
		String companyName = "Monocept";
		System.out.println(companyName.toUpperCase());
		System.out.println("Didnt change original String "+companyName+"\n");
		
		String location = "Hyderabad";
		System.out.println(location.hashCode()+"\n");
		
		String locationUpper  = location.toUpperCase();
		System.out.println(locationUpper);
		System.out.println(locationUpper.hashCode()+"\n");
		
		String name = "Salman";
		System.out.println(name.hashCode());
		name+= " burkaposh";
		name+= " works at monocept";
		System.out.println(name);
		System.out.println(name.hashCode());
	}

}
