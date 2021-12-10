package com.monocept.model.test;

import java.util.Comparator;

import com.monocept.model.Customer;

public class SortByOrderAmountComparator implements Comparator< Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		return Integer.compare(o1.getAmount(), o2.getAmount());
	}

}
