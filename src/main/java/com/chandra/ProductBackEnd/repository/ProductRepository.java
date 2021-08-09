package com.chandra.ProductBackEnd.repository;

import com.chandra.ProductBackEnd.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
