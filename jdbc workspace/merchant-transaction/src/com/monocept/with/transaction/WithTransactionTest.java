package com.monocept.with.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

public class WithTransactionTest {

	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Merchant ID- ");
		String merchantid = scanner.nextLine();

		System.out.println("\n Enter Customer ID- ");
		String customerId = scanner.nextLine();

		System.out.println("\n Enter Amount");
		String amount = scanner.nextLine();

		Connection con = null;
		String database = "merchant";
		String url = "jdbc:mysql://127.0.0.1:3306/";
		String driver = "com.mysql.jdbc.Driver";
		String user = "root";
		String pass = "root";

		Class.forName(driver).newInstance();
		con = DriverManager.getConnection(url + database, user, pass);
		con.setAutoCommit(false);

		// connection.setAutoCommit(false);

		String merchantquery = "update MERCHANT set balance = balance+? where id = ?";

		PreparedStatement preparedStmt = con.prepareStatement(merchantquery);
		preparedStmt.setString(1, amount);
		preparedStmt.setString(2, merchantid);

		String customeruery = "update CUSTOMER set balance = balance-? where id = ?";

		PreparedStatement preparedStmt1 = con.prepareStatement(customeruery);
		preparedStmt1.setString(1, amount);
		preparedStmt1.setString(2, customerId);

		int merchantRowEffected =  preparedStmt.executeUpdate();
		System.out.println(merchantRowEffected);
		int customerRowEffected = preparedStmt1.executeUpdate();
		System.out.println(customerRowEffected);
		
		if((merchantRowEffected  > 0) && (customerRowEffected > 0)) {
			con.commit();
		}
		else {
			con.rollback();
		}

	}

}
