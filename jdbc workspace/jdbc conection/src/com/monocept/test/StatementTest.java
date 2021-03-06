package com.monocept.test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class StatementTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		java.sql.Connection con = null;
		String database = "swabhav";
		String url = "jdbc:mysql://127.0.0.1:3306/";
		String driver = "com.mysql.jdbc.Driver";
		String user = "root";
		String pass = "root";
		
		try {
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url+database,user,pass);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM STUDENT");
			System.out.println("Id \t"+ "Name \t"+"\tLocation");
			while(rs.next()) {
				int id = rs.getInt("STUDENTID");
				String name = rs.getString("STUDENTNAME");
				String location = rs.getString("LOCATION");
				System.out.println(id + "\t"+name+"\t\t"+location);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
