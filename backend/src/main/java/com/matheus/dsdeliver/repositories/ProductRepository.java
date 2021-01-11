package com.matheus.dsdeliver.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.matheus.dsdeliver.entities.Product;
// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods

public interface ProductRepository extends JpaRepository<Product, Long> { 
	
	List<Product> findAllByOrderByNameAsc(); // Explicação 1:35:00 - Aula 01
	
}
