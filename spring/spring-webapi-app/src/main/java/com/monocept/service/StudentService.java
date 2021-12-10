package com.monocept.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.monocept.model.Student;

@Service
public class StudentService {
	 List<Student> studentList;
	 Date d = new Date();
	 UUID uuid = UUID.randomUUID();
	 
	 public StudentService() {
		 studentList = new ArrayList<Student>();
		 studentList.add(new Student(uuid,1, "Frank", 27, "Frank@gmail.com", d, true));
	 }
	 
	 public List<Student> getAllStudent(){
		 return studentList;
	 }
	 
	 public void addStudent(Student student) {
		 studentList.add(student);
	 }
	 
}
