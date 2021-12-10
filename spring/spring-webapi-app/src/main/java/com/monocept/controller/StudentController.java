package com.monocept.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.model.Student;
import com.monocept.service.StudentDTO;
import com.monocept.service.StudentService;


@RequestMapping("/api/v1/student")
@CrossOrigin
@RestController
public class StudentController {

	StudentService ss = new StudentService();

	private StudentDTO convertToDto(Student s) {

		return new StudentDTO(s.getRollNo(), s.getName(), s.getAge(), s.getEmail(), s.getDate(), s.isMale(),
				s.getUuid());
	}

	@GetMapping(value = "/allstudents", produces = "application/json")
	public ResponseEntity<List<StudentDTO>> getStudents() {

		List<Student> students = ss.getAllStudent();
		List<StudentDTO> dtos = students.stream().map(s -> convertToDto(s)).collect(Collectors.toList());

		if (students.size() == 0) {

			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(dtos);
	}

	@PostMapping(value = "/addstudent", consumes = "application/json")
	public ResponseEntity<String> addStudent(@RequestBody StudentDTO dto) {
		Student student = new Student();
		System.out.println(dto);

		student.setRollNo(dto.getRollNo());
		student.setName(dto.getName());
		student.setAge(dto.getAge());
		student.setEmail(dto.getEmail());
		student.setDate(dto.getDate());

		ss.addStudent(student);
		return ResponseEntity.ok(student.getRollNo() + student.getName() + student.getAge() +
				student.getEmail() + student.getDate() + student.isMale() + student.getUuid());

	}

	@PutMapping
	public String put() {

		return "Put invoked";

	}

	@DeleteMapping
	public String delete() {

		return "Delete invoked";

	}
}