package com.monocept.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.print.attribute.SetOfIntegerSyntax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.model.Address;
import com.monocept.model.Student;
import com.monocept.model.StudentDTO;
import com.monocept.repository.StudentRepository;

@RequestMapping("/api/v1/student")
@RestController
@CrossOrigin
public class StudnetController {

	@Autowired
	private StudentRepository repo;

	Student student = new Student();
	Address address = new Address();

	@GetMapping("/getstudents")
	public List<StudentDTO> get() {
		System.out.println("Inside get mapping");
		List<StudentDTO> dtoList = new ArrayList<StudentDTO>();
		repo.findAll().forEach(s -> dtoList.add(new StudentDTO(s.getSid(), s.getSname())));
		return dtoList;

	}

	@PostMapping(value = "/addstudent", consumes = "application/json")
	public ResponseEntity<String> addStudent(@RequestBody StudentDTO dto) {
		System.out.println(dto);

		student.setSid(dto.getId());
		student.setSname(dto.getName());

		repo.save(student);
		return ResponseEntity.ok(student.getSid() + student.getSname());

	}

	@PutMapping(value = "/updatestudent/{studentid}", consumes = "application/json")
	public ResponseEntity<String> updateStudent(@RequestBody StudentDTO dto) {

		System.out.println(dto);
		System.out.println("id " + dto.getId());
		System.out.println("name " + dto.getName());
		student.setSid(dto.getId());
		student.setSname(dto.getName());
		student.setSname(dto.getName());
		repo.save(student);

		return ResponseEntity.ok(student.getSid() + student.getSname());
	}

	@DeleteMapping(value = "/delete/{studentid}", consumes = "application/json")
	public void delelteStudent(@PathVariable("id") int id) {

		System.out.println("Inside delete");
		repo.deleteById(id);

	}

	@GetMapping(value = "/{studentid}/Address",produces = "application/json")
	public List<Student> getAddress(@PathVariable("id") int studentid) {

		System.out.println("Inside get mapping");
		
		address.setStud(repo.findById(studentid).get());
		student.setAddresses(repo.findById(studentid).get().getAddresses());
		
		List<Student> dtoList = new ArrayList<Student>();
		dtoList.add(student);
		//		repo.findAll().forEach(s -> dtoList.add(new StudentDTO(s.getSid(), s.getSname())));
		return dtoList;

	}

}
