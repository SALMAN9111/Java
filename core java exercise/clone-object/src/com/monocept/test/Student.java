package com.monocept.test;

class Student implements Cloneable {
	private String fname;
	private String lname;

	public Object clone() {
		Student student = new Student();
		student.setFname(this.fname);
		student.setLname(this.lname);
		return student;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

}
