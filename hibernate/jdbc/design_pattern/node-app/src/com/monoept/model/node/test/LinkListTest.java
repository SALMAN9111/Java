package com.monoept.model.node.test;

import com.monocept.model.node.linkedList;

public class LinkListTest {
	public static void main(String[] args) {
		
		linkedList<Integer> list = new linkedList<>();
		list.addItem(10);
		list.addItem(30);
		list.addItem(20);
		System.out.println(list.count());
		
		list.addItem(23);
		list.addItem(56);
		list.removeAtIntermediate(23);
		list.removeAtLast(56);
		System.out.println(list.count());
		
		
		
		list.display();
	}
}
