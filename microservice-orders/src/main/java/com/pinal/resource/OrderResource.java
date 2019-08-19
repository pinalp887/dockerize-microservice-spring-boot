package com.pinal.resource;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pinal.Order;
import com.pinal.repository.OrderRepository;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderResource {
	@Autowired
	private OrderRepository orderRepository;

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Order> get(@PathVariable("id") Integer id) {
		return ResponseEntity.ok(orderRepository.findById(id).get());
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Collection<Order>> getAll() {
		return ResponseEntity.ok(orderRepository.findAll().get());
	}
}
