package com.monocept.model.test;

import com.monocept.model.BranchType;
import com.monocept.model.Professor;
import com.monocept.model.Student;

public class EngineeringCollegeTest {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Hyderabad", "12/3/2004", BranchType.ECE);
		Student s2 = new Student(102, "Bangalore", "5/6/2007", BranchType.CSE);

		Professor p1 = new Professor(201, "Chennai", "25/5/1920", 10000);
		Professor p2 = new Professor(202, "Panji", "20/8/1977", 9500);

		printStudentDetails(s1);
		printStudentDetails(s2);
		printProfDetails(p1);
		printProfDetails(p2);
	}

	private static void printStudentDetails(Student s) {
		System.out.println("Student Id : " + s.getId());
		System.out.println("Address : " + s.getAddress());
		System.out.println("DOB : " + s.getDob());
		System.out.println("Branch : " + s.getBranch() + "\n");

	}

	private static void printProfDetails(Professor p) {
		System.out.println("Professor Id : " + p.getId());
		System.out.println("Address : " + p.getAddress());
		System.out.println("DOB : " + p.getDob());
		System.out.println("Basic Salary : " + p.getbasicSalary());
		System.out.println("Annual Salary : " + p.salary() + "\n");

	}

}
