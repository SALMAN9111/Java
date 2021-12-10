package com.monocept.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.model.Customer;
import com.monocept.model.CustomerDTO;
import com.monocept.model.Payee;
import com.monocept.repository.CustomerRepository;
import com.monocept.service.CustomerService;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	public CustomerService customerService;

	@SuppressWarnings("unused")
	@Autowired
	private CustomerRepository customerRepository;

	@PutMapping(value = "/{customerId}/changePassword")
	public boolean changePassword(@PathVariable Integer customerId, String oldPassword, String newPassword) {
		boolean changPassword = customerService.changePassword(customerId, oldPassword, newPassword);
		System.out.println("Inside edit controller");
		if (changPassword) {
			System.out.println("Inside edit controller if");

			return true;
		}
		return false;

	}

	@GetMapping(value = "{customerId}")
	public List<Payee> getPayees(@PathVariable(value = "customerId") Integer customerId) {
		System.out.println("inside contoller of get payee");
		List<Payee> payees = customerService.getAllPayee(customerId);
		return payees;

	}

	@GetMapping(value = "/{customerid}/details")
	public Customer myDetails(@PathVariable(value = "customerid") Integer customerId) {
		System.out.println("Inside Details controller");
		System.out.println("Customer accNo " + customerId);
		Customer myDetails = customerService.getMyDetails(customerId);
		return (myDetails);
	}

	@PostMapping(value = "/{customerId}/addPayee")
	public void addPayee(@PathVariable Integer customerId, @RequestBody List<Payee> payees) {
		System.out.println("Inside addPayee");
		System.out.println("Inside controller of addPayee");
		customerService.addPayee(customerId, payees);
		System.out.println("after addpayee call function");

	}

	@PutMapping(value = "/{customerId}/editCustomer", consumes = "application/json")
	public void updateCustomerDetails(@RequestBody CustomerDTO customer, @PathVariable Integer customerId) {
		System.out.println("Inside edit controller");
		customerService.editCustomerDetails(customer, customerId);

	}

	@PutMapping(value = "/{customerid}/transfermoney/{payeeid}")
	public void transferMoney(@PathVariable(value = "customerid") Integer customerId,
			@PathVariable(value = "payeeid") Integer payeeAccNo,@RequestBody Double amount) {
		System.out.println("inside transfer money");

		if (customerService.transferMoney(customerId, amount, payeeAccNo)) {
			System.out.println("Transaction successfull");
		} else {
			System.out.println("Transaction Failed!");
		}
	}

}

//@GetMapping(value = "/check")
//public boolean loginCredentials(@RequestBody Map<String, String> credentials) {
//
//	System.out.println("Inside login controller");
//	@SuppressWarnings("unused")
//	Customer optionalCustomer = customerService.verifyCredential(credentials);
//
//	return true;
//}