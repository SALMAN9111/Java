package com.monocept.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.monocept.model.Address;
import com.monocept.model.Student;
import com.monocept.model.StudentDTO;
import com.monocept.repository.AddressRepository;
import com.monocept.repository.StudentRepository;

@RequestMapping("/api/v1/student")
@RestController
@CrossOrigin
public class StudentController {
	private StudentRepository studentRepository;
	@SuppressWarnings("unused")
	private AddressRepository addressRepository;

	@Autowired
	public StudentController(StudentRepository studentRepository, AddressRepository addressRepository) {
		this.studentRepository = studentRepository;
		this.addressRepository = addressRepository;
	}

	@PostMapping(value = "/addstudent")
	public ResponseEntity<Student> addAddress(@RequestBody Student student) {
		Student savedStudents = studentRepository.save(student);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedStudents.getId()).toUri();

		return ResponseEntity.created(location).body(savedStudents);
	}

	@PutMapping(value="/{id}/updateAddress")
	public ResponseEntity<Student> updateAddress (@PathVariable Integer id,@RequestBody Student student) {
		Optional<Student> optionalStudent = studentRepository.findById(id);
		if(!optionalStudent.isPresent()) {
			return ResponseEntity.unprocessableEntity().build();
		}
		student.setId(optionalStudent.get().getId());
		studentRepository.save(student);
		
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping(value="/{id}/deleteAddress")
	public ResponseEntity<Student> deleteAddress(@PathVariable Integer id){
		Optional<Student> optionalStudent = studentRepository.findById(id);
		if(!optionalStudent.isPresent()) {
			return ResponseEntity.unprocessableEntity().build();
		}
		
		studentRepository.delete(optionalStudent.get());
		
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/{id}/getAddress")
	public ResponseEntity<Student> getAddressById(@PathVariable Integer id){
		Optional<Student> optionalStudent = studentRepository.findById(id);
		if(!optionalStudent.isPresent()) {
			return ResponseEntity.unprocessableEntity().build();
		}
		
		return ResponseEntity.ok(optionalStudent.get());
	}
	
}
