package com.example.springfirst.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springfirst.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	Product findByName(String name);
}
