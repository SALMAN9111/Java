package com.monocept.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	public String id;
	public String name;

	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return this.id+" "+this.name;
	}
	
}

public class EmployeeAnalyserTest {
	public static Employee convertToEmp(String x) {
		String[] details =x.split(",");
		return new Employee(details[0],details[1]);
	}
	
	public static void main(String[] args) throws IOException {
		List<Employee> employees = Files.lines(Paths.get("data\\emp.txt"))
				.map(x->convertToEmp(x))
				.sorted((e1,e2)->e1.name.compareTo(e2.name))
				.collect(Collectors.toList());
		employees.forEach(System.out::println);
		
		employees.forEach(x->System.out.println(x.name));

	}
}
