package com.monocept.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.monocept.model.Customer;
import com.monocept.repository.BankRepository;

public class BankService {

	private static BankService instance = null;
	// private static List<Contact> contactList = new ArrayList<Contact>();

	private BankRepository repo;

	public BankService() {

		this.repo = new BankRepository();

		System.out.println("service created");

	}

	public static BankService getInstance() {
		if (instance == null) {
			instance = new BankService();
		}
		return instance;

	}

	public void addCustomer(Customer customer) throws SQLException {

		repo.addTOCustomer(customer);
		return;

	}

	public boolean checkAuthentication(String name, int password) throws SQLException {

		return repo.checkForAuthenticate(name, password);

	}

	public Double getCustomerBalanceByName(String name) throws SQLException {

		return repo.getBalanceOfUser(name);

	}

	public boolean depositMoney(Double amount, String name) throws SQLException {

		return repo.depositAmount(amount, name);

	}

	public boolean withDrawMoney(Double amount, String name) throws SQLException {

		return repo.withDrawAmount(amount, name);

	}

	public List<Customer> showPassbook(String name) throws SQLException {

		return repo.getPassbookData(name);

	}

	public List<Customer> getAllCustomers() throws SQLException {
		return repo.repoGetAllCustomers();
	}

	public boolean checkRole(String name) throws SQLException {

		return repo.repoCheckRole(name);
	}

	public List<Customer> getAllTransactions() throws SQLException {
		return repo.repoGetAllTransactions();
	}

}