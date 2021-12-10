package com.monocept.adapter.design.pattern.test;

import java.util.LinkedList;

import com.monocept.adapter.design.pattern.IQueue;
import com.monocept.adapter.design.pattern.LinkedListToQueueAdapter;

public class AdapterTest {
	public static void main(String[] args) {
		/*IQueue<Integer> q = new LinkedListToQueueAdapter<Integer>(new LinkedList<Integer>());
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);*/
		
		IQueue<String> q1 = new LinkedListToQueueAdapter<String>(new LinkedList<String>());
		q1.enqueue("Frank");
		q1.enqueue("John");
		q1.enqueue("Black");
		
		System.out.println("Deleted item : "+q1.dequeue());
		System.out.println("Size of Queue : "+q1.count());
		
		System.out.println("Element of Queue are: ");
		for(String item : q1) {
			System.out.println(item);
		}
		
	}
}
