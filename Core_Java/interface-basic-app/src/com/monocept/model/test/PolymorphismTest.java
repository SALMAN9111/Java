package com.monocept.model.test;

import com.monocept.model.CustomerDB;
import com.monocept.model.DepartmentDB;
import com.monocept.model.FooChildDB;
import com.monocept.model.FooDB;
import com.monocept.model.IDataAccessable;
import com.monocept.model.OrderDB;

public class PolymorphismTest {
	public static void main(String[] args) {
		doCrud(new CustomerDB());
		doCrud(new OrderDB());
		doCrud(new DepartmentDB());

		// doCrud(new FooDB());

		FooDB x = new FooChildDB();
		doCrud(x);
	}

	private static void doCrud(IDataAccessable obj) {
		obj.create();
		obj.delete();
		obj.update();
		obj.read();
		System.out.println();
	}

}
