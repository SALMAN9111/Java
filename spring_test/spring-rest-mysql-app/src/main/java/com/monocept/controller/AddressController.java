//package com.monocept.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.monocept.model.Address;
//import com.monocept.model.AddressDto;
//import com.monocept.model.Student;
//import com.monocept.repository.AddressRepository;
//import com.monocept.repository.StudentRepository;
//
//@RequestMapping("/api/v1/student")
//@RestController
//@CrossOrigin
//public class AddressController {
//
//	@Autowired
//	private AddressRepository addressRepo;
//	
//	@Autowired
//	private StudentRepository studrepo;
//
//	Address adress = new Address();
//	Student student = new Student();
//
//	@PostMapping(value = "/{id}/addAddress", consumes = "application/json")
////	public ResponseEntity<String> addAddress(@PathVariable("id") int id, @RequestBody AddressDto dto) {
//
////		System.out.println("Inside add address");
//
//
//		
////		return studrepo.findById(id).map(student->{
//			dto.setStud(student);
////		})
//		
//
//	//	return ResponseEntity.ok(adress.getAdressId() + adress.getAddress());
//
//	}
//
//}
