package com.monocept.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.monocept.model.Contact;

@Repository
public class ContactRepository {
	@PersistenceContext
	private EntityManager entityManager;

//	@Transactional
//	public void add() {
//		Contact contact = new Contact(1, "Frank");
//		entityManager.persist(contact);
//	}

	@Transactional
	public void getAllContact() {

		@SuppressWarnings("unchecked")
		List<Contact> listofContact = entityManager.createQuery("From Contact").getResultList();

		if (listofContact == null) {
			System.out.println("No employee found . ");
		} else {
			for (Contact contact : listofContact) {
				System.out.println("Employee name : " + contact.getName());
			}
		}

	}

}
