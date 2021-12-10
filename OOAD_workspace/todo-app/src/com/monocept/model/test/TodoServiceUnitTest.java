package com.monocept.model.test;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.monocept.model.TodoItem;
import com.monocept.model.TodoService;

public class TodoServiceUnitTest {
	Date d = new Date();
	
	@Test
	public void addingTodosAndCheckingItCount() {
		TodoItem todo = new TodoItem(1, "Testing_Constructor", d, false);

		// Assert and Act
		TodoService service = new TodoService();
		service.addTodo(todo);
		
		//Act
		Assert.assertEquals(service.numberOfTodos(), 1);
	}

}
