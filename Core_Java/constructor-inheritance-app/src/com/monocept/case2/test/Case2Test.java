package com.monocept.case2.test;

import com.monocept.case2.Child;

public class Case2Test {
	public static void main(String[] args) {
		Child c1 = new Child();
		System.out.println(c1.getFoo()+"\n");
		
		Child c2 = new Child();
		System.out.println(c2.getFoo()+"\n");
		
		Child c3 = new Child(500);
		System.out.println(c3.getFoo());
		
	}

}
