package com.monocept.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WriteToPropertyFileTest {

	public static void main(String[] args) {

		try (OutputStream output = new FileOutputStream("data//config.properties")) {

			Properties prop = new Properties();

			// set the properties value
			prop.setProperty("db.url", "localhost");
			prop.setProperty("db.user", "something");
			prop.setProperty("db.password", "password");

			// save properties to project root folder
			prop.store(output, null);
			
			System.out.println("File updated with data.");


		} catch (IOException io) {
			io.printStackTrace();
		}

	}

}
