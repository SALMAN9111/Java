package com.monocept.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.net.UnknownHostException;

public class ConnectionTest {
  public static void main(String[] args) throws ClassNotFoundException, SQLException, UnknownHostException {

//    Connection connection=DriverManager.getConnection("")

    Class.forName("com.mysql.jdbc.Driver");

    Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/swabhav", "root", "root");

    System.out.println("Class Name- " + con.getClass());
    System.out.println("Database Name- " + con.getCatalog());
    System.out.println("Server- " + con.getMetaData().getURL());
    System.out.println("username- " +con.getMetaData().getUserName());
    System.out.println("Driver Name: "+con.getMetaData().getDriverName());
  
  }
}