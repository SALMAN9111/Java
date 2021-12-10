package com.monocept.test;

import java.util.Scanner;

public class TodoUsingStringTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int numberOfTodo = 0;
		boolean continueApp = true;
		String todoItem = null;
		int userInput;
		final int display = 1;
		final int add = 2;
		final int remove = 3;
		System.out.println("Enter number of todo you want to store");
		Scanner scanner = new Scanner(System.in);
		int maxTodo = scanner.nextInt();
		String[] todoArray = new String[maxTodo];

		while (continueApp) {
			System.out.println("1.Display all todos");
			System.out.println("2.Add todos");
			System.out.println("3.Remove todos");
			System.out.println("4.To exit app");

			System.out.print("\nEnter your choice.");
			userInput = scanner.nextInt();

			switch (userInput) {

			case display:
				if (isEmpty(todoArray)) {
					System.out.println("Nothing in Todos list to do. Add todos.\n");

					break;
				}
				
				int todoNumber = 1;
				System.out.println();
				for (String todoList : todoArray) {
					if (todoList == null)
						continue;
					System.out.print(todoList + "(#" + todoNumber + ")\n");
					todoNumber++;
				}
				
				System.out.println();
				break;

			case add:
				if (numberOfTodo == maxTodo) {
					System.out.println("Your todo list is Full\n");

					break;
				}
				System.out.print("\nAdd your todo item here: ");
				scanner = new Scanner(System.in);
				todoItem = scanner.nextLine();
				todoArray[numberOfTodo] = todoItem;
				numberOfTodo = numberOfTodo + 1;
				System.out.println();
				break;

			case remove:
				System.out.println("Enter number to remove todo. ");
				int removeTodoNumber = scanner.nextInt();
				for (int i = 0; i < todoArray.length; i++) {
					if (i == removeTodoNumber) {
						todoArray[i] = null;
					}
					todoArray[i] = todoArray[i];
				}
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

	private static boolean isEmpty(String[] todoArray) {
		for(int i=0; i<todoArray.length; i++) {
			if(todoArray[i]!=null)
				return false;
		}
		return true;
	}
}
