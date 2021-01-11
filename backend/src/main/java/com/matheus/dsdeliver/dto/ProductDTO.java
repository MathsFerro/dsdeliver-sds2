package com.matheus.dsdeliver.dto;

import java.io.Serializable;

import com.matheus.dsdeliver.entities.Product;
// Objeto para carregar os dados do Produto da camada de WEB pra cima ( de acordo com a imagem da aula 1 -> 1:21:30 )
//DTO é um objeto que carrega somente os dados que eu mandar, objetos que não são mais gerenciados no ORM, não terão mais relação com o banco de dados 
//Iremos retornar um DTO // Converteremos as Entidades em DTO

public class ProductDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Double price;
	private String description;
	private String imageUri; 
	
	public ProductDTO() { }

	public ProductDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
		price = entity.getPrice();
		description = entity.getDescription();
		imageUri = entity.getImageUri();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

}
