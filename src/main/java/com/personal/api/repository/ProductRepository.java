package com.personal.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.personal.api.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
