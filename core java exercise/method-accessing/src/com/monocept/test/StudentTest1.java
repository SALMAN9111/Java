package com.monocept.test;

public class StudentTest1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		StudentTest1 student[] = new StudentTest1[7];
		System.out.println("This program display 7 student details.");
		StudentTest1 newStudent = new StudentTest1();

		newStudent.setId(1);
		newStudent.setName("Aditya");
		newStudent.setStandard(10);
		student[0] = newStudent;
		System.out.println("Student 1 Details: ");
		System.out.println(student[0].getId());
		System.out.println(student[0].getName());
		System.out.println(student[0].getStandard());

		newStudent.setId(2);
		newStudent.setName("Afreen");
		newStudent.setStandard(10);
		student[1] = newStudent;
		System.out.println(student[1].getId());
		System.out.println(student[1].getName());
		System.out.println(student[1].getStandard());

		newStudent.setId(3);
		newStudent.setName("Amruta");
		newStudent.setStandard(10);
		student[2] = newStudent;
		System.out.println(student[2].getId());
		System.out.println(student[2].getName());
		System.out.println(student[2].getStandard());

		newStudent.setId(4);
		newStudent.setName("Bhargavi");
		newStudent.setStandard(10);
		student[3] = newStudent;
		System.out.println(student[3].getId());
		System.out.println(student[3].getName());
		System.out.println(student[3].getStandard());

		newStudent.setId(5);
		newStudent.setName("Nihal");
		newStudent.setStandard(10);
		student[4] = newStudent;
		System.out.println(student[4].getId());
		System.out.println(student[4].getName());
		System.out.println(student[4].getStandard());

		newStudent.setId(6);
		newStudent.setName("Salman");
		newStudent.setStandard(10);
		student[5] = newStudent;
		System.out.println(student[5].getId());
		System.out.println(student[5].getName());
		System.out.println(student[5].getStandard());

		newStudent.setId(7);
		newStudent.setName("Vidya");
		newStudent.setStandard(10);
		student[6] = newStudent;
		System.out.println(student[6].getId());
		System.out.println(student[6].getName());
		System.out.println(student[6].getStandard());

	}

	public int id;
	public String name;
	public int std;

	private void setId(int id) {
		this.id = id;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setStandard(int std) {
		this.std = std;
	}

	private int getId() {
		return id;
	}

	private String getName() {
		return name;
	}

	private int getStandard() {
		return std;
	}

	public void PrintStuDetails() {
		System.out.println("Name of the Student is " + name);
		System.out.println("Id is " + id);
		System.out.println("Studying in " + std + " Standard");
	}

}
