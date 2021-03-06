package com.monocept.model.node;

public class Node<T> {
	private T data;
	private Node<T> next;


	public void setData(T data) {
		this.data = data;
	}
	
	public Node<T> getNext() {
		return next;
	}
	
	public void next(Node<T> next) {
		this.next = next;
	}
	
	public T getData() {
		return data;
	}
}
