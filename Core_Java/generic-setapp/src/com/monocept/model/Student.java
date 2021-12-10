package com.monocept.model;

public class Student implements Comparable<Student> {
	
	private int id;
	private String name;
	private double cgpa;

	public Student(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cgpa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(cgpa) != Double.doubleToLongBits(other.cgpa))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", cgpa=" + cgpa;
	}

	@Override
	public int compareTo(Student o) {
		if(this.id< o.id)
			return -1;
		if(this.id>o.id)
			return 1;
		
		return 0;
	}
	
	
}
