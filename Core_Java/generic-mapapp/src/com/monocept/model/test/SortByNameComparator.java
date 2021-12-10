package com.monocept.model.test;

import java.util.Comparator;

import com.monocept.model.Customer;

public class SortByNameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
