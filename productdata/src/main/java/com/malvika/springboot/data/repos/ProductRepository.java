package com.malvika.springboot.data.repos;

import org.springframework.data.repository.CrudRepository;

import com.malvika.springboot.data.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
