package com.monocept.model;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TodoView {
	Date d = new Date();

	public void start() {
		TodoService service = new TodoService();
		int i = 0;
		final int display = 1;
		final int add = 2;
		final int remove = 3;
		final int markCompleted = 4;
		final int exit = 5;
		boolean continueApp = true;
		List<TodoItem> todos = null;

		System.out.println("Welcome to TodoApp\n");

		while (continueApp) {
			System.out.println("1.Display all todos");
			System.out.println("2.Add todos");
			System.out.println("3.Remove Todo");
			System.out.println("4.Mark todos as completed");
			System.out.println("5.To exit app");

			System.out.print("\nEnter your choice.");
			@SuppressWarnings("resource")
			Scanner scanner1 = new Scanner(System.in);
			int userInput;
			userInput = scanner1.nextInt();

			switch (userInput) {

			case display:

				todos = service.getTodoItem();
				if (todos.isEmpty()) {
					System.out.println("No todos in file to do.\n");
					break;
				}

				int numberOfATodo = 0;
				for (int j = 0; j < todos.size(); j++) {
					numberOfATodo = numberOfATodo + 1;
					System.out.print(todos.get(j) + " #" + numberOfATodo + "\n");
				}
				System.out.println("\n");
				break;

			case add:
				System.out.print("\nAdd your todo item here: ");
				scanner1 = new Scanner(System.in);
				String todo = scanner1.nextLine();
				TodoItem todoItem = null;
				if (!todos.isEmpty())
					todoItem = new TodoItem(todos.size() + 1, todo, d, false);
				else {
					todoItem = new TodoItem(i + 1, todo, d, false);
				}
				service.addTodo(todoItem);
				break;

			case remove:
				System.out.println("Enter todo number to remove todo");
				Scanner scanner = new Scanner(System.in);
				int number = scanner.nextInt();
				service.removeTodo(number);
				break;

			case markCompleted:
				System.out.println("Enter todo number to mark as completed");
				Scanner scanner2 = new Scanner(System.in);
				int mark = scanner2.nextInt();
				service.hasCompletd(mark);
				break;

			case exit:
				continueApp = false;
				break;

			default:
				System.out.println("Invalid input.\n");
			}

		}
	}

}
