package com.monocept.test;

import java.util.ArrayList;
import java.util.Scanner;

public class TodosAppTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int numberOfTodo = 0;
		boolean continueApp = true;
		String todoItem = null;
		int userInput;
		final int display = 1;
		final int add = 2;
		final int remove = 3;
		ArrayList<String> todos = new ArrayList<String>();

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
				if (todos.isEmpty()) {
					System.out.println("Nothing in Todos list to do. Add todos.\n");

					break;
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
				System.out.println("\n");
				break;

			case add:
				System.out.print("\nAdd your todo item here: ");
		        scanner = new Scanner(System.in);
				todoItem = scanner.nextLine();
				todos.add(todoItem);
				numberOfTodo = numberOfTodo + 1;
				System.out.println();
				break;

			case remove:
				System.out.println("Enter todo number to remove");
				int removeTodoNumber = scanner.nextInt();
				todos.remove(removeTodoNumber);
				System.out.println("\nRemoved todo item is: #" + removeTodoNumber);
				System.out.println("Successfully removed.\n");
				numberOfTodo--;
				break;

			case 4:
				continueApp = false;
				break;

			default:
				System.out.println("Invalid input.\n");

			}

		}

	}
}