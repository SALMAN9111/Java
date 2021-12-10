package com.monocept.repository;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.monocept.model.Department;
import com.monocept.model.Employee;


@Repository
public class DepartmentRepository {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void add() {
		Department d1 = new Department(10, "sales", "mumbai");
		
		Employee e1 = new Employee(1, "nihal");
		e1.setDept(d1);
		Employee e2 = new Employee(2, "Kaustubh");
		e2.setDept(d1);
		
		Set<Employee> emps = new HashSet<>();
		emps.add(e1);
		emps.add(e2);
		
		d1.setEmployees(emps);
		
		entityManager.persist(d1);
		
	}

}
