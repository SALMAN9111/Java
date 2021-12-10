package com.monocept.test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DetailsOfEmpTableTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		java.sql.Connection con = null;
		String database = "monoceptdb";
		String url = "jdbc:mysql://127.0.0.1:4040/";
		String driver = "com.mysql.jdbc.Driver";
		String user = "root";
		String pass = "root";
		System.out.println("Enter Employee id :");
		Scanner scanner = new Scanner(System.in);
		String empId = scanner.nextLine();
		
		try {
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url+database,user,pass);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM EMP WHERE EMPNO= "+empId);
			System.out.println("EmpId \t"+ "EmpName \t"+"JOB \t"+"MGR \t"+"HIREDATE \t"+"SAL \t"+"COMM \t"+"DEPTNo");
			while(rs.next()) {
				int id = rs.getInt("EMPNO");
				String name = rs.getString("ENAME");
				String job = rs.getString("JOB");
				int mgr = rs.getInt("MGR");
				String date = rs.getString("HIREDATE");
				int sal = rs.getInt("SAL");
				int comm = rs.getInt("COMM");
				int deptno = rs.getInt("DEPTNO");
				System.out.println(id + "\t"+name+"\t"+job+"\t"+mgr+"\t"+"\t"+sal+"\t"+comm+"\t"+deptno+"\t\t"+date);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
