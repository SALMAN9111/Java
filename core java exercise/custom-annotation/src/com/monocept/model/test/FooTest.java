package com.monocept.model.test;

import java.lang.reflect.Method;

import com.monocept.model.Foo;
import com.monocept.model.MyAnnotation;

public class FooTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {

		Foo foo = new Foo();
		Method[] methods = foo.getClass().getMethods();
		for (Method method : methods) {
			MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);

			if (myAnnotation != null) {
				try {
					method.invoke(foo);
				} catch (Exception e) {
					System.out.println("End");
				}

			}

		}
	}
}