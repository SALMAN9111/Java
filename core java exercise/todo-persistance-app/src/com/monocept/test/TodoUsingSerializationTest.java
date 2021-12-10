package com.monocept.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TodoUsingSerializationTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		int numberOfTodo = 0;
		boolean continueApp = true;
		String todoItem = null;
		int userInput;
		final int display = 1;
		final int add = 2;
		final int remove = 3;
		final int exit = 4;
		String[] todos = new String[100];

		while (continueApp) {
			System.out.println("1.Display all todos");
			System.out.println("2.Add todos");
			System.out.println("3.Remove todos");
			System.out.println("4.To exit app");

			System.out.print("\nEnter your choice.");
			Scanner scanner = new Scanner(System.in);
			userInput = scanner.nextInt();

			switch (userInput) {

			case display:
				todos = deserializeFromFile();
				if (isEmpty(todos)) {
					System.out.println("No todos in file to do.");
					break;
				}
				for (String todoList : todos) {
					if (todoList == null)
						continue;
					System.out.print(todoList + "\n");

				}
				System.out.println("\n");
				break;

			case add:
				System.out.print("\nAdd your todo item here: ");
				scanner = new Scanner(System.in);
				todoItem = scanner.nextLine();
				todos[numberOfTodo] = todoItem;
				serializedToFile(todos);
				numberOfTodo = numberOfTodo + 1;
				System.out.println();
				break;

			case remove:
				System.out.println("Enter todo number to remove");
				int removeTodoNumber = scanner.nextInt();
				// todos[removeTodoNumber];
				for (int i = 0; i < todos.length; i++) {
					if (i == removeTodoNumber) {
						todos[i] = null;
					}
					todos[i] = todos[i];
				}
				serializedToFile(todos);
				System.out.println("\nRemoved todo item is: #" + removeTodoNumber);
				System.out.println("Successfully removed.\n");
				numberOfTodo--;
				break;

			case exit:
				serializedToFile(todos);
				continueApp = false;
				break;

			default:
				System.out.println("Invalid input.\n");

			}

		}

	}

	private static String[] deserializeFromFile() {
		try {
			@SuppressWarnings("resource")
			ObjectInputStream out = new ObjectInputStream(new FileInputStream("data//todoapp1.txt"));
			Object[] todoList = (Object[]) out.readObject();
			return (String[]) todoList;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;

	}

	public static void serializedToFile(String[] todos) {

		try {
			FileOutputStream file = new FileOutputStream("data//todoapp1.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(todos);
			out.flush();
			out.close();
			System.out.println("Serialization is successfull");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static boolean isEmpty(String[] todos) {
		for (int i = 0; i < todos.length; i++) {
			if (todos[i] != null)
				return false;
		}
		return true;
	}
}














/*
 * private static void writeToApp(ArrayList<String> todos) throws IOException {
 * File fileName = new File("data//todoapp.txt"); try { FileWriter fw = new
 * FileWriter(fileName); Writer output = new BufferedWriter(fw); int
 * arrayListSize = todos.size(); for (int i = 0; i < arrayListSize; i++) { if (i
 * == 0) output.write(todos.get(i).toString() + "\n"); else
 * output.append(todos.get(i).toString() + "\n"); }
 * 
 * output.close(); } catch (Exception e) {
 * System.out.println("I cannot crate that file!");
 * 
 * }
 * 
 * }
 */

/*
 * @SuppressWarnings("resource") private static ArrayList<String> readFromApp()
 * throws IOException { String line = null; BufferedReader input = new
 * BufferedReader(new FileReader("data//todoapp.txt")); ArrayList<String>
 * todoList = new ArrayList<String>();
 * System.out.println("Content of File are"); if (!input.ready()) {
 * System.out.println("Nothing in file"); } while ((line = input.readLine()) !=
 * null) { todoList.add(line); }
 * 
 * return todoList; }
 */
