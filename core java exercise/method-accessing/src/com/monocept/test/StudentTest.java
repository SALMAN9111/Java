package com.monocept.test;

import java.util.Scanner;

public class StudentTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter number of Student you want enter");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		StudentTest student[] = new StudentTest[n];

		System.out.println("Enter student details like id, name and std");
		for (int i = 0; i < n; i++) {
			StudentTest newStudent = new StudentTest(scanner.nextInt(), scanner.next(), scanner.nextInt());
			student[i] = newStudent;
		}

		for (int i = 0; i < n; i++) {
			student[i].PrintStudentDetails();
		}
	}

	public int id;
	public String name;
	public int std;

	private StudentTest(int id, String name, int std) {
		this.id = id;
		this.name = name;
		this.std = std;
	}

	public void PrintStudentDetails() {
		System.out.println("Name of the Student is " + name);
		System.out.println("Id is " + id);
		System.out.println("Studying in " + std + " Standard");
	}
}
