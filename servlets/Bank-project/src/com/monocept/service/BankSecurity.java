package com.monocept.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class BankSecurity {

	Map<String, String> users = new HashMap<String, String>();

	public BankSecurity() {

	}

	public boolean userAuth(String username, int password) throws SQLException {

		BankService bankservice = BankService.getInstance();

		if (bankservice.checkAuthentication(username, password)) {
			return true;
		}
		return false;

	}

}
