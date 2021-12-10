package com.monocept.model.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

import com.monocept.model.Student;

public class HashSetTest {
	public static void main(String[] args) {
		//caseStudy1();
		caseStudy2();
	}
	
	private static void caseStudy1() {
		Set<String> numbers;
		//numbers = new HashSet<Integer>();
		//numbers = new LinkedHashSet<Integer>();
		numbers = new TreeSet<String>();
		
		
		numbers.add("aaaaaaaaaa");
		numbers.add("aaaaaaaaa");
		numbers.add("zaaaaaaa");
		numbers.add("c");
		numbers.add("abb");
		numbers.add("z");
		System.out.println("Using TreeSet\n"+"count :"+numbers.size());
		
		
		for(String number : numbers) {
			System.out.println(number);
		}
	}
	
	private static void caseStudy2() {
		Student s1 = new Student(101,"nihal",8.0);
		Student s2 = new Student(101,"aditya",7.1);
		Student s3 = new Student(103,"vidya",7.9);
		
		Set<Student> students;
		//students = new HashSet<Student>();
		students = new TreeSet<Student>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		
		System.out.println(students.size());
		System.out.println("Sorted using roll no.");
		display(students);
	//System.out.println();
		//System.out.println("sorted using names.");
		//displayByNames(students);
		//System.out.println("Sorted using CGPA.");
		//displayByCgpa(students);
	}
	
	private static void display(Set<Student> student) {
		for(Student stu : student) {
			System.out.println(stu);
		}
	}
	
	private static void displayByNames(Set<Student> stu){
		for(Student st : stu) {
			System.out.println(st);
		}
	}
	
	private static void displayByCgpa(Set<Student> stu) {
		for(Student st : stu) {
			System.out.println(st);
		}
	}
}
