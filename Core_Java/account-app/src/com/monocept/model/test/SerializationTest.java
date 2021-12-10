package com.monocept.model.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.monocept.model.Account;

public class SerializationTest {
	public void serializedToFile(Account account1) {

		try {
			FileOutputStream file = new FileOutputStream("file.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(account1);
			out.flush();
			out.close();
			System.out.println("Serialization is successfull");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
