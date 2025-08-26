package com.estudo.curso.repositories;

import com.estudo.curso.entities.Order;
import com.estudo.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
