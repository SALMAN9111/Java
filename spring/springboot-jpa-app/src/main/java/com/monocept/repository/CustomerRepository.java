package com.monocept.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.monocept.model.Customer;

@Repository
public class CustomerRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void add() {
		Customer customer1 = new Customer(102, "Aditya");
		entityManager.persist(customer1);
	}

	@Transactional
	public void update() {
		Customer cus = entityManager.find(Customer.class, 101);
		cus.setName("Kaustubh");
	}
	
	@Transactional
	public void delete() {
		Customer cus = entityManager.find(Customer.class,101);
		entityManager.remove(cus);
	}
	
	@Transactional
	 public void getAllData() {

	    List<Customer> listofCustomer = entityManager.createQuery("From Customer").getResultList();

	    if (listofCustomer == null) {
	      System.out.println("No employee found . ");
	    } else {
	      for (Customer cust : listofCustomer) {
	        System.out.println("Employee name= " + cust.getName());
	      }
	    }

	  }
	
}
