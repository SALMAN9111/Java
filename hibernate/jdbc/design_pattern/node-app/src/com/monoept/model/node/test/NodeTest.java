package com.monoept.model.node.test;

import com.monocept.model.node.Node;

public class NodeTest {
	public static void main(String[] args) {
		Node<Integer> n1 = new Node<>();
		n1.setData(10);
		
		Node<Integer> n2 = new Node<>();
		n2.setData(20);
		
		Node<Integer> n3 = new Node<>();
		n3.setData(30);
		
		n1.next(n2);
		n2.next(n3);
		System.out.println("Without using Recursion");
		printInfo(n1);
		System.out.println("\nUsing Recursion");
		printInfoUsingRecursion(n1);
	}
	
	private static void printInfoUsingRecursion(Node<Integer> node) {
		if(node == null)
			return;
		System.out.println(node.getData());
		printInfoUsingRecursion(node.getNext());
	}
	
	private static void printInfo(Node<Integer> node) {
		for( ; node!= null; node = node.getNext()) {
			System.out.println(node.getData());
		}
	}

}
