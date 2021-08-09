package com.chandra.ProductBackEnd.repository;

import com.chandra.ProductBackEnd.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
