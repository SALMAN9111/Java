package com.monocept.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private int sid;
	private String sname;

	@OneToMany(mappedBy = "stud", cascade = CascadeType.ALL)
	private Set<Address> addresses;

	public Student() {
		addresses = new HashSet<Address>();
	}

	public Student(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}