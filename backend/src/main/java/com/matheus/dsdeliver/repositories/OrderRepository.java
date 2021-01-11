package com.matheus.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.matheus.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	List<Order> findAllByOrderByAddressDesc();
	
	// obj -> Tem que dar um apelido no Objeto que for buscar 
	// FROM Order -> Exatamente o nome da classe (entity)
	// JOIN FETCH -> é como se fosse o Inner Join
	// obj.products -> está na classe e é o atributo products
	//@Query(value="SELECT * FROM tb_order ob WHERE ob.status = 0 ORDER BY ob.moment ASC", nativeQuery=true) // QUERY -> SQL
	@Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products"
			+ " WHERE obj.status = 0 ORDER BY obj.moment ASC") // Linguagem da query JPQL -> Não é o SQL a consulta
	List<Order> findOrdersWithProducts();
	
}
