package com.estudo.curso.repositories;

import com.estudo.curso.entities.OrderItem;
import com.estudo.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
