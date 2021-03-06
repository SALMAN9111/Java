package com.monocept.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	private int dno;
	private String dname;
	private String location;

	@OneToMany(mappedBy = "dept", cascade = CascadeType.ALL)
	private  Set<Employee> employees;

	public Department() {
		employees = new HashSet<Employee>();
	}
	
	public Department(int dno, String dname, String location) {
		this();
		this.dno = dno;
		this.dname = dname;
		this.location = location;
		
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
}
