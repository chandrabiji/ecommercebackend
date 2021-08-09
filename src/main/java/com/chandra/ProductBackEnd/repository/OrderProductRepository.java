package com.chandra.ProductBackEnd.repository;

import com.chandra.ProductBackEnd.model.OrderProduct;
import com.chandra.ProductBackEnd.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
