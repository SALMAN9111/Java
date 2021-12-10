package com.monocept.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class TodoService {
	private List<TodoItem> todos;
	private File file;

	public TodoService() {
		this.file = new File("todoapp.txt");
		if(file.exists()) {
			todos = getTodoItem();
			return;
		}

		this.todos = new LinkedList<>();
	}

	public void addTodo(TodoItem item) {
		todos.add(item);
		saveTodos(todos);
	}
	
	public void removeTodo(int number) {
		todos.remove(number-1);
		saveTodos(todos);
	}
	
	public void hasCompletd(int number) {
		todos.get(number-1).setHasCompleted(true);
		saveTodos(todos);
		
	}

	public List<TodoItem> getTodoItem() {
		return readFromFile();
	}

	public int numberOfTodos() {
		return todos.size();
	}

	private void saveTodos(List<TodoItem> todos) {

		try {
			
			FileOutputStream inputFile = new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(inputFile);
			out.writeObject(todos);
			out.flush();
			out.close();
		} catch (Exception e) {
			throw new RuntimeException("Could not add todo to list.");
		}
	}

	private List<TodoItem> readFromFile() {

		try {
			@SuppressWarnings("resource")
			ObjectInputStream out = new ObjectInputStream(new FileInputStream(file));
			@SuppressWarnings("unchecked")
			List<TodoItem> todoItem = (List<TodoItem>) out.readObject();
			return todoItem;
		} catch (Exception e) {
			throw new RuntimeException("Could not read from file.");
		}

	}

	
		

}
