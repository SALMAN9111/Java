package com.monocept.test;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		student.setFname("virat");
		student.setLname("kholi");
		System.out.println(student.hashCode()+"\n");
		
		Student student1 = (Student) student.clone();
		System.out.println(student1.getFname() + " " + student1.getLname());
		System.out.println(student1.hashCode()+"\n");
		
		Student student2 = (Student) student.clone();
		System.out.println(student2.getFname() + " " + student2.getLname());
		System.out.println(student2.hashCode()+"\n");
		
		Student student3 = (Student) student.clone();
		System.out.println(student3.getFname() + " " + student3.getLname());
		System.out.println(student3.hashCode()+"\n");
		
		Student student4 = (Student) student.clone();
		System.out.println(student4.getFname() + " " + student4.getLname());
		System.out.println(student4.hashCode()+"\n");
	}
}
