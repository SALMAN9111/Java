package com.monocept.model.node;

public class linkedList<T> {
	private Node<T> current = null;
	private Node<T> start = null;

	public void addItem(T item) {
		Node<T> newNode = new Node<>();
		newNode.setData(item);

		if (start == null) {
			start = newNode;
			current = newNode;
		} else {
			current.next(newNode);
			current = newNode;
		}
	}

	public void removeAtFirst(T item) {

		if (current != null && current.getData() == item) {
			start = current.getNext();
			return;
		}
	}

	public void removeAtIntermediate(T item) {
		@SuppressWarnings("unused")
		Node<T> temp;
		current = start;
		while (current.getNext() != null) {
			if (current.getNext().getData().equals(item)) {
				temp = current.getNext();
				current.next(current.getNext().getNext());
				return;
			}
			current = current.getNext();

		}
	}

	public void removeAtLast(T item) {
		Node<T> last = start;
		Node<T> prev = null;
		
		while (last.getNext() != null) {
			prev = last;
			last = last.getNext();
		}
		prev.next(null);
	}

	public int count() {
		if (start == null) {
			return 0;
		}
		int count = 0;
		Node<T> current = start;
		while (current != null) {
			count++;
			current = current.getNext();
		}
		return count;

	}

	public void display() {

		Node<T> current = start;
		if (start == null) {
			System.out.println("list is empty");
			return;
		}

		System.out.println("List elements are: ");
		for (; current != null; current = current.getNext()) {
			System.out.println(current.getData());
		}
	}

}
