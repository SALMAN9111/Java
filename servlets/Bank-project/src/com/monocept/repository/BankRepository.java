package com.monocept.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.monocept.model.Customer;

public class BankRepository {

	static Connection con = null;
	static {

		String database = "bank-app";
		String url = "jdbc:mysql://127.0.0.1:3306/";
		String driver = "com.mysql.jdbc.Driver";
		String user = "root";
		String pass = "root";

		try {
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url + database, user, pass);
		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	/*
	 * public List<Contact> getContacts() throws SQLException {
	 * 
	 * String query = "Select * from contact"; PreparedStatement pr =
	 * con.prepareStatement(query); ResultSet rs = pr.executeQuery();
	 * 
	 * List<Contact> contacts = new ArrayList<Contact>(); while (rs.next()) { String
	 * id = rs.getString("id"); String fname = rs.getString("firstname"); String
	 * lname = rs.getString("lastname"); String email = rs.getString("email");
	 * 
	 * contacts.add(new Contact(id, fname, lname, email)); }
	 * 
	 * return contacts;
	 * 
	 * }
	 */

	public void addTOCustomer(Customer customer) throws SQLException {

		String name = customer.getName();
		Double balance = customer.getBalance();
		int password = customer.getPassword();

		con.setAutoCommit(false);

		// -- bank master insert

		String bankmastertable = "INSERT INTO bank_master VALUES(?, ?,?,?)";
		PreparedStatement bankmaster = con.prepareStatement(bankmastertable);

		bankmaster.setString(1, name);
		bankmaster.setInt(2, password);
		bankmaster.setDouble(3, balance);
		bankmaster.setString(4, "N");

		int bankmast = bankmaster.executeUpdate();
		System.out.println("Bank master- " + bankmast);

		// -- bank transac insert

		java.util.Date date = new java.util.Date();
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());

		String banktransac = "INSERT INTO bank_transaction VALUES( ?, ?,?,?)";
		PreparedStatement prepareStatemtnBnktr = con.prepareStatement(banktransac);

		prepareStatemtnBnktr.setString(1, name);
		prepareStatemtnBnktr.setDouble(2, balance);
		prepareStatemtnBnktr.setString(3, "D");
		prepareStatemtnBnktr.setDate(4, sqlDate);

//----------
		int banktran = prepareStatemtnBnktr.executeUpdate();
		System.out.println("Bank transac- " + banktran);

		if ((bankmast > 0) && (banktran > 0)) {
			con.commit();
			System.out.println("commit");
		} else {
			con.rollback();
			System.out.println("rollback");
		}

		return;

	}

	public boolean checkForAuthenticate(String name, int password) throws SQLException {

		String checkAuth = "Select name,password from bank_master where name=? and password=?";

		PreparedStatement chkauth = con.prepareStatement(checkAuth);

		chkauth.setString(1, name);
		chkauth.setInt(2, password);
		ResultSet rs = chkauth.executeQuery();

		String dbname = "";
		int dbpassword = 0;

		while (rs.next()) {

			dbname = rs.getString("name");
			dbpassword = rs.getInt("password");

		}

		if (name.equals(dbname) && password == dbpassword) {

			return true;
		}
		return false;

	}

	public Double getBalanceOfUser(String name) throws SQLException {

		String balancequery = "Select BALANCE from bank_master where name=?";

		PreparedStatement getBal = con.prepareStatement(balancequery);

		getBal.setString(1, name);

		ResultSet rs = getBal.executeQuery();

		Double balance;

		while (rs.next()) {

			return balance = rs.getDouble("BALANCE");

		}
		return null;

	}

	public boolean depositAmount(Double amount, String name) throws SQLException {

		System.out.println("Check name " + name);

		con.setAutoCommit(false);
		String depositAmountQuery = "update bank_master set balance = balance+? where Name = ?";

		PreparedStatement preparedStmt = con.prepareStatement(depositAmountQuery);
		preparedStmt.setDouble(1, amount);
		preparedStmt.setString(2, name);

		int depositupdate = preparedStmt.executeUpdate();
		System.out.println("depositupdate- " + depositupdate);

		java.util.Date date = new java.util.Date();
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());

		String depositinsert = "INSERT INTO bank_transaction VALUES( ?, ?,?,?)";
		PreparedStatement prepareStatdeposit = con.prepareStatement(depositinsert);

