package com.swabhav.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;


@Repository
public class ProductRepository {

		private Map<Long,Product> products;
		
		public ProductRepository() {
			
			System.out.println("inside product repostiory");
		}
	
	@PostConstruct
	private void init() {
		
		 this.products = new HashMap<Long, Product>();
		 Product p1 = new Product(101L,"book");
		 Product p2 = new Product(102L,"Pen");
		 products.put(p1.getId(), p1);
		 products.put(p2.getId(), p2);
		  
		 
	}
	
	public List<Product> getProducts(){
		
		 return products.values().stream().collect(Collectors.toList());
	}
	
	public Product getProductById(Long id) {
		if(products.containsKey(id)) {
			return products.get(id);
		}
		return null;
	}

	public void addProduct(Product product) {

		 this.products.put(product.getId(),product);
	}
}









