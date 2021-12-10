package com.monocept.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.Class;

public class ReflectionTest {
	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		//String string = new String();

		Class cls = String.class;

		System.out.println("Name of the class is " + cls.getName() + "\n");

		Constructor[] constructors = cls.getConstructors();
		System.out.println("Number of constructors are " + constructors.length);
		for (Constructor constructor : constructors) {
			Class[] datatype = constructor.getParameterTypes();
			System.out.println("Contructor name: " + constructor.getName() + ", datatype" + datatype.toString());
		}
		System.out.println();

		Method[] methods = cls.getMethods();
		System.out.println("Number of method are " + methods.length);
		for (Method method : methods) {
			System.out.println("Method Name: " + method.getName()
			+ ", Return type: " + method.getReturnType());
		}
	}
}