		prepareStatdeposit.setString(1, name);
		prepareStatdeposit.setDouble(2, amount);
		prepareStatdeposit.setString(3, "D");
		prepareStatdeposit.setDate(4, sqlDate);

		int bankinsert = prepareStatdeposit.executeUpdate();
		System.out.println("Bank transac- " + prepareStatdeposit);

		if ((depositupdate > 0) && (bankinsert > 0)) {
			con.commit();
			System.out.println("commit");
			return true;
		} else {
			con.rollback();
			System.out.println("rollback");
			return false;
		}

	}

	public boolean withDrawAmount(Double amount, String name) throws SQLException {

		System.out.println("Check name " + name);

		con.setAutoCommit(false);
		String depositAmountQuery = "update bank_master set balance = balance-? where Name = ?";

		PreparedStatement preparedStmt = con.prepareStatement(depositAmountQuery);
		preparedStmt.setDouble(1, amount);
		preparedStmt.setString(2, name);

		int depositupdate = preparedStmt.executeUpdate();
		System.out.println("depositupdate- " + depositupdate);

		java.util.Date date = new java.util.Date();
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());

		String depositinsert = "INSERT INTO bank_transaction VALUES( ?, ?,?,?)";
		PreparedStatement prepareStatdeposit = con.prepareStatement(depositinsert);

		prepareStatdeposit.setString(1, name);
		prepareStatdeposit.setDouble(2, amount);
		prepareStatdeposit.setString(3, "W");
		prepareStatdeposit.setDate(4, sqlDate);

		int bankinsert = prepareStatdeposit.executeUpdate();
		System.out.println("Bank transac- " + prepareStatdeposit);

		if ((depositupdate > 0) && (bankinsert > 0)) {
			con.commit();
			System.out.println("commit");
			return true;
		} else {
			con.rollback();
			System.out.println("rollback");
			return false;
		}

	}

	public List<Customer> getPassbookData(String name) throws SQLException {

		System.out.println("passbook name " + name);

		String passbookquery = "select * from bank_transaction where Name = ?";

		PreparedStatement preparedStmt = con.prepareStatement(passbookquery);

		preparedStmt.setString(1, name);

		ResultSet rs = preparedStmt.executeQuery();

		List<Customer> custpassbook = new ArrayList<Customer>();
		while (rs.next()) {

			String dbname = rs.getString("name");
			Double amount = rs.getDouble("amount");
			String type = rs.getString("type");
			String date = rs.getString("DATES");

			System.out.println("name " + dbname);
			System.out.println("date " + date);

			custpassbook.add(new Customer(dbname, amount, type, date));

		}
		return custpassbook;
	}

	public List<Customer> repoGetAllCustomers() throws SQLException {

		String customerQuery = "select NAME from bank_master where role!='A'";

		PreparedStatement preparedStmt = con.prepareStatement(customerQuery);

		ResultSet rs = preparedStmt.executeQuery();

		List<Customer> customerNames = new ArrayList<Customer>();
		while (rs.next()) {

			String dbname = rs.getString("name");
			customerNames.add(new Customer(dbname));

		}
		return customerNames;
	}

	public boolean repoCheckRole(String name) throws SQLException {
		String checkQuery = "SELECT NAME FROM BANK_MASTER WHERE ROLE = 'A' AND NAME= '" + name + "'";

		PreparedStatement preparedStmt = con.prepareStatement(checkQuery);

		ResultSet rs = preparedStmt.executeQuery();

		while (rs.next()) {
			String dbname = rs.getString("name");
			if (dbname != null) {
				System.out.println("The value of dbname in BankRepository is - " + dbname);
				return true;
			}
		}

//		if (rs.getString("name") != null) {
//			return true;
//		}

		return false;

	}

	public List<Customer> repoGetAllTransactions() throws SQLException {

		String passbookquery = "SELECT * FROM BANK_TRANSACTION ";

		PreparedStatement preparedStmt = con.prepareStatement(passbookquery);

		ResultSet rs = preparedStmt.executeQuery();

		List<Customer> transactions = new ArrayList<Customer>();
		while (rs.next()) {

			String dbname = rs.getString("name");
			Double amount = rs.getDouble("amount");
			String type = rs.getString("type");
			String date = rs.getString("DATES");

			transactions.add(new Customer(dbname, amount, type, date));

		}
		return transactions;

	}

}