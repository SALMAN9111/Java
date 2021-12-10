package com.monocept.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class TodoTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		int numberOfTodo = 0;
		boolean continueApp = true;
		String todoItem = null;
		int userInput;
		final int display = 1;
		final int add = 2;
		final int remove = 3;
		final int readCompletedTodos = 4;
		final int exit = 5;
		ArrayList<String> todos = new ArrayList<String>();
		ArrayList<String> completedTodos = new ArrayList<String>();

		System.out.println("Developed by Salman");

		while (continueApp) {
			try {

				System.out.println("1.Display all todos.");
				System.out.println("2.Add todos.");
				System.out.println("3.Remove todos.");
				System.out.println("4.To view completed Todos.");
				System.out.println("5.To exit app.");

				System.out.print("\nEnter your choice.");
				Scanner scanner = new Scanner(System.in);
				userInput = scanner.nextInt();

				switch (userInput) {
				case display:
					todos = readFromApp();
					readTodos(todos);
					System.out.println("\n");
					break;

				case add:
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss.SSS");

					String outTimestamp = sdf.format(new java.util.Date());
					System.out.print("\nAdd your todo item here: ");
					scanner = new Scanner(System.in);
					todoItem = scanner.nextLine();
					todoItem = todoItem + "(" + outTimestamp + ")";
					todos.add(todoItem);
					writeToApp(todos);
					numberOfTodo = numberOfTodo + 1;
					System.out.println();
					break;

				case remove:
					System.out.println("Enter todo number to remove");
					int removeTodoNumber = scanner.nextInt();
					String item = todos.remove(removeTodoNumber - 1);
					completedTodos.add(item + " | completed");
					writeCompletedTodosToApp(completedTodos);
					writeToApp(todos);
					System.out.println("\nRemoved todo item is: #" + removeTodoNumber);
					System.out.println("Successfully removed.\n");
					numberOfTodo--;
					break;

				case readCompletedTodos:
					completedTodos = readCompletdTodosFromApp();
					readTodos(completedTodos);
					System.out.println("\n");
					break;

				case exit:
					writeToApp(todos);
					continueApp = false;
					break;

				default:
					System.out.println("Invalid input.\n");

				}

			}

			catch (RuntimeException ex) {
				System.out.println("Enter numbers to perform task!!!.");

			}

		}

	}

	private static void readTodos(ArrayList<String> todos) {
		if (todos.isEmpty()) {
			System.out.println("No todos in file to do.");
		}

		int numberOfATodo = 0;
		for (String todoList : todos) {
			numberOfATodo = numberOfATodo + 1;
			System.out.print(todoList + " #" + numberOfATodo + "\n");
		}
	}

	private static void writeToApp(ArrayList<String> todos) throws IOException {
		File fileName = new File("todoapp.txt");
		try {
			FileWriter fw = new FileWriter(fileName);
			Writer output = new BufferedWriter(fw);
			int arrayListSize = todos.size();
			for (int i = 0; i < arrayListSize; i++) {
				if (i == 0)
					output.write(todos.get(i).toString() + "\n");
				else
					output.append(todos.get(i).toString() + "\n");
			}

			output.close();
		} catch (Exception e) {
			System.out.println("I cannot crate that file!");

		}

	}
	private static void writeCompletedTodosToApp(ArrayList<String> completedTodos) throws IOException {
		File fileName = new File("completedtodoapp.txt");
		try {
			FileWriter fw = new FileWriter(fileName);
			Writer output = new BufferedWriter(fw);
			int arrayListSize = completedTodos.size();
			for (int i = 0; i < arrayListSize; i++) {
				if (i == 0)
					output.write(completedTodos.get(i).toString() + "\n");
				else
					output.append(completedTodos.get(i).toString() + "\n");
			}

			output.close();
		} catch (Exception e) {
			System.out.println("I cannot crate that file!");

		}
	}

	@SuppressWarnings("resource")
	private static ArrayList<String> readFromApp() throws IOException {
		String line = null;
		BufferedReader input = new BufferedReader(new FileReader("todoapp.txt"));
		ArrayList<String> todoList = new ArrayList<String>();
		System.out.println("Content of File are");
		/*if (!input.ready()) {
			System.out.println("Nothing in file");
		}*/
		while ((line = input.readLine()) != null) {
			todoList.add(line);
		}

		return todoList;
	}

	

	private static ArrayList<String> readCompletdTodosFromApp() throws IOException {
		String line = null;
		BufferedReader input = new BufferedReader(new FileReader("completedtodoapp.txt"));
		ArrayList<String> todoList = new ArrayList<String>();
		System.out.println("Content of File are");
		if (!input.ready()) {
			System.out.println("Nothing in file");
		}
		while ((line = input.readLine()) != null) {
			todoList.add(line);
		}

		return todoList;
	}

}

/*
 * String filename = "todoapp.txt"; String line; ArrayList<String> todoArrayList
 * = new ArrayList<String>(); try { BufferedReader read = new BufferedReader(new
 * FileReader(filename)); if(!read.ready()) { throw new IOException(); }
 * 
 * while((line = read.readLine()) != null) { todoArrayList.add(line); }
 * read.close(); }
 * 
 * catch(IOException e) { System.out.println(e); }
 * 
 * int size = todoArrayList.size(); for(int i=0; i<size; i++) {
 * //System.out.println(todoArrayList.get(i).toString());
 * 
 * }
 */

/*
 * Scanner s = new Scanner(new File("todoapp.txt")); ArrayList<String> list =
 * new ArrayList<String>(); while (s.hasNext()) { list.add(s.nextLine()); }
 * s.close(); return list; }
 */

/*
 * try { ObjectOutputStream write = new ObjectOutputStream(new
 * FileOutputStream("todoapp.txt")); write.writeObject(todos); //todos.clear();
 * write.close(); } catch (IOException e) { System.out.println("Error occurs");
 * e.printStackTrace(); }
 */
/*
 * File app = new File("todoapp.txt"); FileWriter fw = new FileWriter(app);
 * BufferedWriter bw = new BufferedWriter(fw);
 * 
 * bw.write(todos); bw.close();
 */

/*
 * File readFile = new File("todoapp.txt");
 * 
 * @SuppressWarnings("resource") Scanner scanner = new Scanner(readFile);
 * System.out.println("Content of Todo app are"); while (scanner.hasNextLine())
 * { System.out.println(scanner.nextLine() + "(#" + todoNumber++ + ")" + ","); }
 */