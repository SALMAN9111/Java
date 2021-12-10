package com.monocept.model.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.monocept.model.EmployeeAnalyser;
import com.monocept.model.ReadFromFile;
import com.monocept.model.ReadFromUrl;

public class EmployeeTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*EmployeeAnalyser employees1 = new EmployeeAnalyser(new ReadFromUrl());
		System.out.println("Reading employee data using URL:\n");
		Map<String, Integer> employee1 = employees1.employeeByDepartmentNumber1(30);
		System.out.println("Department Number : "+employee1.keySet()+" Number Of employee are : "+employee1.values());*/
		
		System.out.println("Reading employee data using File\n");
		EmployeeAnalyser employees = new EmployeeAnalyser(new ReadFromFile("data//employeedata.txt"));
		Map<String, Integer> employee ;
		employee = employees.employeeByDepartmentNumber1(30);
		System.out.println("Department Number : "+employee.keySet()+" Number Of employee are : "+employee.values());
		
		employee = employees.employeeByDesignation1("DEVELOPER");
		System.out.println("Designation : "+employee.keySet()+" Number of employee are : "+employee.values());
		
		Map<String , String> employee2;
		employee2 = employees.employeeWithHighestSalary1();
		System.out.println("Department Number : "+employee2.keySet()+" Employee with highest salary : "+employee2.values());
	}

}



/*System.out.print("Employees working in department number 30 are: ");
System.out.println(employee.values()+"\nNumber of Employees are: " +employee.size()+"\n");

employee = employees.employeeByDesignation("MANAGER");
System.out.print("Employees working as Manager are: ");
System.out.println(employee.values()+"\nNumber of Employees are: " +employee.size()+"\n");

employee = employees.employeeWithHighestSalary();
System.out.println("Employee with highest salary is: ");
System.out.println(employee.size());
System.out.println(employee.values());*/