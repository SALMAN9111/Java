package com.monocept.model.test;

import com.monocept.model.Professor;
import com.monocept.model.Student;

public class EngineeringCollegeTest {
	public static void main(String[] args) {
		Student student = new Student(1, "somewhere", "1/1/1", "Frank", "CSE");
		Professor professor = new Professor(1, "someplace", "1/1/1", "smith", 25000);
		
		printStudentInfo(student);
		printProfessorInfo(professor);
	}

	private static void printStudentInfo(Student person) {
		System.out.println("Student Details");
		System.out.println(person.getPerson());
		System.out.println("Branch: "+person.getBranch()+"\n");
	}
	
	private static void printProfessorInfo(Professor person) {
		System.out.println("Professor Details");
		System.out.println(person.getPerson());
		System.out.println("Salary: "+person.getSalary());
		
	}


}
