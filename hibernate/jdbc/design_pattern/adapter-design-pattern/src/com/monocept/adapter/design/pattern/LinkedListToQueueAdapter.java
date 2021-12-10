package com.monocept.adapter.design.pattern;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListToQueueAdapter<T> implements IQueue<T> {
	private LinkedList<T> list;

	public LinkedListToQueueAdapter(LinkedList<T> list) {
		this.list = list;
	}

	@Override
	public T dequeue() {
		return list.removeFirst();
	}

	@Override
	public int count() {
		return list.size();
	}

	@Override
	public void enqueue(T item) {
		list.addLast(item);

	}

	@Override
	public Iterator<T> iterator() {
		ListIterator<T> it = list.listIterator();
		return it;
		//return list.iterator(); //can be use
	}

}
