package com.matheus.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matheus.dsdeliver.dto.ProductDTO;
import com.matheus.dsdeliver.entities.Product;
import com.matheus.dsdeliver.repositories.ProductRepository;

@Service // Componente registrado que pode ser injetado em outros componentes
public class ProductService {
	
	@Autowired // Faz/Injeta a dependência... não precisa instanciar.....
	private ProductRepository repository;
	
	@Transactional(readOnly = true) // readOnly -> Somente leitura
	public List<ProductDTO> findAll() {
		List<Product> listProduct = repository.findAllByOrderByNameAsc();
		return listProduct.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList()); // Transformando o listProduct para ProductDTO  
	}
	
}
