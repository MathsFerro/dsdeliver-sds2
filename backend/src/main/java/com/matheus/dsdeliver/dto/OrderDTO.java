package com.matheus.dsdeliver.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.matheus.dsdeliver.entities.Order;
import com.matheus.dsdeliver.entities.OrderStatus;

public class OrderDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;	
	private String address;
	private Double longitude;
	private Double latitude;
	private Instant moment;
	private OrderStatus status;
	private Double total;
	
	private List<ProductDTO> products = new ArrayList<>();
	
	public OrderDTO() { }

	public OrderDTO(Order entity) { // Transforma uma entidade order em entidade orderDTO
		id = entity.getId();
		address = entity.getAddress();
		longitude = entity.getLongitude();
		latitude = entity.getLatitude();
		moment = entity.getMoment();
		status = entity.getStatus();
		total = entity.getTotal();
		
		products = entity.getProducts().stream()
				.map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}

	public List<ProductDTO> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
}
