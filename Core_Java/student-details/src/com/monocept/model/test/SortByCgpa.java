package com.monocept.model.test;

import java.util.Comparator;

import com.monocept.model.Student;

public class SortByCgpa implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return Double.compare(o1.getCgps(), o2.getCgps());
	}

}
