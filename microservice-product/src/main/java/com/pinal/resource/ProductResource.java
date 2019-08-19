package com.pinal.resource;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pinal.model.Product;
import com.pinal.repository.ProductRepository;

@RestController
@RequestMapping("/api/v1/products")
public class ProductResource {
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping(value="{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Product> get(@PathVariable("id") Integer id){
		return ResponseEntity.ok(productRepository.findById(id).get());
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Collection<Product>> getAll(){
		return ResponseEntity.ok(productRepository.findAll().get());
	}
	
}
