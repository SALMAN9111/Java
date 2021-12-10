package com.monocept.model.test;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.monocept.model.TodoItem;

public class TodoItemUintTest {

	@Test
	public void testingConstructorOfTodoItem() {
		Date d = new Date();
		// Arrange and Act
		TodoItem todo = new TodoItem(1, "Testing_Constructor", d, false);
		int exceptedId = 1;
		String exceptedTodo = "Testing_Constructor";

		// Assert
		Assert.assertEquals(todo.getId(), exceptedId);
		Assert.assertEquals(todo.getDescription(), exceptedTodo);
		Assert.assertEquals(todo.getCreatedDate(), d);

	}
	
	@Test
	public void testingConstructorOfTodoItemWithSetter() {
		Date d = new Date();
		// Arrange and Act
		TodoItem todo = new TodoItem(1, "Testing Constructor", d, false);
		int exceptedId = 1;
		todo.setDescription("Drink_water.");
		String exceptedTodo = "Drink_water.";

		// Assert
		Assert.assertEquals(todo.getId(), exceptedId);
		Assert.assertEquals(todo.getDescription(), exceptedTodo);
		Assert.assertEquals(todo.getCreatedDate(), d);

	}
	
	@Test
	public void testingConstructorOfTodoItemWithSOfHasCompleted() {
		Date d = new Date();
		// Arrange and Act
		TodoItem todo = new TodoItem(1, "Testing Constructor", d, false);
		int exceptedId = 1;
		todo.setDescription("Drink water.");
		todo.setHasCompleted(true);
		System.out.println(todo.isHasCompleted());
		String exceptedTodo = "Drink water.";

		// Assert
		Assert.assertEquals(todo.getId(), exceptedId);
		Assert.assertEquals(todo.getDescription(), exceptedTodo);
		Assert.assertTrue(todo.isHasCompleted()); 
		Assert.assertEquals(todo.getCreatedDate(), d);

	}

}
