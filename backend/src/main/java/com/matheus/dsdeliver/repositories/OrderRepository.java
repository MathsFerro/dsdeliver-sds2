package com.matheus.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.matheus.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
