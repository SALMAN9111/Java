package com.monocept.model.test;

import java.util.LinkedList;
import java.util.List;

import com.monocept.model.Student1;


public class StudentTest {

	public static void main(String[] args) {
		List<Student1> studentList = new LinkedList<Student1>();
		Student1 student1 = new Student1(1, "Frank", 6.9, "Bangalore");
		Student1 student2 = new Student1(2, "Aditya", 8.0, "Hyderabad");
		Student1 student3 = new Student1(3, "Nihal", 8.5, "Hyderabad");
		Student1 student4 = new Student1(4, "Vidya", 9.0, "Hyderabad");
		Student1 student5 = new Student1(5, "John Constantine", 10.0, "Bangalore");
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		
		displayLocation(studentList);
	}
	
	private static void displayLocation(List<Student1> students) {
		for(Student1 student : students) {
			if(student.getLocation().matches("Hyderabad"));{
				System.out.println("Student Id: "+student.getId());
				System.out.println("Student Name: "+student.getName());
				System.out.println("Cgpa : "+student.getCgps());
				System.out.println("Location : "+student.getLocation()+"\n");
			}
		}
	}

}
