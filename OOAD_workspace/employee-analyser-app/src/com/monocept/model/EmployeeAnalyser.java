package com.monocept.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeAnalyser {
	private ILoader loader;
	private Set<String> setList;

	public EmployeeAnalyser(ILoader loader) throws FileNotFoundException, IOException {
		this.loader = loader;
		readData();
	}

	private void readData() throws FileNotFoundException, IOException {
		setList = loader.load();
	}

	private Set<String> getReadData() {
		return setList;
	}

	public Map<String, Integer> employeeByDepartmentNumber1(int departmentNumber)
			throws FileNotFoundException, IOException {
		Set<String> setList = getReadData();
		int count = 0;
		// Set<String> names = new LinkedHashSet<>();
		// Map<Integer, Set<String>> hashMap = new HashMap<>();
		String dapartmentNubmer = null;
		Map<String, Integer> hashMap = new LinkedHashMap<>();
		for (String set : setList) {
			String[] words = set.split(",");
			if (Integer.parseInt(words[7]) == departmentNumber) {
				count++;
				dapartmentNubmer = words[7];

			}
		}
		hashMap.put(dapartmentNubmer, count);
		return hashMap;
	}

	public Map<String, String> employeeWithHighestSalary1() throws FileNotFoundException, IOException {
		Set<String> setList = getReadData();
		int salary = 0;
		String name = null, departmentNumber = null;
		Map<String, String> hashMap = new LinkedHashMap<>();
		for (String set : setList) {
			String[] words = set.split(",");
			if (salary < Integer.parseInt(words[5])) {
				name = words[1];
				departmentNumber = words[7];
				salary = Integer.parseInt(words[5]);
			}
		}
		hashMap.put(departmentNumber, name);
		return hashMap;
	}

	public Map<String, Integer> employeeByDesignation1(String designationName)
			throws FileNotFoundException, IOException {
		Set<String> setList1 = getReadData();
		int count = 0;
		// Set<String> names = new LinkedHashSet<>();
		// Map<Integer, Set<String>> hashMap = new HashMap<>();
		String designation = null;
		Map<String, Integer> hashMap = new LinkedHashMap<>();
		for (String set : setList1) {
			String[] words = set.split(",");
			if (set.contains(designationName)) {
				count++;
				designation = words[2];

			}
		}
		hashMap.put(designation, count);
		return hashMap;
		// System.out.println("Number of employee working as managers are: " + count +
		// "\n");
	}

	/*
	 * @Override public String toString() { return "EmployeeAnalyser [loader=" +
	 * loader + ", setList=" + setList + "]"; }
	 */

}

/*
 * public Map<Integer, String> employeeWithHighestSalary() throws
 * FileNotFoundException, IOException { Set<String> setList = getReadData(); int
 * salary = 0; String name = null; Map<Integer, String> hashMap = new
 * LinkedHashMap<>(); for (String set : setList) { String[] words =
 * set.split(","); if (salary < Integer.parseInt(words[5])) { name = words[1];
 * salary = Integer.parseInt(words[5]); } } hashMap.put(salary, name); return
 * hashMap; }
 * 
 * public Map<Integer, String> employeeByDepartmentNumber(int departmentNumber)
 * throws FileNotFoundException, IOException { Set<String> setList =
 * getReadData(); int count = 0; // Set<String> names = new LinkedHashSet<>();
 * // Map<Integer, Set<String>> hashMap = new HashMap<>(); String names = null;
 * Map<Integer, String> hashMap = new LinkedHashMap<>(); for (String set :
 * setList) { String[] words = set.split(","); if (Integer.parseInt(words[7]) ==
 * departmentNumber) { count++; names = words[1]; hashMap.put(count, names); } }
 * // System.out.println(hashMap.size()); // System.out.println(
 * hashMap.keySet()); // System.out.println("Number of employee working in
 * department number 30 are : // " + count + "\n"); return hashMap; }
 * 
 * public Map<Integer, String> employeeByDesignation(String designationName)
 * throws FileNotFoundException, IOException { Set<String> setList1 =
 * getReadData(); int count = 0; // Set<String> names = new LinkedHashSet<>();
 * // Map<Integer, Set<String>> hashMap = new HashMap<>(); String names = null;
 * Map<Integer, String> hashMap = new LinkedHashMap<>(); for (String set :
 * setList1) { String[] words = set.split(","); if
 * (set.contains(designationName)) { count++; names = words[1];
 * hashMap.put(count, names); } } return hashMap; //
 * System.out.println("Number of employee working as managers are: " + count +
 * // "\n"); }
 */