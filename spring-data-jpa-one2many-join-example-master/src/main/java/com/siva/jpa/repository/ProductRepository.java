package com.siva.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siva.jpa.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
