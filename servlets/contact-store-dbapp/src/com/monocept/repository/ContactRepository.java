package com.monocept.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.monocept.model.Contact;

public class ContactRepository {
	static Connection con = null;
	static {

		String database = "contacts";
		String url = "jdbc:mysql://127.0.0.1:4040/";
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

	public List<Contact> getContacts() throws SQLException {

		String query = "SELECT * FROM CONTACTDB";
		PreparedStatement pr = con.prepareStatement(query);
		ResultSet rs = pr.executeQuery();

		List<Contact> contacts = new ArrayList<Contact>();
		while (rs.next()) {
			String id = rs.getString("id");
			String fname = rs.getString("firstname");
			String lname = rs.getString("lastname");
			String email = rs.getString("email");

			contacts.add(new Contact(id, fname, lname, email));
		}
		return contacts;

	}

	public void addToContacts(Contact contact) throws SQLException {
		String id = contact.getId();
		String fname = contact.getFirstName();
		String lname = contact.getLastName();
		String email = contact.getEmail();
		String query = "INSERT INTO CONTACTDB VALUES(?,?,?,?)";
		

		PreparedStatement pr = con.prepareStatement(query);
		pr.setString(1, id);
		pr.setString(2, fname);
		pr.setString(3, lname);
		pr.setString(4, email);
		pr.executeUpdate();
		return;
	}

	public Contact getDataById(String id) throws SQLException {
		Contact c = null ;
		String query = "SELECT * FROM CONTACTDB WHERE ID = ?";
		PreparedStatement pr = con.prepareStatement(query);
		pr.setString(1, id);
		ResultSet rs = pr.executeQuery();
		if(rs.next()) {
			String id1 = rs.getString("id");
			String fname = rs.getString("firstname");
			String lname = rs.getString("lastname");
			String email = rs.getString("email");
			
			c = new Contact(id1, fname, lname, email);
		}
		return c;
	}
	
	
	public void modifyContact(Contact contact) throws SQLException {
		System.out.println("inside Update of repo");
		String id = contact.getId();
		String fname = contact.getFirstName();
		String lname = contact.getLastName();
		String email = contact.getEmail();
		String id1 = contact.getId();
		String query = "UPDATE CONTACTDB SET ID=?, FIRSTNAME=?, LASTNAME=?, EMAIL=? WHERE ID=?";
		

		PreparedStatement pr = con.prepareStatement(query);
		pr.setString(1, id);
		pr.setString(2, fname);
		pr.setString(3, lname);
		pr.setString(4, email);
		pr.setString(5, id1);
		pr.executeUpdate();
		return;
	}
}