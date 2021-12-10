package com.monocept.model.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.monocept.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> studentList = new LinkedList<Student>();
		Student student1 = new Student(1, "Frank", 10.0, "Bangalore");
		Student student2 = new Student(2, "Aditya", 8.0, "Hyderabad");
		Student student3 = new Student(3, "Nihal", 8.5, "Hyderabad");
		Student student4 = new Student(4, "Vidya", 9.0, "Hyderabad");
		Student student5 = new Student(5, "John Constantine", 10.0, "Bangalore");

		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		
		// displayByLocation(studentList);
		//displayCgpaMoreThanSeven(studentList);
		//displayNamesWhoLenghtMoreThanSeven(studentList);
		//displayNamesStartWithA(studentList);
		displaySortedCgpa(studentList);
	}

	private static void displayByLocation(List<Student> students) {
		students.stream().filter(s -> s.getLocation() == "Hyderabad")
				.forEach(stu -> System.out.println("Id: " + stu.getId() + "\nName: " + stu.getName() + "\nCgpa: "
						+ stu.getCgps() + "\nLocation: " + stu.getLocation() + "\n"));

	}

	private static void displayCgpaMoreThanSeven(List<Student> students) {
		students.stream().filter(s -> s.getCgps() > 7.0).forEach(stu -> System.out.println("Id: " + stu.getId()
				+ "\nName: " + stu.getName() + "\nCgpa: " + stu.getCgps() + "\nLocation: " + stu.getLocation() + "\n"));

	}
	
	private static void displayNamesWhoLenghtMoreThanSeven(List<Student> students) {
		students.stream().filter(s -> s.getName().length()>7).forEach(stu -> System.out.println("Id: " + stu.getId()
				+ "\nName: " + stu.getName() + "\nCgpa: " + stu.getCgps() + "\nLocation: " + stu.getLocation() + "\n"));

	}
	
	private static void displayNamesStartWithA(List<Student> students) {
		students.stream().filter(s -> s.getName().startsWith("A")).forEach(stu -> System.out.println("Id: " + stu.getId()
				+ "\nName: " + stu.getName() + "\nCgpa: " + stu.getCgps() + "\nLocation: " + stu.getLocation() + "\n"));

	}
	
	private static void displaySortedCgpa(List<Student> students) {
		Collections.sort(students, new SortByCgpa());
		for(Student student : students) {
			System.out.println("Id: "+student.getId());
			System.out.println("Name: "+student.getName());
			System.out.println("Cgpa: "+student.getCgps());
			System.out.println("Location: "+student.getLocation()+"\n");
		}

	}
}
