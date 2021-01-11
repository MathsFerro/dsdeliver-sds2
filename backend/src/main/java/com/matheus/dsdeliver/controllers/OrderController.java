package com.matheus.dsdeliver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheus.dsdeliver.dto.OrderDTO;
import com.matheus.dsdeliver.entities.OrderStatus;
import com.matheus.dsdeliver.services.OrderService;

@RestController
@RequestMapping(value="/orders")
public class OrderController {

	@Autowired
	private OrderService service;

	@GetMapping
	public ResponseEntity<List<OrderDTO>> findAll() {
		return ResponseEntity.ok().body(service.findAll());
	}

}

