package com.monocept.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.monocept.model.Contact;

@Repository
public class ContactSerialize {
	private List<Contact> contacts = new ArrayList<Contact>();
	Contact c1 = new Contact(101, "Sayed");
	Contact c2 = new Contact(102, "Aditya");
	Contact c3 = new Contact(103, "Kaustubh");

	public ContactSerialize() {
		System.out.println("Serialize created");
		contacts.add(c1);
		contacts.add(c2);
		contacts.add(c3);
	}

	public void add(Contact contact) throws IOException {
		contacts.add(contact);
		FileOutputStream fos = new FileOutputStream("data\\contacts.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(contacts);
		oos.close();
		fos.close();
		System.out.println("serialized success");
	}

	@SuppressWarnings("unchecked")
	public List<Contact> getContacts() throws ClassNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("data\\contacts.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		contacts = (List<Contact>) ois.readObject();
		ois.close();
		fis.close();

		return contacts;

	}
}
