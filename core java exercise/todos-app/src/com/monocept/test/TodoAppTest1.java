package com.monocept.test;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoAppTest1 {
	public static void main(String[] args) {
		int numberOfTodo = 0;
		boolean continueApp = true;
		int userInput;
		final int display = 1;
		final int add = 2;
		final int remove = 3;
		final int exit = 4;
		ArrayList<String> todos = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);

		while (continueApp) {
			System.out.println("1.Display all todos");
			System.out.println("2.Add todos");
			System.out.println("3.Remove todos");
			System.out.println("4.To exit app");

			System.out.print("\nEnter your choice.");
			userInput = scanner.nextInt();

			switch (userInput) {

			case display:
				displayTodos(todos, numberOfTodo);
				System.out.println();
				break;

			case add:
				numberOfTodo = addTodos(numberOfTodo, todos);
				break;

			case remove:
				numberOfTodo = removeTodos(numberOfTodo, todos, scanner);
				break;

			case exit:
				continueApp = false;
				break;

			default:
				System.out.println("Invalid input.\n");

			}

		}

	}

	public static void displayTodos(ArrayList<String> todos, int numberOfTodo) {
		if (todos.isEmpty()) {
			System.out.println("Nothing in Todos list to do. Add todos.\n");

			return;
		}
		int todoNumber = 1;
		System.out.println();
		for (String todoList : todos) {
			System.out.print(todoList + "(#" + todoNumber + ")");
			if (todoNumber != numberOfTodo) {
				System.out.print(",");
			}
			todoNumber++;
		}
		System.out.println();
	}

	private static int removeTodos(int numberOfTodo, ArrayList<String> todos, Scanner scanner) {
		int removeTodoNumber = readNumberToRemoveTodo();
		todos.remove(removeTodoNumber);

		System.out.println("\nRemoved todo item is: #" + removeTodoNumber);
		System.out.println("Successfully removed.\n");

		numberOfTodo--;
		return numberOfTodo;
	}

	private static int readNumberToRemoveTodo() {
		System.out.println("Enter todo number to remove");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int removeTodoNumber = scan.nextInt();
		return removeTodoNumber;
	}

	private static int addTodos(int numberOfTodo, ArrayList<String> todos) {

		todos.add(readTodo());

		numberOfTodo = numberOfTodo + 1;
		System.out.println();
		return numberOfTodo;
	}

	private static String readTodo() {
		String readtodoItem;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nAdd your todo item here: ");
		scanner = new Scanner(System.in);
		readtodoItem = scanner.nextLine();
		return readtodoItem;
	}
}
