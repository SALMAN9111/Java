package com.monocept.controller;

import java.net.URI;
import java.util.Optional;

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
import com.monocept.model.AddressDto;
import com.monocept.model.Student;
import com.monocept.repository.AddressRepository;
import com.monocept.repository.StudentRepository;

@RequestMapping("/api/v1/address")
@RestController
@CrossOrigin
public class AddressController {
	private StudentRepository studentRepository;
	private AddressRepository addressRepository;
	
	@Autowired
	public AddressController(StudentRepository studentRepository,AddressRepository addressRepository) {
		this.studentRepository=studentRepository;
		this.addressRepository=addressRepository;
	}
	
	@PostMapping(value="/createAddress")
    public ResponseEntity<Address> create(@RequestBody Address address) {
        Optional<Student> optionalStudent = studentRepository.findById(address.getStudent().getId());
        if (!optionalStudent.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }

        address.setStudent(optionalStudent.get());

        Address savedAddress = addressRepository.save(address);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
            .buildAndExpand(savedAddress.getId()).toUri();

        return ResponseEntity.created(location).body(savedAddress);
    }
	
	@PutMapping("/updateAddress/{id}")
    public ResponseEntity<Address> update(@RequestBody Address address, @PathVariable Integer id) {
        Optional<Student> optionalStudent = studentRepository.findById(address.getStudent().getId());
        if (!optionalStudent.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }

        Optional<Address> optionalAddress = addressRepository.findById(id);
        if (!optionalAddress.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }

        address.setStudent(optionalStudent.get());
        address.setId(optionalAddress.get().getId());
        addressRepository.save(address);

        return ResponseEntity.noContent().build();
    }
	
	@DeleteMapping("/delete/{id}")
    public ResponseEntity<Address> delete(@PathVariable Integer id) {
        Optional<Address> optionalAddress = addressRepository.findById(id);
        if (!optionalAddress.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }

        addressRepository.delete(optionalAddress.get());

        return ResponseEntity.noContent().build();
    }
	
	@GetMapping("/getById/{id}")
    public ResponseEntity<Address> getById(@PathVariable Integer id) {
        Optional<Address> optionalAddress = addressRepository.findById(id);
        if (!optionalAddress.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }

        return ResponseEntity.ok(optionalAddress.get());
    }
}
