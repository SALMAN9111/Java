package com.monocept.model.test;

import java.util.Comparator;

import com.monocept.model.Student;

public class SortByNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student stu1, Student stu2) {
		
		return stu1.getName().compareTo(stu2.getName());
	}

}
