package com.monocept.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.monocept.model.Department;
import com.monocept.model.Employee;

public class OneToManyTest {
	public static void main(String[] args) {
		Department dept1 = new Department(101, "sales", "Mumbai");

		Employee e1 = new Employee(1, "Frank", 25000, "SalesPerson");
		Employee e2 = new Employee(2, "John", 20000, "SalesPerson");

		e1.setDept(dept1);
		e2.setDept(dept1);

		Set<Employee> emps = new HashSet<Employee>();
		emps.add(e1);
		emps.add(e2);

		dept1.setEmployees(emps);
		
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		System.out.println(sessionFactory.getClass());

		Session session = sessionFactory.openSession();
		System.out.println(session.getClass());

		Transaction txn = session.beginTransaction();

		try {
			session.save(dept1);

			txn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}

	}

}
