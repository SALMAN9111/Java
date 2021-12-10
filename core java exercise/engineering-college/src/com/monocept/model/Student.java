package com.monocept.model;

public class Student extends Person {
	private BranchType branch;

	public Student(int id, String address, String dob, BranchType branch) {
		super(id, address, dob);
		this.branch = branch;
	}

	public BranchType getBranch() {
		return branch;
	}

}
