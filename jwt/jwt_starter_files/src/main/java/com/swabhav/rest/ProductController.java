package com.swabhav.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/products")
public class ProductController {
	
	@Autowired
	private ProductRepository repo;
	
	@GetMapping()
	public ResponseEntity<Collection<Product>> getAllProducts(){
		 
		return ResponseEntity.ok(repo.getProducts());
		
		
	}
	
	
	@GetMapping("/{productId}")
	public ResponseEntity<Product> getAllProducts(@PathVariable long productId){
		 
		if(repo.getProductById(productId)!=null)
		  return ResponseEntity.ok(repo.getProductById(productId));
		
		return ResponseEntity.notFound().build();
		
		
	}
	
	@PostMapping()
     public ResponseEntity<Long> addProduct(@RequestBody Product product){
		 repo.addProduct(product);
		return ResponseEntity.ok(product.getId());
	}

}






